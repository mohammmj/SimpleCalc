import gen.SimpleCalcBaseListener;
import gen.SimpleCalcParser;
import java.util.*;

public class SimpleCalcCompiler extends SimpleCalcBaseListener {

    private List<String> pseudoCode = new ArrayList<>();
    private Map<String, Integer> variables = new HashMap<>();
    private int nextVarIndex = 0;
    private Stack<Integer> loopStack = new Stack<>();
    private int nextLoopId = 1;

    public List<String> getPseudoCode() {
        return pseudoCode;
    }

    @Override
    public void exitVariableDecl(SimpleCalcParser.VariableDeclContext ctx) {
        String varName = ctx.ID().getText();

        if (!variables.containsKey(varName)) {
            variables.put(varName, nextVarIndex);
            nextVarIndex++;
        }

        pseudoCode.add("pop " + varName);
    }

    @Override
    public void exitExpr(SimpleCalcParser.ExprContext ctx) {

        if (ctx.NUMBER() != null) {
            String number = ctx.NUMBER().getText();
            pseudoCode.add("push " + number);
        }

        else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            pseudoCode.add("push " + varName);
        }

        else if (ctx.addOp() != null) {
            String op = ctx.addOp().getText();

            if (op.equals("+")) {
                pseudoCode.add("add");
            } else if (op.equals("-")) {
                pseudoCode.add("sub");
            }
        }

        else if (ctx.mulOp() != null) {
            String op = ctx.mulOp().getText();

            if (op.equals("*")) {
                pseudoCode.add("mul");
            } else if(op.equals("/")) {
                pseudoCode.add("div");
            }
        }
    }

    @Override
    public void enterWhileLoop(SimpleCalcParser.WhileLoopContext ctx) {
        int loopId = nextLoopId;
        nextLoopId++;

        loopStack.push(loopId);

        pseudoCode.add("label enterLoop" + loopId);
    }

    @Override
    public void exitWhileLoop(SimpleCalcParser.WhileLoopContext ctx) {
        int loopId = loopStack.pop();

        pseudoCode.add("goto enterLoop" + loopId);
        pseudoCode.add("label exitLoop" + loopId);
    }

    @Override
    public void exitCondition(SimpleCalcParser.ConditionContext ctx) {
        String op = ctx.compareOp().getText();

        switch (op) {
            case "<":
                pseudoCode.add("lt");
                pseudoCode.add("not");
                break;
            case ">":
                pseudoCode.add("gt");
                pseudoCode.add("not");
                break;
            case "<=":
                pseudoCode.add("gt");
                break;
            case ">=":
                pseudoCode.add("lt");
                break;
            case "==":
                pseudoCode.add("eq");
                pseudoCode.add("not");
                break;
            case "!=":
                pseudoCode.add("eq");
                break;
        }

        int loopId = loopStack.peek();
        pseudoCode.add("if-goto exitLoop" + loopId);
    }

    @Override
    public void exitPrintStmt(SimpleCalcParser.PrintStmtContext ctx) {
        pseudoCode.add("print");
    }

    @Override
    public void exitAssignment(SimpleCalcParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();

        if (!variables.containsKey(varName)) {
            throw new RuntimeException("Variable '" + varName + "' not declared!");
        }

        pseudoCode.add("pop " + varName);
    }
}
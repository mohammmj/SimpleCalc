package gen;// Generated from S:/Kurser/Termin3/Systemprogramvara/Uppgift2/SimpleCalc/src/SimpleCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCalcParser}.
 */
public interface SimpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleCalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleCalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(SimpleCalcParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(SimpleCalcParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(SimpleCalcParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(SimpleCalcParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(SimpleCalcParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(SimpleCalcParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SimpleCalcParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SimpleCalcParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleCalcParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleCalcParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(SimpleCalcParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(SimpleCalcParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleCalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleCalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(SimpleCalcParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(SimpleCalcParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleCalcParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(SimpleCalcParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCalcParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(SimpleCalcParser.MulOpContext ctx);
}
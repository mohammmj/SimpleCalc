package gen;// Generated from S:/Kurser/Termin3/Systemprogramvara/Uppgift2/SimpleCalc/src/SimpleCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleCalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(SimpleCalcParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(SimpleCalcParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(SimpleCalcParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(SimpleCalcParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SimpleCalcParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(SimpleCalcParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleCalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SimpleCalcParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalcParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SimpleCalcParser.MulOpContext ctx);
}
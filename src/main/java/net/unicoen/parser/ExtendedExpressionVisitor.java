// Generated from ExtendedExpression.g4 by ANTLR 4.5

	package net.unicoen.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtendedExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtendedExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExtendedExpressionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ExtendedExpressionParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ExtendedExpressionParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ExtendedExpressionParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExtendedExpressionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExtendedExpressionParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExtendedExpressionParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExtendedExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#compareExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExp(ExtendedExpressionParser.CompareExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(ExtendedExpressionParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#normalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalExp(ExtendedExpressionParser.NormalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExtendedExpressionParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExtendedExpressionParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExtendedExpressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ExtendedExpressionParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ExtendedExpressionParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(ExtendedExpressionParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(ExtendedExpressionParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(ExtendedExpressionParser.DigitContext ctx);
}
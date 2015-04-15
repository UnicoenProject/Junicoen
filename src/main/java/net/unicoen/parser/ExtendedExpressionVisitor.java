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
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#classModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifiers(ExtendedExpressionParser.ClassModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#classVisibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVisibility(ExtendedExpressionParser.ClassVisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#abs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(ExtendedExpressionParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExtendedExpressionParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ExtendedExpressionParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifiers(ExtendedExpressionParser.MethodModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(ExtendedExpressionParser.FinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodVisibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodVisibility(ExtendedExpressionParser.MethodVisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(ExtendedExpressionParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#methodArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgument(ExtendedExpressionParser.MethodArgumentContext ctx);
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
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExtendedExpressionParser.TypeContext ctx);
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
	 * Visit a parse tree produced by {@link ExtendedExpressionParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ExtendedExpressionParser.WhileStatementContext ctx);
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
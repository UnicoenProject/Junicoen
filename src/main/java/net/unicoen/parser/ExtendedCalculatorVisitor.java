// Generated from ExtendedCalculator.g4 by ANTLR 4.5.1

package net.unicoen.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtendedCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtendedCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ExtendedCalculatorParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#classNameDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameDeclaration(ExtendedCalculatorParser.ClassNameDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ExtendedCalculatorParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExtendedCalculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(ExtendedCalculatorParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(ExtendedCalculatorParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExtendedCalculatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#nestedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpression(ExtendedCalculatorParser.NestedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ExtendedCalculatorParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(ExtendedCalculatorParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ExtendedCalculatorParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ExtendedCalculatorParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(ExtendedCalculatorParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExtendedCalculatorParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExtendedCalculatorParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(ExtendedCalculatorParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ExtendedCalculatorParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ExtendedCalculatorParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#addSubExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpressionList(ExtendedCalculatorParser.AddSubExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ExtendedCalculatorParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ExtendedCalculatorParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ExtendedCalculatorParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedCalculatorParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(ExtendedCalculatorParser.FloatingPointLiteralContext ctx);
}
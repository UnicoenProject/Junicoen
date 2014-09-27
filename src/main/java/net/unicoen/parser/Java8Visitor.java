// Generated from Java8.g4 by ANTLR 4.3

 	package net.unicoen.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(@NotNull Java8Parser.ClassMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(@NotNull Java8Parser.StatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(@NotNull Java8Parser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(@NotNull Java8Parser.MethodInvocation_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(@NotNull Java8Parser.AnnotationTypeBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(@NotNull Java8Parser.ConstantModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(@NotNull Java8Parser.LambdaBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull Java8Parser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull Java8Parser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(@NotNull Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull Java8Parser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(@NotNull Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(@NotNull Java8Parser.ArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(@NotNull Java8Parser.SimpleTypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(@NotNull Java8Parser.ExpressionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(@NotNull Java8Parser.StatementWithoutTrailingSubstatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(@NotNull Java8Parser.ConstructorDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(@NotNull Java8Parser.AssertStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(@NotNull Java8Parser.ArrayCreationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(@NotNull Java8Parser.UnannArrayTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull Java8Parser.VariableDeclaratorIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(@NotNull Java8Parser.TryWithResourcesStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull Java8Parser.TypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(@NotNull Java8Parser.ExceptionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(@NotNull Java8Parser.ExceptionTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull Java8Parser.AdditiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull Java8Parser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(@NotNull Java8Parser.ReferenceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(@NotNull Java8Parser.ArrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(@NotNull Java8Parser.InferredFormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull Java8Parser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(@NotNull Java8Parser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull Java8Parser.TypeParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(@NotNull Java8Parser.LastFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull Java8Parser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(@NotNull Java8Parser.ResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(@NotNull Java8Parser.FieldAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull Java8Parser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(@NotNull Java8Parser.Finally_Context ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull Java8Parser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull Java8Parser.EnumDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(@NotNull Java8Parser.ConstantDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(@NotNull Java8Parser.PostfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull Java8Parser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull Java8Parser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(@NotNull Java8Parser.StaticImportOnDemandDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull Java8Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull Java8Parser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(@NotNull Java8Parser.MethodInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(@NotNull Java8Parser.SingleStaticImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(@NotNull Java8Parser.LambdaParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(@NotNull Java8Parser.ConditionalAndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull Java8Parser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(@NotNull Java8Parser.PackageModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(@NotNull Java8Parser.ConstructorDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(@NotNull Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(@NotNull Java8Parser.UnannTypeVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(@NotNull Java8Parser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(@NotNull Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(@NotNull Java8Parser.ConstructorModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(@NotNull Java8Parser.EnumConstantNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(@NotNull Java8Parser.ClassInstanceCreationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(@NotNull Java8Parser.MethodDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(@NotNull Java8Parser.AnnotationTypeMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(@NotNull Java8Parser.PreDecrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(@NotNull Java8Parser.VariableInitializerListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(@NotNull Java8Parser.ExtendsInterfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(@NotNull Java8Parser.ElementValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull Java8Parser.ArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull Java8Parser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(@NotNull Java8Parser.MethodModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(@NotNull Java8Parser.UnannClassTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(@NotNull Java8Parser.LambdaExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull Java8Parser.AssignmentExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(@NotNull Java8Parser.TypeParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(@NotNull Java8Parser.NormalClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull Java8Parser.FormalParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(@NotNull Java8Parser.EnhancedForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(@NotNull Java8Parser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull Java8Parser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(@NotNull Java8Parser.WildcardBoundsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(@NotNull Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(@NotNull Java8Parser.EnhancedForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(@NotNull Java8Parser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(@NotNull Java8Parser.TypeVariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull Java8Parser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull Java8Parser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(@NotNull Java8Parser.InterfaceBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull Java8Parser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(@NotNull Java8Parser.DimsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(@NotNull Java8Parser.TypeArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(@NotNull Java8Parser.UnannPrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(@NotNull Java8Parser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(@NotNull Java8Parser.EnumBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(@NotNull Java8Parser.AdditionalBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(@NotNull Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(@NotNull Java8Parser.UnannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(@NotNull Java8Parser.IfThenStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(@NotNull Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(@NotNull Java8Parser.InterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(@NotNull Java8Parser.MethodReference_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull Java8Parser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(@NotNull Java8Parser.EnumConstantModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull Java8Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(@NotNull Java8Parser.FieldModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(@NotNull Java8Parser.MarkerAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(@NotNull Java8Parser.ResourceListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(@NotNull Java8Parser.ArrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(@NotNull Java8Parser.StaticInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull Java8Parser.ConditionalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull Java8Parser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(@NotNull Java8Parser.LeftHandSideContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(@NotNull Java8Parser.BasicForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull Java8Parser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull Java8Parser.PackageDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull Java8Parser.LocalVariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(@NotNull Java8Parser.SuperinterfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(@NotNull Java8Parser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(@NotNull Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(@NotNull Java8Parser.SwitchBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull Java8Parser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(@NotNull Java8Parser.BlockStatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(@NotNull Java8Parser.FormalParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(@NotNull Java8Parser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(@NotNull Java8Parser.DefaultValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull Java8Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(@NotNull Java8Parser.ElementValuePairListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(@NotNull Java8Parser.SynchronizedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(@NotNull Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(@NotNull Java8Parser.SuperclassContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull Java8Parser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull Java8Parser.ExpressionStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(@NotNull Java8Parser.PreIncrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(@NotNull Java8Parser.EnumBodyDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(@NotNull Java8Parser.DimExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull Java8Parser.ForUpdateContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull Java8Parser.EmptyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(@NotNull Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(@NotNull Java8Parser.AnnotationTypeElementModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(@NotNull Java8Parser.ShiftExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(@NotNull Java8Parser.FieldAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(@NotNull Java8Parser.InstanceInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(@NotNull Java8Parser.UnannTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(@NotNull Java8Parser.IntegralTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(@NotNull Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(@NotNull Java8Parser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull Java8Parser.EqualityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(@NotNull Java8Parser.NormalAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull Java8Parser.TypeBoundContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull Java8Parser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(@NotNull Java8Parser.ClassModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(@NotNull Java8Parser.FieldAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull Java8Parser.TypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(@NotNull Java8Parser.ConstructorBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(@NotNull Java8Parser.CatchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(@NotNull Java8Parser.LabeledStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(@NotNull Java8Parser.SwitchLabelsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(@NotNull Java8Parser.FormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(@NotNull Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(@NotNull Java8Parser.SingleTypeImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(@NotNull Java8Parser.SingleElementAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(@NotNull Java8Parser.ElementValueArrayInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull Java8Parser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull Java8Parser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(@NotNull Java8Parser.TypeArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(@NotNull Java8Parser.PostDecrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(@NotNull Java8Parser.ReceiverParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(@NotNull Java8Parser.WhileStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(@NotNull Java8Parser.EnumConstantListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(@NotNull Java8Parser.DoStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(@NotNull Java8Parser.CatchTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(@NotNull Java8Parser.ForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(@NotNull Java8Parser.IfThenElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull Java8Parser.AssignmentOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(@NotNull Java8Parser.LabeledStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(@NotNull Java8Parser.CatchesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(@NotNull Java8Parser.MethodReference_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(@NotNull Java8Parser.VariableDeclaratorListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(@NotNull Java8Parser.VariableModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(@NotNull Java8Parser.CastExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(@NotNull Java8Parser.ConditionalOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(@NotNull Java8Parser.TypeParameterModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(@NotNull Java8Parser.ElementValuePairContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(@NotNull Java8Parser.FloatingPointTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(@NotNull Java8Parser.DimExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(@NotNull Java8Parser.ResourceContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(@NotNull Java8Parser.InclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(@NotNull Java8Parser.InterfaceMethodModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(@NotNull Java8Parser.ResourceSpecificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(@NotNull Java8Parser.InterfaceTypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(@NotNull Java8Parser.IfThenElseStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(@NotNull Java8Parser.UnannInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(@NotNull Java8Parser.InterfaceModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(@NotNull Java8Parser.ExclusiveOrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull Java8Parser.ClassTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(@NotNull Java8Parser.PostIncrementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull Java8Parser.TryStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(@NotNull Java8Parser.ElementValueListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(@NotNull Java8Parser.BasicForStatementNoShortIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull Java8Parser.TypeDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull Java8Parser.SwitchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(@NotNull Java8Parser.WildcardContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull Java8Parser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(@NotNull Java8Parser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(@NotNull Java8Parser.UnannReferenceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(@NotNull Java8Parser.MethodHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(@NotNull Java8Parser.CatchFormalParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(@NotNull Java8Parser.EnumConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(@NotNull Java8Parser.MethodInvocation_lfno_primaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(@NotNull Java8Parser.PackageNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull Java8Parser.ImportDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull Java8Parser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(@NotNull Java8Parser.InterfaceDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull Java8Parser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull Java8Parser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(@NotNull Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(@NotNull Java8Parser.PackageOrTypeNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull Java8Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(@NotNull Java8Parser.MethodNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull Java8Parser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull Java8Parser.BreakStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(@NotNull Java8Parser.AmbiguousNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(@NotNull Java8Parser.StatementExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(@NotNull Java8Parser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(@NotNull Java8Parser.Throws_Context ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull Java8Parser.SwitchLabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(@NotNull Java8Parser.MethodReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(@NotNull Java8Parser.PrimaryNoNewArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(@NotNull Java8Parser.NumericTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Java8Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull Java8Parser.ContinueStatementContext ctx);
}
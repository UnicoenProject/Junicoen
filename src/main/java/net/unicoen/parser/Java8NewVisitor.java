// Generated from Java8New.g4 by ANTLR 4.5.1

	package net.unicoen.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8NewParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8NewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8NewParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Java8NewParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java8NewParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java8NewParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java8NewParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java8NewParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java8NewParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java8NewParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Java8NewParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java8NewParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java8NewParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java8NewParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java8NewParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java8NewParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java8NewParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java8NewParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java8NewParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java8NewParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(Java8NewParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java8NewParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java8NewParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java8NewParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java8NewParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java8NewParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java8NewParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8NewParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(Java8NewParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java8NewParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java8NewParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java8NewParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java8NewParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java8NewParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java8NewParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(Java8NewParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Java8NewParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(Java8NewParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(Java8NewParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(Java8NewParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(Java8NewParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java8NewParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Java8NewParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java8NewParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Java8NewParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(Java8NewParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java8NewParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java8NewParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(Java8NewParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(Java8NewParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(Java8NewParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java8NewParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java8NewParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(Java8NewParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java8NewParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(Java8NewParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java8NewParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java8NewParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java8NewParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java8NewParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java8NewParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java8NewParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java8NewParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java8NewParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(Java8NewParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java8NewParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java8NewParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java8NewParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8NewParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8NewParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java8NewParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java8NewParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java8NewParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(Java8NewParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java8NewParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java8NewParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java8NewParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java8NewParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java8NewParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java8NewParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java8NewParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#parameterDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaratorId(Java8NewParser.ParameterDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(Java8NewParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java8NewParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Java8NewParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java8NewParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(Java8NewParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java8NewParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(Java8NewParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java8NewParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java8NewParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java8NewParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java8NewParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(Java8NewParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(Java8NewParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java8NewParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(Java8NewParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java8NewParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java8NewParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java8NewParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(Java8NewParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java8NewParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(Java8NewParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java8NewParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Java8NewParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java8NewParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(Java8NewParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(Java8NewParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java8NewParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(Java8NewParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java8NewParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java8NewParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java8NewParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Java8NewParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java8NewParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java8NewParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(Java8NewParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java8NewParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(Java8NewParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Java8NewParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Java8NewParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java8NewParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java8NewParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java8NewParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java8NewParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java8NewParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java8NewParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java8NewParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java8NewParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java8NewParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java8NewParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java8NewParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java8NewParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java8NewParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java8NewParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java8NewParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java8NewParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(Java8NewParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java8NewParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java8NewParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8NewParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java8NewParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java8NewParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java8NewParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java8NewParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java8NewParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java8NewParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Java8NewParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8NewParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(Java8NewParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java8NewParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(Java8NewParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Java8NewParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(Java8NewParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8NewParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java8NewParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java8NewParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8NewParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(Java8NewParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java8NewParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java8NewParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java8NewParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java8NewParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java8NewParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java8NewParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(Java8NewParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java8NewParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java8NewParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8NewParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java8NewParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java8NewParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Java8NewParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java8NewParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java8NewParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java8NewParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java8NewParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(Java8NewParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(Java8NewParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java8NewParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(Java8NewParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java8NewParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java8NewParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java8NewParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java8NewParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java8NewParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java8NewParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8NewParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8NewParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java8NewParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8NewParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8NewParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(Java8NewParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java8NewParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(Java8NewParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java8NewParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8NewParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java8NewParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(Java8NewParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java8NewParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java8NewParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java8NewParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java8NewParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java8NewParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java8NewParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8NewParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java8NewParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java8NewParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(Java8NewParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java8NewParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java8NewParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java8NewParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java8NewParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java8NewParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java8NewParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java8NewParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java8NewParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java8NewParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java8NewParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java8NewParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java8NewParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java8NewParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java8NewParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java8NewParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java8NewParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java8NewParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java8NewParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java8NewParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java8NewParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java8NewParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java8NewParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java8NewParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java8NewParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java8NewParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java8NewParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java8NewParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java8NewParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java8NewParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java8NewParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java8NewParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java8NewParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java8NewParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8NewParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java8NewParser.CastExpressionContext ctx);
}
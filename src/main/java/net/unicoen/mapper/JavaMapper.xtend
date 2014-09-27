package net.unicoen.mapper

import net.unicoen.parser.Java8Parser.AdditionalBoundContext
import net.unicoen.parser.Java8Parser.AdditiveExpressionContext
import net.unicoen.parser.Java8Parser.AmbiguousNameContext
import net.unicoen.parser.Java8Parser.AndExpressionContext
import net.unicoen.parser.Java8Parser.AnnotationContext
import net.unicoen.parser.Java8Parser.AnnotationTypeBodyContext
import net.unicoen.parser.Java8Parser.AnnotationTypeDeclarationContext
import net.unicoen.parser.Java8Parser.AnnotationTypeElementDeclarationContext
import net.unicoen.parser.Java8Parser.AnnotationTypeElementModifierContext
import net.unicoen.parser.Java8Parser.AnnotationTypeMemberDeclarationContext
import net.unicoen.parser.Java8Parser.ArgumentListContext
import net.unicoen.parser.Java8Parser.ArrayAccessContext
import net.unicoen.parser.Java8Parser.ArrayAccess_lf_primaryContext
import net.unicoen.parser.Java8Parser.ArrayAccess_lfno_primaryContext
import net.unicoen.parser.Java8Parser.ArrayCreationExpressionContext
import net.unicoen.parser.Java8Parser.ArrayInitializerContext
import net.unicoen.parser.Java8Parser.ArrayTypeContext
import net.unicoen.parser.Java8Parser.AssertStatementContext
import net.unicoen.parser.Java8Parser.AssignmentContext
import net.unicoen.parser.Java8Parser.AssignmentExpressionContext
import net.unicoen.parser.Java8Parser.AssignmentOperatorContext
import net.unicoen.parser.Java8Parser.BasicForStatementContext
import net.unicoen.parser.Java8Parser.BasicForStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.BlockContext
import net.unicoen.parser.Java8Parser.BlockStatementContext
import net.unicoen.parser.Java8Parser.BlockStatementsContext
import net.unicoen.parser.Java8Parser.BreakStatementContext
import net.unicoen.parser.Java8Parser.CastExpressionContext
import net.unicoen.parser.Java8Parser.CatchClauseContext
import net.unicoen.parser.Java8Parser.CatchFormalParameterContext
import net.unicoen.parser.Java8Parser.CatchTypeContext
import net.unicoen.parser.Java8Parser.CatchesContext
import net.unicoen.parser.Java8Parser.ClassBodyContext
import net.unicoen.parser.Java8Parser.ClassBodyDeclarationContext
import net.unicoen.parser.Java8Parser.ClassDeclarationContext
import net.unicoen.parser.Java8Parser.ClassInstanceCreationExpressionContext
import net.unicoen.parser.Java8Parser.ClassInstanceCreationExpression_lf_primaryContext
import net.unicoen.parser.Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext
import net.unicoen.parser.Java8Parser.ClassMemberDeclarationContext
import net.unicoen.parser.Java8Parser.ClassModifierContext
import net.unicoen.parser.Java8Parser.ClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.ClassTypeContext
import net.unicoen.parser.Java8Parser.ClassType_lf_classOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.ClassType_lfno_classOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.CompilationUnitContext
import net.unicoen.parser.Java8Parser.ConditionalAndExpressionContext
import net.unicoen.parser.Java8Parser.ConditionalExpressionContext
import net.unicoen.parser.Java8Parser.ConditionalOrExpressionContext
import net.unicoen.parser.Java8Parser.ConstantDeclarationContext
import net.unicoen.parser.Java8Parser.ConstantExpressionContext
import net.unicoen.parser.Java8Parser.ConstantModifierContext
import net.unicoen.parser.Java8Parser.ConstructorBodyContext
import net.unicoen.parser.Java8Parser.ConstructorDeclarationContext
import net.unicoen.parser.Java8Parser.ConstructorDeclaratorContext
import net.unicoen.parser.Java8Parser.ConstructorModifierContext
import net.unicoen.parser.Java8Parser.ContinueStatementContext
import net.unicoen.parser.Java8Parser.DefaultValueContext
import net.unicoen.parser.Java8Parser.DimExprContext
import net.unicoen.parser.Java8Parser.DimExprsContext
import net.unicoen.parser.Java8Parser.DimsContext
import net.unicoen.parser.Java8Parser.DoStatementContext
import net.unicoen.parser.Java8Parser.ElementValueArrayInitializerContext
import net.unicoen.parser.Java8Parser.ElementValueContext
import net.unicoen.parser.Java8Parser.ElementValueListContext
import net.unicoen.parser.Java8Parser.ElementValuePairContext
import net.unicoen.parser.Java8Parser.ElementValuePairListContext
import net.unicoen.parser.Java8Parser.EmptyStatementContext
import net.unicoen.parser.Java8Parser.EnhancedForStatementContext
import net.unicoen.parser.Java8Parser.EnhancedForStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.EnumBodyContext
import net.unicoen.parser.Java8Parser.EnumBodyDeclarationsContext
import net.unicoen.parser.Java8Parser.EnumConstantContext
import net.unicoen.parser.Java8Parser.EnumConstantListContext
import net.unicoen.parser.Java8Parser.EnumConstantModifierContext
import net.unicoen.parser.Java8Parser.EnumConstantNameContext
import net.unicoen.parser.Java8Parser.EnumDeclarationContext
import net.unicoen.parser.Java8Parser.EqualityExpressionContext
import net.unicoen.parser.Java8Parser.ExceptionTypeContext
import net.unicoen.parser.Java8Parser.ExceptionTypeListContext
import net.unicoen.parser.Java8Parser.ExclusiveOrExpressionContext
import net.unicoen.parser.Java8Parser.ExplicitConstructorInvocationContext
import net.unicoen.parser.Java8Parser.ExpressionContext
import net.unicoen.parser.Java8Parser.ExpressionNameContext
import net.unicoen.parser.Java8Parser.ExpressionStatementContext
import net.unicoen.parser.Java8Parser.ExtendsInterfacesContext
import net.unicoen.parser.Java8Parser.FieldAccessContext
import net.unicoen.parser.Java8Parser.FieldAccess_lf_primaryContext
import net.unicoen.parser.Java8Parser.FieldAccess_lfno_primaryContext
import net.unicoen.parser.Java8Parser.FieldDeclarationContext
import net.unicoen.parser.Java8Parser.FieldModifierContext
import net.unicoen.parser.Java8Parser.Finally_Context
import net.unicoen.parser.Java8Parser.FloatingPointTypeContext
import net.unicoen.parser.Java8Parser.ForInitContext
import net.unicoen.parser.Java8Parser.ForStatementContext
import net.unicoen.parser.Java8Parser.ForStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.ForUpdateContext
import net.unicoen.parser.Java8Parser.FormalParameterContext
import net.unicoen.parser.Java8Parser.FormalParameterListContext
import net.unicoen.parser.Java8Parser.FormalParametersContext
import net.unicoen.parser.Java8Parser.IfThenElseStatementContext
import net.unicoen.parser.Java8Parser.IfThenElseStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.IfThenStatementContext
import net.unicoen.parser.Java8Parser.ImportDeclarationContext
import net.unicoen.parser.Java8Parser.InclusiveOrExpressionContext
import net.unicoen.parser.Java8Parser.InferredFormalParameterListContext
import net.unicoen.parser.Java8Parser.InstanceInitializerContext
import net.unicoen.parser.Java8Parser.IntegralTypeContext
import net.unicoen.parser.Java8Parser.InterfaceBodyContext
import net.unicoen.parser.Java8Parser.InterfaceDeclarationContext
import net.unicoen.parser.Java8Parser.InterfaceMemberDeclarationContext
import net.unicoen.parser.Java8Parser.InterfaceMethodDeclarationContext
import net.unicoen.parser.Java8Parser.InterfaceMethodModifierContext
import net.unicoen.parser.Java8Parser.InterfaceModifierContext
import net.unicoen.parser.Java8Parser.InterfaceTypeContext
import net.unicoen.parser.Java8Parser.InterfaceTypeListContext
import net.unicoen.parser.Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.LabeledStatementContext
import net.unicoen.parser.Java8Parser.LabeledStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.LambdaBodyContext
import net.unicoen.parser.Java8Parser.LambdaExpressionContext
import net.unicoen.parser.Java8Parser.LambdaParametersContext
import net.unicoen.parser.Java8Parser.LastFormalParameterContext
import net.unicoen.parser.Java8Parser.LeftHandSideContext
import net.unicoen.parser.Java8Parser.LiteralContext
import net.unicoen.parser.Java8Parser.LocalVariableDeclarationContext
import net.unicoen.parser.Java8Parser.LocalVariableDeclarationStatementContext
import net.unicoen.parser.Java8Parser.MarkerAnnotationContext
import net.unicoen.parser.Java8Parser.MethodBodyContext
import net.unicoen.parser.Java8Parser.MethodDeclarationContext
import net.unicoen.parser.Java8Parser.MethodDeclaratorContext
import net.unicoen.parser.Java8Parser.MethodHeaderContext
import net.unicoen.parser.Java8Parser.MethodInvocationContext
import net.unicoen.parser.Java8Parser.MethodInvocation_lf_primaryContext
import net.unicoen.parser.Java8Parser.MethodInvocation_lfno_primaryContext
import net.unicoen.parser.Java8Parser.MethodModifierContext
import net.unicoen.parser.Java8Parser.MethodNameContext
import net.unicoen.parser.Java8Parser.MethodReferenceContext
import net.unicoen.parser.Java8Parser.MethodReference_lf_primaryContext
import net.unicoen.parser.Java8Parser.MethodReference_lfno_primaryContext
import net.unicoen.parser.Java8Parser.MultiplicativeExpressionContext
import net.unicoen.parser.Java8Parser.NormalAnnotationContext
import net.unicoen.parser.Java8Parser.NormalClassDeclarationContext
import net.unicoen.parser.Java8Parser.NormalInterfaceDeclarationContext
import net.unicoen.parser.Java8Parser.NumericTypeContext
import net.unicoen.parser.Java8Parser.PackageDeclarationContext
import net.unicoen.parser.Java8Parser.PackageModifierContext
import net.unicoen.parser.Java8Parser.PackageNameContext
import net.unicoen.parser.Java8Parser.PackageOrTypeNameContext
import net.unicoen.parser.Java8Parser.PostDecrementExpressionContext
import net.unicoen.parser.Java8Parser.PostDecrementExpression_lf_postfixExpressionContext
import net.unicoen.parser.Java8Parser.PostIncrementExpressionContext
import net.unicoen.parser.Java8Parser.PostIncrementExpression_lf_postfixExpressionContext
import net.unicoen.parser.Java8Parser.PostfixExpressionContext
import net.unicoen.parser.Java8Parser.PreDecrementExpressionContext
import net.unicoen.parser.Java8Parser.PreIncrementExpressionContext
import net.unicoen.parser.Java8Parser.PrimaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArrayContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lf_primaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lfno_primaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext
import net.unicoen.parser.Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext
import net.unicoen.parser.Java8Parser.PrimitiveTypeContext
import net.unicoen.parser.Java8Parser.ReceiverParameterContext
import net.unicoen.parser.Java8Parser.ReferenceTypeContext
import net.unicoen.parser.Java8Parser.RelationalExpressionContext
import net.unicoen.parser.Java8Parser.ResourceContext
import net.unicoen.parser.Java8Parser.ResourceListContext
import net.unicoen.parser.Java8Parser.ResourceSpecificationContext
import net.unicoen.parser.Java8Parser.ResultContext
import net.unicoen.parser.Java8Parser.ReturnStatementContext
import net.unicoen.parser.Java8Parser.ShiftExpressionContext
import net.unicoen.parser.Java8Parser.SimpleTypeNameContext
import net.unicoen.parser.Java8Parser.SingleElementAnnotationContext
import net.unicoen.parser.Java8Parser.SingleStaticImportDeclarationContext
import net.unicoen.parser.Java8Parser.SingleTypeImportDeclarationContext
import net.unicoen.parser.Java8Parser.StatementContext
import net.unicoen.parser.Java8Parser.StatementExpressionContext
import net.unicoen.parser.Java8Parser.StatementExpressionListContext
import net.unicoen.parser.Java8Parser.StatementNoShortIfContext
import net.unicoen.parser.Java8Parser.StatementWithoutTrailingSubstatementContext
import net.unicoen.parser.Java8Parser.StaticImportOnDemandDeclarationContext
import net.unicoen.parser.Java8Parser.StaticInitializerContext
import net.unicoen.parser.Java8Parser.SuperclassContext
import net.unicoen.parser.Java8Parser.SuperinterfacesContext
import net.unicoen.parser.Java8Parser.SwitchBlockContext
import net.unicoen.parser.Java8Parser.SwitchBlockStatementGroupContext
import net.unicoen.parser.Java8Parser.SwitchLabelContext
import net.unicoen.parser.Java8Parser.SwitchLabelsContext
import net.unicoen.parser.Java8Parser.SwitchStatementContext
import net.unicoen.parser.Java8Parser.SynchronizedStatementContext
import net.unicoen.parser.Java8Parser.ThrowStatementContext
import net.unicoen.parser.Java8Parser.Throws_Context
import net.unicoen.parser.Java8Parser.TryStatementContext
import net.unicoen.parser.Java8Parser.TryWithResourcesStatementContext
import net.unicoen.parser.Java8Parser.TypeArgumentContext
import net.unicoen.parser.Java8Parser.TypeArgumentListContext
import net.unicoen.parser.Java8Parser.TypeArgumentsContext
import net.unicoen.parser.Java8Parser.TypeArgumentsOrDiamondContext
import net.unicoen.parser.Java8Parser.TypeBoundContext
import net.unicoen.parser.Java8Parser.TypeContext
import net.unicoen.parser.Java8Parser.TypeDeclarationContext
import net.unicoen.parser.Java8Parser.TypeImportOnDemandDeclarationContext
import net.unicoen.parser.Java8Parser.TypeNameContext
import net.unicoen.parser.Java8Parser.TypeParameterContext
import net.unicoen.parser.Java8Parser.TypeParameterListContext
import net.unicoen.parser.Java8Parser.TypeParameterModifierContext
import net.unicoen.parser.Java8Parser.TypeParametersContext
import net.unicoen.parser.Java8Parser.TypeVariableContext
import net.unicoen.parser.Java8Parser.UnannArrayTypeContext
import net.unicoen.parser.Java8Parser.UnannClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannClassTypeContext
import net.unicoen.parser.Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext
import net.unicoen.parser.Java8Parser.UnannPrimitiveTypeContext
import net.unicoen.parser.Java8Parser.UnannReferenceTypeContext
import net.unicoen.parser.Java8Parser.UnannTypeContext
import net.unicoen.parser.Java8Parser.UnannTypeVariableContext
import net.unicoen.parser.Java8Parser.UnaryExpressionContext
import net.unicoen.parser.Java8Parser.UnaryExpressionNotPlusMinusContext
import net.unicoen.parser.Java8Parser.VariableDeclaratorContext
import net.unicoen.parser.Java8Parser.VariableDeclaratorIdContext
import net.unicoen.parser.Java8Parser.VariableDeclaratorListContext
import net.unicoen.parser.Java8Parser.VariableInitializerContext
import net.unicoen.parser.Java8Parser.VariableInitializerListContext
import net.unicoen.parser.Java8Parser.VariableModifierContext
import net.unicoen.parser.Java8Parser.WhileStatementContext
import net.unicoen.parser.Java8Parser.WhileStatementNoShortIfContext
import net.unicoen.parser.Java8Parser.WildcardBoundsContext
import net.unicoen.parser.Java8Parser.WildcardContext
import net.unicoen.parser.Java8Visitor
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.antlr.v4.runtime.tree.TerminalNode

class JavaMapper implements Java8Visitor {

	override visitAdditionalBound(AdditionalBoundContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAdditiveExpression(AdditiveExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAmbiguousName(AmbiguousNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAndExpression(AndExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotation(AnnotationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArgumentList(ArgumentListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayAccess(ArrayAccessContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayCreationExpression(ArrayCreationExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayInitializer(ArrayInitializerContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitArrayType(ArrayTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAssertStatement(AssertStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAssignment(AssignmentContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAssignmentExpression(AssignmentExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitAssignmentOperator(AssignmentOperatorContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBasicForStatement(BasicForStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBlock(BlockContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBlockStatement(BlockStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBlockStatements(BlockStatementsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitBreakStatement(BreakStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCastExpression(CastExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCatchClause(CatchClauseContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCatchFormalParameter(CatchFormalParameterContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCatchType(CatchTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCatches(CatchesContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassBody(ClassBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassDeclaration(ClassDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassInstanceCreationExpression_lfno_primary(ClassInstanceCreationExpression_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassModifier(ClassModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassType(ClassTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitCompilationUnit(CompilationUnitContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConditionalAndExpression(ConditionalAndExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConditionalExpression(ConditionalExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConditionalOrExpression(ConditionalOrExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstantDeclaration(ConstantDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstantExpression(ConstantExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstantModifier(ConstantModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstructorBody(ConstructorBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstructorDeclaration(ConstructorDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstructorDeclarator(ConstructorDeclaratorContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitConstructorModifier(ConstructorModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitContinueStatement(ContinueStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitDefaultValue(DefaultValueContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitDimExpr(DimExprContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitDimExprs(DimExprsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitDims(DimsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitDoStatement(DoStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitElementValue(ElementValueContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitElementValueList(ElementValueListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitElementValuePair(ElementValuePairContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitElementValuePairList(ElementValuePairListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEmptyStatement(EmptyStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnhancedForStatement(EnhancedForStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumBody(EnumBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumConstant(EnumConstantContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumConstantList(EnumConstantListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumConstantModifier(EnumConstantModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumConstantName(EnumConstantNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEnumDeclaration(EnumDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitEqualityExpression(EqualityExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExceptionType(ExceptionTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExceptionTypeList(ExceptionTypeListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExpression(ExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExpressionName(ExpressionNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExpressionStatement(ExpressionStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitExtendsInterfaces(ExtendsInterfacesContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFieldAccess(FieldAccessContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFieldDeclaration(FieldDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFieldModifier(FieldModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFinally_(Finally_Context ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFloatingPointType(FloatingPointTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitForInit(ForInitContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitForStatement(ForStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitForStatementNoShortIf(ForStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitForUpdate(ForUpdateContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFormalParameter(FormalParameterContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFormalParameterList(FormalParameterListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitFormalParameters(FormalParametersContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitIfThenElseStatement(IfThenElseStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitIfThenStatement(IfThenStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitImportDeclaration(ImportDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInferredFormalParameterList(InferredFormalParameterListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInstanceInitializer(InstanceInitializerContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitIntegralType(IntegralTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceBody(InterfaceBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceModifier(InterfaceModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceType(InterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceTypeList(InterfaceTypeListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceType_lf_classOrInterfaceType(InterfaceType_lf_classOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLabeledStatement(LabeledStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLambdaBody(LambdaBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLambdaExpression(LambdaExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLambdaParameters(LambdaParametersContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLastFormalParameter(LastFormalParameterContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLeftHandSide(LeftHandSideContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLiteral(LiteralContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMarkerAnnotation(MarkerAnnotationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodBody(MethodBodyContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodDeclaration(MethodDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodDeclarator(MethodDeclaratorContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodHeader(MethodHeaderContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodInvocation(MethodInvocationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodModifier(MethodModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodName(MethodNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodReference(MethodReferenceContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitNormalAnnotation(NormalAnnotationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitNumericType(NumericTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPackageDeclaration(PackageDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPackageModifier(PackageModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPackageName(PackageNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPackageOrTypeName(PackageOrTypeNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPostDecrementExpression(PostDecrementExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPostDecrementExpression_lf_postfixExpression(PostDecrementExpression_lf_postfixExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPostIncrementExpression(PostIncrementExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPostIncrementExpression_lf_postfixExpression(PostIncrementExpression_lf_postfixExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPostfixExpression(PostfixExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPreDecrementExpression(PreDecrementExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPreIncrementExpression(PreIncrementExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimary(PrimaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lfno_arrayAccess(PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitPrimitiveType(PrimitiveTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitReceiverParameter(ReceiverParameterContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitReferenceType(ReferenceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitRelationalExpression(RelationalExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitResource(ResourceContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitResourceList(ResourceListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitResourceSpecification(ResourceSpecificationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitResult(ResultContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitReturnStatement(ReturnStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitShiftExpression(ShiftExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSimpleTypeName(SimpleTypeNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSingleElementAnnotation(SingleElementAnnotationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStatement(StatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStatementExpression(StatementExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStatementExpressionList(StatementExpressionListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStatementNoShortIf(StatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitStaticInitializer(StaticInitializerContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSuperclass(SuperclassContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSuperinterfaces(SuperinterfacesContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSwitchBlock(SwitchBlockContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSwitchLabel(SwitchLabelContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSwitchLabels(SwitchLabelsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSwitchStatement(SwitchStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitSynchronizedStatement(SynchronizedStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitThrowStatement(ThrowStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitThrows_(Throws_Context ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTryStatement(TryStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitType(TypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeArgument(TypeArgumentContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeArgumentList(TypeArgumentListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeArguments(TypeArgumentsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeBound(TypeBoundContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeDeclaration(TypeDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeName(TypeNameContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeParameter(TypeParameterContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeParameterList(TypeParameterListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeParameterModifier(TypeParameterModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeParameters(TypeParametersContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTypeVariable(TypeVariableContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannArrayType(UnannArrayTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannClassType(UnannClassTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannClassType_lf_unannClassOrInterfaceType(UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannInterfaceType(UnannInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannInterfaceType_lf_unannClassOrInterfaceType(
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannInterfaceType_lfno_unannClassOrInterfaceType(
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannReferenceType(UnannReferenceTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannType(UnannTypeContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnannTypeVariable(UnannTypeVariableContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnaryExpression(UnaryExpressionContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableDeclarator(VariableDeclaratorContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableDeclaratorList(VariableDeclaratorListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableInitializer(VariableInitializerContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableInitializerList(VariableInitializerListContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitVariableModifier(VariableModifierContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitWhileStatement(WhileStatementContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitWildcard(WildcardContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitWildcardBounds(WildcardBoundsContext ctx) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visit(ParseTree arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitChildren(RuleNode arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitErrorNode(ErrorNode arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override visitTerminal(TerminalNode arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

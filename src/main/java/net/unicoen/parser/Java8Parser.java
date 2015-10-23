// Generated from Java8.g4 by ANTLR 4.5.1

	package net.unicoen.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_ambiguousName = 30, 
		RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, 
		RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, 
		RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, 
		RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_normalClassDeclaration = 41, 
		RULE_className = 42, RULE_classModifiers = 43, RULE_classModifier = 44, 
		RULE_typeParameters = 45, RULE_typeParameterList = 46, RULE_superclass = 47, 
		RULE_superinterfaces = 48, RULE_interfaceTypeList = 49, RULE_classBody = 50, 
		RULE_classBodyDeclaration = 51, RULE_classMemberDeclaration = 52, RULE_fieldDeclaration = 53, 
		RULE_fieldModifiers = 54, RULE_fieldModifier = 55, RULE_variableDeclaratorList = 56, 
		RULE_variableDeclarator = 57, RULE_variableDeclaratorId = 58, RULE_variableInitializer = 59, 
		RULE_unannType = 60, RULE_unannPrimitiveType = 61, RULE_unannReferenceType = 62, 
		RULE_unannClassOrInterfaceType = 63, RULE_unannClassType = 64, RULE_unannClassType_lf_unannClassOrInterfaceType = 65, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 66, RULE_unannInterfaceType = 67, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 68, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 69, 
		RULE_unannTypeVariable = 70, RULE_unannArrayType = 71, RULE_methodDeclaration = 72, 
		RULE_methodModifier = 73, RULE_methodHeader = 74, RULE_result = 75, RULE_methodDeclarator = 76, 
		RULE_methodName = 77, RULE_formalParameterList = 78, RULE_formalParameters = 79, 
		RULE_formalParameter = 80, RULE_parameterDeclaratorId = 81, RULE_parameterName = 82, 
		RULE_variableModifier = 83, RULE_lastFormalParameter = 84, RULE_receiverParameter = 85, 
		RULE_throws_ = 86, RULE_exceptionTypeList = 87, RULE_exceptionType = 88, 
		RULE_methodBody = 89, RULE_instanceInitializer = 90, RULE_staticInitializer = 91, 
		RULE_constructorDeclaration = 92, RULE_constructorModifier = 93, RULE_constructorDeclarator = 94, 
		RULE_simpleTypeName = 95, RULE_constructorBody = 96, RULE_explicitConstructorInvocation = 97, 
		RULE_enumDeclaration = 98, RULE_enumBody = 99, RULE_enumConstantList = 100, 
		RULE_enumConstant = 101, RULE_enumConstantModifier = 102, RULE_enumBodyDeclarations = 103, 
		RULE_interfaceDeclaration = 104, RULE_normalInterfaceDeclaration = 105, 
		RULE_interfaceModifier = 106, RULE_extendsInterfaces = 107, RULE_interfaceBody = 108, 
		RULE_interfaceMemberDeclaration = 109, RULE_constantDeclaration = 110, 
		RULE_constantModifier = 111, RULE_interfaceMethodDeclaration = 112, RULE_interfaceMethodModifier = 113, 
		RULE_annotationTypeDeclaration = 114, RULE_annotationTypeBody = 115, RULE_annotationTypeMemberDeclaration = 116, 
		RULE_annotationTypeElementDeclaration = 117, RULE_annotationTypeElementModifier = 118, 
		RULE_defaultValue = 119, RULE_annotation = 120, RULE_normalAnnotation = 121, 
		RULE_elementValuePairList = 122, RULE_elementValuePair = 123, RULE_elementValue = 124, 
		RULE_elementValueArrayInitializer = 125, RULE_elementValueList = 126, 
		RULE_markerAnnotation = 127, RULE_singleElementAnnotation = 128, RULE_arrayInitializer = 129, 
		RULE_variableInitializerList = 130, RULE_block = 131, RULE_blockStatements = 132, 
		RULE_blockStatement = 133, RULE_localVariableDeclarationStatement = 134, 
		RULE_localVariableDeclaration = 135, RULE_statement = 136, RULE_statementNoShortIf = 137, 
		RULE_statementWithoutTrailingSubstatement = 138, RULE_emptyStatement = 139, 
		RULE_labeledStatement = 140, RULE_labeledStatementNoShortIf = 141, RULE_expressionStatement = 142, 
		RULE_statementExpression = 143, RULE_ifThenStatement = 144, RULE_ifThenElseStatement = 145, 
		RULE_ifThenElseStatementNoShortIf = 146, RULE_assertStatement = 147, RULE_switchStatement = 148, 
		RULE_switchBlock = 149, RULE_switchBlockStatementGroup = 150, RULE_switchLabels = 151, 
		RULE_switchLabel = 152, RULE_enumConstantName = 153, RULE_whileStatement = 154, 
		RULE_whileStatementNoShortIf = 155, RULE_doStatement = 156, RULE_forStatement = 157, 
		RULE_forStatementNoShortIf = 158, RULE_basicForStatement = 159, RULE_basicForStatementNoShortIf = 160, 
		RULE_forInit = 161, RULE_forUpdate = 162, RULE_statementExpressionList = 163, 
		RULE_enhancedForStatement = 164, RULE_enhancedForStatementNoShortIf = 165, 
		RULE_breakStatement = 166, RULE_continueStatement = 167, RULE_returnStatement = 168, 
		RULE_throwStatement = 169, RULE_synchronizedStatement = 170, RULE_tryStatement = 171, 
		RULE_catches = 172, RULE_catchClause = 173, RULE_catchFormalParameter = 174, 
		RULE_catchType = 175, RULE_finally_ = 176, RULE_tryWithResourcesStatement = 177, 
		RULE_resourceSpecification = 178, RULE_resourceList = 179, RULE_resource = 180, 
		RULE_primary = 181, RULE_primaryNoNewArray = 182, RULE_primaryNoNewArray_lf_arrayAccess = 183, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 184, RULE_primaryNoNewArray_lf_primary = 185, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 186, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 187, 
		RULE_primaryNoNewArray_lfno_primary = 188, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 189, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 190, 
		RULE_classInstanceCreationExpression = 191, RULE_classInstanceCreationExpression_lf_primary = 192, 
		RULE_classInstanceCreationExpression_lfno_primary = 193, RULE_typeArgumentsOrDiamond = 194, 
		RULE_fieldAccess = 195, RULE_fieldAccess_lf_primary = 196, RULE_fieldAccess_lfno_primary = 197, 
		RULE_arrayAccess = 198, RULE_arrayAccess_lf_primary = 199, RULE_arrayAccess_lfno_primary = 200, 
		RULE_methodInvocation = 201, RULE_methodInvocation_lf_primary = 202, RULE_methodInvocation_lfno_primary = 203, 
		RULE_argumentList = 204, RULE_methodReference = 205, RULE_methodReference_lf_primary = 206, 
		RULE_methodReference_lfno_primary = 207, RULE_arrayCreationExpression = 208, 
		RULE_dimExprs = 209, RULE_dimExpr = 210, RULE_constantExpression = 211, 
		RULE_expression = 212, RULE_lambdaExpression = 213, RULE_lambdaParameters = 214, 
		RULE_inferredFormalParameterList = 215, RULE_lambdaBody = 216, RULE_assignmentExpression = 217, 
		RULE_assignment = 218, RULE_leftHandSide = 219, RULE_assignmentOperator = 220, 
		RULE_conditionalExpression = 221, RULE_conditionalOrExpression = 222, 
		RULE_conditionalAndExpression = 223, RULE_inclusiveOrExpression = 224, 
		RULE_exclusiveOrExpression = 225, RULE_andExpression = 226, RULE_equalityExpression = 227, 
		RULE_relationalExpression = 228, RULE_shiftExpression = 229, RULE_additiveExpression = 230, 
		RULE_multiplicativeExpression = 231, RULE_unaryExpression = 232, RULE_preIncrementExpression = 233, 
		RULE_preDecrementExpression = 234, RULE_unaryExpressionNotPlusMinus = 235, 
		RULE_postfixExpression = 236, RULE_postIncrementExpression = 237, RULE_postIncrementExpression_lf_postfixExpression = 238, 
		RULE_postDecrementExpression = 239, RULE_postDecrementExpression_lf_postfixExpression = 240, 
		RULE_castExpression = 241;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "ambiguousName", 
		"compilationUnit", "packageDeclaration", "packageModifier", "importDeclaration", 
		"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", 
		"staticImportOnDemandDeclaration", "typeDeclaration", "classDeclaration", 
		"normalClassDeclaration", "className", "classModifiers", "classModifier", 
		"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
		"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"fieldDeclaration", "fieldModifiers", "fieldModifier", "variableDeclaratorList", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "unannType", 
		"unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
		"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
		"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
		"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
		"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
		"result", "methodDeclarator", "methodName", "formalParameterList", "formalParameters", 
		"formalParameter", "parameterDeclaratorId", "parameterName", "variableModifier", 
		"lastFormalParameter", "receiverParameter", "throws_", "exceptionTypeList", 
		"exceptionType", "methodBody", "instanceInitializer", "staticInitializer", 
		"constructorDeclaration", "constructorModifier", "constructorDeclarator", 
		"simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(488);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(490);
					annotation();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(497);
					annotation();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(508);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(519);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(520);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(525);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(523);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(524);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(530);
					annotation();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(Identifier);
				setState(538);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(537);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				classOrInterfaceType();
				setState(541);
				match(DOT);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(542);
					annotation();
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				match(Identifier);
				setState(550);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(549);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DOT);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(555);
				annotation();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(Identifier);
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(562);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(565);
				annotation();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(Identifier);
			setState(573);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(572);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(581);
				annotation();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				primitiveType();
				setState(590);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				classOrInterfaceType();
				setState(593);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				typeVariable();
				setState(596);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(600);
				annotation();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(LBRACK);
			setState(607);
			match(RBRACK);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(608);
						annotation();
						}
						}
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(614);
					match(LBRACK);
					setState(615);
					match(RBRACK);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(621);
				typeParameterModifier();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			match(Identifier);
			setState(629);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(628);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				match(EXTENDS);
				setState(634);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(EXTENDS);
				setState(636);
				classOrInterfaceType();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(637);
					additionalBound();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(BITAND);
			setState(646);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(LT);
			setState(649);
			typeArgumentList();
			setState(650);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			typeArgument();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				typeArgument();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(664);
				annotation();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(670);
			match(QUESTION);
			setState(672);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(671);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(EXTENDS);
				setState(675);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(SUPER);
				setState(677);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(681);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(683);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(684);
					match(DOT);
					setState(685);
					match(Identifier);
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				packageOrTypeName(0);
				setState(693);
				match(DOT);
				setState(694);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(701);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(702);
					match(DOT);
					setState(703);
					match(Identifier);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(714);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				ambiguousName(0);
				setState(711);
				match(DOT);
				setState(712);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(717);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(719);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(720);
					match(DOT);
					setState(721);
					match(Identifier);
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(727);
				packageDeclaration();
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(730);
				importDeclaration();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(736);
				typeDeclaration();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(742);
				packageModifier();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748);
			match(PACKAGE);
			setState(749);
			match(Identifier);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(750);
				match(DOT);
				setState(751);
				match(Identifier);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(765);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IMPORT);
			setState(768);
			typeName();
			setState(769);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(IMPORT);
			setState(772);
			packageOrTypeName(0);
			setState(773);
			match(DOT);
			setState(774);
			match(MUL);
			setState(775);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(IMPORT);
			setState(778);
			match(STATIC);
			setState(779);
			typeName();
			setState(780);
			match(DOT);
			setState(781);
			match(Identifier);
			setState(782);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(IMPORT);
			setState(785);
			match(STATIC);
			setState(786);
			typeName();
			setState(787);
			match(DOT);
			setState(788);
			match(MUL);
			setState(789);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(794);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(798);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			classModifiers();
			setState(801);
			match(CLASS);
			setState(802);
			className();
			setState(804);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(803);
				typeParameters();
				}
			}

			setState(807);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(806);
				superclass();
				}
			}

			setState(810);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(809);
				superinterfaces();
				}
			}

			setState(812);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifiersContext extends ParserRuleContext {
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public ClassModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(816);
				classModifier();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classModifier);
		try {
			setState(830);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(825);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(827);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(828);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(829);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(LT);
			setState(833);
			typeParameterList();
			setState(834);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			typeParameter();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				typeParameter();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(EXTENDS);
			setState(845);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(IMPLEMENTS);
			setState(848);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			interfaceType();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(851);
				match(COMMA);
				setState(852);
				interfaceType();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(LBRACE);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(859);
				classBodyDeclaration();
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classBodyDeclaration);
		try {
			setState(871);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(869);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classMemberDeclaration);
		try {
			setState(878);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(876);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldModifiersContext fieldModifiers() {
			return getRuleContext(FieldModifiersContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			fieldModifiers();
			setState(881);
			unannType();
			setState(882);
			variableDeclaratorList();
			setState(883);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifiersContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifiersContext fieldModifiers() throws RecognitionException {
		FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fieldModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(885);
				fieldModifier();
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_fieldModifier);
		try {
			setState(899);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(895);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(897);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(898);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			variableDeclarator();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(902);
				match(COMMA);
				setState(903);
				variableDeclarator();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			variableDeclaratorId();
			setState(912);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(910);
				match(ASSIGN);
				setState(911);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(Identifier);
			setState(916);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(915);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableInitializer);
		try {
			setState(920);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannType);
		try {
			setState(924);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannPrimitiveType);
		try {
			setState(928);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannReferenceType);
		try {
			setState(933);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(935);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(936);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(941);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(939);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(940);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType);
		int _la;
		try {
			setState(962);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				match(Identifier);
				setState(948);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(947);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				unannClassOrInterfaceType();
				setState(951);
				match(DOT);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(952);
					annotation();
					}
					}
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(958);
				match(Identifier);
				setState(960);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(959);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(DOT);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(965);
				annotation();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			match(Identifier);
			setState(973);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(972);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(Identifier);
			setState(977);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(976);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unannArrayType);
		try {
			setState(996);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				unannPrimitiveType();
				setState(988);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				unannClassOrInterfaceType();
				setState(991);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				unannTypeVariable();
				setState(994);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(998);
				methodModifier();
				}
				}
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1004);
			methodHeader();
			setState(1005);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_methodModifier);
		try {
			setState(1017);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1011);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1012);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1013);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1014);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1015);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1016);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodHeader);
		int _la;
		try {
			setState(1036);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				result();
				setState(1020);
				methodDeclarator();
				setState(1022);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1021);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				typeParameters();
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1025);
					annotation();
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				result();
				setState(1032);
				methodDeclarator();
				setState(1034);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1033);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_result);
		try {
			setState(1040);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			methodName();
			setState(1043);
			match(LPAREN);
			setState(1045);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1044);
				formalParameterList();
				}
			}

			setState(1047);
			match(RPAREN);
			setState(1049);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1048);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_formalParameterList);
		try {
			setState(1058);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				formalParameters();
				setState(1054);
				match(COMMA);
				setState(1055);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_formalParameters);
		try {
			int _alt;
			setState(1076);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				formalParameter();
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1061);
						match(COMMA);
						setState(1062);
						formalParameter();
						}
						} 
					}
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				receiverParameter();
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1069);
						match(COMMA);
						setState(1070);
						formalParameter();
						}
						} 
					}
					setState(1075);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ParameterDeclaratorIdContext parameterDeclaratorId() {
			return getRuleContext(ParameterDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1078);
				variableModifier();
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084);
			unannType();
			setState(1085);
			parameterDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclaratorIdContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ParameterDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitParameterDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclaratorIdContext parameterDeclaratorId() throws RecognitionException {
		ParameterDeclaratorIdContext _localctx = new ParameterDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameterDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			parameterName();
			setState(1089);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1088);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableModifier);
		try {
			setState(1095);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1114);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1097);
					variableModifier();
					}
					}
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1103);
				unannType();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1104);
					annotation();
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1110);
				match(ELLIPSIS);
				setState(1111);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1116);
				annotation();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
			unannType();
			setState(1125);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1123);
				match(Identifier);
				setState(1124);
				match(DOT);
				}
			}

			setState(1127);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(THROWS);
			setState(1130);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			exceptionType();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1133);
				match(COMMA);
				setState(1134);
				exceptionType();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_exceptionType);
		try {
			setState(1142);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_methodBody);
		try {
			setState(1146);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(STATIC);
			setState(1151);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1153);
				constructorModifier();
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			constructorDeclarator();
			setState(1161);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1160);
				throws_();
				}
			}

			setState(1163);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constructorModifier);
		try {
			setState(1169);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1168);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1171);
				typeParameters();
				}
			}

			setState(1174);
			simpleTypeName();
			setState(1175);
			match(LPAREN);
			setState(1177);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1176);
				formalParameterList();
				}
			}

			setState(1179);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(LBRACE);
			setState(1185);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1184);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1187);
				blockStatements();
				}
			}

			setState(1190);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1238);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1192);
					typeArguments();
					}
				}

				setState(1195);
				match(THIS);
				setState(1196);
				match(LPAREN);
				setState(1198);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1197);
					argumentList();
					}
				}

				setState(1200);
				match(RPAREN);
				setState(1201);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1202);
					typeArguments();
					}
				}

				setState(1205);
				match(SUPER);
				setState(1206);
				match(LPAREN);
				setState(1208);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1207);
					argumentList();
					}
				}

				setState(1210);
				match(RPAREN);
				setState(1211);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1212);
				expressionName();
				setState(1213);
				match(DOT);
				setState(1215);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1214);
					typeArguments();
					}
				}

				setState(1217);
				match(SUPER);
				setState(1218);
				match(LPAREN);
				setState(1220);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1219);
					argumentList();
					}
				}

				setState(1222);
				match(RPAREN);
				setState(1223);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1225);
				primary();
				setState(1226);
				match(DOT);
				setState(1228);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1227);
					typeArguments();
					}
				}

				setState(1230);
				match(SUPER);
				setState(1231);
				match(LPAREN);
				setState(1233);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1232);
					argumentList();
					}
				}

				setState(1235);
				match(RPAREN);
				setState(1236);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1240);
				classModifier();
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1246);
			match(ENUM);
			setState(1247);
			match(Identifier);
			setState(1249);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1248);
				superinterfaces();
				}
			}

			setState(1251);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(LBRACE);
			setState(1255);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1254);
				enumConstantList();
				}
			}

			setState(1258);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1257);
				match(COMMA);
				}
			}

			setState(1261);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1260);
				enumBodyDeclarations();
				}
			}

			setState(1263);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			enumConstant();
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1266);
					match(COMMA);
					setState(1267);
					enumConstant();
					}
					} 
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1273);
				enumConstantModifier();
				}
				}
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1279);
			match(Identifier);
			setState(1285);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1280);
				match(LPAREN);
				setState(1282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1281);
					argumentList();
					}
				}

				setState(1284);
				match(RPAREN);
				}
			}

			setState(1288);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1287);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(SEMI);
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1293);
				classBodyDeclaration();
				}
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceDeclaration);
		try {
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1303);
				interfaceModifier();
				}
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1309);
			match(INTERFACE);
			setState(1310);
			match(Identifier);
			setState(1312);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1311);
				typeParameters();
				}
			}

			setState(1315);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1314);
				extendsInterfaces();
				}
			}

			setState(1317);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interfaceModifier);
		try {
			setState(1326);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1322);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1323);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1324);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1325);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(EXTENDS);
			setState(1329);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(LBRACE);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1332);
				interfaceMemberDeclaration();
				}
				}
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1338);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMemberDeclaration);
		try {
			setState(1345);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1343);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1344);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1347);
				constantModifier();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1353);
			unannType();
			setState(1354);
			variableDeclaratorList();
			setState(1355);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_constantModifier);
		try {
			setState(1361);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1359);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1360);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1363);
				interfaceMethodModifier();
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
			methodHeader();
			setState(1370);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceMethodModifier);
		try {
			setState(1378);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1375);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1376);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1377);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1380);
					interfaceModifier();
					}
					} 
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(1386);
			match(AT);
			setState(1387);
			match(INTERFACE);
			setState(1388);
			match(Identifier);
			setState(1389);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(LBRACE);
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1392);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1398);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1405);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1403);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1404);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1407);
				annotationTypeElementModifier();
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
			unannType();
			setState(1414);
			match(Identifier);
			setState(1415);
			match(LPAREN);
			setState(1416);
			match(RPAREN);
			setState(1418);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1417);
				dims();
				}
			}

			setState(1421);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1420);
				defaultValue();
				}
			}

			setState(1423);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_annotationTypeElementModifier);
		try {
			setState(1428);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1426);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1427);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(DEFAULT);
			setState(1431);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_annotation);
		try {
			setState(1436);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1435);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(AT);
			setState(1439);
			typeName();
			setState(1440);
			match(LPAREN);
			setState(1442);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1441);
				elementValuePairList();
				}
			}

			setState(1444);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			elementValuePair();
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1447);
				match(COMMA);
				setState(1448);
				elementValuePair();
				}
				}
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(Identifier);
			setState(1455);
			match(ASSIGN);
			setState(1456);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_elementValue);
		try {
			setState(1461);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(LBRACE);
			setState(1465);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1464);
				elementValueList();
				}
			}

			setState(1468);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1467);
				match(COMMA);
				}
			}

			setState(1470);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			elementValue();
			setState(1477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1473);
					match(COMMA);
					setState(1474);
					elementValue();
					}
					} 
				}
				setState(1479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(AT);
			setState(1481);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(AT);
			setState(1484);
			typeName();
			setState(1485);
			match(LPAREN);
			setState(1486);
			elementValue();
			setState(1487);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(LBRACE);
			setState(1491);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1490);
				variableInitializerList();
				}
			}

			setState(1494);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1493);
				match(COMMA);
				}
			}

			setState(1496);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			variableInitializer();
			setState(1503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1499);
					match(COMMA);
					setState(1500);
					variableInitializer();
					}
					} 
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(LBRACE);
			setState(1508);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1507);
				blockStatements();
				}
			}

			setState(1510);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			blockStatement();
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1513);
				blockStatement();
				}
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_blockStatement);
		try {
			setState(1522);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1520);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1521);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			localVariableDeclaration();
			setState(1525);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1527);
				variableModifier();
				}
				}
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1533);
			unannType();
			setState(1534);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_statement);
		try {
			setState(1542);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1539);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1540);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1541);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_statementNoShortIf);
		try {
			setState(1549);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1546);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1547);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1548);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1563);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1552);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1553);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1554);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1555);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1556);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1557);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1558);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1559);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1560);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1561);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1562);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(Identifier);
			setState(1568);
			match(COLON);
			setState(1569);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(Identifier);
			setState(1572);
			match(COLON);
			setState(1573);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			statementExpression();
			setState(1576);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_statementExpression);
		try {
			setState(1585);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1582);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1583);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1584);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(IF);
			setState(1588);
			match(LPAREN);
			setState(1589);
			expression();
			setState(1590);
			match(RPAREN);
			setState(1591);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(IF);
			setState(1594);
			match(LPAREN);
			setState(1595);
			expression();
			setState(1596);
			match(RPAREN);
			setState(1597);
			statementNoShortIf();
			setState(1598);
			match(ELSE);
			setState(1599);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(IF);
			setState(1602);
			match(LPAREN);
			setState(1603);
			expression();
			setState(1604);
			match(RPAREN);
			setState(1605);
			statementNoShortIf();
			setState(1606);
			match(ELSE);
			setState(1607);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_assertStatement);
		try {
			setState(1619);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(ASSERT);
				setState(1610);
				expression();
				setState(1611);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				match(ASSERT);
				setState(1614);
				expression();
				setState(1615);
				match(COLON);
				setState(1616);
				expression();
				setState(1617);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(SWITCH);
			setState(1622);
			match(LPAREN);
			setState(1623);
			expression();
			setState(1624);
			match(RPAREN);
			setState(1625);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			match(LBRACE);
			setState(1631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1628);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1634);
				switchLabel();
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1640);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			switchLabels();
			setState(1643);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			switchLabel();
			setState(1649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1646);
				switchLabel();
				}
				}
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_switchLabel);
		try {
			setState(1662);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				match(CASE);
				setState(1653);
				constantExpression();
				setState(1654);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(CASE);
				setState(1657);
				enumConstantName();
				setState(1658);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1660);
				match(DEFAULT);
				setState(1661);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(WHILE);
			setState(1667);
			match(LPAREN);
			setState(1668);
			expression();
			setState(1669);
			match(RPAREN);
			setState(1670);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(WHILE);
			setState(1673);
			match(LPAREN);
			setState(1674);
			expression();
			setState(1675);
			match(RPAREN);
			setState(1676);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(DO);
			setState(1679);
			statement();
			setState(1680);
			match(WHILE);
			setState(1681);
			match(LPAREN);
			setState(1682);
			expression();
			setState(1683);
			match(RPAREN);
			setState(1684);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forStatement);
		try {
			setState(1688);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_forStatementNoShortIf);
		try {
			setState(1692);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(FOR);
			setState(1695);
			match(LPAREN);
			setState(1697);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1696);
				forInit();
				}
			}

			setState(1699);
			match(SEMI);
			setState(1701);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1700);
				expression();
				}
			}

			setState(1703);
			match(SEMI);
			setState(1705);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1704);
				forUpdate();
				}
			}

			setState(1707);
			match(RPAREN);
			setState(1708);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(FOR);
			setState(1711);
			match(LPAREN);
			setState(1713);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1712);
				forInit();
				}
			}

			setState(1715);
			match(SEMI);
			setState(1717);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1716);
				expression();
				}
			}

			setState(1719);
			match(SEMI);
			setState(1721);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1720);
				forUpdate();
				}
			}

			setState(1723);
			match(RPAREN);
			setState(1724);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_forInit);
		try {
			setState(1728);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			statementExpression();
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1733);
				match(COMMA);
				setState(1734);
				statementExpression();
				}
				}
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(FOR);
			setState(1741);
			match(LPAREN);
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1742);
				variableModifier();
				}
				}
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1748);
			unannType();
			setState(1749);
			variableDeclaratorId();
			setState(1750);
			match(COLON);
			setState(1751);
			expression();
			setState(1752);
			match(RPAREN);
			setState(1753);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(FOR);
			setState(1756);
			match(LPAREN);
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1757);
				variableModifier();
				}
				}
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1763);
			unannType();
			setState(1764);
			variableDeclaratorId();
			setState(1765);
			match(COLON);
			setState(1766);
			expression();
			setState(1767);
			match(RPAREN);
			setState(1768);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(BREAK);
			setState(1772);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1771);
				match(Identifier);
				}
			}

			setState(1774);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(CONTINUE);
			setState(1778);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1777);
				match(Identifier);
				}
			}

			setState(1780);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(RETURN);
			setState(1784);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1783);
				expression();
				}
			}

			setState(1786);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(THROW);
			setState(1789);
			expression();
			setState(1790);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			match(SYNCHRONIZED);
			setState(1793);
			match(LPAREN);
			setState(1794);
			expression();
			setState(1795);
			match(RPAREN);
			setState(1796);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_tryStatement);
		int _la;
		try {
			setState(1810);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				match(TRY);
				setState(1799);
				block();
				setState(1800);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				match(TRY);
				setState(1803);
				block();
				setState(1805);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1804);
					catches();
					}
				}

				setState(1807);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1809);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			catchClause();
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1813);
				catchClause();
				}
				}
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			match(CATCH);
			setState(1820);
			match(LPAREN);
			setState(1821);
			catchFormalParameter();
			setState(1822);
			match(RPAREN);
			setState(1823);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1825);
				variableModifier();
				}
				}
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1831);
			catchType();
			setState(1832);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			unannClassType();
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1835);
				match(BITOR);
				setState(1836);
				classType();
				}
				}
				setState(1841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 352, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(FINALLY);
			setState(1843);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(TRY);
			setState(1846);
			resourceSpecification();
			setState(1847);
			block();
			setState(1849);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1848);
				catches();
				}
			}

			setState(1852);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1851);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(LPAREN);
			setState(1855);
			resourceList();
			setState(1857);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1856);
				match(SEMI);
				}
			}

			setState(1859);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			resource();
			setState(1866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1862);
					match(SEMI);
					setState(1863);
					resource();
					}
					} 
				}
				setState(1868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1869);
				variableModifier();
				}
				}
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1875);
			unannType();
			setState(1876);
			variableDeclaratorId();
			setState(1877);
			match(ASSIGN);
			setState(1878);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1880);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1881);
				arrayCreationExpression();
				}
				break;
			}
			setState(1887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1884);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1919);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1891);
				typeName();
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1892);
					match(LBRACK);
					setState(1893);
					match(RBRACK);
					}
					}
					setState(1898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1899);
				match(DOT);
				setState(1900);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1902);
				match(VOID);
				setState(1903);
				match(DOT);
				setState(1904);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1905);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1906);
				typeName();
				setState(1907);
				match(DOT);
				setState(1908);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1910);
				match(LPAREN);
				setState(1911);
				expression();
				setState(1912);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1914);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1915);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1916);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1917);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1918);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1951);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				typeName();
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1925);
					match(LBRACK);
					setState(1926);
					match(RBRACK);
					}
					}
					setState(1931);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1932);
				match(DOT);
				setState(1933);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1935);
				match(VOID);
				setState(1936);
				match(DOT);
				setState(1937);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1938);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1939);
				typeName();
				setState(1940);
				match(DOT);
				setState(1941);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1943);
				match(LPAREN);
				setState(1944);
				expression();
				setState(1945);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1947);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1948);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1949);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1950);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1958);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1953);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1954);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1956);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1957);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1962);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1963);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1964);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1965);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2008);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
				typeName();
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1970);
					match(LBRACK);
					setState(1971);
					match(RBRACK);
					}
					}
					setState(1976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1977);
				match(DOT);
				setState(1978);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1980);
				unannPrimitiveType();
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1981);
					match(LBRACK);
					setState(1982);
					match(RBRACK);
					}
					}
					setState(1987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1988);
				match(DOT);
				setState(1989);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1991);
				match(VOID);
				setState(1992);
				match(DOT);
				setState(1993);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1994);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1995);
				typeName();
				setState(1996);
				match(DOT);
				setState(1997);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1999);
				match(LPAREN);
				setState(2000);
				expression();
				setState(2001);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2003);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2004);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2005);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2006);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2007);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2051);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				typeName();
				setState(2018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2014);
					match(LBRACK);
					setState(2015);
					match(RBRACK);
					}
					}
					setState(2020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2021);
				match(DOT);
				setState(2022);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2024);
				unannPrimitiveType();
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2025);
					match(LBRACK);
					setState(2026);
					match(RBRACK);
					}
					}
					setState(2031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2032);
				match(DOT);
				setState(2033);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2035);
				match(VOID);
				setState(2036);
				match(DOT);
				setState(2037);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2038);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2039);
				typeName();
				setState(2040);
				match(DOT);
				setState(2041);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2043);
				match(LPAREN);
				setState(2044);
				expression();
				setState(2045);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2047);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2048);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2049);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2050);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2136);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				match(NEW);
				setState(2055);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2054);
					typeArguments();
					}
				}

				setState(2060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2057);
					annotation();
					}
					}
					setState(2062);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2063);
				match(Identifier);
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2064);
					match(DOT);
					setState(2068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2065);
						annotation();
						}
						}
						setState(2070);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2071);
					match(Identifier);
					}
					}
					setState(2076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2078);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2077);
					typeArgumentsOrDiamond();
					}
				}

				setState(2080);
				match(LPAREN);
				setState(2082);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2081);
					argumentList();
					}
				}

				setState(2084);
				match(RPAREN);
				setState(2086);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2085);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
				expressionName();
				setState(2089);
				match(DOT);
				setState(2090);
				match(NEW);
				setState(2092);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2091);
					typeArguments();
					}
				}

				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2094);
					annotation();
					}
					}
					setState(2099);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2100);
				match(Identifier);
				setState(2102);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2101);
					typeArgumentsOrDiamond();
					}
				}

				setState(2104);
				match(LPAREN);
				setState(2106);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2105);
					argumentList();
					}
				}

				setState(2108);
				match(RPAREN);
				setState(2110);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2109);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2112);
				primary();
				setState(2113);
				match(DOT);
				setState(2114);
				match(NEW);
				setState(2116);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2115);
					typeArguments();
					}
				}

				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2118);
					annotation();
					}
					}
					setState(2123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2124);
				match(Identifier);
				setState(2126);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2125);
					typeArgumentsOrDiamond();
					}
				}

				setState(2128);
				match(LPAREN);
				setState(2130);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2129);
					argumentList();
					}
				}

				setState(2132);
				match(RPAREN);
				setState(2134);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2133);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			match(DOT);
			setState(2139);
			match(NEW);
			setState(2141);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2140);
				typeArguments();
				}
			}

			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2143);
				annotation();
				}
				}
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2149);
			match(Identifier);
			setState(2151);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2150);
				typeArgumentsOrDiamond();
				}
			}

			setState(2153);
			match(LPAREN);
			setState(2155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2154);
				argumentList();
				}
			}

			setState(2157);
			match(RPAREN);
			setState(2159);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2158);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2220);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				match(NEW);
				setState(2163);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2162);
					typeArguments();
					}
				}

				setState(2168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2165);
					annotation();
					}
					}
					setState(2170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2171);
				match(Identifier);
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2172);
					match(DOT);
					setState(2176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2173);
						annotation();
						}
						}
						setState(2178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2179);
					match(Identifier);
					}
					}
					setState(2184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2186);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2185);
					typeArgumentsOrDiamond();
					}
				}

				setState(2188);
				match(LPAREN);
				setState(2190);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2189);
					argumentList();
					}
				}

				setState(2192);
				match(RPAREN);
				setState(2194);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2193);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2196);
				expressionName();
				setState(2197);
				match(DOT);
				setState(2198);
				match(NEW);
				setState(2200);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2199);
					typeArguments();
					}
				}

				setState(2205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2202);
					annotation();
					}
					}
					setState(2207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2208);
				match(Identifier);
				setState(2210);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2209);
					typeArgumentsOrDiamond();
					}
				}

				setState(2212);
				match(LPAREN);
				setState(2214);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2213);
					argumentList();
					}
				}

				setState(2216);
				match(RPAREN);
				setState(2218);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2217);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_typeArgumentsOrDiamond);
		try {
			setState(2225);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2222);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				match(LT);
				setState(2224);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_fieldAccess);
		try {
			setState(2240);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2227);
				primary();
				setState(2228);
				match(DOT);
				setState(2229);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2231);
				match(SUPER);
				setState(2232);
				match(DOT);
				setState(2233);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2234);
				typeName();
				setState(2235);
				match(DOT);
				setState(2236);
				match(SUPER);
				setState(2237);
				match(DOT);
				setState(2238);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			match(DOT);
			setState(2243);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_fieldAccess_lfno_primary);
		try {
			setState(2254);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				match(SUPER);
				setState(2246);
				match(DOT);
				setState(2247);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				typeName();
				setState(2249);
				match(DOT);
				setState(2250);
				match(SUPER);
				setState(2251);
				match(DOT);
				setState(2252);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2256);
				expressionName();
				setState(2257);
				match(LBRACK);
				setState(2258);
				expression();
				setState(2259);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2261);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2262);
				match(LBRACK);
				setState(2263);
				expression();
				setState(2264);
				match(RBRACK);
				}
				break;
			}
			setState(2275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2268);
				primaryNoNewArray_lf_arrayAccess();
				setState(2269);
				match(LBRACK);
				setState(2270);
				expression();
				setState(2271);
				match(RBRACK);
				}
				}
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2278);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2279);
			match(LBRACK);
			setState(2280);
			expression();
			setState(2281);
			match(RBRACK);
			}
			setState(2290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2283);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2284);
					match(LBRACK);
					setState(2285);
					expression();
					setState(2286);
					match(RBRACK);
					}
					} 
				}
				setState(2292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2293);
				expressionName();
				setState(2294);
				match(LBRACK);
				setState(2295);
				expression();
				setState(2296);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2298);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2299);
				match(LBRACK);
				setState(2300);
				expression();
				setState(2301);
				match(RBRACK);
				}
				break;
			}
			setState(2312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2305);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2306);
					match(LBRACK);
					setState(2307);
					expression();
					setState(2308);
					match(RBRACK);
					}
					} 
				}
				setState(2314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodInvocation);
		int _la;
		try {
			setState(2383);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2315);
				methodName();
				setState(2316);
				match(LPAREN);
				setState(2318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2317);
					argumentList();
					}
				}

				setState(2320);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2322);
				typeName();
				setState(2323);
				match(DOT);
				setState(2325);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2324);
					typeArguments();
					}
				}

				setState(2327);
				match(Identifier);
				setState(2328);
				match(LPAREN);
				setState(2330);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2329);
					argumentList();
					}
				}

				setState(2332);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2334);
				expressionName();
				setState(2335);
				match(DOT);
				setState(2337);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2336);
					typeArguments();
					}
				}

				setState(2339);
				match(Identifier);
				setState(2340);
				match(LPAREN);
				setState(2342);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2341);
					argumentList();
					}
				}

				setState(2344);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2346);
				primary();
				setState(2347);
				match(DOT);
				setState(2349);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2348);
					typeArguments();
					}
				}

				setState(2351);
				match(Identifier);
				setState(2352);
				match(LPAREN);
				setState(2354);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2353);
					argumentList();
					}
				}

				setState(2356);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2358);
				match(SUPER);
				setState(2359);
				match(DOT);
				setState(2361);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2360);
					typeArguments();
					}
				}

				setState(2363);
				match(Identifier);
				setState(2364);
				match(LPAREN);
				setState(2366);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2365);
					argumentList();
					}
				}

				setState(2368);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2369);
				typeName();
				setState(2370);
				match(DOT);
				setState(2371);
				match(SUPER);
				setState(2372);
				match(DOT);
				setState(2374);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2373);
					typeArguments();
					}
				}

				setState(2376);
				match(Identifier);
				setState(2377);
				match(LPAREN);
				setState(2379);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2378);
					argumentList();
					}
				}

				setState(2381);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(DOT);
			setState(2387);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2386);
				typeArguments();
				}
			}

			setState(2389);
			match(Identifier);
			setState(2390);
			match(LPAREN);
			setState(2392);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2391);
				argumentList();
				}
			}

			setState(2394);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2452);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2396);
				methodName();
				setState(2397);
				match(LPAREN);
				setState(2399);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2398);
					argumentList();
					}
				}

				setState(2401);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
				typeName();
				setState(2404);
				match(DOT);
				setState(2406);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2405);
					typeArguments();
					}
				}

				setState(2408);
				match(Identifier);
				setState(2409);
				match(LPAREN);
				setState(2411);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2410);
					argumentList();
					}
				}

				setState(2413);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2415);
				expressionName();
				setState(2416);
				match(DOT);
				setState(2418);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2417);
					typeArguments();
					}
				}

				setState(2420);
				match(Identifier);
				setState(2421);
				match(LPAREN);
				setState(2423);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2422);
					argumentList();
					}
				}

				setState(2425);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2427);
				match(SUPER);
				setState(2428);
				match(DOT);
				setState(2430);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2429);
					typeArguments();
					}
				}

				setState(2432);
				match(Identifier);
				setState(2433);
				match(LPAREN);
				setState(2435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2434);
					argumentList();
					}
				}

				setState(2437);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2438);
				typeName();
				setState(2439);
				match(DOT);
				setState(2440);
				match(SUPER);
				setState(2441);
				match(DOT);
				setState(2443);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2442);
					typeArguments();
					}
				}

				setState(2445);
				match(Identifier);
				setState(2446);
				match(LPAREN);
				setState(2448);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2447);
					argumentList();
					}
				}

				setState(2450);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			expression();
			setState(2459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2455);
				match(COMMA);
				setState(2456);
				expression();
				}
				}
				setState(2461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_methodReference);
		int _la;
		try {
			setState(2509);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2462);
				expressionName();
				setState(2463);
				match(COLONCOLON);
				setState(2465);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2464);
					typeArguments();
					}
				}

				setState(2467);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2469);
				referenceType();
				setState(2470);
				match(COLONCOLON);
				setState(2472);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2471);
					typeArguments();
					}
				}

				setState(2474);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
				primary();
				setState(2477);
				match(COLONCOLON);
				setState(2479);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2478);
					typeArguments();
					}
				}

				setState(2481);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2483);
				match(SUPER);
				setState(2484);
				match(COLONCOLON);
				setState(2486);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2485);
					typeArguments();
					}
				}

				setState(2488);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2489);
				typeName();
				setState(2490);
				match(DOT);
				setState(2491);
				match(SUPER);
				setState(2492);
				match(COLONCOLON);
				setState(2494);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2493);
					typeArguments();
					}
				}

				setState(2496);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2498);
				classType();
				setState(2499);
				match(COLONCOLON);
				setState(2501);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2500);
					typeArguments();
					}
				}

				setState(2503);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2505);
				arrayType();
				setState(2506);
				match(COLONCOLON);
				setState(2507);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			match(COLONCOLON);
			setState(2513);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2512);
				typeArguments();
				}
			}

			setState(2515);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2557);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2517);
				expressionName();
				setState(2518);
				match(COLONCOLON);
				setState(2520);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2519);
					typeArguments();
					}
				}

				setState(2522);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
				referenceType();
				setState(2525);
				match(COLONCOLON);
				setState(2527);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2526);
					typeArguments();
					}
				}

				setState(2529);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2531);
				match(SUPER);
				setState(2532);
				match(COLONCOLON);
				setState(2534);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2533);
					typeArguments();
					}
				}

				setState(2536);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2537);
				typeName();
				setState(2538);
				match(DOT);
				setState(2539);
				match(SUPER);
				setState(2540);
				match(COLONCOLON);
				setState(2542);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2541);
					typeArguments();
					}
				}

				setState(2544);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2546);
				classType();
				setState(2547);
				match(COLONCOLON);
				setState(2549);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2548);
					typeArguments();
					}
				}

				setState(2551);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2553);
				arrayType();
				setState(2554);
				match(COLONCOLON);
				setState(2555);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_arrayCreationExpression);
		try {
			setState(2581);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2559);
				match(NEW);
				setState(2560);
				primitiveType();
				setState(2561);
				dimExprs();
				setState(2563);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2562);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				match(NEW);
				setState(2566);
				classOrInterfaceType();
				setState(2567);
				dimExprs();
				setState(2569);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2568);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2571);
				match(NEW);
				setState(2572);
				primitiveType();
				setState(2573);
				dims();
				setState(2574);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2576);
				match(NEW);
				setState(2577);
				classOrInterfaceType();
				setState(2578);
				dims();
				setState(2579);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
			dimExpr();
			setState(2587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2584);
					dimExpr();
					}
					} 
				}
				setState(2589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2590);
				annotation();
				}
				}
				setState(2595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2596);
			match(LBRACK);
			setState(2597);
			expression();
			setState(2598);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_expression);
		try {
			setState(2604);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2602);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			lambdaParameters();
			setState(2607);
			match(ARROW);
			setState(2608);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_lambdaParameters);
		int _la;
		try {
			setState(2620);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				match(LPAREN);
				setState(2613);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2612);
					formalParameterList();
					}
				}

				setState(2615);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2616);
				match(LPAREN);
				setState(2617);
				inferredFormalParameterList();
				setState(2618);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			match(Identifier);
			setState(2627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2623);
				match(COMMA);
				setState(2624);
				match(Identifier);
				}
				}
				setState(2629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_lambdaBody);
		try {
			setState(2632);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2630);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2631);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_assignmentExpression);
		try {
			setState(2636);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2634);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2635);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			leftHandSide();
			setState(2639);
			assignmentOperator();
			setState(2640);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_leftHandSide);
		try {
			setState(2645);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2642);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2643);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2644);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2647);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_conditionalExpression);
		try {
			setState(2656);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2649);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2650);
				conditionalOrExpression(0);
				setState(2651);
				match(QUESTION);
				setState(2652);
				expression();
				setState(2653);
				match(COLON);
				setState(2654);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2659);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2661);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2662);
					match(OR);
					setState(2663);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2670);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2672);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2673);
					match(AND);
					setState(2674);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2681);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2683);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2684);
					match(BITOR);
					setState(2685);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2692);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2694);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2695);
					match(CARET);
					setState(2696);
					andExpression(0);
					}
					} 
				}
				setState(2701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2703);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2705);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2706);
					match(BITAND);
					setState(2707);
					equalityExpression(0);
					}
					} 
				}
				setState(2712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2714);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2722);
					switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2716);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2717);
						match(EQUAL);
						setState(2718);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2719);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2720);
						match(NOTEQUAL);
						setState(2721);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 456;
		enterRecursionRule(_localctx, 456, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2728);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2745);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2730);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2731);
						match(LT);
						setState(2732);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2733);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2734);
						match(GT);
						setState(2735);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2736);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2737);
						match(LE);
						setState(2738);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2739);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2740);
						match(GE);
						setState(2741);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2742);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2743);
						match(INSTANCEOF);
						setState(2744);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2751);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2766);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2753);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2754);
						match(LT);
						setState(2755);
						match(LT);
						setState(2756);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2757);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2758);
						match(GT);
						setState(2759);
						match(GT);
						setState(2760);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2761);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2762);
						match(GT);
						setState(2763);
						match(GT);
						setState(2764);
						match(GT);
						setState(2765);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 460;
		enterRecursionRule(_localctx, 460, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2772);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2780);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2774);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2775);
						match(ADD);
						setState(2776);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2777);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2778);
						match(SUB);
						setState(2779);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 462;
		enterRecursionRule(_localctx, 462, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2786);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2797);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2788);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2789);
						match(MUL);
						setState(2790);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2791);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2792);
						match(DIV);
						setState(2793);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2794);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2795);
						match(MOD);
						setState(2796);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_unaryExpression);
		try {
			setState(2809);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2802);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2803);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2804);
				match(ADD);
				setState(2805);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2806);
				match(SUB);
				setState(2807);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2808);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			match(INC);
			setState(2812);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2814);
			match(DEC);
			setState(2815);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2823);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2817);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2818);
				match(TILDE);
				setState(2819);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2820);
				match(BANG);
				setState(2821);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2822);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2825);
				primary();
				}
				break;
			case 2:
				{
				setState(2826);
				expressionName();
				}
				break;
			}
			setState(2833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2831);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2829);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2830);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2836);
			postfixExpression();
			setState(2837);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
			postfixExpression();
			setState(2842);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2844);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_castExpression);
		int _la;
		try {
			setState(2873);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2846);
				match(LPAREN);
				setState(2847);
				primitiveType();
				setState(2848);
				match(RPAREN);
				setState(2849);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2851);
				match(LPAREN);
				setState(2852);
				referenceType();
				setState(2856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2853);
					additionalBound();
					}
					}
					setState(2858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2859);
				match(RPAREN);
				setState(2860);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2862);
				match(LPAREN);
				setState(2863);
				referenceType();
				setState(2867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2864);
					additionalBound();
					}
					}
					setState(2869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2870);
				match(RPAREN);
				setState(2871);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 30:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 222:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 223:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 224:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 225:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 226:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 227:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 228:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 229:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 230:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 231:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0b3e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\3\2\3\2\3\3\3\3\5\3\u01eb\n\3"+
		"\3\4\7\4\u01ee\n\4\f\4\16\4\u01f1\13\4\3\4\3\4\7\4\u01f5\n\4\f\4\16\4"+
		"\u01f8\13\4\3\4\5\4\u01fb\n\4\3\5\3\5\5\5\u01ff\n\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u0208\n\b\3\t\3\t\5\t\u020c\n\t\3\t\3\t\7\t\u0210\n\t\f"+
		"\t\16\t\u0213\13\t\3\n\7\n\u0216\n\n\f\n\16\n\u0219\13\n\3\n\3\n\5\n\u021d"+
		"\n\n\3\n\3\n\3\n\7\n\u0222\n\n\f\n\16\n\u0225\13\n\3\n\3\n\5\n\u0229\n"+
		"\n\5\n\u022b\n\n\3\13\3\13\7\13\u022f\n\13\f\13\16\13\u0232\13\13\3\13"+
		"\3\13\5\13\u0236\n\13\3\f\7\f\u0239\n\f\f\f\16\f\u023c\13\f\3\f\3\f\5"+
		"\f\u0240\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0249\n\20\f\20\16"+
		"\20\u024c\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0259\n\21\3\22\7\22\u025c\n\22\f\22\16\22\u025f\13\22\3\22\3\22"+
		"\3\22\7\22\u0264\n\22\f\22\16\22\u0267\13\22\3\22\3\22\7\22\u026b\n\22"+
		"\f\22\16\22\u026e\13\22\3\23\7\23\u0271\n\23\f\23\16\23\u0274\13\23\3"+
		"\23\3\23\5\23\u0278\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0281"+
		"\n\25\f\25\16\25\u0284\13\25\5\25\u0286\n\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u0292\n\30\f\30\16\30\u0295\13\30\3\31"+
		"\3\31\5\31\u0299\n\31\3\32\7\32\u029c\n\32\f\32\16\32\u029f\13\32\3\32"+
		"\3\32\5\32\u02a3\n\32\3\33\3\33\3\33\3\33\5\33\u02a9\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u02b1\n\34\f\34\16\34\u02b4\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u02bb\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02c3"+
		"\n\36\f\36\16\36\u02c6\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u02cd\n\37"+
		"\3 \3 \3 \3 \3 \3 \7 \u02d5\n \f \16 \u02d8\13 \3!\5!\u02db\n!\3!\7!\u02de"+
		"\n!\f!\16!\u02e1\13!\3!\7!\u02e4\n!\f!\16!\u02e7\13!\3\"\7\"\u02ea\n\""+
		"\f\"\16\"\u02ed\13\"\3\"\3\"\3\"\3\"\7\"\u02f3\n\"\f\"\16\"\u02f6\13\""+
		"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u0300\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u031d\n)\3"+
		"*\3*\5*\u0321\n*\3+\3+\3+\3+\5+\u0327\n+\3+\5+\u032a\n+\3+\5+\u032d\n"+
		"+\3+\3+\3,\3,\3-\7-\u0334\n-\f-\16-\u0337\13-\3.\3.\3.\3.\3.\3.\3.\3."+
		"\5.\u0341\n.\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u034a\n\60\f\60\16\60\u034d"+
		"\13\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0358\n\63\f"+
		"\63\16\63\u035b\13\63\3\64\3\64\7\64\u035f\n\64\f\64\16\64\u0362\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u036a\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0371\n\66\3\67\3\67\3\67\3\67\3\67\38\78\u0379\n8\f8\168\u037c"+
		"\138\39\39\39\39\39\39\39\39\59\u0386\n9\3:\3:\3:\7:\u038b\n:\f:\16:\u038e"+
		"\13:\3;\3;\3;\5;\u0393\n;\3<\3<\5<\u0397\n<\3=\3=\5=\u039b\n=\3>\3>\5"+
		">\u039f\n>\3?\3?\5?\u03a3\n?\3@\3@\3@\5@\u03a8\n@\3A\3A\5A\u03ac\nA\3"+
		"A\3A\7A\u03b0\nA\fA\16A\u03b3\13A\3B\3B\5B\u03b7\nB\3B\3B\3B\7B\u03bc"+
		"\nB\fB\16B\u03bf\13B\3B\3B\5B\u03c3\nB\5B\u03c5\nB\3C\3C\7C\u03c9\nC\f"+
		"C\16C\u03cc\13C\3C\3C\5C\u03d0\nC\3D\3D\5D\u03d4\nD\3E\3E\3F\3F\3G\3G"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03e7\nI\3J\7J\u03ea\nJ\fJ\16J\u03ed"+
		"\13J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03fc\nK\3L\3L\3L\5L\u0401"+
		"\nL\3L\3L\7L\u0405\nL\fL\16L\u0408\13L\3L\3L\3L\5L\u040d\nL\5L\u040f\n"+
		"L\3M\3M\5M\u0413\nM\3N\3N\3N\5N\u0418\nN\3N\3N\5N\u041c\nN\3O\3O\3P\3"+
		"P\3P\3P\3P\5P\u0425\nP\3Q\3Q\3Q\7Q\u042a\nQ\fQ\16Q\u042d\13Q\3Q\3Q\3Q"+
		"\7Q\u0432\nQ\fQ\16Q\u0435\13Q\5Q\u0437\nQ\3R\7R\u043a\nR\fR\16R\u043d"+
		"\13R\3R\3R\3R\3S\3S\5S\u0444\nS\3T\3T\3U\3U\5U\u044a\nU\3V\7V\u044d\n"+
		"V\fV\16V\u0450\13V\3V\3V\7V\u0454\nV\fV\16V\u0457\13V\3V\3V\3V\3V\5V\u045d"+
		"\nV\3W\7W\u0460\nW\fW\16W\u0463\13W\3W\3W\3W\5W\u0468\nW\3W\3W\3X\3X\3"+
		"X\3Y\3Y\3Y\7Y\u0472\nY\fY\16Y\u0475\13Y\3Z\3Z\5Z\u0479\nZ\3[\3[\5[\u047d"+
		"\n[\3\\\3\\\3]\3]\3]\3^\7^\u0485\n^\f^\16^\u0488\13^\3^\3^\5^\u048c\n"+
		"^\3^\3^\3_\3_\3_\3_\5_\u0494\n_\3`\5`\u0497\n`\3`\3`\3`\5`\u049c\n`\3"+
		"`\3`\3a\3a\3b\3b\5b\u04a4\nb\3b\5b\u04a7\nb\3b\3b\3c\5c\u04ac\nc\3c\3"+
		"c\3c\5c\u04b1\nc\3c\3c\3c\5c\u04b6\nc\3c\3c\3c\5c\u04bb\nc\3c\3c\3c\3"+
		"c\3c\5c\u04c2\nc\3c\3c\3c\5c\u04c7\nc\3c\3c\3c\3c\3c\3c\5c\u04cf\nc\3"+
		"c\3c\3c\5c\u04d4\nc\3c\3c\3c\5c\u04d9\nc\3d\7d\u04dc\nd\fd\16d\u04df\13"+
		"d\3d\3d\3d\5d\u04e4\nd\3d\3d\3e\3e\5e\u04ea\ne\3e\5e\u04ed\ne\3e\5e\u04f0"+
		"\ne\3e\3e\3f\3f\3f\7f\u04f7\nf\ff\16f\u04fa\13f\3g\7g\u04fd\ng\fg\16g"+
		"\u0500\13g\3g\3g\3g\5g\u0505\ng\3g\5g\u0508\ng\3g\5g\u050b\ng\3h\3h\3"+
		"i\3i\7i\u0511\ni\fi\16i\u0514\13i\3j\3j\5j\u0518\nj\3k\7k\u051b\nk\fk"+
		"\16k\u051e\13k\3k\3k\3k\5k\u0523\nk\3k\5k\u0526\nk\3k\3k\3l\3l\3l\3l\3"+
		"l\3l\3l\5l\u0531\nl\3m\3m\3m\3n\3n\7n\u0538\nn\fn\16n\u053b\13n\3n\3n"+
		"\3o\3o\3o\3o\3o\5o\u0544\no\3p\7p\u0547\np\fp\16p\u054a\13p\3p\3p\3p\3"+
		"p\3q\3q\3q\3q\5q\u0554\nq\3r\7r\u0557\nr\fr\16r\u055a\13r\3r\3r\3r\3s"+
		"\3s\3s\3s\3s\3s\5s\u0565\ns\3t\7t\u0568\nt\ft\16t\u056b\13t\3t\3t\3t\3"+
		"t\3t\3u\3u\7u\u0574\nu\fu\16u\u0577\13u\3u\3u\3v\3v\3v\3v\3v\5v\u0580"+
		"\nv\3w\7w\u0583\nw\fw\16w\u0586\13w\3w\3w\3w\3w\3w\5w\u058d\nw\3w\5w\u0590"+
		"\nw\3w\3w\3x\3x\3x\5x\u0597\nx\3y\3y\3y\3z\3z\3z\5z\u059f\nz\3{\3{\3{"+
		"\3{\5{\u05a5\n{\3{\3{\3|\3|\3|\7|\u05ac\n|\f|\16|\u05af\13|\3}\3}\3}\3"+
		"}\3~\3~\3~\5~\u05b8\n~\3\177\3\177\5\177\u05bc\n\177\3\177\5\177\u05bf"+
		"\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080\7\u0080\u05c6\n\u0080\f\u0080"+
		"\16\u0080\u05c9\13\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083\u05d6\n\u0083\3\u0083"+
		"\5\u0083\u05d9\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u05e0\n\u0084\f\u0084\16\u0084\u05e3\13\u0084\3\u0085\3\u0085\5\u0085"+
		"\u05e7\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\7\u0086\u05ed\n\u0086\f"+
		"\u0086\16\u0086\u05f0\13\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u05f5\n"+
		"\u0087\3\u0088\3\u0088\3\u0088\3\u0089\7\u0089\u05fb\n\u0089\f\u0089\16"+
		"\u0089\u05fe\13\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0609\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u0610\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u061e\n\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0634\n\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0656\n\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\7\u0097\u0660\n\u0097\f\u0097"+
		"\16\u0097\u0663\13\u0097\3\u0097\7\u0097\u0666\n\u0097\f\u0097\16\u0097"+
		"\u0669\13\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\7\u0099\u0672\n\u0099\f\u0099\16\u0099\u0675\13\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u0681\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\5\u009f"+
		"\u069b\n\u009f\3\u00a0\3\u00a0\5\u00a0\u069f\n\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\5\u00a1\u06a4\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u06a8\n\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u06ac\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u06b4\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u06b8\n\u00a2\3"+
		"\u00a2\3\u00a2\5\u00a2\u06bc\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\5\u00a3\u06c3\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\7"+
		"\u00a5\u06ca\n\u00a5\f\u00a5\16\u00a5\u06cd\13\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\7\u00a6\u06d2\n\u00a6\f\u00a6\16\u00a6\u06d5\13\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\7\u00a7\u06e1\n\u00a7\f\u00a7\16\u00a7\u06e4\13\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u06ef"+
		"\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u06f5\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u06fb\n\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0710"+
		"\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0715\n\u00ad\3\u00ae\3\u00ae"+
		"\7\u00ae\u0719\n\u00ae\f\u00ae\16\u00ae\u071c\13\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\7\u00b0\u0725\n\u00b0\f\u00b0"+
		"\16\u00b0\u0728\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\7\u00b1\u0730\n\u00b1\f\u00b1\16\u00b1\u0733\13\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u073c\n\u00b3\3\u00b3"+
		"\5\u00b3\u073f\n\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0744\n\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u074b\n\u00b5\f\u00b5\16"+
		"\u00b5\u074e\13\u00b5\3\u00b6\7\u00b6\u0751\n\u00b6\f\u00b6\16\u00b6\u0754"+
		"\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\5\u00b7"+
		"\u075d\n\u00b7\3\u00b7\7\u00b7\u0760\n\u00b7\f\u00b7\16\u00b7\u0763\13"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0769\n\u00b8\f\u00b8\16"+
		"\u00b8\u076c\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0782\n\u00b8\3\u00b9"+
		"\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u078a\n\u00ba\f\u00ba"+
		"\16\u00ba\u078d\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07a2\n\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07a9\n\u00bb\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u07b1\n\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\7\u00be\u07b7\n\u00be\f\u00be\16\u00be\u07ba\13\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u07c2\n\u00be\f\u00be"+
		"\16\u00be\u07c5\13\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u07db\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u07e3\n\u00c0\f\u00c0"+
		"\16\u00c0\u07e6\13\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\7\u00c0\u07ee\n\u00c0\f\u00c0\16\u00c0\u07f1\13\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0806\n\u00c0\3\u00c1\3\u00c1\5\u00c1\u080a\n\u00c1\3\u00c1\7\u00c1\u080d"+
		"\n\u00c1\f\u00c1\16\u00c1\u0810\13\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1"+
		"\u0815\n\u00c1\f\u00c1\16\u00c1\u0818\13\u00c1\3\u00c1\7\u00c1\u081b\n"+
		"\u00c1\f\u00c1\16\u00c1\u081e\13\u00c1\3\u00c1\5\u00c1\u0821\n\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0825\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u0829\n\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u082f\n\u00c1\3\u00c1\7\u00c1"+
		"\u0832\n\u00c1\f\u00c1\16\u00c1\u0835\13\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0839\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u083d\n\u00c1\3\u00c1\3\u00c1\5"+
		"\u00c1\u0841\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0847\n\u00c1"+
		"\3\u00c1\7\u00c1\u084a\n\u00c1\f\u00c1\16\u00c1\u084d\13\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0851\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u0855\n\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0859\n\u00c1\5\u00c1\u085b\n\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u0860\n\u00c2\3\u00c2\7\u00c2\u0863\n\u00c2\f\u00c2\16"+
		"\u00c2\u0866\13\u00c2\3\u00c2\3\u00c2\5\u00c2\u086a\n\u00c2\3\u00c2\3"+
		"\u00c2\5\u00c2\u086e\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0872\n\u00c2\3\u00c3"+
		"\3\u00c3\5\u00c3\u0876\n\u00c3\3\u00c3\7\u00c3\u0879\n\u00c3\f\u00c3\16"+
		"\u00c3\u087c\13\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0881\n\u00c3\f"+
		"\u00c3\16\u00c3\u0884\13\u00c3\3\u00c3\7\u00c3\u0887\n\u00c3\f\u00c3\16"+
		"\u00c3\u088a\13\u00c3\3\u00c3\5\u00c3\u088d\n\u00c3\3\u00c3\3\u00c3\5"+
		"\u00c3\u0891\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u0895\n\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u089b\n\u00c3\3\u00c3\7\u00c3\u089e\n\u00c3\f"+
		"\u00c3\16\u00c3\u08a1\13\u00c3\3\u00c3\3\u00c3\5\u00c3\u08a5\n\u00c3\3"+
		"\u00c3\3\u00c3\5\u00c3\u08a9\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u08ad\n\u00c3"+
		"\5\u00c3\u08af\n\u00c3\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08b4\n\u00c4\3"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08c3\n\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u08d1\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u08dd\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u08e4\n\u00c8\f\u00c8\16\u00c8"+
		"\u08e7\13\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u08f3\n\u00c9\f\u00c9\16\u00c9\u08f6"+
		"\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0902\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\7\u00ca\u0909\n\u00ca\f\u00ca\16\u00ca\u090c\13\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u0911\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u0918\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u091d\n"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0924\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u0929\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u0930\n\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0935"+
		"\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u093c\n\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0941\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0949\n\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u094e\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u0952\n\u00cb\3\u00cc\3"+
		"\u00cc\5\u00cc\u0956\n\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u095b\n\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0962\n\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0969\n\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u096e\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0975\n\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u097a\n\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0981\n\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\5\u00cd\u0986\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\5\u00cd\u098e\n\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0993"+
		"\n\u00cd\3\u00cd\3\u00cd\5\u00cd\u0997\n\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\7\u00ce\u099c\n\u00ce\f\u00ce\16\u00ce\u099f\13\u00ce\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u09a4\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u09ab\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf"+
		"\u09b2\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09b9\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09c1\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09c8\n\u00cf\3"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09d0\n\u00cf\3"+
		"\u00d0\3\u00d0\5\u00d0\u09d4\n\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3"+
		"\u00d1\5\u00d1\u09db\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5"+
		"\u00d1\u09e2\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09e9"+
		"\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09f1"+
		"\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09f8\n\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a00\n\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a06\n\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u0a0c\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a18\n\u00d2"+
		"\3\u00d3\3\u00d3\7\u00d3\u0a1c\n\u00d3\f\u00d3\16\u00d3\u0a1f\13\u00d3"+
		"\3\u00d4\7\u00d4\u0a22\n\u00d4\f\u00d4\16\u00d4\u0a25\13\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a2f"+
		"\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8"+
		"\u0a38\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a3f\n"+
		"\u00d8\3\u00d9\3\u00d9\3\u00d9\7\u00d9\u0a44\n\u00d9\f\u00d9\16\u00d9"+
		"\u0a47\13\u00d9\3\u00da\3\u00da\5\u00da\u0a4b\n\u00da\3\u00db\3\u00db"+
		"\5\u00db\u0a4f\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u0a58\n\u00dd\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a63\n\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a6b\n\u00e0\f\u00e0\16\u00e0"+
		"\u0a6e\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1"+
		"\u0a76\n\u00e1\f\u00e1\16\u00e1\u0a79\13\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0a81\n\u00e2\f\u00e2\16\u00e2\u0a84"+
		"\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0a8c"+
		"\n\u00e3\f\u00e3\16\u00e3\u0a8f\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\7\u00e4\u0a97\n\u00e4\f\u00e4\16\u00e4\u0a9a\13\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\7\u00e5\u0aa5\n\u00e5\f\u00e5\16\u00e5\u0aa8\13\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0abc"+
		"\n\u00e6\f\u00e6\16\u00e6\u0abf\13\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u0ad1\n\u00e7\f\u00e7\16\u00e7\u0ad4"+
		"\13\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\7\u00e8\u0adf\n\u00e8\f\u00e8\16\u00e8\u0ae2\13\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\7\u00e9\u0af0\n\u00e9\f\u00e9\16\u00e9\u0af3\13\u00e9"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0afc"+
		"\n\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0b0a\n\u00ed\3\u00ee\3\u00ee"+
		"\5\u00ee\u0b0e\n\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b12\n\u00ee\f\u00ee\16"+
		"\u00ee\u0b15\13\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00f0\3\u00f0\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b29\n\u00f3\f\u00f3\16\u00f3\u0b2c"+
		"\13\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b34"+
		"\n\u00f3\f\u00f3\16\u00f3\u0b37\13\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3"+
		"\u0b3c\n\u00f3\3\u00f3\2\17\66:>\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca"+
		"\u01cc\u01ce\u01d0\u00f4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\2\6\3\2\65:\7\2\7\7\n"+
		"\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2DD]g\u0c2b\2\u01e6\3\2\2\2\4\u01ea"+
		"\3\2\2\2\6\u01fa\3\2\2\2\b\u01fe\3\2\2\2\n\u0200\3\2\2\2\f\u0202\3\2\2"+
		"\2\16\u0207\3\2\2\2\20\u020b\3\2\2\2\22\u022a\3\2\2\2\24\u022c\3\2\2\2"+
		"\26\u023a\3\2\2\2\30\u0241\3\2\2\2\32\u0243\3\2\2\2\34\u0245\3\2\2\2\36"+
		"\u024a\3\2\2\2 \u0258\3\2\2\2\"\u025d\3\2\2\2$\u0272\3\2\2\2&\u0279\3"+
		"\2\2\2(\u0285\3\2\2\2*\u0287\3\2\2\2,\u028a\3\2\2\2.\u028e\3\2\2\2\60"+
		"\u0298\3\2\2\2\62\u029d\3\2\2\2\64\u02a8\3\2\2\2\66\u02aa\3\2\2\28\u02ba"+
		"\3\2\2\2:\u02bc\3\2\2\2<\u02cc\3\2\2\2>\u02ce\3\2\2\2@\u02da\3\2\2\2B"+
		"\u02eb\3\2\2\2D\u02f9\3\2\2\2F\u02ff\3\2\2\2H\u0301\3\2\2\2J\u0305\3\2"+
		"\2\2L\u030b\3\2\2\2N\u0312\3\2\2\2P\u031c\3\2\2\2R\u0320\3\2\2\2T\u0322"+
		"\3\2\2\2V\u0330\3\2\2\2X\u0335\3\2\2\2Z\u0340\3\2\2\2\\\u0342\3\2\2\2"+
		"^\u0346\3\2\2\2`\u034e\3\2\2\2b\u0351\3\2\2\2d\u0354\3\2\2\2f\u035c\3"+
		"\2\2\2h\u0369\3\2\2\2j\u0370\3\2\2\2l\u0372\3\2\2\2n\u037a\3\2\2\2p\u0385"+
		"\3\2\2\2r\u0387\3\2\2\2t\u038f\3\2\2\2v\u0394\3\2\2\2x\u039a\3\2\2\2z"+
		"\u039e\3\2\2\2|\u03a2\3\2\2\2~\u03a7\3\2\2\2\u0080\u03ab\3\2\2\2\u0082"+
		"\u03c4\3\2\2\2\u0084\u03c6\3\2\2\2\u0086\u03d1\3\2\2\2\u0088\u03d5\3\2"+
		"\2\2\u008a\u03d7\3\2\2\2\u008c\u03d9\3\2\2\2\u008e\u03db\3\2\2\2\u0090"+
		"\u03e6\3\2\2\2\u0092\u03eb\3\2\2\2\u0094\u03fb\3\2\2\2\u0096\u040e\3\2"+
		"\2\2\u0098\u0412\3\2\2\2\u009a\u0414\3\2\2\2\u009c\u041d\3\2\2\2\u009e"+
		"\u0424\3\2\2\2\u00a0\u0436\3\2\2\2\u00a2\u043b\3\2\2\2\u00a4\u0441\3\2"+
		"\2\2\u00a6\u0445\3\2\2\2\u00a8\u0449\3\2\2\2\u00aa\u045c\3\2\2\2\u00ac"+
		"\u0461\3\2\2\2\u00ae\u046b\3\2\2\2\u00b0\u046e\3\2\2\2\u00b2\u0478\3\2"+
		"\2\2\u00b4\u047c\3\2\2\2\u00b6\u047e\3\2\2\2\u00b8\u0480\3\2\2\2\u00ba"+
		"\u0486\3\2\2\2\u00bc\u0493\3\2\2\2\u00be\u0496\3\2\2\2\u00c0\u049f\3\2"+
		"\2\2\u00c2\u04a1\3\2\2\2\u00c4\u04d8\3\2\2\2\u00c6\u04dd\3\2\2\2\u00c8"+
		"\u04e7\3\2\2\2\u00ca\u04f3\3\2\2\2\u00cc\u04fe\3\2\2\2\u00ce\u050c\3\2"+
		"\2\2\u00d0\u050e\3\2\2\2\u00d2\u0517\3\2\2\2\u00d4\u051c\3\2\2\2\u00d6"+
		"\u0530\3\2\2\2\u00d8\u0532\3\2\2\2\u00da\u0535\3\2\2\2\u00dc\u0543\3\2"+
		"\2\2\u00de\u0548\3\2\2\2\u00e0\u0553\3\2\2\2\u00e2\u0558\3\2\2\2\u00e4"+
		"\u0564\3\2\2\2\u00e6\u0569\3\2\2\2\u00e8\u0571\3\2\2\2\u00ea\u057f\3\2"+
		"\2\2\u00ec\u0584\3\2\2\2\u00ee\u0596\3\2\2\2\u00f0\u0598\3\2\2\2\u00f2"+
		"\u059e\3\2\2\2\u00f4\u05a0\3\2\2\2\u00f6\u05a8\3\2\2\2\u00f8\u05b0\3\2"+
		"\2\2\u00fa\u05b7\3\2\2\2\u00fc\u05b9\3\2\2\2\u00fe\u05c2\3\2\2\2\u0100"+
		"\u05ca\3\2\2\2\u0102\u05cd\3\2\2\2\u0104\u05d3\3\2\2\2\u0106\u05dc\3\2"+
		"\2\2\u0108\u05e4\3\2\2\2\u010a\u05ea\3\2\2\2\u010c\u05f4\3\2\2\2\u010e"+
		"\u05f6\3\2\2\2\u0110\u05fc\3\2\2\2\u0112\u0608\3\2\2\2\u0114\u060f\3\2"+
		"\2\2\u0116\u061d\3\2\2\2\u0118\u061f\3\2\2\2\u011a\u0621\3\2\2\2\u011c"+
		"\u0625\3\2\2\2\u011e\u0629\3\2\2\2\u0120\u0633\3\2\2\2\u0122\u0635\3\2"+
		"\2\2\u0124\u063b\3\2\2\2\u0126\u0643\3\2\2\2\u0128\u0655\3\2\2\2\u012a"+
		"\u0657\3\2\2\2\u012c\u065d\3\2\2\2\u012e\u066c\3\2\2\2\u0130\u066f\3\2"+
		"\2\2\u0132\u0680\3\2\2\2\u0134\u0682\3\2\2\2\u0136\u0684\3\2\2\2\u0138"+
		"\u068a\3\2\2\2\u013a\u0690\3\2\2\2\u013c\u069a\3\2\2\2\u013e\u069e\3\2"+
		"\2\2\u0140\u06a0\3\2\2\2\u0142\u06b0\3\2\2\2\u0144\u06c2\3\2\2\2\u0146"+
		"\u06c4\3\2\2\2\u0148\u06c6\3\2\2\2\u014a\u06ce\3\2\2\2\u014c\u06dd\3\2"+
		"\2\2\u014e\u06ec\3\2\2\2\u0150\u06f2\3\2\2\2\u0152\u06f8\3\2\2\2\u0154"+
		"\u06fe\3\2\2\2\u0156\u0702\3\2\2\2\u0158\u0714\3\2\2\2\u015a\u0716\3\2"+
		"\2\2\u015c\u071d\3\2\2\2\u015e\u0726\3\2\2\2\u0160\u072c\3\2\2\2\u0162"+
		"\u0734\3\2\2\2\u0164\u0737\3\2\2\2\u0166\u0740\3\2\2\2\u0168\u0747\3\2"+
		"\2\2\u016a\u0752\3\2\2\2\u016c\u075c\3\2\2\2\u016e\u0781\3\2\2\2\u0170"+
		"\u0783\3\2\2\2\u0172\u07a1\3\2\2\2\u0174\u07a8\3\2\2\2\u0176\u07aa\3\2"+
		"\2\2\u0178\u07b0\3\2\2\2\u017a\u07da\3\2\2\2\u017c\u07dc\3\2\2\2\u017e"+
		"\u0805\3\2\2\2\u0180\u085a\3\2\2\2\u0182\u085c\3\2\2\2\u0184\u08ae\3\2"+
		"\2\2\u0186\u08b3\3\2\2\2\u0188\u08c2\3\2\2\2\u018a\u08c4\3\2\2\2\u018c"+
		"\u08d0\3\2\2\2\u018e\u08dc\3\2\2\2\u0190\u08e8\3\2\2\2\u0192\u0901\3\2"+
		"\2\2\u0194\u0951\3\2\2\2\u0196\u0953\3\2\2\2\u0198\u0996\3\2\2\2\u019a"+
		"\u0998\3\2\2\2\u019c\u09cf\3\2\2\2\u019e\u09d1\3\2\2\2\u01a0\u09ff\3\2"+
		"\2\2\u01a2\u0a17\3\2\2\2\u01a4\u0a19\3\2\2\2\u01a6\u0a23\3\2\2\2\u01a8"+
		"\u0a2a\3\2\2\2\u01aa\u0a2e\3\2\2\2\u01ac\u0a30\3\2\2\2\u01ae\u0a3e\3\2"+
		"\2\2\u01b0\u0a40\3\2\2\2\u01b2\u0a4a\3\2\2\2\u01b4\u0a4e\3\2\2\2\u01b6"+
		"\u0a50\3\2\2\2\u01b8\u0a57\3\2\2\2\u01ba\u0a59\3\2\2\2\u01bc\u0a62\3\2"+
		"\2\2\u01be\u0a64\3\2\2\2\u01c0\u0a6f\3\2\2\2\u01c2\u0a7a\3\2\2\2\u01c4"+
		"\u0a85\3\2\2\2\u01c6\u0a90\3\2\2\2\u01c8\u0a9b\3\2\2\2\u01ca\u0aa9\3\2"+
		"\2\2\u01cc\u0ac0\3\2\2\2\u01ce\u0ad5\3\2\2\2\u01d0\u0ae3\3\2\2\2\u01d2"+
		"\u0afb\3\2\2\2\u01d4\u0afd\3\2\2\2\u01d6\u0b00\3\2\2\2\u01d8\u0b09\3\2"+
		"\2\2\u01da\u0b0d\3\2\2\2\u01dc\u0b16\3\2\2\2\u01de\u0b19\3\2\2\2\u01e0"+
		"\u0b1b\3\2\2\2\u01e2\u0b1e\3\2\2\2\u01e4\u0b3b\3\2\2\2\u01e6\u01e7\t\2"+
		"\2\2\u01e7\3\3\2\2\2\u01e8\u01eb\5\6\4\2\u01e9\u01eb\5\16\b\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\5\3\2\2\2\u01ec\u01ee\5\u00f2z\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01fb\5\b\5\2\u01f3"+
		"\u01f5\5\u00f2z\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fb\7\5\2\2\u01fa\u01ef\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fb\7\3\2\2\2"+
		"\u01fc\u01ff\5\n\6\2\u01fd\u01ff\5\f\7\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\t\3\2\2\2\u0200\u0201\t\3\2\2\u0201\13\3\2\2\2\u0202\u0203"+
		"\t\4\2\2\u0203\r\3\2\2\2\u0204\u0208\5\20\t\2\u0205\u0208\5\36\20\2\u0206"+
		"\u0208\5 \21\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\17\3\2\2\2\u0209\u020c\5\26\f\2\u020a\u020c\5\34\17\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u0211\3\2\2\2\u020d\u0210\5\24"+
		"\13\2\u020e\u0210\5\32\16\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\21\3\2\2"+
		"\2\u0213\u0211\3\2\2\2\u0214\u0216\5\u00f2z\2\u0215\u0214\3\2\2\2\u0216"+
		"\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u021a\u021c\7h\2\2\u021b\u021d\5,\27\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u022b\3\2\2\2\u021e\u021f\5\20"+
		"\t\2\u021f\u0223\7C\2\2\u0220\u0222\5\u00f2z\2\u0221\u0220\3\2\2\2\u0222"+
		"\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0226\u0228\7h\2\2\u0227\u0229\5,\27\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0217\3\2"+
		"\2\2\u022a\u021e\3\2\2\2\u022b\23\3\2\2\2\u022c\u0230\7C\2\2\u022d\u022f"+
		"\5\u00f2z\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235"+
		"\7h\2\2\u0234\u0236\5,\27\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\25\3\2\2\2\u0237\u0239\5\u00f2z\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023d\u023f\7h\2\2\u023e\u0240\5,\27\2\u023f\u023e\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240\27\3\2\2\2\u0241\u0242\5\22\n\2\u0242\31"+
		"\3\2\2\2\u0243\u0244\5\24\13\2\u0244\33\3\2\2\2\u0245\u0246\5\26\f\2\u0246"+
		"\35\3\2\2\2\u0247\u0249\5\u00f2z\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024d\u024e\7h\2\2\u024e\37\3\2\2\2\u024f\u0250\5\6\4\2"+
		"\u0250\u0251\5\"\22\2\u0251\u0259\3\2\2\2\u0252\u0253\5\20\t\2\u0253\u0254"+
		"\5\"\22\2\u0254\u0259\3\2\2\2\u0255\u0256\5\36\20\2\u0256\u0257\5\"\22"+
		"\2\u0257\u0259\3\2\2\2\u0258\u024f\3\2\2\2\u0258\u0252\3\2\2\2\u0258\u0255"+
		"\3\2\2\2\u0259!\3\2\2\2\u025a\u025c\5\u00f2z\2\u025b\u025a\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7?\2\2\u0261\u026c\7@\2\2\u0262\u0264"+
		"\5\u00f2z\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7?\2\2\u0269\u026b\7@\2\2\u026a\u0265\3\2\2\2\u026b\u026e\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d#\3\2\2\2\u026e\u026c\3\2\2\2"+
		"\u026f\u0271\5&\24\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0277\7h\2\2\u0276\u0278\5(\25\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278%\3\2\2\2\u0279\u027a\5\u00f2z\2\u027a\'\3\2\2\2\u027b\u027c"+
		"\7\23\2\2\u027c\u0286\5\36\20\2\u027d\u027e\7\23\2\2\u027e\u0282\5\20"+
		"\t\2\u027f\u0281\5*\26\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2"+
		"\2\2\u0285\u027b\3\2\2\2\u0285\u027d\3\2\2\2\u0286)\3\2\2\2\u0287\u0288"+
		"\7W\2\2\u0288\u0289\5\30\r\2\u0289+\3\2\2\2\u028a\u028b\7F\2\2\u028b\u028c"+
		"\5.\30\2\u028c\u028d\7E\2\2\u028d-\3\2\2\2\u028e\u0293\5\60\31\2\u028f"+
		"\u0290\7B\2\2\u0290\u0292\5\60\31\2\u0291\u028f\3\2\2\2\u0292\u0295\3"+
		"\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294/\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0299\5\16\b\2\u0297\u0299\5\62\32\2\u0298\u0296\3\2\2"+
		"\2\u0298\u0297\3\2\2\2\u0299\61\3\2\2\2\u029a\u029c\5\u00f2z\2\u029b\u029a"+
		"\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\7I\2\2\u02a1\u02a3\5\64"+
		"\33\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\63\3\2\2\2\u02a4\u02a5"+
		"\7\23\2\2\u02a5\u02a9\5\16\b\2\u02a6\u02a7\7*\2\2\u02a7\u02a9\5\16\b\2"+
		"\u02a8\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\65\3\2\2\2\u02aa\u02ab"+
		"\b\34\1\2\u02ab\u02ac\7h\2\2\u02ac\u02b2\3\2\2\2\u02ad\u02ae\f\3\2\2\u02ae"+
		"\u02af\7C\2\2\u02af\u02b1\7h\2\2\u02b0\u02ad\3\2\2\2\u02b1\u02b4\3\2\2"+
		"\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\67\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b5\u02bb\7h\2\2\u02b6\u02b7\5:\36\2\u02b7\u02b8\7C\2\2\u02b8"+
		"\u02b9\7h\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b5\3\2\2\2\u02ba\u02b6\3\2"+
		"\2\2\u02bb9\3\2\2\2\u02bc\u02bd\b\36\1\2\u02bd\u02be\7h\2\2\u02be\u02c4"+
		"\3\2\2\2\u02bf\u02c0\f\3\2\2\u02c0\u02c1\7C\2\2\u02c1\u02c3\7h\2\2\u02c2"+
		"\u02bf\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5;\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02cd\7h\2\2\u02c8\u02c9"+
		"\5> \2\u02c9\u02ca\7C\2\2\u02ca\u02cb\7h\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02c7\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd=\3\2\2\2\u02ce\u02cf\b \1\2\u02cf"+
		"\u02d0\7h\2\2\u02d0\u02d6\3\2\2\2\u02d1\u02d2\f\3\2\2\u02d2\u02d3\7C\2"+
		"\2\u02d3\u02d5\7h\2\2\u02d4\u02d1\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7?\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9"+
		"\u02db\5B\"\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02df\3\2"+
		"\2\2\u02dc\u02de\5F$\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e5\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02e4\5P)\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2"+
		"\2\u02e5\u02e6\3\2\2\2\u02e6A\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea"+
		"\5D#\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7\""+
		"\2\2\u02ef\u02f4\7h\2\2\u02f0\u02f1\7C\2\2\u02f1\u02f3\7h\2\2\u02f2\u02f0"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\7A\2\2\u02f8C\3\2\2\2\u02f9"+
		"\u02fa\5\u00f2z\2\u02faE\3\2\2\2\u02fb\u0300\5H%\2\u02fc\u0300\5J&\2\u02fd"+
		"\u0300\5L\'\2\u02fe\u0300\5N(\2\u02ff\u02fb\3\2\2\2\u02ff\u02fc\3\2\2"+
		"\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300G\3\2\2\2\u0301\u0302"+
		"\7\33\2\2\u0302\u0303\58\35\2\u0303\u0304\7A\2\2\u0304I\3\2\2\2\u0305"+
		"\u0306\7\33\2\2\u0306\u0307\5:\36\2\u0307\u0308\7C\2\2\u0308\u0309\7U"+
		"\2\2\u0309\u030a\7A\2\2\u030aK\3\2\2\2\u030b\u030c\7\33\2\2\u030c\u030d"+
		"\7(\2\2\u030d\u030e\58\35\2\u030e\u030f\7C\2\2\u030f\u0310\7h\2\2\u0310"+
		"\u0311\7A\2\2\u0311M\3\2\2\2\u0312\u0313\7\33\2\2\u0313\u0314\7(\2\2\u0314"+
		"\u0315\58\35\2\u0315\u0316\7C\2\2\u0316\u0317\7U\2\2\u0317\u0318\7A\2"+
		"\2\u0318O\3\2\2\2\u0319\u031d\5R*\2\u031a\u031d\5\u00d2j\2\u031b\u031d"+
		"\7A\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d"+
		"Q\3\2\2\2\u031e\u0321\5T+\2\u031f\u0321\5\u00c6d\2\u0320\u031e\3\2\2\2"+
		"\u0320\u031f\3\2\2\2\u0321S\3\2\2\2\u0322\u0323\5X-\2\u0323\u0324\7\13"+
		"\2\2\u0324\u0326\5V,\2\u0325\u0327\5\\/\2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u032a\5`\61\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u032d\5b\62\2\u032c\u032b\3\2"+
		"\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\5f\64\2\u032f"+
		"U\3\2\2\2\u0330\u0331\7h\2\2\u0331W\3\2\2\2\u0332\u0334\5Z.\2\u0333\u0332"+
		"\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"Y\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0341\5\u00f2z\2\u0339\u0341\7%\2"+
		"\2\u033a\u0341\7$\2\2\u033b\u0341\7#\2\2\u033c\u0341\7\3\2\2\u033d\u0341"+
		"\7(\2\2\u033e\u0341\7\24\2\2\u033f\u0341\7)\2\2\u0340\u0338\3\2\2\2\u0340"+
		"\u0339\3\2\2\2\u0340\u033a\3\2\2\2\u0340\u033b\3\2\2\2\u0340\u033c\3\2"+
		"\2\2\u0340\u033d\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"[\3\2\2\2\u0342\u0343\7F\2\2\u0343\u0344\5^\60\2\u0344\u0345\7E\2\2\u0345"+
		"]\3\2\2\2\u0346\u034b\5$\23\2\u0347\u0348\7B\2\2\u0348\u034a\5$\23\2\u0349"+
		"\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c_\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\23\2\2\u034f\u0350"+
		"\5\22\n\2\u0350a\3\2\2\2\u0351\u0352\7\32\2\2\u0352\u0353\5d\63\2\u0353"+
		"c\3\2\2\2\u0354\u0359\5\30\r\2\u0355\u0356\7B\2\2\u0356\u0358\5\30\r\2"+
		"\u0357\u0355\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a"+
		"\3\2\2\2\u035ae\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u0360\7=\2\2\u035d\u035f"+
		"\5h\65\2\u035e\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364\7>"+
		"\2\2\u0364g\3\2\2\2\u0365\u036a\5j\66\2\u0366\u036a\5\u00b6\\\2\u0367"+
		"\u036a\5\u00b8]\2\u0368\u036a\5\u00ba^\2\u0369\u0365\3\2\2\2\u0369\u0366"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036ai\3\2\2\2\u036b"+
		"\u0371\5l\67\2\u036c\u0371\5\u0092J\2\u036d\u0371\5R*\2\u036e\u0371\5"+
		"\u00d2j\2\u036f\u0371\7A\2\2\u0370\u036b\3\2\2\2\u0370\u036c\3\2\2\2\u0370"+
		"\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371k\3\2\2\2"+
		"\u0372\u0373\5n8\2\u0373\u0374\5z>\2\u0374\u0375\5r:\2\u0375\u0376\7A"+
		"\2\2\u0376m\3\2\2\2\u0377\u0379\5p9\2\u0378\u0377\3\2\2\2\u0379\u037c"+
		"\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037bo\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037d\u0386\5\u00f2z\2\u037e\u0386\7%\2\2\u037f\u0386\7"+
		"$\2\2\u0380\u0386\7#\2\2\u0381\u0386\7(\2\2\u0382\u0386\7\24\2\2\u0383"+
		"\u0386\7\60\2\2\u0384\u0386\7\63\2\2\u0385\u037d\3\2\2\2\u0385\u037e\3"+
		"\2\2\2\u0385\u037f\3\2\2\2\u0385\u0380\3\2\2\2\u0385\u0381\3\2\2\2\u0385"+
		"\u0382\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386q\3\2\2\2"+
		"\u0387\u038c\5t;\2\u0388\u0389\7B\2\2\u0389\u038b\5t;\2\u038a\u0388\3"+
		"\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"s\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0392\5v<\2\u0390\u0391\7D\2\2\u0391"+
		"\u0393\5x=\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393u\3\2\2\2\u0394"+
		"\u0396\7h\2\2\u0395\u0397\5\"\22\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2"+
		"\2\2\u0397w\3\2\2\2\u0398\u039b\5\u01aa\u00d6\2\u0399\u039b\5\u0104\u0083"+
		"\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039by\3\2\2\2\u039c\u039f"+
		"\5|?\2\u039d\u039f\5~@\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f"+
		"{\3\2\2\2\u03a0\u03a3\5\b\5\2\u03a1\u03a3\7\5\2\2\u03a2\u03a0\3\2\2\2"+
		"\u03a2\u03a1\3\2\2\2\u03a3}\3\2\2\2\u03a4\u03a8\5\u0080A\2\u03a5\u03a8"+
		"\5\u008eH\2\u03a6\u03a8\5\u0090I\2\u03a7\u03a4\3\2\2\2\u03a7\u03a5\3\2"+
		"\2\2\u03a7\u03a6\3\2\2\2\u03a8\177\3\2\2\2\u03a9\u03ac\5\u0086D\2\u03aa"+
		"\u03ac\5\u008cG\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa\3\2\2\2\u03ac\u03b1"+
		"\3\2\2\2\u03ad\u03b0\5\u0084C\2\u03ae\u03b0\5\u008aF\2\u03af\u03ad\3\2"+
		"\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u0081\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6\7h"+
		"\2\2\u03b5\u03b7\5,\27\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03c5\3\2\2\2\u03b8\u03b9\5\u0080A\2\u03b9\u03bd\7C\2\2\u03ba\u03bc\5"+
		"\u00f2z\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2"+
		"\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c2"+
		"\7h\2\2\u03c1\u03c3\5,\27\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c5\3\2\2\2\u03c4\u03b4\3\2\2\2\u03c4\u03b8\3\2\2\2\u03c5\u0083\3\2"+
		"\2\2\u03c6\u03ca\7C\2\2\u03c7\u03c9\5\u00f2z\2\u03c8\u03c7\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03cf\7h\2\2\u03ce\u03d0\5,\27\2\u03cf"+
		"\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u0085\3\2\2\2\u03d1\u03d3\7h"+
		"\2\2\u03d2\u03d4\5,\27\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u0087\3\2\2\2\u03d5\u03d6\5\u0082B\2\u03d6\u0089\3\2\2\2\u03d7\u03d8"+
		"\5\u0084C\2\u03d8\u008b\3\2\2\2\u03d9\u03da\5\u0086D\2\u03da\u008d\3\2"+
		"\2\2\u03db\u03dc\7h\2\2\u03dc\u008f\3\2\2\2\u03dd\u03de\5|?\2\u03de\u03df"+
		"\5\"\22\2\u03df\u03e7\3\2\2\2\u03e0\u03e1\5\u0080A\2\u03e1\u03e2\5\"\22"+
		"\2\u03e2\u03e7\3\2\2\2\u03e3\u03e4\5\u008eH\2\u03e4\u03e5\5\"\22\2\u03e5"+
		"\u03e7\3\2\2\2\u03e6\u03dd\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e6\u03e3\3\2"+
		"\2\2\u03e7\u0091\3\2\2\2\u03e8\u03ea\5\u0094K\2\u03e9\u03e8\3\2\2\2\u03ea"+
		"\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2"+
		"\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\5\u0096L\2\u03ef\u03f0\5\u00b4[\2"+
		"\u03f0\u0093\3\2\2\2\u03f1\u03fc\5\u00f2z\2\u03f2\u03fc\7%\2\2\u03f3\u03fc"+
		"\7$\2\2\u03f4\u03fc\7#\2\2\u03f5\u03fc\7\3\2\2\u03f6\u03fc\7(\2\2\u03f7"+
		"\u03fc\7\24\2\2\u03f8\u03fc\7,\2\2\u03f9\u03fc\7 \2\2\u03fa\u03fc\7)\2"+
		"\2\u03fb\u03f1\3\2\2\2\u03fb\u03f2\3\2\2\2\u03fb\u03f3\3\2\2\2\u03fb\u03f4"+
		"\3\2\2\2\u03fb\u03f5\3\2\2\2\u03fb\u03f6\3\2\2\2\u03fb\u03f7\3\2\2\2\u03fb"+
		"\u03f8\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u0095\3\2"+
		"\2\2\u03fd\u03fe\5\u0098M\2\u03fe\u0400\5\u009aN\2\u03ff\u0401\5\u00ae"+
		"X\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040f\3\2\2\2\u0402"+
		"\u0406\5\\/\2\u0403\u0405\5\u00f2z\2\u0404\u0403\3\2\2\2\u0405\u0408\3"+
		"\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0409\u040a\5\u0098M\2\u040a\u040c\5\u009aN\2\u040b\u040d"+
		"\5\u00aeX\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2"+
		"\2\u040e\u03fd\3\2\2\2\u040e\u0402\3\2\2\2\u040f\u0097\3\2\2\2\u0410\u0413"+
		"\5z>\2\u0411\u0413\7\62\2\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0099\3\2\2\2\u0414\u0415\5\u009cO\2\u0415\u0417\7;\2\2\u0416\u0418\5"+
		"\u009eP\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2"+
		"\u0419\u041b\7<\2\2\u041a\u041c\5\"\22\2\u041b\u041a\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u009b\3\2\2\2\u041d\u041e\7h\2\2\u041e\u009d\3\2\2\2\u041f"+
		"\u0420\5\u00a0Q\2\u0420\u0421\7B\2\2\u0421\u0422\5\u00aaV\2\u0422\u0425"+
		"\3\2\2\2\u0423\u0425\5\u00aaV\2\u0424\u041f\3\2\2\2\u0424\u0423\3\2\2"+
		"\2\u0425\u009f\3\2\2\2\u0426\u042b\5\u00a2R\2\u0427\u0428\7B\2\2\u0428"+
		"\u042a\5\u00a2R\2\u0429\u0427\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u0437\3\2\2\2\u042d\u042b\3\2\2\2\u042e"+
		"\u0433\5\u00acW\2\u042f\u0430\7B\2\2\u0430\u0432\5\u00a2R\2\u0431\u042f"+
		"\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0426\3\2\2\2\u0436\u042e\3\2"+
		"\2\2\u0437\u00a1\3\2\2\2\u0438\u043a\5\u00a8U\2\u0439\u0438\3\2\2\2\u043a"+
		"\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\3\2"+
		"\2\2\u043d\u043b\3\2\2\2\u043e\u043f\5z>\2\u043f\u0440\5\u00a4S\2\u0440"+
		"\u00a3\3\2\2\2\u0441\u0443\5\u00a6T\2\u0442\u0444\5\"\22\2\u0443\u0442"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u00a5\3\2\2\2\u0445\u0446\7h\2\2\u0446"+
		"\u00a7\3\2\2\2\u0447\u044a\5\u00f2z\2\u0448\u044a\7\24\2\2\u0449\u0447"+
		"\3\2\2\2\u0449\u0448\3\2\2\2\u044a\u00a9\3\2\2\2\u044b\u044d\5\u00a8U"+
		"\2\u044c\u044b\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u0455\5z>\2\u0452"+
		"\u0454\5\u00f2z\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458"+
		"\u0459\7j\2\2\u0459\u045a\5v<\2\u045a\u045d\3\2\2\2\u045b\u045d\5\u00a2"+
		"R\2\u045c\u044e\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u00ab\3\2\2\2\u045e"+
		"\u0460\5\u00f2z\2\u045f\u045e\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464"+
		"\u0467\5z>\2\u0465\u0466\7h\2\2\u0466\u0468\7C\2\2\u0467\u0465\3\2\2\2"+
		"\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7-\2\2\u046a\u00ad"+
		"\3\2\2\2\u046b\u046c\7/\2\2\u046c\u046d\5\u00b0Y\2\u046d\u00af\3\2\2\2"+
		"\u046e\u0473\5\u00b2Z\2\u046f\u0470\7B\2\2\u0470\u0472\5\u00b2Z\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u00b1\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0479\5\22\n\2\u0477"+
		"\u0479\5\36\20\2\u0478\u0476\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u00b3\3"+
		"\2\2\2\u047a\u047d\5\u0108\u0085\2\u047b\u047d\7A\2\2\u047c\u047a\3\2"+
		"\2\2\u047c\u047b\3\2\2\2\u047d\u00b5\3\2\2\2\u047e\u047f\5\u0108\u0085"+
		"\2\u047f\u00b7\3\2\2\2\u0480\u0481\7(\2\2\u0481\u0482\5\u0108\u0085\2"+
		"\u0482\u00b9\3\2\2\2\u0483\u0485\5\u00bc_\2\u0484\u0483\3\2\2\2\u0485"+
		"\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\3\2"+
		"\2\2\u0488\u0486\3\2\2\2\u0489\u048b\5\u00be`\2\u048a\u048c\5\u00aeX\2"+
		"\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e"+
		"\5\u00c2b\2\u048e\u00bb\3\2\2\2\u048f\u0494\5\u00f2z\2\u0490\u0494\7%"+
		"\2\2\u0491\u0494\7$\2\2\u0492\u0494\7#\2\2\u0493\u048f\3\2\2\2\u0493\u0490"+
		"\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0492\3\2\2\2\u0494\u00bd\3\2\2\2\u0495"+
		"\u0497\5\\/\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2"+
		"\2\2\u0498\u0499\5\u00c0a\2\u0499\u049b\7;\2\2\u049a\u049c\5\u009eP\2"+
		"\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e"+
		"\7<\2\2\u049e\u00bf\3\2\2\2\u049f\u04a0\7h\2\2\u04a0\u00c1\3\2\2\2\u04a1"+
		"\u04a3\7=\2\2\u04a2\u04a4\5\u00c4c\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3"+
		"\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u04a7\5\u010a\u0086\2\u04a6\u04a5\3\2"+
		"\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\7>\2\2\u04a9"+
		"\u00c3\3\2\2\2\u04aa\u04ac\5,\27\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2"+
		"\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\7-\2\2\u04ae\u04b0\7;\2\2\u04af\u04b1"+
		"\5\u019a\u00ce\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3"+
		"\2\2\2\u04b2\u04b3\7<\2\2\u04b3\u04d9\7A\2\2\u04b4\u04b6\5,\27\2\u04b5"+
		"\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7*"+
		"\2\2\u04b8\u04ba\7;\2\2\u04b9\u04bb\5\u019a\u00ce\2\u04ba\u04b9\3\2\2"+
		"\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7<\2\2\u04bd\u04d9"+
		"\7A\2\2\u04be\u04bf\5<\37\2\u04bf\u04c1\7C\2\2\u04c0\u04c2\5,\27\2\u04c1"+
		"\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\7*"+
		"\2\2\u04c4\u04c6\7;\2\2\u04c5\u04c7\5\u019a\u00ce\2\u04c6\u04c5\3\2\2"+
		"\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7<\2\2\u04c9\u04ca"+
		"\7A\2\2\u04ca\u04d9\3\2\2\2\u04cb\u04cc\5\u016c\u00b7\2\u04cc\u04ce\7"+
		"C\2\2\u04cd\u04cf\5,\27\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d1\7*\2\2\u04d1\u04d3\7;\2\2\u04d2\u04d4\5\u019a"+
		"\u00ce\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d6\7<\2\2\u04d6\u04d7\7A\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04ab\3\2\2"+
		"\2\u04d8\u04b5\3\2\2\2\u04d8\u04be\3\2\2\2\u04d8\u04cb\3\2\2\2\u04d9\u00c5"+
		"\3\2\2\2\u04da\u04dc\5Z.\2\u04db\u04da\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd"+
		"\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04dd\3\2"+
		"\2\2\u04e0\u04e1\7\22\2\2\u04e1\u04e3\7h\2\2\u04e2\u04e4\5b\62\2\u04e3"+
		"\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\u00c8"+
		"e\2\u04e6\u00c7\3\2\2\2\u04e7\u04e9\7=\2\2\u04e8\u04ea\5\u00caf\2\u04e9"+
		"\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04ed\7B"+
		"\2\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee"+
		"\u04f0\5\u00d0i\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u04f2\7>\2\2\u04f2\u00c9\3\2\2\2\u04f3\u04f8\5\u00ccg\2"+
		"\u04f4\u04f5\7B\2\2\u04f5\u04f7\5\u00ccg\2\u04f6\u04f4\3\2\2\2\u04f7\u04fa"+
		"\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u00cb\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fb\u04fd\5\u00ceh\2\u04fc\u04fb\3\2\2\2\u04fd\u0500"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500"+
		"\u04fe\3\2\2\2\u0501\u0507\7h\2\2\u0502\u0504\7;\2\2\u0503\u0505\5\u019a"+
		"\u00ce\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0508\7<\2\2\u0507\u0502\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2"+
		"\2\2\u0509\u050b\5f\64\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u00cd\3\2\2\2\u050c\u050d\5\u00f2z\2\u050d\u00cf\3\2\2\2\u050e\u0512"+
		"\7A\2\2\u050f\u0511\5h\65\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u00d1\3\2\2\2\u0514\u0512\3\2"+
		"\2\2\u0515\u0518\5\u00d4k\2\u0516\u0518\5\u00e6t\2\u0517\u0515\3\2\2\2"+
		"\u0517\u0516\3\2\2\2\u0518\u00d3\3\2\2\2\u0519\u051b\5\u00d6l\2\u051a"+
		"\u0519\3\2\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u051f\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u0520\7\36\2\2\u0520"+
		"\u0522\7h\2\2\u0521\u0523\5\\/\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2"+
		"\2\u0523\u0525\3\2\2\2\u0524\u0526\5\u00d8m\2\u0525\u0524\3\2\2\2\u0525"+
		"\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\5\u00dan\2\u0528\u00d5"+
		"\3\2\2\2\u0529\u0531\5\u00f2z\2\u052a\u0531\7%\2\2\u052b\u0531\7$\2\2"+
		"\u052c\u0531\7#\2\2\u052d\u0531\7\3\2\2\u052e\u0531\7(\2\2\u052f\u0531"+
		"\7)\2\2\u0530\u0529\3\2\2\2\u0530\u052a\3\2\2\2\u0530\u052b\3\2\2\2\u0530"+
		"\u052c\3\2\2\2\u0530\u052d\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u052f\3\2"+
		"\2\2\u0531\u00d7\3\2\2\2\u0532\u0533\7\23\2\2\u0533\u0534\5d\63\2\u0534"+
		"\u00d9\3\2\2\2\u0535\u0539\7=\2\2\u0536\u0538\5\u00dco\2\u0537\u0536\3"+
		"\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053c\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u053d\7>\2\2\u053d\u00db\3\2"+
		"\2\2\u053e\u0544\5\u00dep\2\u053f\u0544\5\u00e2r\2\u0540\u0544\5R*\2\u0541"+
		"\u0544\5\u00d2j\2\u0542\u0544\7A\2\2\u0543\u053e\3\2\2\2\u0543\u053f\3"+
		"\2\2\2\u0543\u0540\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2\2\u0544"+
		"\u00dd\3\2\2\2\u0545\u0547\5\u00e0q\2\u0546\u0545\3\2\2\2\u0547\u054a"+
		"\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054b\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054b\u054c\5z>\2\u054c\u054d\5r:\2\u054d\u054e\7A\2\2"+
		"\u054e\u00df\3\2\2\2\u054f\u0554\5\u00f2z\2\u0550\u0554\7%\2\2\u0551\u0554"+
		"\7(\2\2\u0552\u0554\7\24\2\2\u0553\u054f\3\2\2\2\u0553\u0550\3\2\2\2\u0553"+
		"\u0551\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u00e1\3\2\2\2\u0555\u0557\5\u00e4"+
		"s\2\u0556\u0555\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055c\5\u0096"+
		"L\2\u055c\u055d\5\u00b4[\2\u055d\u00e3\3\2\2\2\u055e\u0565\5\u00f2z\2"+
		"\u055f\u0565\7%\2\2\u0560\u0565\7\3\2\2\u0561\u0565\7\16\2\2\u0562\u0565"+
		"\7(\2\2\u0563\u0565\7)\2\2\u0564\u055e\3\2\2\2\u0564\u055f\3\2\2\2\u0564"+
		"\u0560\3\2\2\2\u0564\u0561\3\2\2\2\u0564\u0562\3\2\2\2\u0564\u0563\3\2"+
		"\2\2\u0565\u00e5\3\2\2\2\u0566\u0568\5\u00d6l\2\u0567\u0566\3\2\2\2\u0568"+
		"\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2"+
		"\2\2\u056b\u0569\3\2\2\2\u056c\u056d\7i\2\2\u056d\u056e\7\36\2\2\u056e"+
		"\u056f\7h\2\2\u056f\u0570\5\u00e8u\2\u0570\u00e7\3\2\2\2\u0571\u0575\7"+
		"=\2\2\u0572\u0574\5\u00eav\2\u0573\u0572\3\2\2\2\u0574\u0577\3\2\2\2\u0575"+
		"\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0575\3\2"+
		"\2\2\u0578\u0579\7>\2\2\u0579\u00e9\3\2\2\2\u057a\u0580\5\u00ecw\2\u057b"+
		"\u0580\5\u00dep\2\u057c\u0580\5R*\2\u057d\u0580\5\u00d2j\2\u057e\u0580"+
		"\7A\2\2\u057f\u057a\3\2\2\2\u057f\u057b\3\2\2\2\u057f\u057c\3\2\2\2\u057f"+
		"\u057d\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u00eb\3\2\2\2\u0581\u0583\5\u00ee"+
		"x\2\u0582\u0581\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587\u0588\5z"+
		">\2\u0588\u0589\7h\2\2\u0589\u058a\7;\2\2\u058a\u058c\7<\2\2\u058b\u058d"+
		"\5\"\22\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\3\2\2\2"+
		"\u058e\u0590\5\u00f0y\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0591\3\2\2\2\u0591\u0592\7A\2\2\u0592\u00ed\3\2\2\2\u0593\u0597\5\u00f2"+
		"z\2\u0594\u0597\7%\2\2\u0595\u0597\7\3\2\2\u0596\u0593\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00ef\3\2\2\2\u0598\u0599\7\16\2\2"+
		"\u0599\u059a\5\u00fa~\2\u059a\u00f1\3\2\2\2\u059b\u059f\5\u00f4{\2\u059c"+
		"\u059f\5\u0100\u0081\2\u059d\u059f\5\u0102\u0082\2\u059e\u059b\3\2\2\2"+
		"\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u00f3\3\2\2\2\u05a0\u05a1"+
		"\7i\2\2\u05a1\u05a2\58\35\2\u05a2\u05a4\7;\2\2\u05a3\u05a5\5\u00f6|\2"+
		"\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7"+
		"\7<\2\2\u05a7\u00f5\3\2\2\2\u05a8\u05ad\5\u00f8}\2\u05a9\u05aa\7B\2\2"+
		"\u05aa\u05ac\5\u00f8}\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\3\2\2\2\u05ad"+
		"\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u00f7\3\2\2\2\u05af\u05ad\3\2"+
		"\2\2\u05b0\u05b1\7h\2\2\u05b1\u05b2\7D\2\2\u05b2\u05b3\5\u00fa~\2\u05b3"+
		"\u00f9\3\2\2\2\u05b4\u05b8\5\u01bc\u00df\2\u05b5\u05b8\5\u00fc\177\2\u05b6"+
		"\u05b8\5\u00f2z\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6"+
		"\3\2\2\2\u05b8\u00fb\3\2\2\2\u05b9\u05bb\7=\2\2\u05ba\u05bc\5\u00fe\u0080"+
		"\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\3\2\2\2\u05bd\u05bf"+
		"\7B\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c1\7>\2\2\u05c1\u00fd\3\2\2\2\u05c2\u05c7\5\u00fa~\2\u05c3\u05c4\7"+
		"B\2\2\u05c4\u05c6\5\u00fa~\2\u05c5\u05c3\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7"+
		"\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u00ff\3\2\2\2\u05c9\u05c7\3\2"+
		"\2\2\u05ca\u05cb\7i\2\2\u05cb\u05cc\58\35\2\u05cc\u0101\3\2\2\2\u05cd"+
		"\u05ce\7i\2\2\u05ce\u05cf\58\35\2\u05cf\u05d0\7;\2\2\u05d0\u05d1\5\u00fa"+
		"~\2\u05d1\u05d2\7<\2\2\u05d2\u0103\3\2\2\2\u05d3\u05d5\7=\2\2\u05d4\u05d6"+
		"\5\u0106\u0084\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d8\3"+
		"\2\2\2\u05d7\u05d9\7B\2\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u05db\7>\2\2\u05db\u0105\3\2\2\2\u05dc\u05e1\5x="+
		"\2\u05dd\u05de\7B\2\2\u05de\u05e0\5x=\2\u05df\u05dd\3\2\2\2\u05e0\u05e3"+
		"\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u0107\3\2\2\2\u05e3"+
		"\u05e1\3\2\2\2\u05e4\u05e6\7=\2\2\u05e5\u05e7\5\u010a\u0086\2\u05e6\u05e5"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7>\2\2\u05e9"+
		"\u0109\3\2\2\2\u05ea\u05ee\5\u010c\u0087\2\u05eb\u05ed\5\u010c\u0087\2"+
		"\u05ec\u05eb\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u010b\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f5\5\u010e\u0088"+
		"\2\u05f2\u05f5\5R*\2\u05f3\u05f5\5\u0112\u008a\2\u05f4\u05f1\3\2\2\2\u05f4"+
		"\u05f2\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5\u010d\3\2\2\2\u05f6\u05f7\5\u0110"+
		"\u0089\2\u05f7\u05f8\7A\2\2\u05f8\u010f\3\2\2\2\u05f9\u05fb\5\u00a8U\2"+
		"\u05fa\u05f9\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd"+
		"\3\2\2\2\u05fd\u05ff\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\5z>\2\u0600"+
		"\u0601\5r:\2\u0601\u0111\3\2\2\2\u0602\u0609\5\u0116\u008c\2\u0603\u0609"+
		"\5\u011a\u008e\2\u0604\u0609\5\u0122\u0092\2\u0605\u0609\5\u0124\u0093"+
		"\2\u0606\u0609\5\u0136\u009c\2\u0607\u0609\5\u013c\u009f\2\u0608\u0602"+
		"\3\2\2\2\u0608\u0603\3\2\2\2\u0608\u0604\3\2\2\2\u0608\u0605\3\2\2\2\u0608"+
		"\u0606\3\2\2\2\u0608\u0607\3\2\2\2\u0609\u0113\3\2\2\2\u060a\u0610\5\u0116"+
		"\u008c\2\u060b\u0610\5\u011c\u008f\2\u060c\u0610\5\u0126\u0094\2\u060d"+
		"\u0610\5\u0138\u009d\2\u060e\u0610\5\u013e\u00a0\2\u060f\u060a\3\2\2\2"+
		"\u060f\u060b\3\2\2\2\u060f\u060c\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u060e"+
		"\3\2\2\2\u0610\u0115\3\2\2\2\u0611\u061e\5\u0108\u0085\2\u0612\u061e\5"+
		"\u0118\u008d\2\u0613\u061e\5\u011e\u0090\2\u0614\u061e\5\u0128\u0095\2"+
		"\u0615\u061e\5\u012a\u0096\2\u0616\u061e\5\u013a\u009e\2\u0617\u061e\5"+
		"\u014e\u00a8\2\u0618\u061e\5\u0150\u00a9\2\u0619\u061e\5\u0152\u00aa\2"+
		"\u061a\u061e\5\u0156\u00ac\2\u061b\u061e\5\u0154\u00ab\2\u061c\u061e\5"+
		"\u0158\u00ad\2\u061d\u0611\3\2\2\2\u061d\u0612\3\2\2\2\u061d\u0613\3\2"+
		"\2\2\u061d\u0614\3\2\2\2\u061d\u0615\3\2\2\2\u061d\u0616\3\2\2\2\u061d"+
		"\u0617\3\2\2\2\u061d\u0618\3\2\2\2\u061d\u0619\3\2\2\2\u061d\u061a\3\2"+
		"\2\2\u061d\u061b\3\2\2\2\u061d\u061c\3\2\2\2\u061e\u0117\3\2\2\2\u061f"+
		"\u0620\7A\2\2\u0620\u0119\3\2\2\2\u0621\u0622\7h\2\2\u0622\u0623\7J\2"+
		"\2\u0623\u0624\5\u0112\u008a\2\u0624\u011b\3\2\2\2\u0625\u0626\7h\2\2"+
		"\u0626\u0627\7J\2\2\u0627\u0628\5\u0114\u008b\2\u0628\u011d\3\2\2\2\u0629"+
		"\u062a\5\u0120\u0091\2\u062a\u062b\7A\2\2\u062b\u011f\3\2\2\2\u062c\u0634"+
		"\5\u01b6\u00dc\2\u062d\u0634\5\u01d4\u00eb\2\u062e\u0634\5\u01d6\u00ec"+
		"\2\u062f\u0634\5\u01dc\u00ef\2\u0630\u0634\5\u01e0\u00f1\2\u0631\u0634"+
		"\5\u0194\u00cb\2\u0632\u0634\5\u0180\u00c1\2\u0633\u062c\3\2\2\2\u0633"+
		"\u062d\3\2\2\2\u0633\u062e\3\2\2\2\u0633\u062f\3\2\2\2\u0633\u0630\3\2"+
		"\2\2\u0633\u0631\3\2\2\2\u0633\u0632\3\2\2\2\u0634\u0121\3\2\2\2\u0635"+
		"\u0636\7\30\2\2\u0636\u0637\7;\2\2\u0637\u0638\5\u01aa\u00d6\2\u0638\u0639"+
		"\7<\2\2\u0639\u063a\5\u0112\u008a\2\u063a\u0123\3\2\2\2\u063b\u063c\7"+
		"\30\2\2\u063c\u063d\7;\2\2\u063d\u063e\5\u01aa\u00d6\2\u063e\u063f\7<"+
		"\2\2\u063f\u0640\5\u0114\u008b\2\u0640\u0641\7\21\2\2\u0641\u0642\5\u0112"+
		"\u008a\2\u0642\u0125\3\2\2\2\u0643\u0644\7\30\2\2\u0644\u0645\7;\2\2\u0645"+
		"\u0646\5\u01aa\u00d6\2\u0646\u0647\7<\2\2\u0647\u0648\5\u0114\u008b\2"+
		"\u0648\u0649\7\21\2\2\u0649\u064a\5\u0114\u008b\2\u064a\u0127\3\2\2\2"+
		"\u064b\u064c\7\4\2\2\u064c\u064d\5\u01aa\u00d6\2\u064d\u064e\7A\2\2\u064e"+
		"\u0656\3\2\2\2\u064f\u0650\7\4\2\2\u0650\u0651\5\u01aa\u00d6\2\u0651\u0652"+
		"\7J\2\2\u0652\u0653\5\u01aa\u00d6\2\u0653\u0654\7A\2\2\u0654\u0656\3\2"+
		"\2\2\u0655\u064b\3\2\2\2\u0655\u064f\3\2\2\2\u0656\u0129\3\2\2\2\u0657"+
		"\u0658\7+\2\2\u0658\u0659\7;\2\2\u0659\u065a\5\u01aa\u00d6\2\u065a\u065b"+
		"\7<\2\2\u065b\u065c\5\u012c\u0097\2\u065c\u012b\3\2\2\2\u065d\u0661\7"+
		"=\2\2\u065e\u0660\5\u012e\u0098\2\u065f\u065e\3\2\2\2\u0660\u0663\3\2"+
		"\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0667\3\2\2\2\u0663"+
		"\u0661\3\2\2\2\u0664\u0666\5\u0132\u009a\2\u0665\u0664\3\2\2\2\u0666\u0669"+
		"\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066a\3\2\2\2\u0669"+
		"\u0667\3\2\2\2\u066a\u066b\7>\2\2\u066b\u012d\3\2\2\2\u066c\u066d\5\u0130"+
		"\u0099\2\u066d\u066e\5\u010a\u0086\2\u066e\u012f\3\2\2\2\u066f\u0673\5"+
		"\u0132\u009a\2\u0670\u0672\5\u0132\u009a\2\u0671\u0670\3\2\2\2\u0672\u0675"+
		"\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0131\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0676\u0677\7\b\2\2\u0677\u0678\5\u01a8\u00d5\2\u0678\u0679"+
		"\7J\2\2\u0679\u0681\3\2\2\2\u067a\u067b\7\b\2\2\u067b\u067c\5\u0134\u009b"+
		"\2\u067c\u067d\7J\2\2\u067d\u0681\3\2\2\2\u067e\u067f\7\16\2\2\u067f\u0681"+
		"\7J\2\2\u0680\u0676\3\2\2\2\u0680\u067a\3\2\2\2\u0680\u067e\3\2\2\2\u0681"+
		"\u0133\3\2\2\2\u0682\u0683\7h\2\2\u0683\u0135\3\2\2\2\u0684\u0685\7\64"+
		"\2\2\u0685\u0686\7;\2\2\u0686\u0687\5\u01aa\u00d6\2\u0687\u0688\7<\2\2"+
		"\u0688\u0689\5\u0112\u008a\2\u0689\u0137\3\2\2\2\u068a\u068b\7\64\2\2"+
		"\u068b\u068c\7;\2\2\u068c\u068d\5\u01aa\u00d6\2\u068d\u068e\7<\2\2\u068e"+
		"\u068f\5\u0114\u008b\2\u068f\u0139\3\2\2\2\u0690\u0691\7\17\2\2\u0691"+
		"\u0692\5\u0112\u008a\2\u0692\u0693\7\64\2\2\u0693\u0694\7;\2\2\u0694\u0695"+
		"\5\u01aa\u00d6\2\u0695\u0696\7<\2\2\u0696\u0697\7A\2\2\u0697\u013b\3\2"+
		"\2\2\u0698\u069b\5\u0140\u00a1\2\u0699\u069b\5\u014a\u00a6\2\u069a\u0698"+
		"\3\2\2\2\u069a\u0699\3\2\2\2\u069b\u013d\3\2\2\2\u069c\u069f\5\u0142\u00a2"+
		"\2\u069d\u069f\5\u014c\u00a7\2\u069e\u069c\3\2\2\2\u069e\u069d\3\2\2\2"+
		"\u069f\u013f\3\2\2\2\u06a0\u06a1\7\27\2\2\u06a1\u06a3\7;\2\2\u06a2\u06a4"+
		"\5\u0144\u00a3\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3"+
		"\2\2\2\u06a5\u06a7\7A\2\2\u06a6\u06a8\5\u01aa\u00d6\2\u06a7\u06a6\3\2"+
		"\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\7A\2\2\u06aa"+
		"\u06ac\5\u0146\u00a4\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad"+
		"\3\2\2\2\u06ad\u06ae\7<\2\2\u06ae\u06af\5\u0112\u008a\2\u06af\u0141\3"+
		"\2\2\2\u06b0\u06b1\7\27\2\2\u06b1\u06b3\7;\2\2\u06b2\u06b4\5\u0144\u00a3"+
		"\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7"+
		"\7A\2\2\u06b6\u06b8\5\u01aa\u00d6\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3"+
		"\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\7A\2\2\u06ba\u06bc\5\u0146\u00a4"+
		"\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be"+
		"\7<\2\2\u06be\u06bf\5\u0114\u008b\2\u06bf\u0143\3\2\2\2\u06c0\u06c3\5"+
		"\u0148\u00a5\2\u06c1\u06c3\5\u0110\u0089\2\u06c2\u06c0\3\2\2\2\u06c2\u06c1"+
		"\3\2\2\2\u06c3\u0145\3\2\2\2\u06c4\u06c5\5\u0148\u00a5\2\u06c5\u0147\3"+
		"\2\2\2\u06c6\u06cb\5\u0120\u0091\2\u06c7\u06c8\7B\2\2\u06c8\u06ca\5\u0120"+
		"\u0091\2\u06c9\u06c7\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb"+
		"\u06cc\3\2\2\2\u06cc\u0149\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06cf\7\27"+
		"\2\2\u06cf\u06d3\7;\2\2\u06d0\u06d2\5\u00a8U\2\u06d1\u06d0\3\2\2\2\u06d2"+
		"\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2"+
		"\2\2\u06d5\u06d3\3\2\2\2\u06d6\u06d7\5z>\2\u06d7\u06d8\5v<\2\u06d8\u06d9"+
		"\7J\2\2\u06d9\u06da\5\u01aa\u00d6\2\u06da\u06db\7<\2\2\u06db\u06dc\5\u0112"+
		"\u008a\2\u06dc\u014b\3\2\2\2\u06dd\u06de\7\27\2\2\u06de\u06e2\7;\2\2\u06df"+
		"\u06e1\5\u00a8U\2\u06e0\u06df\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0"+
		"\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5"+
		"\u06e6\5z>\2\u06e6\u06e7\5v<\2\u06e7\u06e8\7J\2\2\u06e8\u06e9\5\u01aa"+
		"\u00d6\2\u06e9\u06ea\7<\2\2\u06ea\u06eb\5\u0114\u008b\2\u06eb\u014d\3"+
		"\2\2\2\u06ec\u06ee\7\6\2\2\u06ed\u06ef\7h\2\2\u06ee\u06ed\3\2\2\2\u06ee"+
		"\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\7A\2\2\u06f1\u014f\3\2"+
		"\2\2\u06f2\u06f4\7\r\2\2\u06f3\u06f5\7h\2\2\u06f4\u06f3\3\2\2\2\u06f4"+
		"\u06f5\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f7\7A\2\2\u06f7\u0151\3\2"+
		"\2\2\u06f8\u06fa\7&\2\2\u06f9\u06fb\5\u01aa\u00d6\2\u06fa\u06f9\3\2\2"+
		"\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fd\7A\2\2\u06fd\u0153"+
		"\3\2\2\2\u06fe\u06ff\7.\2\2\u06ff\u0700\5\u01aa\u00d6\2\u0700\u0701\7"+
		"A\2\2\u0701\u0155\3\2\2\2\u0702\u0703\7,\2\2\u0703\u0704\7;\2\2\u0704"+
		"\u0705\5\u01aa\u00d6\2\u0705\u0706\7<\2\2\u0706\u0707\5\u0108\u0085\2"+
		"\u0707\u0157\3\2\2\2\u0708\u0709\7\61\2\2\u0709\u070a\5\u0108\u0085\2"+
		"\u070a\u070b\5\u015a\u00ae\2\u070b\u0715\3\2\2\2\u070c\u070d\7\61\2\2"+
		"\u070d\u070f\5\u0108\u0085\2\u070e\u0710\5\u015a\u00ae\2\u070f\u070e\3"+
		"\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\5\u0162\u00b2"+
		"\2\u0712\u0715\3\2\2\2\u0713\u0715\5\u0164\u00b3\2\u0714\u0708\3\2\2\2"+
		"\u0714\u070c\3\2\2\2\u0714\u0713\3\2\2\2\u0715\u0159\3\2\2\2\u0716\u071a"+
		"\5\u015c\u00af\2\u0717\u0719\5\u015c\u00af\2\u0718\u0717\3\2\2\2\u0719"+
		"\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u015b\3\2"+
		"\2\2\u071c\u071a\3\2\2\2\u071d\u071e\7\t\2\2\u071e\u071f\7;\2\2\u071f"+
		"\u0720\5\u015e\u00b0\2\u0720\u0721\7<\2\2\u0721\u0722\5\u0108\u0085\2"+
		"\u0722\u015d\3\2\2\2\u0723\u0725\5\u00a8U\2\u0724\u0723\3\2\2\2\u0725"+
		"\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0729\3\2"+
		"\2\2\u0728\u0726\3\2\2\2\u0729\u072a\5\u0160\u00b1\2\u072a\u072b\5v<\2"+
		"\u072b\u015f\3\2\2\2\u072c\u0731\5\u0082B\2\u072d\u072e\7X\2\2\u072e\u0730"+
		"\5\22\n\2\u072f\u072d\3\2\2\2\u0730\u0733\3\2\2\2\u0731\u072f\3\2\2\2"+
		"\u0731\u0732\3\2\2\2\u0732\u0161\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u0735"+
		"\7\25\2\2\u0735\u0736\5\u0108\u0085\2\u0736\u0163\3\2\2\2\u0737\u0738"+
		"\7\61\2\2\u0738\u0739\5\u0166\u00b4\2\u0739\u073b\5\u0108\u0085\2\u073a"+
		"\u073c\5\u015a\u00ae\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073e"+
		"\3\2\2\2\u073d\u073f\5\u0162\u00b2\2\u073e\u073d\3\2\2\2\u073e\u073f\3"+
		"\2\2\2\u073f\u0165\3\2\2\2\u0740\u0741\7;\2\2\u0741\u0743\5\u0168\u00b5"+
		"\2\u0742\u0744\7A\2\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745"+
		"\3\2\2\2\u0745\u0746\7<\2\2\u0746\u0167\3\2\2\2\u0747\u074c\5\u016a\u00b6"+
		"\2\u0748\u0749\7A\2\2\u0749\u074b\5\u016a\u00b6\2\u074a\u0748\3\2\2\2"+
		"\u074b\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0169"+
		"\3\2\2\2\u074e\u074c\3\2\2\2\u074f\u0751\5\u00a8U\2\u0750\u074f\3\2\2"+
		"\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755"+
		"\3\2\2\2\u0754\u0752\3\2\2\2\u0755\u0756\5z>\2\u0756\u0757\5v<\2\u0757"+
		"\u0758\7D\2\2\u0758\u0759\5\u01aa\u00d6\2\u0759\u016b\3\2\2\2\u075a\u075d"+
		"\5\u017a\u00be\2\u075b\u075d\5\u01a2\u00d2\2\u075c\u075a\3\2\2\2\u075c"+
		"\u075b\3\2\2\2\u075d\u0761\3\2\2\2\u075e\u0760\5\u0174\u00bb\2\u075f\u075e"+
		"\3\2\2\2\u0760\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0762\3\2\2\2\u0762"+
		"\u016d\3\2\2\2\u0763\u0761\3\2\2\2\u0764\u0782\5\2\2\2\u0765\u076a\58"+
		"\35\2\u0766\u0767\7?\2\2\u0767\u0769\7@\2\2\u0768\u0766\3\2\2\2\u0769"+
		"\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2"+
		"\2\2\u076c\u076a\3\2\2\2\u076d\u076e\7C\2\2\u076e\u076f\7\13\2\2\u076f"+
		"\u0782\3\2\2\2\u0770\u0771\7\62\2\2\u0771\u0772\7C\2\2\u0772\u0782\7\13"+
		"\2\2\u0773\u0782\7-\2\2\u0774\u0775\58\35\2\u0775\u0776\7C\2\2\u0776\u0777"+
		"\7-\2\2\u0777\u0782\3\2\2\2\u0778\u0779\7;\2\2\u0779\u077a\5\u01aa\u00d6"+
		"\2\u077a\u077b\7<\2\2\u077b\u0782\3\2\2\2\u077c\u0782\5\u0180\u00c1\2"+
		"\u077d\u0782\5\u0188\u00c5\2\u077e\u0782\5\u018e\u00c8\2\u077f\u0782\5"+
		"\u0194\u00cb\2\u0780\u0782\5\u019c\u00cf\2\u0781\u0764\3\2\2\2\u0781\u0765"+
		"\3\2\2\2\u0781\u0770\3\2\2\2\u0781\u0773\3\2\2\2\u0781\u0774\3\2\2\2\u0781"+
		"\u0778\3\2\2\2\u0781\u077c\3\2\2\2\u0781\u077d\3\2\2\2\u0781\u077e\3\2"+
		"\2\2\u0781\u077f\3\2\2\2\u0781\u0780\3\2\2\2\u0782\u016f\3\2\2\2\u0783"+
		"\u0784\3\2\2\2\u0784\u0171\3\2\2\2\u0785\u07a2\5\2\2\2\u0786\u078b\58"+
		"\35\2\u0787\u0788\7?\2\2\u0788\u078a\7@\2\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2"+
		"\2\2\u078d\u078b\3\2\2\2\u078e\u078f\7C\2\2\u078f\u0790\7\13\2\2\u0790"+
		"\u07a2\3\2\2\2\u0791\u0792\7\62\2\2\u0792\u0793\7C\2\2\u0793\u07a2\7\13"+
		"\2\2\u0794\u07a2\7-\2\2\u0795\u0796\58\35\2\u0796\u0797\7C\2\2\u0797\u0798"+
		"\7-\2\2\u0798\u07a2\3\2\2\2\u0799\u079a\7;\2\2\u079a\u079b\5\u01aa\u00d6"+
		"\2\u079b\u079c\7<\2\2\u079c\u07a2\3\2\2\2\u079d\u07a2\5\u0180\u00c1\2"+
		"\u079e\u07a2\5\u0188\u00c5\2\u079f\u07a2\5\u0194\u00cb\2\u07a0\u07a2\5"+
		"\u019c\u00cf\2\u07a1\u0785\3\2\2\2\u07a1\u0786\3\2\2\2\u07a1\u0791\3\2"+
		"\2\2\u07a1\u0794\3\2\2\2\u07a1\u0795\3\2\2\2\u07a1\u0799\3\2\2\2\u07a1"+
		"\u079d\3\2\2\2\u07a1\u079e\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a0\3\2"+
		"\2\2\u07a2\u0173\3\2\2\2\u07a3\u07a9\5\u0182\u00c2\2\u07a4\u07a9\5\u018a"+
		"\u00c6\2\u07a5\u07a9\5\u0190\u00c9\2\u07a6\u07a9\5\u0196\u00cc\2\u07a7"+
		"\u07a9\5\u019e\u00d0\2\u07a8\u07a3\3\2\2\2\u07a8\u07a4\3\2\2\2\u07a8\u07a5"+
		"\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a7\3\2\2\2\u07a9\u0175\3\2\2\2\u07aa"+
		"\u07ab\3\2\2\2\u07ab\u0177\3\2\2\2\u07ac\u07b1\5\u0182\u00c2\2\u07ad\u07b1"+
		"\5\u018a\u00c6\2\u07ae\u07b1\5\u0196\u00cc\2\u07af\u07b1\5\u019e\u00d0"+
		"\2\u07b0\u07ac\3\2\2\2\u07b0\u07ad\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07af"+
		"\3\2\2\2\u07b1\u0179\3\2\2\2\u07b2\u07db\5\2\2\2\u07b3\u07b8\58\35\2\u07b4"+
		"\u07b5\7?\2\2\u07b5\u07b7\7@\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07ba\3\2\2"+
		"\2\u07b8\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07bb\3\2\2\2\u07ba\u07b8"+
		"\3\2\2\2\u07bb\u07bc\7C\2\2\u07bc\u07bd\7\13\2\2\u07bd\u07db\3\2\2\2\u07be"+
		"\u07c3\5|?\2\u07bf\u07c0\7?\2\2\u07c0\u07c2\7@\2\2\u07c1\u07bf\3\2\2\2"+
		"\u07c2\u07c5\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c6"+
		"\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c7\7C\2\2\u07c7\u07c8\7\13\2\2\u07c8"+
		"\u07db\3\2\2\2\u07c9\u07ca\7\62\2\2\u07ca\u07cb\7C\2\2\u07cb\u07db\7\13"+
		"\2\2\u07cc\u07db\7-\2\2\u07cd\u07ce\58\35\2\u07ce\u07cf\7C\2\2\u07cf\u07d0"+
		"\7-\2\2\u07d0\u07db\3\2\2\2\u07d1\u07d2\7;\2\2\u07d2\u07d3\5\u01aa\u00d6"+
		"\2\u07d3\u07d4\7<\2\2\u07d4\u07db\3\2\2\2\u07d5\u07db\5\u0184\u00c3\2"+
		"\u07d6\u07db\5\u018c\u00c7\2\u07d7\u07db\5\u0192\u00ca\2\u07d8\u07db\5"+
		"\u0198\u00cd\2\u07d9\u07db\5\u01a0\u00d1\2\u07da\u07b2\3\2\2\2\u07da\u07b3"+
		"\3\2\2\2\u07da\u07be\3\2\2\2\u07da\u07c9\3\2\2\2\u07da\u07cc\3\2\2\2\u07da"+
		"\u07cd\3\2\2\2\u07da\u07d1\3\2\2\2\u07da\u07d5\3\2\2\2\u07da\u07d6\3\2"+
		"\2\2\u07da\u07d7\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07d9\3\2\2\2\u07db"+
		"\u017b\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u017d\3\2\2\2\u07de\u0806\5\2"+
		"\2\2\u07df\u07e4\58\35\2\u07e0\u07e1\7?\2\2\u07e1\u07e3\7@\2\2\u07e2\u07e0"+
		"\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5"+
		"\u07e7\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e7\u07e8\7C\2\2\u07e8\u07e9\7\13"+
		"\2\2\u07e9\u0806\3\2\2\2\u07ea\u07ef\5|?\2\u07eb\u07ec\7?\2\2\u07ec\u07ee"+
		"\7@\2\2\u07ed\u07eb\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef"+
		"\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f3\7C"+
		"\2\2\u07f3\u07f4\7\13\2\2\u07f4\u0806\3\2\2\2\u07f5\u07f6\7\62\2\2\u07f6"+
		"\u07f7\7C\2\2\u07f7\u0806\7\13\2\2\u07f8\u0806\7-\2\2\u07f9\u07fa\58\35"+
		"\2\u07fa\u07fb\7C\2\2\u07fb\u07fc\7-\2\2\u07fc\u0806\3\2\2\2\u07fd\u07fe"+
		"\7;\2\2\u07fe\u07ff\5\u01aa\u00d6\2\u07ff\u0800\7<\2\2\u0800\u0806\3\2"+
		"\2\2\u0801\u0806\5\u0184\u00c3\2\u0802\u0806\5\u018c\u00c7\2\u0803\u0806"+
		"\5\u0198\u00cd\2\u0804\u0806\5\u01a0\u00d1\2\u0805\u07de\3\2\2\2\u0805"+
		"\u07df\3\2\2\2\u0805\u07ea\3\2\2\2\u0805\u07f5\3\2\2\2\u0805\u07f8\3\2"+
		"\2\2\u0805\u07f9\3\2\2\2\u0805\u07fd\3\2\2\2\u0805\u0801\3\2\2\2\u0805"+
		"\u0802\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0804\3\2\2\2\u0806\u017f\3\2"+
		"\2\2\u0807\u0809\7!\2\2\u0808\u080a\5,\27\2\u0809\u0808\3\2\2\2\u0809"+
		"\u080a\3\2\2\2\u080a\u080e\3\2\2\2\u080b\u080d\5\u00f2z\2\u080c\u080b"+
		"\3\2\2\2\u080d\u0810\3\2\2\2\u080e\u080c\3\2\2\2\u080e\u080f\3\2\2\2\u080f"+
		"\u0811\3\2\2\2\u0810\u080e\3\2\2\2\u0811\u081c\7h\2\2\u0812\u0816\7C\2"+
		"\2\u0813\u0815\5\u00f2z\2\u0814\u0813\3\2\2\2\u0815\u0818\3\2\2\2\u0816"+
		"\u0814\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818\u0816\3\2"+
		"\2\2\u0819\u081b\7h\2\2\u081a\u0812\3\2\2\2\u081b\u081e\3\2\2\2\u081c"+
		"\u081a\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u0820\3\2\2\2\u081e\u081c\3\2"+
		"\2\2\u081f\u0821\5\u0186\u00c4\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2"+
		"\2\u0821\u0822\3\2\2\2\u0822\u0824\7;\2\2\u0823\u0825\5\u019a\u00ce\2"+
		"\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828"+
		"\7<\2\2\u0827\u0829\5f\64\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829"+
		"\u085b\3\2\2\2\u082a\u082b\5<\37\2\u082b\u082c\7C\2\2\u082c\u082e\7!\2"+
		"\2\u082d\u082f\5,\27\2\u082e\u082d\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0833"+
		"\3\2\2\2\u0830\u0832\5\u00f2z\2\u0831\u0830\3\2\2\2\u0832\u0835\3\2\2"+
		"\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0836\3\2\2\2\u0835\u0833"+
		"\3\2\2\2\u0836\u0838\7h\2\2\u0837\u0839\5\u0186\u00c4\2\u0838\u0837\3"+
		"\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\7;\2\2\u083b"+
		"\u083d\5\u019a\u00ce\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083e"+
		"\3\2\2\2\u083e\u0840\7<\2\2\u083f\u0841\5f\64\2\u0840\u083f\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u085b\3\2\2\2\u0842\u0843\5\u016c\u00b7\2\u0843\u0844"+
		"\7C\2\2\u0844\u0846\7!\2\2\u0845\u0847\5,\27\2\u0846\u0845\3\2\2\2\u0846"+
		"\u0847\3\2\2\2\u0847\u084b\3\2\2\2\u0848\u084a\5\u00f2z\2\u0849\u0848"+
		"\3\2\2\2\u084a\u084d\3\2\2\2\u084b\u0849\3\2\2\2\u084b\u084c\3\2\2\2\u084c"+
		"\u084e\3\2\2\2\u084d\u084b\3\2\2\2\u084e\u0850\7h\2\2\u084f\u0851\5\u0186"+
		"\u00c4\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2\2\2\u0852"+
		"\u0854\7;\2\2\u0853\u0855\5\u019a\u00ce\2\u0854\u0853\3\2\2\2\u0854\u0855"+
		"\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\7<\2\2\u0857\u0859\5f\64\2\u0858"+
		"\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085b\3\2\2\2\u085a\u0807\3\2"+
		"\2\2\u085a\u082a\3\2\2\2\u085a\u0842\3\2\2\2\u085b\u0181\3\2\2\2\u085c"+
		"\u085d\7C\2\2\u085d\u085f\7!\2\2\u085e\u0860\5,\27\2\u085f\u085e\3\2\2"+
		"\2\u085f\u0860\3\2\2\2\u0860\u0864\3\2\2\2\u0861\u0863\5\u00f2z\2\u0862"+
		"\u0861\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2"+
		"\2\2\u0865\u0867\3\2\2\2\u0866\u0864\3\2\2\2\u0867\u0869\7h\2\2\u0868"+
		"\u086a\5\u0186\u00c4\2\u0869\u0868\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u086b"+
		"\3\2\2\2\u086b\u086d\7;\2\2\u086c\u086e\5\u019a\u00ce\2\u086d\u086c\3"+
		"\2\2\2\u086d\u086e\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0871\7<\2\2\u0870"+
		"\u0872\5f\64\2\u0871\u0870\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0183\3\2"+
		"\2\2\u0873\u0875\7!\2\2\u0874\u0876\5,\27\2\u0875\u0874\3\2\2\2\u0875"+
		"\u0876\3\2\2\2\u0876\u087a\3\2\2\2\u0877\u0879\5\u00f2z\2\u0878\u0877"+
		"\3\2\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u087d\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u0888\7h\2\2\u087e\u0882\7C\2"+
		"\2\u087f\u0881\5\u00f2z\2\u0880\u087f\3\2\2\2\u0881\u0884\3\2\2\2\u0882"+
		"\u0880\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0885\3\2\2\2\u0884\u0882\3\2"+
		"\2\2\u0885\u0887\7h\2\2\u0886\u087e\3\2\2\2\u0887\u088a\3\2\2\2\u0888"+
		"\u0886\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888\3\2"+
		"\2\2\u088b\u088d\5\u0186\u00c4\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2"+
		"\2\u088d\u088e\3\2\2\2\u088e\u0890\7;\2\2\u088f\u0891\5\u019a\u00ce\2"+
		"\u0890\u088f\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0894"+
		"\7<\2\2\u0893\u0895\5f\64\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895"+
		"\u08af\3\2\2\2\u0896\u0897\5<\37\2\u0897\u0898\7C\2\2\u0898\u089a\7!\2"+
		"\2\u0899\u089b\5,\27\2\u089a\u0899\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089f"+
		"\3\2\2\2\u089c\u089e\5\u00f2z\2\u089d\u089c\3\2\2\2\u089e\u08a1\3\2\2"+
		"\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\3\2\2\2\u08a1\u089f"+
		"\3\2\2\2\u08a2\u08a4\7h\2\2\u08a3\u08a5\5\u0186\u00c4\2\u08a4\u08a3\3"+
		"\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a8\7;\2\2\u08a7"+
		"\u08a9\5\u019a\u00ce\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08aa"+
		"\3\2\2\2\u08aa\u08ac\7<\2\2\u08ab\u08ad\5f\64\2\u08ac\u08ab\3\2\2\2\u08ac"+
		"\u08ad\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae\u0873\3\2\2\2\u08ae\u0896\3\2"+
		"\2\2\u08af\u0185\3\2\2\2\u08b0\u08b4\5,\27\2\u08b1\u08b2\7F\2\2\u08b2"+
		"\u08b4\7E\2\2\u08b3\u08b0\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4\u0187\3\2"+
		"\2\2\u08b5\u08b6\5\u016c\u00b7\2\u08b6\u08b7\7C\2\2\u08b7\u08b8\7h\2\2"+
		"\u08b8\u08c3\3\2\2\2\u08b9\u08ba\7*\2\2\u08ba\u08bb\7C\2\2\u08bb\u08c3"+
		"\7h\2\2\u08bc\u08bd\58\35\2\u08bd\u08be\7C\2\2\u08be\u08bf\7*\2\2\u08bf"+
		"\u08c0\7C\2\2\u08c0\u08c1\7h\2\2\u08c1\u08c3\3\2\2\2\u08c2\u08b5\3\2\2"+
		"\2\u08c2\u08b9\3\2\2\2\u08c2\u08bc\3\2\2\2\u08c3\u0189\3\2\2\2\u08c4\u08c5"+
		"\7C\2\2\u08c5\u08c6\7h\2\2\u08c6\u018b\3\2\2\2\u08c7\u08c8\7*\2\2\u08c8"+
		"\u08c9\7C\2\2\u08c9\u08d1\7h\2\2\u08ca\u08cb\58\35\2\u08cb\u08cc\7C\2"+
		"\2\u08cc\u08cd\7*\2\2\u08cd\u08ce\7C\2\2\u08ce\u08cf\7h\2\2\u08cf\u08d1"+
		"\3\2\2\2\u08d0\u08c7\3\2\2\2\u08d0\u08ca\3\2\2\2\u08d1\u018d\3\2\2\2\u08d2"+
		"\u08d3\5<\37\2\u08d3\u08d4\7?\2\2\u08d4\u08d5\5\u01aa\u00d6\2\u08d5\u08d6"+
		"\7@\2\2\u08d6\u08dd\3\2\2\2\u08d7\u08d8\5\u0172\u00ba\2\u08d8\u08d9\7"+
		"?\2\2\u08d9\u08da\5\u01aa\u00d6\2\u08da\u08db\7@\2\2\u08db\u08dd\3\2\2"+
		"\2\u08dc\u08d2\3\2\2\2\u08dc\u08d7\3\2\2\2\u08dd\u08e5\3\2\2\2\u08de\u08df"+
		"\5\u0170\u00b9\2\u08df\u08e0\7?\2\2\u08e0\u08e1\5\u01aa\u00d6\2\u08e1"+
		"\u08e2\7@\2\2\u08e2\u08e4\3\2\2\2\u08e3\u08de\3\2\2\2\u08e4\u08e7\3\2"+
		"\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u018f\3\2\2\2\u08e7"+
		"\u08e5\3\2\2\2\u08e8\u08e9\5\u0178\u00bd\2\u08e9\u08ea\7?\2\2\u08ea\u08eb"+
		"\5\u01aa\u00d6\2\u08eb\u08ec\7@\2\2\u08ec\u08f4\3\2\2\2\u08ed\u08ee\5"+
		"\u0176\u00bc\2\u08ee\u08ef\7?\2\2\u08ef\u08f0\5\u01aa\u00d6\2\u08f0\u08f1"+
		"\7@\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08ed\3\2\2\2\u08f3\u08f6\3\2\2\2\u08f4"+
		"\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u0191\3\2\2\2\u08f6\u08f4\3\2"+
		"\2\2\u08f7\u08f8\5<\37\2\u08f8\u08f9\7?\2\2\u08f9\u08fa\5\u01aa\u00d6"+
		"\2\u08fa\u08fb\7@\2\2\u08fb\u0902\3\2\2\2\u08fc\u08fd\5\u017e\u00c0\2"+
		"\u08fd\u08fe\7?\2\2\u08fe\u08ff\5\u01aa\u00d6\2\u08ff\u0900\7@\2\2\u0900"+
		"\u0902\3\2\2\2\u0901\u08f7\3\2\2\2\u0901\u08fc\3\2\2\2\u0902\u090a\3\2"+
		"\2\2\u0903\u0904\5\u017c\u00bf\2\u0904\u0905\7?\2\2\u0905\u0906\5\u01aa"+
		"\u00d6\2\u0906\u0907\7@\2\2\u0907\u0909\3\2\2\2\u0908\u0903\3\2\2\2\u0909"+
		"\u090c\3\2\2\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u0193\3\2"+
		"\2\2\u090c\u090a\3\2\2\2\u090d\u090e\5\u009cO\2\u090e\u0910\7;\2\2\u090f"+
		"\u0911\5\u019a\u00ce\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912"+
		"\3\2\2\2\u0912\u0913\7<\2\2\u0913\u0952\3\2\2\2\u0914\u0915\58\35\2\u0915"+
		"\u0917\7C\2\2\u0916\u0918\5,\27\2\u0917\u0916\3\2\2\2\u0917\u0918\3\2"+
		"\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7h\2\2\u091a\u091c\7;\2\2\u091b\u091d"+
		"\5\u019a\u00ce\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u091e\3"+
		"\2\2\2\u091e\u091f\7<\2\2\u091f\u0952\3\2\2\2\u0920\u0921\5<\37\2\u0921"+
		"\u0923\7C\2\2\u0922\u0924\5,\27\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2"+
		"\2\2\u0924\u0925\3\2\2\2\u0925\u0926\7h\2\2\u0926\u0928\7;\2\2\u0927\u0929"+
		"\5\u019a\u00ce\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a\3"+
		"\2\2\2\u092a\u092b\7<\2\2\u092b\u0952\3\2\2\2\u092c\u092d\5\u016c\u00b7"+
		"\2\u092d\u092f\7C\2\2\u092e\u0930\5,\27\2\u092f\u092e\3\2\2\2\u092f\u0930"+
		"\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\7h\2\2\u0932\u0934\7;\2\2\u0933"+
		"\u0935\5\u019a\u00ce\2\u0934\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936"+
		"\3\2\2\2\u0936\u0937\7<\2\2\u0937\u0952\3\2\2\2\u0938\u0939\7*\2\2\u0939"+
		"\u093b\7C\2\2\u093a\u093c\5,\27\2\u093b\u093a\3\2\2\2\u093b\u093c\3\2"+
		"\2\2\u093c\u093d\3\2\2\2\u093d\u093e\7h\2\2\u093e\u0940\7;\2\2\u093f\u0941"+
		"\5\u019a\u00ce\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\3"+
		"\2\2\2\u0942\u0952\7<\2\2\u0943\u0944\58\35\2\u0944\u0945\7C\2\2\u0945"+
		"\u0946\7*\2\2\u0946\u0948\7C\2\2\u0947\u0949\5,\27\2\u0948\u0947\3\2\2"+
		"\2\u0948\u0949\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\7h\2\2\u094b\u094d"+
		"\7;\2\2\u094c\u094e\5\u019a\u00ce\2\u094d\u094c\3\2\2\2\u094d\u094e\3"+
		"\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7<\2\2\u0950\u0952\3\2\2\2\u0951"+
		"\u090d\3\2\2\2\u0951\u0914\3\2\2\2\u0951\u0920\3\2\2\2\u0951\u092c\3\2"+
		"\2\2\u0951\u0938\3\2\2\2\u0951\u0943\3\2\2\2\u0952\u0195\3\2\2\2\u0953"+
		"\u0955\7C\2\2\u0954\u0956\5,\27\2\u0955\u0954\3\2\2\2\u0955\u0956\3\2"+
		"\2\2\u0956\u0957\3\2\2\2\u0957\u0958\7h\2\2\u0958\u095a\7;\2\2\u0959\u095b"+
		"\5\u019a\u00ce\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c\3"+
		"\2\2\2\u095c\u095d\7<\2\2\u095d\u0197\3\2\2\2\u095e\u095f\5\u009cO\2\u095f"+
		"\u0961\7;\2\2\u0960\u0962\5\u019a\u00ce\2\u0961\u0960\3\2\2\2\u0961\u0962"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\7<\2\2\u0964\u0997\3\2\2\2\u0965"+
		"\u0966\58\35\2\u0966\u0968\7C\2\2\u0967\u0969\5,\27\2\u0968\u0967\3\2"+
		"\2\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096b\7h\2\2\u096b"+
		"\u096d\7;";
	private static final String _serializedATNSegment1 =
		"\2\2\u096c\u096e\5\u019a\u00ce\2\u096d\u096c\3\2\2\2\u096d\u096e\3\2\2"+
		"\2\u096e\u096f\3\2\2\2\u096f\u0970\7<\2\2\u0970\u0997\3\2\2\2\u0971\u0972"+
		"\5<\37\2\u0972\u0974\7C\2\2\u0973\u0975\5,\27\2\u0974\u0973\3\2\2\2\u0974"+
		"\u0975\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\7h\2\2\u0977\u0979\7;\2"+
		"\2\u0978\u097a\5\u019a\u00ce\2\u0979\u0978\3\2\2\2\u0979\u097a\3\2\2\2"+
		"\u097a\u097b\3\2\2\2\u097b\u097c\7<\2\2\u097c\u0997\3\2\2\2\u097d\u097e"+
		"\7*\2\2\u097e\u0980\7C\2\2\u097f\u0981\5,\27\2\u0980\u097f\3\2\2\2\u0980"+
		"\u0981\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\7h\2\2\u0983\u0985\7;\2"+
		"\2\u0984\u0986\5\u019a\u00ce\2\u0985\u0984\3\2\2\2\u0985\u0986\3\2\2\2"+
		"\u0986\u0987\3\2\2\2\u0987\u0997\7<\2\2\u0988\u0989\58\35\2\u0989\u098a"+
		"\7C\2\2\u098a\u098b\7*\2\2\u098b\u098d\7C\2\2\u098c\u098e\5,\27\2\u098d"+
		"\u098c\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990\7h"+
		"\2\2\u0990\u0992\7;\2\2\u0991\u0993\5\u019a\u00ce\2\u0992\u0991\3\2\2"+
		"\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0995\7<\2\2\u0995\u0997"+
		"\3\2\2\2\u0996\u095e\3\2\2\2\u0996\u0965\3\2\2\2\u0996\u0971\3\2\2\2\u0996"+
		"\u097d\3\2\2\2\u0996\u0988\3\2\2\2\u0997\u0199\3\2\2\2\u0998\u099d\5\u01aa"+
		"\u00d6\2\u0999\u099a\7B\2\2\u099a\u099c\5\u01aa\u00d6\2\u099b\u0999\3"+
		"\2\2\2\u099c\u099f\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e"+
		"\u019b\3\2\2\2\u099f\u099d\3\2\2\2\u09a0\u09a1\5<\37\2\u09a1\u09a3\7\\"+
		"\2\2\u09a2\u09a4\5,\27\2\u09a3\u09a2\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4"+
		"\u09a5\3\2\2\2\u09a5\u09a6\7h\2\2\u09a6\u09d0\3\2\2\2\u09a7\u09a8\5\16"+
		"\b\2\u09a8\u09aa\7\\\2\2\u09a9\u09ab\5,\27\2\u09aa\u09a9\3\2\2\2\u09aa"+
		"\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\7h\2\2\u09ad\u09d0\3\2"+
		"\2\2\u09ae\u09af\5\u016c\u00b7\2\u09af\u09b1\7\\\2\2\u09b0\u09b2\5,\27"+
		"\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4"+
		"\7h\2\2\u09b4\u09d0\3\2\2\2\u09b5\u09b6\7*\2\2\u09b6\u09b8\7\\\2\2\u09b7"+
		"\u09b9\5,\27\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2"+
		"\2\2\u09ba\u09d0\7h\2\2\u09bb\u09bc\58\35\2\u09bc\u09bd\7C\2\2\u09bd\u09be"+
		"\7*\2\2\u09be\u09c0\7\\\2\2\u09bf\u09c1\5,\27\2\u09c0\u09bf\3\2\2\2\u09c0"+
		"\u09c1\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\7h\2\2\u09c3\u09d0\3\2"+
		"\2\2\u09c4\u09c5\5\22\n\2\u09c5\u09c7\7\\\2\2\u09c6\u09c8\5,\27\2\u09c7"+
		"\u09c6\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\7!"+
		"\2\2\u09ca\u09d0\3\2\2\2\u09cb\u09cc\5 \21\2\u09cc\u09cd\7\\\2\2\u09cd"+
		"\u09ce\7!\2\2\u09ce\u09d0\3\2\2\2\u09cf\u09a0\3\2\2\2\u09cf\u09a7\3\2"+
		"\2\2\u09cf\u09ae\3\2\2\2\u09cf\u09b5\3\2\2\2\u09cf\u09bb\3\2\2\2\u09cf"+
		"\u09c4\3\2\2\2\u09cf\u09cb\3\2\2\2\u09d0\u019d\3\2\2\2\u09d1\u09d3\7\\"+
		"\2\2\u09d2\u09d4\5,\27\2\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4"+
		"\u09d5\3\2\2\2\u09d5\u09d6\7h\2\2\u09d6\u019f\3\2\2\2\u09d7\u09d8\5<\37"+
		"\2\u09d8\u09da\7\\\2\2\u09d9\u09db\5,\27\2\u09da\u09d9\3\2\2\2\u09da\u09db"+
		"\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09dd\7h\2\2\u09dd\u0a00\3\2\2\2\u09de"+
		"\u09df\5\16\b\2\u09df\u09e1\7\\\2\2\u09e0\u09e2\5,\27\2\u09e1\u09e0\3"+
		"\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\7h\2\2\u09e4"+
		"\u0a00\3\2\2\2\u09e5\u09e6\7*\2\2\u09e6\u09e8\7\\\2\2\u09e7\u09e9\5,\27"+
		"\2\u09e8\u09e7\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u0a00"+
		"\7h\2\2\u09eb\u09ec\58\35\2\u09ec\u09ed\7C\2\2\u09ed\u09ee\7*\2\2\u09ee"+
		"\u09f0\7\\\2\2\u09ef\u09f1\5,\27\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2"+
		"\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\7h\2\2\u09f3\u0a00\3\2\2\2\u09f4"+
		"\u09f5\5\22\n\2\u09f5\u09f7\7\\\2\2\u09f6\u09f8\5,\27\2\u09f7\u09f6\3"+
		"\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fa\7!\2\2\u09fa"+
		"\u0a00\3\2\2\2\u09fb\u09fc\5 \21\2\u09fc\u09fd\7\\\2\2\u09fd\u09fe\7!"+
		"\2\2\u09fe\u0a00\3\2\2\2\u09ff\u09d7\3\2\2\2\u09ff\u09de\3\2\2\2\u09ff"+
		"\u09e5\3\2\2\2\u09ff\u09eb\3\2\2\2\u09ff\u09f4\3\2\2\2\u09ff\u09fb\3\2"+
		"\2\2\u0a00\u01a1\3\2\2\2\u0a01\u0a02\7!\2\2\u0a02\u0a03\5\6\4\2\u0a03"+
		"\u0a05\5\u01a4\u00d3\2\u0a04\u0a06\5\"\22\2\u0a05\u0a04\3\2\2\2\u0a05"+
		"\u0a06\3\2\2\2\u0a06\u0a18\3\2\2\2\u0a07\u0a08\7!\2\2\u0a08\u0a09\5\20"+
		"\t\2\u0a09\u0a0b\5\u01a4\u00d3\2\u0a0a\u0a0c\5\"\22\2\u0a0b\u0a0a\3\2"+
		"\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a18\3\2\2\2\u0a0d\u0a0e\7!\2\2\u0a0e"+
		"\u0a0f\5\6\4\2\u0a0f\u0a10\5\"\22\2\u0a10\u0a11\5\u0104\u0083\2\u0a11"+
		"\u0a18\3\2\2\2\u0a12\u0a13\7!\2\2\u0a13\u0a14\5\20\t\2\u0a14\u0a15\5\""+
		"\22\2\u0a15\u0a16\5\u0104\u0083\2\u0a16\u0a18\3\2\2\2\u0a17\u0a01\3\2"+
		"\2\2\u0a17\u0a07\3\2\2\2\u0a17\u0a0d\3\2\2\2\u0a17\u0a12\3\2\2\2\u0a18"+
		"\u01a3\3\2\2\2\u0a19\u0a1d\5\u01a6\u00d4\2\u0a1a\u0a1c\5\u01a6\u00d4\2"+
		"\u0a1b\u0a1a\3\2\2\2\u0a1c\u0a1f\3\2\2\2\u0a1d\u0a1b\3\2\2\2\u0a1d\u0a1e"+
		"\3\2\2\2\u0a1e\u01a5\3\2\2\2\u0a1f\u0a1d\3\2\2\2\u0a20\u0a22\5\u00f2z"+
		"\2\u0a21\u0a20\3\2\2\2\u0a22\u0a25\3\2\2\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24"+
		"\3\2\2\2\u0a24\u0a26\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a26\u0a27\7?\2\2\u0a27"+
		"\u0a28\5\u01aa\u00d6\2\u0a28\u0a29\7@\2\2\u0a29\u01a7\3\2\2\2\u0a2a\u0a2b"+
		"\5\u01aa\u00d6\2\u0a2b\u01a9\3\2\2\2\u0a2c\u0a2f\5\u01ac\u00d7\2\u0a2d"+
		"\u0a2f\5\u01b4\u00db\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2d\3\2\2\2\u0a2f\u01ab"+
		"\3\2\2\2\u0a30\u0a31\5\u01ae\u00d8\2\u0a31\u0a32\7[\2\2\u0a32\u0a33\5"+
		"\u01b2\u00da\2\u0a33\u01ad\3\2\2\2\u0a34\u0a3f\7h\2\2\u0a35\u0a37\7;\2"+
		"\2\u0a36\u0a38\5\u009eP\2\u0a37\u0a36\3\2\2\2\u0a37\u0a38\3\2\2\2\u0a38"+
		"\u0a39\3\2\2\2\u0a39\u0a3f\7<\2\2\u0a3a\u0a3b\7;\2\2\u0a3b\u0a3c\5\u01b0"+
		"\u00d9\2\u0a3c\u0a3d\7<\2\2\u0a3d\u0a3f\3\2\2\2\u0a3e\u0a34\3\2\2\2\u0a3e"+
		"\u0a35\3\2\2\2\u0a3e\u0a3a\3\2\2\2\u0a3f\u01af\3\2\2\2\u0a40\u0a45\7h"+
		"\2\2\u0a41\u0a42\7B\2\2\u0a42\u0a44\7h\2\2\u0a43\u0a41\3\2\2\2\u0a44\u0a47"+
		"\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u01b1\3\2\2\2\u0a47"+
		"\u0a45\3\2\2\2\u0a48\u0a4b\5\u01aa\u00d6\2\u0a49\u0a4b\5\u0108\u0085\2"+
		"\u0a4a\u0a48\3\2\2\2\u0a4a\u0a49\3\2\2\2\u0a4b\u01b3\3\2\2\2\u0a4c\u0a4f"+
		"\5\u01bc\u00df\2\u0a4d\u0a4f\5\u01b6\u00dc\2\u0a4e\u0a4c\3\2\2\2\u0a4e"+
		"\u0a4d\3\2\2\2\u0a4f\u01b5\3\2\2\2\u0a50\u0a51\5\u01b8\u00dd\2\u0a51\u0a52"+
		"\5\u01ba\u00de\2\u0a52\u0a53\5\u01aa\u00d6\2\u0a53\u01b7\3\2\2\2\u0a54"+
		"\u0a58\5<\37\2\u0a55\u0a58\5\u0188\u00c5\2\u0a56\u0a58\5\u018e\u00c8\2"+
		"\u0a57\u0a54\3\2\2\2\u0a57\u0a55\3\2\2\2\u0a57\u0a56\3\2\2\2\u0a58\u01b9"+
		"\3\2\2\2\u0a59\u0a5a\t\5\2\2\u0a5a\u01bb\3\2\2\2\u0a5b\u0a63\5\u01be\u00e0"+
		"\2\u0a5c\u0a5d\5\u01be\u00e0\2\u0a5d\u0a5e\7I\2\2\u0a5e\u0a5f\5\u01aa"+
		"\u00d6\2\u0a5f\u0a60\7J\2\2\u0a60\u0a61\5\u01bc\u00df\2\u0a61\u0a63\3"+
		"\2\2\2\u0a62\u0a5b\3\2\2\2\u0a62\u0a5c\3\2\2\2\u0a63\u01bd\3\2\2\2\u0a64"+
		"\u0a65\b\u00e0\1\2\u0a65\u0a66\5\u01c0\u00e1\2\u0a66\u0a6c\3\2\2\2\u0a67"+
		"\u0a68\f\3\2\2\u0a68\u0a69\7P\2\2\u0a69\u0a6b\5\u01c0\u00e1\2\u0a6a\u0a67"+
		"\3\2\2\2\u0a6b\u0a6e\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d"+
		"\u01bf\3\2\2\2\u0a6e\u0a6c\3\2\2\2\u0a6f\u0a70\b\u00e1\1\2\u0a70\u0a71"+
		"\5\u01c2\u00e2\2\u0a71\u0a77\3\2\2\2\u0a72\u0a73\f\3\2\2\u0a73\u0a74\7"+
		"O\2\2\u0a74\u0a76\5\u01c2\u00e2\2\u0a75\u0a72\3\2\2\2\u0a76\u0a79\3\2"+
		"\2\2\u0a77\u0a75\3\2\2\2\u0a77\u0a78\3\2\2\2\u0a78\u01c1\3\2\2\2\u0a79"+
		"\u0a77\3\2\2\2\u0a7a\u0a7b\b\u00e2\1\2\u0a7b\u0a7c\5\u01c4\u00e3\2\u0a7c"+
		"\u0a82\3\2\2\2\u0a7d\u0a7e\f\3\2\2\u0a7e\u0a7f\7X\2\2\u0a7f\u0a81\5\u01c4"+
		"\u00e3\2\u0a80\u0a7d\3\2\2\2\u0a81\u0a84\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a82"+
		"\u0a83\3\2\2\2\u0a83\u01c3\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a85\u0a86\b\u00e3"+
		"\1\2\u0a86\u0a87\5\u01c6\u00e4\2\u0a87\u0a8d\3\2\2\2\u0a88\u0a89\f\3\2"+
		"\2\u0a89\u0a8a\7Y\2\2\u0a8a\u0a8c\5\u01c6\u00e4\2\u0a8b\u0a88\3\2\2\2"+
		"\u0a8c\u0a8f\3\2\2\2\u0a8d\u0a8b\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u01c5"+
		"\3\2\2\2\u0a8f\u0a8d\3\2\2\2\u0a90\u0a91\b\u00e4\1\2\u0a91\u0a92\5\u01c8"+
		"\u00e5\2\u0a92\u0a98\3\2\2\2\u0a93\u0a94\f\3\2\2\u0a94\u0a95\7W\2\2\u0a95"+
		"\u0a97\5\u01c8\u00e5\2\u0a96\u0a93\3\2\2\2\u0a97\u0a9a\3\2\2\2\u0a98\u0a96"+
		"\3\2\2\2\u0a98\u0a99\3\2\2\2\u0a99\u01c7\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9b"+
		"\u0a9c\b\u00e5\1\2\u0a9c\u0a9d\5\u01ca\u00e6\2\u0a9d\u0aa6\3\2\2\2\u0a9e"+
		"\u0a9f\f\4\2\2\u0a9f\u0aa0\7K\2\2\u0aa0\u0aa5\5\u01ca\u00e6\2\u0aa1\u0aa2"+
		"\f\3\2\2\u0aa2\u0aa3\7N\2\2\u0aa3\u0aa5\5\u01ca\u00e6\2\u0aa4\u0a9e\3"+
		"\2\2\2\u0aa4\u0aa1\3\2\2\2\u0aa5\u0aa8\3\2\2\2\u0aa6\u0aa4\3\2\2\2\u0aa6"+
		"\u0aa7\3\2\2\2\u0aa7\u01c9\3\2\2\2\u0aa8\u0aa6\3\2\2\2\u0aa9\u0aaa\b\u00e6"+
		"\1\2\u0aaa\u0aab\5\u01cc\u00e7\2\u0aab\u0abd\3\2\2\2\u0aac\u0aad\f\7\2"+
		"\2\u0aad\u0aae\7F\2\2\u0aae\u0abc\5\u01cc\u00e7\2\u0aaf\u0ab0\f\6\2\2"+
		"\u0ab0\u0ab1\7E\2\2\u0ab1\u0abc\5\u01cc\u00e7\2\u0ab2\u0ab3\f\5\2\2\u0ab3"+
		"\u0ab4\7L\2\2\u0ab4\u0abc\5\u01cc\u00e7\2\u0ab5\u0ab6\f\4\2\2\u0ab6\u0ab7"+
		"\7M\2\2\u0ab7\u0abc\5\u01cc\u00e7\2\u0ab8\u0ab9\f\3\2\2\u0ab9\u0aba\7"+
		"\34\2\2\u0aba\u0abc\5\16\b\2\u0abb\u0aac\3\2\2\2\u0abb\u0aaf\3\2\2\2\u0abb"+
		"\u0ab2\3\2\2\2\u0abb\u0ab5\3\2\2\2\u0abb\u0ab8\3\2\2\2\u0abc\u0abf\3\2"+
		"\2\2\u0abd\u0abb\3\2\2\2\u0abd\u0abe\3\2\2\2\u0abe\u01cb\3\2\2\2\u0abf"+
		"\u0abd\3\2\2\2\u0ac0\u0ac1\b\u00e7\1\2\u0ac1\u0ac2\5\u01ce\u00e8\2\u0ac2"+
		"\u0ad2\3\2\2\2\u0ac3\u0ac4\f\5\2\2\u0ac4\u0ac5\7F\2\2\u0ac5\u0ac6\7F\2"+
		"\2\u0ac6\u0ad1\5\u01ce\u00e8\2\u0ac7\u0ac8\f\4\2\2\u0ac8\u0ac9\7E\2\2"+
		"\u0ac9\u0aca\7E\2\2\u0aca\u0ad1\5\u01ce\u00e8\2\u0acb\u0acc\f\3\2\2\u0acc"+
		"\u0acd\7E\2\2\u0acd\u0ace\7E\2\2\u0ace\u0acf\7E\2\2\u0acf\u0ad1\5\u01ce"+
		"\u00e8\2\u0ad0\u0ac3\3\2\2\2\u0ad0\u0ac7\3\2\2\2\u0ad0\u0acb\3\2\2\2\u0ad1"+
		"\u0ad4\3\2\2\2\u0ad2\u0ad0\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u01cd\3\2"+
		"\2\2\u0ad4\u0ad2\3\2\2\2\u0ad5\u0ad6\b\u00e8\1\2\u0ad6\u0ad7\5\u01d0\u00e9"+
		"\2\u0ad7\u0ae0\3\2\2\2\u0ad8\u0ad9\f\4\2\2\u0ad9\u0ada\7S\2\2\u0ada\u0adf"+
		"\5\u01d0\u00e9\2\u0adb\u0adc\f\3\2\2\u0adc\u0add\7T\2\2\u0add\u0adf\5"+
		"\u01d0\u00e9\2\u0ade\u0ad8\3\2\2\2\u0ade\u0adb\3\2\2\2\u0adf\u0ae2\3\2"+
		"\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u01cf\3\2\2\2\u0ae2"+
		"\u0ae0\3\2\2\2\u0ae3\u0ae4\b\u00e9\1\2\u0ae4\u0ae5\5\u01d2\u00ea\2\u0ae5"+
		"\u0af1\3\2\2\2\u0ae6\u0ae7\f\5\2\2\u0ae7\u0ae8\7U\2\2\u0ae8\u0af0\5\u01d2"+
		"\u00ea\2\u0ae9\u0aea\f\4\2\2\u0aea\u0aeb\7V\2\2\u0aeb\u0af0\5\u01d2\u00ea"+
		"\2\u0aec\u0aed\f\3\2\2\u0aed\u0aee\7Z\2\2\u0aee\u0af0\5\u01d2\u00ea\2"+
		"\u0aef\u0ae6\3\2\2\2\u0aef\u0ae9\3\2\2\2\u0aef\u0aec\3\2\2\2\u0af0\u0af3"+
		"\3\2\2\2\u0af1\u0aef\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u01d1\3\2\2\2\u0af3"+
		"\u0af1\3\2\2\2\u0af4\u0afc\5\u01d4\u00eb\2\u0af5\u0afc\5\u01d6\u00ec\2"+
		"\u0af6\u0af7\7S\2\2\u0af7\u0afc\5\u01d2\u00ea\2\u0af8\u0af9\7T\2\2\u0af9"+
		"\u0afc\5\u01d2\u00ea\2\u0afa\u0afc\5\u01d8\u00ed\2\u0afb\u0af4\3\2\2\2"+
		"\u0afb\u0af5\3\2\2\2\u0afb\u0af6\3\2\2\2\u0afb\u0af8\3\2\2\2\u0afb\u0afa"+
		"\3\2\2\2\u0afc\u01d3\3\2\2\2\u0afd\u0afe\7Q\2\2\u0afe\u0aff\5\u01d2\u00ea"+
		"\2\u0aff\u01d5\3\2\2\2\u0b00\u0b01\7R\2\2\u0b01\u0b02\5\u01d2\u00ea\2"+
		"\u0b02\u01d7\3\2\2\2\u0b03\u0b0a\5\u01da\u00ee\2\u0b04\u0b05\7H\2\2\u0b05"+
		"\u0b0a\5\u01d2\u00ea\2\u0b06\u0b07\7G\2\2\u0b07\u0b0a\5\u01d2\u00ea\2"+
		"\u0b08\u0b0a\5\u01e4\u00f3\2\u0b09\u0b03\3\2\2\2\u0b09\u0b04\3\2\2\2\u0b09"+
		"\u0b06\3\2\2\2\u0b09\u0b08\3\2\2\2\u0b0a\u01d9\3\2\2\2\u0b0b\u0b0e\5\u016c"+
		"\u00b7\2\u0b0c\u0b0e\5<\37\2\u0b0d\u0b0b\3\2\2\2\u0b0d\u0b0c\3\2\2\2\u0b0e"+
		"\u0b13\3\2\2\2\u0b0f\u0b12\5\u01de\u00f0\2\u0b10\u0b12\5\u01e2\u00f2\2"+
		"\u0b11\u0b0f\3\2\2\2\u0b11\u0b10\3\2\2\2\u0b12\u0b15\3\2\2\2\u0b13\u0b11"+
		"\3\2\2\2\u0b13\u0b14\3\2\2\2\u0b14\u01db\3\2\2\2\u0b15\u0b13\3\2\2\2\u0b16"+
		"\u0b17\5\u01da\u00ee\2\u0b17\u0b18\7Q\2\2\u0b18\u01dd\3\2\2\2\u0b19\u0b1a"+
		"\7Q\2\2\u0b1a\u01df\3\2\2\2\u0b1b\u0b1c\5\u01da\u00ee\2\u0b1c\u0b1d\7"+
		"R\2\2\u0b1d\u01e1\3\2\2\2\u0b1e\u0b1f\7R\2\2\u0b1f\u01e3\3\2\2\2\u0b20"+
		"\u0b21\7;\2\2\u0b21\u0b22\5\6\4\2\u0b22\u0b23\7<\2\2\u0b23\u0b24\5\u01d2"+
		"\u00ea\2\u0b24\u0b3c\3\2\2\2\u0b25\u0b26\7;\2\2\u0b26\u0b2a\5\16\b\2\u0b27"+
		"\u0b29\5*\26\2\u0b28\u0b27\3\2\2\2\u0b29\u0b2c\3\2\2\2\u0b2a\u0b28\3\2"+
		"\2\2\u0b2a\u0b2b\3\2\2\2\u0b2b\u0b2d\3\2\2\2\u0b2c\u0b2a\3\2\2\2\u0b2d"+
		"\u0b2e\7<\2\2\u0b2e\u0b2f\5\u01d8\u00ed\2\u0b2f\u0b3c\3\2\2\2\u0b30\u0b31"+
		"\7;\2\2\u0b31\u0b35\5\16\b\2\u0b32\u0b34\5*\26\2\u0b33\u0b32\3\2\2\2\u0b34"+
		"\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b38\3\2"+
		"\2\2\u0b37\u0b35\3\2\2\2\u0b38\u0b39\7<\2\2\u0b39\u0b3a\5\u01ac\u00d7"+
		"\2\u0b3a\u0b3c\3\2\2\2\u0b3b\u0b20\3\2\2\2\u0b3b\u0b25\3\2\2\2\u0b3b\u0b30"+
		"\3\2\2\2\u0b3c\u01e5\3\2\2\2\u0147\u01ea\u01ef\u01f6\u01fa\u01fe\u0207"+
		"\u020b\u020f\u0211\u0217\u021c\u0223\u0228\u022a\u0230\u0235\u023a\u023f"+
		"\u024a\u0258\u025d\u0265\u026c\u0272\u0277\u0282\u0285\u0293\u0298\u029d"+
		"\u02a2\u02a8\u02b2\u02ba\u02c4\u02cc\u02d6\u02da\u02df\u02e5\u02eb\u02f4"+
		"\u02ff\u031c\u0320\u0326\u0329\u032c\u0335\u0340\u034b\u0359\u0360\u0369"+
		"\u0370\u037a\u0385\u038c\u0392\u0396\u039a\u039e\u03a2\u03a7\u03ab\u03af"+
		"\u03b1\u03b6\u03bd\u03c2\u03c4\u03ca\u03cf\u03d3\u03e6\u03eb\u03fb\u0400"+
		"\u0406\u040c\u040e\u0412\u0417\u041b\u0424\u042b\u0433\u0436\u043b\u0443"+
		"\u0449\u044e\u0455\u045c\u0461\u0467\u0473\u0478\u047c\u0486\u048b\u0493"+
		"\u0496\u049b\u04a3\u04a6\u04ab\u04b0\u04b5\u04ba\u04c1\u04c6\u04ce\u04d3"+
		"\u04d8\u04dd\u04e3\u04e9\u04ec\u04ef\u04f8\u04fe\u0504\u0507\u050a\u0512"+
		"\u0517\u051c\u0522\u0525\u0530\u0539\u0543\u0548\u0553\u0558\u0564\u0569"+
		"\u0575\u057f\u0584\u058c\u058f\u0596\u059e\u05a4\u05ad\u05b7\u05bb\u05be"+
		"\u05c7\u05d5\u05d8\u05e1\u05e6\u05ee\u05f4\u05fc\u0608\u060f\u061d\u0633"+
		"\u0655\u0661\u0667\u0673\u0680\u069a\u069e\u06a3\u06a7\u06ab\u06b3\u06b7"+
		"\u06bb\u06c2\u06cb\u06d3\u06e2\u06ee\u06f4\u06fa\u070f\u0714\u071a\u0726"+
		"\u0731\u073b\u073e\u0743\u074c\u0752\u075c\u0761\u076a\u0781\u078b\u07a1"+
		"\u07a8\u07b0\u07b8\u07c3\u07da\u07e4\u07ef\u0805\u0809\u080e\u0816\u081c"+
		"\u0820\u0824\u0828\u082e\u0833\u0838\u083c\u0840\u0846\u084b\u0850\u0854"+
		"\u0858\u085a\u085f\u0864\u0869\u086d\u0871\u0875\u087a\u0882\u0888\u088c"+
		"\u0890\u0894\u089a\u089f\u08a4\u08a8\u08ac\u08ae\u08b3\u08c2\u08d0\u08dc"+
		"\u08e5\u08f4\u0901\u090a\u0910\u0917\u091c\u0923\u0928\u092f\u0934\u093b"+
		"\u0940\u0948\u094d\u0951\u0955\u095a\u0961\u0968\u096d\u0974\u0979\u0980"+
		"\u0985\u098d\u0992\u0996\u099d\u09a3\u09aa\u09b1\u09b8\u09c0\u09c7\u09cf"+
		"\u09d3\u09da\u09e1\u09e8\u09f0\u09f7\u09ff\u0a05\u0a0b\u0a17\u0a1d\u0a23"+
		"\u0a2e\u0a37\u0a3e\u0a45\u0a4a\u0a4e\u0a57\u0a62\u0a6c\u0a77\u0a82\u0a8d"+
		"\u0a98\u0aa4\u0aa6\u0abb\u0abd\u0ad0\u0ad2\u0ade\u0ae0\u0aef\u0af1\u0afb"+
		"\u0b09\u0b0d\u0b11\u0b13\u0b2a\u0b35\u0b3b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
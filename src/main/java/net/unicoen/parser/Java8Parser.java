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
		RULE_literal = 0, RULE_integerLiteral = 1, RULE_floatingPointLiteral = 2, 
		RULE_booleanLiteral = 3, RULE_stringLiteral = 4, RULE_characterLiteral = 5, 
		RULE_nullLiteral = 6, RULE_type = 7, RULE_primitiveType = 8, RULE_numericType = 9, 
		RULE_integralType = 10, RULE_floatingPointType = 11, RULE_referenceType = 12, 
		RULE_classOrInterfaceType = 13, RULE_classType = 14, RULE_classType_lf_classOrInterfaceType = 15, 
		RULE_classType_lfno_classOrInterfaceType = 16, RULE_interfaceType = 17, 
		RULE_interfaceType_lf_classOrInterfaceType = 18, RULE_interfaceType_lfno_classOrInterfaceType = 19, 
		RULE_typeVariable = 20, RULE_arrayType = 21, RULE_dims = 22, RULE_typeParameter = 23, 
		RULE_typeParameterModifier = 24, RULE_typeBound = 25, RULE_additionalBound = 26, 
		RULE_typeArguments = 27, RULE_typeArgumentList = 28, RULE_typeArgument = 29, 
		RULE_wildcard = 30, RULE_wildcardBounds = 31, RULE_packageName = 32, RULE_typeName = 33, 
		RULE_packageOrTypeName = 34, RULE_expressionName = 35, RULE_ambiguousName = 36, 
		RULE_compilationUnit = 37, RULE_packageDeclaration = 38, RULE_packageModifier = 39, 
		RULE_importDeclaration = 40, RULE_singleTypeImportDeclaration = 41, RULE_typeImportOnDemandDeclaration = 42, 
		RULE_singleStaticImportDeclaration = 43, RULE_staticImportOnDemandDeclaration = 44, 
		RULE_typeDeclaration = 45, RULE_classDeclaration = 46, RULE_normalClassDeclaration = 47, 
		RULE_className = 48, RULE_classModifiers = 49, RULE_classModifier = 50, 
		RULE_typeParameters = 51, RULE_typeParameterList = 52, RULE_superclass = 53, 
		RULE_superinterfaces = 54, RULE_interfaceTypeList = 55, RULE_classBody = 56, 
		RULE_classBodyDeclaration = 57, RULE_classMemberDeclaration = 58, RULE_fieldDeclaration = 59, 
		RULE_fieldModifiers = 60, RULE_fieldModifier = 61, RULE_variableDeclaratorList = 62, 
		RULE_variableDeclarator = 63, RULE_variableDeclaratorId = 64, RULE_variableInitializer = 65, 
		RULE_unannType = 66, RULE_unannPrimitiveType = 67, RULE_unannReferenceType = 68, 
		RULE_unannClassOrInterfaceType = 69, RULE_unannClassType = 70, RULE_unannClassType_lf_unannClassOrInterfaceType = 71, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 72, RULE_unannInterfaceType = 73, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 74, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 75, 
		RULE_unannTypeVariable = 76, RULE_unannArrayType = 77, RULE_methodDeclaration = 78, 
		RULE_methodModifier = 79, RULE_methodHeader = 80, RULE_result = 81, RULE_methodDeclarator = 82, 
		RULE_methodName = 83, RULE_formalParameterList = 84, RULE_formalParameters = 85, 
		RULE_formalParameter = 86, RULE_parameterDeclaratorId = 87, RULE_parameterName = 88, 
		RULE_variableModifier = 89, RULE_lastFormalParameter = 90, RULE_receiverParameter = 91, 
		RULE_throws_ = 92, RULE_exceptionTypeList = 93, RULE_exceptionType = 94, 
		RULE_methodBody = 95, RULE_instanceInitializer = 96, RULE_staticInitializer = 97, 
		RULE_constructorDeclaration = 98, RULE_constructorModifier = 99, RULE_constructorDeclarator = 100, 
		RULE_simpleTypeName = 101, RULE_constructorBody = 102, RULE_explicitConstructorInvocation = 103, 
		RULE_enumDeclaration = 104, RULE_enumBody = 105, RULE_enumConstantList = 106, 
		RULE_enumConstant = 107, RULE_enumConstantModifier = 108, RULE_enumBodyDeclarations = 109, 
		RULE_interfaceDeclaration = 110, RULE_normalInterfaceDeclaration = 111, 
		RULE_interfaceModifiers = 112, RULE_interfaceName = 113, RULE_interfaceModifier = 114, 
		RULE_extendsInterfaces = 115, RULE_interfaceBody = 116, RULE_interfaceMemberDeclaration = 117, 
		RULE_constantDeclaration = 118, RULE_constantModifiers = 119, RULE_constantModifier = 120, 
		RULE_interfaceMethodDeclaration = 121, RULE_interfaceMethodModifiers = 122, 
		RULE_interfaceMethodModifier = 123, RULE_annotationTypeDeclaration = 124, 
		RULE_annotationTypeBody = 125, RULE_annotationTypeMemberDeclaration = 126, 
		RULE_annotationTypeElementDeclaration = 127, RULE_annotationTypeElementModifier = 128, 
		RULE_defaultValue = 129, RULE_annotation = 130, RULE_normalAnnotation = 131, 
		RULE_elementValuePairList = 132, RULE_elementValuePair = 133, RULE_elementValue = 134, 
		RULE_elementValueArrayInitializer = 135, RULE_elementValueList = 136, 
		RULE_markerAnnotation = 137, RULE_singleElementAnnotation = 138, RULE_arrayInitializer = 139, 
		RULE_variableInitializerList = 140, RULE_block = 141, RULE_blockStatements = 142, 
		RULE_blockStatement = 143, RULE_localVariableDeclarationStatement = 144, 
		RULE_localVariableDeclaration = 145, RULE_statement = 146, RULE_statementNoShortIf = 147, 
		RULE_statementWithoutTrailingSubstatement = 148, RULE_emptyStatement = 149, 
		RULE_labeledStatement = 150, RULE_labeledStatementNoShortIf = 151, RULE_expressionStatement = 152, 
		RULE_statementExpression = 153, RULE_ifThenStatement = 154, RULE_ifThenElseStatement = 155, 
		RULE_ifThenElseStatementNoShortIf = 156, RULE_assertStatement = 157, RULE_switchStatement = 158, 
		RULE_switchBlock = 159, RULE_switchBlockStatementGroup = 160, RULE_switchLabels = 161, 
		RULE_switchLabel = 162, RULE_enumConstantName = 163, RULE_whileStatement = 164, 
		RULE_whileStatementNoShortIf = 165, RULE_doStatement = 166, RULE_forStatement = 167, 
		RULE_forStatementNoShortIf = 168, RULE_basicForStatement = 169, RULE_basicForStatementNoShortIf = 170, 
		RULE_forInit = 171, RULE_forUpdate = 172, RULE_statementExpressionList = 173, 
		RULE_enhancedForStatement = 174, RULE_enhancedForStatementNoShortIf = 175, 
		RULE_breakStatement = 176, RULE_continueStatement = 177, RULE_returnStatement = 178, 
		RULE_throwStatement = 179, RULE_synchronizedStatement = 180, RULE_tryStatement = 181, 
		RULE_catches = 182, RULE_catchClause = 183, RULE_catchFormalParameter = 184, 
		RULE_catchType = 185, RULE_finally_ = 186, RULE_tryWithResourcesStatement = 187, 
		RULE_resourceSpecification = 188, RULE_resourceList = 189, RULE_resource = 190, 
		RULE_primary = 191, RULE_primaryNoNewArray = 192, RULE_primaryNoNewArray_lf_arrayAccess = 193, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 194, RULE_primaryNoNewArray_lf_primary = 195, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 196, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 197, 
		RULE_primaryNoNewArray_lfno_primary = 198, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 199, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 200, 
		RULE_classInstanceCreationExpression = 201, RULE_classInstanceCreationExpression_lf_primary = 202, 
		RULE_classInstanceCreationExpression_lfno_primary = 203, RULE_typeArgumentsOrDiamond = 204, 
		RULE_fieldAccess = 205, RULE_fieldAccess_lf_primary = 206, RULE_fieldAccess_lfno_primary = 207, 
		RULE_arrayAccess = 208, RULE_arrayAccess_lf_primary = 209, RULE_arrayAccess_lfno_primary = 210, 
		RULE_methodInvocation = 211, RULE_methodInvocation_lf_primary = 212, RULE_methodInvocation_lfno_primary = 213, 
		RULE_argumentList = 214, RULE_methodReference = 215, RULE_methodReference_lf_primary = 216, 
		RULE_methodReference_lfno_primary = 217, RULE_arrayCreationExpression = 218, 
		RULE_dimExprs = 219, RULE_dimExpr = 220, RULE_constantExpression = 221, 
		RULE_expression = 222, RULE_lambdaExpression = 223, RULE_lambdaParameters = 224, 
		RULE_inferredFormalParameterList = 225, RULE_lambdaBody = 226, RULE_assignmentExpression = 227, 
		RULE_assignment = 228, RULE_leftHandSide = 229, RULE_assignmentOperator = 230, 
		RULE_conditionalExpression = 231, RULE_conditionalOrExpression = 232, 
		RULE_conditionalAndExpression = 233, RULE_inclusiveOrExpression = 234, 
		RULE_exclusiveOrExpression = 235, RULE_andExpression = 236, RULE_equalityExpression = 237, 
		RULE_relationalExpression = 238, RULE_shiftExpression = 239, RULE_additiveExpression = 240, 
		RULE_multiplicativeExpression = 241, RULE_add = 242, RULE_sub = 243, RULE_unaryExpression = 244, 
		RULE_inc = 245, RULE_preIncrementExpression = 246, RULE_dec = 247, RULE_preDecrementExpression = 248, 
		RULE_tilde = 249, RULE_bang = 250, RULE_unaryExpressionNotPlusMinus = 251, 
		RULE_postfixExpression = 252, RULE_postIncrementExpression = 253, RULE_postIncrementExpression_lf_postfixExpression = 254, 
		RULE_postDecrementExpression = 255, RULE_postDecrementExpression_lf_postfixExpression = 256, 
		RULE_castExpression = 257;
	public static final String[] ruleNames = {
		"literal", "integerLiteral", "floatingPointLiteral", "booleanLiteral", 
		"stringLiteral", "characterLiteral", "nullLiteral", "type", "primitiveType", 
		"numericType", "integralType", "floatingPointType", "referenceType", "classOrInterfaceType", 
		"classType", "classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", 
		"interfaceType", "interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", 
		"typeVariable", "arrayType", "dims", "typeParameter", "typeParameterModifier", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "packageName", "typeName", "packageOrTypeName", 
		"expressionName", "ambiguousName", "compilationUnit", "packageDeclaration", 
		"packageModifier", "importDeclaration", "singleTypeImportDeclaration", 
		"typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", 
		"typeDeclaration", "classDeclaration", "normalClassDeclaration", "className", 
		"classModifiers", "classModifier", "typeParameters", "typeParameterList", 
		"superclass", "superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
		"classMemberDeclaration", "fieldDeclaration", "fieldModifiers", "fieldModifier", 
		"variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "methodName", "formalParameterList", 
		"formalParameters", "formalParameter", "parameterDeclaratorId", "parameterName", 
		"variableModifier", "lastFormalParameter", "receiverParameter", "throws_", 
		"exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifiers", "interfaceName", "interfaceModifier", "extendsInterfaces", 
		"interfaceBody", "interfaceMemberDeclaration", "constantDeclaration", 
		"constantModifiers", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifiers", "interfaceMethodModifier", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
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
		"add", "sub", "unaryExpression", "inc", "preIncrementExpression", "dec", 
		"preDecrementExpression", "tilde", "bang", "unaryExpressionNotPlusMinus", 
		"postfixExpression", "postIncrementExpression", "postIncrementExpression_lf_postfixExpression", 
		"postDecrementExpression", "postDecrementExpression_lf_postfixExpression", 
		"castExpression"
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
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
		try {
			setState(522);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				floatingPointLiteral();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				booleanLiteral();
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				characterLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(520);
				stringLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
				nullLiteral();
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(IntegerLiteral);
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

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(FloatingPointLiteral);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(BooleanLiteral);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(StringLiteral);
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

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(CharacterLiteral);
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

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(NullLiteral);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
		enterRule(_localctx, 16, RULE_primitiveType);
		int _la;
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(540);
					annotation();
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(546);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(547);
					annotation();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
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
		enterRule(_localctx, 18, RULE_numericType);
		try {
			setState(558);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
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
		enterRule(_localctx, 20, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 22, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 24, RULE_referenceType);
		try {
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
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
		enterRule(_localctx, 26, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(569);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(570);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(575);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(573);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(574);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 28, RULE_classType);
		int _la;
		try {
			setState(602);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(580);
					annotation();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(Identifier);
				setState(588);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(587);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				classOrInterfaceType();
				setState(591);
				match(DOT);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(592);
					annotation();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(598);
				match(Identifier);
				setState(600);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(599);
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
		enterRule(_localctx, 30, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(DOT);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(605);
				annotation();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			match(Identifier);
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(612);
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
		enterRule(_localctx, 32, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(615);
				annotation();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			match(Identifier);
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(622);
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
		enterRule(_localctx, 34, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
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
		enterRule(_localctx, 36, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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
		enterRule(_localctx, 38, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
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
		enterRule(_localctx, 40, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(631);
				annotation();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
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
		enterRule(_localctx, 42, RULE_arrayType);
		try {
			setState(648);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				primitiveType();
				setState(640);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				classOrInterfaceType();
				setState(643);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				typeVariable();
				setState(646);
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
		enterRule(_localctx, 44, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(650);
				annotation();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(LBRACK);
			setState(657);
			match(RBRACK);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(658);
						annotation();
						}
						}
						setState(663);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(664);
					match(LBRACK);
					setState(665);
					match(RBRACK);
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 46, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(671);
				typeParameterModifier();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(Identifier);
			setState(679);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(678);
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
		enterRule(_localctx, 48, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
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
		enterRule(_localctx, 50, RULE_typeBound);
		int _la;
		try {
			setState(693);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(EXTENDS);
				setState(684);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(EXTENDS);
				setState(686);
				classOrInterfaceType();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(687);
					additionalBound();
					}
					}
					setState(692);
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
		enterRule(_localctx, 52, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(BITAND);
			setState(696);
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
		enterRule(_localctx, 54, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LT);
			setState(699);
			typeArgumentList();
			setState(700);
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
		enterRule(_localctx, 56, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			typeArgument();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(703);
				match(COMMA);
				setState(704);
				typeArgument();
				}
				}
				setState(709);
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
		enterRule(_localctx, 58, RULE_typeArgument);
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
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
		enterRule(_localctx, 60, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(714);
				annotation();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(QUESTION);
			setState(722);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(721);
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
		enterRule(_localctx, 62, RULE_wildcardBounds);
		try {
			setState(728);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(EXTENDS);
				setState(725);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				match(SUPER);
				setState(727);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(733);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(734);
					match(DOT);
					setState(735);
					match(Identifier);
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 66, RULE_typeName);
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				packageOrTypeName(0);
				setState(743);
				match(DOT);
				setState(744);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(749);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(752);
					match(DOT);
					setState(753);
					match(Identifier);
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 70, RULE_expressionName);
		try {
			setState(764);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				ambiguousName(0);
				setState(761);
				match(DOT);
				setState(762);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(767);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(769);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(770);
					match(DOT);
					setState(771);
					match(Identifier);
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 74, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(777);
				packageDeclaration();
				}
				break;
			}
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(780);
				importDeclaration();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(786);
				typeDeclaration();
				}
				}
				setState(791);
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
		enterRule(_localctx, 76, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(792);
				packageModifier();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
			match(PACKAGE);
			setState(799);
			match(Identifier);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(800);
				match(DOT);
				setState(801);
				match(Identifier);
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
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
		enterRule(_localctx, 78, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
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
		enterRule(_localctx, 80, RULE_importDeclaration);
		try {
			setState(815);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
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
		enterRule(_localctx, 82, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(IMPORT);
			setState(818);
			typeName();
			setState(819);
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
		enterRule(_localctx, 84, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(IMPORT);
			setState(822);
			packageOrTypeName(0);
			setState(823);
			match(DOT);
			setState(824);
			match(MUL);
			setState(825);
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
		enterRule(_localctx, 86, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(IMPORT);
			setState(828);
			match(STATIC);
			setState(829);
			typeName();
			setState(830);
			match(DOT);
			setState(831);
			match(Identifier);
			setState(832);
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
		enterRule(_localctx, 88, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(IMPORT);
			setState(835);
			match(STATIC);
			setState(836);
			typeName();
			setState(837);
			match(DOT);
			setState(838);
			match(MUL);
			setState(839);
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
		enterRule(_localctx, 90, RULE_typeDeclaration);
		try {
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
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
		enterRule(_localctx, 92, RULE_classDeclaration);
		try {
			setState(848);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
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
		enterRule(_localctx, 94, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			classModifiers();
			setState(851);
			match(CLASS);
			setState(852);
			className();
			setState(854);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(853);
				typeParameters();
				}
			}

			setState(857);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(856);
				superclass();
				}
			}

			setState(860);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(859);
				superinterfaces();
				}
			}

			setState(862);
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
		enterRule(_localctx, 96, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		enterRule(_localctx, 98, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(866);
				classModifier();
				}
				}
				setState(871);
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
		enterRule(_localctx, 100, RULE_classModifier);
		try {
			setState(880);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(875);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(876);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(877);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(878);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(879);
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
		enterRule(_localctx, 102, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LT);
			setState(883);
			typeParameterList();
			setState(884);
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
		enterRule(_localctx, 104, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			typeParameter();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(887);
				match(COMMA);
				setState(888);
				typeParameter();
				}
				}
				setState(893);
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
		enterRule(_localctx, 106, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(EXTENDS);
			setState(895);
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
		enterRule(_localctx, 108, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(IMPLEMENTS);
			setState(898);
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
		enterRule(_localctx, 110, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			interfaceType();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(901);
				match(COMMA);
				setState(902);
				interfaceType();
				}
				}
				setState(907);
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
		enterRule(_localctx, 112, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LBRACE);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(909);
				classBodyDeclaration();
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
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
		enterRule(_localctx, 114, RULE_classBodyDeclaration);
		try {
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
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
		enterRule(_localctx, 116, RULE_classMemberDeclaration);
		try {
			setState(928);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
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
		enterRule(_localctx, 118, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			fieldModifiers();
			setState(931);
			unannType();
			setState(932);
			variableDeclaratorList();
			setState(933);
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
		enterRule(_localctx, 120, RULE_fieldModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(935);
				fieldModifier();
				}
				}
				setState(940);
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
		enterRule(_localctx, 122, RULE_fieldModifier);
		try {
			setState(949);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(945);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(946);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(947);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(948);
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
		enterRule(_localctx, 124, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			variableDeclarator();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(952);
				match(COMMA);
				setState(953);
				variableDeclarator();
				}
				}
				setState(958);
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
		enterRule(_localctx, 126, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			variableDeclaratorId();
			setState(962);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(960);
				match(ASSIGN);
				setState(961);
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
		enterRule(_localctx, 128, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(Identifier);
			setState(966);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(965);
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
		enterRule(_localctx, 130, RULE_variableInitializer);
		try {
			setState(970);
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
				setState(968);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
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
		enterRule(_localctx, 132, RULE_unannType);
		try {
			setState(974);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
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
		enterRule(_localctx, 134, RULE_unannPrimitiveType);
		try {
			setState(978);
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
				setState(976);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
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
		enterRule(_localctx, 136, RULE_unannReferenceType);
		try {
			setState(983);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(982);
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
		enterRule(_localctx, 138, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(985);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(986);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(991);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(989);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(990);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 140, RULE_unannClassType);
		int _la;
		try {
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(Identifier);
				setState(998);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(997);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				unannClassOrInterfaceType();
				setState(1001);
				match(DOT);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1002);
					annotation();
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1008);
				match(Identifier);
				setState(1010);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1009);
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
		enterRule(_localctx, 142, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(DOT);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1015);
				annotation();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
			match(Identifier);
			setState(1023);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1022);
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
		enterRule(_localctx, 144, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(Identifier);
			setState(1027);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1026);
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
		enterRule(_localctx, 146, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
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
		enterRule(_localctx, 148, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
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
		enterRule(_localctx, 150, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
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
		enterRule(_localctx, 152, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
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
		enterRule(_localctx, 154, RULE_unannArrayType);
		try {
			setState(1046);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				unannPrimitiveType();
				setState(1038);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				unannClassOrInterfaceType();
				setState(1041);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1043);
				unannTypeVariable();
				setState(1044);
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
		enterRule(_localctx, 156, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1048);
				methodModifier();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			methodHeader();
			setState(1055);
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
		enterRule(_localctx, 158, RULE_methodModifier);
		try {
			setState(1067);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1060);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1061);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1062);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1063);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1064);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1065);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1066);
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
		enterRule(_localctx, 160, RULE_methodHeader);
		int _la;
		try {
			setState(1086);
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
				setState(1069);
				result();
				setState(1070);
				methodDeclarator();
				setState(1072);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1071);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				typeParameters();
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1075);
					annotation();
					}
					}
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1081);
				result();
				setState(1082);
				methodDeclarator();
				setState(1084);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1083);
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
		enterRule(_localctx, 162, RULE_result);
		try {
			setState(1090);
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
				setState(1088);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
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
		enterRule(_localctx, 164, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			methodName();
			setState(1093);
			match(LPAREN);
			setState(1095);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1094);
				formalParameterList();
				}
			}

			setState(1097);
			match(RPAREN);
			setState(1099);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1098);
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
		enterRule(_localctx, 166, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
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
		enterRule(_localctx, 168, RULE_formalParameterList);
		try {
			setState(1108);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				formalParameters();
				setState(1104);
				match(COMMA);
				setState(1105);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
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
		enterRule(_localctx, 170, RULE_formalParameters);
		try {
			int _alt;
			setState(1126);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				formalParameter();
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1111);
						match(COMMA);
						setState(1112);
						formalParameter();
						}
						} 
					}
					setState(1117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				receiverParameter();
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1119);
						match(COMMA);
						setState(1120);
						formalParameter();
						}
						} 
					}
					setState(1125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 172, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1128);
				variableModifier();
				}
				}
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1134);
			unannType();
			setState(1135);
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
		enterRule(_localctx, 174, RULE_parameterDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			parameterName();
			setState(1139);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1138);
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
		enterRule(_localctx, 176, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
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
		enterRule(_localctx, 178, RULE_variableModifier);
		try {
			setState(1145);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144);
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
		enterRule(_localctx, 180, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1164);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1147);
					variableModifier();
					}
					}
					setState(1152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1153);
				unannType();
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1154);
					annotation();
					}
					}
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1160);
				match(ELLIPSIS);
				setState(1161);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
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
		enterRule(_localctx, 182, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1166);
				annotation();
				}
				}
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1172);
			unannType();
			setState(1175);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1173);
				match(Identifier);
				setState(1174);
				match(DOT);
				}
			}

			setState(1177);
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
		enterRule(_localctx, 184, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(THROWS);
			setState(1180);
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
		enterRule(_localctx, 186, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			exceptionType();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1183);
				match(COMMA);
				setState(1184);
				exceptionType();
				}
				}
				setState(1189);
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
		enterRule(_localctx, 188, RULE_exceptionType);
		try {
			setState(1192);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
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
		enterRule(_localctx, 190, RULE_methodBody);
		try {
			setState(1196);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
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
		enterRule(_localctx, 192, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
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
		enterRule(_localctx, 194, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(STATIC);
			setState(1201);
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
		enterRule(_localctx, 196, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1203);
				constructorModifier();
				}
				}
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1209);
			constructorDeclarator();
			setState(1211);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1210);
				throws_();
				}
			}

			setState(1213);
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
		enterRule(_localctx, 198, RULE_constructorModifier);
		try {
			setState(1219);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218);
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
		enterRule(_localctx, 200, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1221);
				typeParameters();
				}
			}

			setState(1224);
			simpleTypeName();
			setState(1225);
			match(LPAREN);
			setState(1227);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1226);
				formalParameterList();
				}
			}

			setState(1229);
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
		enterRule(_localctx, 202, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
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
		enterRule(_localctx, 204, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(LBRACE);
			setState(1235);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1234);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1238);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1237);
				blockStatements();
				}
			}

			setState(1240);
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
		enterRule(_localctx, 206, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1288);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1242);
					typeArguments();
					}
				}

				setState(1245);
				match(THIS);
				setState(1246);
				match(LPAREN);
				setState(1248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1247);
					argumentList();
					}
				}

				setState(1250);
				match(RPAREN);
				setState(1251);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1252);
					typeArguments();
					}
				}

				setState(1255);
				match(SUPER);
				setState(1256);
				match(LPAREN);
				setState(1258);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1257);
					argumentList();
					}
				}

				setState(1260);
				match(RPAREN);
				setState(1261);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				expressionName();
				setState(1263);
				match(DOT);
				setState(1265);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1264);
					typeArguments();
					}
				}

				setState(1267);
				match(SUPER);
				setState(1268);
				match(LPAREN);
				setState(1270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1269);
					argumentList();
					}
				}

				setState(1272);
				match(RPAREN);
				setState(1273);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1275);
				primary();
				setState(1276);
				match(DOT);
				setState(1278);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1277);
					typeArguments();
					}
				}

				setState(1280);
				match(SUPER);
				setState(1281);
				match(LPAREN);
				setState(1283);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1282);
					argumentList();
					}
				}

				setState(1285);
				match(RPAREN);
				setState(1286);
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
		enterRule(_localctx, 208, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1290);
				classModifier();
				}
				}
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1296);
			match(ENUM);
			setState(1297);
			match(Identifier);
			setState(1299);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1298);
				superinterfaces();
				}
			}

			setState(1301);
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
		enterRule(_localctx, 210, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(LBRACE);
			setState(1305);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1304);
				enumConstantList();
				}
			}

			setState(1308);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1307);
				match(COMMA);
				}
			}

			setState(1311);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1310);
				enumBodyDeclarations();
				}
			}

			setState(1313);
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
		enterRule(_localctx, 212, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			enumConstant();
			setState(1320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1316);
					match(COMMA);
					setState(1317);
					enumConstant();
					}
					} 
				}
				setState(1322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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
		enterRule(_localctx, 214, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1323);
				enumConstantModifier();
				}
				}
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1329);
			match(Identifier);
			setState(1335);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1330);
				match(LPAREN);
				setState(1332);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1331);
					argumentList();
					}
				}

				setState(1334);
				match(RPAREN);
				}
			}

			setState(1338);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1337);
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
		enterRule(_localctx, 216, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
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
		enterRule(_localctx, 218, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(SEMI);
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1343);
				classBodyDeclaration();
				}
				}
				setState(1348);
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
		enterRule(_localctx, 220, RULE_interfaceDeclaration);
		try {
			setState(1351);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
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
		public InterfaceModifiersContext interfaceModifiers() {
			return getRuleContext(InterfaceModifiersContext.class,0);
		}
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
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
		enterRule(_localctx, 222, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			interfaceModifiers();
			setState(1354);
			match(INTERFACE);
			setState(1355);
			interfaceName();
			setState(1357);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1356);
				typeParameters();
				}
			}

			setState(1360);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1359);
				extendsInterfaces();
				}
			}

			setState(1362);
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

	public static class InterfaceModifiersContext extends ParserRuleContext {
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public InterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifiersContext interfaceModifiers() throws RecognitionException {
		InterfaceModifiersContext _localctx = new InterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interfaceModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1364);
				interfaceModifier();
				}
				}
				setState(1369);
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

	public static class InterfaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
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
		enterRule(_localctx, 228, RULE_interfaceModifier);
		try {
			setState(1379);
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
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1375);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1376);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1377);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1378);
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
		enterRule(_localctx, 230, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(EXTENDS);
			setState(1382);
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
		enterRule(_localctx, 232, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(LBRACE);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1385);
				interfaceMemberDeclaration();
				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
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
		enterRule(_localctx, 234, RULE_interfaceMemberDeclaration);
		try {
			setState(1398);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1397);
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
		public ConstantModifiersContext constantModifiers() {
			return getRuleContext(ConstantModifiersContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
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
		enterRule(_localctx, 236, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			constantModifiers();
			setState(1401);
			unannType();
			setState(1402);
			variableDeclaratorList();
			setState(1403);
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

	public static class ConstantModifiersContext extends ParserRuleContext {
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifiersContext constantModifiers() throws RecognitionException {
		ConstantModifiersContext _localctx = new ConstantModifiersContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_constantModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1405);
				constantModifier();
				}
				}
				setState(1410);
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
		enterRule(_localctx, 240, RULE_constantModifier);
		try {
			setState(1415);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1414);
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
		public InterfaceMethodModifiersContext interfaceMethodModifiers() {
			return getRuleContext(InterfaceMethodModifiersContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
		enterRule(_localctx, 242, RULE_interfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			interfaceMethodModifiers();
			setState(1418);
			methodHeader();
			setState(1419);
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

	public static class InterfaceMethodModifiersContext extends ParserRuleContext {
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifiersContext interfaceMethodModifiers() throws RecognitionException {
		InterfaceMethodModifiersContext _localctx = new InterfaceMethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_interfaceMethodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1421);
				interfaceMethodModifier();
				}
				}
				setState(1426);
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
		enterRule(_localctx, 246, RULE_interfaceMethodModifier);
		try {
			setState(1433);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1429);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1431);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1432);
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
		enterRule(_localctx, 248, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					interfaceModifier();
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1441);
			match(AT);
			setState(1442);
			match(INTERFACE);
			setState(1443);
			match(Identifier);
			setState(1444);
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
		enterRule(_localctx, 250, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(LBRACE);
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1447);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1453);
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
		enterRule(_localctx, 252, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1460);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1458);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1459);
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
		enterRule(_localctx, 254, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1462);
				annotationTypeElementModifier();
				}
				}
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1468);
			unannType();
			setState(1469);
			match(Identifier);
			setState(1470);
			match(LPAREN);
			setState(1471);
			match(RPAREN);
			setState(1473);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1472);
				dims();
				}
			}

			setState(1476);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1475);
				defaultValue();
				}
			}

			setState(1478);
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
		enterRule(_localctx, 256, RULE_annotationTypeElementModifier);
		try {
			setState(1483);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1482);
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
		enterRule(_localctx, 258, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(DEFAULT);
			setState(1486);
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
		enterRule(_localctx, 260, RULE_annotation);
		try {
			setState(1491);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
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
		enterRule(_localctx, 262, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(AT);
			setState(1494);
			typeName();
			setState(1495);
			match(LPAREN);
			setState(1497);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1496);
				elementValuePairList();
				}
			}

			setState(1499);
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
		enterRule(_localctx, 264, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			elementValuePair();
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1502);
				match(COMMA);
				setState(1503);
				elementValuePair();
				}
				}
				setState(1508);
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
		enterRule(_localctx, 266, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(Identifier);
			setState(1510);
			match(ASSIGN);
			setState(1511);
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
		enterRule(_localctx, 268, RULE_elementValue);
		try {
			setState(1516);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
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
		enterRule(_localctx, 270, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(LBRACE);
			setState(1520);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1519);
				elementValueList();
				}
			}

			setState(1523);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1522);
				match(COMMA);
				}
			}

			setState(1525);
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
		enterRule(_localctx, 272, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			elementValue();
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1528);
					match(COMMA);
					setState(1529);
					elementValue();
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		enterRule(_localctx, 274, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(AT);
			setState(1536);
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
		enterRule(_localctx, 276, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(AT);
			setState(1539);
			typeName();
			setState(1540);
			match(LPAREN);
			setState(1541);
			elementValue();
			setState(1542);
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
		enterRule(_localctx, 278, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(LBRACE);
			setState(1546);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1545);
				variableInitializerList();
				}
			}

			setState(1549);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1548);
				match(COMMA);
				}
			}

			setState(1551);
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
		enterRule(_localctx, 280, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			variableInitializer();
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1554);
					match(COMMA);
					setState(1555);
					variableInitializer();
					}
					} 
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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
		enterRule(_localctx, 282, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(LBRACE);
			setState(1563);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1562);
				blockStatements();
				}
			}

			setState(1565);
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
		enterRule(_localctx, 284, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			blockStatement();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1568);
				blockStatement();
				}
				}
				setState(1573);
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
		enterRule(_localctx, 286, RULE_blockStatement);
		try {
			setState(1577);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1576);
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
		enterRule(_localctx, 288, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			localVariableDeclaration();
			setState(1580);
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
		enterRule(_localctx, 290, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1582);
				variableModifier();
				}
				}
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1588);
			unannType();
			setState(1589);
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
		enterRule(_localctx, 292, RULE_statement);
		try {
			setState(1597);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1594);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1595);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1596);
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
		enterRule(_localctx, 294, RULE_statementNoShortIf);
		try {
			setState(1604);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1601);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1602);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1603);
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
		enterRule(_localctx, 296, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1618);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
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
				setState(1608);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1610);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1611);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1612);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1613);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1614);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1615);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1616);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1617);
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
		enterRule(_localctx, 298, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
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
		enterRule(_localctx, 300, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(Identifier);
			setState(1623);
			match(COLON);
			setState(1624);
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
		enterRule(_localctx, 302, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(Identifier);
			setState(1627);
			match(COLON);
			setState(1628);
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
		enterRule(_localctx, 304, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			statementExpression();
			setState(1631);
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
		enterRule(_localctx, 306, RULE_statementExpression);
		try {
			setState(1640);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1633);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1635);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1636);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1637);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1638);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1639);
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
		enterRule(_localctx, 308, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(IF);
			setState(1643);
			match(LPAREN);
			setState(1644);
			expression();
			setState(1645);
			match(RPAREN);
			setState(1646);
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
		enterRule(_localctx, 310, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(IF);
			setState(1649);
			match(LPAREN);
			setState(1650);
			expression();
			setState(1651);
			match(RPAREN);
			setState(1652);
			statementNoShortIf();
			setState(1653);
			match(ELSE);
			setState(1654);
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
		enterRule(_localctx, 312, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(IF);
			setState(1657);
			match(LPAREN);
			setState(1658);
			expression();
			setState(1659);
			match(RPAREN);
			setState(1660);
			statementNoShortIf();
			setState(1661);
			match(ELSE);
			setState(1662);
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
		enterRule(_localctx, 314, RULE_assertStatement);
		try {
			setState(1674);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(ASSERT);
				setState(1665);
				expression();
				setState(1666);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				match(ASSERT);
				setState(1669);
				expression();
				setState(1670);
				match(COLON);
				setState(1671);
				expression();
				setState(1672);
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
		enterRule(_localctx, 316, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(SWITCH);
			setState(1677);
			match(LPAREN);
			setState(1678);
			expression();
			setState(1679);
			match(RPAREN);
			setState(1680);
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
		enterRule(_localctx, 318, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(LBRACE);
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1689);
				switchLabel();
				}
				}
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1695);
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
		enterRule(_localctx, 320, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			switchLabels();
			setState(1698);
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
		enterRule(_localctx, 322, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			switchLabel();
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1701);
				switchLabel();
				}
				}
				setState(1706);
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
		enterRule(_localctx, 324, RULE_switchLabel);
		try {
			setState(1717);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				match(CASE);
				setState(1708);
				constantExpression();
				setState(1709);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(CASE);
				setState(1712);
				enumConstantName();
				setState(1713);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
				match(DEFAULT);
				setState(1716);
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
		enterRule(_localctx, 326, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
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
		enterRule(_localctx, 328, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			match(WHILE);
			setState(1722);
			match(LPAREN);
			setState(1723);
			expression();
			setState(1724);
			match(RPAREN);
			setState(1725);
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
		enterRule(_localctx, 330, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			match(WHILE);
			setState(1728);
			match(LPAREN);
			setState(1729);
			expression();
			setState(1730);
			match(RPAREN);
			setState(1731);
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
		enterRule(_localctx, 332, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(DO);
			setState(1734);
			statement();
			setState(1735);
			match(WHILE);
			setState(1736);
			match(LPAREN);
			setState(1737);
			expression();
			setState(1738);
			match(RPAREN);
			setState(1739);
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
		enterRule(_localctx, 334, RULE_forStatement);
		try {
			setState(1743);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
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
		enterRule(_localctx, 336, RULE_forStatementNoShortIf);
		try {
			setState(1747);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
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
		enterRule(_localctx, 338, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(FOR);
			setState(1750);
			match(LPAREN);
			setState(1752);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1751);
				forInit();
				}
			}

			setState(1754);
			match(SEMI);
			setState(1756);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1755);
				expression();
				}
			}

			setState(1758);
			match(SEMI);
			setState(1760);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1759);
				forUpdate();
				}
			}

			setState(1762);
			match(RPAREN);
			setState(1763);
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
		enterRule(_localctx, 340, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			match(FOR);
			setState(1766);
			match(LPAREN);
			setState(1768);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1767);
				forInit();
				}
			}

			setState(1770);
			match(SEMI);
			setState(1772);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1771);
				expression();
				}
			}

			setState(1774);
			match(SEMI);
			setState(1776);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1775);
				forUpdate();
				}
			}

			setState(1778);
			match(RPAREN);
			setState(1779);
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
		enterRule(_localctx, 342, RULE_forInit);
		try {
			setState(1783);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
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
		enterRule(_localctx, 344, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
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
		enterRule(_localctx, 346, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			statementExpression();
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1788);
				match(COMMA);
				setState(1789);
				statementExpression();
				}
				}
				setState(1794);
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
		enterRule(_localctx, 348, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(FOR);
			setState(1796);
			match(LPAREN);
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1797);
				variableModifier();
				}
				}
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1803);
			unannType();
			setState(1804);
			variableDeclaratorId();
			setState(1805);
			match(COLON);
			setState(1806);
			expression();
			setState(1807);
			match(RPAREN);
			setState(1808);
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
		enterRule(_localctx, 350, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(FOR);
			setState(1811);
			match(LPAREN);
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1812);
				variableModifier();
				}
				}
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1818);
			unannType();
			setState(1819);
			variableDeclaratorId();
			setState(1820);
			match(COLON);
			setState(1821);
			expression();
			setState(1822);
			match(RPAREN);
			setState(1823);
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
		enterRule(_localctx, 352, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(BREAK);
			setState(1827);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1826);
				match(Identifier);
				}
			}

			setState(1829);
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
		enterRule(_localctx, 354, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(CONTINUE);
			setState(1833);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1832);
				match(Identifier);
				}
			}

			setState(1835);
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
		enterRule(_localctx, 356, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			match(RETURN);
			setState(1839);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1838);
				expression();
				}
			}

			setState(1841);
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
		enterRule(_localctx, 358, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(THROW);
			setState(1844);
			expression();
			setState(1845);
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
		enterRule(_localctx, 360, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(SYNCHRONIZED);
			setState(1848);
			match(LPAREN);
			setState(1849);
			expression();
			setState(1850);
			match(RPAREN);
			setState(1851);
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
		enterRule(_localctx, 362, RULE_tryStatement);
		int _la;
		try {
			setState(1865);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				match(TRY);
				setState(1854);
				block();
				setState(1855);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				match(TRY);
				setState(1858);
				block();
				setState(1860);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1859);
					catches();
					}
				}

				setState(1862);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1864);
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
		enterRule(_localctx, 364, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			catchClause();
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1868);
				catchClause();
				}
				}
				setState(1873);
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
		enterRule(_localctx, 366, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(CATCH);
			setState(1875);
			match(LPAREN);
			setState(1876);
			catchFormalParameter();
			setState(1877);
			match(RPAREN);
			setState(1878);
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
		enterRule(_localctx, 368, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1880);
				variableModifier();
				}
				}
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1886);
			catchType();
			setState(1887);
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
		enterRule(_localctx, 370, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			unannClassType();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1890);
				match(BITOR);
				setState(1891);
				classType();
				}
				}
				setState(1896);
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
		enterRule(_localctx, 372, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			match(FINALLY);
			setState(1898);
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
		enterRule(_localctx, 374, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			match(TRY);
			setState(1901);
			resourceSpecification();
			setState(1902);
			block();
			setState(1904);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1903);
				catches();
				}
			}

			setState(1907);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1906);
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
		enterRule(_localctx, 376, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(LPAREN);
			setState(1910);
			resourceList();
			setState(1912);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1911);
				match(SEMI);
				}
			}

			setState(1914);
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
		enterRule(_localctx, 378, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			resource();
			setState(1921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1917);
					match(SEMI);
					setState(1918);
					resource();
					}
					} 
				}
				setState(1923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
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
		enterRule(_localctx, 380, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1924);
				variableModifier();
				}
				}
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1930);
			unannType();
			setState(1931);
			variableDeclaratorId();
			setState(1932);
			match(ASSIGN);
			setState(1933);
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
		enterRule(_localctx, 382, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1935);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1936);
				arrayCreationExpression();
				}
				break;
			}
			setState(1942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1939);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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
		enterRule(_localctx, 384, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1974);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1945);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1946);
				typeName();
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1947);
					match(LBRACK);
					setState(1948);
					match(RBRACK);
					}
					}
					setState(1953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1954);
				match(DOT);
				setState(1955);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1957);
				match(VOID);
				setState(1958);
				match(DOT);
				setState(1959);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1960);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1961);
				typeName();
				setState(1962);
				match(DOT);
				setState(1963);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1965);
				match(LPAREN);
				setState(1966);
				expression();
				setState(1967);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1969);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1970);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1971);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1972);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1973);
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
		enterRule(_localctx, 386, RULE_primaryNoNewArray_lf_arrayAccess);
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
		enterRule(_localctx, 388, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2006);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				typeName();
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1980);
					match(LBRACK);
					setState(1981);
					match(RBRACK);
					}
					}
					setState(1986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1987);
				match(DOT);
				setState(1988);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1990);
				match(VOID);
				setState(1991);
				match(DOT);
				setState(1992);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1993);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1994);
				typeName();
				setState(1995);
				match(DOT);
				setState(1996);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1998);
				match(LPAREN);
				setState(1999);
				expression();
				setState(2000);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2002);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2003);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2004);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2005);
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
		enterRule(_localctx, 390, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2013);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2010);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2011);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2012);
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
		enterRule(_localctx, 392, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
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
		enterRule(_localctx, 394, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2021);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2020);
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
		enterRule(_localctx, 396, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2063);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2024);
				typeName();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035);
				unannPrimitiveType();
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2036);
					match(LBRACK);
					setState(2037);
					match(RBRACK);
					}
					}
					setState(2042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2043);
				match(DOT);
				setState(2044);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2046);
				match(VOID);
				setState(2047);
				match(DOT);
				setState(2048);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2049);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2050);
				typeName();
				setState(2051);
				match(DOT);
				setState(2052);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2054);
				match(LPAREN);
				setState(2055);
				expression();
				setState(2056);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2058);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2059);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2060);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2061);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2062);
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
		enterRule(_localctx, 398, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
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
		enterRule(_localctx, 400, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2106);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2067);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2068);
				typeName();
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2069);
					match(LBRACK);
					setState(2070);
					match(RBRACK);
					}
					}
					setState(2075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2076);
				match(DOT);
				setState(2077);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2079);
				unannPrimitiveType();
				setState(2084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2080);
					match(LBRACK);
					setState(2081);
					match(RBRACK);
					}
					}
					setState(2086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2087);
				match(DOT);
				setState(2088);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2090);
				match(VOID);
				setState(2091);
				match(DOT);
				setState(2092);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2093);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2094);
				typeName();
				setState(2095);
				match(DOT);
				setState(2096);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2098);
				match(LPAREN);
				setState(2099);
				expression();
				setState(2100);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2102);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2103);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2104);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2105);
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
		enterRule(_localctx, 402, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2191);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				match(NEW);
				setState(2110);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2109);
					typeArguments();
					}
				}

				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2112);
					annotation();
					}
					}
					setState(2117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2118);
				match(Identifier);
				setState(2129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2119);
					match(DOT);
					setState(2123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2120);
						annotation();
						}
						}
						setState(2125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2126);
					match(Identifier);
					}
					}
					setState(2131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2133);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2132);
					typeArgumentsOrDiamond();
					}
				}

				setState(2135);
				match(LPAREN);
				setState(2137);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2136);
					argumentList();
					}
				}

				setState(2139);
				match(RPAREN);
				setState(2141);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2140);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2143);
				expressionName();
				setState(2144);
				match(DOT);
				setState(2145);
				match(NEW);
				setState(2147);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2146);
					typeArguments();
					}
				}

				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2149);
					annotation();
					}
					}
					setState(2154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2155);
				match(Identifier);
				setState(2157);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2156);
					typeArgumentsOrDiamond();
					}
				}

				setState(2159);
				match(LPAREN);
				setState(2161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2160);
					argumentList();
					}
				}

				setState(2163);
				match(RPAREN);
				setState(2165);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2164);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2167);
				primary();
				setState(2168);
				match(DOT);
				setState(2169);
				match(NEW);
				setState(2171);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2170);
					typeArguments();
					}
				}

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
				setState(2181);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2180);
					typeArgumentsOrDiamond();
					}
				}

				setState(2183);
				match(LPAREN);
				setState(2185);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2184);
					argumentList();
					}
				}

				setState(2187);
				match(RPAREN);
				setState(2189);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2188);
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
		enterRule(_localctx, 404, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(DOT);
			setState(2194);
			match(NEW);
			setState(2196);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2195);
				typeArguments();
				}
			}

			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2198);
				annotation();
				}
				}
				setState(2203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2204);
			match(Identifier);
			setState(2206);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2205);
				typeArgumentsOrDiamond();
				}
			}

			setState(2208);
			match(LPAREN);
			setState(2210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2209);
				argumentList();
				}
			}

			setState(2212);
			match(RPAREN);
			setState(2214);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2213);
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
		enterRule(_localctx, 406, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2275);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				match(NEW);
				setState(2218);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2217);
					typeArguments();
					}
				}

				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2220);
					annotation();
					}
					}
					setState(2225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2226);
				match(Identifier);
				setState(2237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2227);
					match(DOT);
					setState(2231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2228);
						annotation();
						}
						}
						setState(2233);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2234);
					match(Identifier);
					}
					}
					setState(2239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2241);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2240);
					typeArgumentsOrDiamond();
					}
				}

				setState(2243);
				match(LPAREN);
				setState(2245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2244);
					argumentList();
					}
				}

				setState(2247);
				match(RPAREN);
				setState(2249);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(2248);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
				expressionName();
				setState(2252);
				match(DOT);
				setState(2253);
				match(NEW);
				setState(2255);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2254);
					typeArguments();
					}
				}

				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2257);
					annotation();
					}
					}
					setState(2262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2263);
				match(Identifier);
				setState(2265);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2264);
					typeArgumentsOrDiamond();
					}
				}

				setState(2267);
				match(LPAREN);
				setState(2269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2268);
					argumentList();
					}
				}

				setState(2271);
				match(RPAREN);
				setState(2273);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2272);
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
		enterRule(_localctx, 408, RULE_typeArgumentsOrDiamond);
		try {
			setState(2280);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
				match(LT);
				setState(2279);
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
		enterRule(_localctx, 410, RULE_fieldAccess);
		try {
			setState(2295);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2282);
				primary();
				setState(2283);
				match(DOT);
				setState(2284);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2286);
				match(SUPER);
				setState(2287);
				match(DOT);
				setState(2288);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2289);
				typeName();
				setState(2290);
				match(DOT);
				setState(2291);
				match(SUPER);
				setState(2292);
				match(DOT);
				setState(2293);
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
		enterRule(_localctx, 412, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2297);
			match(DOT);
			setState(2298);
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
		enterRule(_localctx, 414, RULE_fieldAccess_lfno_primary);
		try {
			setState(2309);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2300);
				match(SUPER);
				setState(2301);
				match(DOT);
				setState(2302);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				typeName();
				setState(2304);
				match(DOT);
				setState(2305);
				match(SUPER);
				setState(2306);
				match(DOT);
				setState(2307);
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
		enterRule(_localctx, 416, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2311);
				expressionName();
				setState(2312);
				match(LBRACK);
				setState(2313);
				expression();
				setState(2314);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2316);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2317);
				match(LBRACK);
				setState(2318);
				expression();
				setState(2319);
				match(RBRACK);
				}
				break;
			}
			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2323);
				primaryNoNewArray_lf_arrayAccess();
				setState(2324);
				match(LBRACK);
				setState(2325);
				expression();
				setState(2326);
				match(RBRACK);
				}
				}
				setState(2332);
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
		enterRule(_localctx, 418, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2333);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2334);
			match(LBRACK);
			setState(2335);
			expression();
			setState(2336);
			match(RBRACK);
			}
			setState(2345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2338);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2339);
					match(LBRACK);
					setState(2340);
					expression();
					setState(2341);
					match(RBRACK);
					}
					} 
				}
				setState(2347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
		enterRule(_localctx, 420, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2348);
				expressionName();
				setState(2349);
				match(LBRACK);
				setState(2350);
				expression();
				setState(2351);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2353);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2354);
				match(LBRACK);
				setState(2355);
				expression();
				setState(2356);
				match(RBRACK);
				}
				break;
			}
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2360);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2361);
					match(LBRACK);
					setState(2362);
					expression();
					setState(2363);
					match(RBRACK);
					}
					} 
				}
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
		enterRule(_localctx, 422, RULE_methodInvocation);
		int _la;
		try {
			setState(2438);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				methodName();
				setState(2371);
				match(LPAREN);
				setState(2373);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2372);
					argumentList();
					}
				}

				setState(2375);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				typeName();
				setState(2378);
				match(DOT);
				setState(2380);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2379);
					typeArguments();
					}
				}

				setState(2382);
				match(Identifier);
				setState(2383);
				match(LPAREN);
				setState(2385);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2384);
					argumentList();
					}
				}

				setState(2387);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2389);
				expressionName();
				setState(2390);
				match(DOT);
				setState(2392);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2391);
					typeArguments();
					}
				}

				setState(2394);
				match(Identifier);
				setState(2395);
				match(LPAREN);
				setState(2397);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2396);
					argumentList();
					}
				}

				setState(2399);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2401);
				primary();
				setState(2402);
				match(DOT);
				setState(2404);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2403);
					typeArguments();
					}
				}

				setState(2406);
				match(Identifier);
				setState(2407);
				match(LPAREN);
				setState(2409);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2408);
					argumentList();
					}
				}

				setState(2411);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2413);
				match(SUPER);
				setState(2414);
				match(DOT);
				setState(2416);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2415);
					typeArguments();
					}
				}

				setState(2418);
				match(Identifier);
				setState(2419);
				match(LPAREN);
				setState(2421);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2420);
					argumentList();
					}
				}

				setState(2423);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2424);
				typeName();
				setState(2425);
				match(DOT);
				setState(2426);
				match(SUPER);
				setState(2427);
				match(DOT);
				setState(2429);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2428);
					typeArguments();
					}
				}

				setState(2431);
				match(Identifier);
				setState(2432);
				match(LPAREN);
				setState(2434);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2433);
					argumentList();
					}
				}

				setState(2436);
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
		enterRule(_localctx, 424, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(DOT);
			setState(2442);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2441);
				typeArguments();
				}
			}

			setState(2444);
			match(Identifier);
			setState(2445);
			match(LPAREN);
			setState(2447);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2446);
				argumentList();
				}
			}

			setState(2449);
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
		enterRule(_localctx, 426, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2507);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2451);
				methodName();
				setState(2452);
				match(LPAREN);
				setState(2454);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2453);
					argumentList();
					}
				}

				setState(2456);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2458);
				typeName();
				setState(2459);
				match(DOT);
				setState(2461);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2460);
					typeArguments();
					}
				}

				setState(2463);
				match(Identifier);
				setState(2464);
				match(LPAREN);
				setState(2466);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2465);
					argumentList();
					}
				}

				setState(2468);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2470);
				expressionName();
				setState(2471);
				match(DOT);
				setState(2473);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2472);
					typeArguments();
					}
				}

				setState(2475);
				match(Identifier);
				setState(2476);
				match(LPAREN);
				setState(2478);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2477);
					argumentList();
					}
				}

				setState(2480);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2482);
				match(SUPER);
				setState(2483);
				match(DOT);
				setState(2485);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2484);
					typeArguments();
					}
				}

				setState(2487);
				match(Identifier);
				setState(2488);
				match(LPAREN);
				setState(2490);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2489);
					argumentList();
					}
				}

				setState(2492);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2493);
				typeName();
				setState(2494);
				match(DOT);
				setState(2495);
				match(SUPER);
				setState(2496);
				match(DOT);
				setState(2498);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2497);
					typeArguments();
					}
				}

				setState(2500);
				match(Identifier);
				setState(2501);
				match(LPAREN);
				setState(2503);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2502);
					argumentList();
					}
				}

				setState(2505);
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
		enterRule(_localctx, 428, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			expression();
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2510);
				match(COMMA);
				setState(2511);
				expression();
				}
				}
				setState(2516);
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
		enterRule(_localctx, 430, RULE_methodReference);
		int _la;
		try {
			setState(2564);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
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
				primary();
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
				setState(2538);
				match(SUPER);
				setState(2539);
				match(COLONCOLON);
				setState(2541);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2540);
					typeArguments();
					}
				}

				setState(2543);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2544);
				typeName();
				setState(2545);
				match(DOT);
				setState(2546);
				match(SUPER);
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
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2553);
				classType();
				setState(2554);
				match(COLONCOLON);
				setState(2556);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2555);
					typeArguments();
					}
				}

				setState(2558);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2560);
				arrayType();
				setState(2561);
				match(COLONCOLON);
				setState(2562);
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
		enterRule(_localctx, 432, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2566);
			match(COLONCOLON);
			setState(2568);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2567);
				typeArguments();
				}
			}

			setState(2570);
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
		enterRule(_localctx, 434, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2612);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2572);
				expressionName();
				setState(2573);
				match(COLONCOLON);
				setState(2575);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2574);
					typeArguments();
					}
				}

				setState(2577);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2579);
				referenceType();
				setState(2580);
				match(COLONCOLON);
				setState(2582);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2581);
					typeArguments();
					}
				}

				setState(2584);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2586);
				match(SUPER);
				setState(2587);
				match(COLONCOLON);
				setState(2589);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2588);
					typeArguments();
					}
				}

				setState(2591);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2592);
				typeName();
				setState(2593);
				match(DOT);
				setState(2594);
				match(SUPER);
				setState(2595);
				match(COLONCOLON);
				setState(2597);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2596);
					typeArguments();
					}
				}

				setState(2599);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2601);
				classType();
				setState(2602);
				match(COLONCOLON);
				setState(2604);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2603);
					typeArguments();
					}
				}

				setState(2606);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2608);
				arrayType();
				setState(2609);
				match(COLONCOLON);
				setState(2610);
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
		enterRule(_localctx, 436, RULE_arrayCreationExpression);
		try {
			setState(2636);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2614);
				match(NEW);
				setState(2615);
				primitiveType();
				setState(2616);
				dimExprs();
				setState(2618);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2617);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2620);
				match(NEW);
				setState(2621);
				classOrInterfaceType();
				setState(2622);
				dimExprs();
				setState(2624);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2623);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2626);
				match(NEW);
				setState(2627);
				primitiveType();
				setState(2628);
				dims();
				setState(2629);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2631);
				match(NEW);
				setState(2632);
				classOrInterfaceType();
				setState(2633);
				dims();
				setState(2634);
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
		enterRule(_localctx, 438, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			dimExpr();
			setState(2642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2639);
					dimExpr();
					}
					} 
				}
				setState(2644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
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
		enterRule(_localctx, 440, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2645);
				annotation();
				}
				}
				setState(2650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2651);
			match(LBRACK);
			setState(2652);
			expression();
			setState(2653);
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
		enterRule(_localctx, 442, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
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
		enterRule(_localctx, 444, RULE_expression);
		try {
			setState(2659);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2657);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2658);
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
		enterRule(_localctx, 446, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2661);
			lambdaParameters();
			setState(2662);
			match(ARROW);
			setState(2663);
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
		enterRule(_localctx, 448, RULE_lambdaParameters);
		int _la;
		try {
			setState(2675);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2665);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2666);
				match(LPAREN);
				setState(2668);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2667);
					formalParameterList();
					}
				}

				setState(2670);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2671);
				match(LPAREN);
				setState(2672);
				inferredFormalParameterList();
				setState(2673);
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
		enterRule(_localctx, 450, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2677);
			match(Identifier);
			setState(2682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2678);
				match(COMMA);
				setState(2679);
				match(Identifier);
				}
				}
				setState(2684);
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
		enterRule(_localctx, 452, RULE_lambdaBody);
		try {
			setState(2687);
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
				setState(2685);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2686);
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
		enterRule(_localctx, 454, RULE_assignmentExpression);
		try {
			setState(2691);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2689);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2690);
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
		enterRule(_localctx, 456, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			leftHandSide();
			setState(2694);
			assignmentOperator();
			setState(2695);
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
		enterRule(_localctx, 458, RULE_leftHandSide);
		try {
			setState(2700);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2697);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2698);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2699);
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
		enterRule(_localctx, 460, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
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
		enterRule(_localctx, 462, RULE_conditionalExpression);
		try {
			setState(2711);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2704);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2705);
				conditionalOrExpression(0);
				setState(2706);
				match(QUESTION);
				setState(2707);
				expression();
				setState(2708);
				match(COLON);
				setState(2709);
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
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2714);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2716);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2717);
					match(OR);
					setState(2718);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2723);
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
		int _startState = 466;
		enterRecursionRule(_localctx, 466, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2725);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2727);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2728);
					match(AND);
					setState(2729);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2734);
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
		int _startState = 468;
		enterRecursionRule(_localctx, 468, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2736);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2738);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2739);
					match(BITOR);
					setState(2740);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2745);
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
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2747);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2749);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2750);
					match(CARET);
					setState(2751);
					andExpression(0);
					}
					} 
				}
				setState(2756);
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
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2758);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2760);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2761);
					match(BITAND);
					setState(2762);
					equalityExpression(0);
					}
					} 
				}
				setState(2767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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
		int _startState = 474;
		enterRecursionRule(_localctx, 474, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2769);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2777);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2771);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2772);
						match(EQUAL);
						setState(2773);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2774);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2775);
						match(NOTEQUAL);
						setState(2776);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2783);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2800);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2785);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2786);
						match(LT);
						setState(2787);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2788);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2789);
						match(GT);
						setState(2790);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2791);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2792);
						match(LE);
						setState(2793);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2794);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2795);
						match(GE);
						setState(2796);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2797);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2798);
						match(INSTANCEOF);
						setState(2799);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2806);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2821);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2808);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2809);
						match(LT);
						setState(2810);
						match(LT);
						setState(2811);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2812);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2813);
						match(GT);
						setState(2814);
						match(GT);
						setState(2815);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2816);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2817);
						match(GT);
						setState(2818);
						match(GT);
						setState(2819);
						match(GT);
						setState(2820);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
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
		int _startState = 480;
		enterRecursionRule(_localctx, 480, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2827);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2837);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2835);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2829);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2830);
						match(ADD);
						setState(2831);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2832);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2833);
						match(SUB);
						setState(2834);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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
		int _startState = 482;
		enterRecursionRule(_localctx, 482, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2841);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2852);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2843);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2844);
						match(MUL);
						setState(2845);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2846);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2847);
						match(DIV);
						setState(2848);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2849);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2850);
						match(MOD);
						setState(2851);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2857);
			match(ADD);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2859);
			match(SUB);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
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
		enterRule(_localctx, 488, RULE_unaryExpression);
		try {
			setState(2870);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2861);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2862);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2863);
				add();
				setState(2864);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2866);
				sub();
				setState(2867);
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
				setState(2869);
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2872);
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

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
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
		enterRule(_localctx, 492, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			inc();
			setState(2875);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
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

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
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
		enterRule(_localctx, 496, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			dec();
			setState(2880);
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

	public static class TildeContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public TildeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tilde; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTilde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildeContext tilde() throws RecognitionException {
		TildeContext _localctx = new TildeContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_tilde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2882);
			match(TILDE);
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

	public static class BangContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public BangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bang; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BangContext bang() throws RecognitionException {
		BangContext _localctx = new BangContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_bang);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2884);
			match(BANG);
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
		public TildeContext tilde() {
			return getRuleContext(TildeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public BangContext bang() {
			return getRuleContext(BangContext.class,0);
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
		enterRule(_localctx, 502, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2894);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2886);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2887);
				tilde();
				setState(2888);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2890);
				bang();
				setState(2891);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2893);
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
		enterRule(_localctx, 504, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2896);
				primary();
				}
				break;
			case 2:
				{
				setState(2897);
				expressionName();
				}
				break;
			}
			setState(2904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2902);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2900);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2901);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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
		enterRule(_localctx, 506, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2907);
			postfixExpression();
			setState(2908);
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
		enterRule(_localctx, 508, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2910);
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
		enterRule(_localctx, 510, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			postfixExpression();
			setState(2913);
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
		enterRule(_localctx, 512, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
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
		enterRule(_localctx, 514, RULE_castExpression);
		int _la;
		try {
			setState(2944);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2917);
				match(LPAREN);
				setState(2918);
				primitiveType();
				setState(2919);
				match(RPAREN);
				setState(2920);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2922);
				match(LPAREN);
				setState(2923);
				referenceType();
				setState(2927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2924);
					additionalBound();
					}
					}
					setState(2929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2930);
				match(RPAREN);
				setState(2931);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2933);
				match(LPAREN);
				setState(2934);
				referenceType();
				setState(2938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2935);
					additionalBound();
					}
					}
					setState(2940);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2941);
				match(RPAREN);
				setState(2942);
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
		case 32:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 34:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 36:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 232:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 233:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 234:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 235:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 236:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 237:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 238:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 239:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 240:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 241:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0b85\4\2\t\2\4"+
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
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u020d\n\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u021d\n\t\3\n\7\n\u0220\n\n\f\n\16"+
		"\n\u0223\13\n\3\n\3\n\7\n\u0227\n\n\f\n\16\n\u022a\13\n\3\n\5\n\u022d"+
		"\n\n\3\13\3\13\5\13\u0231\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u023a"+
		"\n\16\3\17\3\17\5\17\u023e\n\17\3\17\3\17\7\17\u0242\n\17\f\17\16\17\u0245"+
		"\13\17\3\20\7\20\u0248\n\20\f\20\16\20\u024b\13\20\3\20\3\20\5\20\u024f"+
		"\n\20\3\20\3\20\3\20\7\20\u0254\n\20\f\20\16\20\u0257\13\20\3\20\3\20"+
		"\5\20\u025b\n\20\5\20\u025d\n\20\3\21\3\21\7\21\u0261\n\21\f\21\16\21"+
		"\u0264\13\21\3\21\3\21\5\21\u0268\n\21\3\22\7\22\u026b\n\22\f\22\16\22"+
		"\u026e\13\22\3\22\3\22\5\22\u0272\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\7\26\u027b\n\26\f\26\16\26\u027e\13\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u028b\n\27\3\30\7\30\u028e\n\30\f\30"+
		"\16\30\u0291\13\30\3\30\3\30\3\30\7\30\u0296\n\30\f\30\16\30\u0299\13"+
		"\30\3\30\3\30\7\30\u029d\n\30\f\30\16\30\u02a0\13\30\3\31\7\31\u02a3\n"+
		"\31\f\31\16\31\u02a6\13\31\3\31\3\31\5\31\u02aa\n\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\7\33\u02b3\n\33\f\33\16\33\u02b6\13\33\5\33\u02b8\n"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u02c4\n\36"+
		"\f\36\16\36\u02c7\13\36\3\37\3\37\5\37\u02cb\n\37\3 \7 \u02ce\n \f \16"+
		" \u02d1\13 \3 \3 \5 \u02d5\n \3!\3!\3!\3!\5!\u02db\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\7\"\u02e3\n\"\f\"\16\"\u02e6\13\"\3#\3#\3#\3#\3#\5#\u02ed\n#"+
		"\3$\3$\3$\3$\3$\3$\7$\u02f5\n$\f$\16$\u02f8\13$\3%\3%\3%\3%\3%\5%\u02ff"+
		"\n%\3&\3&\3&\3&\3&\3&\7&\u0307\n&\f&\16&\u030a\13&\3\'\5\'\u030d\n\'\3"+
		"\'\7\'\u0310\n\'\f\'\16\'\u0313\13\'\3\'\7\'\u0316\n\'\f\'\16\'\u0319"+
		"\13\'\3(\7(\u031c\n(\f(\16(\u031f\13(\3(\3(\3(\3(\7(\u0325\n(\f(\16(\u0328"+
		"\13(\3(\3(\3)\3)\3*\3*\3*\3*\5*\u0332\n*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\5/\u034f\n/\3\60"+
		"\3\60\5\60\u0353\n\60\3\61\3\61\3\61\3\61\5\61\u0359\n\61\3\61\5\61\u035c"+
		"\n\61\3\61\5\61\u035f\n\61\3\61\3\61\3\62\3\62\3\63\7\63\u0366\n\63\f"+
		"\63\16\63\u0369\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0373"+
		"\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u037c\n\66\f\66\16\66\u037f"+
		"\13\66\3\67\3\67\3\67\38\38\38\39\39\39\79\u038a\n9\f9\169\u038d\139\3"+
		":\3:\7:\u0391\n:\f:\16:\u0394\13:\3:\3:\3;\3;\3;\3;\5;\u039c\n;\3<\3<"+
		"\3<\3<\3<\5<\u03a3\n<\3=\3=\3=\3=\3=\3>\7>\u03ab\n>\f>\16>\u03ae\13>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\5?\u03b8\n?\3@\3@\3@\7@\u03bd\n@\f@\16@\u03c0\13"+
		"@\3A\3A\3A\5A\u03c5\nA\3B\3B\5B\u03c9\nB\3C\3C\5C\u03cd\nC\3D\3D\5D\u03d1"+
		"\nD\3E\3E\5E\u03d5\nE\3F\3F\3F\5F\u03da\nF\3G\3G\5G\u03de\nG\3G\3G\7G"+
		"\u03e2\nG\fG\16G\u03e5\13G\3H\3H\5H\u03e9\nH\3H\3H\3H\7H\u03ee\nH\fH\16"+
		"H\u03f1\13H\3H\3H\5H\u03f5\nH\5H\u03f7\nH\3I\3I\7I\u03fb\nI\fI\16I\u03fe"+
		"\13I\3I\3I\5I\u0402\nI\3J\3J\5J\u0406\nJ\3K\3K\3L\3L\3M\3M\3N\3N\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\5O\u0419\nO\3P\7P\u041c\nP\fP\16P\u041f\13P\3P"+
		"\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u042e\nQ\3R\3R\3R\5R\u0433\nR"+
		"\3R\3R\7R\u0437\nR\fR\16R\u043a\13R\3R\3R\3R\5R\u043f\nR\5R\u0441\nR\3"+
		"S\3S\5S\u0445\nS\3T\3T\3T\5T\u044a\nT\3T\3T\5T\u044e\nT\3U\3U\3V\3V\3"+
		"V\3V\3V\5V\u0457\nV\3W\3W\3W\7W\u045c\nW\fW\16W\u045f\13W\3W\3W\3W\7W"+
		"\u0464\nW\fW\16W\u0467\13W\5W\u0469\nW\3X\7X\u046c\nX\fX\16X\u046f\13"+
		"X\3X\3X\3X\3Y\3Y\5Y\u0476\nY\3Z\3Z\3[\3[\5[\u047c\n[\3\\\7\\\u047f\n\\"+
		"\f\\\16\\\u0482\13\\\3\\\3\\\7\\\u0486\n\\\f\\\16\\\u0489\13\\\3\\\3\\"+
		"\3\\\3\\\5\\\u048f\n\\\3]\7]\u0492\n]\f]\16]\u0495\13]\3]\3]\3]\5]\u049a"+
		"\n]\3]\3]\3^\3^\3^\3_\3_\3_\7_\u04a4\n_\f_\16_\u04a7\13_\3`\3`\5`\u04ab"+
		"\n`\3a\3a\5a\u04af\na\3b\3b\3c\3c\3c\3d\7d\u04b7\nd\fd\16d\u04ba\13d\3"+
		"d\3d\5d\u04be\nd\3d\3d\3e\3e\3e\3e\5e\u04c6\ne\3f\5f\u04c9\nf\3f\3f\3"+
		"f\5f\u04ce\nf\3f\3f\3g\3g\3h\3h\5h\u04d6\nh\3h\5h\u04d9\nh\3h\3h\3i\5"+
		"i\u04de\ni\3i\3i\3i\5i\u04e3\ni\3i\3i\3i\5i\u04e8\ni\3i\3i\3i\5i\u04ed"+
		"\ni\3i\3i\3i\3i\3i\5i\u04f4\ni\3i\3i\3i\5i\u04f9\ni\3i\3i\3i\3i\3i\3i"+
		"\5i\u0501\ni\3i\3i\3i\5i\u0506\ni\3i\3i\3i\5i\u050b\ni\3j\7j\u050e\nj"+
		"\fj\16j\u0511\13j\3j\3j\3j\5j\u0516\nj\3j\3j\3k\3k\5k\u051c\nk\3k\5k\u051f"+
		"\nk\3k\5k\u0522\nk\3k\3k\3l\3l\3l\7l\u0529\nl\fl\16l\u052c\13l\3m\7m\u052f"+
		"\nm\fm\16m\u0532\13m\3m\3m\3m\5m\u0537\nm\3m\5m\u053a\nm\3m\5m\u053d\n"+
		"m\3n\3n\3o\3o\7o\u0543\no\fo\16o\u0546\13o\3p\3p\5p\u054a\np\3q\3q\3q"+
		"\3q\5q\u0550\nq\3q\5q\u0553\nq\3q\3q\3r\7r\u0558\nr\fr\16r\u055b\13r\3"+
		"s\3s\3t\3t\3t\3t\3t\3t\3t\5t\u0566\nt\3u\3u\3u\3v\3v\7v\u056d\nv\fv\16"+
		"v\u0570\13v\3v\3v\3w\3w\3w\3w\3w\5w\u0579\nw\3x\3x\3x\3x\3x\3y\7y\u0581"+
		"\ny\fy\16y\u0584\13y\3z\3z\3z\3z\5z\u058a\nz\3{\3{\3{\3{\3|\7|\u0591\n"+
		"|\f|\16|\u0594\13|\3}\3}\3}\3}\3}\3}\5}\u059c\n}\3~\7~\u059f\n~\f~\16"+
		"~\u05a2\13~\3~\3~\3~\3~\3~\3\177\3\177\7\177\u05ab\n\177\f\177\16\177"+
		"\u05ae\13\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u05b7\n\u0080\3\u0081\7\u0081\u05ba\n\u0081\f\u0081\16\u0081\u05bd\13"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05c4\n\u0081\3"+
		"\u0081\5\u0081\u05c7\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\5"+
		"\u0082\u05ce\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u05d6\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05dc\n\u0085"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u05e3\n\u0086\f\u0086"+
		"\16\u0086\u05e6\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u05ef\n\u0088\3\u0089\3\u0089\5\u0089\u05f3\n\u0089\3"+
		"\u0089\5\u0089\u05f6\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\7"+
		"\u008a\u05fd\n\u008a\f\u008a\16\u008a\u0600\13\u008a\3\u008b\3\u008b\3"+
		"\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\5\u008d\u060d\n\u008d\3\u008d\5\u008d\u0610\n\u008d\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\3\u008e\7\u008e\u0617\n\u008e\f\u008e\16\u008e\u061a\13"+
		"\u008e\3\u008f\3\u008f\5\u008f\u061e\n\u008f\3\u008f\3\u008f\3\u0090\3"+
		"\u0090\7\u0090\u0624\n\u0090\f\u0090\16\u0090\u0627\13\u0090\3\u0091\3"+
		"\u0091\3\u0091\5\u0091\u062c\n\u0091\3\u0092\3\u0092\3\u0092\3\u0093\7"+
		"\u0093\u0632\n\u0093\f\u0093\16\u0093\u0635\13\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0640\n"+
		"\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0647\n\u0095\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0655\n\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u066b\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u068d"+
		"\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\7\u00a1\u0697\n\u00a1\f\u00a1\16\u00a1\u069a\13\u00a1\3\u00a1\7\u00a1"+
		"\u069d\n\u00a1\f\u00a1\16\u00a1\u06a0\13\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a3\3\u00a3\7\u00a3\u06a9\n\u00a3\f\u00a3\16\u00a3"+
		"\u06ac\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u06b8\n\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u06d2\n\u00a9\3\u00aa\3\u00aa\5\u00aa"+
		"\u06d6\n\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u06db\n\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u06df\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u06e3\n\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u06eb\n\u00ac\3\u00ac"+
		"\3\u00ac\5\u00ac\u06ef\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u06f3\n\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u06fa\n\u00ad\3\u00ae\3"+
		"\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u0701\n\u00af\f\u00af\16\u00af"+
		"\u0704\13\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0709\n\u00b0\f\u00b0"+
		"\16\u00b0\u070c\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0718\n\u00b1\f\u00b1\16\u00b1"+
		"\u071b\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\5\u00b2\u0726\n\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\5\u00b3\u072c\n\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\5\u00b4\u0732\n"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\5\u00b7\u0747\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7"+
		"\u074c\n\u00b7\3\u00b8\3\u00b8\7\u00b8\u0750\n\u00b8\f\u00b8\16\u00b8"+
		"\u0753\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\7\u00ba\u075c\n\u00ba\f\u00ba\16\u00ba\u075f\13\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u0767\n\u00bb\f\u00bb\16\u00bb"+
		"\u076a\13\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0773\n\u00bd\3\u00bd\5\u00bd\u0776\n\u00bd\3\u00be\3\u00be\3"+
		"\u00be\5\u00be\u077b\n\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\7"+
		"\u00bf\u0782\n\u00bf\f\u00bf\16\u00bf\u0785\13\u00bf\3\u00c0\7\u00c0\u0788"+
		"\n\u00c0\f\u00c0\16\u00c0\u078b\13\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\5\u00c1\u0794\n\u00c1\3\u00c1\7\u00c1\u0797\n"+
		"\u00c1\f\u00c1\16\u00c1\u079a\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\7\u00c2\u07a0\n\u00c2\f\u00c2\16\u00c2\u07a3\13\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u07b9\n\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u07c1\n\u00c4\f\u00c4\16\u00c4\u07c4\13\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u07d9\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u07e0\n"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u07e8\n"+
		"\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u07ee\n\u00c8\f\u00c8\16"+
		"\u00c8\u07f1\13\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\7\u00c8\u07f9\n\u00c8\f\u00c8\16\u00c8\u07fc\13\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u0812\n\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\7\u00ca\u081a\n\u00ca\f\u00ca\16\u00ca\u081d\13\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u0825\n\u00ca\f\u00ca\16\u00ca"+
		"\u0828\13\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u083d\n\u00ca\3\u00cb\3\u00cb\5\u00cb"+
		"\u0841\n\u00cb\3\u00cb\7\u00cb\u0844\n\u00cb\f\u00cb\16\u00cb\u0847\13"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u084c\n\u00cb\f\u00cb\16\u00cb"+
		"\u084f\13\u00cb\3\u00cb\7\u00cb\u0852\n\u00cb\f\u00cb\16\u00cb\u0855\13"+
		"\u00cb\3\u00cb\5\u00cb\u0858\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u085c\n\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u0860\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0866\n\u00cb\3\u00cb\7\u00cb\u0869\n\u00cb\f\u00cb\16\u00cb"+
		"\u086c\13\u00cb\3\u00cb\3\u00cb\5\u00cb\u0870\n\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0874\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u0878\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u087e\n\u00cb\3\u00cb\7\u00cb\u0881\n\u00cb"+
		"\f\u00cb\16\u00cb\u0884\13\u00cb\3\u00cb\3\u00cb\5\u00cb\u0888\n\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u088c\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u0890\n"+
		"\u00cb\5\u00cb\u0892\n\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0897\n\u00cc"+
		"\3\u00cc\7\u00cc\u089a\n\u00cc\f\u00cc\16\u00cc\u089d\13\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u08a1\n\u00cc\3\u00cc\3\u00cc\5\u00cc\u08a5\n\u00cc\3"+
		"\u00cc\3\u00cc\5\u00cc\u08a9\n\u00cc\3\u00cd\3\u00cd\5\u00cd\u08ad\n\u00cd"+
		"\3\u00cd\7\u00cd\u08b0\n\u00cd\f\u00cd\16\u00cd\u08b3\13\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\7\u00cd\u08b8\n\u00cd\f\u00cd\16\u00cd\u08bb\13\u00cd"+
		"\3\u00cd\7\u00cd\u08be\n\u00cd\f\u00cd\16\u00cd\u08c1\13\u00cd\3\u00cd"+
		"\5\u00cd\u08c4\n\u00cd\3\u00cd\3\u00cd\5\u00cd\u08c8\n\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u08cc\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u08d2"+
		"\n\u00cd\3\u00cd\7\u00cd\u08d5\n\u00cd\f\u00cd\16\u00cd\u08d8\13\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u08dc\n\u00cd\3\u00cd\3\u00cd\5\u00cd\u08e0\n"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u08e4\n\u00cd\5\u00cd\u08e6\n\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u08eb\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u08fa\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0908\n\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u0914\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\7\u00d2\u091b\n\u00d2\f\u00d2\16\u00d2\u091e\13\u00d2\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u092a\n\u00d3\f\u00d3\16\u00d3\u092d\13\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0939"+
		"\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0940\n\u00d4"+
		"\f\u00d4\16\u00d4\u0943\13\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0948"+
		"\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u094f\n\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0954\n\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\5\u00d5\u095b\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5"+
		"\u0960\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0967\n"+
		"\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u096c\n\u00d5\3\u00d5\3\u00d5\3"+
		"\u00d5\3\u00d5\3\u00d5\5\u00d5\u0973\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0978\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0980\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0985\n\u00d5\3\u00d5"+
		"\3\u00d5\5\u00d5\u0989\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u098d\n\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\5\u00d6\u0992\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3"+
		"\u00d7\3\u00d7\5\u00d7\u0999\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3"+
		"\u00d7\5\u00d7\u09a0\n\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09a5\n\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09ac\n\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u09b1\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\5\u00d7\u09b8\n\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09bd\n"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09c5\n"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09ca\n\u00d7\3\u00d7\3\u00d7\5"+
		"\u00d7\u09ce\n\u00d7\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u09d3\n\u00d8\f\u00d8"+
		"\16\u00d8\u09d6\13\u00d8\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09db\n\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09e2\n\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09e9\n\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09f0\n\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09f8\n\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u09ff\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u0a07\n\u00d9\3\u00da\3\u00da\5\u00da\u0a0b\n"+
		"\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\5\u00db\u0a12\n\u00db\3"+
		"\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a19\n\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a20\n\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0a28\n\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\5\u00db\u0a2f\n\u00db\3\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\5\u00db\u0a37\n\u00db\3\u00dc\3\u00dc\3\u00dc\3"+
		"\u00dc\5\u00dc\u0a3d\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a43"+
		"\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\5\u00dc\u0a4f\n\u00dc\3\u00dd\3\u00dd\7\u00dd\u0a53\n"+
		"\u00dd\f\u00dd\16\u00dd\u0a56\13\u00dd\3\u00de\7\u00de\u0a59\n\u00de\f"+
		"\u00de\16\u00de\u0a5c\13\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df"+
		"\3\u00df\3\u00e0\3\u00e0\5\u00e0\u0a66\n\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a6f\n\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a76\n\u00e2\3\u00e3\3\u00e3\3\u00e3"+
		"\7\u00e3\u0a7b\n\u00e3\f\u00e3\16\u00e3\u0a7e\13\u00e3\3\u00e4\3\u00e4"+
		"\5\u00e4\u0a82\n\u00e4\3\u00e5\3\u00e5\5\u00e5\u0a86\n\u00e5\3\u00e6\3"+
		"\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0a8f\n\u00e7\3"+
		"\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\5\u00e9\u0a9a\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\7\u00ea\u0aa2\n\u00ea\f\u00ea\16\u00ea\u0aa5\13\u00ea\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0aad\n\u00eb\f\u00eb\16\u00eb"+
		"\u0ab0\13\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\7\u00ec"+
		"\u0ab8\n\u00ec\f\u00ec\16\u00ec\u0abb\13\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0ac3\n\u00ed\f\u00ed\16\u00ed\u0ac6"+
		"\13\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0ace"+
		"\n\u00ee\f\u00ee\16\u00ee\u0ad1\13\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0adc\n\u00ef\f\u00ef"+
		"\16\u00ef\u0adf\13\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0af3\n\u00f0\f\u00f0\16\u00f0\u0af6"+
		"\13\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1"+
		"\u0b08\n\u00f1\f\u00f1\16\u00f1\u0b0b\13\u00f1\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\7\u00f2\u0b16\n\u00f2"+
		"\f\u00f2\16\u00f2\u0b19\13\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0b27"+
		"\n\u00f3\f\u00f3\16\u00f3\u0b2a\13\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\5\u00f6\u0b39\n\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f9"+
		"\3\u00f9\3\u00fa\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\3\u00fd\5\u00fd\u0b51"+
		"\n\u00fd\3\u00fe\3\u00fe\5\u00fe\u0b55\n\u00fe\3\u00fe\3\u00fe\7\u00fe"+
		"\u0b59\n\u00fe\f\u00fe\16\u00fe\u0b5c\13\u00fe\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u0100\3\u0100\3\u0101\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\7\u0103\u0b70\n\u0103"+
		"\f\u0103\16\u0103\u0b73\13\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103"+
		"\3\u0103\7\u0103\u0b7b\n\u0103\f\u0103\16\u0103\u0b7e\13\u0103\3\u0103"+
		"\3\u0103\3\u0103\5\u0103\u0b83\n\u0103\3\u0103\2\17BFJ\u01d2\u01d4\u01d6"+
		"\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u0104\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc"+
		"\u01fe\u0200\u0202\u0204\2\5\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26"+
		"\26\4\2DD]g\u0c67\2\u020c\3\2\2\2\4\u020e\3\2\2\2\6\u0210\3\2\2\2\b\u0212"+
		"\3\2\2\2\n\u0214\3\2\2\2\f\u0216\3\2\2\2\16\u0218\3\2\2\2\20\u021c\3\2"+
		"\2\2\22\u022c\3\2\2\2\24\u0230\3\2\2\2\26\u0232\3\2\2\2\30\u0234\3\2\2"+
		"\2\32\u0239\3\2\2\2\34\u023d\3\2\2\2\36\u025c\3\2\2\2 \u025e\3\2\2\2\""+
		"\u026c\3\2\2\2$\u0273\3\2\2\2&\u0275\3\2\2\2(\u0277\3\2\2\2*\u027c\3\2"+
		"\2\2,\u028a\3\2\2\2.\u028f\3\2\2\2\60\u02a4\3\2\2\2\62\u02ab\3\2\2\2\64"+
		"\u02b7\3\2\2\2\66\u02b9\3\2\2\28\u02bc\3\2\2\2:\u02c0\3\2\2\2<\u02ca\3"+
		"\2\2\2>\u02cf\3\2\2\2@\u02da\3\2\2\2B\u02dc\3\2\2\2D\u02ec\3\2\2\2F\u02ee"+
		"\3\2\2\2H\u02fe\3\2\2\2J\u0300\3\2\2\2L\u030c\3\2\2\2N\u031d\3\2\2\2P"+
		"\u032b\3\2\2\2R\u0331\3\2\2\2T\u0333\3\2\2\2V\u0337\3\2\2\2X\u033d\3\2"+
		"\2\2Z\u0344\3\2\2\2\\\u034e\3\2\2\2^\u0352\3\2\2\2`\u0354\3\2\2\2b\u0362"+
		"\3\2\2\2d\u0367\3\2\2\2f\u0372\3\2\2\2h\u0374\3\2\2\2j\u0378\3\2\2\2l"+
		"\u0380\3\2\2\2n\u0383\3\2\2\2p\u0386\3\2\2\2r\u038e\3\2\2\2t\u039b\3\2"+
		"\2\2v\u03a2\3\2\2\2x\u03a4\3\2\2\2z\u03ac\3\2\2\2|\u03b7\3\2\2\2~\u03b9"+
		"\3\2\2\2\u0080\u03c1\3\2\2\2\u0082\u03c6\3\2\2\2\u0084\u03cc\3\2\2\2\u0086"+
		"\u03d0\3\2\2\2\u0088\u03d4\3\2\2\2\u008a\u03d9\3\2\2\2\u008c\u03dd\3\2"+
		"\2\2\u008e\u03f6\3\2\2\2\u0090\u03f8\3\2\2\2\u0092\u0403\3\2\2\2\u0094"+
		"\u0407\3\2\2\2\u0096\u0409\3\2\2\2\u0098\u040b\3\2\2\2\u009a\u040d\3\2"+
		"\2\2\u009c\u0418\3\2\2\2\u009e\u041d\3\2\2\2\u00a0\u042d\3\2\2\2\u00a2"+
		"\u0440\3\2\2\2\u00a4\u0444\3\2\2\2\u00a6\u0446\3\2\2\2\u00a8\u044f\3\2"+
		"\2\2\u00aa\u0456\3\2\2\2\u00ac\u0468\3\2\2\2\u00ae\u046d\3\2\2\2\u00b0"+
		"\u0473\3\2\2\2\u00b2\u0477\3\2\2\2\u00b4\u047b\3\2\2\2\u00b6\u048e\3\2"+
		"\2\2\u00b8\u0493\3\2\2\2\u00ba\u049d\3\2\2\2\u00bc\u04a0\3\2\2\2\u00be"+
		"\u04aa\3\2\2\2\u00c0\u04ae\3\2\2\2\u00c2\u04b0\3\2\2\2\u00c4\u04b2\3\2"+
		"\2\2\u00c6\u04b8\3\2\2\2\u00c8\u04c5\3\2\2\2\u00ca\u04c8\3\2\2\2\u00cc"+
		"\u04d1\3\2\2\2\u00ce\u04d3\3\2\2\2\u00d0\u050a\3\2\2\2\u00d2\u050f\3\2"+
		"\2\2\u00d4\u0519\3\2\2\2\u00d6\u0525\3\2\2\2\u00d8\u0530\3\2\2\2\u00da"+
		"\u053e\3\2\2\2\u00dc\u0540\3\2\2\2\u00de\u0549\3\2\2\2\u00e0\u054b\3\2"+
		"\2\2\u00e2\u0559\3\2\2\2\u00e4\u055c\3\2\2\2\u00e6\u0565\3\2\2\2\u00e8"+
		"\u0567\3\2\2\2\u00ea\u056a\3\2\2\2\u00ec\u0578\3\2\2\2\u00ee\u057a\3\2"+
		"\2\2\u00f0\u0582\3\2\2\2\u00f2\u0589\3\2\2\2\u00f4\u058b\3\2\2\2\u00f6"+
		"\u0592\3\2\2\2\u00f8\u059b\3\2\2\2\u00fa\u05a0\3\2\2\2\u00fc\u05a8\3\2"+
		"\2\2\u00fe\u05b6\3\2\2\2\u0100\u05bb\3\2\2\2\u0102\u05cd\3\2\2\2\u0104"+
		"\u05cf\3\2\2\2\u0106\u05d5\3\2\2\2\u0108\u05d7\3\2\2\2\u010a\u05df\3\2"+
		"\2\2\u010c\u05e7\3\2\2\2\u010e\u05ee\3\2\2\2\u0110\u05f0\3\2\2\2\u0112"+
		"\u05f9\3\2\2\2\u0114\u0601\3\2\2\2\u0116\u0604\3\2\2\2\u0118\u060a\3\2"+
		"\2\2\u011a\u0613\3\2\2\2\u011c\u061b\3\2\2\2\u011e\u0621\3\2\2\2\u0120"+
		"\u062b\3\2\2\2\u0122\u062d\3\2\2\2\u0124\u0633\3\2\2\2\u0126\u063f\3\2"+
		"\2\2\u0128\u0646\3\2\2\2\u012a\u0654\3\2\2\2\u012c\u0656\3\2\2\2\u012e"+
		"\u0658\3\2\2\2\u0130\u065c\3\2\2\2\u0132\u0660\3\2\2\2\u0134\u066a\3\2"+
		"\2\2\u0136\u066c\3\2\2\2\u0138\u0672\3\2\2\2\u013a\u067a\3\2\2\2\u013c"+
		"\u068c\3\2\2\2\u013e\u068e\3\2\2\2\u0140\u0694\3\2\2\2\u0142\u06a3\3\2"+
		"\2\2\u0144\u06a6\3\2\2\2\u0146\u06b7\3\2\2\2\u0148\u06b9\3\2\2\2\u014a"+
		"\u06bb\3\2\2\2\u014c\u06c1\3\2\2\2\u014e\u06c7\3\2\2\2\u0150\u06d1\3\2"+
		"\2\2\u0152\u06d5\3\2\2\2\u0154\u06d7\3\2\2\2\u0156\u06e7\3\2\2\2\u0158"+
		"\u06f9\3\2\2\2\u015a\u06fb\3\2\2\2\u015c\u06fd\3\2\2\2\u015e\u0705\3\2"+
		"\2\2\u0160\u0714\3\2\2\2\u0162\u0723\3\2\2\2\u0164\u0729\3\2\2\2\u0166"+
		"\u072f\3\2\2\2\u0168\u0735\3\2\2\2\u016a\u0739\3\2\2\2\u016c\u074b\3\2"+
		"\2\2\u016e\u074d\3\2\2\2\u0170\u0754\3\2\2\2\u0172\u075d\3\2\2\2\u0174"+
		"\u0763\3\2\2\2\u0176\u076b\3\2\2\2\u0178\u076e\3\2\2\2\u017a\u0777\3\2"+
		"\2\2\u017c\u077e\3\2\2\2\u017e\u0789\3\2\2\2\u0180\u0793\3\2\2\2\u0182"+
		"\u07b8\3\2\2\2\u0184\u07ba\3\2\2\2\u0186\u07d8\3\2\2\2\u0188\u07df\3\2"+
		"\2\2\u018a\u07e1\3\2\2\2\u018c\u07e7\3\2\2\2\u018e\u0811\3\2\2\2\u0190"+
		"\u0813\3\2\2\2\u0192\u083c\3\2\2\2\u0194\u0891\3\2\2\2\u0196\u0893\3\2"+
		"\2\2\u0198\u08e5\3\2\2\2\u019a\u08ea\3\2\2\2\u019c\u08f9\3\2\2\2\u019e"+
		"\u08fb\3\2\2\2\u01a0\u0907\3\2\2\2\u01a2\u0913\3\2\2\2\u01a4\u091f\3\2"+
		"\2\2\u01a6\u0938\3\2\2\2\u01a8\u0988\3\2\2\2\u01aa\u098a\3\2\2\2\u01ac"+
		"\u09cd\3\2\2\2\u01ae\u09cf\3\2\2\2\u01b0\u0a06\3\2\2\2\u01b2\u0a08\3\2"+
		"\2\2\u01b4\u0a36\3\2\2\2\u01b6\u0a4e\3\2\2\2\u01b8\u0a50\3\2\2\2\u01ba"+
		"\u0a5a\3\2\2\2\u01bc\u0a61\3\2\2\2\u01be\u0a65\3\2\2\2\u01c0\u0a67\3\2"+
		"\2\2\u01c2\u0a75\3\2\2\2\u01c4\u0a77\3\2\2\2\u01c6\u0a81\3\2\2\2\u01c8"+
		"\u0a85\3\2\2\2\u01ca\u0a87\3\2\2\2\u01cc\u0a8e\3\2\2\2\u01ce\u0a90\3\2"+
		"\2\2\u01d0\u0a99\3\2\2\2\u01d2\u0a9b\3\2\2\2\u01d4\u0aa6\3\2\2\2\u01d6"+
		"\u0ab1\3\2\2\2\u01d8\u0abc\3\2\2\2\u01da\u0ac7\3\2\2\2\u01dc\u0ad2\3\2"+
		"\2\2\u01de\u0ae0\3\2\2\2\u01e0\u0af7\3\2\2\2\u01e2\u0b0c\3\2\2\2\u01e4"+
		"\u0b1a\3\2\2\2\u01e6\u0b2b\3\2\2\2\u01e8\u0b2d\3\2\2\2\u01ea\u0b38\3\2"+
		"\2\2\u01ec\u0b3a\3\2\2\2\u01ee\u0b3c\3\2\2\2\u01f0\u0b3f\3\2\2\2\u01f2"+
		"\u0b41\3\2\2\2\u01f4\u0b44\3\2\2\2\u01f6\u0b46\3\2\2\2\u01f8\u0b50\3\2"+
		"\2\2\u01fa\u0b54\3\2\2\2\u01fc\u0b5d\3\2\2\2\u01fe\u0b60\3\2\2\2\u0200"+
		"\u0b62\3\2\2\2\u0202\u0b65\3\2\2\2\u0204\u0b82\3\2\2\2\u0206\u020d\5\4"+
		"\3\2\u0207\u020d\5\6\4\2\u0208\u020d\5\b\5\2\u0209\u020d\5\f\7\2\u020a"+
		"\u020d\5\n\6\2\u020b\u020d\5\16\b\2\u020c\u0206\3\2\2\2\u020c\u0207\3"+
		"\2\2\2\u020c\u0208\3\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020b\3\2\2\2\u020d\3\3\2\2\2\u020e\u020f\7\65\2\2\u020f\5\3\2\2\2\u0210"+
		"\u0211\7\66\2\2\u0211\7\3\2\2\2\u0212\u0213\7\67\2\2\u0213\t\3\2\2\2\u0214"+
		"\u0215\79\2\2\u0215\13\3\2\2\2\u0216\u0217\78\2\2\u0217\r\3\2\2\2\u0218"+
		"\u0219\7:\2\2\u0219\17\3\2\2\2\u021a\u021d\5\22\n\2\u021b\u021d\5\32\16"+
		"\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\21\3\2\2\2\u021e\u0220"+
		"\5\u0106\u0084\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3"+
		"\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u022d\5\24\13\2\u0225\u0227\5\u0106\u0084\2\u0226\u0225\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7\5\2\2\u022c\u0221\3\2\2\2\u022c"+
		"\u0228\3\2\2\2\u022d\23\3\2\2\2\u022e\u0231\5\26\f\2\u022f\u0231\5\30"+
		"\r\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\25\3\2\2\2\u0232\u0233"+
		"\t\2\2\2\u0233\27\3\2\2\2\u0234\u0235\t\3\2\2\u0235\31\3\2\2\2\u0236\u023a"+
		"\5\34\17\2\u0237\u023a\5*\26\2\u0238\u023a\5,\27\2\u0239\u0236\3\2\2\2"+
		"\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\33\3\2\2\2\u023b\u023e"+
		"\5\"\22\2\u023c\u023e\5(\25\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2"+
		"\u023e\u0243\3\2\2\2\u023f\u0242\5 \21\2\u0240\u0242\5&\24\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\35\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0248\5\u0106"+
		"\u0084\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\7h"+
		"\2\2\u024d\u024f\58\35\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u025d\3\2\2\2\u0250\u0251\5\34\17\2\u0251\u0255\7C\2\2\u0252\u0254\5"+
		"\u0106\u0084\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258"+
		"\u025a\7h\2\2\u0259\u025b\58\35\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\u025d\3\2\2\2\u025c\u0249\3\2\2\2\u025c\u0250\3\2\2\2\u025d"+
		"\37\3\2\2\2\u025e\u0262\7C\2\2\u025f\u0261\5\u0106\u0084\2\u0260\u025f"+
		"\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\7h\2\2\u0266\u0268\58\35"+
		"\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268!\3\2\2\2\u0269\u026b"+
		"\5\u0106\u0084\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0271\7h\2\2\u0270\u0272\58\35\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272#\3\2\2\2\u0273\u0274\5\36\20\2\u0274%\3\2\2\2\u0275\u0276\5"+
		" \21\2\u0276\'\3\2\2\2\u0277\u0278\5\"\22\2\u0278)\3\2\2\2\u0279\u027b"+
		"\5\u0106\u0084\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f"+
		"\u0280\7h\2\2\u0280+\3\2\2\2\u0281\u0282\5\22\n\2\u0282\u0283\5.\30\2"+
		"\u0283\u028b\3\2\2\2\u0284\u0285\5\34\17\2\u0285\u0286\5.\30\2\u0286\u028b"+
		"\3\2\2\2\u0287\u0288\5*\26\2\u0288\u0289\5.\30\2\u0289\u028b\3\2\2\2\u028a"+
		"\u0281\3\2\2\2\u028a\u0284\3\2\2\2\u028a\u0287\3\2\2\2\u028b-\3\2\2\2"+
		"\u028c\u028e\5\u0106\u0084\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f"+
		"\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0292\u0293\7?\2\2\u0293\u029e\7@\2\2\u0294\u0296\5\u0106\u0084\2"+
		"\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029b\7?\2\2\u029b"+
		"\u029d\7@\2\2\u029c\u0297\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2"+
		"\2\2\u029e\u029f\3\2\2\2\u029f/\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3"+
		"\5\62\32\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9"+
		"\7h\2\2\u02a8\u02aa\5\64\33\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2"+
		"\u02aa\61\3\2\2\2\u02ab\u02ac\5\u0106\u0084\2\u02ac\63\3\2\2\2\u02ad\u02ae"+
		"\7\23\2\2\u02ae\u02b8\5*\26\2\u02af\u02b0\7\23\2\2\u02b0\u02b4\5\34\17"+
		"\2\u02b1\u02b3\5\66\34\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b7\u02ad\3\2\2\2\u02b7\u02af\3\2\2\2\u02b8\65\3\2\2\2\u02b9\u02ba"+
		"\7W\2\2\u02ba\u02bb\5$\23\2\u02bb\67\3\2\2\2\u02bc\u02bd\7F\2\2\u02bd"+
		"\u02be\5:\36\2\u02be\u02bf\7E\2\2\u02bf9\3\2\2\2\u02c0\u02c5\5<\37\2\u02c1"+
		"\u02c2\7B\2\2\u02c2\u02c4\5<\37\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6;\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02cb\5\32\16\2\u02c9\u02cb\5> \2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb=\3\2\2\2\u02cc\u02ce\5\u0106\u0084\2\u02cd\u02cc"+
		"\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\7I\2\2\u02d3\u02d5\5@!"+
		"\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5?\3\2\2\2\u02d6\u02d7"+
		"\7\23\2\2\u02d7\u02db\5\32\16\2\u02d8\u02d9\7*\2\2\u02d9\u02db\5\32\16"+
		"\2\u02da\u02d6\3\2\2\2\u02da\u02d8\3\2\2\2\u02dbA\3\2\2\2\u02dc\u02dd"+
		"\b\"\1\2\u02dd\u02de\7h\2\2\u02de\u02e4\3\2\2\2\u02df\u02e0\f\3\2\2\u02e0"+
		"\u02e1\7C\2\2\u02e1\u02e3\7h\2\2\u02e2\u02df\3\2\2\2\u02e3\u02e6\3\2\2"+
		"\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5C\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e7\u02ed\7h\2\2\u02e8\u02e9\5F$\2\u02e9\u02ea\7C\2\2\u02ea"+
		"\u02eb\7h\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ec\u02e8\3\2"+
		"\2\2\u02edE\3\2\2\2\u02ee\u02ef\b$\1\2\u02ef\u02f0\7h\2\2\u02f0\u02f6"+
		"\3\2\2\2\u02f1\u02f2\f\3\2\2\u02f2\u02f3\7C\2\2\u02f3\u02f5\7h\2\2\u02f4"+
		"\u02f1\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7G\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02ff\7h\2\2\u02fa\u02fb"+
		"\5J&\2\u02fb\u02fc\7C\2\2\u02fc\u02fd\7h\2\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02f9\3\2\2\2\u02fe\u02fa\3\2\2\2\u02ffI\3\2\2\2\u0300\u0301\b&\1\2\u0301"+
		"\u0302\7h\2\2\u0302\u0308\3\2\2\2\u0303\u0304\f\3\2\2\u0304\u0305\7C\2"+
		"\2\u0305\u0307\7h\2\2\u0306\u0303\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309K\3\2\2\2\u030a\u0308\3\2\2\2\u030b"+
		"\u030d\5N(\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0311\3\2\2"+
		"\2\u030e\u0310\5R*\2\u030f\u030e\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0317\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0316\5\\/\2\u0315\u0314\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2"+
		"\2\2\u0317\u0318\3\2\2\2\u0318M\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031c"+
		"\5P)\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\7\""+
		"\2\2\u0321\u0326\7h\2\2\u0322\u0323\7C\2\2\u0323\u0325\7h\2\2\u0324\u0322"+
		"\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7A\2\2\u032aO\3\2\2\2\u032b"+
		"\u032c\5\u0106\u0084\2\u032cQ\3\2\2\2\u032d\u0332\5T+\2\u032e\u0332\5"+
		"V,\2\u032f\u0332\5X-\2\u0330\u0332\5Z.\2\u0331\u032d\3\2\2\2\u0331\u032e"+
		"\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0330\3\2\2\2\u0332S\3\2\2\2\u0333"+
		"\u0334\7\33\2\2\u0334\u0335\5D#\2\u0335\u0336\7A\2\2\u0336U\3\2\2\2\u0337"+
		"\u0338\7\33\2\2\u0338\u0339\5F$\2\u0339\u033a\7C\2\2\u033a\u033b\7U\2"+
		"\2\u033b\u033c\7A\2\2\u033cW\3\2\2\2\u033d\u033e\7\33\2\2\u033e\u033f"+
		"\7(\2\2\u033f\u0340\5D#\2\u0340\u0341\7C\2\2\u0341\u0342\7h\2\2\u0342"+
		"\u0343\7A\2\2\u0343Y\3\2\2\2\u0344\u0345\7\33\2\2\u0345\u0346\7(\2\2\u0346"+
		"\u0347\5D#\2\u0347\u0348\7C\2\2\u0348\u0349\7U\2\2\u0349\u034a\7A\2\2"+
		"\u034a[\3\2\2\2\u034b\u034f\5^\60\2\u034c\u034f\5\u00dep\2\u034d\u034f"+
		"\7A\2\2\u034e\u034b\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2\2\2\u034f"+
		"]\3\2\2\2\u0350\u0353\5`\61\2\u0351\u0353\5\u00d2j\2\u0352\u0350\3\2\2"+
		"\2\u0352\u0351\3\2\2\2\u0353_\3\2\2\2\u0354\u0355\5d\63\2\u0355\u0356"+
		"\7\13\2\2\u0356\u0358\5b\62\2\u0357\u0359\5h\65\2\u0358\u0357\3\2\2\2"+
		"\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u035c\5l\67\2\u035b\u035a"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035f\5n8\2\u035e"+
		"\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\5r"+
		":\2\u0361a\3\2\2\2\u0362\u0363\7h\2\2\u0363c\3\2\2\2\u0364\u0366\5f\64"+
		"\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368e\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u0373\5\u0106\u0084"+
		"\2\u036b\u0373\7%\2\2\u036c\u0373\7$\2\2\u036d\u0373\7#\2\2\u036e\u0373"+
		"\7\3\2\2\u036f\u0373\7(\2\2\u0370\u0373\7\24\2\2\u0371\u0373\7)\2\2\u0372"+
		"\u036a\3\2\2\2\u0372\u036b\3\2\2\2\u0372\u036c\3\2\2\2\u0372\u036d\3\2"+
		"\2\2\u0372\u036e\3\2\2\2\u0372\u036f\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0371\3\2\2\2\u0373g\3\2\2\2\u0374\u0375\7F\2\2\u0375\u0376\5j\66\2\u0376"+
		"\u0377\7E\2\2\u0377i\3\2\2\2\u0378\u037d\5\60\31\2\u0379\u037a\7B\2\2"+
		"\u037a\u037c\5\60\31\2\u037b\u0379\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b"+
		"\3\2\2\2\u037d\u037e\3\2\2\2\u037ek\3\2\2\2\u037f\u037d\3\2\2\2\u0380"+
		"\u0381\7\23\2\2\u0381\u0382\5\36\20\2\u0382m\3\2\2\2\u0383\u0384\7\32"+
		"\2\2\u0384\u0385\5p9\2\u0385o\3\2\2\2\u0386\u038b\5$\23\2\u0387\u0388"+
		"\7B\2\2\u0388\u038a\5$\23\2\u0389\u0387\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038cq\3\2\2\2\u038d\u038b\3\2\2\2"+
		"\u038e\u0392\7=\2\2\u038f\u0391\5t;\2\u0390\u038f\3\2\2\2\u0391\u0394"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0396\7>\2\2\u0396s\3\2\2\2\u0397\u039c\5v<\2\u0398"+
		"\u039c\5\u00c2b\2\u0399\u039c\5\u00c4c\2\u039a\u039c\5\u00c6d\2\u039b"+
		"\u0397\3\2\2\2\u039b\u0398\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2"+
		"\2\2\u039cu\3\2\2\2\u039d\u03a3\5x=\2\u039e\u03a3\5\u009eP\2\u039f\u03a3"+
		"\5^\60\2\u03a0\u03a3\5\u00dep\2\u03a1\u03a3\7A\2\2\u03a2\u039d\3\2\2\2"+
		"\u03a2\u039e\3\2\2\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1"+
		"\3\2\2\2\u03a3w\3\2\2\2\u03a4\u03a5\5z>\2\u03a5\u03a6\5\u0086D\2\u03a6"+
		"\u03a7\5~@\2\u03a7\u03a8\7A\2\2\u03a8y\3\2\2\2\u03a9\u03ab\5|?\2\u03aa"+
		"\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2"+
		"\2\2\u03ad{\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b8\5\u0106\u0084\2\u03b0"+
		"\u03b8\7%\2\2\u03b1\u03b8\7$\2\2\u03b2\u03b8\7#\2\2\u03b3\u03b8\7(\2\2"+
		"\u03b4\u03b8\7\24\2\2\u03b5\u03b8\7\60\2\2\u03b6\u03b8\7\63\2\2\u03b7"+
		"\u03af\3\2\2\2\u03b7\u03b0\3\2\2\2\u03b7\u03b1\3\2\2\2\u03b7\u03b2\3\2"+
		"\2\2\u03b7\u03b3\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7"+
		"\u03b6\3\2\2\2\u03b8}\3\2\2\2\u03b9\u03be\5\u0080A\2\u03ba\u03bb\7B\2"+
		"\2\u03bb\u03bd\5\u0080A\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\177\3\2\2\2\u03c0\u03be\3\2\2"+
		"\2\u03c1\u03c4\5\u0082B\2\u03c2\u03c3\7D\2\2\u03c3\u03c5\5\u0084C\2\u03c4"+
		"\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u0081\3\2\2\2\u03c6\u03c8\7h"+
		"\2\2\u03c7\u03c9\5.\30\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u0083\3\2\2\2\u03ca\u03cd\5\u01be\u00e0\2\u03cb\u03cd\5\u0118\u008d\2"+
		"\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u0085\3\2\2\2\u03ce\u03d1"+
		"\5\u0088E\2\u03cf\u03d1\5\u008aF\2\u03d0\u03ce\3\2\2\2\u03d0\u03cf\3\2"+
		"\2\2\u03d1\u0087\3\2\2\2\u03d2\u03d5\5\24\13\2\u03d3\u03d5\7\5\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5\u0089\3\2\2\2\u03d6\u03da\5\u008c"+
		"G\2\u03d7\u03da\5\u009aN\2\u03d8\u03da\5\u009cO\2\u03d9\u03d6\3\2\2\2"+
		"\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u008b\3\2\2\2\u03db\u03de"+
		"\5\u0092J\2\u03dc\u03de\5\u0098M\2\u03dd\u03db\3\2\2\2\u03dd\u03dc\3\2"+
		"\2\2\u03de\u03e3\3\2\2\2\u03df\u03e2\5\u0090I\2\u03e0\u03e2\5\u0096L\2"+
		"\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1"+
		"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u008d\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6"+
		"\u03e8\7h\2\2\u03e7\u03e9\58\35\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u03f7\3\2\2\2\u03ea\u03eb\5\u008cG\2\u03eb\u03ef\7C\2\2\u03ec"+
		"\u03ee\5\u0106\u0084\2\u03ed\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f4\7h\2\2\u03f3\u03f5\58\35\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2"+
		"\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03e6\3\2\2\2\u03f6\u03ea\3\2\2\2\u03f7"+
		"\u008f\3\2\2\2\u03f8\u03fc\7C\2\2\u03f9\u03fb\5\u0106\u0084\2\u03fa\u03f9"+
		"\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03ff\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0401\7h\2\2\u0400\u0402\58\35"+
		"\2\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0091\3\2\2\2\u0403\u0405"+
		"\7h\2\2\u0404\u0406\58\35\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0093\3\2\2\2\u0407\u0408\5\u008eH\2\u0408\u0095\3\2\2\2\u0409\u040a"+
		"\5\u0090I\2\u040a\u0097\3\2\2\2\u040b\u040c\5\u0092J\2\u040c\u0099\3\2"+
		"\2\2\u040d\u040e\7h\2\2\u040e\u009b\3\2\2\2\u040f\u0410\5\u0088E\2\u0410"+
		"\u0411\5.\30\2\u0411\u0419\3\2\2\2\u0412\u0413\5\u008cG\2\u0413\u0414"+
		"\5.\30\2\u0414\u0419\3\2\2\2\u0415\u0416\5\u009aN\2\u0416\u0417\5.\30"+
		"\2\u0417\u0419\3\2\2\2\u0418\u040f\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0415"+
		"\3\2\2\2\u0419\u009d\3\2\2\2\u041a\u041c\5\u00a0Q\2\u041b\u041a\3\2\2"+
		"\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420"+
		"\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0421\5\u00a2R\2\u0421\u0422\5\u00c0"+
		"a\2\u0422\u009f\3\2\2\2\u0423\u042e\5\u0106\u0084\2\u0424\u042e\7%\2\2"+
		"\u0425\u042e\7$\2\2\u0426\u042e\7#\2\2\u0427\u042e\7\3\2\2\u0428\u042e"+
		"\7(\2\2\u0429\u042e\7\24\2\2\u042a\u042e\7,\2\2\u042b\u042e\7 \2\2\u042c"+
		"\u042e\7)\2\2\u042d\u0423\3\2\2\2\u042d\u0424\3\2\2\2\u042d\u0425\3\2"+
		"\2\2\u042d\u0426\3\2\2\2\u042d\u0427\3\2\2\2\u042d\u0428\3\2\2\2\u042d"+
		"\u0429\3\2\2\2\u042d\u042a\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042c\3\2"+
		"\2\2\u042e\u00a1\3\2\2\2\u042f\u0430\5\u00a4S\2\u0430\u0432\5\u00a6T\2"+
		"\u0431\u0433\5\u00ba^\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0441\3\2\2\2\u0434\u0438\5h\65\2\u0435\u0437\5\u0106\u0084\2\u0436\u0435"+
		"\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439"+
		"\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043c\5\u00a4S\2\u043c\u043e"+
		"\5\u00a6T\2\u043d\u043f\5\u00ba^\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2"+
		"\2\2\u043f\u0441\3\2\2\2\u0440\u042f\3\2\2\2\u0440\u0434\3\2\2\2\u0441"+
		"\u00a3\3\2\2\2\u0442\u0445\5\u0086D\2\u0443\u0445\7\62\2\2\u0444\u0442"+
		"\3\2\2\2\u0444\u0443\3\2\2\2\u0445\u00a5\3\2\2\2\u0446\u0447\5\u00a8U"+
		"\2\u0447\u0449\7;\2\2\u0448\u044a\5\u00aaV\2\u0449\u0448\3\2\2\2\u0449"+
		"\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\7<\2\2\u044c\u044e\5.\30"+
		"\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u00a7\3\2\2\2\u044f\u0450"+
		"\7h\2\2\u0450\u00a9\3\2\2\2\u0451\u0452\5\u00acW\2\u0452\u0453\7B\2\2"+
		"\u0453\u0454\5\u00b6\\\2\u0454\u0457\3\2\2\2\u0455\u0457\5\u00b6\\\2\u0456"+
		"\u0451\3\2\2\2\u0456\u0455\3\2\2\2\u0457\u00ab\3\2\2\2\u0458\u045d\5\u00ae"+
		"X\2\u0459\u045a\7B\2\2\u045a\u045c\5\u00aeX\2\u045b\u0459\3\2\2\2\u045c"+
		"\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0469\3\2"+
		"\2\2\u045f\u045d\3\2\2\2\u0460\u0465\5\u00b8]\2\u0461\u0462\7B\2\2\u0462"+
		"\u0464\5\u00aeX\2\u0463\u0461\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0468"+
		"\u0458\3\2\2\2\u0468\u0460\3\2\2\2\u0469\u00ad\3\2\2\2\u046a\u046c\5\u00b4"+
		"[\2\u046b\u046a\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u0470\3\2\2\2\u046f\u046d\3\2\2\2\u0470\u0471\5\u0086"+
		"D\2\u0471\u0472\5\u00b0Y\2\u0472\u00af\3\2\2\2\u0473\u0475\5\u00b2Z\2"+
		"\u0474\u0476\5.\30\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u00b1"+
		"\3\2\2\2\u0477\u0478\7h\2\2\u0478\u00b3\3\2\2\2\u0479\u047c\5\u0106\u0084"+
		"\2\u047a\u047c\7\24\2\2\u047b\u0479\3\2\2\2\u047b\u047a\3\2\2\2\u047c"+
		"\u00b5\3\2\2\2\u047d\u047f\5\u00b4[\2\u047e\u047d\3\2\2\2\u047f\u0482"+
		"\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482"+
		"\u0480\3\2\2\2\u0483\u0487\5\u0086D\2\u0484\u0486\5\u0106\u0084\2\u0485"+
		"\u0484\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2"+
		"\2\2\u0488\u048a\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048b\7j\2\2\u048b"+
		"\u048c\5\u0082B\2\u048c\u048f\3\2\2\2\u048d\u048f\5\u00aeX\2\u048e\u0480"+
		"\3\2\2\2\u048e\u048d\3\2\2\2\u048f\u00b7\3\2\2\2\u0490\u0492\5\u0106\u0084"+
		"\2\u0491\u0490\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494"+
		"\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0499\5\u0086D"+
		"\2\u0497\u0498\7h\2\2\u0498\u049a\7C\2\2\u0499\u0497\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\7-\2\2\u049c\u00b9\3\2\2\2\u049d"+
		"\u049e\7/\2\2\u049e\u049f\5\u00bc_\2\u049f\u00bb\3\2\2\2\u04a0\u04a5\5"+
		"\u00be`\2\u04a1\u04a2\7B\2\2\u04a2\u04a4\5\u00be`\2\u04a3\u04a1\3\2\2"+
		"\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u00bd"+
		"\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04ab\5\36\20\2\u04a9\u04ab\5*\26\2"+
		"\u04aa\u04a8\3\2\2\2\u04aa\u04a9\3\2\2\2\u04ab\u00bf\3\2\2\2\u04ac\u04af"+
		"\5\u011c\u008f\2\u04ad\u04af\7A\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3"+
		"\2\2\2\u04af\u00c1\3\2\2\2\u04b0\u04b1\5\u011c\u008f\2\u04b1\u00c3\3\2"+
		"\2\2\u04b2\u04b3\7(\2\2\u04b3\u04b4\5\u011c\u008f\2\u04b4\u00c5\3\2\2"+
		"\2\u04b5\u04b7\5\u00c8e\2\u04b6\u04b5\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8"+
		"\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u04b8\3\2"+
		"\2\2\u04bb\u04bd\5\u00caf\2\u04bc\u04be\5\u00ba^\2\u04bd\u04bc\3\2\2\2"+
		"\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\5\u00ceh\2\u04c0"+
		"\u00c7\3\2\2\2\u04c1\u04c6\5\u0106\u0084\2\u04c2\u04c6\7%\2\2\u04c3\u04c6"+
		"\7$\2\2\u04c4\u04c6\7#\2\2\u04c5\u04c1\3\2\2\2\u04c5\u04c2\3\2\2\2\u04c5"+
		"\u04c3\3\2\2\2\u04c5\u04c4\3\2\2\2\u04c6\u00c9\3\2\2\2\u04c7\u04c9\5h"+
		"\65\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04cb\5\u00ccg\2\u04cb\u04cd\7;\2\2\u04cc\u04ce\5\u00aaV\2\u04cd\u04cc"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7<\2\2\u04d0"+
		"\u00cb\3\2\2\2\u04d1\u04d2\7h\2\2\u04d2\u00cd\3\2\2\2\u04d3\u04d5\7=\2"+
		"\2\u04d4\u04d6\5\u00d0i\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04d8\3\2\2\2\u04d7\u04d9\5\u011e\u0090\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\7>\2\2\u04db\u00cf\3\2\2\2\u04dc"+
		"\u04de\58\35\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e0\7-\2\2\u04e0\u04e2\7;\2\2\u04e1\u04e3\5\u01ae\u00d8\2"+
		"\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5"+
		"\7<\2\2\u04e5\u050b\7A\2\2\u04e6\u04e8\58\35\2\u04e7\u04e6\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\7*\2\2\u04ea\u04ec\7;\2"+
		"\2\u04eb\u04ed\5\u01ae\u00d8\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2"+
		"\u04ed\u04ee\3\2\2\2\u04ee\u04ef\7<\2\2\u04ef\u050b\7A\2\2\u04f0\u04f1"+
		"\5H%\2\u04f1\u04f3\7C\2\2\u04f2\u04f4\58\35\2\u04f3\u04f2\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\7*\2\2\u04f6\u04f8\7;\2"+
		"\2\u04f7\u04f9\5\u01ae\u00d8\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2"+
		"\u04f9\u04fa\3\2\2\2\u04fa\u04fb\7<\2\2\u04fb\u04fc\7A\2\2\u04fc\u050b"+
		"\3\2\2\2\u04fd\u04fe\5\u0180\u00c1\2\u04fe\u0500\7C\2\2\u04ff\u0501\5"+
		"8\35\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"\u0503\7*\2\2\u0503\u0505\7;\2\2\u0504\u0506\5\u01ae\u00d8\2\u0505\u0504"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7<\2\2\u0508"+
		"\u0509\7A\2\2\u0509\u050b\3\2\2\2\u050a\u04dd\3\2\2\2\u050a\u04e7\3\2"+
		"\2\2\u050a\u04f0\3\2\2\2\u050a\u04fd\3\2\2\2\u050b\u00d1\3\2\2\2\u050c"+
		"\u050e\5f\64\2\u050d\u050c\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2"+
		"\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u050f\3\2\2\2\u0512"+
		"\u0513\7\22\2\2\u0513\u0515\7h\2\2\u0514\u0516\5n8\2\u0515\u0514\3\2\2"+
		"\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\5\u00d4k\2\u0518"+
		"\u00d3\3\2\2\2\u0519\u051b\7=\2\2\u051a\u051c\5\u00d6l\2\u051b\u051a\3"+
		"\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051f\7B\2\2\u051e"+
		"\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u0522\5\u00dc"+
		"o\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\7>\2\2\u0524\u00d5\3\2\2\2\u0525\u052a\5\u00d8m\2\u0526\u0527\7"+
		"B\2\2\u0527\u0529\5\u00d8m\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u00d7\3\2\2\2\u052c\u052a\3\2"+
		"\2\2\u052d\u052f\5\u00dan\2\u052e\u052d\3\2\2\2\u052f\u0532\3\2\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2"+
		"\2\2\u0533\u0539\7h\2\2\u0534\u0536\7;\2\2\u0535\u0537\5\u01ae\u00d8\2"+
		"\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a"+
		"\7<\2\2\u0539\u0534\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\3\2\2\2\u053b"+
		"\u053d\5r:\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u00d9\3\2\2"+
		"\2\u053e\u053f\5\u0106\u0084\2\u053f\u00db\3\2\2\2\u0540\u0544\7A\2\2"+
		"\u0541\u0543\5t;\2\u0542\u0541\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542"+
		"\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u00dd\3\2\2\2\u0546\u0544\3\2\2\2\u0547"+
		"\u054a\5\u00e0q\2\u0548\u054a\5\u00fa~\2\u0549\u0547\3\2\2\2\u0549\u0548"+
		"\3\2\2\2\u054a\u00df\3\2\2\2\u054b\u054c\5\u00e2r\2\u054c\u054d\7\36\2"+
		"\2\u054d\u054f\5\u00e4s\2\u054e\u0550\5h\65\2\u054f\u054e\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u0553\5\u00e8u\2\u0552\u0551"+
		"\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\5\u00eav"+
		"\2\u0555\u00e1\3\2\2\2\u0556\u0558\5\u00e6t\2\u0557\u0556\3\2\2\2\u0558"+
		"\u055b\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u00e3\3\2"+
		"\2\2\u055b\u0559\3\2\2\2\u055c\u055d\7h\2\2\u055d\u00e5\3\2\2\2\u055e"+
		"\u0566\5\u0106\u0084\2\u055f\u0566\7%\2\2\u0560\u0566\7$\2\2\u0561\u0566"+
		"\7#\2\2\u0562\u0566\7\3\2\2\u0563\u0566\7(\2\2\u0564\u0566\7)\2\2\u0565"+
		"\u055e\3\2\2\2\u0565\u055f\3\2\2\2\u0565\u0560\3\2\2\2\u0565\u0561\3\2"+
		"\2\2\u0565\u0562\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0564\3\2\2\2\u0566"+
		"\u00e7\3\2\2\2\u0567\u0568\7\23\2\2\u0568\u0569\5p9\2\u0569\u00e9\3\2"+
		"\2\2\u056a\u056e\7=\2\2\u056b\u056d\5\u00ecw\2\u056c\u056b\3\2\2\2\u056d"+
		"\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2"+
		"\2\2\u0570\u056e\3\2\2\2\u0571\u0572\7>\2\2\u0572\u00eb\3\2\2\2\u0573"+
		"\u0579\5\u00eex\2\u0574\u0579\5\u00f4{\2\u0575\u0579\5^\60\2\u0576\u0579"+
		"\5\u00dep\2\u0577\u0579\7A\2\2\u0578\u0573\3\2\2\2\u0578\u0574\3\2\2\2"+
		"\u0578\u0575\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0577\3\2\2\2\u0579\u00ed"+
		"\3\2\2\2\u057a\u057b\5\u00f0y\2\u057b\u057c\5\u0086D\2\u057c\u057d\5~"+
		"@\2\u057d\u057e\7A\2\2\u057e\u00ef\3\2\2\2\u057f\u0581\5\u00f2z\2\u0580"+
		"\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2"+
		"\2\2\u0583\u00f1\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u058a\5\u0106\u0084"+
		"\2\u0586\u058a\7%\2\2\u0587\u058a\7(\2\2\u0588\u058a\7\24\2\2\u0589\u0585"+
		"\3\2\2\2\u0589\u0586\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u058a"+
		"\u00f3\3\2\2\2\u058b\u058c\5\u00f6|\2\u058c\u058d\5\u00a2R\2\u058d\u058e"+
		"\5\u00c0a\2\u058e\u00f5\3\2\2\2\u058f\u0591\5\u00f8}\2\u0590\u058f\3\2"+
		"\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u00f7\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u059c\5\u0106\u0084\2\u0596\u059c"+
		"\7%\2\2\u0597\u059c\7\3\2\2\u0598\u059c\7\16\2\2\u0599\u059c\7(\2\2\u059a"+
		"\u059c\7)\2\2\u059b\u0595\3\2\2\2\u059b\u0596\3\2\2\2\u059b\u0597\3\2"+
		"\2\2\u059b\u0598\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059a\3\2\2\2\u059c"+
		"\u00f9\3\2\2\2\u059d\u059f\5\u00e6t\2\u059e\u059d\3\2\2\2\u059f\u05a2"+
		"\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2"+
		"\u05a0\3\2\2\2\u05a3\u05a4\7i\2\2\u05a4\u05a5\7\36\2\2\u05a5\u05a6\7h"+
		"\2\2\u05a6\u05a7\5\u00fc\177\2\u05a7\u00fb\3\2\2\2\u05a8\u05ac\7=\2\2"+
		"\u05a9\u05ab\5\u00fe\u0080\2\u05aa\u05a9\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac"+
		"\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05af\u05b0\7>\2\2\u05b0\u00fd\3\2\2\2\u05b1\u05b7\5\u0100\u0081"+
		"\2\u05b2\u05b7\5\u00eex\2\u05b3\u05b7\5^\60\2\u05b4\u05b7\5\u00dep\2\u05b5"+
		"\u05b7\7A\2\2\u05b6\u05b1\3\2\2\2\u05b6\u05b2\3\2\2\2\u05b6\u05b3\3\2"+
		"\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u00ff\3\2\2\2\u05b8"+
		"\u05ba\5\u0102\u0082\2\u05b9\u05b8\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9"+
		"\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be"+
		"\u05bf\5\u0086D\2\u05bf\u05c0\7h\2\2\u05c0\u05c1\7;\2\2\u05c1\u05c3\7"+
		"<\2\2\u05c2\u05c4\5.\30\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c6\3\2\2\2\u05c5\u05c7\5\u0104\u0083\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7"+
		"\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\7A\2\2\u05c9\u0101\3\2\2\2\u05ca"+
		"\u05ce\5\u0106\u0084\2\u05cb\u05ce\7%\2\2\u05cc\u05ce\7\3\2\2\u05cd\u05ca"+
		"\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05cc\3\2\2\2\u05ce\u0103\3\2\2\2\u05cf"+
		"\u05d0\7\16\2\2\u05d0\u05d1\5\u010e\u0088\2\u05d1\u0105\3\2\2\2\u05d2"+
		"\u05d6\5\u0108\u0085\2\u05d3\u05d6\5\u0114\u008b\2\u05d4\u05d6\5\u0116"+
		"\u008c\2\u05d5\u05d2\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d4\3\2\2\2\u05d6"+
		"\u0107\3\2\2\2\u05d7\u05d8\7i\2\2\u05d8\u05d9\5D#\2\u05d9\u05db\7;\2\2"+
		"\u05da\u05dc\5\u010a\u0086\2\u05db\u05da\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05de\7<\2\2\u05de\u0109\3\2\2\2\u05df\u05e4\5\u010c"+
		"\u0087\2\u05e0\u05e1\7B\2\2\u05e1\u05e3\5\u010c\u0087\2\u05e2\u05e0\3"+
		"\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5"+
		"\u010b\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7\u05e8\7h\2\2\u05e8\u05e9\7D\2"+
		"\2\u05e9\u05ea\5\u010e\u0088\2\u05ea\u010d\3\2\2\2\u05eb\u05ef\5\u01d0"+
		"\u00e9\2\u05ec\u05ef\5\u0110\u0089\2\u05ed\u05ef\5\u0106\u0084\2\u05ee"+
		"\u05eb\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ed\3\2\2\2\u05ef\u010f\3\2"+
		"\2\2\u05f0\u05f2\7=\2\2\u05f1\u05f3\5\u0112\u008a\2\u05f2\u05f1\3\2\2"+
		"\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05f6\7B\2\2\u05f5\u05f4"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\7>\2\2\u05f8"+
		"\u0111\3\2\2\2\u05f9\u05fe\5\u010e\u0088\2\u05fa\u05fb\7B\2\2\u05fb\u05fd"+
		"\5\u010e\u0088\2\u05fc\u05fa\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3"+
		"\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0113\3\2\2\2\u0600\u05fe\3\2\2\2\u0601"+
		"\u0602\7i\2\2\u0602\u0603\5D#\2\u0603\u0115\3\2\2\2\u0604\u0605\7i\2\2"+
		"\u0605\u0606\5D#\2\u0606\u0607\7;\2\2\u0607\u0608\5\u010e\u0088\2\u0608"+
		"\u0609\7<\2\2\u0609\u0117\3\2\2\2\u060a\u060c\7=\2\2\u060b\u060d\5\u011a"+
		"\u008e\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e"+
		"\u0610\7B\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2"+
		"\2\2\u0611\u0612\7>\2\2\u0612\u0119\3\2\2\2\u0613\u0618\5\u0084C\2\u0614"+
		"\u0615\7B\2\2\u0615\u0617\5\u0084C\2\u0616\u0614\3\2\2\2\u0617\u061a\3"+
		"\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u011b\3\2\2\2\u061a"+
		"\u0618\3\2\2\2\u061b\u061d\7=\2\2\u061c\u061e\5\u011e\u0090\2\u061d\u061c"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\7>\2\2\u0620"+
		"\u011d\3\2\2\2\u0621\u0625\5\u0120\u0091\2\u0622\u0624\5\u0120\u0091\2"+
		"\u0623\u0622\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0625\u0626"+
		"\3\2\2\2\u0626\u011f\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u062c\5\u0122\u0092"+
		"\2\u0629\u062c\5^\60\2\u062a\u062c\5\u0126\u0094\2\u062b\u0628\3\2\2\2"+
		"\u062b\u0629\3\2\2\2\u062b\u062a\3\2\2\2\u062c\u0121\3\2\2\2\u062d\u062e"+
		"\5\u0124\u0093\2\u062e\u062f\7A\2\2\u062f\u0123\3\2\2\2\u0630\u0632\5"+
		"\u00b4[\2\u0631\u0630\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2\2\2"+
		"\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2\2\2\u0636\u0637"+
		"\5\u0086D\2\u0637\u0638\5~@\2\u0638\u0125\3\2\2\2\u0639\u0640\5\u012a"+
		"\u0096\2\u063a\u0640\5\u012e\u0098\2\u063b\u0640\5\u0136\u009c\2\u063c"+
		"\u0640\5\u0138\u009d\2\u063d\u0640\5\u014a\u00a6\2\u063e\u0640\5\u0150"+
		"\u00a9\2\u063f\u0639\3\2\2\2\u063f\u063a\3\2\2\2\u063f\u063b\3\2\2\2\u063f"+
		"\u063c\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u063e\3\2\2\2\u0640\u0127\3\2"+
		"\2\2\u0641\u0647\5\u012a\u0096\2\u0642\u0647\5\u0130\u0099\2\u0643\u0647"+
		"\5\u013a\u009e\2\u0644\u0647\5\u014c\u00a7\2\u0645\u0647\5\u0152\u00aa"+
		"\2\u0646\u0641\3\2\2\2\u0646\u0642\3\2\2\2\u0646\u0643\3\2\2\2\u0646\u0644"+
		"\3\2\2\2\u0646\u0645\3\2\2\2\u0647\u0129\3\2\2\2\u0648\u0655\5\u011c\u008f"+
		"\2\u0649\u0655\5\u012c\u0097\2\u064a\u0655\5\u0132\u009a\2\u064b\u0655"+
		"\5\u013c\u009f\2\u064c\u0655\5\u013e\u00a0\2\u064d\u0655\5\u014e\u00a8"+
		"\2\u064e\u0655\5\u0162\u00b2\2\u064f\u0655\5\u0164\u00b3\2\u0650\u0655"+
		"\5\u0166\u00b4\2\u0651\u0655\5\u016a\u00b6\2\u0652\u0655\5\u0168\u00b5"+
		"\2\u0653\u0655\5\u016c\u00b7\2\u0654\u0648\3\2\2\2\u0654\u0649\3\2\2\2"+
		"\u0654\u064a\3\2\2\2\u0654\u064b\3\2\2\2\u0654\u064c\3\2\2\2\u0654\u064d"+
		"\3\2\2\2\u0654\u064e\3\2\2\2\u0654\u064f\3\2\2\2\u0654\u0650\3\2\2\2\u0654"+
		"\u0651\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0655\u012b\3\2"+
		"\2\2\u0656\u0657\7A\2\2\u0657\u012d\3\2\2\2\u0658\u0659\7h\2\2\u0659\u065a"+
		"\7J\2\2\u065a\u065b\5\u0126\u0094\2\u065b\u012f\3\2\2\2\u065c\u065d\7"+
		"h\2\2\u065d\u065e\7J\2\2\u065e\u065f\5\u0128\u0095\2\u065f\u0131\3\2\2"+
		"\2\u0660\u0661\5\u0134\u009b\2\u0661\u0662\7A\2\2\u0662\u0133\3\2\2\2"+
		"\u0663\u066b\5\u01ca\u00e6\2\u0664\u066b\5\u01ee\u00f8\2\u0665\u066b\5"+
		"\u01f2\u00fa\2\u0666\u066b\5\u01fc\u00ff\2\u0667\u066b\5\u0200\u0101\2"+
		"\u0668\u066b\5\u01a8\u00d5\2\u0669\u066b\5\u0194\u00cb\2\u066a\u0663\3"+
		"\2\2\2\u066a\u0664\3\2\2\2\u066a\u0665\3\2\2\2\u066a\u0666\3\2\2\2\u066a"+
		"\u0667\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u0669\3\2\2\2\u066b\u0135\3\2"+
		"\2\2\u066c\u066d\7\30\2\2\u066d\u066e\7;\2\2\u066e\u066f\5\u01be\u00e0"+
		"\2\u066f\u0670\7<\2\2\u0670\u0671\5\u0126\u0094\2\u0671\u0137\3\2\2\2"+
		"\u0672\u0673\7\30\2\2\u0673\u0674\7;\2\2\u0674\u0675\5\u01be\u00e0\2\u0675"+
		"\u0676\7<\2\2\u0676\u0677\5\u0128\u0095\2\u0677\u0678\7\21\2\2\u0678\u0679"+
		"\5\u0126\u0094\2\u0679\u0139\3\2\2\2\u067a\u067b\7\30\2\2\u067b\u067c"+
		"\7;\2\2\u067c\u067d\5\u01be\u00e0\2\u067d\u067e\7<\2\2\u067e\u067f\5\u0128"+
		"\u0095\2\u067f\u0680\7\21\2\2\u0680\u0681\5\u0128\u0095\2\u0681\u013b"+
		"\3\2\2\2\u0682\u0683\7\4\2\2\u0683\u0684\5\u01be\u00e0\2\u0684\u0685\7"+
		"A\2\2\u0685\u068d\3\2\2\2\u0686\u0687\7\4\2\2\u0687\u0688\5\u01be\u00e0"+
		"\2\u0688\u0689\7J\2\2\u0689\u068a\5\u01be\u00e0\2\u068a\u068b\7A\2\2\u068b"+
		"\u068d\3\2\2\2\u068c\u0682\3\2\2\2\u068c\u0686\3\2\2\2\u068d\u013d\3\2"+
		"\2\2\u068e\u068f\7+\2\2\u068f\u0690\7;\2\2\u0690\u0691\5\u01be\u00e0\2"+
		"\u0691\u0692\7<\2\2\u0692\u0693\5\u0140\u00a1\2\u0693\u013f\3\2\2\2\u0694"+
		"\u0698\7=\2\2\u0695\u0697\5\u0142\u00a2\2\u0696\u0695\3\2\2\2\u0697\u069a"+
		"\3\2\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069e\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069b\u069d\5\u0146\u00a4\2\u069c\u069b\3\2\2\2\u069d\u06a0"+
		"\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0"+
		"\u069e\3\2\2\2\u06a1\u06a2\7>\2\2\u06a2\u0141\3\2\2\2\u06a3\u06a4\5\u0144"+
		"\u00a3\2\u06a4\u06a5\5\u011e\u0090\2\u06a5\u0143\3\2\2\2\u06a6\u06aa\5"+
		"\u0146\u00a4\2\u06a7\u06a9\5\u0146\u00a4\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac"+
		"\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u0145\3\2\2\2\u06ac"+
		"\u06aa\3\2\2\2\u06ad\u06ae\7\b\2\2\u06ae\u06af\5\u01bc\u00df\2\u06af\u06b0"+
		"\7J\2\2\u06b0\u06b8\3\2\2\2\u06b1\u06b2\7\b\2\2\u06b2\u06b3\5\u0148\u00a5"+
		"\2\u06b3\u06b4\7J\2\2\u06b4\u06b8\3\2\2\2\u06b5\u06b6\7\16\2\2\u06b6\u06b8"+
		"\7J\2\2\u06b7\u06ad\3\2\2\2\u06b7\u06b1\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8"+
		"\u0147\3\2\2\2\u06b9\u06ba\7h\2\2\u06ba\u0149\3\2\2\2\u06bb\u06bc\7\64"+
		"\2\2\u06bc\u06bd\7;\2\2\u06bd\u06be\5\u01be\u00e0\2\u06be\u06bf\7<\2\2"+
		"\u06bf\u06c0\5\u0126\u0094\2\u06c0\u014b\3\2\2\2\u06c1\u06c2\7\64\2\2"+
		"\u06c2\u06c3\7;\2\2\u06c3\u06c4\5\u01be\u00e0\2\u06c4\u06c5\7<\2\2\u06c5"+
		"\u06c6\5\u0128\u0095\2\u06c6\u014d\3\2\2\2\u06c7\u06c8\7\17\2\2\u06c8"+
		"\u06c9\5\u0126\u0094\2\u06c9\u06ca\7\64\2\2\u06ca\u06cb\7;\2\2\u06cb\u06cc"+
		"\5\u01be\u00e0\2\u06cc\u06cd\7<\2\2\u06cd\u06ce\7A\2\2\u06ce\u014f\3\2"+
		"\2\2\u06cf\u06d2\5\u0154\u00ab\2\u06d0\u06d2\5\u015e\u00b0\2\u06d1\u06cf"+
		"\3\2\2\2\u06d1\u06d0\3\2\2\2\u06d2\u0151\3\2\2\2\u06d3\u06d6\5\u0156\u00ac"+
		"\2\u06d4\u06d6\5\u0160\u00b1\2\u06d5\u06d3\3\2\2\2\u06d5\u06d4\3\2\2\2"+
		"\u06d6\u0153\3\2\2\2\u06d7\u06d8\7\27\2\2\u06d8\u06da\7;\2\2\u06d9\u06db"+
		"\5\u0158\u00ad\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\3"+
		"\2\2\2\u06dc\u06de\7A\2\2\u06dd\u06df\5\u01be\u00e0\2\u06de\u06dd\3\2"+
		"\2\2\u06de\u06df\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\7A\2\2\u06e1"+
		"\u06e3\5\u015a\u00ae\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e5\7<\2\2\u06e5\u06e6\5\u0126\u0094\2\u06e6\u0155\3"+
		"\2\2\2\u06e7\u06e8\7\27\2\2\u06e8\u06ea\7;\2\2\u06e9\u06eb\5\u0158\u00ad"+
		"\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee"+
		"\7A\2\2\u06ed\u06ef\5\u01be\u00e0\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3"+
		"\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f2\7A\2\2\u06f1\u06f3\5\u015a\u00ae"+
		"\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5"+
		"\7<\2\2\u06f5\u06f6\5\u0128\u0095\2\u06f6\u0157\3\2\2\2\u06f7\u06fa\5"+
		"\u015c\u00af\2\u06f8\u06fa\5\u0124\u0093\2\u06f9\u06f7\3\2\2\2\u06f9\u06f8"+
		"\3\2\2\2\u06fa\u0159\3\2\2\2\u06fb\u06fc\5\u015c\u00af\2\u06fc\u015b\3"+
		"\2\2\2\u06fd\u0702\5\u0134\u009b\2\u06fe\u06ff\7B\2\2\u06ff\u0701\5\u0134"+
		"\u009b\2\u0700\u06fe\3\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702"+
		"\u0703\3\2\2\2\u0703\u015d\3\2\2\2\u0704\u0702\3\2\2\2\u0705\u0706\7\27"+
		"\2\2\u0706\u070a\7;\2\2\u0707\u0709\5\u00b4[\2\u0708\u0707\3\2\2\2\u0709"+
		"\u070c\3\2\2\2\u070a\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2"+
		"\2\2\u070c\u070a\3\2\2\2\u070d\u070e\5\u0086D\2\u070e\u070f\5\u0082B\2"+
		"\u070f\u0710\7J\2\2\u0710\u0711\5\u01be\u00e0\2\u0711\u0712\7<\2\2\u0712"+
		"\u0713\5\u0126\u0094\2\u0713\u015f\3\2\2\2\u0714\u0715\7\27\2\2\u0715"+
		"\u0719\7;\2\2\u0716\u0718\5\u00b4[\2\u0717\u0716\3\2\2\2\u0718\u071b\3"+
		"\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071c\3\2\2\2\u071b"+
		"\u0719\3\2\2\2\u071c\u071d\5\u0086D\2\u071d\u071e\5\u0082B\2\u071e\u071f"+
		"\7J\2\2\u071f\u0720\5\u01be\u00e0\2\u0720\u0721\7<\2\2\u0721\u0722\5\u0128"+
		"\u0095\2\u0722\u0161\3\2\2\2\u0723\u0725\7\6\2\2\u0724\u0726\7h\2\2\u0725"+
		"\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\7A"+
		"\2\2\u0728\u0163\3\2\2\2\u0729\u072b\7\r\2\2\u072a\u072c\7h\2\2\u072b"+
		"\u072a\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072e\7A"+
		"\2\2\u072e\u0165\3\2\2\2\u072f\u0731\7&\2\2\u0730\u0732\5\u01be\u00e0"+
		"\2\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734"+
		"\7A\2\2\u0734\u0167\3\2\2\2\u0735\u0736\7.\2\2\u0736\u0737\5\u01be\u00e0"+
		"\2\u0737\u0738\7A\2\2\u0738\u0169\3\2\2\2\u0739\u073a\7,\2\2\u073a\u073b"+
		"\7;\2\2\u073b\u073c\5\u01be\u00e0\2\u073c\u073d\7<\2\2\u073d\u073e\5\u011c"+
		"\u008f\2\u073e\u016b\3\2\2\2\u073f\u0740\7\61\2\2\u0740\u0741\5\u011c"+
		"\u008f\2\u0741\u0742\5\u016e\u00b8\2\u0742\u074c\3\2\2\2\u0743\u0744\7"+
		"\61\2\2\u0744\u0746\5\u011c\u008f\2\u0745\u0747\5\u016e\u00b8\2\u0746"+
		"\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\5\u0176"+
		"\u00bc\2\u0749\u074c\3\2\2\2\u074a\u074c\5\u0178\u00bd\2\u074b\u073f\3"+
		"\2\2\2\u074b\u0743\3\2\2\2\u074b\u074a\3\2\2\2\u074c\u016d\3\2\2\2\u074d"+
		"\u0751\5\u0170\u00b9\2\u074e\u0750\5\u0170\u00b9\2\u074f\u074e\3\2\2\2"+
		"\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u016f"+
		"\3\2\2\2\u0753\u0751\3\2\2\2\u0754\u0755\7\t\2\2\u0755\u0756\7;\2\2\u0756"+
		"\u0757\5\u0172\u00ba\2\u0757\u0758\7<\2\2\u0758\u0759\5\u011c\u008f\2"+
		"\u0759\u0171\3\2\2\2\u075a\u075c\5\u00b4[\2\u075b\u075a\3\2\2\2\u075c"+
		"\u075f\3\2\2\2\u075d\u075b\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\3\2"+
		"\2\2\u075f\u075d\3\2\2\2\u0760\u0761\5\u0174\u00bb\2\u0761\u0762\5\u0082"+
		"B\2\u0762\u0173\3\2\2\2\u0763\u0768\5\u008eH\2\u0764\u0765\7X\2\2\u0765"+
		"\u0767\5\36\20\2\u0766\u0764\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3"+
		"\2\2\2\u0768\u0769\3\2\2\2\u0769\u0175\3\2\2\2\u076a\u0768\3\2\2\2\u076b"+
		"\u076c\7\25\2\2\u076c\u076d\5\u011c\u008f\2\u076d\u0177\3\2\2\2\u076e"+
		"\u076f\7\61\2\2\u076f\u0770\5\u017a\u00be\2\u0770\u0772\5\u011c\u008f"+
		"\2\u0771\u0773\5\u016e\u00b8\2\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2"+
		"\u0773\u0775\3\2\2\2\u0774\u0776\5\u0176\u00bc\2\u0775\u0774\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u0179\3\2\2\2\u0777\u0778\7;\2\2\u0778\u077a\5\u017c"+
		"\u00bf\2\u0779\u077b\7A\2\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u077c\3\2\2\2\u077c\u077d\7<\2\2\u077d\u017b\3\2\2\2\u077e\u0783\5\u017e"+
		"\u00c0\2\u077f\u0780\7A\2\2\u0780\u0782\5\u017e\u00c0\2\u0781\u077f\3"+
		"\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u017d\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u0788\5\u00b4[\2\u0787\u0786"+
		"\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2\2\2\u078a"+
		"\u078c\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u078d\5\u0086D\2\u078d\u078e"+
		"\5\u0082B\2\u078e\u078f\7D\2\2\u078f\u0790\5\u01be\u00e0\2\u0790\u017f"+
		"\3\2\2\2\u0791\u0794\5\u018e\u00c8\2\u0792\u0794\5\u01b6\u00dc\2\u0793"+
		"\u0791\3\2\2\2\u0793\u0792\3\2\2\2\u0794\u0798\3\2\2\2\u0795\u0797\5\u0188"+
		"\u00c5\2\u0796\u0795\3\2\2\2\u0797\u079a\3\2\2\2\u0798\u0796\3\2\2\2\u0798"+
		"\u0799\3\2\2\2\u0799\u0181\3\2\2\2\u079a\u0798\3\2\2\2\u079b\u07b9\5\2"+
		"\2\2\u079c\u07a1\5D#\2\u079d\u079e\7?\2\2\u079e\u07a0\7@\2\2\u079f\u079d"+
		"\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2"+
		"\u07a4\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4\u07a5\7C\2\2\u07a5\u07a6\7\13"+
		"\2\2\u07a6\u07b9\3\2\2\2\u07a7\u07a8\7\62\2\2\u07a8\u07a9\7C\2\2\u07a9"+
		"\u07b9\7\13\2\2\u07aa\u07b9\7-\2\2\u07ab\u07ac\5D#\2\u07ac\u07ad\7C\2"+
		"\2\u07ad\u07ae\7-\2\2\u07ae\u07b9\3\2\2\2\u07af\u07b0\7;\2\2\u07b0\u07b1"+
		"\5\u01be\u00e0\2\u07b1\u07b2\7<\2\2\u07b2\u07b9\3\2\2\2\u07b3\u07b9\5"+
		"\u0194\u00cb\2\u07b4\u07b9\5\u019c\u00cf\2\u07b5\u07b9\5\u01a2\u00d2\2"+
		"\u07b6\u07b9\5\u01a8\u00d5\2\u07b7\u07b9\5\u01b0\u00d9\2\u07b8\u079b\3"+
		"\2\2\2\u07b8\u079c\3\2\2\2\u07b8\u07a7\3\2\2\2\u07b8\u07aa\3\2\2\2\u07b8"+
		"\u07ab\3\2\2\2\u07b8\u07af\3\2\2\2\u07b8\u07b3\3\2\2\2\u07b8\u07b4\3\2"+
		"\2\2\u07b8\u07b5\3\2\2\2\u07b8\u07b6\3\2\2\2\u07b8\u07b7\3\2\2\2\u07b9"+
		"\u0183\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u0185\3\2\2\2\u07bc\u07d9\5\2"+
		"\2\2\u07bd\u07c2\5D#\2\u07be\u07bf\7?\2\2\u07bf\u07c1\7@\2\2\u07c0\u07be"+
		"\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3"+
		"\u07c5\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07c6\7C\2\2\u07c6\u07c7\7\13"+
		"\2\2\u07c7\u07d9\3\2\2\2\u07c8\u07c9\7\62\2\2\u07c9\u07ca\7C\2\2\u07ca"+
		"\u07d9\7\13\2\2\u07cb\u07d9\7-\2\2\u07cc\u07cd\5D#\2\u07cd\u07ce\7C\2"+
		"\2\u07ce\u07cf\7-\2\2\u07cf\u07d9\3\2\2\2\u07d0\u07d1\7;\2\2\u07d1\u07d2"+
		"\5\u01be\u00e0\2\u07d2\u07d3\7<\2\2\u07d3\u07d9\3\2\2\2\u07d4\u07d9\5"+
		"\u0194\u00cb\2\u07d5\u07d9\5\u019c\u00cf\2\u07d6\u07d9\5\u01a8\u00d5\2"+
		"\u07d7\u07d9\5\u01b0\u00d9\2\u07d8\u07bc\3\2\2\2\u07d8\u07bd\3\2\2\2\u07d8"+
		"\u07c8\3\2\2\2\u07d8\u07cb\3\2\2\2\u07d8\u07cc\3\2\2\2\u07d8\u07d0\3\2"+
		"\2\2\u07d8\u07d4\3\2\2\2\u07d8\u07d5\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8"+
		"\u07d7\3\2\2\2\u07d9\u0187\3\2\2\2\u07da\u07e0\5\u0196\u00cc\2\u07db\u07e0"+
		"\5\u019e\u00d0\2\u07dc\u07e0\5\u01a4\u00d3\2\u07dd\u07e0\5\u01aa\u00d6"+
		"\2\u07de\u07e0\5\u01b2\u00da\2\u07df\u07da\3\2\2\2\u07df\u07db\3\2\2\2"+
		"\u07df\u07dc\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u0189"+
		"\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u018b\3\2\2\2\u07e3\u07e8\5\u0196\u00cc"+
		"\2\u07e4\u07e8\5\u019e\u00d0\2\u07e5\u07e8\5\u01aa\u00d6\2\u07e6\u07e8"+
		"\5\u01b2\u00da\2\u07e7\u07e3\3\2\2\2\u07e7\u07e4\3\2\2\2\u07e7\u07e5\3"+
		"\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u018d\3\2\2\2\u07e9\u0812\5\2\2\2\u07ea"+
		"\u07ef\5D#\2\u07eb\u07ec\7?\2\2\u07ec\u07ee\7@\2\2\u07ed\u07eb\3\2\2\2"+
		"\u07ee\u07f1\3\2\2\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2"+
		"\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2\u07f3\7C\2\2\u07f3\u07f4\7\13\2\2\u07f4"+
		"\u0812\3\2\2\2\u07f5\u07fa\5\u0088E\2\u07f6\u07f7\7?\2\2\u07f7\u07f9\7"+
		"@\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd\u07fe\7C"+
		"\2\2\u07fe\u07ff\7\13\2\2\u07ff\u0812\3\2\2\2\u0800\u0801\7\62\2\2\u0801"+
		"\u0802\7C\2\2\u0802\u0812\7\13\2\2\u0803\u0812\7-\2\2\u0804\u0805\5D#"+
		"\2\u0805\u0806\7C\2\2\u0806\u0807\7-\2\2\u0807\u0812\3\2\2\2\u0808\u0809"+
		"\7;\2\2\u0809\u080a\5\u01be\u00e0\2\u080a\u080b\7<\2\2\u080b\u0812\3\2"+
		"\2\2\u080c\u0812\5\u0198\u00cd\2\u080d\u0812\5\u01a0\u00d1\2\u080e\u0812"+
		"\5\u01a6\u00d4\2\u080f\u0812\5\u01ac\u00d7\2\u0810\u0812\5\u01b4\u00db"+
		"\2\u0811\u07e9\3\2\2\2\u0811\u07ea\3\2\2\2\u0811\u07f5\3\2\2\2\u0811\u0800"+
		"\3\2\2\2\u0811\u0803\3\2\2\2\u0811\u0804\3\2\2\2\u0811\u0808\3\2\2\2\u0811"+
		"\u080c\3\2\2\2\u0811\u080d\3\2\2\2\u0811\u080e\3\2\2\2\u0811\u080f\3\2"+
		"\2\2\u0811\u0810\3\2\2\2\u0812\u018f\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u0191\3\2\2\2\u0815\u083d\5\2\2\2\u0816\u081b\5D#\2\u0817\u0818\7?\2"+
		"\2\u0818\u081a\7@\2\2\u0819\u0817\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819"+
		"\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081e\3\2\2\2\u081d\u081b\3\2\2\2\u081e"+
		"\u081f\7C\2\2\u081f\u0820\7\13\2\2\u0820\u083d\3\2\2\2\u0821\u0826\5\u0088"+
		"E\2\u0822\u0823\7?\2\2\u0823\u0825\7@\2\2\u0824\u0822\3\2\2\2\u0825\u0828"+
		"\3\2\2\2\u0826\u0824\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0829\3\2\2\2\u0828"+
		"\u0826\3\2\2\2\u0829\u082a\7C\2\2\u082a\u082b\7\13\2\2\u082b\u083d\3\2"+
		"\2\2\u082c\u082d\7\62\2\2\u082d\u082e\7C\2\2\u082e\u083d\7\13\2\2\u082f"+
		"\u083d\7-\2\2\u0830\u0831\5D#\2\u0831\u0832\7C\2\2\u0832\u0833\7-\2\2"+
		"\u0833\u083d\3\2\2\2\u0834\u0835\7;\2\2\u0835\u0836\5\u01be\u00e0\2\u0836"+
		"\u0837\7<\2\2\u0837\u083d\3\2\2\2\u0838\u083d\5\u0198\u00cd\2\u0839\u083d"+
		"\5\u01a0\u00d1\2\u083a\u083d\5\u01ac\u00d7\2\u083b\u083d\5\u01b4\u00db"+
		"\2\u083c\u0815\3\2\2\2\u083c\u0816\3\2\2\2\u083c\u0821\3\2\2\2\u083c\u082c"+
		"\3\2\2\2\u083c\u082f\3\2\2\2\u083c\u0830\3\2\2\2\u083c\u0834\3\2\2\2\u083c"+
		"\u0838\3\2\2\2\u083c\u0839\3\2\2\2\u083c\u083a\3\2\2\2\u083c\u083b\3\2"+
		"\2\2\u083d\u0193\3\2\2\2\u083e\u0840\7!\2\2\u083f\u0841\58\35\2\u0840"+
		"\u083f\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0845\3\2\2\2\u0842\u0844\5\u0106"+
		"\u0084\2\u0843\u0842\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845"+
		"\u0846\3\2\2\2\u0846\u0848\3\2\2\2\u0847\u0845\3\2\2\2\u0848\u0853\7h"+
		"\2\2\u0849\u084d\7C\2\2\u084a\u084c\5\u0106\u0084\2\u084b\u084a\3\2\2"+
		"\2\u084c\u084f\3\2\2\2\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0850"+
		"\3\2\2\2\u084f\u084d\3\2\2\2\u0850\u0852\7h\2\2\u0851\u0849\3\2\2\2\u0852"+
		"\u0855\3\2\2\2\u0853\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0857\3\2"+
		"\2\2\u0855\u0853\3\2\2\2\u0856\u0858\5\u019a\u00ce\2\u0857\u0856\3\2\2"+
		"\2\u0857\u0858\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085b\7;\2\2\u085a\u085c"+
		"\5\u01ae\u00d8\2\u085b\u085a\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085d\3"+
		"\2\2\2\u085d\u085f\7<\2\2\u085e\u0860\5r:\2\u085f\u085e\3\2\2\2\u085f"+
		"\u0860\3\2\2\2\u0860\u0892\3\2\2\2\u0861\u0862\5H%\2\u0862\u0863\7C\2"+
		"\2\u0863\u0865\7!\2\2\u0864\u0866\58\35\2\u0865\u0864\3\2\2\2\u0865\u0866"+
		"\3\2\2\2\u0866\u086a\3\2\2\2\u0867\u0869\5\u0106\u0084\2\u0868\u0867\3"+
		"\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b"+
		"\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d\u086f\7h\2\2\u086e\u0870\5\u019a"+
		"\u00ce\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871"+
		"\u0873\7;\2\2\u0872\u0874\5\u01ae\u00d8\2\u0873\u0872\3\2\2\2\u0873\u0874"+
		"\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\7<\2\2\u0876\u0878\5r:\2\u0877"+
		"\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0892\3\2\2\2\u0879\u087a\5\u0180"+
		"\u00c1\2\u087a\u087b\7C\2\2\u087b\u087d\7!\2\2\u087c\u087e\58\35\2\u087d"+
		"\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0882\3\2\2\2\u087f\u0881\5\u0106"+
		"\u0084\2\u0880\u087f\3\2\2\2\u0881\u0884\3\2\2\2\u0882\u0880\3\2\2\2\u0882"+
		"\u0883\3\2\2\2\u0883\u0885\3\2\2\2\u0884\u0882\3\2\2\2\u0885\u0887\7h"+
		"\2\2\u0886\u0888\5\u019a\u00ce\2\u0887\u0886\3\2\2\2\u0887\u0888\3\2\2"+
		"\2\u0888\u0889\3\2\2\2\u0889\u088b\7;\2\2\u088a\u088c\5\u01ae\u00d8\2"+
		"\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088f"+
		"\7<\2\2\u088e\u0890\5r:\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u0892\3\2\2\2\u0891\u083e\3\2\2\2\u0891\u0861\3\2\2\2\u0891\u0879\3\2"+
		"\2\2\u0892\u0195\3\2\2\2\u0893\u0894\7C\2\2\u0894\u0896\7!\2\2\u0895\u0897"+
		"\58\35\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u089b\3\2\2\2\u0898"+
		"\u089a\5\u0106\u0084\2\u0899\u0898\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u0899"+
		"\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089e\3\2\2\2\u089d\u089b\3\2\2\2\u089e"+
		"\u08a0\7h\2\2\u089f\u08a1\5\u019a\u00ce\2\u08a0\u089f\3\2\2\2\u08a0\u08a1"+
		"\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a4\7;\2\2\u08a3\u08a5\5\u01ae\u00d8"+
		"\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a8"+
		"\7<\2\2\u08a7\u08a9\5r:\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9"+
		"\u0197\3\2\2\2\u08aa\u08ac\7!\2\2\u08ab\u08ad\58\35\2\u08ac\u08ab\3\2"+
		"\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08b1\3\2\2\2\u08ae\u08b0\5\u0106\u0084"+
		"\2\u08af\u08ae\3\2\2\2\u08b0\u08b3\3\2\2\2\u08b1\u08af\3\2\2\2\u08b1\u08b2"+
		"\3\2\2\2\u08b2\u08b4\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b4\u08bf\7h\2\2\u08b5"+
		"\u08b9\7C\2\2\u08b6\u08b8\5\u0106\u0084\2\u08b7\u08b6\3\2\2\2\u08b8\u08bb"+
		"\3\2\2\2\u08b9\u08b7\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bc\3\2\2\2\u08bb"+
		"\u08b9\3\2\2\2\u08bc\u08be\7h\2\2\u08bd\u08b5\3\2\2\2\u08be\u08c1\3\2"+
		"\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c3\3\2\2\2\u08c1"+
		"\u08bf\3\2\2\2\u08c2\u08c4\5\u019a\u00ce\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4"+
		"\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\7;\2\2\u08c6\u08c8\5\u01ae\u00d8"+
		"\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb"+
		"\7<\2\2\u08ca\u08cc\5r:\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc"+
		"\u08e6\3\2\2\2\u08cd\u08ce\5H%\2\u08ce\u08cf\7C\2\2\u08cf\u08d1\7!\2\2"+
		"\u08d0\u08d2\58\35\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d6"+
		"\3\2\2\2\u08d3\u08d5\5\u0106\u0084\2\u08d4\u08d3\3\2\2\2\u08d5\u08d8\3"+
		"\2\2\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8"+
		"\u08d6\3\2\2\2\u08d9\u08db\7h\2\2\u08da\u08dc\5\u019a\u00ce\2\u08db\u08da"+
		"\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08df\7;\2\2\u08de"+
		"\u08e0\5\u01ae\u00d8\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1"+
		"\3\2\2\2\u08e1\u08e3\7<\2\2\u08e2\u08e4\5r:\2\u08e3\u08e2\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08aa\3\2\2\2\u08e5\u08cd\3\2"+
		"\2\2\u08e6\u0199\3\2\2\2\u08e7\u08eb\58\35\2\u08e8\u08e9\7F\2\2\u08e9"+
		"\u08eb\7E\2\2\u08ea\u08e7\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u019b\3\2"+
		"\2\2\u08ec\u08ed\5\u0180\u00c1\2\u08ed\u08ee\7C\2\2\u08ee\u08ef\7h\2\2"+
		"\u08ef\u08fa\3\2\2\2\u08f0\u08f1\7*\2\2\u08f1\u08f2\7C\2\2\u08f2\u08fa"+
		"\7h\2\2\u08f3\u08f4\5D#\2\u08f4\u08f5\7C\2\2\u08f5\u08f6\7*\2\2\u08f6"+
		"\u08f7\7C\2\2\u08f7\u08f8\7h\2\2\u08f8\u08fa\3\2\2\2\u08f9\u08ec\3\2\2"+
		"\2\u08f9\u08f0\3\2\2\2\u08f9\u08f3\3\2\2\2\u08fa\u019d\3\2\2\2\u08fb\u08fc"+
		"\7C\2\2\u08fc\u08fd\7h\2\2\u08fd\u019f\3\2\2\2\u08fe\u08ff\7*\2\2\u08ff"+
		"\u0900\7C\2\2\u0900\u0908\7h\2\2\u0901\u0902\5D#\2\u0902\u0903\7C\2\2"+
		"\u0903\u0904\7*\2\2\u0904\u0905\7C\2\2\u0905\u0906\7h\2\2\u0906\u0908"+
		"\3\2\2\2\u0907\u08fe\3\2\2\2\u0907\u0901\3\2\2\2\u0908\u01a1\3\2\2\2\u0909"+
		"\u090a\5H%\2\u090a\u090b\7?\2\2\u090b\u090c\5\u01be\u00e0\2\u090c\u090d"+
		"\7@\2\2\u090d\u0914\3\2\2\2\u090e\u090f\5\u0186\u00c4\2\u090f\u0910\7"+
		"?\2\2\u0910\u0911\5\u01be\u00e0\2\u0911\u0912\7@\2\2\u0912\u0914\3\2\2"+
		"\2\u0913\u0909\3\2\2\2\u0913\u090e\3\2\2\2\u0914\u091c\3\2\2\2\u0915\u0916"+
		"\5\u0184\u00c3\2\u0916\u0917\7?\2\2\u0917\u0918\5\u01be\u00e0\2\u0918"+
		"\u0919\7@\2\2\u0919\u091b\3\2\2\2\u091a\u0915\3\2\2\2\u091b\u091e\3\2"+
		"\2\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u01a3\3\2\2\2\u091e"+
		"\u091c\3\2\2\2\u091f\u0920\5\u018c\u00c7\2\u0920\u0921\7?\2\2\u0921\u0922"+
		"\5\u01be\u00e0\2\u0922\u0923\7@\2\2\u0923\u092b\3\2\2\2\u0924\u0925\5"+
		"\u018a\u00c6\2\u0925\u0926\7?\2\2\u0926\u0927\5\u01be\u00e0\2\u0927\u0928"+
		"\7@\2\2\u0928\u092a\3\2\2\2\u0929\u0924\3\2\2\2\u092a\u092d\3\2\2\2\u092b"+
		"\u0929\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u01a5\3\2\2\2\u092d\u092b\3\2"+
		"\2\2\u092e\u092f\5H%\2\u092f\u0930\7?\2\2\u0930\u0931\5\u01be\u00e0\2"+
		"\u0931\u0932\7@\2\2\u0932\u0939\3\2\2\2\u0933\u0934\5\u0192\u00ca\2\u0934"+
		"\u0935\7?\2\2\u0935\u0936\5\u01be\u00e0\2\u0936\u0937\7@\2\2\u0937\u0939"+
		"\3\2\2\2\u0938\u092e\3\2\2\2\u0938\u0933\3\2\2\2\u0939\u0941\3\2\2\2\u093a"+
		"\u093b\5\u0190\u00c9\2\u093b\u093c\7?\2\2\u093c\u093d\5\u01be\u00e0\2"+
		"\u093d\u093e\7@\2\2\u093e\u0940\3\2\2\2\u093f\u093a\3\2\2\2\u0940\u0943"+
		"\3\2\2\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u01a7\3\2\2\2\u0943"+
		"\u0941\3\2\2\2\u0944\u0945\5\u00a8U\2\u0945\u0947\7;\2\2\u0946\u0948\5"+
		"\u01ae\u00d8\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2"+
		"\2\2\u0949\u094a\7<\2\2\u094a\u0989\3\2\2\2\u094b\u094c\5D#\2\u094c\u094e"+
		"\7C\2\2\u094d\u094f\58\35\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f"+
		"\u0950\3\2\2\2\u0950\u0951\7h\2\2\u0951\u0953\7;\2\2\u0952\u0954\5\u01ae"+
		"\u00d8\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955"+
		"\u0956\7<\2\2\u0956\u0989\3\2\2\2\u0957\u0958\5H%\2\u0958\u095a\7C\2\2"+
		"\u0959\u095b\58\35\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c"+
		"\3\2\2\2\u095c\u095d\7h\2\2\u095d\u095f\7;\2\2\u095e\u0960\5\u01ae\u00d8"+
		"\2\u095f\u095e\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0962"+
		"\7<\2\2\u0962\u0989\3\2\2\2\u0963\u0964\5\u0180\u00c1\2\u0964\u0966\7"+
		"C\2\2\u0965\u0967\58\35\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2\u0967"+
		"\u0968\3\2\2\2\u0968\u0969\7h\2\2\u0969\u096b\7;\2\2\u096a\u096c\5\u01ae"+
		"\u00d8";
	private static final String _serializedATNSegment1 =
		"\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e"+
		"\7<\2\2\u096e\u0989\3\2\2\2\u096f\u0970\7*\2\2\u0970\u0972\7C\2\2\u0971"+
		"\u0973\58\35\2\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2"+
		"\2\2\u0974\u0975\7h\2\2\u0975\u0977\7;\2\2\u0976\u0978\5\u01ae\u00d8\2"+
		"\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u0989"+
		"\7<\2\2\u097a\u097b\5D#\2\u097b\u097c\7C\2\2\u097c\u097d\7*\2\2\u097d"+
		"\u097f\7C\2\2\u097e\u0980\58\35\2\u097f\u097e\3\2\2\2\u097f\u0980\3\2"+
		"\2\2\u0980\u0981\3\2\2\2\u0981\u0982\7h\2\2\u0982\u0984\7;\2\2\u0983\u0985"+
		"\5\u01ae\u00d8\2\u0984\u0983\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3"+
		"\2\2\2\u0986\u0987\7<\2\2\u0987\u0989\3\2\2\2\u0988\u0944\3\2\2\2\u0988"+
		"\u094b\3\2\2\2\u0988\u0957\3\2\2\2\u0988\u0963\3\2\2\2\u0988\u096f\3\2"+
		"\2\2\u0988\u097a\3\2\2\2\u0989\u01a9\3\2\2\2\u098a\u098c\7C\2\2\u098b"+
		"\u098d\58\35\2\u098c\u098b\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\3\2"+
		"\2\2\u098e\u098f\7h\2\2\u098f\u0991\7;\2\2\u0990\u0992\5\u01ae\u00d8\2"+
		"\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994"+
		"\7<\2\2\u0994\u01ab\3\2\2\2\u0995\u0996\5\u00a8U\2\u0996\u0998\7;\2\2"+
		"\u0997\u0999\5\u01ae\u00d8\2\u0998\u0997\3\2\2\2\u0998\u0999\3\2\2\2\u0999"+
		"\u099a\3\2\2\2\u099a\u099b\7<\2\2\u099b\u09ce\3\2\2\2\u099c\u099d\5D#"+
		"\2\u099d\u099f\7C\2\2\u099e\u09a0\58\35\2\u099f\u099e\3\2\2\2\u099f\u09a0"+
		"\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\7h\2\2\u09a2\u09a4\7;\2\2\u09a3"+
		"\u09a5\5\u01ae\u00d8\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6"+
		"\3\2\2\2\u09a6\u09a7\7<\2\2\u09a7\u09ce\3\2\2\2\u09a8\u09a9\5H%\2\u09a9"+
		"\u09ab\7C\2\2\u09aa\u09ac\58\35\2\u09ab\u09aa\3\2\2\2\u09ab\u09ac\3\2"+
		"\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\7h\2\2\u09ae\u09b0\7;\2\2\u09af\u09b1"+
		"\5\u01ae\u00d8\2\u09b0\u09af\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\3"+
		"\2\2\2\u09b2\u09b3\7<\2\2\u09b3\u09ce\3\2\2\2\u09b4\u09b5\7*\2\2\u09b5"+
		"\u09b7\7C\2\2\u09b6\u09b8\58\35\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8\3\2"+
		"\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\7h\2\2\u09ba\u09bc\7;\2\2\u09bb\u09bd"+
		"\5\u01ae\u00d8\2\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\3"+
		"\2\2\2\u09be\u09ce\7<\2\2\u09bf\u09c0\5D#\2\u09c0\u09c1\7C\2\2\u09c1\u09c2"+
		"\7*\2\2\u09c2\u09c4\7C\2\2\u09c3\u09c5\58\35\2\u09c4\u09c3\3\2\2\2\u09c4"+
		"\u09c5\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\7h\2\2\u09c7\u09c9\7;\2"+
		"\2\u09c8\u09ca\5\u01ae\u00d8\2\u09c9\u09c8\3\2\2\2\u09c9\u09ca\3\2\2\2"+
		"\u09ca\u09cb\3\2\2\2\u09cb\u09cc\7<\2\2\u09cc\u09ce\3\2\2\2\u09cd\u0995"+
		"\3\2\2\2\u09cd\u099c\3\2\2\2\u09cd\u09a8\3\2\2\2\u09cd\u09b4\3\2\2\2\u09cd"+
		"\u09bf\3\2\2\2\u09ce\u01ad\3\2\2\2\u09cf\u09d4\5\u01be\u00e0\2\u09d0\u09d1"+
		"\7B\2\2\u09d1\u09d3\5\u01be\u00e0\2\u09d2\u09d0\3\2\2\2\u09d3\u09d6\3"+
		"\2\2\2\u09d4\u09d2\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u01af\3\2\2\2\u09d6"+
		"\u09d4\3\2\2\2\u09d7\u09d8\5H%\2\u09d8\u09da\7\\\2\2\u09d9\u09db\58\35"+
		"\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09dd"+
		"\7h\2\2\u09dd\u0a07\3\2\2\2\u09de\u09df\5\32\16\2\u09df\u09e1\7\\\2\2"+
		"\u09e0\u09e2\58\35\2\u09e1\u09e0\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3"+
		"\3\2\2\2\u09e3\u09e4\7h\2\2\u09e4\u0a07\3\2\2\2\u09e5\u09e6\5\u0180\u00c1"+
		"\2\u09e6\u09e8\7\\\2\2\u09e7\u09e9\58\35\2\u09e8\u09e7\3\2\2\2\u09e8\u09e9"+
		"\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09eb\7h\2\2\u09eb\u0a07\3\2\2\2\u09ec"+
		"\u09ed\7*\2\2\u09ed\u09ef\7\\\2\2\u09ee\u09f0\58\35\2\u09ef\u09ee\3\2"+
		"\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u0a07\7h\2\2\u09f2"+
		"\u09f3\5D#\2\u09f3\u09f4\7C\2\2\u09f4\u09f5\7*\2\2\u09f5\u09f7\7\\\2\2"+
		"\u09f6\u09f8\58\35\2\u09f7\u09f6\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9"+
		"\3\2\2\2\u09f9\u09fa\7h\2\2\u09fa\u0a07\3\2\2\2\u09fb\u09fc\5\36\20\2"+
		"\u09fc\u09fe\7\\\2\2\u09fd\u09ff\58\35\2\u09fe\u09fd\3\2\2\2\u09fe\u09ff"+
		"\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\7!\2\2\u0a01\u0a07\3\2\2\2\u0a02"+
		"\u0a03\5,\27\2\u0a03\u0a04\7\\\2\2\u0a04\u0a05\7!\2\2\u0a05\u0a07\3\2"+
		"\2\2\u0a06\u09d7\3\2\2\2\u0a06\u09de\3\2\2\2\u0a06\u09e5\3\2\2\2\u0a06"+
		"\u09ec\3\2\2\2\u0a06\u09f2\3\2\2\2\u0a06\u09fb\3\2\2\2\u0a06\u0a02\3\2"+
		"\2\2\u0a07\u01b1\3\2\2\2\u0a08\u0a0a\7\\\2\2\u0a09\u0a0b\58\35\2\u0a0a"+
		"\u0a09\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\7h"+
		"\2\2\u0a0d\u01b3\3\2\2\2\u0a0e\u0a0f\5H%\2\u0a0f\u0a11\7\\\2\2\u0a10\u0a12"+
		"\58\35\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13"+
		"\u0a14\7h\2\2\u0a14\u0a37\3\2\2\2\u0a15\u0a16\5\32\16\2\u0a16\u0a18\7"+
		"\\\2\2\u0a17\u0a19\58\35\2\u0a18\u0a17\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19"+
		"\u0a1a\3\2\2\2\u0a1a\u0a1b\7h\2\2\u0a1b\u0a37\3\2\2\2\u0a1c\u0a1d\7*\2"+
		"\2\u0a1d\u0a1f\7\\\2\2\u0a1e\u0a20\58\35\2\u0a1f\u0a1e\3\2\2\2\u0a1f\u0a20"+
		"\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a37\7h\2\2\u0a22\u0a23\5D#\2\u0a23"+
		"\u0a24\7C\2\2\u0a24\u0a25\7*\2\2\u0a25\u0a27\7\\\2\2\u0a26\u0a28\58\35"+
		"\2\u0a27\u0a26\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a"+
		"\7h\2\2\u0a2a\u0a37\3\2\2\2\u0a2b\u0a2c\5\36\20\2\u0a2c\u0a2e\7\\\2\2"+
		"\u0a2d\u0a2f\58\35\2\u0a2e\u0a2d\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a30"+
		"\3\2\2\2\u0a30\u0a31\7!\2\2\u0a31\u0a37\3\2\2\2\u0a32\u0a33\5,\27\2\u0a33"+
		"\u0a34\7\\\2\2\u0a34\u0a35\7!\2\2\u0a35\u0a37\3\2\2\2\u0a36\u0a0e\3\2"+
		"\2\2\u0a36\u0a15\3\2\2\2\u0a36\u0a1c\3\2\2\2\u0a36\u0a22\3\2\2\2\u0a36"+
		"\u0a2b\3\2\2\2\u0a36\u0a32\3\2\2\2\u0a37\u01b5\3\2\2\2\u0a38\u0a39\7!"+
		"\2\2\u0a39\u0a3a\5\22\n\2\u0a3a\u0a3c\5\u01b8\u00dd\2\u0a3b\u0a3d\5.\30"+
		"\2\u0a3c\u0a3b\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a4f\3\2\2\2\u0a3e\u0a3f"+
		"\7!\2\2\u0a3f\u0a40\5\34\17\2\u0a40\u0a42\5\u01b8\u00dd\2\u0a41\u0a43"+
		"\5.\30\2\u0a42\u0a41\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a4f\3\2\2\2\u0a44"+
		"\u0a45\7!\2\2\u0a45\u0a46\5\22\n\2\u0a46\u0a47\5.\30\2\u0a47\u0a48\5\u0118"+
		"\u008d\2\u0a48\u0a4f\3\2\2\2\u0a49\u0a4a\7!\2\2\u0a4a\u0a4b\5\34\17\2"+
		"\u0a4b\u0a4c\5.\30\2\u0a4c\u0a4d\5\u0118\u008d\2\u0a4d\u0a4f\3\2\2\2\u0a4e"+
		"\u0a38\3\2\2\2\u0a4e\u0a3e\3\2\2\2\u0a4e\u0a44\3\2\2\2\u0a4e\u0a49\3\2"+
		"\2\2\u0a4f\u01b7\3\2\2\2\u0a50\u0a54\5\u01ba\u00de\2\u0a51\u0a53\5\u01ba"+
		"\u00de\2\u0a52\u0a51\3\2\2\2\u0a53\u0a56\3\2\2\2\u0a54\u0a52\3\2\2\2\u0a54"+
		"\u0a55\3\2\2\2\u0a55\u01b9\3\2\2\2\u0a56\u0a54\3\2\2\2\u0a57\u0a59\5\u0106"+
		"\u0084\2\u0a58\u0a57\3\2\2\2\u0a59\u0a5c\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5a"+
		"\u0a5b\3\2\2\2\u0a5b\u0a5d\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5d\u0a5e\7?"+
		"\2\2\u0a5e\u0a5f\5\u01be\u00e0\2\u0a5f\u0a60\7@\2\2\u0a60\u01bb\3\2\2"+
		"\2\u0a61\u0a62\5\u01be\u00e0\2\u0a62\u01bd\3\2\2\2\u0a63\u0a66\5\u01c0"+
		"\u00e1\2\u0a64\u0a66\5\u01c8\u00e5\2\u0a65\u0a63\3\2\2\2\u0a65\u0a64\3"+
		"\2\2\2\u0a66\u01bf\3\2\2\2\u0a67\u0a68\5\u01c2\u00e2\2\u0a68\u0a69\7["+
		"\2\2\u0a69\u0a6a\5\u01c6\u00e4\2\u0a6a\u01c1\3\2\2\2\u0a6b\u0a76\7h\2"+
		"\2\u0a6c\u0a6e\7;\2\2\u0a6d\u0a6f\5\u00aaV\2\u0a6e\u0a6d\3\2\2\2\u0a6e"+
		"\u0a6f\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a76\7<\2\2\u0a71\u0a72\7;\2"+
		"\2\u0a72\u0a73\5\u01c4\u00e3\2\u0a73\u0a74\7<\2\2\u0a74\u0a76\3\2\2\2"+
		"\u0a75\u0a6b\3\2\2\2\u0a75\u0a6c\3\2\2\2\u0a75\u0a71\3\2\2\2\u0a76\u01c3"+
		"\3\2\2\2\u0a77\u0a7c\7h\2\2\u0a78\u0a79\7B\2\2\u0a79\u0a7b\7h\2\2\u0a7a"+
		"\u0a78\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7d\3\2"+
		"\2\2\u0a7d\u01c5\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7f\u0a82\5\u01be\u00e0"+
		"\2\u0a80\u0a82\5\u011c\u008f\2\u0a81\u0a7f\3\2\2\2\u0a81\u0a80\3\2\2\2"+
		"\u0a82\u01c7\3\2\2\2\u0a83\u0a86\5\u01d0\u00e9\2\u0a84\u0a86\5\u01ca\u00e6"+
		"\2\u0a85\u0a83\3\2\2\2\u0a85\u0a84\3\2\2\2\u0a86\u01c9\3\2\2\2\u0a87\u0a88"+
		"\5\u01cc\u00e7\2\u0a88\u0a89\5\u01ce\u00e8\2\u0a89\u0a8a\5\u01be\u00e0"+
		"\2\u0a8a\u01cb\3\2\2\2\u0a8b\u0a8f\5H%\2\u0a8c\u0a8f\5\u019c\u00cf\2\u0a8d"+
		"\u0a8f\5\u01a2\u00d2\2\u0a8e\u0a8b\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8e\u0a8d"+
		"\3\2\2\2\u0a8f\u01cd\3\2\2\2\u0a90\u0a91\t\4\2\2\u0a91\u01cf\3\2\2\2\u0a92"+
		"\u0a9a\5\u01d2\u00ea\2\u0a93\u0a94\5\u01d2\u00ea\2\u0a94\u0a95\7I\2\2"+
		"\u0a95\u0a96\5\u01be\u00e0\2\u0a96\u0a97\7J\2\2\u0a97\u0a98\5\u01d0\u00e9"+
		"\2\u0a98\u0a9a\3\2\2\2\u0a99\u0a92\3\2\2\2\u0a99\u0a93\3\2\2\2\u0a9a\u01d1"+
		"\3\2\2\2\u0a9b\u0a9c\b\u00ea\1\2\u0a9c\u0a9d\5\u01d4\u00eb\2\u0a9d\u0aa3"+
		"\3\2\2\2\u0a9e\u0a9f\f\3\2\2\u0a9f\u0aa0\7P\2\2\u0aa0\u0aa2\5\u01d4\u00eb"+
		"\2\u0aa1\u0a9e\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4"+
		"\3\2\2\2\u0aa4\u01d3\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6\u0aa7\b\u00eb\1"+
		"\2\u0aa7\u0aa8\5\u01d6\u00ec\2\u0aa8\u0aae\3\2\2\2\u0aa9\u0aaa\f\3\2\2"+
		"\u0aaa\u0aab\7O\2\2\u0aab\u0aad\5\u01d6\u00ec\2\u0aac\u0aa9\3\2\2\2\u0aad"+
		"\u0ab0\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u01d5\3\2"+
		"\2\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0ab2\b\u00ec\1\2\u0ab2\u0ab3\5\u01d8\u00ed"+
		"\2\u0ab3\u0ab9\3\2\2\2\u0ab4\u0ab5\f\3\2\2\u0ab5\u0ab6\7X\2\2\u0ab6\u0ab8"+
		"\5\u01d8\u00ed\2\u0ab7\u0ab4\3\2\2\2\u0ab8\u0abb\3\2\2\2\u0ab9\u0ab7\3"+
		"\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u01d7\3\2\2\2\u0abb\u0ab9\3\2\2\2\u0abc"+
		"\u0abd\b\u00ed\1\2\u0abd\u0abe\5\u01da\u00ee\2\u0abe\u0ac4\3\2\2\2\u0abf"+
		"\u0ac0\f\3\2\2\u0ac0\u0ac1\7Y\2\2\u0ac1\u0ac3\5\u01da\u00ee\2\u0ac2\u0abf"+
		"\3\2\2\2\u0ac3\u0ac6\3\2\2\2\u0ac4\u0ac2\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5"+
		"\u01d9\3\2\2\2\u0ac6\u0ac4\3\2\2\2\u0ac7\u0ac8\b\u00ee\1\2\u0ac8\u0ac9"+
		"\5\u01dc\u00ef\2\u0ac9\u0acf\3\2\2\2\u0aca\u0acb\f\3\2\2\u0acb\u0acc\7"+
		"W\2\2\u0acc\u0ace\5\u01dc\u00ef\2\u0acd\u0aca\3\2\2\2\u0ace\u0ad1\3\2"+
		"\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0\u01db\3\2\2\2\u0ad1"+
		"\u0acf\3\2\2\2\u0ad2\u0ad3\b\u00ef\1\2\u0ad3\u0ad4\5\u01de\u00f0\2\u0ad4"+
		"\u0add\3\2\2\2\u0ad5\u0ad6\f\4\2\2\u0ad6\u0ad7\7K\2\2\u0ad7\u0adc\5\u01de"+
		"\u00f0\2\u0ad8\u0ad9\f\3\2\2\u0ad9\u0ada\7N\2\2\u0ada\u0adc\5\u01de\u00f0"+
		"\2\u0adb\u0ad5\3\2\2\2\u0adb\u0ad8\3\2\2\2\u0adc\u0adf\3\2\2\2\u0add\u0adb"+
		"\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u01dd\3\2\2\2\u0adf\u0add\3\2\2\2\u0ae0"+
		"\u0ae1\b\u00f0\1\2\u0ae1\u0ae2\5\u01e0\u00f1\2\u0ae2\u0af4\3\2\2\2\u0ae3"+
		"\u0ae4\f\7\2\2\u0ae4\u0ae5\7F\2\2\u0ae5\u0af3\5\u01e0\u00f1\2\u0ae6\u0ae7"+
		"\f\6\2\2\u0ae7\u0ae8\7E\2\2\u0ae8\u0af3\5\u01e0\u00f1\2\u0ae9\u0aea\f"+
		"\5\2\2\u0aea\u0aeb\7L\2\2\u0aeb\u0af3\5\u01e0\u00f1\2\u0aec\u0aed\f\4"+
		"\2\2\u0aed\u0aee\7M\2\2\u0aee\u0af3\5\u01e0\u00f1\2\u0aef\u0af0\f\3\2"+
		"\2\u0af0\u0af1\7\34\2\2\u0af1\u0af3\5\32\16\2\u0af2\u0ae3\3\2\2\2\u0af2"+
		"\u0ae6\3\2\2\2\u0af2\u0ae9\3\2\2\2\u0af2\u0aec\3\2\2\2\u0af2\u0aef\3\2"+
		"\2\2\u0af3\u0af6\3\2\2\2\u0af4\u0af2\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5"+
		"\u01df\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af7\u0af8\b\u00f1\1\2\u0af8\u0af9"+
		"\5\u01e2\u00f2\2\u0af9\u0b09\3\2\2\2\u0afa\u0afb\f\5\2\2\u0afb\u0afc\7"+
		"F\2\2\u0afc\u0afd\7F\2\2\u0afd\u0b08\5\u01e2\u00f2\2\u0afe\u0aff\f\4\2"+
		"\2\u0aff\u0b00\7E\2\2\u0b00\u0b01\7E\2\2\u0b01\u0b08\5\u01e2\u00f2\2\u0b02"+
		"\u0b03\f\3\2\2\u0b03\u0b04\7E\2\2\u0b04\u0b05\7E\2\2\u0b05\u0b06\7E\2"+
		"\2\u0b06\u0b08\5\u01e2\u00f2\2\u0b07\u0afa\3\2\2\2\u0b07\u0afe\3\2\2\2"+
		"\u0b07\u0b02\3\2\2\2\u0b08\u0b0b\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a"+
		"\3\2\2\2\u0b0a\u01e1\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0c\u0b0d\b\u00f2\1"+
		"\2\u0b0d\u0b0e\5\u01e4\u00f3\2\u0b0e\u0b17\3\2\2\2\u0b0f\u0b10\f\4\2\2"+
		"\u0b10\u0b11\7S\2\2\u0b11\u0b16\5\u01e4\u00f3\2\u0b12\u0b13\f\3\2\2\u0b13"+
		"\u0b14\7T\2\2\u0b14\u0b16\5\u01e4\u00f3\2\u0b15\u0b0f\3\2\2\2\u0b15\u0b12"+
		"\3\2\2\2\u0b16\u0b19\3\2\2\2\u0b17\u0b15\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18"+
		"\u01e3\3\2\2\2\u0b19\u0b17\3\2\2\2\u0b1a\u0b1b\b\u00f3\1\2\u0b1b\u0b1c"+
		"\5\u01ea\u00f6\2\u0b1c\u0b28\3\2\2\2\u0b1d\u0b1e\f\5\2\2\u0b1e\u0b1f\7"+
		"U\2\2\u0b1f\u0b27\5\u01ea\u00f6\2\u0b20\u0b21\f\4\2\2\u0b21\u0b22\7V\2"+
		"\2\u0b22\u0b27\5\u01ea\u00f6\2\u0b23\u0b24\f\3\2\2\u0b24\u0b25\7Z\2\2"+
		"\u0b25\u0b27\5\u01ea\u00f6\2\u0b26\u0b1d\3\2\2\2\u0b26\u0b20\3\2\2\2\u0b26"+
		"\u0b23\3\2\2\2\u0b27\u0b2a\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b28\u0b29\3\2"+
		"\2\2\u0b29\u01e5\3\2\2\2\u0b2a\u0b28\3\2\2\2\u0b2b\u0b2c\7S\2\2\u0b2c"+
		"\u01e7\3\2\2\2\u0b2d\u0b2e\7T\2\2\u0b2e\u01e9\3\2\2\2\u0b2f\u0b39\5\u01ee"+
		"\u00f8\2\u0b30\u0b39\5\u01f2\u00fa\2\u0b31\u0b32\5\u01e6\u00f4\2\u0b32"+
		"\u0b33\5\u01ea\u00f6\2\u0b33\u0b39\3\2\2\2\u0b34\u0b35\5\u01e8\u00f5\2"+
		"\u0b35\u0b36\5\u01ea\u00f6\2\u0b36\u0b39\3\2\2\2\u0b37\u0b39\5\u01f8\u00fd"+
		"\2\u0b38\u0b2f\3\2\2\2\u0b38\u0b30\3\2\2\2\u0b38\u0b31\3\2\2\2\u0b38\u0b34"+
		"\3\2\2\2\u0b38\u0b37\3\2\2\2\u0b39\u01eb\3\2\2\2\u0b3a\u0b3b\7Q\2\2\u0b3b"+
		"\u01ed\3\2\2\2\u0b3c\u0b3d\5\u01ec\u00f7\2\u0b3d\u0b3e\5\u01ea\u00f6\2"+
		"\u0b3e\u01ef\3\2\2\2\u0b3f\u0b40\7R\2\2\u0b40\u01f1\3\2\2\2\u0b41\u0b42"+
		"\5\u01f0\u00f9\2\u0b42\u0b43\5\u01ea\u00f6\2\u0b43\u01f3\3\2\2\2\u0b44"+
		"\u0b45\7H\2\2\u0b45\u01f5\3\2\2\2\u0b46\u0b47\7G\2\2\u0b47\u01f7\3\2\2"+
		"\2\u0b48\u0b51\5\u01fa\u00fe\2\u0b49\u0b4a\5\u01f4\u00fb\2\u0b4a\u0b4b"+
		"\5\u01ea\u00f6\2\u0b4b\u0b51\3\2\2\2\u0b4c\u0b4d\5\u01f6\u00fc\2\u0b4d"+
		"\u0b4e\5\u01ea\u00f6\2\u0b4e\u0b51\3\2\2\2\u0b4f\u0b51\5\u0204\u0103\2"+
		"\u0b50\u0b48\3\2\2\2\u0b50\u0b49\3\2\2\2\u0b50\u0b4c\3\2\2\2\u0b50\u0b4f"+
		"\3\2\2\2\u0b51\u01f9\3\2\2\2\u0b52\u0b55\5\u0180\u00c1\2\u0b53\u0b55\5"+
		"H%\2\u0b54\u0b52\3\2\2\2\u0b54\u0b53\3\2\2\2\u0b55\u0b5a\3\2\2\2\u0b56"+
		"\u0b59\5\u01fe\u0100\2\u0b57\u0b59\5\u0202\u0102\2\u0b58\u0b56\3\2\2\2"+
		"\u0b58\u0b57\3\2\2\2\u0b59\u0b5c\3\2\2\2\u0b5a\u0b58\3\2\2\2\u0b5a\u0b5b"+
		"\3\2\2\2\u0b5b\u01fb\3\2\2\2\u0b5c\u0b5a\3\2\2\2\u0b5d\u0b5e\5\u01fa\u00fe"+
		"\2\u0b5e\u0b5f\7Q\2\2\u0b5f\u01fd\3\2\2\2\u0b60\u0b61\7Q\2\2\u0b61\u01ff"+
		"\3\2\2\2\u0b62\u0b63\5\u01fa\u00fe\2\u0b63\u0b64\7R\2\2\u0b64\u0201\3"+
		"\2\2\2\u0b65\u0b66\7R\2\2\u0b66\u0203\3\2\2\2\u0b67\u0b68\7;\2\2\u0b68"+
		"\u0b69\5\22\n\2\u0b69\u0b6a\7<\2\2\u0b6a\u0b6b\5\u01ea\u00f6\2\u0b6b\u0b83"+
		"\3\2\2\2\u0b6c\u0b6d\7;\2\2\u0b6d\u0b71\5\32\16\2\u0b6e\u0b70\5\66\34"+
		"\2\u0b6f\u0b6e\3\2\2\2\u0b70\u0b73\3\2\2\2\u0b71\u0b6f\3\2\2\2\u0b71\u0b72"+
		"\3\2\2\2\u0b72\u0b74\3\2\2\2\u0b73\u0b71\3\2\2\2\u0b74\u0b75\7<\2\2\u0b75"+
		"\u0b76\5\u01f8\u00fd\2\u0b76\u0b83\3\2\2\2\u0b77\u0b78\7;\2\2\u0b78\u0b7c"+
		"\5\32\16\2\u0b79\u0b7b\5\66\34\2\u0b7a\u0b79\3\2\2\2\u0b7b\u0b7e\3\2\2"+
		"\2\u0b7c\u0b7a\3\2\2\2\u0b7c\u0b7d\3\2\2\2\u0b7d\u0b7f\3\2\2\2\u0b7e\u0b7c"+
		"\3\2\2\2\u0b7f\u0b80\7<\2\2\u0b80\u0b81\5\u01c0\u00e1\2\u0b81\u0b83\3"+
		"\2\2\2\u0b82\u0b67\3\2\2\2\u0b82\u0b6c\3\2\2\2\u0b82\u0b77\3\2\2\2\u0b83"+
		"\u0205\3\2\2\2\u0148\u020c\u021c\u0221\u0228\u022c\u0230\u0239\u023d\u0241"+
		"\u0243\u0249\u024e\u0255\u025a\u025c\u0262\u0267\u026c\u0271\u027c\u028a"+
		"\u028f\u0297\u029e\u02a4\u02a9\u02b4\u02b7\u02c5\u02ca\u02cf\u02d4\u02da"+
		"\u02e4\u02ec\u02f6\u02fe\u0308\u030c\u0311\u0317\u031d\u0326\u0331\u034e"+
		"\u0352\u0358\u035b\u035e\u0367\u0372\u037d\u038b\u0392\u039b\u03a2\u03ac"+
		"\u03b7\u03be\u03c4\u03c8\u03cc\u03d0\u03d4\u03d9\u03dd\u03e1\u03e3\u03e8"+
		"\u03ef\u03f4\u03f6\u03fc\u0401\u0405\u0418\u041d\u042d\u0432\u0438\u043e"+
		"\u0440\u0444\u0449\u044d\u0456\u045d\u0465\u0468\u046d\u0475\u047b\u0480"+
		"\u0487\u048e\u0493\u0499\u04a5\u04aa\u04ae\u04b8\u04bd\u04c5\u04c8\u04cd"+
		"\u04d5\u04d8\u04dd\u04e2\u04e7\u04ec\u04f3\u04f8\u0500\u0505\u050a\u050f"+
		"\u0515\u051b\u051e\u0521\u052a\u0530\u0536\u0539\u053c\u0544\u0549\u054f"+
		"\u0552\u0559\u0565\u056e\u0578\u0582\u0589\u0592\u059b\u05a0\u05ac\u05b6"+
		"\u05bb\u05c3\u05c6\u05cd\u05d5\u05db\u05e4\u05ee\u05f2\u05f5\u05fe\u060c"+
		"\u060f\u0618\u061d\u0625\u062b\u0633\u063f\u0646\u0654\u066a\u068c\u0698"+
		"\u069e\u06aa\u06b7\u06d1\u06d5\u06da\u06de\u06e2\u06ea\u06ee\u06f2\u06f9"+
		"\u0702\u070a\u0719\u0725\u072b\u0731\u0746\u074b\u0751\u075d\u0768\u0772"+
		"\u0775\u077a\u0783\u0789\u0793\u0798\u07a1\u07b8\u07c2\u07d8\u07df\u07e7"+
		"\u07ef\u07fa\u0811\u081b\u0826\u083c\u0840\u0845\u084d\u0853\u0857\u085b"+
		"\u085f\u0865\u086a\u086f\u0873\u0877\u087d\u0882\u0887\u088b\u088f\u0891"+
		"\u0896\u089b\u08a0\u08a4\u08a8\u08ac\u08b1\u08b9\u08bf\u08c3\u08c7\u08cb"+
		"\u08d1\u08d6\u08db\u08df\u08e3\u08e5\u08ea\u08f9\u0907\u0913\u091c\u092b"+
		"\u0938\u0941\u0947\u094e\u0953\u095a\u095f\u0966\u096b\u0972\u0977\u097f"+
		"\u0984\u0988\u098c\u0991\u0998\u099f\u09a4\u09ab\u09b0\u09b7\u09bc\u09c4"+
		"\u09c9\u09cd\u09d4\u09da\u09e1\u09e8\u09ef\u09f7\u09fe\u0a06\u0a0a\u0a11"+
		"\u0a18\u0a1f\u0a27\u0a2e\u0a36\u0a3c\u0a42\u0a4e\u0a54\u0a5a\u0a65\u0a6e"+
		"\u0a75\u0a7c\u0a81\u0a85\u0a8e\u0a99\u0aa3\u0aae\u0ab9\u0ac4\u0acf\u0adb"+
		"\u0add\u0af2\u0af4\u0b07\u0b09\u0b15\u0b17\u0b26\u0b28\u0b38\u0b50\u0b54"+
		"\u0b58\u0b5a\u0b71\u0b7c\u0b82";
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
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
		RULE_literal = 0, RULE_integerLiteral = 1, RULE_integerLiteralValue = 2, 
		RULE_floatingPointLiteral = 3, RULE_floatingPointLiteralValue = 4, RULE_booleanLiteral = 5, 
		RULE_booleanLiteralValue = 6, RULE_stringLiteral = 7, RULE_stringLiteralValue = 8, 
		RULE_characterLiteral = 9, RULE_nullLiteral = 10, RULE_type = 11, RULE_primitiveType = 12, 
		RULE_numericType = 13, RULE_integralType = 14, RULE_floatingPointType = 15, 
		RULE_referenceType = 16, RULE_classOrInterfaceType = 17, RULE_classType = 18, 
		RULE_classType_lf_classOrInterfaceType = 19, RULE_classType_lfno_classOrInterfaceType = 20, 
		RULE_interfaceType = 21, RULE_interfaceType_lf_classOrInterfaceType = 22, 
		RULE_interfaceType_lfno_classOrInterfaceType = 23, RULE_typeVariable = 24, 
		RULE_arrayType = 25, RULE_dims = 26, RULE_typeParameter = 27, RULE_typeParameterModifier = 28, 
		RULE_typeBound = 29, RULE_additionalBound = 30, RULE_typeArguments = 31, 
		RULE_typeArgumentList = 32, RULE_typeArgument = 33, RULE_wildcard = 34, 
		RULE_wildcardBounds = 35, RULE_packageName = 36, RULE_typeName = 37, RULE_packageOrTypeName = 38, 
		RULE_expressionName = 39, RULE_ambiguousName = 40, RULE_compilationUnit = 41, 
		RULE_packageDeclaration = 42, RULE_packageModifier = 43, RULE_importDeclaration = 44, 
		RULE_singleTypeImportDeclaration = 45, RULE_typeImportOnDemandDeclaration = 46, 
		RULE_singleStaticImportDeclaration = 47, RULE_staticImportOnDemandDeclaration = 48, 
		RULE_typeDeclaration = 49, RULE_classDeclaration = 50, RULE_normalClassDeclaration = 51, 
		RULE_className = 52, RULE_classModifiers = 53, RULE_classModifier = 54, 
		RULE_typeParameters = 55, RULE_typeParameterList = 56, RULE_superclass = 57, 
		RULE_superinterfaces = 58, RULE_interfaceTypeList = 59, RULE_classBody = 60, 
		RULE_classBodyDeclaration = 61, RULE_classMemberDeclaration = 62, RULE_fieldDeclaration = 63, 
		RULE_fieldModifiers = 64, RULE_fieldModifier = 65, RULE_fieldVariableDeclaratorList = 66, 
		RULE_fieldVariableDeclarator = 67, RULE_fieldVariableDeclaratorId = 68, 
		RULE_fieldVariableInitializer = 69, RULE_fieldAssignmentExpression = 70, 
		RULE_fieldArrayInitializer = 71, RULE_variableDeclaratorList = 72, RULE_variableDeclarator = 73, 
		RULE_variableDeclaratorId = 74, RULE_variableInitializer = 75, RULE_unannType = 76, 
		RULE_unannPrimitiveType = 77, RULE_unannReferenceType = 78, RULE_unannClassOrInterfaceType = 79, 
		RULE_unannClassType = 80, RULE_unannClassType_lf_unannClassOrInterfaceType = 81, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 82, RULE_unannInterfaceType = 83, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 84, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 85, 
		RULE_unannTypeVariable = 86, RULE_unannArrayType = 87, RULE_methodDeclaration = 88, 
		RULE_methodModifier = 89, RULE_methodHeader = 90, RULE_result = 91, RULE_methodDeclarator = 92, 
		RULE_methodName = 93, RULE_formalParameterList = 94, RULE_formalParameters = 95, 
		RULE_formalParameter = 96, RULE_parameterDeclaratorId = 97, RULE_parameterName = 98, 
		RULE_variableModifier = 99, RULE_lastFormalParameter = 100, RULE_receiverParameter = 101, 
		RULE_throws_ = 102, RULE_exceptionTypeList = 103, RULE_exceptionType = 104, 
		RULE_methodBody = 105, RULE_instanceInitializer = 106, RULE_staticInitializer = 107, 
		RULE_constructorDeclaration = 108, RULE_constructorModifier = 109, RULE_constructorDeclarator = 110, 
		RULE_simpleTypeName = 111, RULE_constructorBody = 112, RULE_explicitConstructorInvocation = 113, 
		RULE_enumDeclaration = 114, RULE_enumBody = 115, RULE_enumConstantList = 116, 
		RULE_enumConstant = 117, RULE_enumConstantModifier = 118, RULE_enumBodyDeclarations = 119, 
		RULE_interfaceDeclaration = 120, RULE_normalInterfaceDeclaration = 121, 
		RULE_interfaceModifier = 122, RULE_extendsInterfaces = 123, RULE_interfaceBody = 124, 
		RULE_interfaceMemberDeclaration = 125, RULE_constantDeclaration = 126, 
		RULE_constantModifier = 127, RULE_interfaceMethodDeclaration = 128, RULE_interfaceMethodModifier = 129, 
		RULE_annotationTypeDeclaration = 130, RULE_annotationTypeBody = 131, RULE_annotationTypeMemberDeclaration = 132, 
		RULE_annotationTypeElementDeclaration = 133, RULE_annotationTypeElementModifier = 134, 
		RULE_defaultValue = 135, RULE_annotation = 136, RULE_normalAnnotation = 137, 
		RULE_elementValuePairList = 138, RULE_elementValuePair = 139, RULE_elementValue = 140, 
		RULE_elementValueArrayInitializer = 141, RULE_elementValueList = 142, 
		RULE_markerAnnotation = 143, RULE_singleElementAnnotation = 144, RULE_arrayInitializer = 145, 
		RULE_variableInitializerList = 146, RULE_block = 147, RULE_blockStatements = 148, 
		RULE_blockStatement = 149, RULE_localVariableDeclarationStatement = 150, 
		RULE_localVariableDeclaration = 151, RULE_statement = 152, RULE_statementNoShortIf = 153, 
		RULE_statementWithoutTrailingSubstatement = 154, RULE_emptyStatement = 155, 
		RULE_labeledStatement = 156, RULE_labeledStatementNoShortIf = 157, RULE_expressionStatement = 158, 
		RULE_statementExpression = 159, RULE_ifThenStatement = 160, RULE_ifThenElseStatement = 161, 
		RULE_ifThenElseStatementNoShortIf = 162, RULE_assertStatement = 163, RULE_switchStatement = 164, 
		RULE_switchBlock = 165, RULE_switchBlockStatementGroup = 166, RULE_switchLabels = 167, 
		RULE_switchLabel = 168, RULE_enumConstantName = 169, RULE_whileStatement = 170, 
		RULE_whileStatementNoShortIf = 171, RULE_doStatement = 172, RULE_forStatement = 173, 
		RULE_forStatementNoShortIf = 174, RULE_basicForStatement = 175, RULE_basicForStatementNoShortIf = 176, 
		RULE_forInit = 177, RULE_forUpdate = 178, RULE_statementExpressionList = 179, 
		RULE_enhancedForStatement = 180, RULE_enhancedForStatementNoShortIf = 181, 
		RULE_breakStatement = 182, RULE_continueStatement = 183, RULE_returnStatement = 184, 
		RULE_throwStatement = 185, RULE_synchronizedStatement = 186, RULE_tryStatement = 187, 
		RULE_catches = 188, RULE_catchClause = 189, RULE_catchFormalParameter = 190, 
		RULE_catchType = 191, RULE_finally_ = 192, RULE_tryWithResourcesStatement = 193, 
		RULE_resourceSpecification = 194, RULE_resourceList = 195, RULE_resource = 196, 
		RULE_primary = 197, RULE_primaryNoNewArray = 198, RULE_primaryNoNewArray_lf_arrayAccess = 199, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 200, RULE_primaryNoNewArray_lf_primary = 201, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 202, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 203, 
		RULE_primaryNoNewArray_lfno_primary = 204, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 205, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 206, 
		RULE_classInstanceCreationExpression = 207, RULE_classInstanceCreationExpression_lf_primary = 208, 
		RULE_classInstanceCreationExpression_lfno_primary = 209, RULE_typeArgumentsOrDiamond = 210, 
		RULE_fieldAccess = 211, RULE_fieldAccess_lf_primary = 212, RULE_fieldAccess_lfno_primary = 213, 
		RULE_arrayAccess = 214, RULE_arrayAccess_lf_primary = 215, RULE_arrayAccess_lfno_primary = 216, 
		RULE_methodInvocation = 217, RULE_methodInvocation_lf_primary = 218, RULE_methodInvocation_lfno_primary = 219, 
		RULE_argumentList = 220, RULE_methodReference = 221, RULE_methodReference_lf_primary = 222, 
		RULE_methodReference_lfno_primary = 223, RULE_arrayCreationExpression = 224, 
		RULE_dimExprs = 225, RULE_dimExpr = 226, RULE_constantExpression = 227, 
		RULE_expression = 228, RULE_lambdaExpression = 229, RULE_lambdaParameters = 230, 
		RULE_inferredFormalParameterList = 231, RULE_lambdaBody = 232, RULE_assignmentExpression = 233, 
		RULE_assignment = 234, RULE_leftHandSide = 235, RULE_assignmentOperator = 236, 
		RULE_conditionalExpression = 237, RULE_conditionalOrExpression = 238, 
		RULE_conditionalAndExpression = 239, RULE_inclusiveOrExpression = 240, 
		RULE_exclusiveOrExpression = 241, RULE_andExpression = 242, RULE_equalityExpression = 243, 
		RULE_relationalExpression = 244, RULE_shiftExpression = 245, RULE_additiveExpression = 246, 
		RULE_multiplicativeExpression = 247, RULE_unaryExpression = 248, RULE_preIncrementExpression = 249, 
		RULE_preDecrementExpression = 250, RULE_unaryExpressionNotPlusMinus = 251, 
		RULE_postfixExpression = 252, RULE_postIncrementExpression = 253, RULE_postIncrementExpression_lf_postfixExpression = 254, 
		RULE_postDecrementExpression = 255, RULE_postDecrementExpression_lf_postfixExpression = 256, 
		RULE_castExpression = 257;
	public static final String[] ruleNames = {
		"literal", "integerLiteral", "integerLiteralValue", "floatingPointLiteral", 
		"floatingPointLiteralValue", "booleanLiteral", "booleanLiteralValue", 
		"stringLiteral", "stringLiteralValue", "characterLiteral", "nullLiteral", 
		"type", "primitiveType", "numericType", "integralType", "floatingPointType", 
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
		"fieldDeclaration", "fieldModifiers", "fieldModifier", "fieldVariableDeclaratorList", 
		"fieldVariableDeclarator", "fieldVariableDeclaratorId", "fieldVariableInitializer", 
		"fieldAssignmentExpression", "fieldArrayInitializer", "variableDeclaratorList", 
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
		public IntegerLiteralValueContext integerLiteralValue() {
			return getRuleContext(IntegerLiteralValueContext.class,0);
		}
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
			integerLiteralValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralValueContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public IntegerLiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteralValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegerLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralValueContext integerLiteralValue() throws RecognitionException {
		IntegerLiteralValueContext _localctx = new IntegerLiteralValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integerLiteralValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		public FloatingPointLiteralValueContext floatingPointLiteralValue() {
			return getRuleContext(FloatingPointLiteralValueContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			floatingPointLiteralValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralValueContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteralValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralValueContext floatingPointLiteralValue() throws RecognitionException {
		FloatingPointLiteralValueContext _localctx = new FloatingPointLiteralValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointLiteralValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		public BooleanLiteralValueContext booleanLiteralValue() {
			return getRuleContext(BooleanLiteralValueContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			booleanLiteralValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralValueContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public BooleanLiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteralValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBooleanLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralValueContext booleanLiteralValue() throws RecognitionException {
		BooleanLiteralValueContext _localctx = new BooleanLiteralValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleanLiteralValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		public StringLiteralValueContext stringLiteralValue() {
			return getRuleContext(StringLiteralValueContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			stringLiteralValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public StringLiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStringLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralValueContext stringLiteralValue() throws RecognitionException {
		StringLiteralValueContext _localctx = new StringLiteralValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringLiteralValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		enterRule(_localctx, 18, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		enterRule(_localctx, 20, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
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
		enterRule(_localctx, 24, RULE_primitiveType);
		int _la;
		try {
			setState(562);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(548);
					annotation();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 26, RULE_numericType);
		try {
			setState(566);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
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
		enterRule(_localctx, 28, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 30, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		enterRule(_localctx, 32, RULE_referenceType);
		try {
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
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
		enterRule(_localctx, 34, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(577);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(578);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(583);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(581);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(582);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(587);
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
		enterRule(_localctx, 36, RULE_classType);
		int _la;
		try {
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(588);
					annotation();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(Identifier);
				setState(596);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(595);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				classOrInterfaceType();
				setState(599);
				match(DOT);
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
				match(Identifier);
				setState(608);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(607);
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
		enterRule(_localctx, 38, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(DOT);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(613);
				annotation();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			match(Identifier);
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(620);
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
		enterRule(_localctx, 40, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(623);
				annotation();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(Identifier);
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(630);
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
		enterRule(_localctx, 42, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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
		enterRule(_localctx, 44, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		enterRule(_localctx, 46, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		enterRule(_localctx, 48, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(639);
				annotation();
				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
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
		enterRule(_localctx, 50, RULE_arrayType);
		try {
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				primitiveType();
				setState(648);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				classOrInterfaceType();
				setState(651);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				typeVariable();
				setState(654);
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
		enterRule(_localctx, 52, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
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
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(666);
						annotation();
						}
						}
						setState(671);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(672);
					match(LBRACK);
					setState(673);
					match(RBRACK);
					}
					} 
				}
				setState(678);
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
		enterRule(_localctx, 54, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(679);
				typeParameterModifier();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			match(Identifier);
			setState(687);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(686);
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
		enterRule(_localctx, 56, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 58, RULE_typeBound);
		int _la;
		try {
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(EXTENDS);
				setState(692);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(EXTENDS);
				setState(694);
				classOrInterfaceType();
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(695);
					additionalBound();
					}
					}
					setState(700);
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
		enterRule(_localctx, 60, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(BITAND);
			setState(704);
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
		enterRule(_localctx, 62, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(LT);
			setState(707);
			typeArgumentList();
			setState(708);
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
		enterRule(_localctx, 64, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			typeArgument();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(711);
				match(COMMA);
				setState(712);
				typeArgument();
				}
				}
				setState(717);
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
		enterRule(_localctx, 66, RULE_typeArgument);
		try {
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		enterRule(_localctx, 68, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(722);
				annotation();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(QUESTION);
			setState(730);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(729);
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
		enterRule(_localctx, 70, RULE_wildcardBounds);
		try {
			setState(736);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				match(EXTENDS);
				setState(733);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(SUPER);
				setState(735);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(739);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(746);
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
					setState(741);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(742);
					match(DOT);
					setState(743);
					match(Identifier);
					}
					} 
				}
				setState(748);
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
		enterRule(_localctx, 74, RULE_typeName);
		try {
			setState(754);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				packageOrTypeName(0);
				setState(751);
				match(DOT);
				setState(752);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(757);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(764);
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
					setState(759);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(760);
					match(DOT);
					setState(761);
					match(Identifier);
					}
					} 
				}
				setState(766);
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
		enterRule(_localctx, 78, RULE_expressionName);
		try {
			setState(772);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				ambiguousName(0);
				setState(769);
				match(DOT);
				setState(770);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(775);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(782);
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
					setState(777);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(778);
					match(DOT);
					setState(779);
					match(Identifier);
					}
					} 
				}
				setState(784);
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
		enterRule(_localctx, 82, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(785);
				packageDeclaration();
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(788);
				importDeclaration();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(794);
				typeDeclaration();
				}
				}
				setState(799);
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
		enterRule(_localctx, 84, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(800);
				packageModifier();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(PACKAGE);
			setState(807);
			match(Identifier);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(808);
				match(DOT);
				setState(809);
				match(Identifier);
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815);
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
		enterRule(_localctx, 86, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
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
		enterRule(_localctx, 88, RULE_importDeclaration);
		try {
			setState(823);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
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
		enterRule(_localctx, 90, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(IMPORT);
			setState(826);
			typeName();
			setState(827);
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
		enterRule(_localctx, 92, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(IMPORT);
			setState(830);
			packageOrTypeName(0);
			setState(831);
			match(DOT);
			setState(832);
			match(MUL);
			setState(833);
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
		enterRule(_localctx, 94, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(IMPORT);
			setState(836);
			match(STATIC);
			setState(837);
			typeName();
			setState(838);
			match(DOT);
			setState(839);
			match(Identifier);
			setState(840);
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
		enterRule(_localctx, 96, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(IMPORT);
			setState(843);
			match(STATIC);
			setState(844);
			typeName();
			setState(845);
			match(DOT);
			setState(846);
			match(MUL);
			setState(847);
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
		enterRule(_localctx, 98, RULE_typeDeclaration);
		try {
			setState(852);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
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
		enterRule(_localctx, 100, RULE_classDeclaration);
		try {
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
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
		enterRule(_localctx, 102, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			classModifiers();
			setState(859);
			match(CLASS);
			setState(860);
			className();
			setState(862);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(861);
				typeParameters();
				}
			}

			setState(865);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(864);
				superclass();
				}
			}

			setState(868);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(867);
				superinterfaces();
				}
			}

			setState(870);
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
		enterRule(_localctx, 104, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
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
		enterRule(_localctx, 106, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(874);
				classModifier();
				}
				}
				setState(879);
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
		enterRule(_localctx, 108, RULE_classModifier);
		try {
			setState(888);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(885);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(886);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(887);
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
		enterRule(_localctx, 110, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(LT);
			setState(891);
			typeParameterList();
			setState(892);
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
		enterRule(_localctx, 112, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			typeParameter();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(895);
				match(COMMA);
				setState(896);
				typeParameter();
				}
				}
				setState(901);
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
		enterRule(_localctx, 114, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(EXTENDS);
			setState(903);
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
		enterRule(_localctx, 116, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(IMPLEMENTS);
			setState(906);
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
		enterRule(_localctx, 118, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			interfaceType();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(909);
				match(COMMA);
				setState(910);
				interfaceType();
				}
				}
				setState(915);
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
		enterRule(_localctx, 120, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(LBRACE);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(917);
				classBodyDeclaration();
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(923);
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
		enterRule(_localctx, 122, RULE_classBodyDeclaration);
		try {
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
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
		enterRule(_localctx, 124, RULE_classMemberDeclaration);
		try {
			setState(936);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(935);
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
		public FieldVariableDeclaratorListContext fieldVariableDeclaratorList() {
			return getRuleContext(FieldVariableDeclaratorListContext.class,0);
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
		enterRule(_localctx, 126, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			fieldModifiers();
			setState(939);
			unannType();
			setState(940);
			fieldVariableDeclaratorList();
			setState(941);
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
		enterRule(_localctx, 128, RULE_fieldModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(943);
				fieldModifier();
				}
				}
				setState(948);
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
		enterRule(_localctx, 130, RULE_fieldModifier);
		try {
			setState(957);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(953);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(954);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(955);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(956);
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

	public static class FieldVariableDeclaratorListContext extends ParserRuleContext {
		public List<FieldVariableDeclaratorContext> fieldVariableDeclarator() {
			return getRuleContexts(FieldVariableDeclaratorContext.class);
		}
		public FieldVariableDeclaratorContext fieldVariableDeclarator(int i) {
			return getRuleContext(FieldVariableDeclaratorContext.class,i);
		}
		public FieldVariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldVariableDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldVariableDeclaratorListContext fieldVariableDeclaratorList() throws RecognitionException {
		FieldVariableDeclaratorListContext _localctx = new FieldVariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_fieldVariableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			fieldVariableDeclarator();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				fieldVariableDeclarator();
				}
				}
				setState(966);
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

	public static class FieldVariableDeclaratorContext extends ParserRuleContext {
		public FieldVariableDeclaratorIdContext fieldVariableDeclaratorId() {
			return getRuleContext(FieldVariableDeclaratorIdContext.class,0);
		}
		public FieldVariableInitializerContext fieldVariableInitializer() {
			return getRuleContext(FieldVariableInitializerContext.class,0);
		}
		public FieldVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldVariableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldVariableDeclaratorContext fieldVariableDeclarator() throws RecognitionException {
		FieldVariableDeclaratorContext _localctx = new FieldVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_fieldVariableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			fieldVariableDeclaratorId();
			setState(970);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(968);
				match(ASSIGN);
				setState(969);
				fieldVariableInitializer();
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

	public static class FieldVariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public FieldVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldVariableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldVariableDeclaratorIdContext fieldVariableDeclaratorId() throws RecognitionException {
		FieldVariableDeclaratorIdContext _localctx = new FieldVariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_fieldVariableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(Identifier);
			setState(974);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(973);
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

	public static class FieldVariableInitializerContext extends ParserRuleContext {
		public FieldAssignmentExpressionContext fieldAssignmentExpression() {
			return getRuleContext(FieldAssignmentExpressionContext.class,0);
		}
		public FieldArrayInitializerContext fieldArrayInitializer() {
			return getRuleContext(FieldArrayInitializerContext.class,0);
		}
		public FieldVariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldVariableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldVariableInitializerContext fieldVariableInitializer() throws RecognitionException {
		FieldVariableInitializerContext _localctx = new FieldVariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_fieldVariableInitializer);
		try {
			setState(978);
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
				setState(976);
				fieldAssignmentExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				fieldArrayInitializer();
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

	public static class FieldAssignmentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldAssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAssignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAssignmentExpressionContext fieldAssignmentExpression() throws RecognitionException {
		FieldAssignmentExpressionContext _localctx = new FieldAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_fieldAssignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
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

	public static class FieldArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public FieldArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldArrayInitializerContext fieldArrayInitializer() throws RecognitionException {
		FieldArrayInitializerContext _localctx = new FieldArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_fieldArrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			arrayInitializer();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			variableDeclarator();
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(985);
				match(COMMA);
				setState(986);
				variableDeclarator();
				}
				}
				setState(991);
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
		enterRule(_localctx, 146, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			variableDeclaratorId();
			setState(995);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(993);
				match(ASSIGN);
				setState(994);
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
		enterRule(_localctx, 148, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(Identifier);
			setState(999);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(998);
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
		enterRule(_localctx, 150, RULE_variableInitializer);
		try {
			setState(1003);
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
				setState(1001);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
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
		enterRule(_localctx, 152, RULE_unannType);
		try {
			setState(1007);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
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
		enterRule(_localctx, 154, RULE_unannPrimitiveType);
		try {
			setState(1011);
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
				setState(1009);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
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
		enterRule(_localctx, 156, RULE_unannReferenceType);
		try {
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
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
		enterRule(_localctx, 158, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1018);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(1019);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1024);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(1022);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(1023);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 160, RULE_unannClassType);
		int _la;
		try {
			setState(1045);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				match(Identifier);
				setState(1031);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1030);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				unannClassOrInterfaceType();
				setState(1034);
				match(DOT);
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1035);
					annotation();
					}
					}
					setState(1040);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1041);
				match(Identifier);
				setState(1043);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1042);
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
		enterRule(_localctx, 162, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(DOT);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1048);
				annotation();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			match(Identifier);
			setState(1056);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1055);
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
		enterRule(_localctx, 164, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(Identifier);
			setState(1060);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1059);
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
		enterRule(_localctx, 166, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
		enterRule(_localctx, 168, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		enterRule(_localctx, 170, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 172, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
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
		enterRule(_localctx, 174, RULE_unannArrayType);
		try {
			setState(1079);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				unannPrimitiveType();
				setState(1071);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				unannClassOrInterfaceType();
				setState(1074);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1076);
				unannTypeVariable();
				setState(1077);
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
		enterRule(_localctx, 176, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1081);
				methodModifier();
				}
				}
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1087);
			methodHeader();
			setState(1088);
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
		enterRule(_localctx, 178, RULE_methodModifier);
		try {
			setState(1100);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1092);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1093);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1094);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1095);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1096);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1097);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1098);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1099);
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
		enterRule(_localctx, 180, RULE_methodHeader);
		int _la;
		try {
			setState(1119);
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
				setState(1102);
				result();
				setState(1103);
				methodDeclarator();
				setState(1105);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1104);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				typeParameters();
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1108);
					annotation();
					}
					}
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1114);
				result();
				setState(1115);
				methodDeclarator();
				setState(1117);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1116);
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
		enterRule(_localctx, 182, RULE_result);
		try {
			setState(1123);
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
				setState(1121);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
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
		enterRule(_localctx, 184, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			methodName();
			setState(1126);
			match(LPAREN);
			setState(1128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1127);
				formalParameterList();
				}
			}

			setState(1130);
			match(RPAREN);
			setState(1132);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1131);
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
		enterRule(_localctx, 186, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
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
		enterRule(_localctx, 188, RULE_formalParameterList);
		try {
			setState(1141);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				formalParameters();
				setState(1137);
				match(COMMA);
				setState(1138);
				lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
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
		enterRule(_localctx, 190, RULE_formalParameters);
		try {
			int _alt;
			setState(1159);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				formalParameter();
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1144);
						match(COMMA);
						setState(1145);
						formalParameter();
						}
						} 
					}
					setState(1150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				receiverParameter();
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1152);
						match(COMMA);
						setState(1153);
						formalParameter();
						}
						} 
					}
					setState(1158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 192, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1161);
				variableModifier();
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			unannType();
			setState(1168);
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
		enterRule(_localctx, 194, RULE_parameterDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			parameterName();
			setState(1172);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1171);
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
		enterRule(_localctx, 196, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
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
		enterRule(_localctx, 198, RULE_variableModifier);
		try {
			setState(1178);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
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
		enterRule(_localctx, 200, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1197);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1180);
					variableModifier();
					}
					}
					setState(1185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1186);
				unannType();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1187);
					annotation();
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1193);
				match(ELLIPSIS);
				setState(1194);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
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
		enterRule(_localctx, 202, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1199);
				annotation();
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			unannType();
			setState(1208);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1206);
				match(Identifier);
				setState(1207);
				match(DOT);
				}
			}

			setState(1210);
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
		enterRule(_localctx, 204, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(THROWS);
			setState(1213);
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
		enterRule(_localctx, 206, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			exceptionType();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1216);
				match(COMMA);
				setState(1217);
				exceptionType();
				}
				}
				setState(1222);
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
		enterRule(_localctx, 208, RULE_exceptionType);
		try {
			setState(1225);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
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
		enterRule(_localctx, 210, RULE_methodBody);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
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
		enterRule(_localctx, 212, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
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
		enterRule(_localctx, 214, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(STATIC);
			setState(1234);
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
		enterRule(_localctx, 216, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1236);
				constructorModifier();
				}
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1242);
			constructorDeclarator();
			setState(1244);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1243);
				throws_();
				}
			}

			setState(1246);
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
		enterRule(_localctx, 218, RULE_constructorModifier);
		try {
			setState(1252);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1250);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1251);
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
		enterRule(_localctx, 220, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1254);
				typeParameters();
				}
			}

			setState(1257);
			simpleTypeName();
			setState(1258);
			match(LPAREN);
			setState(1260);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1259);
				formalParameterList();
				}
			}

			setState(1262);
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
		enterRule(_localctx, 222, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
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
		enterRule(_localctx, 224, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(LBRACE);
			setState(1268);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1267);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1271);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1270);
				blockStatements();
				}
			}

			setState(1273);
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
		enterRule(_localctx, 226, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1321);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1275);
					typeArguments();
					}
				}

				setState(1278);
				match(THIS);
				setState(1279);
				match(LPAREN);
				setState(1281);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1280);
					argumentList();
					}
				}

				setState(1283);
				match(RPAREN);
				setState(1284);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1285);
					typeArguments();
					}
				}

				setState(1288);
				match(SUPER);
				setState(1289);
				match(LPAREN);
				setState(1291);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1290);
					argumentList();
					}
				}

				setState(1293);
				match(RPAREN);
				setState(1294);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				expressionName();
				setState(1296);
				match(DOT);
				setState(1298);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1297);
					typeArguments();
					}
				}

				setState(1300);
				match(SUPER);
				setState(1301);
				match(LPAREN);
				setState(1303);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1302);
					argumentList();
					}
				}

				setState(1305);
				match(RPAREN);
				setState(1306);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				primary();
				setState(1309);
				match(DOT);
				setState(1311);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1310);
					typeArguments();
					}
				}

				setState(1313);
				match(SUPER);
				setState(1314);
				match(LPAREN);
				setState(1316);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1315);
					argumentList();
					}
				}

				setState(1318);
				match(RPAREN);
				setState(1319);
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
		enterRule(_localctx, 228, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1323);
				classModifier();
				}
				}
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1329);
			match(ENUM);
			setState(1330);
			match(Identifier);
			setState(1332);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1331);
				superinterfaces();
				}
			}

			setState(1334);
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
		enterRule(_localctx, 230, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(LBRACE);
			setState(1338);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1337);
				enumConstantList();
				}
			}

			setState(1341);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1340);
				match(COMMA);
				}
			}

			setState(1344);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1343);
				enumBodyDeclarations();
				}
			}

			setState(1346);
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
		enterRule(_localctx, 232, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			enumConstant();
			setState(1353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1349);
					match(COMMA);
					setState(1350);
					enumConstant();
					}
					} 
				}
				setState(1355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 234, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1356);
				enumConstantModifier();
				}
				}
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362);
			match(Identifier);
			setState(1368);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1363);
				match(LPAREN);
				setState(1365);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1364);
					argumentList();
					}
				}

				setState(1367);
				match(RPAREN);
				}
			}

			setState(1371);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1370);
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
		enterRule(_localctx, 236, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
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
		enterRule(_localctx, 238, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(SEMI);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1376);
				classBodyDeclaration();
				}
				}
				setState(1381);
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
		enterRule(_localctx, 240, RULE_interfaceDeclaration);
		try {
			setState(1384);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
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
		enterRule(_localctx, 242, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1386);
				interfaceModifier();
				}
				}
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1392);
			match(INTERFACE);
			setState(1393);
			match(Identifier);
			setState(1395);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1394);
				typeParameters();
				}
			}

			setState(1398);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1397);
				extendsInterfaces();
				}
			}

			setState(1400);
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
		enterRule(_localctx, 244, RULE_interfaceModifier);
		try {
			setState(1409);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1404);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1405);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1406);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1407);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1408);
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
		enterRule(_localctx, 246, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(EXTENDS);
			setState(1412);
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
		enterRule(_localctx, 248, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(LBRACE);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1415);
				interfaceMemberDeclaration();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1421);
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
		enterRule(_localctx, 250, RULE_interfaceMemberDeclaration);
		try {
			setState(1428);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1425);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1426);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1427);
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
		enterRule(_localctx, 252, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1430);
				constantModifier();
				}
				}
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1436);
			unannType();
			setState(1437);
			variableDeclaratorList();
			setState(1438);
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
		enterRule(_localctx, 254, RULE_constantModifier);
		try {
			setState(1444);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1440);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1442);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1443);
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
		enterRule(_localctx, 256, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1446);
				interfaceMethodModifier();
				}
				}
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1452);
			methodHeader();
			setState(1453);
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
		enterRule(_localctx, 258, RULE_interfaceMethodModifier);
		try {
			setState(1461);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1458);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1459);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1460);
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
		enterRule(_localctx, 260, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1463);
					interfaceModifier();
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1469);
			match(AT);
			setState(1470);
			match(INTERFACE);
			setState(1471);
			match(Identifier);
			setState(1472);
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
		enterRule(_localctx, 262, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			match(LBRACE);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1475);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1481);
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
		enterRule(_localctx, 264, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1488);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1486);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1487);
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
		enterRule(_localctx, 266, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1490);
				annotationTypeElementModifier();
				}
				}
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1496);
			unannType();
			setState(1497);
			match(Identifier);
			setState(1498);
			match(LPAREN);
			setState(1499);
			match(RPAREN);
			setState(1501);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1500);
				dims();
				}
			}

			setState(1504);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1503);
				defaultValue();
				}
			}

			setState(1506);
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
		enterRule(_localctx, 268, RULE_annotationTypeElementModifier);
		try {
			setState(1511);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1510);
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
		enterRule(_localctx, 270, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(DEFAULT);
			setState(1514);
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
		enterRule(_localctx, 272, RULE_annotation);
		try {
			setState(1519);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1518);
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
		enterRule(_localctx, 274, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(AT);
			setState(1522);
			typeName();
			setState(1523);
			match(LPAREN);
			setState(1525);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1524);
				elementValuePairList();
				}
			}

			setState(1527);
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
		enterRule(_localctx, 276, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			elementValuePair();
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1530);
				match(COMMA);
				setState(1531);
				elementValuePair();
				}
				}
				setState(1536);
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
		enterRule(_localctx, 278, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(Identifier);
			setState(1538);
			match(ASSIGN);
			setState(1539);
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
		enterRule(_localctx, 280, RULE_elementValue);
		try {
			setState(1544);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1543);
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
		enterRule(_localctx, 282, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(LBRACE);
			setState(1548);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1547);
				elementValueList();
				}
			}

			setState(1551);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1550);
				match(COMMA);
				}
			}

			setState(1553);
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
		enterRule(_localctx, 284, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			elementValue();
			setState(1560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1556);
					match(COMMA);
					setState(1557);
					elementValue();
					}
					} 
				}
				setState(1562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
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
		enterRule(_localctx, 286, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(AT);
			setState(1564);
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
		enterRule(_localctx, 288, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(AT);
			setState(1567);
			typeName();
			setState(1568);
			match(LPAREN);
			setState(1569);
			elementValue();
			setState(1570);
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
		enterRule(_localctx, 290, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			match(LBRACE);
			setState(1574);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1573);
				variableInitializerList();
				}
			}

			setState(1577);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1576);
				match(COMMA);
				}
			}

			setState(1579);
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
		enterRule(_localctx, 292, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			variableInitializer();
			setState(1586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1582);
					match(COMMA);
					setState(1583);
					variableInitializer();
					}
					} 
				}
				setState(1588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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
		enterRule(_localctx, 294, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(LBRACE);
			setState(1591);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1590);
				blockStatements();
				}
			}

			setState(1593);
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
		enterRule(_localctx, 296, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			blockStatement();
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1596);
				blockStatement();
				}
				}
				setState(1601);
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
		enterRule(_localctx, 298, RULE_blockStatement);
		try {
			setState(1605);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1602);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1604);
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
		enterRule(_localctx, 300, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			localVariableDeclaration();
			setState(1608);
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
		enterRule(_localctx, 302, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1610);
				variableModifier();
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1616);
			unannType();
			setState(1617);
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
		enterRule(_localctx, 304, RULE_statement);
		try {
			setState(1625);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1622);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1623);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1624);
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
		enterRule(_localctx, 306, RULE_statementNoShortIf);
		try {
			setState(1632);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1630);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1631);
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
		enterRule(_localctx, 308, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1646);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
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
				setState(1636);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1637);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1638);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1639);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1640);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1641);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1642);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1643);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1644);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1645);
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
		enterRule(_localctx, 310, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
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
		enterRule(_localctx, 312, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(Identifier);
			setState(1651);
			match(COLON);
			setState(1652);
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
		enterRule(_localctx, 314, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(Identifier);
			setState(1655);
			match(COLON);
			setState(1656);
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
		enterRule(_localctx, 316, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			statementExpression();
			setState(1659);
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
		enterRule(_localctx, 318, RULE_statementExpression);
		try {
			setState(1668);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1663);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1664);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1665);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1666);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1667);
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
		enterRule(_localctx, 320, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(IF);
			setState(1671);
			match(LPAREN);
			setState(1672);
			expression();
			setState(1673);
			match(RPAREN);
			setState(1674);
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
		enterRule(_localctx, 322, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(IF);
			setState(1677);
			match(LPAREN);
			setState(1678);
			expression();
			setState(1679);
			match(RPAREN);
			setState(1680);
			statementNoShortIf();
			setState(1681);
			match(ELSE);
			setState(1682);
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
		enterRule(_localctx, 324, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(IF);
			setState(1685);
			match(LPAREN);
			setState(1686);
			expression();
			setState(1687);
			match(RPAREN);
			setState(1688);
			statementNoShortIf();
			setState(1689);
			match(ELSE);
			setState(1690);
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
		enterRule(_localctx, 326, RULE_assertStatement);
		try {
			setState(1702);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				match(ASSERT);
				setState(1693);
				expression();
				setState(1694);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(ASSERT);
				setState(1697);
				expression();
				setState(1698);
				match(COLON);
				setState(1699);
				expression();
				setState(1700);
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
		enterRule(_localctx, 328, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(SWITCH);
			setState(1705);
			match(LPAREN);
			setState(1706);
			expression();
			setState(1707);
			match(RPAREN);
			setState(1708);
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
		enterRule(_localctx, 330, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(LBRACE);
			setState(1714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1711);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1717);
				switchLabel();
				}
				}
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1723);
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
		enterRule(_localctx, 332, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			switchLabels();
			setState(1726);
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
		enterRule(_localctx, 334, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			switchLabel();
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1729);
				switchLabel();
				}
				}
				setState(1734);
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
		enterRule(_localctx, 336, RULE_switchLabel);
		try {
			setState(1745);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				match(CASE);
				setState(1736);
				constantExpression();
				setState(1737);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1739);
				match(CASE);
				setState(1740);
				enumConstantName();
				setState(1741);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				match(DEFAULT);
				setState(1744);
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
		enterRule(_localctx, 338, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
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
		enterRule(_localctx, 340, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(WHILE);
			setState(1750);
			match(LPAREN);
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
		enterRule(_localctx, 342, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(WHILE);
			setState(1756);
			match(LPAREN);
			setState(1757);
			expression();
			setState(1758);
			match(RPAREN);
			setState(1759);
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
		enterRule(_localctx, 344, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(DO);
			setState(1762);
			statement();
			setState(1763);
			match(WHILE);
			setState(1764);
			match(LPAREN);
			setState(1765);
			expression();
			setState(1766);
			match(RPAREN);
			setState(1767);
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
		enterRule(_localctx, 346, RULE_forStatement);
		try {
			setState(1771);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1769);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
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
		enterRule(_localctx, 348, RULE_forStatementNoShortIf);
		try {
			setState(1775);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
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
		enterRule(_localctx, 350, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(FOR);
			setState(1778);
			match(LPAREN);
			setState(1780);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1779);
				forInit();
				}
			}

			setState(1782);
			match(SEMI);
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
			setState(1788);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1787);
				forUpdate();
				}
			}

			setState(1790);
			match(RPAREN);
			setState(1791);
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
		enterRule(_localctx, 352, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			match(FOR);
			setState(1794);
			match(LPAREN);
			setState(1796);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1795);
				forInit();
				}
			}

			setState(1798);
			match(SEMI);
			setState(1800);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1799);
				expression();
				}
			}

			setState(1802);
			match(SEMI);
			setState(1804);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1803);
				forUpdate();
				}
			}

			setState(1806);
			match(RPAREN);
			setState(1807);
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
		enterRule(_localctx, 354, RULE_forInit);
		try {
			setState(1811);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1809);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1810);
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
		enterRule(_localctx, 356, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
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
		enterRule(_localctx, 358, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			statementExpression();
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1816);
				match(COMMA);
				setState(1817);
				statementExpression();
				}
				}
				setState(1822);
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
		enterRule(_localctx, 360, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			match(FOR);
			setState(1824);
			match(LPAREN);
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
			unannType();
			setState(1832);
			variableDeclaratorId();
			setState(1833);
			match(COLON);
			setState(1834);
			expression();
			setState(1835);
			match(RPAREN);
			setState(1836);
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
		enterRule(_localctx, 362, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(FOR);
			setState(1839);
			match(LPAREN);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1840);
				variableModifier();
				}
				}
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1846);
			unannType();
			setState(1847);
			variableDeclaratorId();
			setState(1848);
			match(COLON);
			setState(1849);
			expression();
			setState(1850);
			match(RPAREN);
			setState(1851);
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
		enterRule(_localctx, 364, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(BREAK);
			setState(1855);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1854);
				match(Identifier);
				}
			}

			setState(1857);
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
		enterRule(_localctx, 366, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(CONTINUE);
			setState(1861);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1860);
				match(Identifier);
				}
			}

			setState(1863);
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
		enterRule(_localctx, 368, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(RETURN);
			setState(1867);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1866);
				expression();
				}
			}

			setState(1869);
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
		enterRule(_localctx, 370, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			match(THROW);
			setState(1872);
			expression();
			setState(1873);
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
		enterRule(_localctx, 372, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			match(SYNCHRONIZED);
			setState(1876);
			match(LPAREN);
			setState(1877);
			expression();
			setState(1878);
			match(RPAREN);
			setState(1879);
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
		enterRule(_localctx, 374, RULE_tryStatement);
		int _la;
		try {
			setState(1893);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
				match(TRY);
				setState(1882);
				block();
				setState(1883);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				match(TRY);
				setState(1886);
				block();
				setState(1888);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1887);
					catches();
					}
				}

				setState(1890);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
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
		enterRule(_localctx, 376, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			catchClause();
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1896);
				catchClause();
				}
				}
				setState(1901);
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
		enterRule(_localctx, 378, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(CATCH);
			setState(1903);
			match(LPAREN);
			setState(1904);
			catchFormalParameter();
			setState(1905);
			match(RPAREN);
			setState(1906);
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
		enterRule(_localctx, 380, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1908);
				variableModifier();
				}
				}
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1914);
			catchType();
			setState(1915);
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
		enterRule(_localctx, 382, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			unannClassType();
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1918);
				match(BITOR);
				setState(1919);
				classType();
				}
				}
				setState(1924);
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
		enterRule(_localctx, 384, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(FINALLY);
			setState(1926);
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
		enterRule(_localctx, 386, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			match(TRY);
			setState(1929);
			resourceSpecification();
			setState(1930);
			block();
			setState(1932);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1931);
				catches();
				}
			}

			setState(1935);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1934);
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
		enterRule(_localctx, 388, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(LPAREN);
			setState(1938);
			resourceList();
			setState(1940);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1939);
				match(SEMI);
				}
			}

			setState(1942);
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
		enterRule(_localctx, 390, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			resource();
			setState(1949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1945);
					match(SEMI);
					setState(1946);
					resource();
					}
					} 
				}
				setState(1951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
		enterRule(_localctx, 392, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1952);
				variableModifier();
				}
				}
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1958);
			unannType();
			setState(1959);
			variableDeclaratorId();
			setState(1960);
			match(ASSIGN);
			setState(1961);
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
		enterRule(_localctx, 394, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1963);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1964);
				arrayCreationExpression();
				}
				break;
			}
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1967);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
		enterRule(_localctx, 396, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(2002);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				typeName();
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1975);
					match(LBRACK);
					setState(1976);
					match(RBRACK);
					}
					}
					setState(1981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1982);
				match(DOT);
				setState(1983);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1985);
				match(VOID);
				setState(1986);
				match(DOT);
				setState(1987);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1988);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1989);
				typeName();
				setState(1990);
				match(DOT);
				setState(1991);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1993);
				match(LPAREN);
				setState(1994);
				expression();
				setState(1995);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1997);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1998);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1999);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2000);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2001);
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
		enterRule(_localctx, 398, RULE_primaryNoNewArray_lf_arrayAccess);
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
		enterRule(_localctx, 400, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2034);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2006);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
				typeName();
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2008);
					match(LBRACK);
					setState(2009);
					match(RBRACK);
					}
					}
					setState(2014);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2015);
				match(DOT);
				setState(2016);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2018);
				match(VOID);
				setState(2019);
				match(DOT);
				setState(2020);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2021);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2022);
				typeName();
				setState(2023);
				match(DOT);
				setState(2024);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2026);
				match(LPAREN);
				setState(2027);
				expression();
				setState(2028);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2030);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2031);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2032);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2033);
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
		enterRule(_localctx, 402, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2041);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2038);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2039);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2040);
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
		enterRule(_localctx, 404, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
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
		enterRule(_localctx, 406, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2049);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2047);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2048);
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
		enterRule(_localctx, 408, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2091);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2051);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2052);
				typeName();
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2053);
					match(LBRACK);
					setState(2054);
					match(RBRACK);
					}
					}
					setState(2059);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2060);
				match(DOT);
				setState(2061);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
				unannPrimitiveType();
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2064);
					match(LBRACK);
					setState(2065);
					match(RBRACK);
					}
					}
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2071);
				match(DOT);
				setState(2072);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2074);
				match(VOID);
				setState(2075);
				match(DOT);
				setState(2076);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2077);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2078);
				typeName();
				setState(2079);
				match(DOT);
				setState(2080);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2082);
				match(LPAREN);
				setState(2083);
				expression();
				setState(2084);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2086);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2087);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2088);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2089);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2090);
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
		enterRule(_localctx, 410, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
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
		enterRule(_localctx, 412, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2134);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096);
				typeName();
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2097);
					match(LBRACK);
					setState(2098);
					match(RBRACK);
					}
					}
					setState(2103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2104);
				match(DOT);
				setState(2105);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2107);
				unannPrimitiveType();
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2108);
					match(LBRACK);
					setState(2109);
					match(RBRACK);
					}
					}
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2115);
				match(DOT);
				setState(2116);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2118);
				match(VOID);
				setState(2119);
				match(DOT);
				setState(2120);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2121);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2122);
				typeName();
				setState(2123);
				match(DOT);
				setState(2124);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2126);
				match(LPAREN);
				setState(2127);
				expression();
				setState(2128);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2130);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2131);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2132);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2133);
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
		enterRule(_localctx, 414, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2219);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2136);
				match(NEW);
				setState(2138);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2137);
					typeArguments();
					}
				}

				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2140);
					annotation();
					}
					}
					setState(2145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2146);
				match(Identifier);
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2147);
					match(DOT);
					setState(2151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2148);
						annotation();
						}
						}
						setState(2153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2154);
					match(Identifier);
					}
					}
					setState(2159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2161);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2160);
					typeArgumentsOrDiamond();
					}
				}

				setState(2163);
				match(LPAREN);
				setState(2165);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2164);
					argumentList();
					}
				}

				setState(2167);
				match(RPAREN);
				setState(2169);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2168);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				expressionName();
				setState(2172);
				match(DOT);
				setState(2173);
				match(NEW);
				setState(2175);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2174);
					typeArguments();
					}
				}

				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2177);
					annotation();
					}
					}
					setState(2182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2183);
				match(Identifier);
				setState(2185);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2184);
					typeArgumentsOrDiamond();
					}
				}

				setState(2187);
				match(LPAREN);
				setState(2189);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2188);
					argumentList();
					}
				}

				setState(2191);
				match(RPAREN);
				setState(2193);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2192);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2195);
				primary();
				setState(2196);
				match(DOT);
				setState(2197);
				match(NEW);
				setState(2199);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2198);
					typeArguments();
					}
				}

				setState(2204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2201);
					annotation();
					}
					}
					setState(2206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2207);
				match(Identifier);
				setState(2209);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2208);
					typeArgumentsOrDiamond();
					}
				}

				setState(2211);
				match(LPAREN);
				setState(2213);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2212);
					argumentList();
					}
				}

				setState(2215);
				match(RPAREN);
				setState(2217);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2216);
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
		enterRule(_localctx, 416, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(DOT);
			setState(2222);
			match(NEW);
			setState(2224);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2223);
				typeArguments();
				}
			}

			setState(2229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2226);
				annotation();
				}
				}
				setState(2231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2232);
			match(Identifier);
			setState(2234);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2233);
				typeArgumentsOrDiamond();
				}
			}

			setState(2236);
			match(LPAREN);
			setState(2238);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2237);
				argumentList();
				}
			}

			setState(2240);
			match(RPAREN);
			setState(2242);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(2241);
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
		enterRule(_localctx, 418, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2303);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				match(NEW);
				setState(2246);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2245);
					typeArguments();
					}
				}

				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2248);
					annotation();
					}
					}
					setState(2253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2254);
				match(Identifier);
				setState(2265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2255);
					match(DOT);
					setState(2259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2256);
						annotation();
						}
						}
						setState(2261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2262);
					match(Identifier);
					}
					}
					setState(2267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2269);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2268);
					typeArgumentsOrDiamond();
					}
				}

				setState(2271);
				match(LPAREN);
				setState(2273);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2272);
					argumentList();
					}
				}

				setState(2275);
				match(RPAREN);
				setState(2277);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2276);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2279);
				expressionName();
				setState(2280);
				match(DOT);
				setState(2281);
				match(NEW);
				setState(2283);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2282);
					typeArguments();
					}
				}

				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2285);
					annotation();
					}
					}
					setState(2290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2291);
				match(Identifier);
				setState(2293);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2292);
					typeArgumentsOrDiamond();
					}
				}

				setState(2295);
				match(LPAREN);
				setState(2297);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2296);
					argumentList();
					}
				}

				setState(2299);
				match(RPAREN);
				setState(2301);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2300);
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
		enterRule(_localctx, 420, RULE_typeArgumentsOrDiamond);
		try {
			setState(2308);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2305);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2306);
				match(LT);
				setState(2307);
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
		enterRule(_localctx, 422, RULE_fieldAccess);
		try {
			setState(2323);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				primary();
				setState(2311);
				match(DOT);
				setState(2312);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2314);
				match(SUPER);
				setState(2315);
				match(DOT);
				setState(2316);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2317);
				typeName();
				setState(2318);
				match(DOT);
				setState(2319);
				match(SUPER);
				setState(2320);
				match(DOT);
				setState(2321);
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
		enterRule(_localctx, 424, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			match(DOT);
			setState(2326);
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
		enterRule(_localctx, 426, RULE_fieldAccess_lfno_primary);
		try {
			setState(2337);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(SUPER);
				setState(2329);
				match(DOT);
				setState(2330);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2331);
				typeName();
				setState(2332);
				match(DOT);
				setState(2333);
				match(SUPER);
				setState(2334);
				match(DOT);
				setState(2335);
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
		enterRule(_localctx, 428, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2339);
				expressionName();
				setState(2340);
				match(LBRACK);
				setState(2341);
				expression();
				setState(2342);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2344);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2345);
				match(LBRACK);
				setState(2346);
				expression();
				setState(2347);
				match(RBRACK);
				}
				break;
			}
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2351);
				primaryNoNewArray_lf_arrayAccess();
				setState(2352);
				match(LBRACK);
				setState(2353);
				expression();
				setState(2354);
				match(RBRACK);
				}
				}
				setState(2360);
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
		enterRule(_localctx, 430, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2361);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2362);
			match(LBRACK);
			setState(2363);
			expression();
			setState(2364);
			match(RBRACK);
			}
			setState(2373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2366);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2367);
					match(LBRACK);
					setState(2368);
					expression();
					setState(2369);
					match(RBRACK);
					}
					} 
				}
				setState(2375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		enterRule(_localctx, 432, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2376);
				expressionName();
				setState(2377);
				match(LBRACK);
				setState(2378);
				expression();
				setState(2379);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2381);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2382);
				match(LBRACK);
				setState(2383);
				expression();
				setState(2384);
				match(RBRACK);
				}
				break;
			}
			setState(2395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2388);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2389);
					match(LBRACK);
					setState(2390);
					expression();
					setState(2391);
					match(RBRACK);
					}
					} 
				}
				setState(2397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
		enterRule(_localctx, 434, RULE_methodInvocation);
		int _la;
		try {
			setState(2466);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2398);
				methodName();
				setState(2399);
				match(LPAREN);
				setState(2401);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2400);
					argumentList();
					}
				}

				setState(2403);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				typeName();
				setState(2406);
				match(DOT);
				setState(2408);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2407);
					typeArguments();
					}
				}

				setState(2410);
				match(Identifier);
				setState(2411);
				match(LPAREN);
				setState(2413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2412);
					argumentList();
					}
				}

				setState(2415);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2417);
				expressionName();
				setState(2418);
				match(DOT);
				setState(2420);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2419);
					typeArguments();
					}
				}

				setState(2422);
				match(Identifier);
				setState(2423);
				match(LPAREN);
				setState(2425);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2424);
					argumentList();
					}
				}

				setState(2427);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2429);
				primary();
				setState(2430);
				match(DOT);
				setState(2432);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2431);
					typeArguments();
					}
				}

				setState(2434);
				match(Identifier);
				setState(2435);
				match(LPAREN);
				setState(2437);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2436);
					argumentList();
					}
				}

				setState(2439);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2441);
				match(SUPER);
				setState(2442);
				match(DOT);
				setState(2444);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2443);
					typeArguments();
					}
				}

				setState(2446);
				match(Identifier);
				setState(2447);
				match(LPAREN);
				setState(2449);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2448);
					argumentList();
					}
				}

				setState(2451);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2452);
				typeName();
				setState(2453);
				match(DOT);
				setState(2454);
				match(SUPER);
				setState(2455);
				match(DOT);
				setState(2457);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2456);
					typeArguments();
					}
				}

				setState(2459);
				match(Identifier);
				setState(2460);
				match(LPAREN);
				setState(2462);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2461);
					argumentList();
					}
				}

				setState(2464);
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
		enterRule(_localctx, 436, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			match(DOT);
			setState(2470);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2469);
				typeArguments();
				}
			}

			setState(2472);
			match(Identifier);
			setState(2473);
			match(LPAREN);
			setState(2475);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2474);
				argumentList();
				}
			}

			setState(2477);
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
		enterRule(_localctx, 438, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2535);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2479);
				methodName();
				setState(2480);
				match(LPAREN);
				setState(2482);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2481);
					argumentList();
					}
				}

				setState(2484);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2486);
				typeName();
				setState(2487);
				match(DOT);
				setState(2489);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2488);
					typeArguments();
					}
				}

				setState(2491);
				match(Identifier);
				setState(2492);
				match(LPAREN);
				setState(2494);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2493);
					argumentList();
					}
				}

				setState(2496);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2498);
				expressionName();
				setState(2499);
				match(DOT);
				setState(2501);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2500);
					typeArguments();
					}
				}

				setState(2503);
				match(Identifier);
				setState(2504);
				match(LPAREN);
				setState(2506);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2505);
					argumentList();
					}
				}

				setState(2508);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2510);
				match(SUPER);
				setState(2511);
				match(DOT);
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
				setState(2516);
				match(LPAREN);
				setState(2518);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2517);
					argumentList();
					}
				}

				setState(2520);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2521);
				typeName();
				setState(2522);
				match(DOT);
				setState(2523);
				match(SUPER);
				setState(2524);
				match(DOT);
				setState(2526);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2525);
					typeArguments();
					}
				}

				setState(2528);
				match(Identifier);
				setState(2529);
				match(LPAREN);
				setState(2531);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2530);
					argumentList();
					}
				}

				setState(2533);
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
		enterRule(_localctx, 440, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			expression();
			setState(2542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2538);
				match(COMMA);
				setState(2539);
				expression();
				}
				}
				setState(2544);
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
		enterRule(_localctx, 442, RULE_methodReference);
		int _la;
		try {
			setState(2592);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2545);
				expressionName();
				setState(2546);
				match(COLONCOLON);
				setState(2548);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2547);
					typeArguments();
					}
				}

				setState(2550);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2552);
				referenceType();
				setState(2553);
				match(COLONCOLON);
				setState(2555);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2554);
					typeArguments();
					}
				}

				setState(2557);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2559);
				primary();
				setState(2560);
				match(COLONCOLON);
				setState(2562);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2561);
					typeArguments();
					}
				}

				setState(2564);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2566);
				match(SUPER);
				setState(2567);
				match(COLONCOLON);
				setState(2569);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2568);
					typeArguments();
					}
				}

				setState(2571);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2572);
				typeName();
				setState(2573);
				match(DOT);
				setState(2574);
				match(SUPER);
				setState(2575);
				match(COLONCOLON);
				setState(2577);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2576);
					typeArguments();
					}
				}

				setState(2579);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2581);
				classType();
				setState(2582);
				match(COLONCOLON);
				setState(2584);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2583);
					typeArguments();
					}
				}

				setState(2586);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2588);
				arrayType();
				setState(2589);
				match(COLONCOLON);
				setState(2590);
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
		enterRule(_localctx, 444, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			match(COLONCOLON);
			setState(2596);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2595);
				typeArguments();
				}
			}

			setState(2598);
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
		enterRule(_localctx, 446, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2640);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600);
				expressionName();
				setState(2601);
				match(COLONCOLON);
				setState(2603);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2602);
					typeArguments();
					}
				}

				setState(2605);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				referenceType();
				setState(2608);
				match(COLONCOLON);
				setState(2610);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2609);
					typeArguments();
					}
				}

				setState(2612);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2614);
				match(SUPER);
				setState(2615);
				match(COLONCOLON);
				setState(2617);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2616);
					typeArguments();
					}
				}

				setState(2619);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2620);
				typeName();
				setState(2621);
				match(DOT);
				setState(2622);
				match(SUPER);
				setState(2623);
				match(COLONCOLON);
				setState(2625);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2624);
					typeArguments();
					}
				}

				setState(2627);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2629);
				classType();
				setState(2630);
				match(COLONCOLON);
				setState(2632);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2631);
					typeArguments();
					}
				}

				setState(2634);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2636);
				arrayType();
				setState(2637);
				match(COLONCOLON);
				setState(2638);
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
		enterRule(_localctx, 448, RULE_arrayCreationExpression);
		try {
			setState(2664);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2642);
				match(NEW);
				setState(2643);
				primitiveType();
				setState(2644);
				dimExprs();
				setState(2646);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2645);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2648);
				match(NEW);
				setState(2649);
				classOrInterfaceType();
				setState(2650);
				dimExprs();
				setState(2652);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2651);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2654);
				match(NEW);
				setState(2655);
				primitiveType();
				setState(2656);
				dims();
				setState(2657);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2659);
				match(NEW);
				setState(2660);
				classOrInterfaceType();
				setState(2661);
				dims();
				setState(2662);
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
		enterRule(_localctx, 450, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			dimExpr();
			setState(2670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2667);
					dimExpr();
					}
					} 
				}
				setState(2672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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
		enterRule(_localctx, 452, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2673);
				annotation();
				}
				}
				setState(2678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2679);
			match(LBRACK);
			setState(2680);
			expression();
			setState(2681);
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
		enterRule(_localctx, 454, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
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
		enterRule(_localctx, 456, RULE_expression);
		try {
			setState(2687);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2685);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2686);
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
		enterRule(_localctx, 458, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
			lambdaParameters();
			setState(2690);
			match(ARROW);
			setState(2691);
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
		enterRule(_localctx, 460, RULE_lambdaParameters);
		int _la;
		try {
			setState(2703);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2693);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2694);
				match(LPAREN);
				setState(2696);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2695);
					formalParameterList();
					}
				}

				setState(2698);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2699);
				match(LPAREN);
				setState(2700);
				inferredFormalParameterList();
				setState(2701);
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
		enterRule(_localctx, 462, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(Identifier);
			setState(2710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2706);
				match(COMMA);
				setState(2707);
				match(Identifier);
				}
				}
				setState(2712);
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
		enterRule(_localctx, 464, RULE_lambdaBody);
		try {
			setState(2715);
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
				setState(2713);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2714);
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
		enterRule(_localctx, 466, RULE_assignmentExpression);
		try {
			setState(2719);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2717);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2718);
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
		enterRule(_localctx, 468, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
			leftHandSide();
			setState(2722);
			assignmentOperator();
			setState(2723);
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
		enterRule(_localctx, 470, RULE_leftHandSide);
		try {
			setState(2728);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2725);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2726);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2727);
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
		enterRule(_localctx, 472, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2730);
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
		enterRule(_localctx, 474, RULE_conditionalExpression);
		try {
			setState(2739);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2732);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2733);
				conditionalOrExpression(0);
				setState(2734);
				match(QUESTION);
				setState(2735);
				expression();
				setState(2736);
				match(COLON);
				setState(2737);
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
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2742);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2744);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2745);
					match(OR);
					setState(2746);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2751);
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
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2753);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2755);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2756);
					match(AND);
					setState(2757);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2762);
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
		int _startState = 480;
		enterRecursionRule(_localctx, 480, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2764);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2766);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2767);
					match(BITOR);
					setState(2768);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2773);
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
		int _startState = 482;
		enterRecursionRule(_localctx, 482, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2775);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2777);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2778);
					match(CARET);
					setState(2779);
					andExpression(0);
					}
					} 
				}
				setState(2784);
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
		int _startState = 484;
		enterRecursionRule(_localctx, 484, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2786);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2788);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2789);
					match(BITAND);
					setState(2790);
					equalityExpression(0);
					}
					} 
				}
				setState(2795);
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
		int _startState = 486;
		enterRecursionRule(_localctx, 486, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2797);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2805);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2799);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2800);
						match(EQUAL);
						setState(2801);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2802);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2803);
						match(NOTEQUAL);
						setState(2804);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2809);
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
		int _startState = 488;
		enterRecursionRule(_localctx, 488, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2811);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2828);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2813);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2814);
						match(LT);
						setState(2815);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2816);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2817);
						match(GT);
						setState(2818);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2819);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2820);
						match(LE);
						setState(2821);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2822);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2823);
						match(GE);
						setState(2824);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2825);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2826);
						match(INSTANCEOF);
						setState(2827);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2832);
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
		int _startState = 490;
		enterRecursionRule(_localctx, 490, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2834);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2849);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2836);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2837);
						match(LT);
						setState(2838);
						match(LT);
						setState(2839);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2840);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2841);
						match(GT);
						setState(2842);
						match(GT);
						setState(2843);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2844);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2845);
						match(GT);
						setState(2846);
						match(GT);
						setState(2847);
						match(GT);
						setState(2848);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2853);
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
		int _startState = 492;
		enterRecursionRule(_localctx, 492, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2855);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2863);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2857);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2858);
						match(ADD);
						setState(2859);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2860);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2861);
						match(SUB);
						setState(2862);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
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
		int _startState = 494;
		enterRecursionRule(_localctx, 494, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2869);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2880);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2871);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2872);
						match(MUL);
						setState(2873);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2874);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2875);
						match(DIV);
						setState(2876);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2877);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2878);
						match(MOD);
						setState(2879);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2884);
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
		enterRule(_localctx, 496, RULE_unaryExpression);
		try {
			setState(2892);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2885);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2886);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2887);
				match(ADD);
				setState(2888);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2889);
				match(SUB);
				setState(2890);
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
				setState(2891);
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
		enterRule(_localctx, 498, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2894);
			match(INC);
			setState(2895);
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
		enterRule(_localctx, 500, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2897);
			match(DEC);
			setState(2898);
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
		enterRule(_localctx, 502, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2906);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2900);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2901);
				match(TILDE);
				setState(2902);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2903);
				match(BANG);
				setState(2904);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2905);
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
			setState(2910);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2908);
				primary();
				}
				break;
			case 2:
				{
				setState(2909);
				expressionName();
				}
				break;
			}
			setState(2916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2914);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2912);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2913);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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
			setState(2919);
			postfixExpression();
			setState(2920);
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
			setState(2922);
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
			setState(2924);
			postfixExpression();
			setState(2925);
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
			setState(2927);
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
			setState(2956);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2929);
				match(LPAREN);
				setState(2930);
				primitiveType();
				setState(2931);
				match(RPAREN);
				setState(2932);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2934);
				match(LPAREN);
				setState(2935);
				referenceType();
				setState(2939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2936);
					additionalBound();
					}
					}
					setState(2941);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2942);
				match(RPAREN);
				setState(2943);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2945);
				match(LPAREN);
				setState(2946);
				referenceType();
				setState(2950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2947);
					additionalBound();
					}
					}
					setState(2952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2953);
				match(RPAREN);
				setState(2954);
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
		case 36:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 38:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 40:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 238:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 239:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 240:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 241:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 242:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 243:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 244:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 245:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 246:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 247:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0b91\4\2\t\2\4"+
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
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r"+
		"\u0225\n\r\3\16\7\16\u0228\n\16\f\16\16\16\u022b\13\16\3\16\3\16\7\16"+
		"\u022f\n\16\f\16\16\16\u0232\13\16\3\16\5\16\u0235\n\16\3\17\3\17\5\17"+
		"\u0239\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u0242\n\22\3\23\3"+
		"\23\5\23\u0246\n\23\3\23\3\23\7\23\u024a\n\23\f\23\16\23\u024d\13\23\3"+
		"\24\7\24\u0250\n\24\f\24\16\24\u0253\13\24\3\24\3\24\5\24\u0257\n\24\3"+
		"\24\3\24\3\24\7\24\u025c\n\24\f\24\16\24\u025f\13\24\3\24\3\24\5\24\u0263"+
		"\n\24\5\24\u0265\n\24\3\25\3\25\7\25\u0269\n\25\f\25\16\25\u026c\13\25"+
		"\3\25\3\25\5\25\u0270\n\25\3\26\7\26\u0273\n\26\f\26\16\26\u0276\13\26"+
		"\3\26\3\26\5\26\u027a\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\7\32\u0283"+
		"\n\32\f\32\16\32\u0286\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0293\n\33\3\34\7\34\u0296\n\34\f\34\16\34\u0299\13"+
		"\34\3\34\3\34\3\34\7\34\u029e\n\34\f\34\16\34\u02a1\13\34\3\34\3\34\7"+
		"\34\u02a5\n\34\f\34\16\34\u02a8\13\34\3\35\7\35\u02ab\n\35\f\35\16\35"+
		"\u02ae\13\35\3\35\3\35\5\35\u02b2\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u02bb\n\37\f\37\16\37\u02be\13\37\5\37\u02c0\n\37\3 \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\7\"\u02cc\n\"\f\"\16\"\u02cf\13\"\3#\3#\5#\u02d3"+
		"\n#\3$\7$\u02d6\n$\f$\16$\u02d9\13$\3$\3$\5$\u02dd\n$\3%\3%\3%\3%\5%\u02e3"+
		"\n%\3&\3&\3&\3&\3&\3&\7&\u02eb\n&\f&\16&\u02ee\13&\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u02f5\n\'\3(\3(\3(\3(\3(\3(\7(\u02fd\n(\f(\16(\u0300\13(\3)\3)\3"+
		")\3)\3)\5)\u0307\n)\3*\3*\3*\3*\3*\3*\7*\u030f\n*\f*\16*\u0312\13*\3+"+
		"\5+\u0315\n+\3+\7+\u0318\n+\f+\16+\u031b\13+\3+\7+\u031e\n+\f+\16+\u0321"+
		"\13+\3,\7,\u0324\n,\f,\16,\u0327\13,\3,\3,\3,\3,\7,\u032d\n,\f,\16,\u0330"+
		"\13,\3,\3,\3-\3-\3.\3.\3.\3.\5.\u033a\n.\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\5\63\u0357\n\63\3\64\3\64\5\64\u035b\n\64"+
		"\3\65\3\65\3\65\3\65\5\65\u0361\n\65\3\65\5\65\u0364\n\65\3\65\5\65\u0367"+
		"\n\65\3\65\3\65\3\66\3\66\3\67\7\67\u036e\n\67\f\67\16\67\u0371\13\67"+
		"\38\38\38\38\38\38\38\38\58\u037b\n8\39\39\39\39\3:\3:\3:\7:\u0384\n:"+
		"\f:\16:\u0387\13:\3;\3;\3;\3<\3<\3<\3=\3=\3=\7=\u0392\n=\f=\16=\u0395"+
		"\13=\3>\3>\7>\u0399\n>\f>\16>\u039c\13>\3>\3>\3?\3?\3?\3?\5?\u03a4\n?"+
		"\3@\3@\3@\3@\3@\5@\u03ab\n@\3A\3A\3A\3A\3A\3B\7B\u03b3\nB\fB\16B\u03b6"+
		"\13B\3C\3C\3C\3C\3C\3C\3C\3C\5C\u03c0\nC\3D\3D\3D\7D\u03c5\nD\fD\16D\u03c8"+
		"\13D\3E\3E\3E\5E\u03cd\nE\3F\3F\5F\u03d1\nF\3G\3G\5G\u03d5\nG\3H\3H\3"+
		"I\3I\3J\3J\3J\7J\u03de\nJ\fJ\16J\u03e1\13J\3K\3K\3K\5K\u03e6\nK\3L\3L"+
		"\5L\u03ea\nL\3M\3M\5M\u03ee\nM\3N\3N\5N\u03f2\nN\3O\3O\5O\u03f6\nO\3P"+
		"\3P\3P\5P\u03fb\nP\3Q\3Q\5Q\u03ff\nQ\3Q\3Q\7Q\u0403\nQ\fQ\16Q\u0406\13"+
		"Q\3R\3R\5R\u040a\nR\3R\3R\3R\7R\u040f\nR\fR\16R\u0412\13R\3R\3R\5R\u0416"+
		"\nR\5R\u0418\nR\3S\3S\7S\u041c\nS\fS\16S\u041f\13S\3S\3S\5S\u0423\nS\3"+
		"T\3T\5T\u0427\nT\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5"+
		"Y\u043a\nY\3Z\7Z\u043d\nZ\fZ\16Z\u0440\13Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\5[\u044f\n[\3\\\3\\\3\\\5\\\u0454\n\\\3\\\3\\\7\\\u0458\n"+
		"\\\f\\\16\\\u045b\13\\\3\\\3\\\3\\\5\\\u0460\n\\\5\\\u0462\n\\\3]\3]\5"+
		"]\u0466\n]\3^\3^\3^\5^\u046b\n^\3^\3^\5^\u046f\n^\3_\3_\3`\3`\3`\3`\3"+
		"`\5`\u0478\n`\3a\3a\3a\7a\u047d\na\fa\16a\u0480\13a\3a\3a\3a\7a\u0485"+
		"\na\fa\16a\u0488\13a\5a\u048a\na\3b\7b\u048d\nb\fb\16b\u0490\13b\3b\3"+
		"b\3b\3c\3c\5c\u0497\nc\3d\3d\3e\3e\5e\u049d\ne\3f\7f\u04a0\nf\ff\16f\u04a3"+
		"\13f\3f\3f\7f\u04a7\nf\ff\16f\u04aa\13f\3f\3f\3f\3f\5f\u04b0\nf\3g\7g"+
		"\u04b3\ng\fg\16g\u04b6\13g\3g\3g\3g\5g\u04bb\ng\3g\3g\3h\3h\3h\3i\3i\3"+
		"i\7i\u04c5\ni\fi\16i\u04c8\13i\3j\3j\5j\u04cc\nj\3k\3k\5k\u04d0\nk\3l"+
		"\3l\3m\3m\3m\3n\7n\u04d8\nn\fn\16n\u04db\13n\3n\3n\5n\u04df\nn\3n\3n\3"+
		"o\3o\3o\3o\5o\u04e7\no\3p\5p\u04ea\np\3p\3p\3p\5p\u04ef\np\3p\3p\3q\3"+
		"q\3r\3r\5r\u04f7\nr\3r\5r\u04fa\nr\3r\3r\3s\5s\u04ff\ns\3s\3s\3s\5s\u0504"+
		"\ns\3s\3s\3s\5s\u0509\ns\3s\3s\3s\5s\u050e\ns\3s\3s\3s\3s\3s\5s\u0515"+
		"\ns\3s\3s\3s\5s\u051a\ns\3s\3s\3s\3s\3s\3s\5s\u0522\ns\3s\3s\3s\5s\u0527"+
		"\ns\3s\3s\3s\5s\u052c\ns\3t\7t\u052f\nt\ft\16t\u0532\13t\3t\3t\3t\5t\u0537"+
		"\nt\3t\3t\3u\3u\5u\u053d\nu\3u\5u\u0540\nu\3u\5u\u0543\nu\3u\3u\3v\3v"+
		"\3v\7v\u054a\nv\fv\16v\u054d\13v\3w\7w\u0550\nw\fw\16w\u0553\13w\3w\3"+
		"w\3w\5w\u0558\nw\3w\5w\u055b\nw\3w\5w\u055e\nw\3x\3x\3y\3y\7y\u0564\n"+
		"y\fy\16y\u0567\13y\3z\3z\5z\u056b\nz\3{\7{\u056e\n{\f{\16{\u0571\13{\3"+
		"{\3{\3{\5{\u0576\n{\3{\5{\u0579\n{\3{\3{\3|\3|\3|\3|\3|\3|\3|\5|\u0584"+
		"\n|\3}\3}\3}\3~\3~\7~\u058b\n~\f~\16~\u058e\13~\3~\3~\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u0597\n\177\3\u0080\7\u0080\u059a\n\u0080\f\u0080\16"+
		"\u0080\u059d\13\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u05a7\n\u0081\3\u0082\7\u0082\u05aa\n\u0082\f"+
		"\u0082\16\u0082\u05ad\13\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05b8\n\u0083\3\u0084\7\u0084"+
		"\u05bb\n\u0084\f\u0084\16\u0084\u05be\13\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\7\u0085\u05c7\n\u0085\f\u0085\16\u0085"+
		"\u05ca\13\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u05d3\n\u0086\3\u0087\7\u0087\u05d6\n\u0087\f\u0087\16\u0087"+
		"\u05d9\13\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05e0"+
		"\n\u0087\3\u0087\5\u0087\u05e3\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u05ea\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u05f2\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u05f8\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u05ff\n"+
		"\u008c\f\u008c\16\u008c\u0602\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u060b\n\u008e\3\u008f\3\u008f\5\u008f"+
		"\u060f\n\u008f\3\u008f\5\u008f\u0612\n\u008f\3\u008f\3\u008f\3\u0090\3"+
		"\u0090\3\u0090\7\u0090\u0619\n\u0090\f\u0090\16\u0090\u061c\13\u0090\3"+
		"\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\5\u0093\u0629\n\u0093\3\u0093\5\u0093\u062c\n\u0093\3"+
		"\u0093\3\u0093\3\u0094\3\u0094\3\u0094\7\u0094\u0633\n\u0094\f\u0094\16"+
		"\u0094\u0636\13\u0094\3\u0095\3\u0095\5\u0095\u063a\n\u0095\3\u0095\3"+
		"\u0095\3\u0096\3\u0096\7\u0096\u0640\n\u0096\f\u0096\16\u0096\u0643\13"+
		"\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u0648\n\u0097\3\u0098\3\u0098\3"+
		"\u0098\3\u0099\7\u0099\u064e\n\u0099\f\u0099\16\u0099\u0651\13\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u065c\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u0663\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0671\n\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0687\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u06a9\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\7\u00a7\u06b3\n\u00a7\f\u00a7\16\u00a7\u06b6\13\u00a7"+
		"\3\u00a7\7\u00a7\u06b9\n\u00a7\f\u00a7\16\u00a7\u06bc\13\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\7\u00a9\u06c5\n\u00a9"+
		"\f\u00a9\16\u00a9\u06c8\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u06d4\n\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u06ee\n\u00af\3\u00b0"+
		"\3\u00b0\5\u00b0\u06f2\n\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u06f7\n"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u06fb\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u06ff"+
		"\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0707"+
		"\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u070b\n\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u070f\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u0716\n"+
		"\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u071d\n\u00b5\f"+
		"\u00b5\16\u00b5\u0720\13\u00b5\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0725\n"+
		"\u00b6\f\u00b6\16\u00b6\u0728\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0734\n\u00b7"+
		"\f\u00b7\16\u00b7\u0737\13\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\5\u00b8\u0742\n\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\5\u00b9\u0748\n\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\5\u00ba\u074e\n\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0763\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0768\n\u00bd\3\u00be\3\u00be\7\u00be\u076c\n\u00be\f"+
		"\u00be\16\u00be\u076f\13\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00c0\7\u00c0\u0778\n\u00c0\f\u00c0\16\u00c0\u077b\13\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u0783\n\u00c1"+
		"\f\u00c1\16\u00c1\u0786\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u078f\n\u00c3\3\u00c3\5\u00c3\u0792\n\u00c3\3"+
		"\u00c4\3\u00c4\3\u00c4\5\u00c4\u0797\n\u00c4\3\u00c4\3\u00c4\3\u00c5\3"+
		"\u00c5\3\u00c5\7\u00c5\u079e\n\u00c5\f\u00c5\16\u00c5\u07a1\13\u00c5\3"+
		"\u00c6\7\u00c6\u07a4\n\u00c6\f\u00c6\16\u00c6\u07a7\13\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\5\u00c7\u07b0\n\u00c7\3"+
		"\u00c7\7\u00c7\u07b3\n\u00c7\f\u00c7\16\u00c7\u07b6\13\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\7\u00c8\u07bc\n\u00c8\f\u00c8\16\u00c8\u07bf\13"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u07d5\n\u00c8\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u07dd\n\u00ca\f\u00ca\16\u00ca\u07e0"+
		"\13\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u07f5\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u07fc\n\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u0804\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\7\u00ce"+
		"\u080a\n\u00ce\f\u00ce\16\u00ce\u080d\13\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u0815\n\u00ce\f\u00ce\16\u00ce\u0818"+
		"\13\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u082e\n\u00ce\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0836\n\u00d0\f\u00d0\16\u00d0\u0839"+
		"\13\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0841"+
		"\n\u00d0\f\u00d0\16\u00d0\u0844\13\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0859\n\u00d0"+
		"\3\u00d1\3\u00d1\5\u00d1\u085d\n\u00d1\3\u00d1\7\u00d1\u0860\n\u00d1\f"+
		"\u00d1\16\u00d1\u0863\13\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0868\n"+
		"\u00d1\f\u00d1\16\u00d1\u086b\13\u00d1\3\u00d1\7\u00d1\u086e\n\u00d1\f"+
		"\u00d1\16\u00d1\u0871\13\u00d1\3\u00d1\5\u00d1\u0874\n\u00d1\3\u00d1\3"+
		"\u00d1\5\u00d1\u0878\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u087c\n\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0882\n\u00d1\3\u00d1\7\u00d1\u0885\n"+
		"\u00d1\f\u00d1\16\u00d1\u0888\13\u00d1\3\u00d1\3\u00d1\5\u00d1\u088c\n"+
		"\u00d1\3\u00d1\3\u00d1\5\u00d1\u0890\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u0894"+
		"\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u089a\n\u00d1\3\u00d1"+
		"\7\u00d1\u089d\n\u00d1\f\u00d1\16\u00d1\u08a0\13\u00d1\3\u00d1\3\u00d1"+
		"\5\u00d1\u08a4\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u08a8\n\u00d1\3\u00d1\3"+
		"\u00d1\5\u00d1\u08ac\n\u00d1\5\u00d1\u08ae\n\u00d1\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u08b3\n\u00d2\3\u00d2\7\u00d2\u08b6\n\u00d2\f\u00d2\16\u00d2"+
		"\u08b9\13\u00d2\3\u00d2\3\u00d2\5\u00d2\u08bd\n\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u08c1\n\u00d2\3\u00d2\3\u00d2\5\u00d2\u08c5\n\u00d2\3\u00d3\3"+
		"\u00d3\5\u00d3\u08c9\n\u00d3\3\u00d3\7\u00d3\u08cc\n\u00d3\f\u00d3\16"+
		"\u00d3\u08cf\13\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u08d4\n\u00d3\f"+
		"\u00d3\16\u00d3\u08d7\13\u00d3\3\u00d3\7\u00d3\u08da\n\u00d3\f\u00d3\16"+
		"\u00d3\u08dd\13\u00d3\3\u00d3\5\u00d3\u08e0\n\u00d3\3\u00d3\3\u00d3\5"+
		"\u00d3\u08e4\n\u00d3\3\u00d3\3\u00d3\5\u00d3\u08e8\n\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\5\u00d3\u08ee\n\u00d3\3\u00d3\7\u00d3\u08f1\n\u00d3\f"+
		"\u00d3\16\u00d3\u08f4\13\u00d3\3\u00d3\3\u00d3\5\u00d3\u08f8\n\u00d3\3"+
		"\u00d3\3\u00d3\5\u00d3\u08fc\n\u00d3\3\u00d3\3\u00d3\5\u00d3\u0900\n\u00d3"+
		"\5\u00d3\u0902\n\u00d3\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0907\n\u00d4\3"+
		"\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0916\n\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\5\u00d7\u0924\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0930\n\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0937\n\u00d8\f\u00d8\16\u00d8"+
		"\u093a\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\7\u00d9\u0946\n\u00d9\f\u00d9\16\u00d9\u0949"+
		"\13\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\5\u00da\u0955\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\7\u00da\u095c\n\u00da\f\u00da\16\u00da\u095f\13\u00da\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0964\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\5\u00db\u096b\n\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0970\n"+
		"\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0977\n\u00db\3"+
		"\u00db\3\u00db\3\u00db\5\u00db\u097c\n\u00db\3\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\5\u00db\u0983\n\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0988"+
		"\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u098f\n\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u0994\n\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u099c\n\u00db\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u09a1\n\u00db\3\u00db\3\u00db\5\u00db\u09a5\n\u00db\3\u00dc\3"+
		"\u00dc\5\u00dc\u09a9\n\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u09ae\n\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09b5\n\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09bc\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u09c1\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u09c8\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09cd\n\u00dd\3"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09d4\n\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\5\u00dd\u09d9\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\5\u00dd\u09e1\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09e6"+
		"\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u09ea\n\u00dd\3\u00de\3\u00de\3\u00de"+
		"\7\u00de\u09ef\n\u00de\f\u00de\16\u00de\u09f2\13\u00de\3\u00df\3\u00df"+
		"\3\u00df\5\u00df\u09f7\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u09fe\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df"+
		"\u0a05\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a0c\n"+
		"\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a14\n"+
		"\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a1b\n\u00df\3"+
		"\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u0a23\n\u00df\3"+
		"\u00e0\3\u00e0\5\u00e0\u0a27\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3"+
		"\u00e1\5\u00e1\u0a2e\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5"+
		"\u00e1\u0a35\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a3c"+
		"\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a44"+
		"\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a4b\n\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a53\n\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a59\n\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\5\u00e2\u0a5f\n\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0a6b\n\u00e2"+
		"\3\u00e3\3\u00e3\7\u00e3\u0a6f\n\u00e3\f\u00e3\16\u00e3\u0a72\13\u00e3"+
		"\3\u00e4\7\u00e4\u0a75\n\u00e4\f\u00e4\16\u00e4\u0a78\13\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6\5\u00e6\u0a82"+
		"\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\5\u00e8"+
		"\u0a8b\n\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0a92\n"+
		"\u00e8\3\u00e9\3\u00e9\3\u00e9\7\u00e9\u0a97\n\u00e9\f\u00e9\16\u00e9"+
		"\u0a9a\13\u00e9\3\u00ea\3\u00ea\5\u00ea\u0a9e\n\u00ea\3\u00eb\3\u00eb"+
		"\5\u00eb\u0aa2\n\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\5\u00ed\u0aab\n\u00ed\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0ab6\n\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u0abe\n\u00f0\f\u00f0\16\u00f0"+
		"\u0ac1\13\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1"+
		"\u0ac9\n\u00f1\f\u00f1\16\u00f1\u0acc\13\u00f1\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\7\u00f2\u0ad4\n\u00f2\f\u00f2\16\u00f2\u0ad7"+
		"\13\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0adf"+
		"\n\u00f3\f\u00f3\16\u00f3\u0ae2\13\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\7\u00f4\u0aea\n\u00f4\f\u00f4\16\u00f4\u0aed\13\u00f4"+
		"\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\7\u00f5\u0af8\n\u00f5\f\u00f5\16\u00f5\u0afb\13\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\7\u00f6\u0b0f"+
		"\n\u00f6\f\u00f6\16\u00f6\u0b12\13\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\7\u00f7\u0b24\n\u00f7\f\u00f7\16\u00f7\u0b27"+
		"\13\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\7\u00f8\u0b32\n\u00f8\f\u00f8\16\u00f8\u0b35\13\u00f8\3\u00f9"+
		"\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9"+
		"\3\u00f9\3\u00f9\7\u00f9\u0b43\n\u00f9\f\u00f9\16\u00f9\u0b46\13\u00f9"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0b4f"+
		"\n\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fd\3\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\3\u00fd\5\u00fd\u0b5d\n\u00fd\3\u00fe\3\u00fe"+
		"\5\u00fe\u0b61\n\u00fe\3\u00fe\3\u00fe\7\u00fe\u0b65\n\u00fe\f\u00fe\16"+
		"\u00fe\u0b68\13\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u0100\3\u0100\3\u0101"+
		"\3\u0101\3\u0101\3\u0102\3\u0102\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103"+
		"\3\u0103\3\u0103\3\u0103\7\u0103\u0b7c\n\u0103\f\u0103\16\u0103\u0b7f"+
		"\13\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\3\u0103\7\u0103\u0b87"+
		"\n\u0103\f\u0103\16\u0103\u0b8a\13\u0103\3\u0103\3\u0103\3\u0103\5\u0103"+
		"\u0b8f\n\u0103\3\u0103\2\17JNR\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea"+
		"\u01ec\u01ee\u01f0\u0104\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
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
		"\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec"+
		"\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204"+
		"\2\5\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2DD]g\u0c77\2\u020c"+
		"\3\2\2\2\4\u020e\3\2\2\2\6\u0210\3\2\2\2\b\u0212\3\2\2\2\n\u0214\3\2\2"+
		"\2\f\u0216\3\2\2\2\16\u0218\3\2\2\2\20\u021a\3\2\2\2\22\u021c\3\2\2\2"+
		"\24\u021e\3\2\2\2\26\u0220\3\2\2\2\30\u0224\3\2\2\2\32\u0234\3\2\2\2\34"+
		"\u0238\3\2\2\2\36\u023a\3\2\2\2 \u023c\3\2\2\2\"\u0241\3\2\2\2$\u0245"+
		"\3\2\2\2&\u0264\3\2\2\2(\u0266\3\2\2\2*\u0274\3\2\2\2,\u027b\3\2\2\2."+
		"\u027d\3\2\2\2\60\u027f\3\2\2\2\62\u0284\3\2\2\2\64\u0292\3\2\2\2\66\u0297"+
		"\3\2\2\28\u02ac\3\2\2\2:\u02b3\3\2\2\2<\u02bf\3\2\2\2>\u02c1\3\2\2\2@"+
		"\u02c4\3\2\2\2B\u02c8\3\2\2\2D\u02d2\3\2\2\2F\u02d7\3\2\2\2H\u02e2\3\2"+
		"\2\2J\u02e4\3\2\2\2L\u02f4\3\2\2\2N\u02f6\3\2\2\2P\u0306\3\2\2\2R\u0308"+
		"\3\2\2\2T\u0314\3\2\2\2V\u0325\3\2\2\2X\u0333\3\2\2\2Z\u0339\3\2\2\2\\"+
		"\u033b\3\2\2\2^\u033f\3\2\2\2`\u0345\3\2\2\2b\u034c\3\2\2\2d\u0356\3\2"+
		"\2\2f\u035a\3\2\2\2h\u035c\3\2\2\2j\u036a\3\2\2\2l\u036f\3\2\2\2n\u037a"+
		"\3\2\2\2p\u037c\3\2\2\2r\u0380\3\2\2\2t\u0388\3\2\2\2v\u038b\3\2\2\2x"+
		"\u038e\3\2\2\2z\u0396\3\2\2\2|\u03a3\3\2\2\2~\u03aa\3\2\2\2\u0080\u03ac"+
		"\3\2\2\2\u0082\u03b4\3\2\2\2\u0084\u03bf\3\2\2\2\u0086\u03c1\3\2\2\2\u0088"+
		"\u03c9\3\2\2\2\u008a\u03ce\3\2\2\2\u008c\u03d4\3\2\2\2\u008e\u03d6\3\2"+
		"\2\2\u0090\u03d8\3\2\2\2\u0092\u03da\3\2\2\2\u0094\u03e2\3\2\2\2\u0096"+
		"\u03e7\3\2\2\2\u0098\u03ed\3\2\2\2\u009a\u03f1\3\2\2\2\u009c\u03f5\3\2"+
		"\2\2\u009e\u03fa\3\2\2\2\u00a0\u03fe\3\2\2\2\u00a2\u0417\3\2\2\2\u00a4"+
		"\u0419\3\2\2\2\u00a6\u0424\3\2\2\2\u00a8\u0428\3\2\2\2\u00aa\u042a\3\2"+
		"\2\2\u00ac\u042c\3\2\2\2\u00ae\u042e\3\2\2\2\u00b0\u0439\3\2\2\2\u00b2"+
		"\u043e\3\2\2\2\u00b4\u044e\3\2\2\2\u00b6\u0461\3\2\2\2\u00b8\u0465\3\2"+
		"\2\2\u00ba\u0467\3\2\2\2\u00bc\u0470\3\2\2\2\u00be\u0477\3\2\2\2\u00c0"+
		"\u0489\3\2\2\2\u00c2\u048e\3\2\2\2\u00c4\u0494\3\2\2\2\u00c6\u0498\3\2"+
		"\2\2\u00c8\u049c\3\2\2\2\u00ca\u04af\3\2\2\2\u00cc\u04b4\3\2\2\2\u00ce"+
		"\u04be\3\2\2\2\u00d0\u04c1\3\2\2\2\u00d2\u04cb\3\2\2\2\u00d4\u04cf\3\2"+
		"\2\2\u00d6\u04d1\3\2\2\2\u00d8\u04d3\3\2\2\2\u00da\u04d9\3\2\2\2\u00dc"+
		"\u04e6\3\2\2\2\u00de\u04e9\3\2\2\2\u00e0\u04f2\3\2\2\2\u00e2\u04f4\3\2"+
		"\2\2\u00e4\u052b\3\2\2\2\u00e6\u0530\3\2\2\2\u00e8\u053a\3\2\2\2\u00ea"+
		"\u0546\3\2\2\2\u00ec\u0551\3\2\2\2\u00ee\u055f\3\2\2\2\u00f0\u0561\3\2"+
		"\2\2\u00f2\u056a\3\2\2\2\u00f4\u056f\3\2\2\2\u00f6\u0583\3\2\2\2\u00f8"+
		"\u0585\3\2\2\2\u00fa\u0588\3\2\2\2\u00fc\u0596\3\2\2\2\u00fe\u059b\3\2"+
		"\2\2\u0100\u05a6\3\2\2\2\u0102\u05ab\3\2\2\2\u0104\u05b7\3\2\2\2\u0106"+
		"\u05bc\3\2\2\2\u0108\u05c4\3\2\2\2\u010a\u05d2\3\2\2\2\u010c\u05d7\3\2"+
		"\2\2\u010e\u05e9\3\2\2\2\u0110\u05eb\3\2\2\2\u0112\u05f1\3\2\2\2\u0114"+
		"\u05f3\3\2\2\2\u0116\u05fb\3\2\2\2\u0118\u0603\3\2\2\2\u011a\u060a\3\2"+
		"\2\2\u011c\u060c\3\2\2\2\u011e\u0615\3\2\2\2\u0120\u061d\3\2\2\2\u0122"+
		"\u0620\3\2\2\2\u0124\u0626\3\2\2\2\u0126\u062f\3\2\2\2\u0128\u0637\3\2"+
		"\2\2\u012a\u063d\3\2\2\2\u012c\u0647\3\2\2\2\u012e\u0649\3\2\2\2\u0130"+
		"\u064f\3\2\2\2\u0132\u065b\3\2\2\2\u0134\u0662\3\2\2\2\u0136\u0670\3\2"+
		"\2\2\u0138\u0672\3\2\2\2\u013a\u0674\3\2\2\2\u013c\u0678\3\2\2\2\u013e"+
		"\u067c\3\2\2\2\u0140\u0686\3\2\2\2\u0142\u0688\3\2\2\2\u0144\u068e\3\2"+
		"\2\2\u0146\u0696\3\2\2\2\u0148\u06a8\3\2\2\2\u014a\u06aa\3\2\2\2\u014c"+
		"\u06b0\3\2\2\2\u014e\u06bf\3\2\2\2\u0150\u06c2\3\2\2\2\u0152\u06d3\3\2"+
		"\2\2\u0154\u06d5\3\2\2\2\u0156\u06d7\3\2\2\2\u0158\u06dd\3\2\2\2\u015a"+
		"\u06e3\3\2\2\2\u015c\u06ed\3\2\2\2\u015e\u06f1\3\2\2\2\u0160\u06f3\3\2"+
		"\2\2\u0162\u0703\3\2\2\2\u0164\u0715\3\2\2\2\u0166\u0717\3\2\2\2\u0168"+
		"\u0719\3\2\2\2\u016a\u0721\3\2\2\2\u016c\u0730\3\2\2\2\u016e\u073f\3\2"+
		"\2\2\u0170\u0745\3\2\2\2\u0172\u074b\3\2\2\2\u0174\u0751\3\2\2\2\u0176"+
		"\u0755\3\2\2\2\u0178\u0767\3\2\2\2\u017a\u0769\3\2\2\2\u017c\u0770\3\2"+
		"\2\2\u017e\u0779\3\2\2\2\u0180\u077f\3\2\2\2\u0182\u0787\3\2\2\2\u0184"+
		"\u078a\3\2\2\2\u0186\u0793\3\2\2\2\u0188\u079a\3\2\2\2\u018a\u07a5\3\2"+
		"\2\2\u018c\u07af\3\2\2\2\u018e\u07d4\3\2\2\2\u0190\u07d6\3\2\2\2\u0192"+
		"\u07f4\3\2\2\2\u0194\u07fb\3\2\2\2\u0196\u07fd\3\2\2\2\u0198\u0803\3\2"+
		"\2\2\u019a\u082d\3\2\2\2\u019c\u082f\3\2\2\2\u019e\u0858\3\2\2\2\u01a0"+
		"\u08ad\3\2\2\2\u01a2\u08af\3\2\2\2\u01a4\u0901\3\2\2\2\u01a6\u0906\3\2"+
		"\2\2\u01a8\u0915\3\2\2\2\u01aa\u0917\3\2\2\2\u01ac\u0923\3\2\2\2\u01ae"+
		"\u092f\3\2\2\2\u01b0\u093b\3\2\2\2\u01b2\u0954\3\2\2\2\u01b4\u09a4\3\2"+
		"\2\2\u01b6\u09a6\3\2\2\2\u01b8\u09e9\3\2\2\2\u01ba\u09eb\3\2\2\2\u01bc"+
		"\u0a22\3\2\2\2\u01be\u0a24\3\2\2\2\u01c0\u0a52\3\2\2\2\u01c2\u0a6a\3\2"+
		"\2\2\u01c4\u0a6c\3\2\2\2\u01c6\u0a76\3\2\2\2\u01c8\u0a7d\3\2\2\2\u01ca"+
		"\u0a81\3\2\2\2\u01cc\u0a83\3\2\2\2\u01ce\u0a91\3\2\2\2\u01d0\u0a93\3\2"+
		"\2\2\u01d2\u0a9d\3\2\2\2\u01d4\u0aa1\3\2\2\2\u01d6\u0aa3\3\2\2\2\u01d8"+
		"\u0aaa\3\2\2\2\u01da\u0aac\3\2\2\2\u01dc\u0ab5\3\2\2\2\u01de\u0ab7\3\2"+
		"\2\2\u01e0\u0ac2\3\2\2\2\u01e2\u0acd\3\2\2\2\u01e4\u0ad8\3\2\2\2\u01e6"+
		"\u0ae3\3\2\2\2\u01e8\u0aee\3\2\2\2\u01ea\u0afc\3\2\2\2\u01ec\u0b13\3\2"+
		"\2\2\u01ee\u0b28\3\2\2\2\u01f0\u0b36\3\2\2\2\u01f2\u0b4e\3\2\2\2\u01f4"+
		"\u0b50\3\2\2\2\u01f6\u0b53\3\2\2\2\u01f8\u0b5c\3\2\2\2\u01fa\u0b60\3\2"+
		"\2\2\u01fc\u0b69\3\2\2\2\u01fe\u0b6c\3\2\2\2\u0200\u0b6e\3\2\2\2\u0202"+
		"\u0b71\3\2\2\2\u0204\u0b8e\3\2\2\2\u0206\u020d\5\4\3\2\u0207\u020d\5\b"+
		"\5\2\u0208\u020d\5\f\7\2\u0209\u020d\5\24\13\2\u020a\u020d\5\20\t\2\u020b"+
		"\u020d\5\26\f\2\u020c\u0206\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u0208\3"+
		"\2\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\3\3\2\2\2\u020e\u020f\5\6\4\2\u020f\5\3\2\2\2\u0210\u0211\7\65\2\2\u0211"+
		"\7\3\2\2\2\u0212\u0213\5\n\6\2\u0213\t\3\2\2\2\u0214\u0215\7\66\2\2\u0215"+
		"\13\3\2\2\2\u0216\u0217\5\16\b\2\u0217\r\3\2\2\2\u0218\u0219\7\67\2\2"+
		"\u0219\17\3\2\2\2\u021a\u021b\5\22\n\2\u021b\21\3\2\2\2\u021c\u021d\7"+
		"9\2\2\u021d\23\3\2\2\2\u021e\u021f\78\2\2\u021f\25\3\2\2\2\u0220\u0221"+
		"\7:\2\2\u0221\27\3\2\2\2\u0222\u0225\5\32\16\2\u0223\u0225\5\"\22\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\31\3\2\2\2\u0226\u0228\5\u0112"+
		"\u008a\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0235\5\34"+
		"\17\2\u022d\u022f\5\u0112\u008a\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0235\7\5\2\2\u0234\u0229\3\2\2\2\u0234\u0230\3\2"+
		"\2\2\u0235\33\3\2\2\2\u0236\u0239\5\36\20\2\u0237\u0239\5 \21\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\35\3\2\2\2\u023a\u023b\t\2\2"+
		"\2\u023b\37\3\2\2\2\u023c\u023d\t\3\2\2\u023d!\3\2\2\2\u023e\u0242\5$"+
		"\23\2\u023f\u0242\5\62\32\2\u0240\u0242\5\64\33\2\u0241\u023e\3\2\2\2"+
		"\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242#\3\2\2\2\u0243\u0246\5"+
		"*\26\2\u0244\u0246\5\60\31\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246"+
		"\u024b\3\2\2\2\u0247\u024a\5(\25\2\u0248\u024a\5.\30\2\u0249\u0247\3\2"+
		"\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c%\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\5\u0112"+
		"\u008a\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7h"+
		"\2\2\u0255\u0257\5@!\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0265"+
		"\3\2\2\2\u0258\u0259\5$\23\2\u0259\u025d\7C\2\2\u025a\u025c\5\u0112\u008a"+
		"\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\7h\2\2\u0261"+
		"\u0263\5@!\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2"+
		"\2\u0264\u0251\3\2\2\2\u0264\u0258\3\2\2\2\u0265\'\3\2\2\2\u0266\u026a"+
		"\7C\2\2\u0267\u0269\5\u0112\u008a\2\u0268\u0267\3\2\2\2\u0269\u026c\3"+
		"\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c"+
		"\u026a\3\2\2\2\u026d\u026f\7h\2\2\u026e\u0270\5@!\2\u026f\u026e\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270)\3\2\2\2\u0271\u0273\5\u0112\u008a\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\7h\2\2\u0278"+
		"\u027a\5@!\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a+\3\2\2\2\u027b"+
		"\u027c\5&\24\2\u027c-\3\2\2\2\u027d\u027e\5(\25\2\u027e/\3\2\2\2\u027f"+
		"\u0280\5*\26\2\u0280\61\3\2\2\2\u0281\u0283\5\u0112\u008a\2\u0282\u0281"+
		"\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7h\2\2\u0288\63\3\2\2\2"+
		"\u0289\u028a\5\32\16\2\u028a\u028b\5\66\34\2\u028b\u0293\3\2\2\2\u028c"+
		"\u028d\5$\23\2\u028d\u028e\5\66\34\2\u028e\u0293\3\2\2\2\u028f\u0290\5"+
		"\62\32\2\u0290\u0291\5\66\34\2\u0291\u0293\3\2\2\2\u0292\u0289\3\2\2\2"+
		"\u0292\u028c\3\2\2\2\u0292\u028f\3\2\2\2\u0293\65\3\2\2\2\u0294\u0296"+
		"\5\u0112\u008a\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a"+
		"\u029b\7?\2\2\u029b\u02a6\7@\2\2\u029c\u029e\5\u0112\u008a\2\u029d\u029c"+
		"\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a3\7?\2\2\u02a3\u02a5\7@\2"+
		"\2\u02a4\u029f\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\67\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ab\5:\36\2\u02aa"+
		"\u02a9\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b1\7h\2\2\u02b0"+
		"\u02b2\5<\37\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b29\3\2\2\2"+
		"\u02b3\u02b4\5\u0112\u008a\2\u02b4;\3\2\2\2\u02b5\u02b6\7\23\2\2\u02b6"+
		"\u02c0\5\62\32\2\u02b7\u02b8\7\23\2\2\u02b8\u02bc\5$\23\2\u02b9\u02bb"+
		"\5> \2\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02b5\3\2"+
		"\2\2\u02bf\u02b7\3\2\2\2\u02c0=\3\2\2\2\u02c1\u02c2\7W\2\2\u02c2\u02c3"+
		"\5,\27\2\u02c3?\3\2\2\2\u02c4\u02c5\7F\2\2\u02c5\u02c6\5B\"\2\u02c6\u02c7"+
		"\7E\2\2\u02c7A\3\2\2\2\u02c8\u02cd\5D#\2\u02c9\u02ca\7B\2\2\u02ca\u02cc"+
		"\5D#\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ceC\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\5\"\22\2"+
		"\u02d1\u02d3\5F$\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3E\3\2"+
		"\2\2\u02d4\u02d6\5\u0112\u008a\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2"+
		"\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02dc\7I\2\2\u02db\u02dd\5H%\2\u02dc\u02db\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02ddG\3\2\2\2\u02de\u02df\7\23\2\2\u02df\u02e3\5\"\22"+
		"\2\u02e0\u02e1\7*\2\2\u02e1\u02e3\5\"\22\2\u02e2\u02de\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e3I\3\2\2\2\u02e4\u02e5\b&\1\2\u02e5\u02e6\7h\2\2\u02e6\u02ec"+
		"\3\2\2\2\u02e7\u02e8\f\3\2\2\u02e8\u02e9\7C\2\2\u02e9\u02eb\7h\2\2\u02ea"+
		"\u02e7\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02edK\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f5\7h\2\2\u02f0\u02f1"+
		"\5N(\2\u02f1\u02f2\7C\2\2\u02f2\u02f3\7h\2\2\u02f3\u02f5\3\2\2\2\u02f4"+
		"\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5M\3\2\2\2\u02f6\u02f7\b(\1\2\u02f7"+
		"\u02f8\7h\2\2\u02f8\u02fe\3\2\2\2\u02f9\u02fa\f\3\2\2\u02fa\u02fb\7C\2"+
		"\2\u02fb\u02fd\7h\2\2\u02fc\u02f9\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffO\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0307\7h\2\2\u0302\u0303\5R*\2\u0303\u0304\7C\2\2\u0304\u0305\7h\2\2"+
		"\u0305\u0307\3\2\2\2\u0306\u0301\3\2\2\2\u0306\u0302\3\2\2\2\u0307Q\3"+
		"\2\2\2\u0308\u0309\b*\1\2\u0309\u030a\7h\2\2\u030a\u0310\3\2\2\2\u030b"+
		"\u030c\f\3\2\2\u030c\u030d\7C\2\2\u030d\u030f\7h\2\2\u030e\u030b\3\2\2"+
		"\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311S"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0315\5V,\2\u0314\u0313\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0319\3\2\2\2\u0316\u0318\5Z.\2\u0317\u0316\3\2\2"+
		"\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031f"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031e\5d\63\2\u031d\u031c\3\2\2\2\u031e"+
		"\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320U\3\2\2\2"+
		"\u0321\u031f\3\2\2\2\u0322\u0324\5X-\2\u0323\u0322\3\2\2\2\u0324\u0327"+
		"\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0328\u0329\7\"\2\2\u0329\u032e\7h\2\2\u032a\u032b\7C\2"+
		"\2\u032b\u032d\7h\2\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c"+
		"\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331"+
		"\u0332\7A\2\2\u0332W\3\2\2\2\u0333\u0334\5\u0112\u008a\2\u0334Y\3\2\2"+
		"\2\u0335\u033a\5\\/\2\u0336\u033a\5^\60\2\u0337\u033a\5`\61\2\u0338\u033a"+
		"\5b\62\2\u0339\u0335\3\2\2\2\u0339\u0336\3\2\2\2\u0339\u0337\3\2\2\2\u0339"+
		"\u0338\3\2\2\2\u033a[\3\2\2\2\u033b\u033c\7\33\2\2\u033c\u033d\5L\'\2"+
		"\u033d\u033e\7A\2\2\u033e]\3\2\2\2\u033f\u0340\7\33\2\2\u0340\u0341\5"+
		"N(\2\u0341\u0342\7C\2\2\u0342\u0343\7U\2\2\u0343\u0344\7A\2\2\u0344_\3"+
		"\2\2\2\u0345\u0346\7\33\2\2\u0346\u0347\7(\2\2\u0347\u0348\5L\'\2\u0348"+
		"\u0349\7C\2\2\u0349\u034a\7h\2\2\u034a\u034b\7A\2\2\u034ba\3\2\2\2\u034c"+
		"\u034d\7\33\2\2\u034d\u034e\7(\2\2\u034e\u034f\5L\'\2\u034f\u0350\7C\2"+
		"\2\u0350\u0351\7U\2\2\u0351\u0352\7A\2\2\u0352c\3\2\2\2\u0353\u0357\5"+
		"f\64\2\u0354\u0357\5\u00f2z\2\u0355\u0357\7A\2\2\u0356\u0353\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0356\u0355\3\2\2\2\u0357e\3\2\2\2\u0358\u035b\5h\65\2"+
		"\u0359\u035b\5\u00e6t\2\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035b"+
		"g\3\2\2\2\u035c\u035d\5l\67\2\u035d\u035e\7\13\2\2\u035e\u0360\5j\66\2"+
		"\u035f\u0361\5p9\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u0364\5t;\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0366\3\2\2\2\u0365\u0367\5v<\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0369\5z>\2\u0369i\3\2\2\2\u036a\u036b\7"+
		"h\2\2\u036bk\3\2\2\2\u036c\u036e\5n8\2\u036d\u036c\3\2\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370m\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0372\u037b\5\u0112\u008a\2\u0373\u037b\7%\2\2\u0374\u037b"+
		"\7$\2\2\u0375\u037b\7#\2\2\u0376\u037b\7\3\2\2\u0377\u037b\7(\2\2\u0378"+
		"\u037b\7\24\2\2\u0379\u037b\7)\2\2\u037a\u0372\3\2\2\2\u037a\u0373\3\2"+
		"\2\2\u037a\u0374\3\2\2\2\u037a\u0375\3\2\2\2\u037a\u0376\3\2\2\2\u037a"+
		"\u0377\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037bo\3\2\2\2"+
		"\u037c\u037d\7F\2\2\u037d\u037e\5r:\2\u037e\u037f\7E\2\2\u037fq\3\2\2"+
		"\2\u0380\u0385\58\35\2\u0381\u0382\7B\2\2\u0382\u0384\58\35\2\u0383\u0381"+
		"\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"s\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389\7\23\2\2\u0389\u038a\5&\24\2"+
		"\u038au\3\2\2\2\u038b\u038c\7\32\2\2\u038c\u038d\5x=\2\u038dw\3\2\2\2"+
		"\u038e\u0393\5,\27\2\u038f\u0390\7B\2\2\u0390\u0392\5,\27\2\u0391\u038f"+
		"\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"y\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u039a\7=\2\2\u0397\u0399\5|?\2\u0398"+
		"\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039b\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7>\2\2\u039e"+
		"{\3\2\2\2\u039f\u03a4\5~@\2\u03a0\u03a4\5\u00d6l\2\u03a1\u03a4\5\u00d8"+
		"m\2\u03a2\u03a4\5\u00dan\2\u03a3\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4}\3\2\2\2\u03a5\u03ab\5\u0080"+
		"A\2\u03a6\u03ab\5\u00b2Z\2\u03a7\u03ab\5f\64\2\u03a8\u03ab\5\u00f2z\2"+
		"\u03a9\u03ab\7A\2\2\u03aa\u03a5\3\2\2\2\u03aa\u03a6\3\2\2\2\u03aa\u03a7"+
		"\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\177\3\2\2\2\u03ac"+
		"\u03ad\5\u0082B\2\u03ad\u03ae\5\u009aN\2\u03ae\u03af\5\u0086D\2\u03af"+
		"\u03b0\7A\2\2\u03b0\u0081\3\2\2\2\u03b1\u03b3\5\u0084C\2\u03b2\u03b1\3"+
		"\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u0083\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03c0\5\u0112\u008a\2\u03b8\u03c0"+
		"\7%\2\2\u03b9\u03c0\7$\2\2\u03ba\u03c0\7#\2\2\u03bb\u03c0\7(\2\2\u03bc"+
		"\u03c0\7\24\2\2\u03bd\u03c0\7\60\2\2\u03be\u03c0\7\63\2\2\u03bf\u03b7"+
		"\3\2\2\2\u03bf\u03b8\3\2\2\2\u03bf\u03b9\3\2\2\2\u03bf\u03ba\3\2\2\2\u03bf"+
		"\u03bb\3\2\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2"+
		"\2\2\u03c0\u0085\3\2\2\2\u03c1\u03c6\5\u0088E\2\u03c2\u03c3\7B\2\2\u03c3"+
		"\u03c5\5\u0088E\2\u03c4\u03c2\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u0087\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03cc\5\u008aF\2\u03ca\u03cb\7D\2\2\u03cb\u03cd\5\u008cG\2\u03cc\u03ca"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u0089\3\2\2\2\u03ce\u03d0\7h\2\2\u03cf"+
		"\u03d1\5\66\34\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u008b\3"+
		"\2\2\2\u03d2\u03d5\5\u008eH\2\u03d3\u03d5\5\u0090I\2\u03d4\u03d2\3\2\2"+
		"\2\u03d4\u03d3\3\2\2\2\u03d5\u008d\3\2\2\2\u03d6\u03d7\5\u01ca\u00e6\2"+
		"\u03d7\u008f\3\2\2\2\u03d8\u03d9\5\u0124\u0093\2\u03d9\u0091\3\2\2\2\u03da"+
		"\u03df\5\u0094K\2\u03db\u03dc\7B\2\2\u03dc\u03de\5\u0094K\2\u03dd\u03db"+
		"\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u0093\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e5\5\u0096L\2\u03e3\u03e4"+
		"\7D\2\2\u03e4\u03e6\5\u0098M\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2"+
		"\u03e6\u0095\3\2\2\2\u03e7\u03e9\7h\2\2\u03e8\u03ea\5\66\34\2\u03e9\u03e8"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u0097\3\2\2\2\u03eb\u03ee\5\u01ca\u00e6"+
		"\2\u03ec\u03ee\5\u0124\u0093\2\u03ed\u03eb\3\2\2\2\u03ed\u03ec\3\2\2\2"+
		"\u03ee\u0099\3\2\2\2\u03ef\u03f2\5\u009cO\2\u03f0\u03f2\5\u009eP\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2\u009b\3\2\2\2\u03f3\u03f6\5\34"+
		"\17\2\u03f4\u03f6\7\5\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2\2\2\u03f6"+
		"\u009d\3\2\2\2\u03f7\u03fb\5\u00a0Q\2\u03f8\u03fb\5\u00aeX\2\u03f9\u03fb"+
		"\5\u00b0Y\2\u03fa\u03f7\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3\2\2"+
		"\2\u03fb\u009f\3\2\2\2\u03fc\u03ff\5\u00a6T\2\u03fd\u03ff\5\u00acW\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0404\3\2\2\2\u0400\u0403\5\u00a4"+
		"S\2\u0401\u0403\5\u00aaV\2\u0402\u0400\3\2\2\2\u0402\u0401\3\2\2\2\u0403"+
		"\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u00a1\3\2"+
		"\2\2\u0406\u0404\3\2\2\2\u0407\u0409\7h\2\2\u0408\u040a\5@!\2\u0409\u0408"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u0418\3\2\2\2\u040b\u040c\5\u00a0Q"+
		"\2\u040c\u0410\7C\2\2\u040d\u040f\5\u0112\u008a\2\u040e\u040d\3\2\2\2"+
		"\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413"+
		"\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0415\7h\2\2\u0414\u0416\5@!\2\u0415"+
		"\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0407\3\2"+
		"\2\2\u0417\u040b\3\2\2\2\u0418\u00a3\3\2\2\2\u0419\u041d\7C\2\2\u041a"+
		"\u041c\5\u0112\u008a\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u041d\3\2\2\2\u0420"+
		"\u0422\7h\2\2\u0421\u0423\5@!\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2"+
		"\2\u0423\u00a5\3\2\2\2\u0424\u0426\7h\2\2\u0425\u0427\5@!\2\u0426\u0425"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u00a7\3\2\2\2\u0428\u0429\5\u00a2R"+
		"\2\u0429\u00a9\3\2\2\2\u042a\u042b\5\u00a4S\2\u042b\u00ab\3\2\2\2\u042c"+
		"\u042d\5\u00a6T\2\u042d\u00ad\3\2\2\2\u042e\u042f\7h\2\2\u042f\u00af\3"+
		"\2\2\2\u0430\u0431\5\u009cO\2\u0431\u0432\5\66\34\2\u0432\u043a\3\2\2"+
		"\2\u0433\u0434\5\u00a0Q\2\u0434\u0435\5\66\34\2\u0435\u043a\3\2\2\2\u0436"+
		"\u0437\5\u00aeX\2\u0437\u0438\5\66\34\2\u0438\u043a\3\2\2\2\u0439\u0430"+
		"\3\2\2\2\u0439\u0433\3\2\2\2\u0439\u0436\3\2\2\2\u043a\u00b1\3\2\2\2\u043b"+
		"\u043d\5\u00b4[\2\u043c\u043b\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441"+
		"\u0442\5\u00b6\\\2\u0442\u0443\5\u00d4k\2\u0443\u00b3\3\2\2\2\u0444\u044f"+
		"\5\u0112\u008a\2\u0445\u044f\7%\2\2\u0446\u044f\7$\2\2\u0447\u044f\7#"+
		"\2\2\u0448\u044f\7\3\2\2\u0449\u044f\7(\2\2\u044a\u044f\7\24\2\2\u044b"+
		"\u044f\7,\2\2\u044c\u044f\7 \2\2\u044d\u044f\7)\2\2\u044e\u0444\3\2\2"+
		"\2\u044e\u0445\3\2\2\2\u044e\u0446\3\2\2\2\u044e\u0447\3\2\2\2\u044e\u0448"+
		"\3\2\2\2\u044e\u0449\3\2\2\2\u044e\u044a\3\2\2\2\u044e\u044b\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044e\u044d\3\2\2\2\u044f\u00b5\3\2\2\2\u0450\u0451\5\u00b8"+
		"]\2\u0451\u0453\5\u00ba^\2\u0452\u0454\5\u00ceh\2\u0453\u0452\3\2\2\2"+
		"\u0453\u0454\3\2\2\2\u0454\u0462\3\2\2\2\u0455\u0459\5p9\2\u0456\u0458"+
		"\5\u0112\u008a\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3"+
		"\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2\2\2\u045c"+
		"\u045d\5\u00b8]\2\u045d\u045f\5\u00ba^\2\u045e\u0460\5\u00ceh\2\u045f"+
		"\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u0450\3\2"+
		"\2\2\u0461\u0455\3\2\2\2\u0462\u00b7\3\2\2\2\u0463\u0466\5\u009aN\2\u0464"+
		"\u0466\7\62\2\2\u0465\u0463\3\2\2\2\u0465\u0464\3\2\2\2\u0466\u00b9\3"+
		"\2\2\2\u0467\u0468\5\u00bc_\2\u0468\u046a\7;\2\2\u0469\u046b\5\u00be`"+
		"\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e"+
		"\7<\2\2\u046d\u046f\5\66\34\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2"+
		"\u046f\u00bb\3\2\2\2\u0470\u0471\7h\2\2\u0471\u00bd\3\2\2\2\u0472\u0473"+
		"\5\u00c0a\2\u0473\u0474\7B\2\2\u0474\u0475\5\u00caf\2\u0475\u0478\3\2"+
		"\2\2\u0476\u0478\5\u00caf\2\u0477\u0472\3\2\2\2\u0477\u0476\3\2\2\2\u0478"+
		"\u00bf\3\2\2\2\u0479\u047e\5\u00c2b\2\u047a\u047b\7B\2\2\u047b\u047d\5"+
		"\u00c2b\2\u047c\u047a\3\2\2\2\u047d\u0480\3\2\2\2\u047e\u047c\3\2\2\2"+
		"\u047e\u047f\3\2\2\2\u047f\u048a\3\2\2\2\u0480\u047e\3\2\2\2\u0481\u0486"+
		"\5\u00ccg\2\u0482\u0483\7B\2\2\u0483\u0485\5\u00c2b\2\u0484\u0482\3\2"+
		"\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u0479\3\2\2\2\u0489\u0481\3\2"+
		"\2\2\u048a\u00c1\3\2\2\2\u048b\u048d\5\u00c8e\2\u048c\u048b\3\2\2\2\u048d"+
		"\u0490\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2"+
		"\2\2\u0490\u048e\3\2\2\2\u0491\u0492\5\u009aN\2\u0492\u0493\5\u00c4c\2"+
		"\u0493\u00c3\3\2\2\2\u0494\u0496\5\u00c6d\2\u0495\u0497\5\66\34\2\u0496"+
		"\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u00c5\3\2\2\2\u0498\u0499\7h"+
		"\2\2\u0499\u00c7\3\2\2\2\u049a\u049d\5\u0112\u008a\2\u049b\u049d\7\24"+
		"\2\2\u049c\u049a\3\2\2\2\u049c\u049b\3\2\2\2\u049d\u00c9\3\2\2\2\u049e"+
		"\u04a0\5\u00c8e\2\u049f\u049e\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f"+
		"\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a8\5\u009aN\2\u04a5\u04a7\5\u0112\u008a\2\u04a6\u04a5\3\2\2\2\u04a7"+
		"\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3\2"+
		"\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ac\7j\2\2\u04ac\u04ad\5\u0096L\2\u04ad"+
		"\u04b0\3\2\2\2\u04ae\u04b0\5\u00c2b\2\u04af\u04a1\3\2\2\2\u04af\u04ae"+
		"\3\2\2\2\u04b0\u00cb\3\2\2\2\u04b1\u04b3\5\u0112\u008a\2\u04b2\u04b1\3"+
		"\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04ba\5\u009aN\2\u04b8\u04b9"+
		"\7h\2\2\u04b9\u04bb\7C\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04bd\7-\2\2\u04bd\u00cd\3\2\2\2\u04be\u04bf\7/\2"+
		"\2\u04bf\u04c0\5\u00d0i\2\u04c0\u00cf\3\2\2\2\u04c1\u04c6\5\u00d2j\2\u04c2"+
		"\u04c3\7B\2\2\u04c3\u04c5\5\u00d2j\2\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3"+
		"\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u00d1\3\2\2\2\u04c8"+
		"\u04c6\3\2\2\2\u04c9\u04cc\5&\24\2\u04ca\u04cc\5\62\32\2\u04cb\u04c9\3"+
		"\2\2\2\u04cb\u04ca\3\2\2\2\u04cc\u00d3\3\2\2\2\u04cd\u04d0\5\u0128\u0095"+
		"\2\u04ce\u04d0\7A\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u00d5"+
		"\3\2\2\2\u04d1\u04d2\5\u0128\u0095\2\u04d2\u00d7\3\2\2\2\u04d3\u04d4\7"+
		"(\2\2\u04d4\u04d5\5\u0128\u0095\2\u04d5\u00d9\3\2\2\2\u04d6\u04d8\5\u00dc"+
		"o\2\u04d7\u04d6\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc\u04de\5\u00de"+
		"p\2\u04dd\u04df\5\u00ceh\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\5\u00e2r\2\u04e1\u00db\3\2\2\2\u04e2\u04e7"+
		"\5\u0112\u008a\2\u04e3\u04e7\7%\2\2\u04e4\u04e7\7$\2\2\u04e5\u04e7\7#"+
		"\2\2\u04e6\u04e2\3\2\2\2\u04e6\u04e3\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6"+
		"\u04e5\3\2\2\2\u04e7\u00dd\3\2\2\2\u04e8\u04ea\5p9\2\u04e9\u04e8\3\2\2"+
		"\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\5\u00e0q\2\u04ec"+
		"\u04ee\7;\2\2\u04ed\u04ef\5\u00be`\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3"+
		"\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7<\2\2\u04f1\u00df\3\2\2\2\u04f2"+
		"\u04f3\7h\2\2\u04f3\u00e1\3\2\2\2\u04f4\u04f6\7=\2\2\u04f5\u04f7\5\u00e4"+
		"s\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8"+
		"\u04fa\5\u012a\u0096\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb"+
		"\3\2\2\2\u04fb\u04fc\7>\2\2\u04fc\u00e3\3\2\2\2\u04fd\u04ff\5@!\2\u04fe"+
		"\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\7-"+
		"\2\2\u0501\u0503\7;\2\2\u0502\u0504\5\u01ba\u00de\2\u0503\u0502\3\2\2"+
		"\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\7<\2\2\u0506\u052c"+
		"\7A\2\2\u0507\u0509\5@!\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\3\2\2\2\u050a\u050b\7*\2\2\u050b\u050d\7;\2\2\u050c\u050e\5\u01ba"+
		"\u00de\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\3\2\2\2\u050f"+
		"\u0510\7<\2\2\u0510\u052c\7A\2\2\u0511\u0512\5P)\2\u0512\u0514\7C\2\2"+
		"\u0513\u0515\5@!\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516"+
		"\3\2\2\2\u0516\u0517\7*\2\2\u0517\u0519\7;\2\2\u0518\u051a\5\u01ba\u00de"+
		"\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c"+
		"\7<\2\2\u051c\u051d\7A\2\2\u051d\u052c\3\2\2\2\u051e\u051f\5\u018c\u00c7"+
		"\2\u051f\u0521\7C\2\2\u0520\u0522\5@!\2\u0521\u0520\3\2\2\2\u0521\u0522"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7*\2\2\u0524\u0526\7;\2\2\u0525"+
		"\u0527\5\u01ba\u00de\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u0529\7<\2\2\u0529\u052a\7A\2\2\u052a\u052c\3\2\2\2\u052b"+
		"\u04fe\3\2\2\2\u052b\u0508\3\2\2\2\u052b\u0511\3\2\2\2\u052b\u051e\3\2"+
		"\2\2\u052c\u00e5\3\2\2\2\u052d\u052f\5n8\2\u052e\u052d\3\2\2\2\u052f\u0532"+
		"\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532"+
		"\u0530\3\2\2\2\u0533\u0534\7\22\2\2\u0534\u0536\7h\2\2\u0535\u0537\5v"+
		"<\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\5\u00e8u\2\u0539\u00e7\3\2\2\2\u053a\u053c\7=\2\2\u053b\u053d\5"+
		"\u00eav\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2"+
		"\u053e\u0540\7B\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542"+
		"\3\2\2\2\u0541\u0543\5\u00f0y\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u0545\7>\2\2\u0545\u00e9\3\2\2\2\u0546\u054b"+
		"\5\u00ecw\2\u0547\u0548\7B\2\2\u0548\u054a\5\u00ecw\2\u0549\u0547\3\2"+
		"\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"\u00eb\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u0550\5\u00eex\2\u054f\u054e"+
		"\3\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u055a\7h\2\2\u0555\u0557\7;\2"+
		"\2\u0556\u0558\5\u01ba\u00de\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2"+
		"\u0558\u0559\3\2\2\2\u0559\u055b\7<\2\2\u055a\u0555\3\2\2\2\u055a\u055b"+
		"\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u055e\5z>\2\u055d\u055c\3\2\2\2\u055d"+
		"\u055e\3\2\2\2\u055e\u00ed\3\2\2\2\u055f\u0560\5\u0112\u008a\2\u0560\u00ef"+
		"\3\2\2\2\u0561\u0565\7A\2\2\u0562\u0564\5|?\2\u0563\u0562\3\2\2\2\u0564"+
		"\u0567\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u00f1\3\2"+
		"\2\2\u0567\u0565\3\2\2\2\u0568\u056b\5\u00f4{\2\u0569\u056b\5\u0106\u0084"+
		"\2\u056a\u0568\3\2\2\2\u056a\u0569\3\2\2\2\u056b\u00f3\3\2\2\2\u056c\u056e"+
		"\5\u00f6|\2\u056d\u056c\3\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2"+
		"\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0573"+
		"\7\36\2\2\u0573\u0575\7h\2\2\u0574\u0576\5p9\2\u0575\u0574\3\2\2\2\u0575"+
		"\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0579\5\u00f8}\2\u0578\u0577"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\5\u00fa~"+
		"\2\u057b\u00f5\3\2\2\2\u057c\u0584\5\u0112\u008a\2\u057d\u0584\7%\2\2"+
		"\u057e\u0584\7$\2\2\u057f\u0584\7#\2\2\u0580\u0584\7\3\2\2\u0581\u0584"+
		"\7(\2\2\u0582\u0584\7)\2\2\u0583\u057c\3\2\2\2\u0583\u057d\3\2\2\2\u0583"+
		"\u057e\3\2\2\2\u0583\u057f\3\2\2\2\u0583\u0580\3\2\2\2\u0583\u0581\3\2"+
		"\2\2\u0583\u0582\3\2\2\2\u0584\u00f7\3\2\2\2\u0585\u0586\7\23\2\2\u0586"+
		"\u0587\5x=\2\u0587\u00f9\3\2\2\2\u0588\u058c\7=\2\2\u0589\u058b\5\u00fc"+
		"\177\2\u058a\u0589\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0590\7>"+
		"\2\2\u0590\u00fb\3\2\2\2\u0591\u0597\5\u00fe\u0080\2\u0592\u0597\5\u0102"+
		"\u0082\2\u0593\u0597\5f\64\2\u0594\u0597\5\u00f2z\2\u0595\u0597\7A\2\2"+
		"\u0596\u0591\3\2\2\2\u0596\u0592\3\2\2\2\u0596\u0593\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00fd\3\2\2\2\u0598\u059a\5\u0100\u0081"+
		"\2\u0599\u0598\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c"+
		"\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u059f\5\u009aN"+
		"\2\u059f\u05a0\5\u0092J\2\u05a0\u05a1\7A\2\2\u05a1\u00ff\3\2\2\2\u05a2"+
		"\u05a7\5\u0112\u008a\2\u05a3\u05a7\7%\2\2\u05a4\u05a7\7(\2\2\u05a5\u05a7"+
		"\7\24\2\2\u05a6\u05a2\3\2\2\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2"+
		"\u05a6\u05a5\3\2\2\2\u05a7\u0101\3\2\2\2\u05a8\u05aa\5\u0104\u0083\2\u05a9"+
		"\u05a8\3\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2"+
		"\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05af\5\u00b6\\\2\u05af"+
		"\u05b0\5\u00d4k\2\u05b0\u0103\3\2\2\2\u05b1\u05b8\5\u0112\u008a\2\u05b2"+
		"\u05b8\7%\2\2\u05b3\u05b8\7\3\2\2\u05b4\u05b8\7\16\2\2\u05b5\u05b8\7("+
		"\2\2\u05b6\u05b8\7)\2\2\u05b7\u05b1\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b7"+
		"\u05b3\3\2\2\2\u05b7\u05b4\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b6\3\2"+
		"\2\2\u05b8\u0105\3\2\2\2\u05b9\u05bb\5\u00f6|\2\u05ba\u05b9\3\2\2\2\u05bb"+
		"\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2"+
		"\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c0\7i\2\2\u05c0\u05c1\7\36\2\2\u05c1"+
		"\u05c2\7h\2\2\u05c2\u05c3\5\u0108\u0085\2\u05c3\u0107\3\2\2\2\u05c4\u05c8"+
		"\7=\2\2\u05c5\u05c7\5\u010a\u0086\2\u05c6\u05c5\3\2\2\2\u05c7\u05ca\3"+
		"\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca"+
		"\u05c8\3\2\2\2\u05cb\u05cc\7>\2\2\u05cc\u0109\3\2\2\2\u05cd\u05d3\5\u010c"+
		"\u0087\2\u05ce\u05d3\5\u00fe\u0080\2\u05cf\u05d3\5f\64\2\u05d0\u05d3\5"+
		"\u00f2z\2\u05d1\u05d3\7A\2\2\u05d2\u05cd\3\2\2\2\u05d2\u05ce\3\2\2\2\u05d2"+
		"\u05cf\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3\u010b\3\2"+
		"\2\2\u05d4\u05d6\5\u010e\u0088\2\u05d5\u05d4\3\2\2\2\u05d6\u05d9\3\2\2"+
		"\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\3\2\2\2\u05d9\u05d7"+
		"\3\2\2\2\u05da\u05db\5\u009aN\2\u05db\u05dc\7h\2\2\u05dc\u05dd\7;\2\2"+
		"\u05dd\u05df\7<\2\2\u05de\u05e0\5\66\34\2\u05df\u05de\3\2\2\2\u05df\u05e0"+
		"\3\2\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05e3\5\u0110\u0089\2\u05e2\u05e1\3"+
		"\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7A\2\2\u05e5"+
		"\u010d\3\2\2\2\u05e6\u05ea\5\u0112\u008a\2\u05e7\u05ea\7%\2\2\u05e8\u05ea"+
		"\7\3\2\2\u05e9\u05e6\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05e8\3\2\2\2\u05ea"+
		"\u010f\3\2\2\2\u05eb\u05ec\7\16\2\2\u05ec\u05ed\5\u011a\u008e\2\u05ed"+
		"\u0111\3\2\2\2\u05ee\u05f2\5\u0114\u008b\2\u05ef\u05f2\5\u0120\u0091\2"+
		"\u05f0\u05f2\5\u0122\u0092\2\u05f1\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1"+
		"\u05f0\3\2\2\2\u05f2\u0113\3\2\2\2\u05f3\u05f4\7i\2\2\u05f4\u05f5\5L\'"+
		"\2\u05f5\u05f7\7;\2\2\u05f6\u05f8\5\u0116\u008c\2\u05f7\u05f6\3\2\2\2"+
		"\u05f7\u05f8\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\7<\2\2\u05fa\u0115"+
		"\3\2\2\2\u05fb\u0600\5\u0118\u008d\2\u05fc\u05fd\7B\2\2\u05fd\u05ff\5"+
		"\u0118\u008d\2\u05fe\u05fc\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2"+
		"\2\2\u0600\u0601\3\2\2\2\u0601\u0117\3\2\2\2\u0602\u0600\3\2\2\2\u0603"+
		"\u0604\7h\2\2\u0604\u0605\7D\2\2\u0605\u0606\5\u011a\u008e\2\u0606\u0119"+
		"\3\2\2\2\u0607\u060b\5\u01dc\u00ef\2\u0608\u060b\5\u011c\u008f\2\u0609"+
		"\u060b\5\u0112\u008a\2\u060a\u0607\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u0609"+
		"\3\2\2\2\u060b\u011b\3\2\2\2\u060c\u060e\7=\2\2\u060d\u060f\5\u011e\u0090"+
		"\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2\u0610\u0612"+
		"\7B\2\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613"+
		"\u0614\7>\2\2\u0614\u011d\3\2\2\2\u0615\u061a\5\u011a\u008e\2\u0616\u0617"+
		"\7B\2\2\u0617\u0619\5\u011a\u008e\2\u0618\u0616\3\2\2\2\u0619\u061c\3"+
		"\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u011f\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061d\u061e\7i\2\2\u061e\u061f\5L\'\2\u061f\u0121\3\2\2"+
		"\2\u0620\u0621\7i\2\2\u0621\u0622\5L\'\2\u0622\u0623\7;\2\2\u0623\u0624"+
		"\5\u011a\u008e\2\u0624\u0625\7<\2\2\u0625\u0123\3\2\2\2\u0626\u0628\7"+
		"=\2\2\u0627\u0629\5\u0126\u0094\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u062b\3\2\2\2\u062a\u062c\7B\2\2\u062b\u062a\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\7>\2\2\u062e\u0125\3\2"+
		"\2\2\u062f\u0634\5\u0098M\2\u0630\u0631\7B\2\2\u0631\u0633\5\u0098M\2"+
		"\u0632\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634\u0635"+
		"\3\2\2\2\u0635\u0127\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u0639\7=\2\2\u0638"+
		"\u063a\5\u012a\u0096\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b"+
		"\3\2\2\2\u063b\u063c\7>\2\2\u063c\u0129\3\2\2\2\u063d\u0641\5\u012c\u0097"+
		"\2\u063e\u0640\5\u012c\u0097\2\u063f\u063e\3\2\2\2\u0640\u0643\3\2\2\2"+
		"\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u012b\3\2\2\2\u0643\u0641"+
		"\3\2\2\2\u0644\u0648\5\u012e\u0098\2\u0645\u0648\5f\64\2\u0646\u0648\5"+
		"\u0132\u009a\2\u0647\u0644\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0646\3\2"+
		"\2\2\u0648\u012d\3\2\2\2\u0649\u064a\5\u0130\u0099\2\u064a\u064b\7A\2"+
		"\2\u064b\u012f\3\2\2\2\u064c\u064e\5\u00c8e\2\u064d\u064c\3\2\2\2\u064e"+
		"\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\3\2"+
		"\2\2\u0651\u064f\3\2\2\2\u0652\u0653\5\u009aN\2\u0653\u0654\5\u0092J\2"+
		"\u0654\u0131\3\2\2\2\u0655\u065c\5\u0136\u009c\2\u0656\u065c\5\u013a\u009e"+
		"\2\u0657\u065c\5\u0142\u00a2\2\u0658\u065c\5\u0144\u00a3\2\u0659\u065c"+
		"\5\u0156\u00ac\2\u065a\u065c\5\u015c\u00af\2\u065b\u0655\3\2\2\2\u065b"+
		"\u0656\3\2\2\2\u065b\u0657\3\2\2\2\u065b\u0658\3\2\2\2\u065b\u0659\3\2"+
		"\2\2\u065b\u065a\3\2\2\2\u065c\u0133\3\2\2\2\u065d\u0663\5\u0136\u009c"+
		"\2\u065e\u0663\5\u013c\u009f\2\u065f\u0663\5\u0146\u00a4\2\u0660\u0663"+
		"\5\u0158\u00ad\2\u0661\u0663\5\u015e\u00b0\2\u0662\u065d\3\2\2\2\u0662"+
		"\u065e\3\2\2\2\u0662\u065f\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0661\3\2"+
		"\2\2\u0663\u0135\3\2\2\2\u0664\u0671\5\u0128\u0095\2\u0665\u0671\5\u0138"+
		"\u009d\2\u0666\u0671\5\u013e\u00a0\2\u0667\u0671\5\u0148\u00a5\2\u0668"+
		"\u0671\5\u014a\u00a6\2\u0669\u0671\5\u015a\u00ae\2\u066a\u0671\5\u016e"+
		"\u00b8\2\u066b\u0671\5\u0170\u00b9\2\u066c\u0671\5\u0172\u00ba\2\u066d"+
		"\u0671\5\u0176\u00bc\2\u066e\u0671\5\u0174\u00bb\2\u066f\u0671\5\u0178"+
		"\u00bd\2\u0670\u0664\3\2\2\2\u0670\u0665\3\2\2\2\u0670\u0666\3\2\2\2\u0670"+
		"\u0667\3\2\2\2\u0670\u0668\3\2\2\2\u0670\u0669\3\2\2\2\u0670\u066a\3\2"+
		"\2\2\u0670\u066b\3\2\2\2\u0670\u066c\3\2\2\2\u0670\u066d\3\2\2\2\u0670"+
		"\u066e\3\2\2\2\u0670\u066f\3\2\2\2\u0671\u0137\3\2\2\2\u0672\u0673\7A"+
		"\2\2\u0673\u0139\3\2\2\2\u0674\u0675\7h\2\2\u0675\u0676\7J\2\2\u0676\u0677"+
		"\5\u0132\u009a\2\u0677\u013b\3\2\2\2\u0678\u0679\7h\2\2\u0679\u067a\7"+
		"J\2\2\u067a\u067b\5\u0134\u009b\2\u067b\u013d\3\2\2\2\u067c\u067d\5\u0140"+
		"\u00a1\2\u067d\u067e\7A\2\2\u067e\u013f\3\2\2\2\u067f\u0687\5\u01d6\u00ec"+
		"\2\u0680\u0687\5\u01f4\u00fb\2\u0681\u0687\5\u01f6\u00fc\2\u0682\u0687"+
		"\5\u01fc\u00ff\2\u0683\u0687\5\u0200\u0101\2\u0684\u0687\5\u01b4\u00db"+
		"\2\u0685\u0687\5\u01a0\u00d1\2\u0686\u067f\3\2\2\2\u0686\u0680\3\2\2\2"+
		"\u0686\u0681\3\2\2\2\u0686\u0682\3\2\2\2\u0686\u0683\3\2\2\2\u0686\u0684"+
		"\3\2\2\2\u0686\u0685\3\2\2\2\u0687\u0141\3\2\2\2\u0688\u0689\7\30\2\2"+
		"\u0689\u068a\7;\2\2\u068a\u068b\5\u01ca\u00e6\2\u068b\u068c\7<\2\2\u068c"+
		"\u068d\5\u0132\u009a\2\u068d\u0143\3\2\2\2\u068e\u068f\7\30\2\2\u068f"+
		"\u0690\7;\2\2\u0690\u0691\5\u01ca\u00e6\2\u0691\u0692\7<\2\2\u0692\u0693"+
		"\5\u0134\u009b\2\u0693\u0694\7\21\2\2\u0694\u0695\5\u0132\u009a\2\u0695"+
		"\u0145\3\2\2\2\u0696\u0697\7\30\2\2\u0697\u0698\7;\2\2\u0698\u0699\5\u01ca"+
		"\u00e6\2\u0699\u069a\7<\2\2\u069a\u069b\5\u0134\u009b\2\u069b\u069c\7"+
		"\21\2\2\u069c\u069d\5\u0134\u009b\2\u069d\u0147\3\2\2\2\u069e\u069f\7"+
		"\4\2\2\u069f\u06a0\5\u01ca\u00e6\2\u06a0\u06a1\7A\2\2\u06a1\u06a9\3\2"+
		"\2\2\u06a2\u06a3\7\4\2\2\u06a3\u06a4\5\u01ca\u00e6\2\u06a4\u06a5\7J\2"+
		"\2\u06a5\u06a6\5\u01ca\u00e6\2\u06a6\u06a7\7A\2\2\u06a7\u06a9\3\2\2\2"+
		"\u06a8\u069e\3\2\2\2\u06a8\u06a2\3\2\2\2\u06a9\u0149\3\2\2\2\u06aa\u06ab"+
		"\7+\2\2\u06ab\u06ac\7;\2\2\u06ac\u06ad\5\u01ca\u00e6\2\u06ad\u06ae\7<"+
		"\2\2\u06ae\u06af\5\u014c\u00a7\2\u06af\u014b\3\2\2\2\u06b0\u06b4\7=\2"+
		"\2\u06b1\u06b3\5\u014e\u00a8\2\u06b2\u06b1\3\2\2\2\u06b3\u06b6\3\2\2\2"+
		"\u06b4\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06ba\3\2\2\2\u06b6\u06b4"+
		"\3\2\2\2\u06b7\u06b9\5\u0152\u00aa\2\u06b8\u06b7\3\2\2\2\u06b9\u06bc\3"+
		"\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\3\2\2\2\u06bc"+
		"\u06ba\3\2\2\2\u06bd\u06be\7>\2\2\u06be\u014d\3\2\2\2\u06bf\u06c0\5\u0150"+
		"\u00a9\2\u06c0\u06c1\5\u012a\u0096\2\u06c1\u014f\3\2\2\2\u06c2\u06c6\5"+
		"\u0152\u00aa\2\u06c3\u06c5\5\u0152\u00aa\2\u06c4\u06c3\3\2\2\2\u06c5\u06c8"+
		"\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u0151\3\2\2\2\u06c8"+
		"\u06c6\3\2\2\2\u06c9\u06ca\7\b\2\2\u06ca\u06cb\5\u01c8\u00e5\2\u06cb\u06cc"+
		"\7J\2\2\u06cc\u06d4\3\2\2\2\u06cd\u06ce\7\b\2\2\u06ce\u06cf\5\u0154\u00ab"+
		"\2\u06cf\u06d0\7J\2\2\u06d0\u06d4\3\2\2\2\u06d1\u06d2\7\16\2\2\u06d2\u06d4"+
		"\7J\2\2\u06d3\u06c9\3\2\2\2\u06d3\u06cd\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4"+
		"\u0153\3\2\2\2\u06d5\u06d6\7h\2\2\u06d6\u0155\3\2\2\2\u06d7\u06d8\7\64"+
		"\2\2\u06d8\u06d9\7;\2\2\u06d9\u06da\5\u01ca\u00e6\2\u06da\u06db\7<\2\2"+
		"\u06db\u06dc\5\u0132\u009a\2\u06dc\u0157\3\2\2\2\u06dd\u06de\7\64\2\2"+
		"\u06de\u06df\7;\2\2\u06df\u06e0\5\u01ca\u00e6\2\u06e0\u06e1\7<\2\2\u06e1"+
		"\u06e2\5\u0134\u009b\2\u06e2\u0159\3\2\2\2\u06e3\u06e4\7\17\2\2\u06e4"+
		"\u06e5\5\u0132\u009a\2\u06e5\u06e6\7\64\2\2\u06e6\u06e7\7;\2\2\u06e7\u06e8"+
		"\5\u01ca\u00e6\2\u06e8\u06e9\7<\2\2\u06e9\u06ea\7A\2\2\u06ea\u015b\3\2"+
		"\2\2\u06eb\u06ee\5\u0160\u00b1\2\u06ec\u06ee\5\u016a\u00b6\2\u06ed\u06eb"+
		"\3\2\2\2\u06ed\u06ec\3\2\2\2\u06ee\u015d\3\2\2\2\u06ef\u06f2\5\u0162\u00b2"+
		"\2\u06f0\u06f2\5\u016c\u00b7\2\u06f1\u06ef\3\2\2\2\u06f1\u06f0\3\2\2\2"+
		"\u06f2\u015f\3\2\2\2\u06f3\u06f4\7\27\2\2\u06f4\u06f6\7;\2\2\u06f5\u06f7"+
		"\5\u0164\u00b3\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3"+
		"\2\2\2\u06f8\u06fa\7A\2\2\u06f9\u06fb\5\u01ca\u00e6\2\u06fa\u06f9\3\2"+
		"\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\7A\2\2\u06fd"+
		"\u06ff\5\u0166\u00b4\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0700"+
		"\3\2\2\2\u0700\u0701\7<\2\2\u0701\u0702\5\u0132\u009a\2\u0702\u0161\3"+
		"\2\2\2\u0703\u0704\7\27\2\2\u0704\u0706\7;\2\2\u0705\u0707\5\u0164\u00b3"+
		"\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a"+
		"\7A\2\2\u0709\u070b\5\u01ca\u00e6\2\u070a\u0709\3\2\2\2\u070a\u070b\3"+
		"\2\2\2\u070b\u070c\3\2\2\2\u070c\u070e\7A\2\2\u070d\u070f\5\u0166\u00b4"+
		"\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711"+
		"\7<\2\2\u0711\u0712\5\u0134\u009b\2\u0712\u0163\3\2\2\2\u0713\u0716\5"+
		"\u0168\u00b5\2\u0714\u0716\5\u0130\u0099\2\u0715\u0713\3\2\2\2\u0715\u0714"+
		"\3\2\2\2\u0716\u0165\3\2\2\2\u0717\u0718\5\u0168\u00b5\2\u0718\u0167\3"+
		"\2\2\2\u0719\u071e\5\u0140\u00a1\2\u071a\u071b\7B\2\2\u071b\u071d\5\u0140"+
		"\u00a1\2\u071c\u071a\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e"+
		"\u071f\3\2\2\2\u071f\u0169\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0722\7\27"+
		"\2\2\u0722\u0726\7;\2\2\u0723\u0725\5\u00c8e\2\u0724\u0723\3\2\2\2\u0725"+
		"\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0729\3\2"+
		"\2\2\u0728\u0726\3\2\2\2\u0729\u072a\5\u009aN\2\u072a\u072b\5\u0096L\2"+
		"\u072b\u072c\7J\2\2\u072c\u072d\5\u01ca\u00e6\2\u072d\u072e\7<\2\2\u072e"+
		"\u072f\5\u0132\u009a\2\u072f\u016b\3\2\2\2\u0730\u0731\7\27\2\2\u0731"+
		"\u0735\7;\2\2\u0732\u0734\5\u00c8e\2\u0733\u0732\3\2\2\2\u0734\u0737\3"+
		"\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737"+
		"\u0735\3\2\2\2\u0738\u0739\5\u009aN\2\u0739\u073a\5\u0096L\2\u073a\u073b"+
		"\7J\2\2\u073b\u073c\5\u01ca\u00e6\2\u073c\u073d\7<\2\2\u073d\u073e\5\u0134"+
		"\u009b\2\u073e\u016d\3\2\2\2\u073f\u0741\7\6\2\2\u0740\u0742\7h\2\2\u0741"+
		"\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\7A"+
		"\2\2\u0744\u016f\3\2\2\2\u0745\u0747\7\r\2\2\u0746\u0748\7h\2\2\u0747"+
		"\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\7A"+
		"\2\2\u074a\u0171\3\2\2\2\u074b\u074d\7&\2\2\u074c\u074e\5\u01ca\u00e6"+
		"\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750"+
		"\7A\2\2\u0750\u0173\3\2\2\2\u0751\u0752\7.\2\2\u0752\u0753\5\u01ca\u00e6"+
		"\2\u0753\u0754\7A\2\2\u0754\u0175\3\2\2\2\u0755\u0756\7,\2\2\u0756\u0757"+
		"\7;\2\2\u0757\u0758\5\u01ca\u00e6\2\u0758\u0759\7<\2\2\u0759\u075a\5\u0128"+
		"\u0095\2\u075a\u0177\3\2\2\2\u075b\u075c\7\61\2\2\u075c\u075d\5\u0128"+
		"\u0095\2\u075d\u075e\5\u017a\u00be\2\u075e\u0768\3\2\2\2\u075f\u0760\7"+
		"\61\2\2\u0760\u0762\5\u0128\u0095\2\u0761\u0763\5\u017a\u00be\2\u0762"+
		"\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\5\u0182"+
		"\u00c2\2\u0765\u0768\3\2\2\2\u0766\u0768\5\u0184\u00c3\2\u0767\u075b\3"+
		"\2\2\2\u0767\u075f\3\2\2\2\u0767\u0766\3\2\2\2\u0768\u0179\3\2\2\2\u0769"+
		"\u076d\5\u017c\u00bf\2\u076a\u076c\5\u017c\u00bf\2\u076b\u076a\3\2\2\2"+
		"\u076c\u076f\3\2\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u017b"+
		"\3\2\2\2\u076f\u076d\3\2\2\2\u0770\u0771\7\t\2\2\u0771\u0772\7;\2\2\u0772"+
		"\u0773\5\u017e\u00c0\2\u0773\u0774\7<\2\2\u0774\u0775\5\u0128\u0095\2"+
		"\u0775\u017d\3\2\2\2\u0776\u0778\5\u00c8e\2\u0777\u0776\3\2\2\2\u0778"+
		"\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2"+
		"\2\2\u077b\u0779\3\2\2\2\u077c\u077d\5\u0180\u00c1\2\u077d\u077e\5\u0096"+
		"L\2\u077e\u017f\3\2\2\2\u077f\u0784\5\u00a2R\2\u0780\u0781\7X\2\2\u0781"+
		"\u0783\5&\24\2\u0782\u0780\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2"+
		"\2\2\u0784\u0785\3\2\2\2\u0785\u0181\3\2\2\2\u0786\u0784\3\2\2\2\u0787"+
		"\u0788\7\25\2\2\u0788\u0789\5\u0128\u0095\2\u0789\u0183\3\2\2\2\u078a"+
		"\u078b\7\61\2\2\u078b\u078c\5\u0186\u00c4\2\u078c\u078e\5\u0128\u0095"+
		"\2\u078d\u078f\5\u017a\u00be\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2"+
		"\u078f\u0791\3\2\2\2\u0790\u0792\5\u0182\u00c2\2\u0791\u0790\3\2\2\2\u0791"+
		"\u0792\3\2\2\2\u0792\u0185\3\2\2\2\u0793\u0794\7;\2\2\u0794\u0796\5\u0188"+
		"\u00c5\2\u0795\u0797\7A\2\2\u0796\u0795\3\2\2\2\u0796\u0797\3\2\2\2\u0797"+
		"\u0798\3\2\2\2\u0798\u0799\7<\2\2\u0799\u0187\3\2\2\2\u079a\u079f\5\u018a"+
		"\u00c6\2\u079b\u079c\7A\2\2\u079c\u079e\5\u018a\u00c6\2\u079d\u079b\3"+
		"\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u0189\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2\u07a4\5\u00c8e\2\u07a3\u07a2"+
		"\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6"+
		"\u07a8\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u07a9\5\u009aN\2\u07a9\u07aa"+
		"\5\u0096L\2\u07aa\u07ab\7D\2\2\u07ab\u07ac\5\u01ca\u00e6\2\u07ac\u018b"+
		"\3\2\2\2\u07ad\u07b0\5\u019a\u00ce\2\u07ae\u07b0\5\u01c2\u00e2\2\u07af"+
		"\u07ad\3\2\2\2\u07af\u07ae\3\2\2\2\u07b0\u07b4\3\2\2\2\u07b1\u07b3\5\u0194"+
		"\u00cb\2\u07b2\u07b1\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4"+
		"\u07b5\3\2\2\2\u07b5\u018d\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07d5\5\2"+
		"\2\2\u07b8\u07bd\5L\'\2\u07b9\u07ba\7?\2\2\u07ba\u07bc\7@\2\2\u07bb\u07b9"+
		"\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bb\3\2\2\2\u07bd\u07be\3\2\2\2\u07be"+
		"\u07c0\3\2\2\2\u07bf\u07bd\3\2\2\2\u07c0\u07c1\7C\2\2\u07c1\u07c2\7\13"+
		"\2\2\u07c2\u07d5\3\2\2\2\u07c3\u07c4\7\62\2\2\u07c4\u07c5\7C\2\2\u07c5"+
		"\u07d5\7\13\2\2\u07c6\u07d5\7-\2\2\u07c7\u07c8\5L\'\2\u07c8\u07c9\7C\2"+
		"\2\u07c9\u07ca\7-\2\2\u07ca\u07d5\3\2\2\2\u07cb\u07cc\7;\2\2\u07cc\u07cd"+
		"\5\u01ca\u00e6\2\u07cd\u07ce\7<\2\2\u07ce\u07d5\3\2\2\2\u07cf\u07d5\5"+
		"\u01a0\u00d1\2\u07d0\u07d5\5\u01a8\u00d5\2\u07d1\u07d5\5\u01ae\u00d8\2"+
		"\u07d2\u07d5\5\u01b4\u00db\2\u07d3\u07d5\5\u01bc\u00df\2\u07d4\u07b7\3"+
		"\2\2\2\u07d4\u07b8\3\2\2\2\u07d4\u07c3\3\2\2\2\u07d4\u07c6\3\2\2\2\u07d4"+
		"\u07c7\3\2\2\2\u07d4\u07cb\3\2\2\2\u07d4\u07cf\3\2\2\2\u07d4\u07d0\3\2"+
		"\2\2\u07d4\u07d1\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d4\u07d3\3\2\2\2\u07d5"+
		"\u018f\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u0191\3\2\2\2\u07d8\u07f5\5\2"+
		"\2\2\u07d9\u07de\5L\'\2\u07da\u07db\7?\2\2\u07db\u07dd\7@\2\2\u07dc\u07da"+
		"\3\2\2\2\u07dd\u07e0\3\2\2\2\u07de\u07dc\3\2\2\2\u07de\u07df\3\2\2\2\u07df"+
		"\u07e1\3\2\2\2\u07e0\u07de\3\2\2\2\u07e1\u07e2\7C\2\2\u07e2\u07e3\7\13"+
		"\2\2\u07e3\u07f5\3\2\2\2\u07e4\u07e5\7\62\2\2\u07e5\u07e6\7C\2\2\u07e6"+
		"\u07f5\7\13\2\2\u07e7\u07f5\7-\2\2\u07e8\u07e9\5L\'\2\u07e9\u07ea\7C\2"+
		"\2\u07ea\u07eb\7-\2\2\u07eb\u07f5\3\2\2\2\u07ec\u07ed\7;\2\2\u07ed\u07ee"+
		"\5\u01ca\u00e6\2\u07ee\u07ef\7<\2\2\u07ef\u07f5\3\2\2\2\u07f0\u07f5\5"+
		"\u01a0\u00d1\2\u07f1\u07f5\5\u01a8\u00d5\2\u07f2\u07f5\5\u01b4\u00db\2"+
		"\u07f3\u07f5\5\u01bc\u00df\2\u07f4\u07d8\3\2\2\2\u07f4\u07d9\3\2\2\2\u07f4"+
		"\u07e4\3\2\2\2\u07f4\u07e7\3\2\2\2\u07f4\u07e8\3\2\2\2\u07f4\u07ec\3\2"+
		"\2\2\u07f4\u07f0\3\2\2\2\u07f4\u07f1\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4"+
		"\u07f3\3\2\2\2\u07f5\u0193\3\2\2\2\u07f6\u07fc\5\u01a2\u00d2\2\u07f7\u07fc"+
		"\5\u01aa\u00d6\2\u07f8\u07fc\5\u01b0\u00d9\2\u07f9\u07fc\5\u01b6\u00dc"+
		"\2\u07fa\u07fc\5\u01be\u00e0\2\u07fb\u07f6\3\2\2\2\u07fb\u07f7\3\2\2\2"+
		"\u07fb\u07f8\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fa\3\2\2\2\u07fc\u0195"+
		"\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0197\3\2\2\2\u07ff\u0804\5\u01a2\u00d2"+
		"\2\u0800\u0804\5\u01aa\u00d6\2\u0801\u0804\5\u01b6\u00dc\2\u0802\u0804"+
		"\5\u01be\u00e0\2\u0803\u07ff\3\2\2\2\u0803\u0800\3\2\2\2\u0803\u0801\3"+
		"\2\2\2\u0803\u0802\3\2\2\2\u0804\u0199\3\2\2\2\u0805\u082e\5\2\2\2\u0806"+
		"\u080b\5L\'\2\u0807\u0808\7?\2\2\u0808\u080a\7@\2\2\u0809\u0807\3\2\2"+
		"\2\u080a\u080d\3\2\2\2\u080b\u0809\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e"+
		"\3\2\2\2\u080d\u080b\3\2\2\2\u080e\u080f\7C\2\2\u080f\u0810\7\13\2\2\u0810"+
		"\u082e\3\2\2\2\u0811\u0816\5\u009cO\2\u0812\u0813\7?\2\2\u0813\u0815\7"+
		"@\2\2\u0814\u0812\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816"+
		"\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081a\7C"+
		"\2\2\u081a\u081b\7\13\2\2\u081b\u082e\3\2\2\2\u081c\u081d\7\62\2\2\u081d"+
		"\u081e\7C\2\2\u081e\u082e\7\13\2\2\u081f\u082e\7-\2\2\u0820\u0821\5L\'"+
		"\2\u0821\u0822\7C\2\2\u0822\u0823\7-\2\2\u0823\u082e\3\2\2\2\u0824\u0825"+
		"\7;\2\2\u0825\u0826\5\u01ca\u00e6\2\u0826\u0827\7<\2\2\u0827\u082e\3\2"+
		"\2\2\u0828\u082e\5\u01a4\u00d3\2\u0829\u082e\5\u01ac\u00d7\2\u082a\u082e"+
		"\5\u01b2\u00da\2\u082b\u082e\5\u01b8\u00dd\2\u082c\u082e\5\u01c0\u00e1"+
		"\2\u082d\u0805\3\2\2\2\u082d\u0806\3\2\2\2\u082d\u0811\3\2\2\2\u082d\u081c"+
		"\3\2\2\2\u082d\u081f\3\2\2\2\u082d\u0820\3\2\2\2\u082d\u0824\3\2\2\2\u082d"+
		"\u0828\3\2\2\2\u082d\u0829\3\2\2\2\u082d\u082a\3\2\2\2\u082d\u082b\3\2"+
		"\2\2\u082d\u082c\3\2\2\2\u082e\u019b\3\2\2\2\u082f\u0830\3\2\2\2\u0830"+
		"\u019d\3\2\2\2\u0831\u0859\5\2\2\2\u0832\u0837\5L\'\2\u0833\u0834\7?\2"+
		"\2\u0834\u0836\7@\2\2\u0835\u0833\3\2\2\2\u0836\u0839\3\2\2\2\u0837\u0835"+
		"\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a\3\2\2\2\u0839\u0837\3\2\2\2\u083a"+
		"\u083b\7C\2\2\u083b\u083c\7\13\2\2\u083c\u0859\3\2\2\2\u083d\u0842\5\u009c"+
		"O\2\u083e\u083f\7?\2\2\u083f\u0841\7@\2\2\u0840\u083e\3\2\2\2\u0841\u0844"+
		"\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845\3\2\2\2\u0844"+
		"\u0842\3\2\2\2\u0845\u0846\7C\2\2\u0846\u0847\7\13\2\2\u0847\u0859\3\2"+
		"\2\2\u0848\u0849\7\62\2\2\u0849\u084a\7C\2\2\u084a\u0859\7\13\2\2\u084b"+
		"\u0859\7-\2\2\u084c\u084d\5L\'\2\u084d\u084e\7C\2\2\u084e\u084f\7-\2\2"+
		"\u084f\u0859\3\2\2\2\u0850\u0851\7;\2\2\u0851\u0852\5\u01ca\u00e6\2\u0852"+
		"\u0853\7<\2\2\u0853\u0859\3\2\2\2\u0854\u0859\5\u01a4\u00d3\2\u0855\u0859"+
		"\5\u01ac\u00d7\2\u0856\u0859\5\u01b8\u00dd\2\u0857\u0859\5\u01c0\u00e1"+
		"\2\u0858\u0831\3\2\2\2\u0858\u0832\3\2\2\2\u0858\u083d\3\2\2\2\u0858\u0848"+
		"\3\2\2\2\u0858\u084b\3\2\2\2\u0858\u084c\3\2\2\2\u0858\u0850\3\2\2\2\u0858"+
		"\u0854\3\2\2\2\u0858\u0855\3\2\2\2\u0858\u0856\3\2\2\2\u0858\u0857\3\2"+
		"\2\2\u0859\u019f\3\2\2\2\u085a\u085c\7!\2\2\u085b\u085d\5@!\2\u085c\u085b"+
		"\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u0861\3\2\2\2\u085e\u0860\5\u0112\u008a"+
		"\2\u085f\u085e\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u085f\3\2\2\2\u0861\u0862"+
		"\3\2\2\2\u0862\u0864\3\2\2\2\u0863\u0861\3\2\2\2\u0864\u086f\7h\2\2\u0865"+
		"\u0869\7C\2\2\u0866\u0868\5\u0112\u008a\2\u0867\u0866\3\2\2\2\u0868\u086b"+
		"\3\2\2\2\u0869\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u086c\3\2\2\2\u086b"+
		"\u0869\3\2\2\2\u086c\u086e\7h\2\2\u086d\u0865\3\2\2\2\u086e\u0871\3\2"+
		"\2\2\u086f\u086d\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0873\3\2\2\2\u0871"+
		"\u086f\3\2\2\2\u0872\u0874\5\u01a6\u00d4\2\u0873\u0872\3\2\2\2\u0873\u0874"+
		"\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\7;\2\2\u0876\u0878\5\u01ba\u00de"+
		"\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087b"+
		"\7<\2\2\u087a\u087c\5z>\2\u087b\u087a\3\2\2\2\u087b\u087c\3\2\2\2\u087c"+
		"\u08ae\3\2\2\2\u087d\u087e\5P)\2\u087e\u087f\7C\2\2\u087f\u0881\7!\2\2"+
		"\u0880\u0882\5@!\2\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0886"+
		"\3\2\2\2\u0883\u0885\5\u0112\u008a\2\u0884\u0883\3\2\2\2\u0885\u0888\3"+
		"\2\2\2\u0886\u0884\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\3\2\2\2\u0888"+
		"\u0886\3\2\2\2\u0889\u088b\7h\2\2\u088a\u088c\5\u01a6\u00d4\2\u088b\u088a"+
		"\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088f\7;\2\2\u088e"+
		"\u0890\5\u01ba\u00de\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891"+
		"\3\2\2\2\u0891\u0893\7<\2\2\u0892\u0894\5z>\2\u0893\u0892\3\2\2\2\u0893"+
		"\u0894\3\2\2\2\u0894\u08ae\3\2\2\2\u0895\u0896\5\u018c\u00c7\2\u0896\u0897"+
		"\7C\2\2\u0897\u0899\7!\2\2\u0898\u089a\5@!\2\u0899\u0898\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u089e\3\2\2\2\u089b\u089d\5\u0112\u008a\2\u089c\u089b"+
		"\3\2\2\2\u089d\u08a0\3\2\2\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f"+
		"\u08a1\3\2\2\2\u08a0\u089e\3\2\2\2\u08a1\u08a3\7h\2\2\u08a2\u08a4\5\u01a6"+
		"\u00d4\2\u08a3\u08a2\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5"+
		"\u08a7\7;\2\2\u08a6\u08a8\5\u01ba\u00de\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8"+
		"\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08ab\7<\2\2\u08aa\u08ac\5z>\2\u08ab"+
		"\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\3\2\2\2\u08ad\u085a\3\2"+
		"\2\2\u08ad\u087d\3\2\2\2\u08ad\u0895\3\2\2\2\u08ae\u01a1\3\2\2\2\u08af"+
		"\u08b0\7C\2\2\u08b0\u08b2\7!\2\2\u08b1\u08b3\5@!\2\u08b2\u08b1\3\2\2\2"+
		"\u08b2\u08b3\3\2\2\2\u08b3\u08b7\3\2\2\2\u08b4\u08b6\5\u0112\u008a\2\u08b5"+
		"\u08b4\3\2\2\2\u08b6\u08b9\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b7\u08b8\3\2"+
		"\2\2\u08b8\u08ba\3\2\2\2\u08b9\u08b7\3\2\2\2\u08ba\u08bc\7h\2\2\u08bb"+
		"\u08bd\5\u01a6\u00d4\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08be"+
		"\3\2\2\2\u08be\u08c0\7;\2\2\u08bf\u08c1\5\u01ba\u00de\2\u08c0\u08bf\3"+
		"\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\7<\2\2\u08c3"+
		"\u08c5\5z>\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u01a3\3\2\2"+
		"\2\u08c6\u08c8\7!\2\2\u08c7\u08c9\5@!\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9"+
		"\3\2\2\2\u08c9\u08cd\3\2\2\2\u08ca\u08cc\5\u0112\u008a\2\u08cb\u08ca\3"+
		"\2\2\2\u08cc\u08cf\3\2\2\2\u08cd\u08cb\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08d0\3\2\2\2\u08cf\u08cd\3\2\2\2\u08d0\u08db\7h\2\2\u08d1\u08d5\7C\2"+
		"\2\u08d2\u08d4\5\u0112\u008a\2\u08d3\u08d2\3\2\2\2\u08d4\u08d7\3\2\2\2"+
		"\u08d5\u08d3\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d8\3\2\2\2\u08d7\u08d5"+
		"\3\2\2\2\u08d8\u08da\7h\2\2\u08d9\u08d1\3\2\2\2\u08da\u08dd\3\2\2\2\u08db"+
		"\u08d9\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08df\3\2\2\2\u08dd\u08db\3\2"+
		"\2\2\u08de\u08e0\5\u01a6\u00d4\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2"+
		"\2\u08e0\u08e1\3\2\2\2\u08e1\u08e3\7;\2\2\u08e2\u08e4\5\u01ba\u00de\2"+
		"\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e7"+
		"\7<\2\2\u08e6\u08e8\5z>\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8"+
		"\u0902\3\2\2\2\u08e9\u08ea\5P)\2\u08ea\u08eb\7C\2\2\u08eb\u08ed\7!\2\2"+
		"\u08ec\u08ee\5@!\2\u08ed\u08ec\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08f2"+
		"\3\2\2\2\u08ef\u08f1\5\u0112\u008a\2\u08f0\u08ef\3\2\2\2\u08f1\u08f4\3"+
		"\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f5\3\2\2\2\u08f4"+
		"\u08f2\3\2\2\2\u08f5\u08f7\7h\2\2\u08f6\u08f8\5\u01a6\u00d4\2\u08f7\u08f6"+
		"\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\7;\2\2\u08fa"+
		"\u08fc\5\u01ba\u00de\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd"+
		"\3\2\2\2\u08fd\u08ff\7<\2\2\u08fe\u0900\5z>\2\u08ff\u08fe\3\2\2\2\u08ff"+
		"\u0900\3\2\2\2\u0900\u0902\3\2\2\2\u0901\u08c6\3\2\2\2\u0901\u08e9\3\2"+
		"\2\2\u0902\u01a5\3\2\2\2\u0903\u0907\5@!\2\u0904\u0905\7F\2\2\u0905\u0907"+
		"\7E\2\2\u0906\u0903\3\2\2\2\u0906\u0904\3\2\2\2\u0907\u01a7\3\2\2\2\u0908"+
		"\u0909\5\u018c\u00c7\2\u0909\u090a\7C\2\2\u090a\u090b\7h\2\2\u090b\u0916"+
		"\3\2\2\2\u090c\u090d\7*\2\2\u090d\u090e\7C\2\2\u090e\u0916\7h\2\2\u090f"+
		"\u0910\5L\'\2\u0910\u0911\7C\2\2\u0911\u0912\7*\2\2\u0912\u0913\7C\2\2"+
		"\u0913\u0914\7h\2\2\u0914\u0916\3\2\2\2\u0915\u0908\3\2\2\2\u0915\u090c"+
		"\3\2\2\2\u0915\u090f\3\2\2\2\u0916\u01a9\3\2\2\2\u0917\u0918\7C\2\2\u0918"+
		"\u0919\7h\2\2\u0919\u01ab\3\2\2\2\u091a\u091b\7*\2\2\u091b\u091c\7C\2"+
		"\2\u091c\u0924\7h\2\2\u091d\u091e\5L\'\2\u091e\u091f\7C\2\2\u091f\u0920"+
		"\7*\2\2\u0920\u0921\7C\2\2\u0921\u0922\7h\2\2\u0922\u0924\3\2\2\2\u0923"+
		"\u091a\3\2\2\2\u0923\u091d\3\2\2\2\u0924\u01ad\3\2\2\2\u0925\u0926\5P"+
		")\2\u0926\u0927\7?\2\2\u0927\u0928\5\u01ca\u00e6\2\u0928\u0929\7@\2\2"+
		"\u0929\u0930\3\2\2\2\u092a\u092b\5\u0192\u00ca\2\u092b\u092c\7?\2\2\u092c"+
		"\u092d\5\u01ca\u00e6\2\u092d\u092e\7@\2\2\u092e\u0930\3\2\2\2\u092f\u0925"+
		"\3\2\2\2\u092f\u092a\3\2\2\2\u0930\u0938\3\2\2\2\u0931\u0932\5\u0190\u00c9"+
		"\2\u0932\u0933\7?\2\2\u0933\u0934\5\u01ca\u00e6\2\u0934\u0935\7@\2\2\u0935"+
		"\u0937\3\2\2\2\u0936\u0931\3\2\2\2\u0937\u093a\3\2\2\2\u0938\u0936\3\2"+
		"\2\2\u0938\u0939\3\2\2\2\u0939\u01af\3\2\2\2\u093a\u0938\3\2\2\2\u093b"+
		"\u093c\5\u0198\u00cd\2\u093c\u093d\7?\2\2\u093d\u093e\5\u01ca\u00e6\2"+
		"\u093e\u093f\7@\2\2\u093f\u0947\3\2\2\2\u0940\u0941\5\u0196\u00cc\2\u0941"+
		"\u0942\7?\2\2\u0942\u0943\5\u01ca\u00e6\2\u0943\u0944\7@\2\2\u0944\u0946"+
		"\3\2\2\2\u0945\u0940\3\2\2\2\u0946\u0949\3\2\2\2\u0947\u0945\3\2\2\2\u0947"+
		"\u0948\3\2\2\2\u0948\u01b1\3\2\2\2\u0949\u0947\3\2\2\2\u094a\u094b\5P"+
		")\2\u094b\u094c\7?\2\2\u094c\u094d\5\u01ca\u00e6\2\u094d\u094e\7@\2\2"+
		"\u094e\u0955\3\2\2\2\u094f\u0950\5\u019e\u00d0\2\u0950\u0951\7?\2\2\u0951"+
		"\u0952\5\u01ca\u00e6\2\u0952\u0953\7@\2\2\u0953\u0955\3\2\2\2\u0954\u094a"+
		"\3\2\2\2\u0954\u094f\3\2\2\2\u0955\u095d\3\2\2\2\u0956\u0957\5\u019c\u00cf"+
		"\2\u0957\u0958\7?\2\2\u0958\u0959\5\u01ca\u00e6\2\u0959\u095a\7@\2\2\u095a"+
		"\u095c\3\2\2\2\u095b\u0956\3\2\2\2\u095c\u095f\3\2\2\2\u095d\u095b\3\2"+
		"\2\2\u095d\u095e\3\2\2\2\u095e\u01b3\3\2\2\2\u095f\u095d\3\2\2\2\u0960"+
		"\u0961\5\u00bc_\2\u0961\u0963\7;\2\2\u0962\u0964\5\u01ba\u00de\2\u0963"+
		"\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966\7<"+
		"\2\2\u0966\u09a5\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u0967\u0968\5L\'\2\u0968\u096a\7C\2\2\u0969\u096b\5@!\2\u096a\u0969\3"+
		"\2\2\2\u096a\u096b\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\7h\2\2\u096d"+
		"\u096f\7;\2\2\u096e\u0970\5\u01ba\u00de\2\u096f\u096e\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972\7<\2\2\u0972\u09a5\3\2\2\2\u0973"+
		"\u0974\5P)\2\u0974\u0976\7C\2\2\u0975\u0977\5@!\2\u0976\u0975\3\2\2\2"+
		"\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7h\2\2\u0979\u097b"+
		"\7;\2\2\u097a\u097c\5\u01ba\u00de\2\u097b\u097a\3\2\2\2\u097b\u097c\3"+
		"\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e\7<\2\2\u097e\u09a5\3\2\2\2\u097f"+
		"\u0980\5\u018c\u00c7\2\u0980\u0982\7C\2\2\u0981\u0983\5@!\2\u0982\u0981"+
		"\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\7h\2\2\u0985"+
		"\u0987\7;\2\2\u0986\u0988\5\u01ba\u00de\2\u0987\u0986\3\2\2\2\u0987\u0988"+
		"\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\7<\2\2\u098a\u09a5\3\2\2\2\u098b"+
		"\u098c\7*\2\2\u098c\u098e\7C\2\2\u098d\u098f\5@!\2\u098e\u098d\3\2\2\2"+
		"\u098e\u098f\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\7h\2\2\u0991\u0993"+
		"\7;\2\2\u0992\u0994\5\u01ba\u00de\2\u0993\u0992\3\2\2\2\u0993\u0994\3"+
		"\2\2\2\u0994\u0995\3\2\2\2\u0995\u09a5\7<\2\2\u0996\u0997\5L\'\2\u0997"+
		"\u0998\7C\2\2\u0998\u0999\7*\2\2\u0999\u099b\7C\2\2\u099a\u099c\5@!\2"+
		"\u099b\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e"+
		"\7h\2\2\u099e\u09a0\7;\2\2\u099f\u09a1\5\u01ba\u00de\2\u09a0\u099f\3\2"+
		"\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\7<\2\2\u09a3"+
		"\u09a5\3\2\2\2\u09a4\u0960\3\2\2\2\u09a4\u0967\3\2\2\2\u09a4\u0973\3\2"+
		"\2\2\u09a4\u097f\3\2\2\2\u09a4\u098b\3\2\2\2\u09a4\u0996\3\2\2\2\u09a5"+
		"\u01b5\3\2\2\2\u09a6\u09a8\7C\2\2\u09a7\u09a9\5@!\2\u09a8\u09a7\3\2\2"+
		"\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\7h\2\2\u09ab\u09ad"+
		"\7;\2\2\u09ac\u09ae\5\u01ba\u00de\2\u09ad\u09ac\3\2\2\2\u09ad\u09ae\3"+
		"\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\7<\2\2\u09b0\u01b7\3\2\2\2\u09b1"+
		"\u09b2\5\u00bc_\2\u09b2\u09b4\7;\2\2\u09b3\u09b5\5\u01ba\u00de\2\u09b4"+
		"\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\7<"+
		"\2\2\u09b7\u09ea\3\2\2\2\u09b8\u09b9\5L\'\2\u09b9\u09bb\7C\2\2\u09ba\u09bc"+
		"\5@!\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd"+
		"\u09be\7h\2\2\u09be\u09c0\7;\2\2\u09bf\u09c1\5\u01ba\u00de\2\u09c0\u09bf"+
		"\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\7<\2\2\u09c3"+
		"\u09ea\3\2\2\2\u09c4\u09c5\5P)\2\u09c5\u09c7\7C\2\2\u09c6\u09c8\5@!\2"+
		"\u09c7\u09c6\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca"+
		"\7h\2\2\u09ca\u09cc\7;\2\2\u09cb\u09cd\5\u01ba\u00de\2\u09cc\u09cb\3\2"+
		"\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\7<\2\2\u09cf"+
		"\u09ea\3\2\2\2\u09d0\u09d1\7*\2\2\u09d1\u09d3\7C\2\2\u09d2\u09d4\5@!\2"+
		"\u09d3\u09d2\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6"+
		"\7h\2\2\u09d6\u09d8\7;\2\2\u09d7\u09d9\5\u01ba\u00de\2\u09d8\u09d7\3\2"+
		"\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09ea\7<\2\2\u09db"+
		"\u09dc\5L\'\2\u09dc\u09dd\7C\2\2\u09dd\u09de\7*\2\2\u09de\u09e0\7C\2\2"+
		"\u09df\u09e1\5@!\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2"+
		"\3\2\2\2\u09e2\u09e3\7h\2\2\u09e3\u09e5\7;\2\2\u09e4\u09e6\5\u01ba\u00de"+
		"\2\u09e5\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8"+
		"\7<\2\2\u09e8\u09ea\3\2\2\2\u09e9\u09b1\3\2\2\2\u09e9\u09b8\3\2\2\2\u09e9"+
		"\u09c4\3\2\2\2\u09e9\u09d0\3\2\2\2\u09e9\u09db\3\2\2\2\u09ea\u01b9\3\2"+
		"\2\2\u09eb\u09f0\5\u01ca\u00e6\2\u09ec\u09ed\7B\2\2\u09ed\u09ef\5\u01ca"+
		"\u00e6\2\u09ee\u09ec\3\2\2\2\u09ef\u09f2\3\2\2\2\u09f0\u09ee\3\2\2\2\u09f0"+
		"\u09f1\3\2\2\2\u09f1\u01bb\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f3\u09f4\5P"+
		")\2\u09f4\u09f6\7\\\2\2\u09f5\u09f7\5@!\2\u09f6\u09f5\3\2\2\2\u09f6\u09f7"+
		"\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\7h\2\2\u09f9\u0a23\3\2\2\2\u09fa"+
		"\u09fb\5\"\22\2\u09fb\u09fd\7\\\2\2\u09fc\u09fe\5@!\2\u09fd\u09fc\3\2"+
		"\2\2\u09fd\u09fe\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a00\7h\2\2\u0a00"+
		"\u0a23\3\2\2\2\u0a01\u0a02\5\u018c\u00c7\2\u0a02\u0a04\7\\\2\2\u0a03\u0a05"+
		"\5@!\2\u0a04\u0a03\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06"+
		"\u0a07\7h\2\2\u0a07\u0a23\3\2\2\2\u0a08\u0a09\7*\2\2\u0a09\u0a0b\7\\\2"+
		"\2\u0a0a\u0a0c\5@!\2\u0a0b\u0a0a\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d"+
		"\3\2\2\2\u0a0d\u0a23\7h\2\2\u0a0e\u0a0f\5L\'\2\u0a0f\u0a10\7C\2\2\u0a10"+
		"\u0a11\7*\2\2\u0a11\u0a13\7\\\2\2\u0a12\u0a14\5@!\2\u0a13\u0a12\3\2\2"+
		"\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\7h\2\2\u0a16\u0a23"+
		"\3\2\2\2\u0a17\u0a18\5&\24\2\u0a18\u0a1a\7\\\2\2\u0a19\u0a1b\5@!\2\u0a1a"+
		"\u0a19\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\7!"+
		"\2\2\u0a1d\u0a23\3\2\2\2\u0a1e\u0a1f\5\64\33\2\u0a1f\u0a20\7\\\2\2\u0a20"+
		"\u0a21\7!\2\2\u0a21\u0a23\3\2\2\2\u0a22\u09f3\3\2\2\2\u0a22\u09fa\3\2"+
		"\2\2\u0a22\u0a01\3\2\2\2\u0a22\u0a08\3\2\2\2\u0a22\u0a0e\3\2\2\2\u0a22"+
		"\u0a17\3\2\2\2\u0a22\u0a1e\3\2\2\2\u0a23\u01bd\3\2\2\2\u0a24\u0a26\7\\"+
		"\2\2\u0a25\u0a27\5@!\2\u0a26\u0a25\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a28"+
		"\3\2\2\2\u0a28\u0a29\7h\2\2\u0a29\u01bf\3\2\2\2\u0a2a\u0a2b\5P)\2\u0a2b"+
		"\u0a2d\7\\\2\2\u0a2c\u0a2e\5@!\2\u0a2d\u0a2c\3\2\2\2\u0a2d\u0a2e\3\2\2"+
		"\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a30\7h\2\2\u0a30\u0a53\3\2\2\2\u0a31\u0a32"+
		"\5\"\22\2\u0a32\u0a34\7\\\2\2\u0a33\u0a35\5@!\2\u0a34\u0a33\3\2\2\2\u0a34"+
		"\u0a35\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u0a37\7h\2\2\u0a37\u0a53\3\2"+
		"\2\2\u0a38\u0a39\7*\2\2\u0a39\u0a3b\7\\\2\2\u0a3a\u0a3c\5@!\2\u0a3b\u0a3a"+
		"\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a53\7h\2\2\u0a3e"+
		"\u0a3f\5L\'\2\u0a3f\u0a40\7C\2\2\u0a40\u0a41\7*\2\2\u0a41\u0a43\7\\\2"+
		"\2\u0a42\u0a44\5@!\2\u0a43\u0a42\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a45"+
		"\3\2\2\2\u0a45\u0a46\7h\2\2\u0a46\u0a53\3\2\2\2\u0a47\u0a48\5&\24\2\u0a48"+
		"\u0a4a\7\\\2\2\u0a49\u0a4b\5@!\2\u0a4a\u0a49\3\2\2\2\u0a4a\u0a4b\3\2\2"+
		"\2\u0a4b\u0a4c\3\2\2\2\u0a4c\u0a4d\7!\2\2\u0a4d\u0a53\3\2\2\2\u0a4e\u0a4f"+
		"\5\64\33\2\u0a4f\u0a50\7\\\2\2\u0a50\u0a51\7!\2\2\u0a51\u0a53\3\2\2\2"+
		"\u0a52\u0a2a\3\2\2\2\u0a52\u0a31\3\2\2\2\u0a52\u0a38\3\2\2\2\u0a52\u0a3e"+
		"\3\2\2\2\u0a52\u0a47\3\2\2\2\u0a52\u0a4e\3\2\2\2\u0a53\u01c1\3\2\2\2\u0a54"+
		"\u0a55\7!\2\2\u0a55\u0a56\5\32\16\2\u0a56\u0a58\5\u01c4\u00e3\2\u0a57"+
		"\u0a59\5\66\34\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a6b\3"+
		"\2\2\2\u0a5a\u0a5b\7!\2\2\u0a5b\u0a5c\5$\23\2\u0a5c\u0a5e\5\u01c4\u00e3"+
		"\2\u0a5d\u0a5f\5\66\34\2\u0a5e\u0a5d\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f"+
		"\u0a6b\3\2\2\2\u0a60\u0a61\7!\2\2\u0a61\u0a62\5\32\16\2\u0a62\u0a63\5"+
		"\66\34\2\u0a63\u0a64\5\u0124\u0093\2\u0a64\u0a6b\3\2\2\2\u0a65\u0a66\7"+
		"!\2\2\u0a66\u0a67\5$\23\2\u0a67\u0a68\5\66\34\2\u0a68\u0a69\5\u0124\u0093"+
		"\2\u0a69\u0a6b\3\2\2\2\u0a6a\u0a54\3\2\2\2\u0a6a\u0a5a\3\2\2\2\u0a6a\u0a60"+
		"\3\2\2\2\u0a6a\u0a65\3\2\2\2\u0a6b\u01c3\3\2\2\2\u0a6c\u0a70\5\u01c6\u00e4"+
		"\2\u0a6d\u0a6f\5\u01c6\u00e4\2\u0a6e\u0a6d\3\2\2\2\u0a6f\u0a72\3\2\2\2"+
		"\u0a70\u0a6e\3\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u01c5\3\2\2\2\u0a72\u0a70"+
		"\3\2\2\2\u0a73\u0a75\5\u0112\u008a\2\u0a74\u0a73\3\2\2\2\u0a75\u0a78\3"+
		"\2\2\2\u0a76\u0a74\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a79\3\2\2\2\u0a78"+
		"\u0a76\3\2\2\2\u0a79\u0a7a\7?\2\2\u0a7a\u0a7b\5\u01ca\u00e6\2\u0a7b\u0a7c"+
		"\7@\2\2\u0a7c\u01c7\3\2\2\2\u0a7d\u0a7e\5\u01ca\u00e6\2\u0a7e\u01c9\3"+
		"\2\2\2\u0a7f\u0a82\5\u01cc\u00e7\2\u0a80\u0a82\5\u01d4\u00eb\2\u0a81\u0a7f"+
		"\3\2\2\2\u0a81\u0a80\3\2\2\2\u0a82\u01cb\3\2\2\2\u0a83\u0a84\5\u01ce\u00e8"+
		"\2\u0a84\u0a85\7[\2\2\u0a85\u0a86\5\u01d2\u00ea\2\u0a86\u01cd\3\2\2\2"+
		"\u0a87\u0a92\7h\2\2\u0a88\u0a8a\7;\2\2\u0a89\u0a8b\5\u00be`\2\u0a8a\u0a89"+
		"\3\2\2\2\u0a8a\u0a8b\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0a92\7<\2\2\u0a8d"+
		"\u0a8e\7;\2\2\u0a8e\u0a8f\5\u01d0\u00e9\2\u0a8f\u0a90\7<\2\2\u0a90\u0a92"+
		"\3\2\2\2\u0a91\u0a87\3\2\2\2\u0a91\u0a88\3\2\2\2\u0a91\u0a8d\3\2\2\2\u0a92"+
		"\u01cf\3\2\2\2\u0a93\u0a98\7h\2\2\u0a94\u0a95\7B\2\2\u0a95\u0a97\7h\2"+
		"\2\u0a96\u0a94\3\2\2\2\u0a97\u0a9a\3\2\2\2\u0a98\u0a96\3\2\2\2\u0a98\u0a99"+
		"\3\2\2\2\u0a99\u01d1\3\2\2\2\u0a9a\u0a98\3\2\2\2\u0a9b\u0a9e\5\u01ca\u00e6"+
		"\2\u0a9c\u0a9e\5\u0128\u0095\2\u0a9d\u0a9b\3\2\2\2\u0a9d\u0a9c\3\2\2\2"+
		"\u0a9e\u01d3\3\2\2\2\u0a9f\u0aa2\5\u01dc\u00ef\2\u0aa0\u0aa2\5\u01d6\u00ec"+
		"\2\u0aa1\u0a9f\3\2\2\2\u0aa1\u0aa0\3\2\2\2\u0aa2\u01d5\3\2\2\2\u0aa3\u0aa4"+
		"\5\u01d8\u00ed\2\u0aa4\u0aa5\5\u01da\u00ee\2\u0aa5\u0aa6\5\u01ca\u00e6"+
		"\2\u0aa6\u01d7\3\2\2\2\u0aa7\u0aab\5P)\2\u0aa8\u0aab\5\u01a8\u00d5\2\u0aa9"+
		"\u0aab\5\u01ae\u00d8\2\u0aaa\u0aa7\3\2\2\2\u0aaa\u0aa8\3\2\2\2\u0aaa\u0aa9"+
		"\3\2\2\2\u0aab\u01d9\3\2\2\2\u0aac\u0aad\t\4\2\2\u0aad\u01db\3\2\2\2\u0aae"+
		"\u0ab6\5\u01de\u00f0\2\u0aaf\u0ab0\5\u01de\u00f0\2\u0ab0\u0ab1\7I\2\2"+
		"\u0ab1\u0ab2\5\u01ca\u00e6\2\u0ab2\u0ab3\7J\2\2\u0ab3\u0ab4\5\u01dc\u00ef"+
		"\2\u0ab4\u0ab6\3\2\2\2\u0ab5\u0aae\3\2\2\2\u0ab5\u0aaf\3\2\2\2\u0ab6\u01dd"+
		"\3\2\2\2\u0ab7\u0ab8\b\u00f0\1\2\u0ab8\u0ab9\5\u01e0\u00f1\2\u0ab9\u0abf"+
		"\3\2\2\2\u0aba\u0abb\f\3\2\2\u0abb\u0abc\7P\2\2\u0abc\u0abe\5\u01e0\u00f1"+
		"\2\u0abd\u0aba\3\2\2\2\u0abe\u0ac1\3\2\2\2\u0abf\u0abd\3\2\2\2\u0abf\u0ac0"+
		"\3\2\2\2\u0ac0\u01df\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac2\u0ac3\b\u00f1\1"+
		"\2\u0ac3\u0ac4\5\u01e2\u00f2\2\u0ac4\u0aca\3\2\2\2\u0ac5\u0ac6\f\3\2\2"+
		"\u0ac6\u0ac7\7O\2\2\u0ac7\u0ac9\5\u01e2\u00f2\2\u0ac8\u0ac5\3\2\2\2\u0ac9"+
		"\u0acc\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u01e1\3\2"+
		"\2\2\u0acc\u0aca\3\2\2\2\u0acd\u0ace\b\u00f2\1\2\u0ace\u0acf\5\u01e4\u00f3"+
		"\2\u0acf\u0ad5\3\2\2\2\u0ad0\u0ad1\f\3\2\2\u0ad1\u0ad2\7X\2\2\u0ad2\u0ad4"+
		"\5\u01e4\u00f3\2\u0ad3\u0ad0\3\2\2\2\u0ad4\u0ad7\3\2\2\2\u0ad5\u0ad3\3"+
		"\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u01e3\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad8"+
		"\u0ad9\b\u00f3\1\2\u0ad9\u0ada\5\u01e6\u00f4\2\u0ada\u0ae0\3\2\2\2\u0adb"+
		"\u0adc\f\3\2\2\u0adc\u0add\7Y\2\2\u0add\u0adf\5\u01e6\u00f4\2\u0ade\u0adb"+
		"\3\2\2\2\u0adf\u0ae2\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1"+
		"\u01e5\3\2\2\2\u0ae2\u0ae0\3\2\2\2\u0ae3\u0ae4\b\u00f4\1\2\u0ae4\u0ae5"+
		"\5\u01e8\u00f5\2\u0ae5\u0aeb\3\2\2\2\u0ae6\u0ae7\f\3\2\2\u0ae7\u0ae8\7"+
		"W\2\2\u0ae8\u0aea\5\u01e8\u00f5\2\u0ae9\u0ae6\3\2\2\2\u0aea\u0aed\3\2"+
		"\2\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u01e7\3\2\2\2\u0aed"+
		"\u0aeb\3\2\2\2\u0aee\u0aef\b\u00f5\1\2\u0aef\u0af0\5\u01ea\u00f6\2\u0af0"+
		"\u0af9\3\2\2\2\u0af1\u0af2\f\4\2\2\u0af2\u0af3\7K\2\2\u0af3\u0af8\5\u01ea"+
		"\u00f6\2\u0af4\u0af5\f\3\2\2\u0af5\u0af6\7N\2\2\u0af6\u0af8\5\u01ea\u00f6"+
		"\2\u0af7\u0af1\3\2\2\2\u0af7\u0af4\3\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7"+
		"\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u01e9\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc"+
		"\u0afd\b\u00f6\1\2\u0afd\u0afe\5\u01ec\u00f7\2\u0afe\u0b10\3\2\2\2\u0aff"+
		"\u0b00\f\7\2\2\u0b00\u0b01\7F\2\2\u0b01\u0b0f\5\u01ec\u00f7\2\u0b02\u0b03"+
		"\f\6\2\2\u0b03\u0b04\7E\2\2\u0b04\u0b0f\5\u01ec\u00f7\2\u0b05\u0b06\f"+
		"\5\2\2\u0b06\u0b07\7L\2\2\u0b07\u0b0f\5\u01ec\u00f7\2\u0b08\u0b09\f\4"+
		"\2\2\u0b09\u0b0a\7M\2\2\u0b0a\u0b0f\5\u01ec\u00f7\2\u0b0b\u0b0c\f\3\2"+
		"\2\u0b0c\u0b0d\7\34\2\2\u0b0d\u0b0f\5\"\22\2\u0b0e\u0aff\3\2\2\2\u0b0e"+
		"\u0b02\3\2\2\2\u0b0e\u0b05\3\2\2\2\u0b0e\u0b08\3\2\2\2\u0b0e\u0b0b\3\2"+
		"\2\2\u0b0f\u0b12\3\2\2\2\u0b10\u0b0e\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11"+
		"\u01eb\3\2\2\2\u0b12\u0b10\3\2\2\2\u0b13\u0b14\b\u00f7\1\2\u0b14\u0b15"+
		"\5\u01ee\u00f8\2\u0b15\u0b25\3\2\2\2\u0b16\u0b17\f\5\2\2\u0b17\u0b18\7"+
		"F\2\2\u0b18\u0b19\7F\2\2\u0b19\u0b24\5\u01ee\u00f8\2\u0b1a\u0b1b\f\4\2"+
		"\2\u0b1b\u0b1c\7E\2\2\u0b1c\u0b1d\7E\2\2\u0b1d\u0b24\5\u01ee\u00f8\2\u0b1e"+
		"\u0b1f\f\3\2\2\u0b1f\u0b20\7E\2\2\u0b20\u0b21\7E\2\2\u0b21\u0b22\7E\2"+
		"\2\u0b22\u0b24\5\u01ee\u00f8\2\u0b23\u0b16\3\2\2\2\u0b23\u0b1a\3\2\2\2"+
		"\u0b23\u0b1e\3\2\2\2\u0b24\u0b27\3\2\2\2\u0b25\u0b23\3\2\2\2\u0b25\u0b26"+
		"\3\2\2\2\u0b26\u01ed\3\2\2\2\u0b27\u0b25\3\2\2\2\u0b28\u0b29\b\u00f8\1"+
		"\2\u0b29\u0b2a\5\u01f0\u00f9\2\u0b2a\u0b33\3\2\2\2\u0b2b\u0b2c\f\4\2\2"+
		"\u0b2c\u0b2d\7S\2\2\u0b2d\u0b32\5\u01f0\u00f9\2\u0b2e\u0b2f\f\3\2\2\u0b2f"+
		"\u0b30\7T\2\2\u0b30\u0b32\5\u01f0\u00f9\2\u0b31\u0b2b\3\2\2\2\u0b31\u0b2e"+
		"\3\2\2\2\u0b32\u0b35\3\2\2\2\u0b33\u0b31\3\2\2\2\u0b33\u0b34\3\2\2\2\u0b34"+
		"\u01ef\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b36\u0b37\b\u00f9\1\2\u0b37\u0b38"+
		"\5\u01f2\u00fa\2\u0b38\u0b44\3\2\2\2\u0b39\u0b3a\f\5\2\2\u0b3a\u0b3b\7"+
		"U\2\2\u0b3b\u0b43\5\u01f2\u00fa\2\u0b3c\u0b3d\f\4\2\2\u0b3d\u0b3e\7V\2"+
		"\2\u0b3e\u0b43\5\u01f2\u00fa\2\u0b3f\u0b40\f\3\2\2\u0b40\u0b41\7Z\2\2"+
		"\u0b41\u0b43\5\u01f2\u00fa\2\u0b42\u0b39\3\2\2\2\u0b42\u0b3c\3\2\2\2\u0b42"+
		"\u0b3f\3\2\2\2\u0b43\u0b46\3\2\2\2\u0b44\u0b42\3\2\2\2\u0b44\u0b45\3\2"+
		"\2\2\u0b45\u01f1\3\2\2\2\u0b46\u0b44\3\2\2\2\u0b47\u0b4f\5\u01f4\u00fb"+
		"\2\u0b48\u0b4f\5\u01f6\u00fc\2\u0b49\u0b4a\7S\2\2\u0b4a\u0b4f\5\u01f2"+
		"\u00fa\2\u0b4b\u0b4c\7T\2\2\u0b4c\u0b4f\5\u01f2\u00fa\2\u0b4d\u0b4f\5"+
		"\u01f8\u00fd\2\u0b4e\u0b47\3\2\2\2\u0b4e\u0b48\3\2\2\2\u0b4e\u0b49\3\2"+
		"\2\2\u0b4e\u0b4b\3\2\2\2\u0b4e\u0b4d\3\2\2\2\u0b4f\u01f3\3\2\2\2\u0b50"+
		"\u0b51\7Q\2\2\u0b51\u0b52\5\u01f2\u00fa\2\u0b52\u01f5\3\2\2\2\u0b53\u0b54"+
		"\7R\2\2\u0b54\u0b55\5\u01f2\u00fa\2\u0b55\u01f7\3\2\2\2\u0b56\u0b5d\5"+
		"\u01fa\u00fe\2\u0b57\u0b58\7H\2\2\u0b58\u0b5d\5\u01f2\u00fa\2\u0b59\u0b5a"+
		"\7G\2\2\u0b5a\u0b5d\5\u01f2\u00fa\2\u0b5b\u0b5d\5\u0204\u0103\2\u0b5c"+
		"\u0b56\3\2\2\2\u0b5c\u0b57\3\2\2\2\u0b5c\u0b59\3\2\2\2\u0b5c\u0b5b\3\2"+
		"\2\2\u0b5d\u01f9\3\2\2\2\u0b5e\u0b61\5\u018c\u00c7\2\u0b5f\u0b61\5P)\2"+
		"\u0b60\u0b5e\3\2\2\2\u0b60\u0b5f\3\2\2\2\u0b61\u0b66\3\2\2\2\u0b62\u0b65"+
		"\5\u01fe\u0100\2\u0b63\u0b65\5\u0202\u0102\2\u0b64\u0b62\3\2\2\2\u0b64"+
		"\u0b63\3\2\2\2\u0b65\u0b68\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b66\u0b67\3\2"+
		"\2\2\u0b67\u01fb\3\2\2\2\u0b68\u0b66\3\2\2\2\u0b69\u0b6a\5\u01fa\u00fe"+
		"\2\u0b6a\u0b6b\7Q\2\2\u0b6b\u01fd\3\2\2\2\u0b6c\u0b6d\7Q\2\2\u0b6d\u01ff"+
		"\3\2\2\2\u0b6e\u0b6f\5\u01fa\u00fe\2\u0b6f\u0b70\7R\2\2\u0b70\u0201\3"+
		"\2\2\2\u0b71\u0b72\7R\2\2\u0b72\u0203\3\2\2\2\u0b73\u0b74\7;\2\2\u0b74"+
		"\u0b75\5\32\16\2\u0b75\u0b76\7<\2\2\u0b76\u0b77\5\u01f2\u00fa\2\u0b77"+
		"\u0b8f\3\2\2\2\u0b78\u0b79\7;\2\2\u0b79\u0b7d\5\"\22\2\u0b7a\u0b7c\5>"+
		" \2\u0b7b\u0b7a\3\2\2\2\u0b7c\u0b7f\3\2\2\2\u0b7d\u0b7b\3\2\2\2\u0b7d"+
		"\u0b7e\3\2\2\2\u0b7e\u0b80\3\2\2\2\u0b7f\u0b7d\3\2\2\2\u0b80\u0b81\7<"+
		"\2\2\u0b81\u0b82\5\u01f8\u00fd\2\u0b82\u0b8f\3\2\2\2\u0b83\u0b84\7;\2"+
		"\2\u0b84\u0b88\5\"\22\2\u0b85\u0b87\5> \2\u0b86\u0b85\3\2\2\2\u0b87\u0b8a"+
		"\3\2\2\2\u0b88\u0b86\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89\u0b8b\3\2\2\2\u0b8a"+
		"\u0b88\3\2\2\2\u0b8b\u0b8c\7<\2\2\u0b8c\u0b8d\5\u01cc\u00e7\2\u0b8d\u0b8f"+
		"\3\2\2\2\u0b8e\u0b73\3\2\2\2\u0b8e\u0b78\3\2\2\2\u0b8e\u0b83\3\2\2\2\u0b8f"+
		"\u0205\3\2\2\2\u014c\u020c\u0224\u0229\u0230\u0234\u0238\u0241\u0245\u0249"+
		"\u024b\u0251\u0256\u025d\u0262\u0264\u026a\u026f\u0274\u0279\u0284\u0292"+
		"\u0297\u029f\u02a6\u02ac\u02b1\u02bc\u02bf\u02cd\u02d2\u02d7\u02dc\u02e2"+
		"\u02ec\u02f4\u02fe\u0306\u0310\u0314\u0319\u031f\u0325\u032e\u0339\u0356"+
		"\u035a\u0360\u0363\u0366\u036f\u037a\u0385\u0393\u039a\u03a3\u03aa\u03b4"+
		"\u03bf\u03c6\u03cc\u03d0\u03d4\u03df\u03e5\u03e9\u03ed\u03f1\u03f5\u03fa"+
		"\u03fe\u0402\u0404\u0409\u0410\u0415\u0417\u041d\u0422\u0426\u0439\u043e"+
		"\u044e\u0453\u0459\u045f\u0461\u0465\u046a\u046e\u0477\u047e\u0486\u0489"+
		"\u048e\u0496\u049c\u04a1\u04a8\u04af\u04b4\u04ba\u04c6\u04cb\u04cf\u04d9"+
		"\u04de\u04e6\u04e9\u04ee\u04f6\u04f9\u04fe\u0503\u0508\u050d\u0514\u0519"+
		"\u0521\u0526\u052b\u0530\u0536\u053c\u053f\u0542\u054b\u0551\u0557\u055a"+
		"\u055d\u0565\u056a\u056f\u0575\u0578\u0583\u058c\u0596\u059b\u05a6\u05ab"+
		"\u05b7\u05bc\u05c8\u05d2\u05d7\u05df\u05e2\u05e9\u05f1\u05f7\u0600\u060a"+
		"\u060e\u0611\u061a\u0628\u062b\u0634\u0639\u0641\u0647\u064f\u065b\u0662"+
		"\u0670\u0686\u06a8\u06b4\u06ba\u06c6\u06d3\u06ed\u06f1\u06f6\u06fa\u06fe"+
		"\u0706\u070a\u070e\u0715\u071e\u0726\u0735\u0741\u0747\u074d\u0762\u0767"+
		"\u076d\u0779\u0784\u078e\u0791\u0796\u079f\u07a5\u07af\u07b4\u07bd\u07d4"+
		"\u07de\u07f4\u07fb\u0803\u080b\u0816\u082d\u0837\u0842\u0858\u085c\u0861"+
		"\u0869\u086f\u0873\u0877\u087b\u0881\u0886\u088b\u088f\u0893\u0899\u089e"+
		"\u08a3\u08a7\u08ab\u08ad\u08b2\u08b7\u08bc\u08c0\u08c4\u08c8\u08cd\u08d5"+
		"\u08db\u08df\u08e3\u08e7\u08ed\u08f2\u08f7\u08fb\u08ff\u0901\u0906\u0915"+
		"\u0923\u092f\u0938\u0947\u0954\u095d\u0963\u096a\u096f\u0976\u097b\u0982"+
		"\u0987\u098e\u0993\u099b\u09a0\u09a4\u09a8\u09ad\u09b4\u09bb\u09c0\u09c7"+
		"\u09cc\u09d3\u09d8\u09e0\u09e5\u09e9\u09f0\u09f6\u09fd\u0a04\u0a0b\u0a13"+
		"\u0a1a\u0a22\u0a26\u0a2d\u0a34\u0a3b\u0a43\u0a4a\u0a52\u0a58\u0a5e\u0a6a"+
		"\u0a70\u0a76\u0a81\u0a8a\u0a91\u0a98\u0a9d\u0aa1\u0aaa\u0ab5\u0abf\u0aca"+
		"\u0ad5\u0ae0\u0aeb\u0af7\u0af9\u0b0e\u0b10\u0b23\u0b25\u0b31\u0b33\u0b42"+
		"\u0b44\u0b4e\u0b5c\u0b60\u0b64\u0b66\u0b7d\u0b88\u0b8e";
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
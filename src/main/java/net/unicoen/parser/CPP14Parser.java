// Generated from CPP14.g4 by ANTLR 4.5.1

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
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Directive=1, Alignas=2, Alignof=3, Asm=4, Auto=5, Bool=6, Break=7, Case=8, 
		Catch=9, Char=10, Char16=11, Char32=12, Class=13, Const=14, Constexpr=15, 
		Const_cast=16, Continue=17, Decltype=18, Default=19, Delete=20, Do=21, 
		Double=22, Dynamic_cast=23, Else=24, Enum=25, Explicit=26, Export=27, 
		Extern=28, False=29, Final=30, Float=31, For=32, Friend=33, Goto=34, If=35, 
		Inline=36, Int=37, Long=38, Mutable=39, Namespace=40, New=41, Noexcept=42, 
		Nullptr=43, Operator=44, Override=45, Private=46, Protected=47, Public=48, 
		Register=49, Reinterpret_cast=50, Return=51, Short=52, Signed=53, Sizeof=54, 
		Static=55, Static_assert=56, Static_cast=57, Struct=58, Switch=59, Template=60, 
		This=61, Thread_local=62, Throw=63, True=64, Try=65, Typedef=66, Typeid=67, 
		Typename=68, Union=69, Unsigned=70, Using=71, Virtual=72, Void=73, Volatile=74, 
		Wchar=75, While=76, LeftParen=77, RightParen=78, LeftBracket=79, RightBracket=80, 
		LeftBrace=81, RightBrace=82, Plus=83, Minus=84, Star=85, Div=86, Mod=87, 
		Caret=88, And=89, Or=90, Tilde=91, Not=92, Assign=93, Less=94, Greater=95, 
		PlusAssign=96, MinusAssign=97, StarAssign=98, DivAssign=99, ModAssign=100, 
		XorAssign=101, AndAssign=102, OrAssign=103, LeftShift=104, LeftShiftAssign=105, 
		Equal=106, NotEqual=107, LessEqual=108, GreaterEqual=109, AndAnd=110, 
		OrOr=111, PlusPlus=112, MinusMinus=113, Comma=114, ArrowStar=115, Arrow=116, 
		Question=117, Colon=118, Doublecolon=119, Semi=120, Dot=121, DotStar=122, 
		Ellipsis=123, Identifier=124, Integerliteral=125, Decimalliteral=126, 
		Octalliteral=127, Hexadecimalliteral=128, Binaryliteral=129, Integersuffix=130, 
		Characterliteral=131, Floatingliteral=132, Stringliteral=133, Booleanliteral=134, 
		Userdefinedintegerliteral=135, Userdefinedfloatingliteral=136, Userdefinedstringliteral=137, 
		Userdefinedcharacterliteral=138, Whitespace=139, Newline=140, BlockComment=141, 
		LineComment=142;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_identexpression = 3, RULE_unqualifiedid = 4, RULE_qualifiedid = 5, 
		RULE_nestednamespecifier = 6, RULE_lambdaexpression = 7, RULE_lambdaintroducer = 8, 
		RULE_lambdacapture = 9, RULE_capturedefault = 10, RULE_capturelist = 11, 
		RULE_capture = 12, RULE_simplecapture = 13, RULE_initcapture = 14, RULE_lambdadeclarator = 15, 
		RULE_idexpressionlapper = 16, RULE_postfixexpression = 17, RULE_expressionlist = 18, 
		RULE_pseudodestructorname = 19, RULE_binaryexpression = 20, RULE_unaryexpression = 21, 
		RULE_unaryoperator = 22, RULE_newexpression = 23, RULE_newplacement = 24, 
		RULE_newtypeid = 25, RULE_newdeclarator = 26, RULE_noptrnewdeclarator = 27, 
		RULE_newinitializer = 28, RULE_deleteexpression = 29, RULE_noexceptexpression = 30, 
		RULE_castexpression = 31, RULE_pmexpression = 32, RULE_multiplicativeexpression = 33, 
		RULE_additiveexpression = 34, RULE_shiftexpression = 35, RULE_relationalexpression = 36, 
		RULE_equalityexpression = 37, RULE_andexpression = 38, RULE_exclusiveorexpression = 39, 
		RULE_inclusiveorexpression = 40, RULE_logicalandexpression = 41, RULE_logicalorexpression = 42, 
		RULE_conditionalexpression = 43, RULE_assignmentexpression = 44, RULE_assignmentoperator = 45, 
		RULE_expression = 46, RULE_constantexpression = 47, RULE_statement = 48, 
		RULE_labeledstatement = 49, RULE_expressionstatement = 50, RULE_compoundstatement = 51, 
		RULE_statementseq = 52, RULE_selectionstatement = 53, RULE_switchstatement = 54, 
		RULE_condition = 55, RULE_whilestatement = 56, RULE_dowhilestatement = 57, 
		RULE_iterationstatement = 58, RULE_enhancedForStatement = 59, RULE_forinitstatement = 60, 
		RULE_forrangedeclaration = 61, RULE_forrangeinitializer = 62, RULE_jumpstatement = 63, 
		RULE_breakStatement = 64, RULE_continueStatement = 65, RULE_returnStatement = 66, 
		RULE_declarationstatement = 67, RULE_declarationseq = 68, RULE_myclassbody = 69, 
		RULE_myclassspecifier = 70, RULE_myclasshead = 71, RULE_declaration = 72, 
		RULE_blockdeclarationwithoutsimpledeclaration = 73, RULE_blockdeclaration = 74, 
		RULE_aliasdeclaration = 75, RULE_variabledeclarationstatement = 76, RULE_variabledeclaration = 77, 
		RULE_variableDeclaratorList = 78, RULE_arrayCreationExpression = 79, RULE_dimExprs = 80, 
		RULE_dimExpr = 81, RULE_variableDeclarator = 82, RULE_dims = 83, RULE_simpledeclaration = 84, 
		RULE_static_assertdeclaration = 85, RULE_emptydeclaration = 86, RULE_attributedeclaration = 87, 
		RULE_declspecifier = 88, RULE_declspecifierseq = 89, RULE_declspecifierwithouttype = 90, 
		RULE_declspecifierseqwithouttype = 91, RULE_storageclassspecifier = 92, 
		RULE_functionspecifier = 93, RULE_typedefname = 94, RULE_typespecifier = 95, 
		RULE_trailingtypespecifier = 96, RULE_typespecifierseq = 97, RULE_trailingtypespecifierseq = 98, 
		RULE_simpletypespecifier = 99, RULE_typename = 100, RULE_decltypespecifier = 101, 
		RULE_elaboratedtypespecifier = 102, RULE_enumname = 103, RULE_enumspecifier = 104, 
		RULE_enumhead = 105, RULE_opaqueenumdeclaration = 106, RULE_enumkey = 107, 
		RULE_enumbase = 108, RULE_enumeratorlist = 109, RULE_enumeratordefinition = 110, 
		RULE_enumerator = 111, RULE_namespacename = 112, RULE_originalnamespacename = 113, 
		RULE_namespacedefinition = 114, RULE_namednamespacedefinition = 115, RULE_originalnamespacedefinition = 116, 
		RULE_extensionnamespacedefinition = 117, RULE_unnamednamespacedefinition = 118, 
		RULE_namespacebody = 119, RULE_namespacealias = 120, RULE_namespacealiasdefinition = 121, 
		RULE_qualifiednamespacespecifier = 122, RULE_usingdeclaration = 123, RULE_usingdirective = 124, 
		RULE_asmdefinition = 125, RULE_linkagespecification = 126, RULE_attributespecifierseq = 127, 
		RULE_attributespecifier = 128, RULE_alignmentspecifier = 129, RULE_attributelist = 130, 
		RULE_attribute = 131, RULE_attributetoken = 132, RULE_attributescopedtoken = 133, 
		RULE_attributenamespace = 134, RULE_attributeargumentclause = 135, RULE_balancedtokenseq = 136, 
		RULE_balancedtoken = 137, RULE_initdeclaratorlist = 138, RULE_initdeclarator = 139, 
		RULE_declarator = 140, RULE_ptrdeclarator = 141, RULE_noptrdeclarator = 142, 
		RULE_parametersandqualifiers = 143, RULE_trailingreturntype = 144, RULE_ptroperator = 145, 
		RULE_cvqualifierseq = 146, RULE_cvqualifier = 147, RULE_refqualifier = 148, 
		RULE_declaratorid = 149, RULE_typeid = 150, RULE_abstractdeclarator = 151, 
		RULE_ptrabstractdeclarator = 152, RULE_noptrabstractdeclarator = 153, 
		RULE_abstractpackdeclarator = 154, RULE_noptrabstractpackdeclarator = 155, 
		RULE_parameterdeclarationclause = 156, RULE_parameterdeclarationlist = 157, 
		RULE_parameterdeclaration = 158, RULE_functiondefinition = 159, RULE_functionheader = 160, 
		RULE_functiondeclarator = 161, RULE_functionbody = 162, RULE_initializer = 163, 
		RULE_braceorequalinitializer = 164, RULE_initializerclause = 165, RULE_initializerlist = 166, 
		RULE_bracedinitlist = 167, RULE_myclassname = 168, RULE_classspecifier = 169, 
		RULE_classbody = 170, RULE_classhead = 171, RULE_classheadname = 172, 
		RULE_classvirtspecifier = 173, RULE_classkey = 174, RULE_memberspecification = 175, 
		RULE_memberdeclaration = 176, RULE_membervariabledeclarationstatement = 177, 
		RULE_membervariabledeclaration = 178, RULE_memberdeclaratorlist = 179, 
		RULE_memberdeclarator = 180, RULE_virtspecifierseq = 181, RULE_virtspecifier = 182, 
		RULE_purespecifier = 183, RULE_baseclause = 184, RULE_basespecifierlist = 185, 
		RULE_basespecifier = 186, RULE_classordecltype = 187, RULE_basetypespecifier = 188, 
		RULE_accessspecifier = 189, RULE_conversionfunctionid = 190, RULE_conversiontypeid = 191, 
		RULE_conversiondeclarator = 192, RULE_ctorinitializer = 193, RULE_meminitializerlist = 194, 
		RULE_meminitializer = 195, RULE_meminitializerid = 196, RULE_operatorfunctionid = 197, 
		RULE_literaloperatorid = 198, RULE_templatedeclaration = 199, RULE_templateparameterlist = 200, 
		RULE_templateparameter = 201, RULE_typeparameter = 202, RULE_simpletemplateid = 203, 
		RULE_templateid = 204, RULE_templatename = 205, RULE_templateargumentlist = 206, 
		RULE_templateargument = 207, RULE_typenamespecifier = 208, RULE_explicitinstantiation = 209, 
		RULE_explicitspecialization = 210, RULE_tryblock = 211, RULE_functiontryblock = 212, 
		RULE_handlerseq = 213, RULE_handler = 214, RULE_exceptiondeclaration = 215, 
		RULE_throwexpression = 216, RULE_exceptionspecification = 217, RULE_dynamicexceptionspecification = 218, 
		RULE_typeidlist = 219, RULE_noexceptspecification = 220, RULE_rightShift = 221, 
		RULE_rightShiftAssign = 222, RULE_operator = 223, RULE_literal = 224, 
		RULE_integerliteral = 225, RULE_characterliteral = 226, RULE_floatingliteral = 227, 
		RULE_stringliteral = 228, RULE_booleanliteral = 229, RULE_pointerliteral = 230, 
		RULE_userdefinedliteral = 231;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "identexpression", 
		"unqualifiedid", "qualifiedid", "nestednamespecifier", "lambdaexpression", 
		"lambdaintroducer", "lambdacapture", "capturedefault", "capturelist", 
		"capture", "simplecapture", "initcapture", "lambdadeclarator", "idexpressionlapper", 
		"postfixexpression", "expressionlist", "pseudodestructorname", "binaryexpression", 
		"unaryexpression", "unaryoperator", "newexpression", "newplacement", "newtypeid", 
		"newdeclarator", "noptrnewdeclarator", "newinitializer", "deleteexpression", 
		"noexceptexpression", "castexpression", "pmexpression", "multiplicativeexpression", 
		"additiveexpression", "shiftexpression", "relationalexpression", "equalityexpression", 
		"andexpression", "exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
		"logicalorexpression", "conditionalexpression", "assignmentexpression", 
		"assignmentoperator", "expression", "constantexpression", "statement", 
		"labeledstatement", "expressionstatement", "compoundstatement", "statementseq", 
		"selectionstatement", "switchstatement", "condition", "whilestatement", 
		"dowhilestatement", "iterationstatement", "enhancedForStatement", "forinitstatement", 
		"forrangedeclaration", "forrangeinitializer", "jumpstatement", "breakStatement", 
		"continueStatement", "returnStatement", "declarationstatement", "declarationseq", 
		"myclassbody", "myclassspecifier", "myclasshead", "declaration", "blockdeclarationwithoutsimpledeclaration", 
		"blockdeclaration", "aliasdeclaration", "variabledeclarationstatement", 
		"variabledeclaration", "variableDeclaratorList", "arrayCreationExpression", 
		"dimExprs", "dimExpr", "variableDeclarator", "dims", "simpledeclaration", 
		"static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
		"declspecifier", "declspecifierseq", "declspecifierwithouttype", "declspecifierseqwithouttype", 
		"storageclassspecifier", "functionspecifier", "typedefname", "typespecifier", 
		"trailingtypespecifier", "typespecifierseq", "trailingtypespecifierseq", 
		"simpletypespecifier", "typename", "decltypespecifier", "elaboratedtypespecifier", 
		"enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", 
		"enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "typeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionheader", "functiondeclarator", "functionbody", 
		"initializer", "braceorequalinitializer", "initializerclause", "initializerlist", 
		"bracedinitlist", "myclassname", "classspecifier", "classbody", "classhead", 
		"classheadname", "classvirtspecifier", "classkey", "memberspecification", 
		"memberdeclaration", "membervariabledeclarationstatement", "membervariabledeclaration", 
		"memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", "virtspecifier", 
		"purespecifier", "baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "integerliteral", "characterliteral", "floatingliteral", 
		"stringliteral", "booleanliteral", "pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
		"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
		"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'<<='", "'=='", "'!='", "'<='", "'>='", 
		"'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", 
		"'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", 
		"Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", 
		"Const_cast", "Continue", "Decltype", "Default", "Delete", "Do", "Double", 
		"Dynamic_cast", "Else", "Enum", "Explicit", "Export", "Extern", "False", 
		"Final", "Float", "For", "Friend", "Goto", "If", "Inline", "Int", "Long", 
		"Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", "Override", 
		"Private", "Protected", "Public", "Register", "Reinterpret_cast", "Return", 
		"Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
		"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
		"Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", "Using", 
		"Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
		"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
		"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
		"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
		"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
		"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
		"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
		"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
		"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
		"Booleanliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
		"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTranslationunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(464);
				declarationseq(0);
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

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentexpressionContext identexpression() {
			return getRuleContext(IdentexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPrimaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(475);
			switch (_input.LA(1)) {
			case Nullptr:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Booleanliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(LeftParen);
				setState(470);
				expression(0);
				setState(471);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				identexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				lambdaexpression();
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

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIdexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				qualifiedid();
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

	public static class IdentexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIdentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentexpressionContext identexpression() throws RecognitionException {
		IdentexpressionContext _localctx = new IdentexpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identexpression);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				qualifiedid();
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

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public MyclassnameContext myclassname() {
			return getRuleContext(MyclassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnqualifiedid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unqualifiedid);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				match(Tilde);
				setState(490);
				myclassname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(491);
				match(Tilde);
				setState(492);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				templateid();
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

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitQualifiedid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			nestednamespecifier(0);
			setState(498);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(497);
				match(Template);
				}
			}

			setState(500);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNestednamespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(503);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(504);
				typename();
				setState(505);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(507);
				namespacename();
				setState(508);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(510);
				decltypespecifier();
				setState(511);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(515);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(516);
						match(Identifier);
						setState(517);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(518);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(520);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(519);
							match(Template);
							}
						}

						setState(522);
						simpletemplateid();
						setState(523);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(529);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdaexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			lambdaintroducer();
			setState(532);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(531);
				lambdadeclarator();
				}
			}

			setState(534);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdaintroducer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(LeftBracket);
			setState(538);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(537);
				lambdacapture();
				}
			}

			setState(540);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdacapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambdacapture);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				capturedefault();
				setState(545);
				match(Comma);
				setState(546);
				capturelist(0);
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

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapturedefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
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

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapturelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(553);
			capture();
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(554);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(557);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(558);
					match(Comma);
					setState(559);
					capture();
					setState(561);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(560);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capture);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				initcapture();
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

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimplecapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simplecapture);
		try {
			setState(576);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(And);
				setState(574);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(This);
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

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initcapture);
		try {
			setState(583);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(Identifier);
				setState(579);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(And);
				setState(581);
				match(Identifier);
				setState(582);
				initializer();
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

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdadeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(LeftParen);
			setState(586);
			parameterdeclarationclause();
			setState(587);
			match(RightParen);
			setState(589);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(588);
				match(Mutable);
				}
			}

			setState(592);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(591);
				exceptionspecification();
				}
			}

			setState(595);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(594);
				attributespecifierseq(0);
				}
			}

			setState(598);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(597);
				trailingreturntype();
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

	public static class IdexpressionlapperContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public IdexpressionlapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpressionlapper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIdexpressionlapper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdexpressionlapperContext idexpressionlapper() throws RecognitionException {
		IdexpressionlapperContext _localctx = new IdexpressionlapperContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idexpressionlapper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TerminalNode Typeid() { return getToken(CPP14Parser.Typeid, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPP14Parser.Dot, 0); }
		public IdexpressionlapperContext idexpressionlapper() {
			return getRuleContext(IdexpressionlapperContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPostfixexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(603);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(604);
				simpletypespecifier();
				setState(605);
				match(LeftParen);
				setState(607);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(606);
					expressionlist();
					}
				}

				setState(609);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(611);
				typenamespecifier();
				setState(612);
				match(LeftParen);
				setState(614);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(613);
					expressionlist();
					}
				}

				setState(616);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(618);
				simpletypespecifier();
				setState(619);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(621);
				typenamespecifier();
				setState(622);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(624);
				match(Dynamic_cast);
				setState(625);
				match(Less);
				setState(626);
				typeid();
				setState(627);
				match(Greater);
				setState(628);
				match(LeftParen);
				setState(629);
				expression(0);
				setState(630);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(632);
				match(Static_cast);
				setState(633);
				match(Less);
				setState(634);
				typeid();
				setState(635);
				match(Greater);
				setState(636);
				match(LeftParen);
				setState(637);
				expression(0);
				setState(638);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(640);
				match(Reinterpret_cast);
				setState(641);
				match(Less);
				setState(642);
				typeid();
				setState(643);
				match(Greater);
				setState(644);
				match(LeftParen);
				setState(645);
				expression(0);
				setState(646);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(648);
				match(Const_cast);
				setState(649);
				match(Less);
				setState(650);
				typeid();
				setState(651);
				match(Greater);
				setState(652);
				match(LeftParen);
				setState(653);
				expression(0);
				setState(654);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(656);
				match(Typeid);
				setState(657);
				match(LeftParen);
				setState(658);
				expression(0);
				setState(659);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(661);
				match(Typeid);
				setState(662);
				match(LeftParen);
				setState(663);
				typeid();
				setState(664);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(706);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(668);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(669);
						match(LeftBracket);
						setState(670);
						assignmentexpression();
						setState(671);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(673);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(674);
						match(LeftBracket);
						setState(675);
						bracedinitlist();
						setState(676);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(678);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(679);
						match(LeftParen);
						setState(681);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(680);
							expressionlist();
							}
						}

						setState(683);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(684);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(685);
						match(Dot);
						setState(687);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(686);
							match(Template);
							}
						}

						setState(689);
						idexpressionlapper();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(690);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(691);
						match(Arrow);
						setState(693);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(692);
							match(Template);
							}
						}

						setState(695);
						idexpressionlapper();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(696);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(697);
						match(Dot);
						setState(698);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(699);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(700);
						match(Arrow);
						setState(701);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(702);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(703);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(704);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(705);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpressionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			initializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPseudodestructorname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudodestructorname);
		int _la;
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(713);
					nestednamespecifier(0);
					}
					break;
				}
				setState(716);
				typename();
				setState(717);
				match(Doublecolon);
				setState(718);
				match(Tilde);
				setState(719);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				nestednamespecifier(0);
				setState(722);
				match(Template);
				setState(723);
				simpletemplateid();
				setState(724);
				match(Doublecolon);
				setState(725);
				match(Tilde);
				setState(726);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(728);
					nestednamespecifier(0);
					}
				}

				setState(731);
				match(Tilde);
				setState(732);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				match(Tilde);
				setState(734);
				decltypespecifier();
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

	public static class BinaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public BinaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBinaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryexpressionContext binaryexpression() throws RecognitionException {
		BinaryexpressionContext _localctx = new BinaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryexpression);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				unaryexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				newexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(740);
				deleteexpression();
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public BinaryexpressionContext binaryexpression() {
			return getRuleContext(BinaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryexpression);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(PlusPlus);
				setState(744);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(MinusMinus);
				setState(746);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				unaryoperator();
				setState(748);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(Sizeof);
				setState(751);
				binaryexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				match(Sizeof);
				setState(753);
				match(LeftParen);
				setState(754);
				typeid();
				setState(755);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				match(Sizeof);
				setState(758);
				match(Ellipsis);
				setState(759);
				match(LeftParen);
				setState(760);
				match(Identifier);
				setState(761);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(762);
				match(Alignof);
				setState(763);
				match(LeftParen);
				setState(764);
				typeid();
				setState(765);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(767);
				noexceptexpression();
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnaryoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Plus - 83)) | (1L << (Minus - 83)) | (1L << (Star - 83)) | (1L << (And - 83)) | (1L << (Or - 83)) | (1L << (Tilde - 83)) | (1L << (Not - 83)))) != 0)) ) {
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

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newexpression);
		int _la;
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(772);
					match(Doublecolon);
					}
				}

				setState(775);
				match(New);
				setState(777);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(776);
					newplacement();
					}
				}

				setState(779);
				newtypeid();
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(780);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(783);
					match(Doublecolon);
					}
				}

				setState(786);
				match(New);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(787);
					newplacement();
					}
					break;
				}
				setState(790);
				match(LeftParen);
				setState(791);
				typeid();
				setState(792);
				match(RightParen);
				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(793);
					newinitializer();
					}
					break;
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

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewplacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(LeftParen);
			setState(799);
			expressionlist();
			setState(800);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewtypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			typespecifierseq();
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(803);
				newdeclarator();
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

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newdeclarator);
		try {
			setState(811);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				ptroperator();
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(807);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				noptrnewdeclarator(0);
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

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrnewdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(814);
			match(LeftBracket);
			setState(815);
			expression(0);
			setState(816);
			match(RightBracket);
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(817);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(820);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(821);
					match(LeftBracket);
					setState(822);
					constantexpression();
					setState(823);
					match(RightBracket);
					setState(825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(824);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newinitializer);
		int _la;
		try {
			setState(838);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(LeftParen);
				setState(834);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(833);
					expressionlist();
					}
				}

				setState(836);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				bracedinitlist();
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

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeleteexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deleteexpression);
		int _la;
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(840);
					match(Doublecolon);
					}
				}

				setState(843);
				match(Delete);
				setState(844);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(845);
					match(Doublecolon);
					}
				}

				setState(848);
				match(Delete);
				setState(849);
				match(LeftBracket);
				setState(850);
				match(RightBracket);
				setState(851);
				castexpression();
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

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoexceptexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(Noexcept);
			setState(855);
			match(LeftParen);
			setState(856);
			expression(0);
			setState(857);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public BinaryexpressionContext binaryexpression() {
			return getRuleContext(BinaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCastexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_castexpression);
		try {
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				binaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(LeftParen);
				setState(861);
				typeid();
				setState(862);
				match(RightParen);
				setState(863);
				castexpression();
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

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public TerminalNode DotStar() { return getToken(CPP14Parser.DotStar, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP14Parser.ArrowStar, 0); }
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPmexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(868);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(876);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(870);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(871);
						match(DotStar);
						setState(872);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(873);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(874);
						match(ArrowStar);
						setState(875);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP14Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP14Parser.Mod, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMultiplicativeexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(882);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(884);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(885);
						match(Star);
						setState(886);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(887);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(888);
						match(Div);
						setState(889);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(890);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(891);
						match(Mod);
						setState(892);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAdditiveexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(899);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(901);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(902);
						match(Plus);
						setState(903);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(904);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(905);
						match(Minus);
						setState(906);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitShiftexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(915);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(916);
						match(LeftShift);
						setState(917);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(918);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(919);
						rightShift();
						setState(920);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CPP14Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPP14Parser.GreaterEqual, 0); }
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRelationalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(928);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(930);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(931);
						match(Less);
						setState(932);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(933);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(934);
						match(Greater);
						setState(935);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(936);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(937);
						match(LessEqual);
						setState(938);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(939);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(940);
						match(GreaterEqual);
						setState(941);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CPP14Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP14Parser.NotEqual, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEqualityexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(948);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(950);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(951);
						match(Equal);
						setState(952);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(953);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(954);
						match(NotEqual);
						setState(955);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(960);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAndexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(962);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(964);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(965);
					match(And);
					setState(966);
					equalityexpression(0);
					}
					} 
				}
				setState(971);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CPP14Parser.Caret, 0); }
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(973);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(975);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(976);
					match(Caret);
					setState(977);
					andexpression(0);
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(984);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(986);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(987);
					match(Or);
					setState(988);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(CPP14Parser.AndAnd, 0); }
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLogicalandexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(995);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(997);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(998);
					match(AndAnd);
					setState(999);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CPP14Parser.OrOr, 0); }
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLogicalorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1006);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(1008);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1009);
					match(OrOr);
					setState(1010);
					logicalandexpression(0);
					}
					} 
				}
				setState(1015);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConditionalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalexpression);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				logicalorexpression(0);
				setState(1018);
				match(Question);
				setState(1019);
				expression(0);
				setState(1020);
				match(Colon);
				setState(1021);
				assignmentexpression();
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAssignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentexpression);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				logicalorexpression(0);
				setState(1027);
				assignmentoperator();
				setState(1028);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030);
				throwexpression();
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

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAssignmentoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentoperator);
		try {
			setState(1044);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(1037);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(1038);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(1039);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(1040);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(1041);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(1042);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(1043);
				match(OrAssign);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1047);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1049);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1050);
					match(Comma);
					setState(1051);
					assignmentexpression();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConstantexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
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
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public SwitchstatementContext switchstatement() {
			return getRuleContext(SwitchstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public DowhilestatementContext dowhilestatement() {
			return getRuleContext(DowhilestatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
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
		public VariabledeclarationstatementContext variabledeclarationstatement() {
			return getRuleContext(VariabledeclarationstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1060);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1063);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1064);
					attributespecifierseq(0);
					}
				}

				setState(1067);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1069);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1068);
					attributespecifierseq(0);
					}
				}

				setState(1071);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1073);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1072);
					attributespecifierseq(0);
					}
				}

				setState(1075);
				switchstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1077);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1076);
					attributespecifierseq(0);
					}
				}

				setState(1079);
				iterationstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1080);
					attributespecifierseq(0);
					}
				}

				setState(1083);
				whilestatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1085);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1084);
					attributespecifierseq(0);
					}
				}

				setState(1087);
				dowhilestatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1089);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1088);
					attributespecifierseq(0);
					}
				}

				setState(1091);
				jumpstatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1093);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1092);
					attributespecifierseq(0);
					}
				}

				setState(1095);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1097);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1096);
					attributespecifierseq(0);
					}
				}

				setState(1099);
				continueStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1101);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1100);
					attributespecifierseq(0);
					}
				}

				setState(1103);
				returnStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1104);
				variabledeclarationstatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1105);
				declarationstatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1107);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1106);
					attributespecifierseq(0);
					}
				}

				setState(1109);
				tryblock();
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

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLabeledstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labeledstatement);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1112);
					attributespecifierseq(0);
					}
				}

				setState(1115);
				match(Identifier);
				setState(1116);
				match(Colon);
				setState(1117);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1118);
					attributespecifierseq(0);
					}
				}

				setState(1121);
				match(Case);
				setState(1122);
				constantexpression();
				setState(1123);
				match(Colon);
				setState(1124);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1126);
					attributespecifierseq(0);
					}
				}

				setState(1129);
				match(Default);
				setState(1130);
				match(Colon);
				setState(1131);
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

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpressionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1134);
				expression(0);
				}
			}

			setState(1137);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCompoundstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(LeftBrace);
			setState(1141);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1140);
				statementseq();
				}
			}

			setState(1143);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatementseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		StatementseqContext _localctx = new StatementseqContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statementseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			statement();
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				{
				setState(1146);
				statement();
				}
				}
				setState(1151);
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

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSelectionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionstatement);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				match(If);
				setState(1153);
				match(LeftParen);
				setState(1154);
				condition();
				setState(1155);
				match(RightParen);
				setState(1156);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(If);
				setState(1159);
				match(LeftParen);
				setState(1160);
				condition();
				setState(1161);
				match(RightParen);
				setState(1162);
				statement();
				setState(1163);
				match(Else);
				setState(1164);
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

	public static class SwitchstatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSwitchstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchstatementContext switchstatement() throws RecognitionException {
		SwitchstatementContext _localctx = new SwitchstatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switchstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(Switch);
			setState(1169);
			match(LeftParen);
			setState(1170);
			condition();
			setState(1171);
			match(RightParen);
			setState(1172);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_condition);
		int _la;
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1175);
					attributespecifierseq(0);
					}
				}

				setState(1178);
				declspecifierseq();
				setState(1179);
				declarator();
				setState(1180);
				match(Assign);
				setState(1181);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1183);
					attributespecifierseq(0);
					}
				}

				setState(1186);
				declspecifierseq();
				setState(1187);
				declarator();
				setState(1188);
				bracedinitlist();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(While);
			setState(1193);
			match(LeftParen);
			setState(1194);
			condition();
			setState(1195);
			match(RightParen);
			setState(1196);
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

	public static class DowhilestatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DowhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDowhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhilestatementContext dowhilestatement() throws RecognitionException {
		DowhilestatementContext _localctx = new DowhilestatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dowhilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(Do);
			setState(1199);
			compoundstatement();
			setState(1200);
			match(While);
			setState(1201);
			match(LeftParen);
			setState(1202);
			expression(0);
			setState(1203);
			match(RightParen);
			setState(1204);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIterationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_iterationstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(For);
			setState(1207);
			match(LeftParen);
			setState(1208);
			forinitstatement();
			setState(1210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1209);
				condition();
				}
			}

			setState(1212);
			match(Semi);
			setState(1214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1213);
				expression(0);
				}
			}

			setState(1216);
			match(RightParen);
			setState(1217);
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(For);
			setState(1220);
			match(LeftParen);
			setState(1221);
			forrangedeclaration();
			setState(1222);
			match(Colon);
			setState(1223);
			forrangeinitializer();
			setState(1224);
			match(RightParen);
			setState(1225);
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

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public VariabledeclarationstatementContext variabledeclarationstatement() {
			return getRuleContext(VariabledeclarationstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForinitstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forinitstatement);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				variabledeclarationstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229);
				simpledeclaration();
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

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForrangedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1232);
				attributespecifierseq(0);
				}
			}

			setState(1235);
			declspecifierseq();
			setState(1236);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForrangeinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_forrangeinitializer);
		try {
			setState(1240);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Booleanliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				bracedinitlist();
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

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitJumpstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_jumpstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(Goto);
			setState(1243);
			match(Identifier);
			setState(1244);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(Break);
			setState(1247);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(Continue);
			setState(1250);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_returnStatement);
		int _la;
		try {
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(Return);
				setState(1254);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1253);
					expression(0);
					}
				}

				setState(1256);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(Return);
				setState(1258);
				bracedinitlist();
				setState(1259);
				match(Semi);
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

	public static class DeclarationstatementContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public BlockdeclarationwithoutsimpledeclarationContext blockdeclarationwithoutsimpledeclaration() {
			return getRuleContext(BlockdeclarationwithoutsimpledeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declarationstatement);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				blockdeclarationwithoutsimpledeclaration();
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1268);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1270);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1271);
					declaration();
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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

	public static class MyclassbodyContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public MyclassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myclassbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMyclassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyclassbodyContext myclassbody() throws RecognitionException {
		MyclassbodyContext _localctx = new MyclassbodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_myclassbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1277);
				memberspecification();
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

	public static class MyclassspecifierContext extends ParserRuleContext {
		public MyclassheadContext myclasshead() {
			return getRuleContext(MyclassheadContext.class,0);
		}
		public MyclassbodyContext myclassbody() {
			return getRuleContext(MyclassbodyContext.class,0);
		}
		public MyclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myclassspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMyclassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyclassspecifierContext myclassspecifier() throws RecognitionException {
		MyclassspecifierContext _localctx = new MyclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_myclassspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			myclasshead();
			setState(1281);
			match(LeftBrace);
			setState(1282);
			myclassbody();
			setState(1283);
			match(RightBrace);
			setState(1284);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyclassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public MyclassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myclasshead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMyclasshead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyclassheadContext myclasshead() throws RecognitionException {
		MyclassheadContext _localctx = new MyclassheadContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_myclasshead);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				classkey();
				setState(1288);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1287);
					attributespecifierseq(0);
					}
				}

				setState(1291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1290);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1293);
				classheadname();
				setState(1295);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1294);
					classvirtspecifier();
					}
				}

				setState(1298);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1297);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				classkey();
				setState(1302);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1301);
					attributespecifierseq(0);
					}
				}

				setState(1305);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1304);
					baseclause();
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public MyclassspecifierContext myclassspecifier() {
			return getRuleContext(MyclassspecifierContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declaration);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				myclassspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1311);
				functiondefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1312);
				templatedeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1313);
				explicitinstantiation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1314);
				explicitspecialization();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1315);
				linkagespecification();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1316);
				namespacedefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1317);
				emptydeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1318);
				attributedeclaration();
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

	public static class BlockdeclarationwithoutsimpledeclarationContext extends ParserRuleContext {
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationwithoutsimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclarationwithoutsimpledeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBlockdeclarationwithoutsimpledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockdeclarationwithoutsimpledeclarationContext blockdeclarationwithoutsimpledeclaration() throws RecognitionException {
		BlockdeclarationwithoutsimpledeclarationContext _localctx = new BlockdeclarationwithoutsimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_blockdeclarationwithoutsimpledeclaration);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				asmdefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				namespacealiasdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				usingdirective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1325);
				static_assertdeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1326);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1327);
				opaqueenumdeclaration();
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

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public BlockdeclarationwithoutsimpledeclarationContext blockdeclarationwithoutsimpledeclaration() {
			return getRuleContext(BlockdeclarationwithoutsimpledeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBlockdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockdeclaration);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				blockdeclarationwithoutsimpledeclaration();
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

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAliasdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(Using);
			setState(1335);
			match(Identifier);
			setState(1337);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1336);
				attributespecifierseq(0);
				}
			}

			setState(1339);
			match(Assign);
			setState(1340);
			typeid();
			setState(1341);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabledeclarationstatementContext extends ParserRuleContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public VariabledeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarationstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVariabledeclarationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationstatementContext variabledeclarationstatement() throws RecognitionException {
		VariabledeclarationstatementContext _localctx = new VariabledeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			variabledeclaration();
			setState(1344);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabledeclarationContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqwithouttypeContext declspecifierseqwithouttype() {
			return getRuleContext(DeclspecifierseqwithouttypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variabledeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1346);
				attributespecifierseq(0);
				}
			}

			setState(1350);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(1349);
				declspecifierseqwithouttype();
				}
			}

			setState(1352);
			typespecifier();
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1353);
				variableDeclaratorList();
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
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableDeclaratorList);
		int _la;
		try {
			setState(1365);
			switch (_input.LA(1)) {
			case Semi:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Decltype:
			case Operator:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				variableDeclarator();
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1358);
					match(Comma);
					setState(1359);
					variableDeclarator();
					}
					}
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arrayCreationExpression);
		int _la;
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				dimExprs();
				setState(1369);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1368);
					dims();
					}
				}

				setState(1373);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1371);
					match(Assign);
					setState(1372);
					bracedinitlist();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				dims();
				setState(1376);
				bracedinitlist();
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
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			dimExpr();
			setState(1384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381);
					dimExpr();
					}
					} 
				}
				setState(1386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(LeftBracket);
			setState(1388);
			expression(0);
			setState(1389);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
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
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public List<PtroperatorContext> ptroperator() {
			return getRuleContexts(PtroperatorContext.class);
		}
		public PtroperatorContext ptroperator(int i) {
			return getRuleContext(PtroperatorContext.class,i);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_variableDeclarator);
		int _la;
		try {
			int _alt;
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1391);
						ptroperator();
						}
						} 
					}
					setState(1396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1397);
				declaratorid();
				setState(1400);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1398);
					match(Assign);
					setState(1399);
					initializerclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1402);
						ptroperator();
						}
						} 
					}
					setState(1407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
				}
				setState(1408);
				declaratorid();
				setState(1409);
				dims();
				setState(1412);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1410);
					match(Assign);
					setState(1411);
					initializerclause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1414);
						ptroperator();
						}
						} 
					}
					setState(1419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1420);
				declaratorid();
				setState(1421);
				arrayCreationExpression();
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
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(LeftBracket);
			setState(1426);
			match(RightBracket);
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(1427);
				match(LeftBracket);
				setState(1428);
				match(RightBracket);
				}
				}
				setState(1433);
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

	public static class SimpledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_simpledeclaration);
		int _la;
		try {
			setState(1448);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1434);
					declspecifierseq();
					}
					break;
				}
				setState(1438);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1437);
					initdeclaratorlist();
					}
				}

				setState(1440);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				attributespecifierseq(0);
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1442);
					declspecifierseq();
					}
					break;
				}
				setState(1445);
				initdeclaratorlist();
				setState(1446);
				match(Semi);
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

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatic_assertdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(Static_assert);
			setState(1451);
			match(LeftParen);
			setState(1452);
			constantexpression();
			setState(1453);
			match(Comma);
			setState(1454);
			match(Stringliteral);
			setState(1455);
			match(RightParen);
			setState(1456);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEmptydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			attributespecifierseq(0);
			setState(1461);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public DeclspecifierwithouttypeContext declspecifierwithouttype() {
			return getRuleContext(DeclspecifierwithouttypeContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_declspecifier);
		try {
			setState(1465);
			switch (_input.LA(1)) {
			case Constexpr:
			case Explicit:
			case Extern:
			case Friend:
			case Inline:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
			case Typedef:
			case Virtual:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				declspecifierwithouttype();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				typespecifier();
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

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_declspecifierseq);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				declspecifier();
				setState(1469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1468);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				declspecifier();
				setState(1472);
				declspecifierseq();
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

	public static class DeclspecifierwithouttypeContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierwithouttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierwithouttype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifierwithouttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierwithouttypeContext declspecifierwithouttype() throws RecognitionException {
		DeclspecifierwithouttypeContext _localctx = new DeclspecifierwithouttypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_declspecifierwithouttype);
		try {
			setState(1481);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				storageclassspecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 3);
				{
				setState(1478);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 4);
				{
				setState(1479);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 5);
				{
				setState(1480);
				match(Constexpr);
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

	public static class DeclspecifierseqwithouttypeContext extends ParserRuleContext {
		public DeclspecifierwithouttypeContext declspecifierwithouttype() {
			return getRuleContext(DeclspecifierwithouttypeContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqwithouttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseqwithouttype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifierseqwithouttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierseqwithouttypeContext declspecifierseqwithouttype() throws RecognitionException {
		DeclspecifierseqwithouttypeContext _localctx = new DeclspecifierseqwithouttypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_declspecifierseqwithouttype);
		int _la;
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				declspecifierwithouttype();
				setState(1485);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1484);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				declspecifierwithouttype();
				setState(1488);
				declspecifierseq();
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

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStorageclassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Extern) | (1L << Mutable) | (1L << Register) | (1L << Static) | (1L << Thread_local))) != 0)) ) {
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

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (Explicit - 26)) | (1L << (Inline - 26)) | (1L << (Virtual - 26)))) != 0)) ) {
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

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypedefname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
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

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public MyclassspecifierContext myclassspecifier() {
			return getRuleContext(MyclassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typespecifier);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				myclassspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
				enumspecifier();
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

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingtypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_trailingtypespecifier);
		try {
			setState(1507);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1505);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1506);
				cvqualifier();
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

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_typespecifierseq);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				typespecifier();
				setState(1511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1510);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				typespecifier();
				setState(1514);
				typespecifierseq();
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

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingtypespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_trailingtypespecifierseq);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				trailingtypespecifier();
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1519);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				trailingtypespecifier();
				setState(1523);
				trailingtypespecifierseq();
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

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpletypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_simpletypespecifier);
		try {
			setState(1550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1527);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1530);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				nestednamespecifier(0);
				setState(1532);
				match(Template);
				setState(1533);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1536);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1537);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1538);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1539);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1540);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1541);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1542);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1543);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1544);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1545);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1546);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1547);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1548);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1549);
				decltypespecifier();
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

	public static class TypenameContext extends ParserRuleContext {
		public MyclassnameContext myclassname() {
			return getRuleContext(MyclassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typename);
		try {
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1552);
				myclassname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1555);
				simpletemplateid();
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

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDecltypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_decltypespecifier);
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(Decltype);
				setState(1559);
				match(LeftParen);
				setState(1560);
				expression(0);
				setState(1561);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(Decltype);
				setState(1564);
				match(LeftParen);
				setState(1565);
				match(Auto);
				setState(1566);
				match(RightParen);
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

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitElaboratedtypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				classkey();
				setState(1571);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1570);
					attributespecifierseq(0);
					}
				}

				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1573);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1576);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				classkey();
				setState(1579);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1581);
				classkey();
				setState(1582);
				nestednamespecifier(0);
				setState(1584);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1583);
					match(Template);
					}
				}

				setState(1586);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1588);
				match(Enum);
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1589);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1592);
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

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
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

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumspecifier);
		int _la;
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597);
				enumhead();
				setState(1598);
				match(LeftBrace);
				setState(1600);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1599);
					enumeratorlist(0);
					}
				}

				setState(1602);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				enumhead();
				setState(1605);
				match(LeftBrace);
				setState(1606);
				enumeratorlist(0);
				setState(1607);
				match(Comma);
				setState(1608);
				match(RightBrace);
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

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumhead);
		int _la;
		try {
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				enumkey();
				setState(1614);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1613);
					attributespecifierseq(0);
					}
				}

				setState(1617);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1616);
					match(Identifier);
					}
				}

				setState(1620);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1619);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				enumkey();
				setState(1624);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1623);
					attributespecifierseq(0);
					}
				}

				setState(1626);
				nestednamespecifier(0);
				setState(1627);
				match(Identifier);
				setState(1629);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1628);
					enumbase();
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

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOpaqueenumdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			enumkey();
			setState(1635);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1634);
				attributespecifierseq(0);
				}
			}

			setState(1637);
			match(Identifier);
			setState(1639);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1638);
				enumbase();
				}
			}

			setState(1641);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_enumkey);
		try {
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				match(Enum);
				setState(1645);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1646);
				match(Enum);
				setState(1647);
				match(Struct);
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

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(Colon);
			setState(1651);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumeratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1654);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1657);
					match(Comma);
					setState(1658);
					enumeratordefinition();
					}
					} 
				}
				setState(1663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumeratordefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enumeratordefinition);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				enumerator();
				setState(1666);
				match(Assign);
				setState(1667);
				constantexpression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
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

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_namespacename);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				namespacealias();
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

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOriginalnamespacename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
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

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namespacedefinition);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1680);
				unnamednamespacedefinition();
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

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamednamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_namednamespacedefinition);
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				extensionnamespacedefinition();
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

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOriginalnamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1687);
				match(Inline);
				}
			}

			setState(1690);
			match(Namespace);
			setState(1691);
			match(Identifier);
			setState(1692);
			match(LeftBrace);
			setState(1693);
			namespacebody();
			setState(1694);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExtensionnamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1696);
				match(Inline);
				}
			}

			setState(1699);
			match(Namespace);
			setState(1700);
			originalnamespacename();
			setState(1701);
			match(LeftBrace);
			setState(1702);
			namespacebody();
			setState(1703);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnnamednamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1705);
				match(Inline);
				}
			}

			setState(1708);
			match(Namespace);
			setState(1709);
			match(LeftBrace);
			setState(1710);
			namespacebody();
			setState(1711);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1713);
				declarationseq(0);
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

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacealias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
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

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacealiasdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(Namespace);
			setState(1719);
			match(Identifier);
			setState(1720);
			match(Assign);
			setState(1721);
			qualifiednamespacespecifier();
			setState(1722);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1724);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1727);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUsingdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_usingdeclaration);
		int _la;
		try {
			setState(1742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				match(Using);
				setState(1731);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1730);
					match(Typename);
					}
				}

				setState(1733);
				nestednamespecifier(0);
				setState(1734);
				unqualifiedid();
				setState(1735);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				match(Using);
				setState(1738);
				match(Doublecolon);
				setState(1739);
				unqualifiedid();
				setState(1740);
				match(Semi);
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

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUsingdirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1744);
				attributespecifierseq(0);
				}
			}

			setState(1747);
			match(Using);
			setState(1748);
			match(Namespace);
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1749);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1752);
			namespacename();
			setState(1753);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAsmdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(Asm);
			setState(1756);
			match(LeftParen);
			setState(1757);
			match(Stringliteral);
			setState(1758);
			match(RightParen);
			setState(1759);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLinkagespecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_linkagespecification);
		int _la;
		try {
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(Extern);
				setState(1762);
				match(Stringliteral);
				setState(1763);
				match(LeftBrace);
				setState(1765);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1764);
					declarationseq(0);
					}
				}

				setState(1767);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1768);
				match(Extern);
				setState(1769);
				match(Stringliteral);
				setState(1770);
				declaration();
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

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1774);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1776);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1777);
					attributespecifier();
					}
					} 
				}
				setState(1782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_attributespecifier);
		try {
			setState(1790);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(LeftBracket);
				setState(1784);
				match(LeftBracket);
				setState(1785);
				attributelist(0);
				setState(1786);
				match(RightBracket);
				setState(1787);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				alignmentspecifier();
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

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				match(Alignas);
				setState(1793);
				match(LeftParen);
				setState(1794);
				typeid();
				setState(1796);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1795);
					match(Ellipsis);
					}
				}

				setState(1798);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
				match(Alignas);
				setState(1801);
				match(LeftParen);
				setState(1802);
				constantexpression();
				setState(1804);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1803);
					match(Ellipsis);
					}
				}

				setState(1806);
				match(RightParen);
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

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1811);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1814);
				attribute();
				setState(1815);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1829);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1819);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1820);
						match(Comma);
						setState(1822);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(1821);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1824);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1825);
						match(Comma);
						setState(1826);
						attribute();
						setState(1827);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1833);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			attributetoken();
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1835);
				attributeargumentclause();
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

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributetoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_attributetoken);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839);
				attributescopedtoken();
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

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributescopedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			attributenamespace();
			setState(1843);
			match(Doublecolon);
			setState(1844);
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

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributenamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
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

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributeargumentclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(LeftParen);
			setState(1849);
			balancedtokenseq(0);
			setState(1850);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBalancedtokenseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1853);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1856);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1857);
					balancedtoken();
					}
					} 
				}
				setState(1862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_balancedtoken);
		try {
			setState(1875);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				match(LeftParen);
				setState(1864);
				balancedtokenseq(0);
				setState(1865);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1867);
				match(LeftBracket);
				setState(1868);
				balancedtokenseq(0);
				setState(1869);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1871);
				match(LeftBrace);
				setState(1872);
				balancedtokenseq(0);
				setState(1873);
				match(RightBrace);
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

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public List<InitdeclaratorContext> initdeclarator() {
			return getRuleContexts(InitdeclaratorContext.class);
		}
		public InitdeclaratorContext initdeclarator(int i) {
			return getRuleContext(InitdeclaratorContext.class,i);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_initdeclaratorlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			initdeclarator();
			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1878);
				match(Comma);
				setState(1879);
				initdeclarator();
				}
				}
				setState(1884);
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

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initdeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			declarator();
			setState(1887);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBrace - 77)) | (1L << (Assign - 77)))) != 0)) {
				{
				setState(1886);
				initializer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_declarator);
		try {
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				noptrdeclarator(0);
				setState(1891);
				parametersandqualifiers();
				setState(1892);
				trailingreturntype();
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

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public List<PtroperatorContext> ptroperator() {
			return getRuleContexts(PtroperatorContext.class);
		}
		public PtroperatorContext ptroperator(int i) {
			return getRuleContext(PtroperatorContext.class,i);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ptrdeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1896);
					ptroperator();
					}
					} 
				}
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			setState(1902);
			noptrdeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1905);
				declaratorid();
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1906);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1909);
				match(LeftParen);
				setState(1910);
				ptrdeclarator();
				setState(1911);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1926);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1915);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1916);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1917);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1918);
						match(LeftBracket);
						setState(1920);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1919);
							constantexpression();
							}
						}

						setState(1922);
						match(RightBracket);
						setState(1924);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
						case 1:
							{
							setState(1923);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParametersandqualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(LeftParen);
			setState(1932);
			parameterdeclarationclause();
			setState(1933);
			match(RightParen);
			setState(1935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1934);
				cvqualifierseq();
				}
				break;
			}
			setState(1938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1937);
				refqualifier();
				}
				break;
			}
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1940);
				exceptionspecification();
				}
				break;
			}
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1943);
				attributespecifierseq(0);
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

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingreturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(Arrow);
			setState(1947);
			trailingtypespecifierseq();
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1948);
				abstractdeclarator();
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

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtroperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_ptroperator);
		try {
			setState(1974);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				match(Star);
				setState(1953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1952);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1955);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				match(And);
				setState(1960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1959);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1962);
				match(AndAnd);
				setState(1964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1963);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1966);
				nestednamespecifier(0);
				setState(1967);
				match(Star);
				setState(1969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1968);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1971);
					cvqualifierseq();
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

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			cvqualifier();
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1977);
				cvqualifierseq();
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

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCvqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
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

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
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

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1984);
				match(Ellipsis);
				}
			}

			setState(1987);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			typespecifierseq();
			setState(1991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1990);
				abstractdeclarator();
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

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAbstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_abstractdeclarator);
		try {
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1993);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1994);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1997);
				parametersandqualifiers();
				setState(1998);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2000);
				abstractpackdeclarator();
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

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_ptrabstractdeclarator);
		try {
			setState(2008);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				noptrabstractdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				ptroperator();
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2005);
					ptrabstractdeclarator();
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

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2011);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(2012);
				match(LeftBracket);
				setState(2014);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2013);
					constantexpression();
					}
				}

				setState(2016);
				match(RightBracket);
				setState(2018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(2017);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(2020);
				match(LeftParen);
				setState(2021);
				ptrabstractdeclarator();
				setState(2022);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2037);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(2026);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2027);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(2028);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2029);
						match(LeftBracket);
						setState(2031);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(2030);
							constantexpression();
							}
						}

						setState(2033);
						match(RightBracket);
						setState(2035);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
						case 1:
							{
							setState(2034);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
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

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAbstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_abstractpackdeclarator);
		try {
			setState(2046);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(2042);
				noptrabstractpackdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				ptroperator();
				setState(2044);
				abstractpackdeclarator();
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

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrabstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2049);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(2064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2062);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2051);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2052);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2053);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2054);
						match(LeftBracket);
						setState(2056);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(2055);
							constantexpression();
							}
						}

						setState(2058);
						match(RightBracket);
						setState(2060);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
						case 1:
							{
							setState(2059);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclarationclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2067);
					parameterdeclarationlist(0);
					}
				}

				setState(2071);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2070);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2073);
				parameterdeclarationlist(0);
				setState(2074);
				match(Comma);
				setState(2075);
				match(Ellipsis);
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

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2080);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(2087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(2082);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2083);
					match(Comma);
					setState(2084);
					parameterdeclaration();
					}
					} 
				}
				setState(2089);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2091);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2090);
					attributespecifierseq(0);
					}
				}

				setState(2093);
				declspecifierseq();
				setState(2094);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2096);
					attributespecifierseq(0);
					}
				}

				setState(2099);
				declspecifierseq();
				setState(2100);
				declarator();
				setState(2101);
				match(Assign);
				setState(2102);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2105);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2104);
					attributespecifierseq(0);
					}
				}

				setState(2107);
				declspecifierseq();
				setState(2109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2108);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2112);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2111);
					attributespecifierseq(0);
					}
				}

				setState(2114);
				declspecifierseq();
				setState(2116);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2115);
					abstractdeclarator();
					}
				}

				setState(2118);
				match(Assign);
				setState(2119);
				initializerclause();
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public FunctionheaderContext functionheader() {
			return getRuleContext(FunctionheaderContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqwithouttypeContext declspecifierseqwithouttype() {
			return getRuleContext(DeclspecifierseqwithouttypeContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiondefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2123);
				attributespecifierseq(0);
				}
			}

			setState(2127);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(2126);
				declspecifierseqwithouttype();
				}
			}

			setState(2129);
			functionheader();
			setState(2131);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2130);
				virtspecifierseq(0);
				}
			}

			setState(2133);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionheaderContext extends ParserRuleContext {
		public FunctiondeclaratorContext functiondeclarator() {
			return getRuleContext(FunctiondeclaratorContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionheader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionheaderContext functionheader() throws RecognitionException {
		FunctionheaderContext _localctx = new FunctionheaderContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_functionheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2135);
				typespecifier();
				}
				break;
			}
			setState(2138);
			functiondeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public FunctiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiondeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclaratorContext functiondeclarator() throws RecognitionException {
		FunctiondeclaratorContext _localctx = new FunctiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_functiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			declaratorid();
			setState(2141);
			match(LeftParen);
			setState(2142);
			parameterdeclarationclause();
			setState(2143);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_functionbody);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2146);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2145);
					ctorinitializer();
					}
				}

				setState(2148);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2149);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2150);
				match(Assign);
				setState(2151);
				match(Default);
				setState(2152);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2153);
				match(Assign);
				setState(2154);
				match(Delete);
				setState(2155);
				match(Semi);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_initializer);
		try {
			setState(2163);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2158);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2159);
				match(LeftParen);
				setState(2160);
				expressionlist();
				setState(2161);
				match(RightParen);
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

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBraceorequalinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_braceorequalinitializer);
		try {
			setState(2168);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				match(Assign);
				setState(2166);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167);
				bracedinitlist();
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

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializerclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_initializerclause);
		try {
			setState(2172);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Booleanliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				bracedinitlist();
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

	public static class InitializerlistContext extends ParserRuleContext {
		public List<InitializerclauseContext> initializerclause() {
			return getRuleContexts(InitializerclauseContext.class);
		}
		public InitializerclauseContext initializerclause(int i) {
			return getRuleContext(InitializerclauseContext.class,i);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializerlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_initializerlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			initializerclause();
			setState(2179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2175);
					match(Comma);
					setState(2176);
					initializerclause();
					}
					} 
				}
				setState(2181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBracedinitlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_bracedinitlist);
		int _la;
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				match(LeftBrace);
				setState(2183);
				initializerlist();
				setState(2185);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2184);
					match(Comma);
					}
				}

				setState(2187);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2189);
				match(LeftBrace);
				setState(2190);
				match(RightBrace);
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

	public static class MyclassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public MyclassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myclassname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMyclassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyclassnameContext myclassname() throws RecognitionException {
		MyclassnameContext _localctx = new MyclassnameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_myclassname);
		try {
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2193);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				simpletemplateid();
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

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_classspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			classhead();
			setState(2198);
			classbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassbodyContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			match(LeftBrace);
			setState(2202);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(2201);
				memberspecification();
				}
			}

			setState(2204);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClasshead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_classhead);
		int _la;
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				classkey();
				setState(2208);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2207);
					attributespecifierseq(0);
					}
				}

				setState(2211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2210);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2213);
				classheadname();
				setState(2215);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2214);
					classvirtspecifier();
					}
				}

				setState(2218);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2217);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2220);
				classkey();
				setState(2222);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2221);
					attributespecifierseq(0);
					}
				}

				setState(2225);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2224);
					baseclause();
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

	public static class ClassheadnameContext extends ParserRuleContext {
		public MyclassnameContext myclassname() {
			return getRuleContext(MyclassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassheadname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2229);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2232);
			myclassname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassvirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClasskey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Class - 13)) | (1L << (Struct - 13)) | (1L << (Union - 13)))) != 0)) ) {
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

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_memberspecification);
		int _la;
		try {
			setState(2247);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftBracket:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				memberdeclaration();
				setState(2240);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2239);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				accessspecifier();
				setState(2243);
				match(Colon);
				setState(2245);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2244);
					memberspecification();
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

	public static class MemberdeclarationContext extends ParserRuleContext {
		public MembervariabledeclarationstatementContext membervariabledeclarationstatement() {
			return getRuleContext(MembervariabledeclarationstatementContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_memberdeclaration);
		try {
			setState(2256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2249);
				membervariabledeclarationstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2250);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2251);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2252);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2253);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2254);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2255);
				emptydeclaration();
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

	public static class MembervariabledeclarationstatementContext extends ParserRuleContext {
		public MembervariabledeclarationContext membervariabledeclaration() {
			return getRuleContext(MembervariabledeclarationContext.class,0);
		}
		public MembervariabledeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membervariabledeclarationstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMembervariabledeclarationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembervariabledeclarationstatementContext membervariabledeclarationstatement() throws RecognitionException {
		MembervariabledeclarationstatementContext _localctx = new MembervariabledeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_membervariabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			membervariabledeclaration();
			setState(2259);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembervariabledeclarationContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqwithouttypeContext declspecifierseqwithouttype() {
			return getRuleContext(DeclspecifierseqwithouttypeContext.class,0);
		}
		public List<PtroperatorContext> ptroperator() {
			return getRuleContexts(PtroperatorContext.class);
		}
		public PtroperatorContext ptroperator(int i) {
			return getRuleContext(PtroperatorContext.class,i);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MembervariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membervariabledeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMembervariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembervariabledeclarationContext membervariabledeclaration() throws RecognitionException {
		MembervariabledeclarationContext _localctx = new MembervariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_membervariabledeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2261);
				attributespecifierseq(0);
				}
			}

			setState(2265);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(2264);
				declspecifierseqwithouttype();
				}
			}

			setState(2267);
			typespecifier();
			setState(2271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2268);
					ptroperator();
					}
					} 
				}
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			setState(2275);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftBracket - 79)) | (1L << (Tilde - 79)) | (1L << (Colon - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(2274);
				memberdeclaratorlist(0);
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

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 358;
		enterRecursionRule(_localctx, 358, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2278);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2281);
					match(Comma);
					setState(2282);
					memberdeclarator();
					}
					} 
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
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

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_memberdeclarator);
		int _la;
		try {
			setState(2312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2288);
				declaratorid();
				setState(2290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2289);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2292);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2295);
				declaratorid();
				setState(2298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2296);
					match(Assign);
					setState(2297);
					initializerclause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2300);
				declaratorid();
				setState(2302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2301);
					bracedinitlist();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2305);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2304);
					match(Identifier);
					}
				}

				setState(2308);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2307);
					attributespecifierseq(0);
					}
				}

				setState(2310);
				match(Colon);
				setState(2311);
				constantexpression();
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

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVirtspecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 362;
		enterRecursionRule(_localctx, 362, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2315);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2318);
					virtspecifier();
					}
					} 
				}
				setState(2323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
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

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
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

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPurespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			match(Assign);
			setState(2327);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBaseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(Colon);
			setState(2331);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasespecifierlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 370;
		enterRecursionRule(_localctx, 370, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2334);
			basespecifier();
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2335);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2339);
					match(Comma);
					setState(2340);
					basespecifier();
					setState(2342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
					case 1:
						{
						setState(2341);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2348);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_basespecifier);
		int _la;
		try {
			setState(2370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2350);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2349);
					attributespecifierseq(0);
					}
				}

				setState(2352);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2354);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2353);
					attributespecifierseq(0);
					}
				}

				setState(2356);
				match(Virtual);
				setState(2358);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2357);
					accessspecifier();
					}
				}

				setState(2360);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2362);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2361);
					attributespecifierseq(0);
					}
				}

				setState(2364);
				accessspecifier();
				setState(2366);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2365);
					match(Virtual);
					}
				}

				setState(2368);
				basetypespecifier();
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

	public static class ClassordecltypeContext extends ParserRuleContext {
		public MyclassnameContext myclassname() {
			return getRuleContext(MyclassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassordecltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classordecltype);
		try {
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2372);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2375);
				myclassname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				decltypespecifier();
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

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasetypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAccessspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
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

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversionfunctionid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(Operator);
			setState(2384);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversiontypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			typespecifierseq();
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2387);
				conversiondeclarator();
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

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversiondeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			ptroperator();
			setState(2392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2391);
				conversiondeclarator();
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

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCtorinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			match(Colon);
			setState(2395);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializerlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_meminitializerlist);
		int _la;
		try {
			setState(2408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2397);
				meminitializer();
				setState(2399);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2398);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2401);
				meminitializer();
				setState(2403);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2402);
					match(Ellipsis);
					}
				}

				setState(2405);
				match(Comma);
				setState(2406);
				meminitializerlist();
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

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_meminitializer);
		int _la;
		try {
			setState(2420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2410);
				meminitializerid();
				setState(2411);
				match(LeftParen);
				setState(2413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2412);
					expressionlist();
					}
				}

				setState(2415);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				meminitializerid();
				setState(2418);
				bracedinitlist();
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_meminitializerid);
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2422);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2423);
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

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOperatorfunctionid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			match(Operator);
			setState(2427);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLiteraloperatorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_literaloperatorid);
		try {
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2429);
				match(Operator);
				setState(2430);
				match(Stringliteral);
				setState(2431);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				match(Operator);
				setState(2433);
				match(Userdefinedstringliteral);
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

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplatedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(Template);
			setState(2437);
			match(Less);
			setState(2438);
			templateparameterlist(0);
			setState(2439);
			match(Greater);
			setState(2440);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateparameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2443);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2445);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2446);
					match(Comma);
					setState(2447);
					templateparameter();
					}
					} 
				}
				setState(2452);
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

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_templateparameter);
		try {
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2454);
				parameterdeclaration();
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

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_typeparameter);
		int _la;
		try {
			setState(2505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457);
				match(Class);
				setState(2459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2458);
					match(Ellipsis);
					}
					break;
				}
				setState(2462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2461);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				match(Class);
				setState(2466);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2465);
					match(Identifier);
					}
				}

				setState(2468);
				match(Assign);
				setState(2469);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2470);
				match(Typename);
				setState(2472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2471);
					match(Ellipsis);
					}
					break;
				}
				setState(2475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2474);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2477);
				match(Typename);
				setState(2479);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2478);
					match(Identifier);
					}
				}

				setState(2481);
				match(Assign);
				setState(2482);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2483);
				match(Template);
				setState(2484);
				match(Less);
				setState(2485);
				templateparameterlist(0);
				setState(2486);
				match(Greater);
				setState(2487);
				match(Class);
				setState(2489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2488);
					match(Ellipsis);
					}
					break;
				}
				setState(2492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2491);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2494);
				match(Template);
				setState(2495);
				match(Less);
				setState(2496);
				templateparameterlist(0);
				setState(2497);
				match(Greater);
				setState(2498);
				match(Class);
				setState(2500);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2499);
					match(Identifier);
					}
				}

				setState(2502);
				match(Assign);
				setState(2503);
				idexpression();
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

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpletemplateid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2507);
			templatename();
			setState(2508);
			match(Less);
			setState(2510);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2509);
				templateargumentlist(0);
				}
			}

			setState(2512);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_templateid);
		int _la;
		try {
			setState(2529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2514);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2515);
				operatorfunctionid();
				setState(2516);
				match(Less);
				setState(2518);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2517);
					templateargumentlist(0);
					}
				}

				setState(2520);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2522);
				literaloperatorid();
				setState(2523);
				match(Less);
				setState(2525);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2524);
					templateargumentlist(0);
					}
				}

				setState(2527);
				match(Greater);
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

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplatename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2531);
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

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateargumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2534);
			templateargument();
			setState(2536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2535);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2538);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2539);
					match(Comma);
					setState(2540);
					templateargument();
					setState(2542);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
					case 1:
						{
						setState(2541);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
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

	public static class TemplateargumentContext extends ParserRuleContext {
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateargument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_templateargument);
		try {
			setState(2552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2549);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2550);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2551);
				idexpression();
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

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypenamespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_typenamespecifier);
		int _la;
		try {
			setState(2565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2554);
				match(Typename);
				setState(2555);
				nestednamespecifier(0);
				setState(2556);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2558);
				match(Typename);
				setState(2559);
				nestednamespecifier(0);
				setState(2561);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2560);
					match(Template);
					}
				}

				setState(2563);
				simpletemplateid();
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

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExplicitinstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2567);
				match(Extern);
				}
			}

			setState(2570);
			match(Template);
			setState(2571);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExplicitspecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2573);
			match(Template);
			setState(2574);
			match(Less);
			setState(2575);
			match(Greater);
			setState(2576);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			match(Try);
			setState(2579);
			compoundstatement();
			setState(2580);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiontryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
			match(Try);
			setState(2584);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2583);
				ctorinitializer();
				}
			}

			setState(2586);
			compoundstatement();
			setState(2587);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitHandlerseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2589);
			handler();
			setState(2591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2590);
				handlerseq();
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

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2593);
			match(Catch);
			setState(2594);
			match(LeftParen);
			setState(2595);
			exceptiondeclaration();
			setState(2596);
			match(RightParen);
			setState(2597);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExceptiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2599);
					attributespecifierseq(0);
					}
				}

				setState(2602);
				typespecifierseq();
				setState(2603);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2606);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2605);
					attributespecifierseq(0);
					}
				}

				setState(2608);
				typespecifierseq();
				setState(2610);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2609);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2612);
				match(Ellipsis);
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

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitThrowexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			match(Throw);
			setState(2617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2616);
				assignmentexpression();
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

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_exceptionspecification);
		try {
			setState(2621);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2619);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2620);
				noexceptspecification();
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

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDynamicexceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			match(Throw);
			setState(2624);
			match(LeftParen);
			setState(2626);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2625);
				typeidlist(0);
				}
			}

			setState(2628);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeidlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2631);
			typeid();
			setState(2633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2632);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2635);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2636);
					match(Comma);
					setState(2637);
					typeid();
					setState(2639);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
					case 1:
						{
						setState(2638);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
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

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoexceptspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_noexceptspecification);
		try {
			setState(2652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2646);
				match(Noexcept);
				setState(2647);
				match(LeftParen);
				setState(2648);
				constantexpression();
				setState(2649);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2651);
				match(Noexcept);
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

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRightShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			match(Greater);
			setState(2655);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRightShiftAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(Greater);
			setState(2658);
			match(Greater);
			setState(2659);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_operator);
		try {
			setState(2709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2662);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2663);
				match(New);
				setState(2664);
				match(LeftBracket);
				setState(2665);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2666);
				match(Delete);
				setState(2667);
				match(LeftBracket);
				setState(2668);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2669);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2670);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2671);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2672);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2673);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2674);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2675);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2676);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2677);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2678);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2679);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2680);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2681);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2682);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2683);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2684);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2685);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2686);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2687);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2688);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2689);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2690);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2691);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2692);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2693);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2694);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2695);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2696);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2697);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2698);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2699);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2700);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2701);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2702);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2703);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2704);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2705);
				match(LeftParen);
				setState(2706);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2707);
				match(LeftBracket);
				setState(2708);
				match(RightBracket);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerliteralContext integerliteral() {
			return getRuleContext(IntegerliteralContext.class,0);
		}
		public CharacterliteralContext characterliteral() {
			return getRuleContext(CharacterliteralContext.class,0);
		}
		public FloatingliteralContext floatingliteral() {
			return getRuleContext(FloatingliteralContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_literal);
		try {
			setState(2718);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2711);
				integerliteral();
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2712);
				characterliteral();
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2713);
				floatingliteral();
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2714);
				stringliteral();
				}
				break;
			case Booleanliteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2715);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2716);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2717);
				userdefinedliteral();
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

	public static class IntegerliteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public IntegerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIntegerliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerliteralContext integerliteral() throws RecognitionException {
		IntegerliteralContext _localctx = new IntegerliteralContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_integerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2720);
			match(Integerliteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterliteralContext extends ParserRuleContext {
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public CharacterliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCharacterliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterliteralContext characterliteral() throws RecognitionException {
		CharacterliteralContext _localctx = new CharacterliteralContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_characterliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2722);
			match(Characterliteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingliteralContext extends ParserRuleContext {
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public FloatingliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFloatingliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingliteralContext floatingliteral() throws RecognitionException {
		FloatingliteralContext _localctx = new FloatingliteralContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_floatingliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			match(Floatingliteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringliteralContext extends ParserRuleContext {
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2726);
			match(Stringliteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode Booleanliteral() { return getToken(CPP14Parser.Booleanliteral, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBooleanliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_booleanliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2728);
			match(Booleanliteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPointerliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2730);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUserdefinedliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (Userdefinedintegerliteral - 135)) | (1L << (Userdefinedfloatingliteral - 135)) | (1L << (Userdefinedstringliteral - 135)) | (1L << (Userdefinedcharacterliteral - 135)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 11:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 17:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 27:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 32:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 33:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 34:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 35:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 36:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 37:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 38:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 39:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 40:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 41:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 42:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 68:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 109:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 127:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 130:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 136:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 142:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 153:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 155:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 157:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 179:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 181:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 185:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 200:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 206:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 219:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
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
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 3);
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 3);
		case 41:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 5);
		case 43:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 3);
		case 45:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0ab1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u00e8\4\u00e9\t\u00e9\3\2\5\2\u01d4\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u01de\n\3\3\4\3\4\5\4\u01e2\n\4\3\5\3\5\5\5\u01e6\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01f1\n\6\3\7\3\7\5\7\u01f5\n\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0204\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u020b\n\b\3\b\3\b\3\b\7\b\u0210\n\b\f\b\16\b\u0213\13\b"+
		"\3\t\3\t\5\t\u0217\n\t\3\t\3\t\3\n\3\n\5\n\u021d\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0227\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u022e\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0234\n\r\7\r\u0236\n\r\f\r\16\r\u0239\13\r\3\16"+
		"\3\16\5\16\u023d\n\16\3\17\3\17\3\17\3\17\5\17\u0243\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u024a\n\20\3\21\3\21\3\21\3\21\5\21\u0250\n\21\3\21"+
		"\5\21\u0253\n\21\3\21\5\21\u0256\n\21\3\21\5\21\u0259\n\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0262\n\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0269\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u029d\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02ac"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u02b2\n\23\3\23\3\23\3\23\3\23\5\23\u02b8"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u02c5"+
		"\n\23\f\23\16\23\u02c8\13\23\3\24\3\24\3\25\5\25\u02cd\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02dc\n\25"+
		"\3\25\3\25\3\25\3\25\5\25\u02e2\n\25\3\26\3\26\3\26\3\26\5\26\u02e8\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0303"+
		"\n\27\3\30\3\30\3\31\5\31\u0308\n\31\3\31\3\31\5\31\u030c\n\31\3\31\3"+
		"\31\5\31\u0310\n\31\3\31\5\31\u0313\n\31\3\31\3\31\5\31\u0317\n\31\3\31"+
		"\3\31\3\31\3\31\5\31\u031d\n\31\5\31\u031f\n\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\5\33\u0327\n\33\3\34\3\34\5\34\u032b\n\34\3\34\5\34\u032e\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0335\n\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u033c\n\35\7\35\u033e\n\35\f\35\16\35\u0341\13\35\3\36\3\36\5\36\u0345"+
		"\n\36\3\36\3\36\5\36\u0349\n\36\3\37\5\37\u034c\n\37\3\37\3\37\3\37\5"+
		"\37\u0351\n\37\3\37\3\37\3\37\3\37\5\37\u0357\n\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\5!\u0364\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u036f"+
		"\n\"\f\"\16\"\u0372\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0380"+
		"\n#\f#\16#\u0383\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u038e\n$\f$\16$\u0391"+
		"\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u039d\n%\f%\16%\u03a0\13%\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u03b1\n&\f&\16&\u03b4\13&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03bf\n\'\f\'\16\'\u03c2\13\'\3"+
		"(\3(\3(\3(\3(\3(\7(\u03ca\n(\f(\16(\u03cd\13(\3)\3)\3)\3)\3)\3)\7)\u03d5"+
		"\n)\f)\16)\u03d8\13)\3*\3*\3*\3*\3*\3*\7*\u03e0\n*\f*\16*\u03e3\13*\3"+
		"+\3+\3+\3+\3+\3+\7+\u03eb\n+\f+\16+\u03ee\13+\3,\3,\3,\3,\3,\3,\7,\u03f6"+
		"\n,\f,\16,\u03f9\13,\3-\3-\3-\3-\3-\3-\3-\5-\u0402\n-\3.\3.\3.\3.\3.\3"+
		".\5.\u040a\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0417\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\7\60\u041f\n\60\f\60\16\60\u0422\13\60\3\61\3\61\3"+
		"\62\3\62\5\62\u0428\n\62\3\62\3\62\5\62\u042c\n\62\3\62\3\62\5\62\u0430"+
		"\n\62\3\62\3\62\5\62\u0434\n\62\3\62\3\62\5\62\u0438\n\62\3\62\3\62\5"+
		"\62\u043c\n\62\3\62\3\62\5\62\u0440\n\62\3\62\3\62\5\62\u0444\n\62\3\62"+
		"\3\62\5\62\u0448\n\62\3\62\3\62\5\62\u044c\n\62\3\62\3\62\5\62\u0450\n"+
		"\62\3\62\3\62\3\62\3\62\5\62\u0456\n\62\3\62\5\62\u0459\n\62\3\63\5\63"+
		"\u045c\n\63\3\63\3\63\3\63\3\63\5\63\u0462\n\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u046a\n\63\3\63\3\63\3\63\5\63\u046f\n\63\3\64\5\64\u0472"+
		"\n\64\3\64\3\64\3\65\3\65\5\65\u0478\n\65\3\65\3\65\3\66\3\66\7\66\u047e"+
		"\n\66\f\66\16\66\u0481\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u0491\n\67\38\38\38\38\38\38\39\39\5"+
		"9\u049b\n9\39\39\39\39\39\39\59\u04a3\n9\39\39\39\39\59\u04a9\n9\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\5<\u04bd\n<\3<\3<\5"+
		"<\u04c1\n<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\5>\u04d1\n>\3?\5"+
		"?\u04d4\n?\3?\3?\3?\3@\3@\5@\u04db\n@\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3"+
		"D\3D\5D\u04e9\nD\3D\3D\3D\3D\3D\5D\u04f0\nD\3E\3E\5E\u04f4\nE\3F\3F\3"+
		"F\3F\3F\7F\u04fb\nF\fF\16F\u04fe\13F\3G\5G\u0501\nG\3H\3H\3H\3H\3H\3H"+
		"\3I\3I\5I\u050b\nI\3I\5I\u050e\nI\3I\3I\5I\u0512\nI\3I\5I\u0515\nI\3I"+
		"\3I\5I\u0519\nI\3I\5I\u051c\nI\5I\u051e\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\5J\u052a\nJ\3K\3K\3K\3K\3K\3K\3K\5K\u0533\nK\3L\3L\5L\u0537\nL\3M"+
		"\3M\3M\5M\u053c\nM\3M\3M\3M\3M\3N\3N\3N\3O\5O\u0546\nO\3O\5O\u0549\nO"+
		"\3O\3O\5O\u054d\nO\3P\3P\3P\3P\7P\u0553\nP\fP\16P\u0556\13P\5P\u0558\n"+
		"P\3Q\3Q\5Q\u055c\nQ\3Q\3Q\5Q\u0560\nQ\3Q\3Q\3Q\5Q\u0565\nQ\3R\3R\7R\u0569"+
		"\nR\fR\16R\u056c\13R\3S\3S\3S\3S\3T\7T\u0573\nT\fT\16T\u0576\13T\3T\3"+
		"T\3T\5T\u057b\nT\3T\7T\u057e\nT\fT\16T\u0581\13T\3T\3T\3T\3T\5T\u0587"+
		"\nT\3T\7T\u058a\nT\fT\16T\u058d\13T\3T\3T\3T\5T\u0592\nT\3U\3U\3U\3U\7"+
		"U\u0598\nU\fU\16U\u059b\13U\3V\5V\u059e\nV\3V\5V\u05a1\nV\3V\3V\3V\5V"+
		"\u05a6\nV\3V\3V\3V\5V\u05ab\nV\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3Y\3Y\3Y"+
		"\3Z\3Z\5Z\u05bc\nZ\3[\3[\5[\u05c0\n[\3[\3[\3[\5[\u05c5\n[\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u05cc\n\\\3]\3]\5]\u05d0\n]\3]\3]\3]\5]\u05d5\n]\3^\3^\3"+
		"_\3_\3`\3`\3a\3a\3a\5a\u05e0\na\3b\3b\3b\3b\5b\u05e6\nb\3c\3c\5c\u05ea"+
		"\nc\3c\3c\3c\5c\u05ef\nc\3d\3d\5d\u05f3\nd\3d\3d\3d\5d\u05f8\nd\3e\5e"+
		"\u05fb\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\5e\u0611\ne\3f\3f\3f\3f\5f\u0617\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0622"+
		"\ng\3h\3h\5h\u0626\nh\3h\5h\u0629\nh\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0633"+
		"\nh\3h\3h\3h\3h\5h\u0639\nh\3h\5h\u063c\nh\3i\3i\3j\3j\3j\5j\u0643\nj"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\5j\u064d\nj\3k\3k\5k\u0651\nk\3k\5k\u0654\nk"+
		"\3k\5k\u0657\nk\3k\3k\5k\u065b\nk\3k\3k\3k\5k\u0660\nk\5k\u0662\nk\3l"+
		"\3l\5l\u0666\nl\3l\3l\5l\u066a\nl\3l\3l\3m\3m\3m\3m\3m\5m\u0673\nm\3n"+
		"\3n\3n\3o\3o\3o\3o\3o\3o\7o\u067e\no\fo\16o\u0681\13o\3p\3p\3p\3p\3p\5"+
		"p\u0688\np\3q\3q\3r\3r\5r\u068e\nr\3s\3s\3t\3t\5t\u0694\nt\3u\3u\5u\u0698"+
		"\nu\3v\5v\u069b\nv\3v\3v\3v\3v\3v\3v\3w\5w\u06a4\nw\3w\3w\3w\3w\3w\3w"+
		"\3x\5x\u06ad\nx\3x\3x\3x\3x\3x\3y\5y\u06b5\ny\3z\3z\3{\3{\3{\3{\3{\3{"+
		"\3|\5|\u06c0\n|\3|\3|\3}\3}\5}\u06c6\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}"+
		"\u06d1\n}\3~\5~\u06d4\n~\3~\3~\3~\5~\u06d9\n~\3~\3~\3~\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06e8\n\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06ee\n\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u06f5\n\u0081\f\u0081\16\u0081\u06f8"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u0701\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0707\n\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u070f\n\u0083\3"+
		"\u0083\3\u0083\5\u0083\u0713\n\u0083\3\u0084\3\u0084\5\u0084\u0717\n\u0084"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u071c\n\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0721\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u0728\n\u0084\f\u0084\16\u0084\u072b\13\u0084\3\u0085\3\u0085\5\u0085"+
		"\u072f\n\u0085\3\u0086\3\u0086\5\u0086\u0733\n\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\5\u008a\u0741\n\u008a\3\u008a\3\u008a\7\u008a\u0745\n\u008a\f"+
		"\u008a\16\u008a\u0748\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0756"+
		"\n\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u075b\n\u008c\f\u008c\16\u008c"+
		"\u075e\13\u008c\3\u008d\3\u008d\5\u008d\u0762\n\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u0769\n\u008e\3\u008f\7\u008f\u076c\n"+
		"\u008f\f\u008f\16\u008f\u076f\13\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0776\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u077c\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0783\n"+
		"\u0090\3\u0090\3\u0090\5\u0090\u0787\n\u0090\7\u0090\u0789\n\u0090\f\u0090"+
		"\16\u0090\u078c\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0792"+
		"\n\u0091\3\u0091\5\u0091\u0795\n\u0091\3\u0091\5\u0091\u0798\n\u0091\3"+
		"\u0091\5\u0091\u079b\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u07a0\n\u0092"+
		"\3\u0093\3\u0093\5\u0093\u07a4\n\u0093\3\u0093\5\u0093\u07a7\n\u0093\3"+
		"\u0093\3\u0093\5\u0093\u07ab\n\u0093\3\u0093\3\u0093\5\u0093\u07af\n\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u07b4\n\u0093\3\u0093\5\u0093\u07b7\n"+
		"\u0093\5\u0093\u07b9\n\u0093\3\u0094\3\u0094\5\u0094\u07bd\n\u0094\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0097\5\u0097\u07c4\n\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\5\u0098\u07ca\n\u0098\3\u0099\3\u0099\5\u0099\u07ce\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u07d4\n\u0099\3\u009a\3"+
		"\u009a\3\u009a\5\u009a\u07d9\n\u009a\5\u009a\u07db\n\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u07e1\n\u009b\3\u009b\3\u009b\5\u009b\u07e5\n"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u07eb\n\u009b\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u07f2\n\u009b\3\u009b\3\u009b\5"+
		"\u009b\u07f6\n\u009b\7\u009b\u07f8\n\u009b\f\u009b\16\u009b\u07fb\13\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0801\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u080b\n\u009d"+
		"\3\u009d\3\u009d\5\u009d\u080f\n\u009d\7\u009d\u0811\n\u009d\f\u009d\16"+
		"\u009d\u0814\13\u009d\3\u009e\5\u009e\u0817\n\u009e\3\u009e\5\u009e\u081a"+
		"\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0820\n\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u0828\n\u009f\f\u009f"+
		"\16\u009f\u082b\13\u009f\3\u00a0\5\u00a0\u082e\n\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u0834\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u083c\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0840\n"+
		"\u00a0\3\u00a0\5\u00a0\u0843\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0847\n\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u084c\n\u00a0\3\u00a1\5\u00a1\u084f\n"+
		"\u00a1\3\u00a1\5\u00a1\u0852\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u0856\n\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a2\5\u00a2\u085b\n\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\5\u00a4\u0865\n\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u086f"+
		"\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0876\n\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u087b\n\u00a6\3\u00a7\3\u00a7\5\u00a7"+
		"\u087f\n\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0884\n\u00a8\f\u00a8\16"+
		"\u00a8\u0887\13\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u088c\n\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0892\n\u00a9\3\u00aa\3\u00aa\5"+
		"\u00aa\u0896\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\5\u00ac\u089d"+
		"\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u08a3\n\u00ad\3\u00ad"+
		"\5\u00ad\u08a6\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u08aa\n\u00ad\3\u00ad\5"+
		"\u00ad\u08ad\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u08b1\n\u00ad\3\u00ad\5\u00ad"+
		"\u08b4\n\u00ad\5\u00ad\u08b6\n\u00ad\3\u00ae\5\u00ae\u08b9\n\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u08c3"+
		"\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u08c8\n\u00b1\5\u00b1\u08ca\n"+
		"\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u08d3\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\5\u00b4\u08d9\n\u00b4\3"+
		"\u00b4\5\u00b4\u08dc\n\u00b4\3\u00b4\3\u00b4\7\u00b4\u08e0\n\u00b4\f\u00b4"+
		"\16\u00b4\u08e3\13\u00b4\3\u00b4\5\u00b4\u08e6\n\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u08ee\n\u00b5\f\u00b5\16\u00b5"+
		"\u08f1\13\u00b5\3\u00b6\3\u00b6\5\u00b6\u08f5\n\u00b6\3\u00b6\5\u00b6"+
		"\u08f8\n\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u08fd\n\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u0901\n\u00b6\3\u00b6\5\u00b6\u0904\n\u00b6\3\u00b6\5\u00b6"+
		"\u0907\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u090b\n\u00b6\3\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b7\3\u00b7\7\u00b7\u0912\n\u00b7\f\u00b7\16\u00b7\u0915\13"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0923\n\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0929\n\u00bb\7\u00bb\u092b\n\u00bb\f\u00bb\16"+
		"\u00bb\u092e\13\u00bb\3\u00bc\5\u00bc\u0931\n\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u0935\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0939\n\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u093d\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0941\n\u00bc\3\u00bc\3"+
		"\u00bc\5\u00bc\u0945\n\u00bc\3\u00bd\5\u00bd\u0948\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u094c\n\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\5\u00c1\u0957\n\u00c1\3\u00c2\3\u00c2\5\u00c2"+
		"\u095b\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\5\u00c4\u0962\n"+
		"\u00c4\3\u00c4\3\u00c4\5\u00c4\u0966\n\u00c4\3\u00c4\3\u00c4\3\u00c4\5"+
		"\u00c4\u096b\n\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0970\n\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0977\n\u00c5\3\u00c6\3\u00c6"+
		"\5\u00c6\u097b\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u0985\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca"+
		"\u0993\n\u00ca\f\u00ca\16\u00ca\u0996\13\u00ca\3\u00cb\3\u00cb\5\u00cb"+
		"\u099a\n\u00cb\3\u00cc\3\u00cc\5\u00cc\u099e\n\u00cc\3\u00cc\5\u00cc\u09a1"+
		"\n\u00cc\3\u00cc\3\u00cc\5\u00cc\u09a5\n\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u09ab\n\u00cc\3\u00cc\5\u00cc\u09ae\n\u00cc\3\u00cc\3"+
		"\u00cc\5\u00cc\u09b2\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3"+
		"\u00cc\3\u00cc\3\u00cc\5\u00cc\u09bc\n\u00cc\3\u00cc\5\u00cc\u09bf\n\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09c7\n\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09cc\n\u00cc\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u09d1\n\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u09d9\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u09e0\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u09e4\n\u00ce\3\u00cf\3\u00cf\3"+
		"\u00d0\3\u00d0\3\u00d0\5\u00d0\u09eb\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\5\u00d0\u09f1\n\u00d0\7\u00d0\u09f3\n\u00d0\f\u00d0\16\u00d0\u09f6"+
		"\13\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09fb\n\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a04\n\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u0a08\n\u00d2\3\u00d3\5\u00d3\u0a0b\n\u00d3\3\u00d3\3"+
		"\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a1b\n\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d7\3\u00d7\5\u00d7\u0a22\n\u00d7\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\5\u00d9\u0a2b\n\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u0a31\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a35\n"+
		"\u00d9\3\u00d9\5\u00d9\u0a38\n\u00d9\3\u00da\3\u00da\5\u00da\u0a3c\n\u00da"+
		"\3\u00db\3\u00db\5\u00db\u0a40\n\u00db\3\u00dc\3\u00dc\3\u00dc\5\u00dc"+
		"\u0a45\n\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a4c\n"+
		"\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0a52\n\u00dd\7\u00dd\u0a54"+
		"\n\u00dd\f\u00dd\16\u00dd\u0a57\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\5\u00de\u0a5f\n\u00de\3\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0a98\n\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0aa1"+
		"\n\u00e2\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\2!\16\30$8BD"+
		"FHJLNPRTV^\u008a\u00dc\u0100\u0106\u0112\u011e\u0134\u0138\u013c\u0168"+
		"\u016c\u0174\u0192\u019e\u01b8\u00ea\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8"+
		"\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0"+
		"\2\f\4\2[[__\4\2UW[^\7\2\36\36))\63\6399@@\5\2\34\34&&JJ\4\2\20\20LL\4"+
		"\2[[pp\5\2\17\17<<GG\4\2  //\3\2\60\62\3\2\u0089\u008c\u0bd9\2\u01d3\3"+
		"\2\2\2\4\u01dd\3\2\2\2\6\u01e1\3\2\2\2\b\u01e5\3\2\2\2\n\u01f0\3\2\2\2"+
		"\f\u01f2\3\2\2\2\16\u0203\3\2\2\2\20\u0214\3\2\2\2\22\u021a\3\2\2\2\24"+
		"\u0226\3\2\2\2\26\u0228\3\2\2\2\30\u022a\3\2\2\2\32\u023c\3\2\2\2\34\u0242"+
		"\3\2\2\2\36\u0249\3\2\2\2 \u024b\3\2\2\2\"\u025a\3\2\2\2$\u029c\3\2\2"+
		"\2&\u02c9\3\2\2\2(\u02e1\3\2\2\2*\u02e7\3\2\2\2,\u0302\3\2\2\2.\u0304"+
		"\3\2\2\2\60\u031e\3\2\2\2\62\u0320\3\2\2\2\64\u0324\3\2\2\2\66\u032d\3"+
		"\2\2\28\u032f\3\2\2\2:\u0348\3\2\2\2<\u0356\3\2\2\2>\u0358\3\2\2\2@\u0363"+
		"\3\2\2\2B\u0365\3\2\2\2D\u0373\3\2\2\2F\u0384\3\2\2\2H\u0392\3\2\2\2J"+
		"\u03a1\3\2\2\2L\u03b5\3\2\2\2N\u03c3\3\2\2\2P\u03ce\3\2\2\2R\u03d9\3\2"+
		"\2\2T\u03e4\3\2\2\2V\u03ef\3\2\2\2X\u0401\3\2\2\2Z\u0409\3\2\2\2\\\u0416"+
		"\3\2\2\2^\u0418\3\2\2\2`\u0423\3\2\2\2b\u0458\3\2\2\2d\u046e\3\2\2\2f"+
		"\u0471\3\2\2\2h\u0475\3\2\2\2j\u047b\3\2\2\2l\u0490\3\2\2\2n\u0492\3\2"+
		"\2\2p\u04a8\3\2\2\2r\u04aa\3\2\2\2t\u04b0\3\2\2\2v\u04b8\3\2\2\2x\u04c5"+
		"\3\2\2\2z\u04d0\3\2\2\2|\u04d3\3\2\2\2~\u04da\3\2\2\2\u0080\u04dc\3\2"+
		"\2\2\u0082\u04e0\3\2\2\2\u0084\u04e3\3\2\2\2\u0086\u04ef\3\2\2\2\u0088"+
		"\u04f3\3\2\2\2\u008a\u04f5\3\2\2\2\u008c\u0500\3\2\2\2\u008e\u0502\3\2"+
		"\2\2\u0090\u051d\3\2\2\2\u0092\u0529\3\2\2\2\u0094\u0532\3\2\2\2\u0096"+
		"\u0536\3\2\2\2\u0098\u0538\3\2\2\2\u009a\u0541\3\2\2\2\u009c\u0545\3\2"+
		"\2\2\u009e\u0557\3\2\2\2\u00a0\u0564\3\2\2\2\u00a2\u0566\3\2\2\2\u00a4"+
		"\u056d\3\2\2\2\u00a6\u0591\3\2\2\2\u00a8\u0593\3\2\2\2\u00aa\u05aa\3\2"+
		"\2\2\u00ac\u05ac\3\2\2\2\u00ae\u05b4\3\2\2\2\u00b0\u05b6\3\2\2\2\u00b2"+
		"\u05bb\3\2\2\2\u00b4\u05c4\3\2\2\2\u00b6\u05cb\3\2\2\2\u00b8\u05d4\3\2"+
		"\2\2\u00ba\u05d6\3\2\2\2\u00bc\u05d8\3\2\2\2\u00be\u05da\3\2\2\2\u00c0"+
		"\u05df\3\2\2\2\u00c2\u05e5\3\2\2\2\u00c4\u05ee\3\2\2\2\u00c6\u05f7\3\2"+
		"\2\2\u00c8\u0610\3\2\2\2\u00ca\u0616\3\2\2\2\u00cc\u0621\3\2\2\2\u00ce"+
		"\u063b\3\2\2\2\u00d0\u063d\3\2\2\2\u00d2\u064c\3\2\2\2\u00d4\u0661\3\2"+
		"\2\2\u00d6\u0663\3\2\2\2\u00d8\u0672\3\2\2\2\u00da\u0674\3\2\2\2\u00dc"+
		"\u0677\3\2\2\2\u00de\u0687\3\2\2\2\u00e0\u0689\3\2\2\2\u00e2\u068d\3\2"+
		"\2\2\u00e4\u068f\3\2\2\2\u00e6\u0693\3\2\2\2\u00e8\u0697\3\2\2\2\u00ea"+
		"\u069a\3\2\2\2\u00ec\u06a3\3\2\2\2\u00ee\u06ac\3\2\2\2\u00f0\u06b4\3\2"+
		"\2\2\u00f2\u06b6\3\2\2\2\u00f4\u06b8\3\2\2\2\u00f6\u06bf\3\2\2\2\u00f8"+
		"\u06d0\3\2\2\2\u00fa\u06d3\3\2\2\2\u00fc\u06dd\3\2\2\2\u00fe\u06ed\3\2"+
		"\2\2\u0100\u06ef\3\2\2\2\u0102\u0700\3\2\2\2\u0104\u0712\3\2\2\2\u0106"+
		"\u071b\3\2\2\2\u0108\u072c\3\2\2\2\u010a\u0732\3\2\2\2\u010c\u0734\3\2"+
		"\2\2\u010e\u0738\3\2\2\2\u0110\u073a\3\2\2\2\u0112\u073e\3\2\2\2\u0114"+
		"\u0755\3\2\2\2\u0116\u0757\3\2\2\2\u0118\u075f\3\2\2\2\u011a\u0768\3\2"+
		"\2\2\u011c\u076d\3\2\2\2\u011e\u077b\3\2\2\2\u0120\u078d\3\2\2\2\u0122"+
		"\u079c\3\2\2\2\u0124\u07b8\3\2\2\2\u0126\u07ba\3\2\2\2\u0128\u07be\3\2"+
		"\2\2\u012a\u07c0\3\2\2\2\u012c\u07c3\3\2\2\2\u012e\u07c7\3\2\2\2\u0130"+
		"\u07d3\3\2\2\2\u0132\u07da\3\2\2\2\u0134\u07ea\3\2\2\2\u0136\u0800\3\2"+
		"\2\2\u0138\u0802\3\2\2\2\u013a\u081f\3\2\2\2\u013c\u0821\3\2\2\2\u013e"+
		"\u084b\3\2\2\2\u0140\u084e\3\2\2\2\u0142\u085a\3\2\2\2\u0144\u085e\3\2"+
		"\2\2\u0146\u086e\3\2\2\2\u0148\u0875\3\2\2\2\u014a\u087a\3\2\2\2\u014c"+
		"\u087e\3\2\2\2\u014e\u0880\3\2\2\2\u0150\u0891\3\2\2\2\u0152\u0895\3\2"+
		"\2\2\u0154\u0897\3\2\2\2\u0156\u089a\3\2\2\2\u0158\u08b5\3\2\2\2\u015a"+
		"\u08b8\3\2\2\2\u015c\u08bc\3\2\2\2\u015e\u08be\3\2\2\2\u0160\u08c9\3\2"+
		"\2\2\u0162\u08d2\3\2\2\2\u0164\u08d4\3\2\2\2\u0166\u08d8\3\2\2\2\u0168"+
		"\u08e7\3\2\2\2\u016a\u090a\3\2\2\2\u016c\u090c\3\2\2\2\u016e\u0916\3\2"+
		"\2\2\u0170\u0918\3\2\2\2\u0172\u091c\3\2\2\2\u0174\u091f\3\2\2\2\u0176"+
		"\u0944\3\2\2\2\u0178\u094b\3\2\2\2\u017a\u094d\3\2\2\2\u017c\u094f\3\2"+
		"\2\2\u017e\u0951\3\2\2\2\u0180\u0954\3\2\2\2\u0182\u0958\3\2\2\2\u0184"+
		"\u095c\3\2\2\2\u0186\u096a\3\2\2\2\u0188\u0976\3\2\2\2\u018a\u097a\3\2"+
		"\2\2\u018c\u097c\3\2\2\2\u018e\u0984\3\2\2\2\u0190\u0986\3\2\2\2\u0192"+
		"\u098c\3\2\2\2\u0194\u0999\3\2\2\2\u0196\u09cb\3\2\2\2\u0198\u09cd\3\2"+
		"\2\2\u019a\u09e3\3\2\2\2\u019c\u09e5\3\2\2\2\u019e\u09e7\3\2\2\2\u01a0"+
		"\u09fa\3\2\2\2\u01a2\u0a07\3\2\2\2\u01a4\u0a0a\3\2\2\2\u01a6\u0a0f\3\2"+
		"\2\2\u01a8\u0a14\3\2\2\2\u01aa\u0a18\3\2\2\2\u01ac\u0a1f\3\2\2\2\u01ae"+
		"\u0a23\3\2\2\2\u01b0\u0a37\3\2\2\2\u01b2\u0a39\3\2\2\2\u01b4\u0a3f\3\2"+
		"\2\2\u01b6\u0a41\3\2\2\2\u01b8\u0a48\3\2\2\2\u01ba\u0a5e\3\2\2\2\u01bc"+
		"\u0a60\3\2\2\2\u01be\u0a63\3\2\2\2\u01c0\u0a97\3\2\2\2\u01c2\u0aa0\3\2"+
		"\2\2\u01c4\u0aa2\3\2\2\2\u01c6\u0aa4\3\2\2\2\u01c8\u0aa6\3\2\2\2\u01ca"+
		"\u0aa8\3\2\2\2\u01cc\u0aaa\3\2\2\2\u01ce\u0aac\3\2\2\2\u01d0\u0aae\3\2"+
		"\2\2\u01d2\u01d4\5\u008aF\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\3\3\2\2\2\u01d5\u01de\5\u01c2\u00e2\2\u01d6\u01de\7?\2\2\u01d7\u01d8"+
		"\7O\2\2\u01d8\u01d9\5^\60\2\u01d9\u01da\7P\2\2\u01da\u01de\3\2\2\2\u01db"+
		"\u01de\5\b\5\2\u01dc\u01de\5\20\t\2\u01dd\u01d5\3\2\2\2\u01dd\u01d6\3"+
		"\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\5\3\2\2\2\u01df\u01e2\5\n\6\2\u01e0\u01e2\5\f\7\2\u01e1\u01df\3\2\2\2"+
		"\u01e1\u01e0\3\2\2\2\u01e2\7\3\2\2\2\u01e3\u01e6\5\n\6\2\u01e4\u01e6\5"+
		"\f\7\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\t\3\2\2\2\u01e7\u01f1"+
		"\7~\2\2\u01e8\u01f1\5\u018c\u00c7\2\u01e9\u01f1\5\u017e\u00c0\2\u01ea"+
		"\u01f1\5\u018e\u00c8\2\u01eb\u01ec\7]\2\2\u01ec\u01f1\5\u0152\u00aa\2"+
		"\u01ed\u01ee\7]\2\2\u01ee\u01f1\5\u00ccg\2\u01ef\u01f1\5\u019a\u00ce\2"+
		"\u01f0\u01e7\3\2\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01ea"+
		"\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\13\3\2\2\2\u01f2\u01f4\5\16\b\2\u01f3\u01f5\7>\2\2\u01f4\u01f3\3\2\2"+
		"\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5\n\6\2\u01f7\r"+
		"\3\2\2\2\u01f8\u01f9\b\b\1\2\u01f9\u0204\7y\2\2\u01fa\u01fb\5\u00caf\2"+
		"\u01fb\u01fc\7y\2\2\u01fc\u0204\3\2\2\2\u01fd\u01fe\5\u00e2r\2\u01fe\u01ff"+
		"\7y\2\2\u01ff\u0204\3\2\2\2\u0200\u0201\5\u00ccg\2\u0201\u0202\7y\2\2"+
		"\u0202\u0204\3\2\2\2\u0203\u01f8\3\2\2\2\u0203\u01fa\3\2\2\2\u0203\u01fd"+
		"\3\2\2\2\u0203\u0200\3\2\2\2\u0204\u0211\3\2\2\2\u0205\u0206\f\4\2\2\u0206"+
		"\u0207\7~\2\2\u0207\u0210\7y\2\2\u0208\u020a\f\3\2\2\u0209\u020b\7>\2"+
		"\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d"+
		"\5\u0198\u00cd\2\u020d\u020e\7y\2\2\u020e\u0210\3\2\2\2\u020f\u0205\3"+
		"\2\2\2\u020f\u0208\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\17\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\5\22\n"+
		"\2\u0215\u0217\5 \21\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\5h\65\2\u0219\21\3\2\2\2\u021a\u021c\7Q\2\2\u021b"+
		"\u021d\5\24\13\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3"+
		"\2\2\2\u021e\u021f\7R\2\2\u021f\23\3\2\2\2\u0220\u0227\5\26\f\2\u0221"+
		"\u0227\5\30\r\2\u0222\u0223\5\26\f\2\u0223\u0224\7t\2\2\u0224\u0225\5"+
		"\30\r\2\u0225\u0227\3\2\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0226"+
		"\u0222\3\2\2\2\u0227\25\3\2\2\2\u0228\u0229\t\2\2\2\u0229\27\3\2\2\2\u022a"+
		"\u022b\b\r\1\2\u022b\u022d\5\32\16\2\u022c\u022e\7}\2\2\u022d\u022c\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022e\u0237\3\2\2\2\u022f\u0230\f\3\2\2\u0230"+
		"\u0231\7t\2\2\u0231\u0233\5\32\16\2\u0232\u0234\7}\2\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u022f\3\2\2\2\u0236"+
		"\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\31\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u023a\u023d\5\34\17\2\u023b\u023d\5\36\20\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\33\3\2\2\2\u023e\u0243\7~\2\2"+
		"\u023f\u0240\7[\2\2\u0240\u0243\7~\2\2\u0241\u0243\7?\2\2\u0242\u023e"+
		"\3\2\2\2\u0242\u023f\3\2\2\2\u0242\u0241\3\2\2\2\u0243\35\3\2\2\2\u0244"+
		"\u0245\7~\2\2\u0245\u024a\5\u0148\u00a5\2\u0246\u0247\7[\2\2\u0247\u0248"+
		"\7~\2\2\u0248\u024a\5\u0148\u00a5\2\u0249\u0244\3\2\2\2\u0249\u0246\3"+
		"\2\2\2\u024a\37\3\2\2\2\u024b\u024c\7O\2\2\u024c\u024d\5\u013a\u009e\2"+
		"\u024d\u024f\7P\2\2\u024e\u0250\7)\2\2\u024f\u024e\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0253\5\u01b4\u00db\2\u0252\u0251\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256\5\u0100\u0081"+
		"\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259"+
		"\5\u0122\u0092\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259!\3\2\2"+
		"\2\u025a\u025b\5\6\4\2\u025b#\3\2\2\2\u025c\u025d\b\23\1\2\u025d\u029d"+
		"\5\4\3\2\u025e\u025f\5\u00c8e\2\u025f\u0261\7O\2\2\u0260\u0262\5&\24\2"+
		"\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264"+
		"\7P\2\2\u0264\u029d\3\2\2\2\u0265\u0266\5\u01a2\u00d2\2\u0266\u0268\7"+
		"O\2\2\u0267\u0269\5&\24\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026b\7P\2\2\u026b\u029d\3\2\2\2\u026c\u026d\5\u00c8"+
		"e\2\u026d\u026e\5\u0150\u00a9\2\u026e\u029d\3\2\2\2\u026f\u0270\5\u01a2"+
		"\u00d2\2\u0270\u0271\5\u0150\u00a9\2\u0271\u029d\3\2\2\2\u0272\u0273\7"+
		"\31\2\2\u0273\u0274\7`\2\2\u0274\u0275\5\u012e\u0098\2\u0275\u0276\7a"+
		"\2\2\u0276\u0277\7O\2\2\u0277\u0278\5^\60\2\u0278\u0279\7P\2\2\u0279\u029d"+
		"\3\2\2\2\u027a\u027b\7;\2\2\u027b\u027c\7`\2\2\u027c\u027d\5\u012e\u0098"+
		"\2\u027d\u027e\7a\2\2\u027e\u027f\7O\2\2\u027f\u0280\5^\60\2\u0280\u0281"+
		"\7P\2\2\u0281\u029d\3\2\2\2\u0282\u0283\7\64\2\2\u0283\u0284\7`\2\2\u0284"+
		"\u0285\5\u012e\u0098\2\u0285\u0286\7a\2\2\u0286\u0287\7O\2\2\u0287\u0288"+
		"\5^\60\2\u0288\u0289\7P\2\2\u0289\u029d\3\2\2\2\u028a\u028b\7\22\2\2\u028b"+
		"\u028c\7`\2\2\u028c\u028d\5\u012e\u0098\2\u028d\u028e\7a\2\2\u028e\u028f"+
		"\7O\2\2\u028f\u0290\5^\60\2\u0290\u0291\7P\2\2\u0291\u029d\3\2\2\2\u0292"+
		"\u0293\7E\2\2\u0293\u0294\7O\2\2\u0294\u0295\5^\60\2\u0295\u0296\7P\2"+
		"\2\u0296\u029d\3\2\2\2\u0297\u0298\7E\2\2\u0298\u0299\7O\2\2\u0299\u029a"+
		"\5\u012e\u0098\2\u029a\u029b\7P\2\2\u029b\u029d\3\2\2\2\u029c\u025c\3"+
		"\2\2\2\u029c\u025e\3\2\2\2\u029c\u0265\3\2\2\2\u029c\u026c\3\2\2\2\u029c"+
		"\u026f\3\2\2\2\u029c\u0272\3\2\2\2\u029c\u027a\3\2\2\2\u029c\u0282\3\2"+
		"\2\2\u029c\u028a\3\2\2\2\u029c\u0292\3\2\2\2\u029c\u0297\3\2\2\2\u029d"+
		"\u02c6\3\2\2\2\u029e\u029f\f\25\2\2\u029f\u02a0\7Q\2\2\u02a0\u02a1\5Z"+
		".\2\u02a1\u02a2\7R\2\2\u02a2\u02c5\3\2\2\2\u02a3\u02a4\f\24\2\2\u02a4"+
		"\u02a5\7Q\2\2\u02a5\u02a6\5\u0150\u00a9\2\u02a6\u02a7\7R\2\2\u02a7\u02c5"+
		"\3\2\2\2\u02a8\u02a9\f\23\2\2\u02a9\u02ab\7O\2\2\u02aa\u02ac\5&\24\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02c5\7P"+
		"\2\2\u02ae\u02af\f\16\2\2\u02af\u02b1\7{\2\2\u02b0\u02b2\7>\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02c5\5\""+
		"\22\2\u02b4\u02b5\f\r\2\2\u02b5\u02b7\7v\2\2\u02b6\u02b8\7>\2\2\u02b7"+
		"\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02c5\5\""+
		"\22\2\u02ba\u02bb\f\f\2\2\u02bb\u02bc\7{\2\2\u02bc\u02c5\5(\25\2\u02bd"+
		"\u02be\f\13\2\2\u02be\u02bf\7v\2\2\u02bf\u02c5\5(\25\2\u02c0\u02c1\f\n"+
		"\2\2\u02c1\u02c5\7r\2\2\u02c2\u02c3\f\t\2\2\u02c3\u02c5\7s\2\2\u02c4\u029e"+
		"\3\2\2\2\u02c4\u02a3\3\2\2\2\u02c4\u02a8\3\2\2\2\u02c4\u02ae\3\2\2\2\u02c4"+
		"\u02b4\3\2\2\2\u02c4\u02ba\3\2\2\2\u02c4\u02bd\3\2\2\2\u02c4\u02c0\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7%\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\5\u014e"+
		"\u00a8\2\u02ca\'\3\2\2\2\u02cb\u02cd\5\16\b\2\u02cc\u02cb\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\5\u00caf\2\u02cf\u02d0"+
		"\7y\2\2\u02d0\u02d1\7]\2\2\u02d1\u02d2\5\u00caf\2\u02d2\u02e2\3\2\2\2"+
		"\u02d3\u02d4\5\16\b\2\u02d4\u02d5\7>\2\2\u02d5\u02d6\5\u0198\u00cd\2\u02d6"+
		"\u02d7\7y\2\2\u02d7\u02d8\7]\2\2\u02d8\u02d9\5\u00caf\2\u02d9\u02e2\3"+
		"\2\2\2\u02da\u02dc\5\16\b\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\7]\2\2\u02de\u02e2\5\u00caf\2\u02df\u02e0\7"+
		"]\2\2\u02e0\u02e2\5\u00ccg\2\u02e1\u02cc\3\2\2\2\u02e1\u02d3\3\2\2\2\u02e1"+
		"\u02db\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2)\3\2\2\2\u02e3\u02e8\5$\23\2"+
		"\u02e4\u02e8\5,\27\2\u02e5\u02e8\5\60\31\2\u02e6\u02e8\5<\37\2\u02e7\u02e3"+
		"\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8"+
		"+\3\2\2\2\u02e9\u02ea\7r\2\2\u02ea\u0303\5@!\2\u02eb\u02ec\7s\2\2\u02ec"+
		"\u0303\5@!\2\u02ed\u02ee\5.\30\2\u02ee\u02ef\5@!\2\u02ef\u0303\3\2\2\2"+
		"\u02f0\u02f1\78\2\2\u02f1\u0303\5*\26\2\u02f2\u02f3\78\2\2\u02f3\u02f4"+
		"\7O\2\2\u02f4\u02f5\5\u012e\u0098\2\u02f5\u02f6\7P\2\2\u02f6\u0303\3\2"+
		"\2\2\u02f7\u02f8\78\2\2\u02f8\u02f9\7}\2\2\u02f9\u02fa\7O\2\2\u02fa\u02fb"+
		"\7~\2\2\u02fb\u0303\7P\2\2\u02fc\u02fd\7\5\2\2\u02fd\u02fe\7O\2\2\u02fe"+
		"\u02ff\5\u012e\u0098\2\u02ff\u0300\7P\2\2\u0300\u0303\3\2\2\2\u0301\u0303"+
		"\5> \2\u0302\u02e9\3\2\2\2\u0302\u02eb\3\2\2\2\u0302\u02ed\3\2\2\2\u0302"+
		"\u02f0\3\2\2\2\u0302\u02f2\3\2\2\2\u0302\u02f7\3\2\2\2\u0302\u02fc\3\2"+
		"\2\2\u0302\u0301\3\2\2\2\u0303-\3\2\2\2\u0304\u0305\t\3\2\2\u0305/\3\2"+
		"\2\2\u0306\u0308\7y\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030b\7+\2\2\u030a\u030c\5\62\32\2\u030b\u030a\3"+
		"\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\5\64\33\2\u030e"+
		"\u0310\5:\36\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031f\3\2"+
		"\2\2\u0311\u0313\7y\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0316\7+\2\2\u0315\u0317\5\62\32\2\u0316\u0315\3"+
		"\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7O\2\2\u0319"+
		"\u031a\5\u012e\u0098\2\u031a\u031c\7P\2\2\u031b\u031d\5:\36\2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0307\3\2\2\2\u031e"+
		"\u0312\3\2\2\2\u031f\61\3\2\2\2\u0320\u0321\7O\2\2\u0321\u0322\5&\24\2"+
		"\u0322\u0323\7P\2\2\u0323\63\3\2\2\2\u0324\u0326\5\u00c4c\2\u0325\u0327"+
		"\5\66\34\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\65\3\2\2\2\u0328"+
		"\u032a\5\u0124\u0093\2\u0329\u032b\5\66\34\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032e\58\35\2\u032d\u0328\3\2"+
		"\2\2\u032d\u032c\3\2\2\2\u032e\67\3\2\2\2\u032f\u0330\b\35\1\2\u0330\u0331"+
		"\7Q\2\2\u0331\u0332\5^\60\2\u0332\u0334\7R\2\2\u0333\u0335\5\u0100\u0081"+
		"\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u033f\3\2\2\2\u0336\u0337"+
		"\f\3\2\2\u0337\u0338\7Q\2\2\u0338\u0339\5`\61\2\u0339\u033b\7R\2\2\u033a"+
		"\u033c\5\u0100\u0081\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e"+
		"\3\2\2\2\u033d\u0336\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u03409\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0344\7O\2\2\u0343"+
		"\u0345\5&\24\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0349\7P\2\2\u0347\u0349\5\u0150\u00a9\2\u0348\u0342\3\2\2"+
		"\2\u0348\u0347\3\2\2\2\u0349;\3\2\2\2\u034a\u034c\7y\2\2\u034b\u034a\3"+
		"\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7\26\2\2\u034e"+
		"\u0357\5@!\2\u034f\u0351\7y\2\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0353\7\26\2\2\u0353\u0354\7Q\2\2\u0354\u0355"+
		"\7R\2\2\u0355\u0357\5@!\2\u0356\u034b\3\2\2\2\u0356\u0350\3\2\2\2\u0357"+
		"=\3\2\2\2\u0358\u0359\7,\2\2\u0359\u035a\7O\2\2\u035a\u035b\5^\60\2\u035b"+
		"\u035c\7P\2\2\u035c?\3\2\2\2\u035d\u0364\5*\26\2\u035e\u035f\7O\2\2\u035f"+
		"\u0360\5\u012e\u0098\2\u0360\u0361\7P\2\2\u0361\u0362\5@!\2\u0362\u0364"+
		"\3\2\2\2\u0363\u035d\3\2\2\2\u0363\u035e\3\2\2\2\u0364A\3\2\2\2\u0365"+
		"\u0366\b\"\1\2\u0366\u0367\5@!\2\u0367\u0370\3\2\2\2\u0368\u0369\f\4\2"+
		"\2\u0369\u036a\7|\2\2\u036a\u036f\5@!\2\u036b\u036c\f\3\2\2\u036c\u036d"+
		"\7u\2\2\u036d\u036f\5@!\2\u036e\u0368\3\2\2\2\u036e\u036b\3\2\2\2\u036f"+
		"\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371C\3\2\2\2"+
		"\u0372\u0370\3\2\2\2\u0373\u0374\b#\1\2\u0374\u0375\5B\"\2\u0375\u0381"+
		"\3\2\2\2\u0376\u0377\f\5\2\2\u0377\u0378\7W\2\2\u0378\u0380\5B\"\2\u0379"+
		"\u037a\f\4\2\2\u037a\u037b\7X\2\2\u037b\u0380\5B\"\2\u037c\u037d\f\3\2"+
		"\2\u037d\u037e\7Y\2\2\u037e\u0380\5B\"\2\u037f\u0376\3\2\2\2\u037f\u0379"+
		"\3\2\2\2\u037f\u037c\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382E\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\b$\1\2\u0385"+
		"\u0386\5D#\2\u0386\u038f\3\2\2\2\u0387\u0388\f\4\2\2\u0388\u0389\7U\2"+
		"\2\u0389\u038e\5D#\2\u038a\u038b\f\3\2\2\u038b\u038c\7V\2\2\u038c\u038e"+
		"\5D#\2\u038d\u0387\3\2\2\2\u038d\u038a\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390G\3\2\2\2\u0391\u038f\3\2\2\2"+
		"\u0392\u0393\b%\1\2\u0393\u0394\5F$\2\u0394\u039e\3\2\2\2\u0395\u0396"+
		"\f\4\2\2\u0396\u0397\7j\2\2\u0397\u039d\5F$\2\u0398\u0399\f\3\2\2\u0399"+
		"\u039a\5\u01bc\u00df\2\u039a\u039b\5F$\2\u039b\u039d\3\2\2\2\u039c\u0395"+
		"\3\2\2\2\u039c\u0398\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039fI\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a2\b&\1\2\u03a2"+
		"\u03a3\5H%\2\u03a3\u03b2\3\2\2\2\u03a4\u03a5\f\6\2\2\u03a5\u03a6\7`\2"+
		"\2\u03a6\u03b1\5H%\2\u03a7\u03a8\f\5\2\2\u03a8\u03a9\7a\2\2\u03a9\u03b1"+
		"\5H%\2\u03aa\u03ab\f\4\2\2\u03ab\u03ac\7n\2\2\u03ac\u03b1\5H%\2\u03ad"+
		"\u03ae\f\3\2\2\u03ae\u03af\7o\2\2\u03af\u03b1\5H%\2\u03b0\u03a4\3\2\2"+
		"\2\u03b0\u03a7\3\2\2\2\u03b0\u03aa\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b1\u03b4"+
		"\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3K\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b5\u03b6\b\'\1\2\u03b6\u03b7\5J&\2\u03b7\u03c0\3\2\2"+
		"\2\u03b8\u03b9\f\4\2\2\u03b9\u03ba\7l\2\2\u03ba\u03bf\5J&\2\u03bb\u03bc"+
		"\f\3\2\2\u03bc\u03bd\7m\2\2\u03bd\u03bf\5J&\2\u03be\u03b8\3\2\2\2\u03be"+
		"\u03bb\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2"+
		"\2\2\u03c1M\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c4\b(\1\2\u03c4\u03c5"+
		"\5L\'\2\u03c5\u03cb\3\2\2\2\u03c6\u03c7\f\3\2\2\u03c7\u03c8\7[\2\2\u03c8"+
		"\u03ca\5L\'\2\u03c9\u03c6\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03ccO\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf"+
		"\b)\1\2\u03cf\u03d0\5N(\2\u03d0\u03d6\3\2\2\2\u03d1\u03d2\f\3\2\2\u03d2"+
		"\u03d3\7Z\2\2\u03d3\u03d5\5N(\2\u03d4\u03d1\3\2\2\2\u03d5\u03d8\3\2\2"+
		"\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7Q\3\2\2\2\u03d8\u03d6"+
		"\3\2\2\2\u03d9\u03da\b*\1\2\u03da\u03db\5P)\2\u03db\u03e1\3\2\2\2\u03dc"+
		"\u03dd\f\3\2\2\u03dd\u03de\7\\\2\2\u03de\u03e0\5P)\2\u03df\u03dc\3\2\2"+
		"\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2S"+
		"\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e5\b+\1\2\u03e5\u03e6\5R*\2\u03e6"+
		"\u03ec\3\2\2\2\u03e7\u03e8\f\3\2\2\u03e8\u03e9\7p\2\2\u03e9\u03eb\5R*"+
		"\2\u03ea\u03e7\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03edU\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\b,\1\2\u03f0\u03f1"+
		"\5T+\2\u03f1\u03f7\3\2\2\2\u03f2\u03f3\f\3\2\2\u03f3\u03f4\7q\2\2\u03f4"+
		"\u03f6\5T+\2\u03f5\u03f2\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2"+
		"\2\u03f7\u03f8\3\2\2\2\u03f8W\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u0402"+
		"\5V,\2\u03fb\u03fc\5V,\2\u03fc\u03fd\7w\2\2\u03fd\u03fe\5^\60\2\u03fe"+
		"\u03ff\7x\2\2\u03ff\u0400\5Z.\2\u0400\u0402\3\2\2\2\u0401\u03fa\3\2\2"+
		"\2\u0401\u03fb\3\2\2\2\u0402Y\3\2\2\2\u0403\u040a\5X-\2\u0404\u0405\5"+
		"V,\2\u0405\u0406\5\\/\2\u0406\u0407\5\u014c\u00a7\2\u0407\u040a\3\2\2"+
		"\2\u0408\u040a\5\u01b2\u00da\2\u0409\u0403\3\2\2\2\u0409\u0404\3\2\2\2"+
		"\u0409\u0408\3\2\2\2\u040a[\3\2\2\2\u040b\u0417\7_\2\2\u040c\u0417\7d"+
		"\2\2\u040d\u0417\7e\2\2\u040e\u0417\7f\2\2\u040f\u0417\7b\2\2\u0410\u0417"+
		"\7c\2\2\u0411\u0417\5\u01be\u00e0\2\u0412\u0417\7k\2\2\u0413\u0417\7h"+
		"\2\2\u0414\u0417\7g\2\2\u0415\u0417\7i\2\2\u0416\u040b\3\2\2\2\u0416\u040c"+
		"\3\2\2\2\u0416\u040d\3\2\2\2\u0416\u040e\3\2\2\2\u0416\u040f\3\2\2\2\u0416"+
		"\u0410\3\2\2\2\u0416\u0411\3\2\2\2\u0416\u0412\3\2\2\2\u0416\u0413\3\2"+
		"\2\2\u0416\u0414\3\2\2\2\u0416\u0415\3\2\2\2\u0417]\3\2\2\2\u0418\u0419"+
		"\b\60\1\2\u0419\u041a\5Z.\2\u041a\u0420\3\2\2\2\u041b\u041c\f\3\2\2\u041c"+
		"\u041d\7t\2\2\u041d\u041f\5Z.\2\u041e\u041b\3\2\2\2\u041f\u0422\3\2\2"+
		"\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421_\3\2\2\2\u0422\u0420"+
		"\3\2\2\2\u0423\u0424\5X-\2\u0424a\3\2\2\2\u0425\u0459\5d\63\2\u0426\u0428"+
		"\5\u0100\u0081\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3"+
		"\2\2\2\u0429\u0459\5f\64\2\u042a\u042c\5\u0100\u0081\2\u042b\u042a\3\2"+
		"\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0459\5h\65\2\u042e"+
		"\u0430\5\u0100\u0081\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u0459\5l\67\2\u0432\u0434\5\u0100\u0081\2\u0433\u0432\3"+
		"\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0459\5n8\2\u0436"+
		"\u0438\5\u0100\u0081\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439"+
		"\3\2\2\2\u0439\u0459\5v<\2\u043a\u043c\5\u0100\u0081\2\u043b\u043a\3\2"+
		"\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0459\5r:\2\u043e\u0440"+
		"\5\u0100\u0081\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3"+
		"\2\2\2\u0441\u0459\5t;\2\u0442\u0444\5\u0100\u0081\2\u0443\u0442\3\2\2"+
		"\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0459\5\u0080A\2\u0446"+
		"\u0448\5\u0100\u0081\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449"+
		"\3\2\2\2\u0449\u0459\5\u0082B\2\u044a\u044c\5\u0100\u0081\2\u044b\u044a"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0459\5\u0084C"+
		"\2\u044e\u0450\5\u0100\u0081\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2"+
		"\u0450\u0451\3\2\2\2\u0451\u0459\5\u0086D\2\u0452\u0459\5\u009aN\2\u0453"+
		"\u0459\5\u0088E\2\u0454\u0456\5\u0100\u0081\2\u0455\u0454\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\5\u01a8\u00d5\2\u0458\u0425"+
		"\3\2\2\2\u0458\u0427\3\2\2\2\u0458\u042b\3\2\2\2\u0458\u042f\3\2\2\2\u0458"+
		"\u0433\3\2\2\2\u0458\u0437\3\2\2\2\u0458\u043b\3\2\2\2\u0458\u043f\3\2"+
		"\2\2\u0458\u0443\3\2\2\2\u0458\u0447\3\2\2\2\u0458\u044b\3\2\2\2\u0458"+
		"\u044f\3\2\2\2\u0458\u0452\3\2\2\2\u0458\u0453\3\2\2\2\u0458\u0455\3\2"+
		"\2\2\u0459c\3\2\2\2\u045a\u045c\5\u0100\u0081\2\u045b\u045a\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\7~\2\2\u045e\u045f\7x\2"+
		"\2\u045f\u046f\5b\62\2\u0460\u0462\5\u0100\u0081\2\u0461\u0460\3\2\2\2"+
		"\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7\n\2\2\u0464\u0465"+
		"\5`\61\2\u0465\u0466\7x\2\2\u0466\u0467\5b\62\2\u0467\u046f\3\2\2\2\u0468"+
		"\u046a\5\u0100\u0081\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\7\25\2\2\u046c\u046d\7x\2\2\u046d\u046f\5b\62\2\u046e"+
		"\u045b\3\2\2\2\u046e\u0461\3\2\2\2\u046e\u0469\3\2\2\2\u046fe\3\2\2\2"+
		"\u0470\u0472\5^\60\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473"+
		"\3\2\2\2\u0473\u0474\7z\2\2\u0474g\3\2\2\2\u0475\u0477\7S\2\2\u0476\u0478"+
		"\5j\66\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\7T\2\2\u047ai\3\2\2\2\u047b\u047f\5b\62\2\u047c\u047e\5b\62\2\u047d"+
		"\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2"+
		"\2\2\u0480k\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0483\7%\2\2\u0483\u0484"+
		"\7O\2\2\u0484\u0485\5p9\2\u0485\u0486\7P\2\2\u0486\u0487\5b\62\2\u0487"+
		"\u0491\3\2\2\2\u0488\u0489\7%\2\2\u0489\u048a\7O\2\2\u048a\u048b\5p9\2"+
		"\u048b\u048c\7P\2\2\u048c\u048d\5b\62\2\u048d\u048e\7\32\2\2\u048e\u048f"+
		"\5b\62\2\u048f\u0491\3\2\2\2\u0490\u0482\3\2\2\2\u0490\u0488\3\2\2\2\u0491"+
		"m\3\2\2\2\u0492\u0493\7=\2\2\u0493\u0494\7O\2\2\u0494\u0495\5p9\2\u0495"+
		"\u0496\7P\2\2\u0496\u0497\5b\62\2\u0497o\3\2\2\2\u0498\u04a9\5^\60\2\u0499"+
		"\u049b\5\u0100\u0081\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c"+
		"\3\2\2\2\u049c\u049d\5\u00b4[\2\u049d\u049e\5\u011a\u008e\2\u049e\u049f"+
		"\7_\2\2\u049f\u04a0\5\u014c\u00a7\2\u04a0\u04a9\3\2\2\2\u04a1\u04a3\5"+
		"\u0100\u0081\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2"+
		"\2\2\u04a4\u04a5\5\u00b4[\2\u04a5\u04a6\5\u011a\u008e\2\u04a6\u04a7\5"+
		"\u0150\u00a9\2\u04a7\u04a9\3\2\2\2\u04a8\u0498\3\2\2\2\u04a8\u049a\3\2"+
		"\2\2\u04a8\u04a2\3\2\2\2\u04a9q\3\2\2\2\u04aa\u04ab\7N\2\2\u04ab\u04ac"+
		"\7O\2\2\u04ac\u04ad\5p9\2\u04ad\u04ae\7P\2\2\u04ae\u04af\5b\62\2\u04af"+
		"s\3\2\2\2\u04b0\u04b1\7\27\2\2\u04b1\u04b2\5h\65\2\u04b2\u04b3\7N\2\2"+
		"\u04b3\u04b4\7O\2\2\u04b4\u04b5\5^\60\2\u04b5\u04b6\7P\2\2\u04b6\u04b7"+
		"\7z\2\2\u04b7u\3\2\2\2\u04b8\u04b9\7\"\2\2\u04b9\u04ba\7O\2\2\u04ba\u04bc"+
		"\5z>\2\u04bb\u04bd\5p9\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04c0\7z\2\2\u04bf\u04c1\5^\60\2\u04c0\u04bf\3\2"+
		"\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7P\2\2\u04c3"+
		"\u04c4\5b\62\2\u04c4w\3\2\2\2\u04c5\u04c6\7\"\2\2\u04c6\u04c7\7O\2\2\u04c7"+
		"\u04c8\5|?\2\u04c8\u04c9\7x\2\2\u04c9\u04ca\5~@\2\u04ca\u04cb\7P\2\2\u04cb"+
		"\u04cc\5b\62\2\u04ccy\3\2\2\2\u04cd\u04d1\5f\64\2\u04ce\u04d1\5\u009a"+
		"N\2\u04cf\u04d1\5\u00aaV\2\u04d0\u04cd\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0"+
		"\u04cf\3\2\2\2\u04d1{\3\2\2\2\u04d2\u04d4\5\u0100\u0081\2\u04d3\u04d2"+
		"\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\5\u00b4["+
		"\2\u04d6\u04d7\5\u011a\u008e\2\u04d7}\3\2\2\2\u04d8\u04db\5^\60\2\u04d9"+
		"\u04db\5\u0150\u00a9\2\u04da\u04d8\3\2\2\2\u04da\u04d9\3\2\2\2\u04db\177"+
		"\3\2\2\2\u04dc\u04dd\7$\2\2\u04dd\u04de\7~\2\2\u04de\u04df\7z\2\2\u04df"+
		"\u0081\3\2\2\2\u04e0\u04e1\7\t\2\2\u04e1\u04e2\7z\2\2\u04e2\u0083\3\2"+
		"\2\2\u04e3\u04e4\7\23\2\2\u04e4\u04e5\7z\2\2\u04e5\u0085\3\2\2\2\u04e6"+
		"\u04e8\7\65\2\2\u04e7\u04e9\5^\60\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3"+
		"\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04f0\7z\2\2\u04eb\u04ec\7\65\2\2\u04ec"+
		"\u04ed\5\u0150\u00a9\2\u04ed\u04ee\7z\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04e6"+
		"\3\2\2\2\u04ef\u04eb\3\2\2\2\u04f0\u0087\3\2\2\2\u04f1\u04f4\5\u00aaV"+
		"\2\u04f2\u04f4\5\u0094K\2\u04f3\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4"+
		"\u0089\3\2\2\2\u04f5\u04f6\bF\1\2\u04f6\u04f7\5\u0092J\2\u04f7\u04fc\3"+
		"\2\2\2\u04f8\u04f9\f\3\2\2\u04f9\u04fb\5\u0092J\2\u04fa\u04f8\3\2\2\2"+
		"\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u008b"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0501\5\u0160\u00b1\2\u0500\u04ff\3"+
		"\2\2\2\u0500\u0501\3\2\2\2\u0501\u008d\3\2\2\2\u0502\u0503\5\u0090I\2"+
		"\u0503\u0504\7S\2\2\u0504\u0505\5\u008cG\2\u0505\u0506\7T\2\2\u0506\u0507"+
		"\7z\2\2\u0507\u008f\3\2\2\2\u0508\u050a\5\u015e\u00b0\2\u0509\u050b\5"+
		"\u0100\u0081\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2"+
		"\2\2\u050c\u050e\5\16\b\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0511\5\u015a\u00ae\2\u0510\u0512\5\u015c\u00af\2"+
		"\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3\2\2\2\u0513\u0515"+
		"\5\u0172\u00ba\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u051e\3"+
		"\2\2\2\u0516\u0518\5\u015e\u00b0\2\u0517\u0519\5\u0100\u0081\2\u0518\u0517"+
		"\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\3\2\2\2\u051a\u051c\5\u0172\u00ba"+
		"\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u0508"+
		"\3\2\2\2\u051d\u0516\3\2\2\2\u051e\u0091\3\2\2\2\u051f\u052a\5\u0096L"+
		"\2\u0520\u052a\5\u008eH\2\u0521\u052a\5\u0140\u00a1\2\u0522\u052a\5\u0190"+
		"\u00c9\2\u0523\u052a\5\u01a4\u00d3\2\u0524\u052a\5\u01a6\u00d4\2\u0525"+
		"\u052a\5\u00fe\u0080\2\u0526\u052a\5\u00e6t\2\u0527\u052a\5\u00aeX\2\u0528"+
		"\u052a\5\u00b0Y\2\u0529\u051f\3\2\2\2\u0529\u0520\3\2\2\2\u0529\u0521"+
		"\3\2\2\2\u0529\u0522\3\2\2\2\u0529\u0523\3\2\2\2\u0529\u0524\3\2\2\2\u0529"+
		"\u0525\3\2\2\2\u0529\u0526\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u0528\3\2"+
		"\2\2\u052a\u0093\3\2\2\2\u052b\u0533\5\u00fc\177\2\u052c\u0533\5\u00f4"+
		"{\2\u052d\u0533\5\u00f8}\2\u052e\u0533\5\u00fa~\2\u052f\u0533\5\u00ac"+
		"W\2\u0530\u0533\5\u0098M\2\u0531\u0533\5\u00d6l\2\u0532\u052b\3\2\2\2"+
		"\u0532\u052c\3\2\2\2\u0532\u052d\3\2\2\2\u0532\u052e\3\2\2\2\u0532\u052f"+
		"\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0531\3\2\2\2\u0533\u0095\3\2\2\2\u0534"+
		"\u0537\5\u00aaV\2\u0535\u0537\5\u0094K\2\u0536\u0534\3\2\2\2\u0536\u0535"+
		"\3\2\2\2\u0537\u0097\3\2\2\2\u0538\u0539\7I\2\2\u0539\u053b\7~\2\2\u053a"+
		"\u053c\5\u0100\u0081\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u053e\7_\2\2\u053e\u053f\5\u012e\u0098\2\u053f\u0540\7"+
		"z\2\2\u0540\u0099\3\2\2\2\u0541\u0542\5\u009cO\2\u0542\u0543\7z\2\2\u0543"+
		"\u009b\3\2\2\2\u0544\u0546\5\u0100\u0081\2\u0545\u0544\3\2\2\2\u0545\u0546"+
		"\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u0549\5\u00b8]\2\u0548\u0547\3\2\2"+
		"\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\5\u00c0a\2\u054b"+
		"\u054d\5\u009eP\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u009d"+
		"\3\2\2\2\u054e\u0558\3\2\2\2\u054f\u0554\5\u00a6T\2\u0550\u0551\7t\2\2"+
		"\u0551\u0553\5\u00a6T\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2"+
		"\2\2\u0557\u054e\3\2\2\2\u0557\u054f\3\2\2\2\u0558\u009f\3\2\2\2\u0559"+
		"\u055b\5\u00a2R\2\u055a\u055c\5\u00a8U\2\u055b\u055a\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055e\7_\2\2\u055e\u0560\5\u0150\u00a9"+
		"\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0565\3\2\2\2\u0561\u0562"+
		"\5\u00a8U\2\u0562\u0563\5\u0150\u00a9\2\u0563\u0565\3\2\2\2\u0564\u0559"+
		"\3\2\2\2\u0564\u0561\3\2\2\2\u0565\u00a1\3\2\2\2\u0566\u056a\5\u00a4S"+
		"\2\u0567\u0569\5\u00a4S\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a"+
		"\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u00a3\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056d\u056e\7Q\2\2\u056e\u056f\5^\60\2\u056f\u0570\7R\2\2\u0570\u00a5"+
		"\3\2\2\2\u0571\u0573\5\u0124\u0093\2\u0572\u0571\3\2\2\2\u0573\u0576\3"+
		"\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576"+
		"\u0574\3\2\2\2\u0577\u057a\5\u012c\u0097\2\u0578\u0579\7_\2\2\u0579\u057b"+
		"\5\u014c\u00a7\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u0592\3"+
		"\2\2\2\u057c\u057e\5\u0124\u0093\2\u057d\u057c\3\2\2\2\u057e\u0581\3\2"+
		"\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581"+
		"\u057f\3\2\2\2\u0582\u0583\5\u012c\u0097\2\u0583\u0586\5\u00a8U\2\u0584"+
		"\u0585\7_\2\2\u0585\u0587\5\u014c\u00a7\2\u0586\u0584\3\2\2\2\u0586\u0587"+
		"\3\2\2\2\u0587\u0592\3\2\2\2\u0588\u058a\5\u0124\u0093\2\u0589\u0588\3"+
		"\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\5\u012c\u0097\2\u058f\u0590"+
		"\5\u00a0Q\2\u0590\u0592\3\2\2\2\u0591\u0574\3\2\2\2\u0591\u057f\3\2\2"+
		"\2\u0591\u058b\3\2\2\2\u0592\u00a7\3\2\2\2\u0593\u0594\7Q\2\2\u0594\u0599"+
		"\7R\2\2\u0595\u0596\7Q\2\2\u0596\u0598\7R\2\2\u0597\u0595\3\2\2\2\u0598"+
		"\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u00a9\3\2"+
		"\2\2\u059b\u0599\3\2\2\2\u059c\u059e\5\u00b4[\2\u059d\u059c\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u05a1\5\u0116\u008c\2\u05a0\u059f"+
		"\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05ab\7z\2\2\u05a3"+
		"\u05a5\5\u0100\u0081\2\u05a4\u05a6\5\u00b4[\2\u05a5\u05a4\3\2\2\2\u05a5"+
		"\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a8\5\u0116\u008c\2\u05a8\u05a9"+
		"\7z\2\2\u05a9\u05ab\3\2\2\2\u05aa\u059d\3\2\2\2\u05aa\u05a3\3\2\2\2\u05ab"+
		"\u00ab\3\2\2\2\u05ac\u05ad\7:\2\2\u05ad\u05ae\7O\2\2\u05ae\u05af\5`\61"+
		"\2\u05af\u05b0\7t\2\2\u05b0\u05b1\7\u0087\2\2\u05b1\u05b2\7P\2\2\u05b2"+
		"\u05b3\7z\2\2\u05b3\u00ad\3\2\2\2\u05b4\u05b5\7z\2\2\u05b5\u00af\3\2\2"+
		"\2\u05b6\u05b7\5\u0100\u0081\2\u05b7\u05b8\7z\2\2\u05b8\u00b1\3\2\2\2"+
		"\u05b9\u05bc\5\u00b6\\\2\u05ba\u05bc\5\u00c0a\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05ba\3\2\2\2\u05bc\u00b3\3\2\2\2\u05bd\u05bf\5\u00b2Z\2\u05be\u05c0"+
		"\5\u0100\u0081\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c5\3"+
		"\2\2\2\u05c1\u05c2\5\u00b2Z\2\u05c2\u05c3\5\u00b4[\2\u05c3\u05c5\3\2\2"+
		"\2\u05c4\u05bd\3\2\2\2\u05c4\u05c1\3\2\2\2\u05c5\u00b5\3\2\2\2\u05c6\u05cc"+
		"\5\u00ba^\2\u05c7\u05cc\5\u00bc_\2\u05c8\u05cc\7#\2\2\u05c9\u05cc\7D\2"+
		"\2\u05ca\u05cc\7\21\2\2\u05cb\u05c6\3\2\2\2\u05cb\u05c7\3\2\2\2\u05cb"+
		"\u05c8\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u00b7\3\2"+
		"\2\2\u05cd\u05cf\5\u00b6\\\2\u05ce\u05d0\5\u0100\u0081\2\u05cf\u05ce\3"+
		"\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d5\3\2\2\2\u05d1\u05d2\5\u00b6\\\2"+
		"\u05d2\u05d3\5\u00b4[\2\u05d3\u05d5\3\2\2\2\u05d4\u05cd\3\2\2\2\u05d4"+
		"\u05d1\3\2\2\2\u05d5\u00b9\3\2\2\2\u05d6\u05d7\t\4\2\2\u05d7\u00bb\3\2"+
		"\2\2\u05d8\u05d9\t\5\2\2\u05d9\u00bd\3\2\2\2\u05da\u05db\7~\2\2\u05db"+
		"\u00bf\3\2\2\2\u05dc\u05e0\5\u00c2b\2\u05dd\u05e0\5\u008eH\2\u05de\u05e0"+
		"\5\u00d2j\2\u05df\u05dc\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05de\3\2\2"+
		"\2\u05e0\u00c1\3\2\2\2\u05e1\u05e6\5\u00c8e\2\u05e2\u05e6\5\u00ceh\2\u05e3"+
		"\u05e6\5\u01a2\u00d2\2\u05e4\u05e6\5\u0128\u0095\2\u05e5\u05e1\3\2\2\2"+
		"\u05e5\u05e2\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e6\u00c3"+
		"\3\2\2\2\u05e7\u05e9\5\u00c0a\2\u05e8\u05ea\5\u0100\u0081\2\u05e9\u05e8"+
		"\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ef\3\2\2\2\u05eb\u05ec\5\u00c0a"+
		"\2\u05ec\u05ed\5\u00c4c\2\u05ed\u05ef\3\2\2\2\u05ee\u05e7\3\2\2\2\u05ee"+
		"\u05eb\3\2\2\2\u05ef\u00c5\3\2\2\2\u05f0\u05f2\5\u00c2b\2\u05f1\u05f3"+
		"\5\u0100\u0081\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f8\3"+
		"\2\2\2\u05f4\u05f5\5\u00c2b\2\u05f5\u05f6\5\u00c6d\2\u05f6\u05f8\3\2\2"+
		"\2\u05f7\u05f0\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f8\u00c7\3\2\2\2\u05f9\u05fb"+
		"\5\16\b\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2"+
		"\u05fc\u0611\5\u00caf\2\u05fd\u05fe\5\16\b\2\u05fe\u05ff\7>\2\2\u05ff"+
		"\u0600\5\u0198\u00cd\2\u0600\u0611\3\2\2\2\u0601\u0611\7\f\2\2\u0602\u0611"+
		"\7\r\2\2\u0603\u0611\7\16\2\2\u0604\u0611\7M\2\2\u0605\u0611\7\b\2\2\u0606"+
		"\u0611\7\66\2\2\u0607\u0611\7\'\2\2\u0608\u0611\7(\2\2\u0609\u0611\7\67"+
		"\2\2\u060a\u0611\7H\2\2\u060b\u0611\7!\2\2\u060c\u0611\7\30\2\2\u060d"+
		"\u0611\7K\2\2\u060e\u0611\7\7\2\2\u060f\u0611\5\u00ccg\2\u0610\u05fa\3"+
		"\2\2\2\u0610\u05fd\3\2\2\2\u0610\u0601\3\2\2\2\u0610\u0602\3\2\2\2\u0610"+
		"\u0603\3\2\2\2\u0610\u0604\3\2\2\2\u0610\u0605\3\2\2\2\u0610\u0606\3\2"+
		"\2\2\u0610\u0607\3\2\2\2\u0610\u0608\3\2\2\2\u0610\u0609\3\2\2\2\u0610"+
		"\u060a\3\2\2\2\u0610\u060b\3\2\2\2\u0610\u060c\3\2\2\2\u0610\u060d\3\2"+
		"\2\2\u0610\u060e\3\2\2\2\u0610\u060f\3\2\2\2\u0611\u00c9\3\2\2\2\u0612"+
		"\u0617\5\u0152\u00aa\2\u0613\u0617\5\u00d0i\2\u0614\u0617\5\u00be`\2\u0615"+
		"\u0617\5\u0198\u00cd\2\u0616\u0612\3\2\2\2\u0616\u0613\3\2\2\2\u0616\u0614"+
		"\3\2\2\2\u0616\u0615\3\2\2\2\u0617\u00cb\3\2\2\2\u0618\u0619\7\24\2\2"+
		"\u0619\u061a\7O\2\2\u061a\u061b\5^\60\2\u061b\u061c\7P\2\2\u061c\u0622"+
		"\3\2\2\2\u061d\u061e\7\24\2\2\u061e\u061f\7O\2\2\u061f\u0620\7\7\2\2\u0620"+
		"\u0622\7P\2\2\u0621\u0618\3\2\2\2\u0621\u061d\3\2\2\2\u0622\u00cd\3\2"+
		"\2\2\u0623\u0625\5\u015e\u00b0\2\u0624\u0626\5\u0100\u0081\2\u0625\u0624"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\3\2\2\2\u0627\u0629\5\16\b\2"+
		"\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b"+
		"\7~\2\2\u062b\u063c\3\2\2\2\u062c\u062d\5\u015e\u00b0\2\u062d\u062e\5"+
		"\u0198\u00cd\2\u062e\u063c\3\2\2\2\u062f\u0630\5\u015e\u00b0\2\u0630\u0632"+
		"\5\16\b\2\u0631\u0633\7>\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u0634\3\2\2\2\u0634\u0635\5\u0198\u00cd\2\u0635\u063c\3\2\2\2\u0636\u0638"+
		"\7\33\2\2\u0637\u0639\5\16\b\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2"+
		"\u0639\u063a\3\2\2\2\u063a\u063c\7~\2\2\u063b\u0623\3\2\2\2\u063b\u062c"+
		"\3\2\2\2\u063b\u062f\3\2\2\2\u063b\u0636\3\2\2\2\u063c\u00cf\3\2\2\2\u063d"+
		"\u063e\7~\2\2\u063e\u00d1\3\2\2\2\u063f\u0640\5\u00d4k\2\u0640\u0642\7"+
		"S\2\2\u0641\u0643\5\u00dco\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0645\7T\2\2\u0645\u064d\3\2\2\2\u0646\u0647\5\u00d4"+
		"k\2\u0647\u0648\7S\2\2\u0648\u0649\5\u00dco\2\u0649\u064a\7t\2\2\u064a"+
		"\u064b\7T\2\2\u064b\u064d\3\2\2\2\u064c\u063f\3\2\2\2\u064c\u0646\3\2"+
		"\2\2\u064d\u00d3\3\2\2\2\u064e\u0650\5\u00d8m\2\u064f\u0651\5\u0100\u0081"+
		"\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2\2\u0652\u0654"+
		"\7~\2\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2\2\2\u0655"+
		"\u0657\5\u00dan\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0662"+
		"\3\2\2\2\u0658\u065a\5\u00d8m\2\u0659\u065b\5\u0100\u0081\2\u065a\u0659"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\5\16\b\2"+
		"\u065d\u065f\7~\2\2\u065e\u0660\5\u00dan\2\u065f\u065e\3\2\2\2\u065f\u0660"+
		"\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u064e\3\2\2\2\u0661\u0658\3\2\2\2\u0662"+
		"\u00d5\3\2\2\2\u0663\u0665\5\u00d8m\2\u0664\u0666\5\u0100\u0081\2\u0665"+
		"\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\7~"+
		"\2\2\u0668\u066a\5\u00dan\2\u0669\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u066b\3\2\2\2\u066b\u066c\7z\2\2\u066c\u00d7\3\2\2\2\u066d\u0673\7\33"+
		"\2\2\u066e\u066f\7\33\2\2\u066f\u0673\7\17\2\2\u0670\u0671\7\33\2\2\u0671"+
		"\u0673\7<\2\2\u0672\u066d\3\2\2\2\u0672\u066e\3\2\2\2\u0672\u0670\3\2"+
		"\2\2\u0673\u00d9\3\2\2\2\u0674\u0675\7x\2\2\u0675\u0676\5\u00c4c\2\u0676"+
		"\u00db\3\2\2\2\u0677\u0678\bo\1\2\u0678\u0679\5\u00dep\2\u0679\u067f\3"+
		"\2\2\2\u067a\u067b\f\3\2\2\u067b\u067c\7t\2\2\u067c\u067e\5\u00dep\2\u067d"+
		"\u067a\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2"+
		"\2\2\u0680\u00dd\3\2\2\2\u0681\u067f\3\2\2\2\u0682\u0688\5\u00e0q\2\u0683"+
		"\u0684\5\u00e0q\2\u0684\u0685\7_\2\2\u0685\u0686\5`\61\2\u0686\u0688\3"+
		"\2\2\2\u0687\u0682\3\2\2\2\u0687\u0683\3\2\2\2\u0688\u00df\3\2\2\2\u0689"+
		"\u068a\7~\2\2\u068a\u00e1\3\2\2\2\u068b\u068e\5\u00e4s\2\u068c\u068e\5"+
		"\u00f2z\2\u068d\u068b\3\2\2\2\u068d\u068c\3\2\2\2\u068e\u00e3\3\2\2\2"+
		"\u068f\u0690\7~\2\2\u0690\u00e5\3\2\2\2\u0691\u0694\5\u00e8u\2\u0692\u0694"+
		"\5\u00eex\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u00e7\3\2\2"+
		"\2\u0695\u0698\5\u00eav\2\u0696\u0698\5\u00ecw\2\u0697\u0695\3\2\2\2\u0697"+
		"\u0696\3\2\2\2\u0698\u00e9\3\2\2\2\u0699\u069b\7&\2\2\u069a\u0699\3\2"+
		"\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\7*\2\2\u069d"+
		"\u069e\7~\2\2\u069e\u069f\7S\2\2\u069f\u06a0\5\u00f0y\2\u06a0\u06a1\7"+
		"T\2\2\u06a1\u00eb\3\2\2\2\u06a2\u06a4\7&\2\2\u06a3\u06a2\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\7*\2\2\u06a6\u06a7\5\u00e4"+
		"s\2\u06a7\u06a8\7S\2\2\u06a8\u06a9\5\u00f0y\2\u06a9\u06aa\7T\2\2\u06aa"+
		"\u00ed\3\2\2\2\u06ab\u06ad\7&\2\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2"+
		"\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06af\7*\2\2\u06af\u06b0\7S\2\2\u06b0\u06b1"+
		"\5\u00f0y\2\u06b1\u06b2\7T\2\2\u06b2\u00ef\3\2\2\2\u06b3\u06b5\5\u008a"+
		"F\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u00f1\3\2\2\2\u06b6"+
		"\u06b7\7~\2\2\u06b7\u00f3\3\2\2\2\u06b8\u06b9\7*\2\2\u06b9\u06ba\7~\2"+
		"\2\u06ba\u06bb\7_\2\2\u06bb\u06bc\5\u00f6|\2\u06bc\u06bd\7z\2\2\u06bd"+
		"\u00f5\3\2\2\2\u06be\u06c0\5\16\b\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3"+
		"\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\5\u00e2r\2\u06c2\u00f7\3\2\2\2"+
		"\u06c3\u06c5\7I\2\2\u06c4\u06c6\7F\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6"+
		"\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\5\16\b\2\u06c8\u06c9\5\n\6\2"+
		"\u06c9\u06ca\7z\2\2\u06ca\u06d1\3\2\2\2\u06cb\u06cc\7I\2\2\u06cc\u06cd"+
		"\7y\2\2\u06cd\u06ce\5\n\6\2\u06ce\u06cf\7z\2\2\u06cf\u06d1\3\2\2\2\u06d0"+
		"\u06c3\3\2\2\2\u06d0\u06cb\3\2\2\2\u06d1\u00f9\3\2\2\2\u06d2\u06d4\5\u0100"+
		"\u0081\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5"+
		"\u06d6\7I\2\2\u06d6\u06d8\7*\2\2\u06d7\u06d9\5\16\b\2\u06d8\u06d7\3\2"+
		"\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db\5\u00e2r\2\u06db"+
		"\u06dc\7z\2\2\u06dc\u00fb\3\2\2\2\u06dd\u06de\7\6\2\2\u06de\u06df\7O\2"+
		"\2\u06df\u06e0\7\u0087\2\2\u06e0\u06e1\7P\2\2\u06e1\u06e2\7z\2\2\u06e2"+
		"\u00fd\3\2\2\2\u06e3\u06e4\7\36\2\2\u06e4\u06e5\7\u0087\2\2\u06e5\u06e7"+
		"\7S\2\2\u06e6\u06e8\5\u008aF\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2"+
		"\u06e8\u06e9\3\2\2\2\u06e9\u06ee\7T\2\2\u06ea\u06eb\7\36\2\2\u06eb\u06ec"+
		"\7\u0087\2\2\u06ec\u06ee\5\u0092J\2\u06ed\u06e3\3\2\2\2\u06ed\u06ea\3"+
		"\2\2\2\u06ee\u00ff\3\2\2\2\u06ef\u06f0\b\u0081\1\2\u06f0\u06f1\5\u0102"+
		"\u0082\2\u06f1\u06f6\3\2\2\2\u06f2\u06f3\f\3\2\2\u06f3\u06f5\5\u0102\u0082"+
		"\2\u06f4\u06f2\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7"+
		"\3\2\2\2\u06f7\u0101\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fa\7Q\2\2\u06fa"+
		"\u06fb\7Q\2\2\u06fb\u06fc\5\u0106\u0084\2\u06fc\u06fd\7R\2\2\u06fd\u06fe"+
		"\7R\2\2\u06fe\u0701\3\2\2\2\u06ff\u0701\5\u0104\u0083\2\u0700\u06f9\3"+
		"\2\2\2\u0700\u06ff\3\2\2\2\u0701\u0103\3\2\2\2\u0702\u0703\7\4\2\2\u0703"+
		"\u0704\7O\2\2\u0704\u0706\5\u012e\u0098\2\u0705\u0707\7}\2\2\u0706\u0705"+
		"\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0709\7P\2\2\u0709"+
		"\u0713\3\2\2\2\u070a\u070b\7\4\2\2\u070b\u070c\7O\2\2\u070c\u070e\5`\61"+
		"\2\u070d\u070f\7}\2\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710"+
		"\3\2\2\2\u0710\u0711\7P\2\2\u0711\u0713\3\2\2\2\u0712\u0702\3\2\2\2\u0712"+
		"\u070a\3\2\2\2\u0713\u0105\3\2\2\2\u0714\u0716\b\u0084\1\2\u0715\u0717"+
		"\5\u0108\u0085\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u071c\3"+
		"\2\2\2\u0718\u0719\5\u0108\u0085\2\u0719\u071a\7}\2\2\u071a\u071c\3\2"+
		"\2\2\u071b\u0714\3\2\2\2\u071b\u0718\3\2\2\2\u071c\u0729\3\2\2\2\u071d"+
		"\u071e\f\5\2\2\u071e\u0720\7t\2\2\u071f\u0721\5\u0108\u0085\2\u0720\u071f"+
		"\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0728\3\2\2\2\u0722\u0723\f\3\2\2\u0723"+
		"\u0724\7t\2\2\u0724\u0725\5\u0108\u0085\2\u0725\u0726\7}\2\2\u0726\u0728"+
		"\3\2\2\2\u0727\u071d\3\2\2\2\u0727\u0722\3\2\2\2\u0728\u072b\3\2\2\2\u0729"+
		"\u0727\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u0107\3\2\2\2\u072b\u0729\3\2"+
		"\2\2\u072c\u072e\5\u010a\u0086\2\u072d\u072f\5\u0110\u0089\2\u072e\u072d"+
		"\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0109\3\2\2\2\u0730\u0733\7~\2\2\u0731"+
		"\u0733\5\u010c\u0087\2\u0732\u0730\3\2\2\2\u0732\u0731\3\2\2\2\u0733\u010b"+
		"\3\2\2\2\u0734\u0735\5\u010e\u0088\2\u0735\u0736\7y\2\2\u0736\u0737\7"+
		"~\2\2\u0737\u010d\3\2\2\2\u0738\u0739\7~\2\2\u0739\u010f\3\2\2\2\u073a"+
		"\u073b\7O\2\2\u073b\u073c\5\u0112\u008a\2\u073c\u073d\7P\2\2\u073d\u0111"+
		"\3\2\2\2\u073e\u0740\b\u008a\1\2\u073f\u0741\5\u0114\u008b\2\u0740\u073f"+
		"\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0746\3\2\2\2\u0742\u0743\f\3\2\2\u0743"+
		"\u0745\5\u0114\u008b\2\u0744\u0742\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744"+
		"\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0113\3\2\2\2\u0748\u0746\3\2\2\2\u0749"+
		"\u074a\7O\2\2\u074a\u074b\5\u0112\u008a\2\u074b\u074c\7P\2\2\u074c\u0756"+
		"\3\2\2\2\u074d\u074e\7Q\2\2\u074e\u074f\5\u0112\u008a\2\u074f\u0750\7"+
		"R\2\2\u0750\u0756\3\2\2\2\u0751\u0752\7S\2\2\u0752\u0753\5\u0112\u008a"+
		"\2\u0753\u0754\7T\2\2\u0754\u0756\3\2\2\2\u0755\u0749\3\2\2\2\u0755\u074d"+
		"\3\2\2\2\u0755\u0751\3\2\2\2\u0756\u0115\3\2\2\2\u0757\u075c\5\u0118\u008d"+
		"\2\u0758\u0759\7t\2\2\u0759\u075b\5\u0118\u008d\2\u075a\u0758\3\2\2\2"+
		"\u075b\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0117"+
		"\3\2\2\2\u075e\u075c\3\2\2\2\u075f\u0761\5\u011a\u008e\2\u0760\u0762\5"+
		"\u0148\u00a5\2\u0761\u0760\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0119\3\2"+
		"\2\2\u0763\u0769\5\u011c\u008f\2\u0764\u0765\5\u011e\u0090\2\u0765\u0766"+
		"\5\u0120\u0091\2\u0766\u0767\5\u0122\u0092\2\u0767\u0769\3\2\2\2\u0768"+
		"\u0763\3\2\2\2\u0768\u0764\3\2\2\2\u0769\u011b\3\2\2\2\u076a\u076c\5\u0124"+
		"\u0093\2\u076b\u076a\3\2\2\2\u076c\u076f\3\2\2\2\u076d\u076b\3\2\2\2\u076d"+
		"\u076e\3\2\2\2\u076e\u0770\3\2\2\2\u076f\u076d\3\2\2\2\u0770\u0771\5\u011e"+
		"\u0090\2\u0771\u011d\3\2\2\2\u0772\u0773\b\u0090\1\2\u0773\u0775\5\u012c"+
		"\u0097\2\u0774\u0776\5\u0100\u0081\2\u0775\u0774\3\2\2\2\u0775\u0776\3"+
		"\2\2\2\u0776\u077c\3\2\2\2\u0777\u0778\7O\2\2\u0778\u0779\5\u011c\u008f"+
		"\2\u0779\u077a\7P\2\2\u077a\u077c\3\2\2\2\u077b\u0772\3\2\2\2\u077b\u0777"+
		"\3\2\2\2\u077c\u078a\3\2\2\2\u077d\u077e\f\5\2\2\u077e\u0789\5\u0120\u0091"+
		"\2\u077f\u0780\f\4\2\2\u0780\u0782\7Q\2\2\u0781\u0783\5`\61\2\u0782\u0781"+
		"\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786\7R\2\2\u0785"+
		"\u0787\5\u0100\u0081\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0789"+
		"\3\2\2\2\u0788\u077d\3\2\2\2\u0788\u077f\3\2\2\2\u0789\u078c\3\2\2\2\u078a"+
		"\u0788\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u011f\3\2\2\2\u078c\u078a\3\2"+
		"\2\2\u078d\u078e\7O\2\2\u078e\u078f\5\u013a\u009e\2\u078f\u0791\7P\2\2"+
		"\u0790\u0792\5\u0126\u0094\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2\2\u0792"+
		"\u0794\3\2\2\2\u0793\u0795\5\u012a\u0096\2\u0794\u0793\3\2\2\2\u0794\u0795"+
		"\3\2\2\2\u0795\u0797\3\2\2\2\u0796\u0798\5\u01b4\u00db\2\u0797\u0796\3"+
		"\2\2\2\u0797\u0798\3\2\2\2\u0798\u079a\3\2\2\2\u0799\u079b\5\u0100\u0081"+
		"\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u0121\3\2\2\2\u079c\u079d"+
		"\7v\2\2\u079d\u079f\5\u00c6d\2\u079e\u07a0\5\u0130\u0099\2\u079f\u079e"+
		"\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u0123\3\2\2\2\u07a1\u07a3\7W\2\2\u07a2"+
		"\u07a4\5\u0100\u0081\2\u07a3\u07a2\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6"+
		"\3\2\2\2\u07a5\u07a7\5\u0126\u0094\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3"+
		"\2\2\2\u07a7\u07b9\3\2\2\2\u07a8\u07aa\7[\2\2\u07a9\u07ab\5\u0100\u0081"+
		"\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07b9\3\2\2\2\u07ac\u07ae"+
		"\7p\2\2\u07ad\u07af\5\u0100\u0081\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3"+
		"\2\2\2\u07af\u07b9\3\2\2\2\u07b0\u07b1\5\16\b\2\u07b1\u07b3\7W\2\2\u07b2"+
		"\u07b4\5\u0100\u0081\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6"+
		"\3\2\2\2\u07b5\u07b7\5\u0126\u0094\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3"+
		"\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07a1\3\2\2\2\u07b8\u07a8\3\2\2\2\u07b8"+
		"\u07ac\3\2\2\2\u07b8\u07b0\3\2\2\2\u07b9\u0125\3\2\2\2\u07ba\u07bc\5\u0128"+
		"\u0095\2\u07bb\u07bd\5\u0126\u0094\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3"+
		"\2\2\2\u07bd\u0127\3\2\2\2\u07be\u07bf\t\6\2\2\u07bf\u0129\3\2\2\2\u07c0"+
		"\u07c1\t\7\2\2\u07c1\u012b\3\2\2\2\u07c2\u07c4\7}\2\2\u07c3\u07c2\3\2"+
		"\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\5\6\4\2\u07c6"+
		"\u012d\3\2\2\2\u07c7\u07c9\5\u00c4c\2\u07c8\u07ca\5\u0130\u0099\2\u07c9"+
		"\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u012f\3\2\2\2\u07cb\u07d4\5\u0132"+
		"\u009a\2\u07cc\u07ce\5\u0134\u009b\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3"+
		"\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\5\u0120\u0091\2\u07d0\u07d1\5\u0122"+
		"\u0092\2\u07d1\u07d4\3\2\2\2\u07d2\u07d4\5\u0136\u009c\2\u07d3\u07cb\3"+
		"\2\2\2\u07d3\u07cd\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d4\u0131\3\2\2\2\u07d5"+
		"\u07db\5\u0134\u009b\2\u07d6\u07d8\5\u0124\u0093\2\u07d7\u07d9\5\u0132"+
		"\u009a\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07db\3\2\2\2\u07da"+
		"\u07d5\3\2\2\2\u07da\u07d6\3\2\2\2\u07db\u0133\3\2\2\2\u07dc\u07dd\b\u009b"+
		"\1\2\u07dd\u07eb\5\u0120\u0091\2\u07de\u07e0\7Q\2\2\u07df\u07e1\5`\61"+
		"\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4"+
		"\7R\2\2\u07e3\u07e5\5\u0100\u0081\2\u07e4\u07e3\3\2\2\2\u07e4\u07e5\3"+
		"\2\2\2\u07e5\u07eb\3\2\2\2\u07e6\u07e7\7O\2\2\u07e7\u07e8\5\u0132\u009a"+
		"\2\u07e8\u07e9\7P\2\2\u07e9\u07eb\3\2\2\2\u07ea\u07dc\3\2\2\2\u07ea\u07de"+
		"\3\2\2\2\u07ea\u07e6\3\2\2\2\u07eb\u07f9\3\2\2\2\u07ec\u07ed\f\7\2\2\u07ed"+
		"\u07f8\5\u0120\u0091\2\u07ee\u07ef\f\5\2\2\u07ef\u07f1\7Q\2\2\u07f0\u07f2"+
		"\5`\61\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u07f5\7R\2\2\u07f4\u07f6\5\u0100\u0081\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6"+
		"\3\2\2\2\u07f6\u07f8\3\2\2\2\u07f7\u07ec\3\2\2\2\u07f7\u07ee\3\2\2\2\u07f8"+
		"\u07fb\3\2\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u0135\3\2"+
		"\2\2\u07fb\u07f9\3\2\2\2\u07fc\u0801\5\u0138\u009d\2\u07fd\u07fe\5\u0124"+
		"\u0093\2\u07fe\u07ff\5\u0136\u009c\2\u07ff\u0801\3\2\2\2\u0800\u07fc\3"+
		"\2\2\2\u0800\u07fd\3\2\2\2\u0801\u0137\3\2\2\2\u0802\u0803\b\u009d\1\2"+
		"\u0803\u0804\7}\2\2\u0804\u0812\3\2\2\2\u0805\u0806\f\5\2\2\u0806\u0811"+
		"\5\u0120\u0091\2\u0807\u0808\f\4\2\2\u0808\u080a\7Q\2\2\u0809\u080b\5"+
		"`\61\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2\2\u080c"+
		"\u080e\7R\2\2\u080d\u080f\5\u0100\u0081\2\u080e\u080d\3\2\2\2\u080e\u080f"+
		"\3\2\2\2\u080f\u0811\3\2\2\2\u0810\u0805\3\2\2\2\u0810\u0807\3\2\2\2\u0811"+
		"\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0139\3\2"+
		"\2\2\u0814\u0812\3\2\2\2\u0815\u0817\5\u013c\u009f\2\u0816\u0815\3\2\2"+
		"\2\u0816\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818\u081a\7}\2\2\u0819\u0818"+
		"\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u0820\3\2\2\2\u081b\u081c\5\u013c\u009f"+
		"\2\u081c\u081d\7t\2\2\u081d\u081e\7}\2\2\u081e\u0820\3\2\2\2\u081f\u0816"+
		"\3\2\2\2\u081f\u081b\3\2\2\2\u0820\u013b\3\2\2\2\u0821\u0822\b\u009f\1"+
		"\2\u0822\u0823\5\u013e\u00a0\2\u0823\u0829\3\2\2\2\u0824\u0825\f\3\2\2"+
		"\u0825\u0826\7t\2\2\u0826\u0828\5\u013e\u00a0\2\u0827\u0824\3\2\2\2\u0828"+
		"\u082b\3\2\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u013d\3\2"+
		"\2\2\u082b\u0829\3\2\2\2\u082c\u082e\5\u0100\u0081\2\u082d\u082c\3\2\2"+
		"\2\u082d\u082e\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0830\5\u00b4[\2\u0830"+
		"\u0831\5\u011a\u008e\2\u0831\u084c\3\2\2\2\u0832\u0834\5\u0100\u0081\2"+
		"\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836"+
		"\5\u00b4[\2\u0836\u0837\5\u011a\u008e\2\u0837\u0838\7_\2\2\u0838\u0839"+
		"\5\u014c\u00a7\2\u0839\u084c\3\2\2\2\u083a\u083c\5\u0100\u0081\2\u083b"+
		"\u083a\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\5\u00b4"+
		"[\2\u083e\u0840\5\u0130\u0099\2\u083f\u083e\3\2\2\2\u083f\u0840\3\2\2"+
		"\2\u0840\u084c\3\2\2\2\u0841\u0843\5\u0100\u0081\2\u0842\u0841\3\2\2\2"+
		"\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846\5\u00b4[\2\u0845"+
		"\u0847\5\u0130\u0099\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u0849\7_\2\2\u0849\u084a\5\u014c\u00a7\2\u084a\u084c\3"+
		"\2\2\2\u084b\u082d\3\2\2\2\u084b\u0833\3\2\2\2\u084b\u083b\3\2\2\2\u084b"+
		"\u0842\3\2\2\2\u084c\u013f\3\2\2\2\u084d\u084f\5\u0100\u0081\2\u084e\u084d"+
		"\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3\2\2\2\u0850\u0852\5\u00b8]"+
		"\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855"+
		"\5\u0142\u00a2\2\u0854\u0856\5\u016c\u00b7\2\u0855\u0854\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\5\u0146\u00a4\2\u0858\u0141"+
		"\3\2\2\2\u0859\u085b\5\u00c0a\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2"+
		"\2\u085b\u085c\3\2\2\2\u085c\u085d\5\u0144\u00a3\2\u085d\u0143\3\2\2\2"+
		"\u085e\u085f\5\u012c\u0097\2\u085f\u0860\7O\2\2\u0860\u0861\5\u013a\u009e"+
		"\2\u0861\u0862\7P\2\2\u0862\u0145\3\2\2\2\u0863\u0865\5\u0184\u00c3\2"+
		"\u0864\u0863\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u086f"+
		"\5h\65\2\u0867\u086f\5\u01aa\u00d6\2\u0868\u0869\7_\2\2\u0869\u086a\7"+
		"\25\2\2\u086a\u086f\7z\2\2\u086b\u086c\7_\2\2\u086c\u086d\7\26\2\2\u086d"+
		"\u086f\7z\2\2\u086e\u0864\3\2\2\2\u086e\u0867\3\2\2\2\u086e\u0868\3\2"+
		"\2\2\u086e\u086b\3\2\2\2\u086f\u0147\3\2\2\2\u0870\u0876\5\u014a\u00a6"+
		"\2\u0871\u0872\7O\2\2\u0872\u0873\5&\24\2\u0873\u0874\7P\2\2\u0874\u0876"+
		"\3\2\2\2\u0875\u0870\3\2\2\2\u0875\u0871\3\2\2\2\u0876\u0149\3\2\2\2\u0877"+
		"\u0878\7_\2\2\u0878\u087b\5\u014c\u00a7\2\u0879\u087b\5\u0150\u00a9\2"+
		"\u087a\u0877\3\2\2\2\u087a\u0879\3\2\2\2\u087b\u014b\3\2\2\2\u087c\u087f"+
		"\5Z.\2\u087d\u087f\5\u0150\u00a9\2\u087e\u087c\3\2\2\2\u087e\u087d\3\2"+
		"\2\2\u087f\u014d\3\2\2\2\u0880\u0885\5\u014c\u00a7\2\u0881\u0882\7t\2"+
		"\2\u0882\u0884\5\u014c\u00a7\2\u0883\u0881\3\2\2\2\u0884\u0887\3\2\2\2"+
		"\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u014f\3\2\2\2\u0887\u0885"+
		"\3\2\2\2\u0888\u0889\7S\2\2\u0889\u088b\5\u014e\u00a8\2\u088a\u088c\7"+
		"t\2\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d"+
		"\u088e\7T\2\2\u088e\u0892\3\2\2\2\u088f\u0890\7S\2\2\u0890\u0892\7T\2"+
		"\2\u0891\u0888\3\2\2\2\u0891\u088f\3\2\2\2\u0892\u0151\3\2\2\2\u0893\u0896"+
		"\7~\2\2\u0894\u0896\5\u0198\u00cd\2\u0895\u0893\3\2\2\2\u0895\u0894\3"+
		"\2\2\2\u0896\u0153\3\2\2\2\u0897\u0898\5\u0158\u00ad\2\u0898\u0899\5\u0156"+
		"\u00ac\2\u0899\u0155\3\2\2\2\u089a\u089c\7S\2\2\u089b\u089d\5\u0160\u00b1"+
		"\2\u089c\u089b\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u089f"+
		"\7T\2\2\u089f\u0157\3\2\2\2\u08a0\u08a2\5\u015e\u00b0\2\u08a1\u08a3\5"+
		"\u0100\u0081\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a5\3\2"+
		"\2\2\u08a4\u08a6\5\16\b\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u08a9\5\u015a\u00ae\2\u08a8\u08aa\5\u015c\u00af\2"+
		"\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ac\3\2\2\2\u08ab\u08ad"+
		"\5\u0172\u00ba\2\u08ac\u08ab\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08b6\3"+
		"\2\2\2\u08ae\u08b0\5\u015e\u00b0\2\u08af\u08b1\5\u0100\u0081\2\u08b0\u08af"+
		"\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b3\3\2\2\2\u08b2\u08b4\5\u0172\u00ba"+
		"\2\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2\2\2\u08b5\u08a0"+
		"\3\2\2\2\u08b5\u08ae\3\2\2\2\u08b6\u0159\3\2\2\2\u08b7\u08b9\5\16\b\2"+
		"\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb"+
		"\5\u0152\u00aa\2\u08bb\u015b\3\2\2\2\u08bc\u08bd\7 \2\2\u08bd\u015d\3"+
		"\2\2\2\u08be\u08bf\t\b\2\2\u08bf\u015f\3\2\2\2\u08c0\u08c2\5\u0162\u00b2"+
		"\2\u08c1\u08c3\5\u0160\u00b1\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2"+
		"\u08c3\u08ca\3\2\2\2\u08c4\u08c5\5\u017c\u00bf\2\u08c5\u08c7\7x\2\2\u08c6"+
		"\u08c8\5\u0160\u00b1\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08ca"+
		"\3\2\2\2\u08c9\u08c0\3\2\2\2\u08c9\u08c4\3\2\2\2\u08ca\u0161\3\2\2\2\u08cb"+
		"\u08d3\5\u0164\u00b3\2\u08cc\u08d3\5\u0140\u00a1\2\u08cd\u08d3\5\u00f8"+
		"}\2\u08ce\u08d3\5\u00acW\2\u08cf\u08d3\5\u0190\u00c9\2\u08d0\u08d3\5\u0098"+
		"M\2\u08d1\u08d3\5\u00aeX\2\u08d2\u08cb\3\2\2\2\u08d2\u08cc\3\2\2\2\u08d2"+
		"\u08cd\3\2\2\2\u08d2\u08ce\3\2\2\2\u08d2\u08cf\3\2\2\2\u08d2\u08d0\3\2"+
		"\2\2\u08d2\u08d1\3\2\2\2\u08d3\u0163\3\2\2\2\u08d4\u08d5\5\u0166\u00b4"+
		"\2\u08d5\u08d6\7z\2\2\u08d6\u0165\3\2\2\2\u08d7\u08d9\5\u0100\u0081\2"+
		"\u08d8\u08d7\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08db\3\2\2\2\u08da\u08dc"+
		"\5\u00b8]\2\u08db\u08da\3\2\2\2\u08db\u08dc\3\2\2\2\u08dc\u08dd\3\2\2"+
		"\2\u08dd\u08e1\5\u00c0a\2\u08de\u08e0\5\u0124\u0093\2\u08df\u08de\3\2"+
		"\2\2\u08e0\u08e3\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2"+
		"\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4\u08e6\5\u0168\u00b5\2\u08e5\u08e4"+
		"\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u0167\3\2\2\2\u08e7\u08e8\b\u00b5\1"+
		"\2\u08e8\u08e9\5\u016a\u00b6\2\u08e9\u08ef\3\2\2\2\u08ea\u08eb\f\3\2\2"+
		"\u08eb\u08ec\7t\2\2\u08ec\u08ee\5\u016a\u00b6\2\u08ed\u08ea\3\2\2\2\u08ee"+
		"\u08f1\3\2\2\2\u08ef\u08ed\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u0169\3\2"+
		"\2\2\u08f1\u08ef\3\2\2\2\u08f2\u08f4\5\u012c\u0097\2\u08f3\u08f5\5\u016c"+
		"\u00b7\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f7\3\2\2\2\u08f6"+
		"\u08f8\5\u0170\u00b9\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u090b"+
		"\3\2\2\2\u08f9\u08fc\5\u012c\u0097\2\u08fa\u08fb\7_\2\2\u08fb\u08fd\5"+
		"\u014c\u00a7\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u090b\3\2"+
		"\2\2\u08fe\u0900\5\u012c\u0097\2\u08ff\u0901\5\u0150\u00a9\2\u0900\u08ff"+
		"\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u090b\3\2\2\2\u0902\u0904\7~\2\2\u0903"+
		"\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0906\3\2\2\2\u0905\u0907\5\u0100"+
		"\u0081\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908\3\2\2\2\u0908"+
		"\u0909\7x\2\2\u0909\u090b\5`\61\2\u090a\u08f2\3\2\2\2\u090a\u08f9\3\2"+
		"\2\2\u090a\u08fe\3\2\2\2\u090a\u0903\3\2\2\2\u090b\u016b\3\2\2\2\u090c"+
		"\u090d\b\u00b7\1\2\u090d\u090e\5\u016e\u00b8\2\u090e\u0913\3\2\2\2\u090f"+
		"\u0910\f\3\2\2\u0910\u0912\5\u016e\u00b8\2\u0911\u090f\3\2\2\2\u0912\u0915"+
		"\3\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u016d\3\2\2\2\u0915"+
		"\u0913\3\2\2\2\u0916\u0917\t\t\2\2\u0917\u016f\3\2\2\2\u0918\u0919\7_"+
		"\2\2\u0919\u091a\7\u0081\2\2\u091a\u091b\b\u00b9\1\2\u091b\u0171\3\2\2"+
		"\2\u091c\u091d\7x\2\2\u091d\u091e\5\u0174\u00bb\2\u091e\u0173\3\2\2\2"+
		"\u091f\u0920\b\u00bb\1\2\u0920\u0922\5\u0176\u00bc\2\u0921\u0923\7}\2"+
		"\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u092c\3\2\2\2\u0924\u0925"+
		"\f\3\2\2\u0925\u0926\7t\2\2\u0926\u0928\5\u0176\u00bc\2\u0927\u0929\7"+
		"}\2\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092b\3\2\2\2\u092a"+
		"\u0924\3\2\2\2\u092b\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2"+
		"\2\2\u092d\u0175\3\2\2\2\u092e\u092c\3\2\2\2\u092f\u0931\5\u0100\u0081"+
		"\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0945"+
		"\5\u017a\u00be\2\u0933\u0935\5\u0100\u0081\2\u0934\u0933\3\2\2\2\u0934"+
		"\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0938\7J\2\2\u0937\u0939\5\u017c"+
		"\u00bf\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2\2\u093a"+
		"\u0945\5\u017a\u00be\2\u093b\u093d\5\u0100\u0081\2\u093c\u093b\3\2\2\2"+
		"\u093c\u093d\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0940\5\u017c\u00bf\2\u093f"+
		"\u0941\7J\2\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\3\2"+
		"\2\2\u0942\u0943\5\u017a\u00be\2\u0943\u0945\3\2\2\2\u0944\u0930\3\2\2"+
		"\2\u0944\u0934\3\2\2\2\u0944\u093c\3\2\2\2\u0945\u0177\3\2\2\2\u0946\u0948"+
		"\5\16\b\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2"+
		"\u0949\u094c\5\u0152\u00aa\2\u094a\u094c\5\u00ccg\2\u094b\u0947\3\2\2"+
		"\2\u094b\u094a\3\2\2\2\u094c\u0179\3\2\2\2\u094d\u094e\5\u0178\u00bd\2"+
		"\u094e\u017b\3\2\2\2\u094f\u0950\t\n\2\2\u0950\u017d\3\2\2\2\u0951\u0952"+
		"\7.\2\2\u0952\u0953\5\u0180\u00c1\2\u0953\u017f\3\2\2\2\u0954\u0956\5"+
		"\u00c4c\2\u0955\u0957\5\u0182\u00c2\2\u0956\u0955\3\2\2\2\u0956\u0957"+
		"\3\2\2\2\u0957\u0181\3\2\2\2\u0958\u095a\5\u0124\u0093\2\u0959\u095b\5"+
		"\u0182\u00c2\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u0183\3\2"+
		"\2\2\u095c\u095d\7x\2\2\u095d\u095e\5\u0186\u00c4\2\u095e\u0185\3\2\2"+
		"\2\u095f\u0961\5\u0188\u00c5\2\u0960\u0962\7}\2\2\u0961\u0960\3\2\2\2"+
		"\u0961\u0962\3\2\2\2\u0962\u096b\3\2\2\2\u0963\u0965\5\u0188\u00c5\2\u0964"+
		"\u0966\7}\2\2\u0965\u0964\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2"+
		"\2\2\u0967\u0968\7";
	private static final String _serializedATNSegment1 =
		"t\2\2\u0968\u0969\5\u0186\u00c4\2\u0969\u096b\3\2\2\2\u096a\u095f\3\2"+
		"\2\2\u096a\u0963\3\2\2\2\u096b\u0187\3\2\2\2\u096c\u096d\5\u018a\u00c6"+
		"\2\u096d\u096f\7O\2\2\u096e\u0970\5&\24\2\u096f\u096e\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972\7P\2\2\u0972\u0977\3\2\2\2\u0973"+
		"\u0974\5\u018a\u00c6\2\u0974\u0975\5\u0150\u00a9\2\u0975\u0977\3\2\2\2"+
		"\u0976\u096c\3\2\2\2\u0976\u0973\3\2\2\2\u0977\u0189\3\2\2\2\u0978\u097b"+
		"\5\u0178\u00bd\2\u0979\u097b\7~\2\2\u097a\u0978\3\2\2\2\u097a\u0979\3"+
		"\2\2\2\u097b\u018b\3\2\2\2\u097c\u097d\7.\2\2\u097d\u097e\5\u01c0\u00e1"+
		"\2\u097e\u018d\3\2\2\2\u097f\u0980\7.\2\2\u0980\u0981\7\u0087\2\2\u0981"+
		"\u0985\7~\2\2\u0982\u0983\7.\2\2\u0983\u0985\7\u008b\2\2\u0984\u097f\3"+
		"\2\2\2\u0984\u0982\3\2\2\2\u0985\u018f\3\2\2\2\u0986\u0987\7>\2\2\u0987"+
		"\u0988\7`\2\2\u0988\u0989\5\u0192\u00ca\2\u0989\u098a\7a\2\2\u098a\u098b"+
		"\5\u0092J\2\u098b\u0191\3\2\2\2\u098c\u098d\b\u00ca\1\2\u098d\u098e\5"+
		"\u0194\u00cb\2\u098e\u0994\3\2\2\2\u098f\u0990\f\3\2\2\u0990\u0991\7t"+
		"\2\2\u0991\u0993\5\u0194\u00cb\2\u0992\u098f\3\2\2\2\u0993\u0996\3\2\2"+
		"\2\u0994\u0992\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0193\3\2\2\2\u0996\u0994"+
		"\3\2\2\2\u0997\u099a\5\u0196\u00cc\2\u0998\u099a\5\u013e\u00a0\2\u0999"+
		"\u0997\3\2\2\2\u0999\u0998\3\2\2\2\u099a\u0195\3\2\2\2\u099b\u099d\7\17"+
		"\2\2\u099c\u099e\7}\2\2\u099d\u099c\3\2\2\2\u099d\u099e\3\2\2\2\u099e"+
		"\u09a0\3\2\2\2\u099f\u09a1\7~\2\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2"+
		"\2\2\u09a1\u09cc\3\2\2\2\u09a2\u09a4\7\17\2\2\u09a3\u09a5\7~\2\2\u09a4"+
		"\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\7_"+
		"\2\2\u09a7\u09cc\5\u012e\u0098\2\u09a8\u09aa\7F\2\2\u09a9\u09ab\7}\2\2"+
		"\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ad\3\2\2\2\u09ac\u09ae"+
		"\7~\2\2\u09ad\u09ac\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09cc\3\2\2\2\u09af"+
		"\u09b1\7F\2\2\u09b0\u09b2\7~\2\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2\3\2\2"+
		"\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\7_\2\2\u09b4\u09cc\5\u012e\u0098\2"+
		"\u09b5\u09b6\7>\2\2\u09b6\u09b7\7`\2\2\u09b7\u09b8\5\u0192\u00ca\2\u09b8"+
		"\u09b9\7a\2\2\u09b9\u09bb\7\17\2\2\u09ba\u09bc\7}\2\2\u09bb\u09ba\3\2"+
		"\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09be\3\2\2\2\u09bd\u09bf\7~\2\2\u09be"+
		"\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09cc\3\2\2\2\u09c0\u09c1\7>"+
		"\2\2\u09c1\u09c2\7`\2\2\u09c2\u09c3\5\u0192\u00ca\2\u09c3\u09c4\7a\2\2"+
		"\u09c4\u09c6\7\17\2\2\u09c5\u09c7\7~\2\2\u09c6\u09c5\3\2\2\2\u09c6\u09c7"+
		"\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c9\7_\2\2\u09c9\u09ca\5\6\4\2\u09ca"+
		"\u09cc\3\2\2\2\u09cb\u099b\3\2\2\2\u09cb\u09a2\3\2\2\2\u09cb\u09a8\3\2"+
		"\2\2\u09cb\u09af\3\2\2\2\u09cb\u09b5\3\2\2\2\u09cb\u09c0\3\2\2\2\u09cc"+
		"\u0197\3\2\2\2\u09cd\u09ce\5\u019c\u00cf\2\u09ce\u09d0\7`\2\2\u09cf\u09d1"+
		"\5\u019e\u00d0\2\u09d0\u09cf\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3"+
		"\2\2\2\u09d2\u09d3\7a\2\2\u09d3\u0199\3\2\2\2\u09d4\u09e4\5\u0198\u00cd"+
		"\2\u09d5\u09d6\5\u018c\u00c7\2\u09d6\u09d8\7`\2\2\u09d7\u09d9\5\u019e"+
		"\u00d0\2\u09d8\u09d7\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da\3\2\2\2\u09da"+
		"\u09db\7a\2\2\u09db\u09e4\3\2\2\2\u09dc\u09dd\5\u018e\u00c8\2\u09dd\u09df"+
		"\7`\2\2\u09de\u09e0\5\u019e\u00d0\2\u09df\u09de\3\2\2\2\u09df\u09e0\3"+
		"\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\7a\2\2\u09e2\u09e4\3\2\2\2\u09e3"+
		"\u09d4\3\2\2\2\u09e3\u09d5\3\2\2\2\u09e3\u09dc\3\2\2\2\u09e4\u019b\3\2"+
		"\2\2\u09e5\u09e6\7~\2\2\u09e6\u019d\3\2\2\2\u09e7\u09e8\b\u00d0\1\2\u09e8"+
		"\u09ea\5\u01a0\u00d1\2\u09e9\u09eb\7}\2\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb"+
		"\3\2\2\2\u09eb\u09f4\3\2\2\2\u09ec\u09ed\f\3\2\2\u09ed\u09ee\7t\2\2\u09ee"+
		"\u09f0\5\u01a0\u00d1\2\u09ef\u09f1\7}\2\2\u09f0\u09ef\3\2\2\2\u09f0\u09f1"+
		"\3\2\2\2\u09f1\u09f3\3\2\2\2\u09f2\u09ec\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4"+
		"\u09f2\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u019f\3\2\2\2\u09f6\u09f4\3\2"+
		"\2\2\u09f7\u09fb\5`\61\2\u09f8\u09fb\5\u012e\u0098\2\u09f9\u09fb\5\6\4"+
		"\2\u09fa\u09f7\3\2\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09f9\3\2\2\2\u09fb\u01a1"+
		"\3\2\2\2\u09fc\u09fd\7F\2\2\u09fd\u09fe\5\16\b\2\u09fe\u09ff\7~\2\2\u09ff"+
		"\u0a08\3\2\2\2\u0a00\u0a01\7F\2\2\u0a01\u0a03\5\16\b\2\u0a02\u0a04\7>"+
		"\2\2\u0a03\u0a02\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05"+
		"\u0a06\5\u0198\u00cd\2\u0a06\u0a08\3\2\2\2\u0a07\u09fc\3\2\2\2\u0a07\u0a00"+
		"\3\2\2\2\u0a08\u01a3\3\2\2\2\u0a09\u0a0b\7\36\2\2\u0a0a\u0a09\3\2\2\2"+
		"\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0d\7>\2\2\u0a0d\u0a0e"+
		"\5\u0092J\2\u0a0e\u01a5\3\2\2\2\u0a0f\u0a10\7>\2\2\u0a10\u0a11\7`\2\2"+
		"\u0a11\u0a12\7a\2\2\u0a12\u0a13\5\u0092J\2\u0a13\u01a7\3\2\2\2\u0a14\u0a15"+
		"\7C\2\2\u0a15\u0a16\5h\65\2\u0a16\u0a17\5\u01ac\u00d7\2\u0a17\u01a9\3"+
		"\2\2\2\u0a18\u0a1a\7C\2\2\u0a19\u0a1b\5\u0184\u00c3\2\u0a1a\u0a19\3\2"+
		"\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\5h\65\2\u0a1d"+
		"\u0a1e\5\u01ac\u00d7\2\u0a1e\u01ab\3\2\2\2\u0a1f\u0a21\5\u01ae\u00d8\2"+
		"\u0a20\u0a22\5\u01ac\u00d7\2\u0a21\u0a20\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22"+
		"\u01ad\3\2\2\2\u0a23\u0a24\7\13\2\2\u0a24\u0a25\7O\2\2\u0a25\u0a26\5\u01b0"+
		"\u00d9\2\u0a26\u0a27\7P\2\2\u0a27\u0a28\5h\65\2\u0a28\u01af\3\2\2\2\u0a29"+
		"\u0a2b\5\u0100\u0081\2\u0a2a\u0a29\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a2c"+
		"\3\2\2\2\u0a2c\u0a2d\5\u00c4c\2\u0a2d\u0a2e\5\u011a\u008e\2\u0a2e\u0a38"+
		"\3\2\2\2\u0a2f\u0a31\5\u0100\u0081\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3"+
		"\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a34\5\u00c4c\2\u0a33\u0a35\5\u0130"+
		"\u0099\2\u0a34\u0a33\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a38\3\2\2\2\u0a36"+
		"\u0a38\7}\2\2\u0a37\u0a2a\3\2\2\2\u0a37\u0a30\3\2\2\2\u0a37\u0a36\3\2"+
		"\2\2\u0a38\u01b1\3\2\2\2\u0a39\u0a3b\7A\2\2\u0a3a\u0a3c\5Z.\2\u0a3b\u0a3a"+
		"\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u01b3\3\2\2\2\u0a3d\u0a40\5\u01b6\u00dc"+
		"\2\u0a3e\u0a40\5\u01ba\u00de\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a3e\3\2\2\2"+
		"\u0a40\u01b5\3\2\2\2\u0a41\u0a42\7A\2\2\u0a42\u0a44\7O\2\2\u0a43\u0a45"+
		"\5\u01b8\u00dd\2\u0a44\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3"+
		"\2\2\2\u0a46\u0a47\7P\2\2\u0a47\u01b7\3\2\2\2\u0a48\u0a49\b\u00dd\1\2"+
		"\u0a49\u0a4b\5\u012e\u0098\2\u0a4a\u0a4c\7}\2\2\u0a4b\u0a4a\3\2\2\2\u0a4b"+
		"\u0a4c\3\2\2\2\u0a4c\u0a55\3\2\2\2\u0a4d\u0a4e\f\3\2\2\u0a4e\u0a4f\7t"+
		"\2\2\u0a4f\u0a51\5\u012e\u0098\2\u0a50\u0a52\7}\2\2\u0a51\u0a50\3\2\2"+
		"\2\u0a51\u0a52\3\2\2\2\u0a52\u0a54\3\2\2\2\u0a53\u0a4d\3\2\2\2\u0a54\u0a57"+
		"\3\2\2\2\u0a55\u0a53\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u01b9\3\2\2\2\u0a57"+
		"\u0a55\3\2\2\2\u0a58\u0a59\7,\2\2\u0a59\u0a5a\7O\2\2\u0a5a\u0a5b\5`\61"+
		"\2\u0a5b\u0a5c\7P\2\2\u0a5c\u0a5f\3\2\2\2\u0a5d\u0a5f\7,\2\2\u0a5e\u0a58"+
		"\3\2\2\2\u0a5e\u0a5d\3\2\2\2\u0a5f\u01bb\3\2\2\2\u0a60\u0a61\7a\2\2\u0a61"+
		"\u0a62\7a\2\2\u0a62\u01bd\3\2\2\2\u0a63\u0a64\7a\2\2\u0a64\u0a65\7a\2"+
		"\2\u0a65\u0a66\7_\2\2\u0a66\u01bf\3\2\2\2\u0a67\u0a98\7+\2\2\u0a68\u0a98"+
		"\7\26\2\2\u0a69\u0a6a\7+\2\2\u0a6a\u0a6b\7Q\2\2\u0a6b\u0a98\7R\2\2\u0a6c"+
		"\u0a6d\7\26\2\2\u0a6d\u0a6e\7Q\2\2\u0a6e\u0a98\7R\2\2\u0a6f\u0a98\7U\2"+
		"\2\u0a70\u0a98\7V\2\2\u0a71\u0a98\7W\2\2\u0a72\u0a98\7X\2\2\u0a73\u0a98"+
		"\7Y\2\2\u0a74\u0a98\7Z\2\2\u0a75\u0a98\7[\2\2\u0a76\u0a98\7\\\2\2\u0a77"+
		"\u0a98\7]\2\2\u0a78\u0a98\7^\2\2\u0a79\u0a98\7_\2\2\u0a7a\u0a98\7`\2\2"+
		"\u0a7b\u0a98\7a\2\2\u0a7c\u0a98\7b\2\2\u0a7d\u0a98\7c\2\2\u0a7e\u0a98"+
		"\7d\2\2\u0a7f\u0a98\7e\2\2\u0a80\u0a98\7f\2\2\u0a81\u0a98\7g\2\2\u0a82"+
		"\u0a98\7h\2\2\u0a83\u0a98\7i\2\2\u0a84\u0a98\7j\2\2\u0a85\u0a98\5\u01bc"+
		"\u00df\2\u0a86\u0a98\5\u01be\u00e0\2\u0a87\u0a98\7k\2\2\u0a88\u0a98\7"+
		"l\2\2\u0a89\u0a98\7m\2\2\u0a8a\u0a98\7n\2\2\u0a8b\u0a98\7o\2\2\u0a8c\u0a98"+
		"\7p\2\2\u0a8d\u0a98\7q\2\2\u0a8e\u0a98\7r\2\2\u0a8f\u0a98\7s\2\2\u0a90"+
		"\u0a98\7t\2\2\u0a91\u0a98\7u\2\2\u0a92\u0a98\7v\2\2\u0a93\u0a94\7O\2\2"+
		"\u0a94\u0a98\7P\2\2\u0a95\u0a96\7Q\2\2\u0a96\u0a98\7R\2\2\u0a97\u0a67"+
		"\3\2\2\2\u0a97\u0a68\3\2\2\2\u0a97\u0a69\3\2\2\2\u0a97\u0a6c\3\2\2\2\u0a97"+
		"\u0a6f\3\2\2\2\u0a97\u0a70\3\2\2\2\u0a97\u0a71\3\2\2\2\u0a97\u0a72\3\2"+
		"\2\2\u0a97\u0a73\3\2\2\2\u0a97\u0a74\3\2\2\2\u0a97\u0a75\3\2\2\2\u0a97"+
		"\u0a76\3\2\2\2\u0a97\u0a77\3\2\2\2\u0a97\u0a78\3\2\2\2\u0a97\u0a79\3\2"+
		"\2\2\u0a97\u0a7a\3\2\2\2\u0a97\u0a7b\3\2\2\2\u0a97\u0a7c\3\2\2\2\u0a97"+
		"\u0a7d\3\2\2\2\u0a97\u0a7e\3\2\2\2\u0a97\u0a7f\3\2\2\2\u0a97\u0a80\3\2"+
		"\2\2\u0a97\u0a81\3\2\2\2\u0a97\u0a82\3\2\2\2\u0a97\u0a83\3\2\2\2\u0a97"+
		"\u0a84\3\2\2\2\u0a97\u0a85\3\2\2\2\u0a97\u0a86\3\2\2\2\u0a97\u0a87\3\2"+
		"\2\2\u0a97\u0a88\3\2\2\2\u0a97\u0a89\3\2\2\2\u0a97\u0a8a\3\2\2\2\u0a97"+
		"\u0a8b\3\2\2\2\u0a97\u0a8c\3\2\2\2\u0a97\u0a8d\3\2\2\2\u0a97\u0a8e\3\2"+
		"\2\2\u0a97\u0a8f\3\2\2\2\u0a97\u0a90\3\2\2\2\u0a97\u0a91\3\2\2\2\u0a97"+
		"\u0a92\3\2\2\2\u0a97\u0a93\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a98\u01c1\3\2"+
		"\2\2\u0a99\u0aa1\5\u01c4\u00e3\2\u0a9a\u0aa1\5\u01c6\u00e4\2\u0a9b\u0aa1"+
		"\5\u01c8\u00e5\2\u0a9c\u0aa1\5\u01ca\u00e6\2\u0a9d\u0aa1\5\u01cc\u00e7"+
		"\2\u0a9e\u0aa1\5\u01ce\u00e8\2\u0a9f\u0aa1\5\u01d0\u00e9\2\u0aa0\u0a99"+
		"\3\2\2\2\u0aa0\u0a9a\3\2\2\2\u0aa0\u0a9b\3\2\2\2\u0aa0\u0a9c\3\2\2\2\u0aa0"+
		"\u0a9d\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa0\u0a9f\3\2\2\2\u0aa1\u01c3\3\2"+
		"\2\2\u0aa2\u0aa3\7\177\2\2\u0aa3\u01c5\3\2\2\2\u0aa4\u0aa5\7\u0085\2\2"+
		"\u0aa5\u01c7\3\2\2\2\u0aa6\u0aa7\7\u0086\2\2\u0aa7\u01c9\3\2\2\2\u0aa8"+
		"\u0aa9\7\u0087\2\2\u0aa9\u01cb\3\2\2\2\u0aaa\u0aab\7\u0088\2\2\u0aab\u01cd"+
		"\3\2\2\2\u0aac\u0aad\7-\2\2\u0aad\u01cf\3\2\2\2\u0aae\u0aaf\t\13\2\2\u0aaf"+
		"\u01d1\3\2\2\2\u0163\u01d3\u01dd\u01e1\u01e5\u01f0\u01f4\u0203\u020a\u020f"+
		"\u0211\u0216\u021c\u0226\u022d\u0233\u0237\u023c\u0242\u0249\u024f\u0252"+
		"\u0255\u0258\u0261\u0268\u029c\u02ab\u02b1\u02b7\u02c4\u02c6\u02cc\u02db"+
		"\u02e1\u02e7\u0302\u0307\u030b\u030f\u0312\u0316\u031c\u031e\u0326\u032a"+
		"\u032d\u0334\u033b\u033f\u0344\u0348\u034b\u0350\u0356\u0363\u036e\u0370"+
		"\u037f\u0381\u038d\u038f\u039c\u039e\u03b0\u03b2\u03be\u03c0\u03cb\u03d6"+
		"\u03e1\u03ec\u03f7\u0401\u0409\u0416\u0420\u0427\u042b\u042f\u0433\u0437"+
		"\u043b\u043f\u0443\u0447\u044b\u044f\u0455\u0458\u045b\u0461\u0469\u046e"+
		"\u0471\u0477\u047f\u0490\u049a\u04a2\u04a8\u04bc\u04c0\u04d0\u04d3\u04da"+
		"\u04e8\u04ef\u04f3\u04fc\u0500\u050a\u050d\u0511\u0514\u0518\u051b\u051d"+
		"\u0529\u0532\u0536\u053b\u0545\u0548\u054c\u0554\u0557\u055b\u055f\u0564"+
		"\u056a\u0574\u057a\u057f\u0586\u058b\u0591\u0599\u059d\u05a0\u05a5\u05aa"+
		"\u05bb\u05bf\u05c4\u05cb\u05cf\u05d4\u05df\u05e5\u05e9\u05ee\u05f2\u05f7"+
		"\u05fa\u0610\u0616\u0621\u0625\u0628\u0632\u0638\u063b\u0642\u064c\u0650"+
		"\u0653\u0656\u065a\u065f\u0661\u0665\u0669\u0672\u067f\u0687\u068d\u0693"+
		"\u0697\u069a\u06a3\u06ac\u06b4\u06bf\u06c5\u06d0\u06d3\u06d8\u06e7\u06ed"+
		"\u06f6\u0700\u0706\u070e\u0712\u0716\u071b\u0720\u0727\u0729\u072e\u0732"+
		"\u0740\u0746\u0755\u075c\u0761\u0768\u076d\u0775\u077b\u0782\u0786\u0788"+
		"\u078a\u0791\u0794\u0797\u079a\u079f\u07a3\u07a6\u07aa\u07ae\u07b3\u07b6"+
		"\u07b8\u07bc\u07c3\u07c9\u07cd\u07d3\u07d8\u07da\u07e0\u07e4\u07ea\u07f1"+
		"\u07f5\u07f7\u07f9\u0800\u080a\u080e\u0810\u0812\u0816\u0819\u081f\u0829"+
		"\u082d\u0833\u083b\u083f\u0842\u0846\u084b\u084e\u0851\u0855\u085a\u0864"+
		"\u086e\u0875\u087a\u087e\u0885\u088b\u0891\u0895\u089c\u08a2\u08a5\u08a9"+
		"\u08ac\u08b0\u08b3\u08b5\u08b8\u08c2\u08c7\u08c9\u08d2\u08d8\u08db\u08e1"+
		"\u08e5\u08ef\u08f4\u08f7\u08fc\u0900\u0903\u0906\u090a\u0913\u0922\u0928"+
		"\u092c\u0930\u0934\u0938\u093c\u0940\u0944\u0947\u094b\u0956\u095a\u0961"+
		"\u0965\u096a\u096f\u0976\u097a\u0984\u0994\u0999\u099d\u09a0\u09a4\u09aa"+
		"\u09ad\u09b1\u09bb\u09be\u09c6\u09cb\u09d0\u09d8\u09df\u09e3\u09ea\u09f0"+
		"\u09f4\u09fa\u0a03\u0a07\u0a0a\u0a1a\u0a21\u0a2a\u0a30\u0a34\u0a37\u0a3b"+
		"\u0a3f\u0a44\u0a4b\u0a51\u0a55\u0a5e\u0a97\u0aa0";
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
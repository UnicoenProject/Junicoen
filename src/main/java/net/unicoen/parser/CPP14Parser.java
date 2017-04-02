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
		RULE_typeidlapper = 22, RULE_unaryoperator = 23, RULE_newexpression = 24, 
		RULE_newplacement = 25, RULE_newtypeid = 26, RULE_newdeclarator = 27, 
		RULE_noptrnewdeclarator = 28, RULE_newinitializer = 29, RULE_deleteexpression = 30, 
		RULE_noexceptexpression = 31, RULE_castexpression = 32, RULE_pmexpression = 33, 
		RULE_multiplicativeexpression = 34, RULE_additiveexpression = 35, RULE_shiftexpression = 36, 
		RULE_relationalexpression = 37, RULE_equalityexpression = 38, RULE_andexpression = 39, 
		RULE_exclusiveorexpression = 40, RULE_inclusiveorexpression = 41, RULE_logicalandexpression = 42, 
		RULE_logicalorexpression = 43, RULE_conditionalexpression = 44, RULE_assignmentexpression = 45, 
		RULE_assignmentoperator = 46, RULE_expression = 47, RULE_constantexpression = 48, 
		RULE_statement = 49, RULE_labeledstatement = 50, RULE_expressionstatement = 51, 
		RULE_compoundstatement = 52, RULE_statementseq = 53, RULE_selectionstatement = 54, 
		RULE_switchstatement = 55, RULE_condition = 56, RULE_whilestatement = 57, 
		RULE_dowhilestatement = 58, RULE_iterationstatement = 59, RULE_enhancedForStatement = 60, 
		RULE_forinitstatement = 61, RULE_forrangedeclaration = 62, RULE_forrangeinitializer = 63, 
		RULE_jumpstatement = 64, RULE_breakStatement = 65, RULE_continueStatement = 66, 
		RULE_returnStatement = 67, RULE_declarationstatement = 68, RULE_declarationseq = 69, 
		RULE_myclassbody = 70, RULE_myclassspecifier = 71, RULE_myclasshead = 72, 
		RULE_declaration = 73, RULE_blockdeclarationwithoutsimpledeclaration = 74, 
		RULE_blockdeclaration = 75, RULE_aliasdeclaration = 76, RULE_variabledeclarationstatement = 77, 
		RULE_variabledeclaration = 78, RULE_variableDeclaratorList = 79, RULE_variableDeclarator = 80, 
		RULE_dims = 81, RULE_simpledeclaration = 82, RULE_static_assertdeclaration = 83, 
		RULE_emptydeclaration = 84, RULE_attributedeclaration = 85, RULE_declspecifier = 86, 
		RULE_declspecifierseq = 87, RULE_declspecifierwithouttype = 88, RULE_declspecifierseqwithouttype = 89, 
		RULE_storageclassspecifier = 90, RULE_functionspecifier = 91, RULE_typedefname = 92, 
		RULE_typespecifier = 93, RULE_trailingtypespecifier = 94, RULE_typespecifierseq = 95, 
		RULE_trailingtypespecifierseq = 96, RULE_simpletypespecifier = 97, RULE_typename = 98, 
		RULE_decltypespecifier = 99, RULE_elaboratedtypespecifier = 100, RULE_enumname = 101, 
		RULE_enumspecifier = 102, RULE_enumhead = 103, RULE_opaqueenumdeclaration = 104, 
		RULE_enumkey = 105, RULE_enumbase = 106, RULE_enumeratorlist = 107, RULE_enumeratordefinition = 108, 
		RULE_enumerator = 109, RULE_namespacename = 110, RULE_originalnamespacename = 111, 
		RULE_namespacedefinition = 112, RULE_namednamespacedefinition = 113, RULE_originalnamespacedefinition = 114, 
		RULE_extensionnamespacedefinition = 115, RULE_unnamednamespacedefinition = 116, 
		RULE_namespacebody = 117, RULE_namespacealias = 118, RULE_namespacealiasdefinition = 119, 
		RULE_qualifiednamespacespecifier = 120, RULE_usingdeclaration = 121, RULE_usingdirective = 122, 
		RULE_asmdefinition = 123, RULE_linkagespecification = 124, RULE_attributespecifierseq = 125, 
		RULE_attributespecifier = 126, RULE_alignmentspecifier = 127, RULE_attributelist = 128, 
		RULE_attribute = 129, RULE_attributetoken = 130, RULE_attributescopedtoken = 131, 
		RULE_attributenamespace = 132, RULE_attributeargumentclause = 133, RULE_balancedtokenseq = 134, 
		RULE_balancedtoken = 135, RULE_initdeclaratorlist = 136, RULE_initdeclarator = 137, 
		RULE_declarator = 138, RULE_ptrdeclarator = 139, RULE_noptrdeclarator = 140, 
		RULE_parametersandqualifiers = 141, RULE_trailingreturntype = 142, RULE_ptroperator = 143, 
		RULE_cvqualifierseq = 144, RULE_cvqualifier = 145, RULE_refqualifier = 146, 
		RULE_declaratorid = 147, RULE_typeid = 148, RULE_abstractdeclarator = 149, 
		RULE_ptrabstractdeclarator = 150, RULE_noptrabstractdeclarator = 151, 
		RULE_abstractpackdeclarator = 152, RULE_noptrabstractpackdeclarator = 153, 
		RULE_parameterdeclarationclause = 154, RULE_parameterdeclarationlist = 155, 
		RULE_parameterdeclaration = 156, RULE_functiondefinition = 157, RULE_functionheader = 158, 
		RULE_functiondeclarator = 159, RULE_functionbody = 160, RULE_initializer = 161, 
		RULE_braceorequalinitializer = 162, RULE_initializerclause = 163, RULE_initializerlist = 164, 
		RULE_bracedinitlist = 165, RULE_myclassname = 166, RULE_classspecifier = 167, 
		RULE_classbody = 168, RULE_classhead = 169, RULE_classheadname = 170, 
		RULE_classvirtspecifier = 171, RULE_classkey = 172, RULE_memberspecification = 173, 
		RULE_memberdeclaration = 174, RULE_membervariabledeclarationstatement = 175, 
		RULE_membervariabledeclaration = 176, RULE_memberdeclaratorlist = 177, 
		RULE_memberdeclarator = 178, RULE_virtspecifierseq = 179, RULE_virtspecifier = 180, 
		RULE_purespecifier = 181, RULE_baseclause = 182, RULE_basespecifierlist = 183, 
		RULE_basespecifier = 184, RULE_classordecltype = 185, RULE_basetypespecifier = 186, 
		RULE_accessspecifier = 187, RULE_conversionfunctionid = 188, RULE_conversiontypeid = 189, 
		RULE_conversiondeclarator = 190, RULE_ctorinitializer = 191, RULE_meminitializerlist = 192, 
		RULE_meminitializer = 193, RULE_meminitializerid = 194, RULE_operatorfunctionid = 195, 
		RULE_literaloperatorid = 196, RULE_templatedeclaration = 197, RULE_templateparameterlist = 198, 
		RULE_templateparameter = 199, RULE_typeparameter = 200, RULE_simpletemplateid = 201, 
		RULE_templateid = 202, RULE_templatename = 203, RULE_templateargumentlist = 204, 
		RULE_templateargument = 205, RULE_typenamespecifier = 206, RULE_explicitinstantiation = 207, 
		RULE_explicitspecialization = 208, RULE_tryblock = 209, RULE_functiontryblock = 210, 
		RULE_handlerseq = 211, RULE_handler = 212, RULE_exceptiondeclaration = 213, 
		RULE_throwexpression = 214, RULE_exceptionspecification = 215, RULE_dynamicexceptionspecification = 216, 
		RULE_typeidlist = 217, RULE_noexceptspecification = 218, RULE_rightShift = 219, 
		RULE_rightShiftAssign = 220, RULE_operator = 221, RULE_literal = 222, 
		RULE_integerliteral = 223, RULE_characterliteral = 224, RULE_floatingliteral = 225, 
		RULE_stringliteral = 226, RULE_booleanliteral = 227, RULE_pointerliteral = 228, 
		RULE_userdefinedliteral = 229;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "identexpression", 
		"unqualifiedid", "qualifiedid", "nestednamespecifier", "lambdaexpression", 
		"lambdaintroducer", "lambdacapture", "capturedefault", "capturelist", 
		"capture", "simplecapture", "initcapture", "lambdadeclarator", "idexpressionlapper", 
		"postfixexpression", "expressionlist", "pseudodestructorname", "binaryexpression", 
		"unaryexpression", "typeidlapper", "unaryoperator", "newexpression", "newplacement", 
		"newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
		"multiplicativeexpression", "additiveexpression", "shiftexpression", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "expressionstatement", "compoundstatement", 
		"statementseq", "selectionstatement", "switchstatement", "condition", 
		"whilestatement", "dowhilestatement", "iterationstatement", "enhancedForStatement", 
		"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
		"breakStatement", "continueStatement", "returnStatement", "declarationstatement", 
		"declarationseq", "myclassbody", "myclassspecifier", "myclasshead", "declaration", 
		"blockdeclarationwithoutsimpledeclaration", "blockdeclaration", "aliasdeclaration", 
		"variabledeclarationstatement", "variabledeclaration", "variableDeclaratorList", 
		"variableDeclarator", "dims", "simpledeclaration", "static_assertdeclaration", 
		"emptydeclaration", "attributedeclaration", "declspecifier", "declspecifierseq", 
		"declspecifierwithouttype", "declspecifierseqwithouttype", "storageclassspecifier", 
		"functionspecifier", "typedefname", "typespecifier", "trailingtypespecifier", 
		"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
		"typename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
		"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
		"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
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
			setState(461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(460);
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
			setState(471);
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
				setState(463);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(LeftParen);
				setState(466);
				expression(0);
				setState(467);
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
				setState(469);
				identexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(Tilde);
				setState(486);
				myclassname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				match(Tilde);
				setState(488);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
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
			setState(492);
			nestednamespecifier(0);
			setState(494);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(493);
				match(Template);
				}
			}

			setState(496);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(499);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(500);
				typename();
				setState(501);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(503);
				namespacename();
				setState(504);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(506);
				decltypespecifier();
				setState(507);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(511);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(512);
						match(Identifier);
						setState(513);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(514);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(516);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(515);
							match(Template);
							}
						}

						setState(518);
						simpletemplateid();
						setState(519);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(525);
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
			setState(526);
			lambdaintroducer();
			setState(528);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(527);
				lambdadeclarator();
				}
			}

			setState(530);
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
			setState(532);
			match(LeftBracket);
			setState(534);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(533);
				lambdacapture();
				}
			}

			setState(536);
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
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				capturedefault();
				setState(541);
				match(Comma);
				setState(542);
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
			setState(546);
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
			setState(549);
			capture();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(550);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
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
					setState(553);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(554);
					match(Comma);
					setState(555);
					capture();
					setState(557);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(556);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(563);
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
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
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
			setState(572);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(And);
				setState(570);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
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
			setState(579);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(Identifier);
				setState(575);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(And);
				setState(577);
				match(Identifier);
				setState(578);
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
			setState(581);
			match(LeftParen);
			setState(582);
			parameterdeclarationclause();
			setState(583);
			match(RightParen);
			setState(585);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(584);
				match(Mutable);
				}
			}

			setState(588);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(587);
				exceptionspecification();
				}
			}

			setState(591);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(590);
				attributespecifierseq(0);
				}
			}

			setState(594);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(593);
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
			setState(596);
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
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Dot() { return getToken(CPP14Parser.Dot, 0); }
		public IdexpressionlapperContext idexpressionlapper() {
			return getRuleContext(IdexpressionlapperContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
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
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(599);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(600);
				simpletypespecifier();
				setState(601);
				match(LeftParen);
				setState(603);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(602);
					expressionlist();
					}
				}

				setState(605);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(607);
				typenamespecifier();
				setState(608);
				match(LeftParen);
				setState(610);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(609);
					expressionlist();
					}
				}

				setState(612);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(614);
				simpletypespecifier();
				setState(615);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(617);
				typenamespecifier();
				setState(618);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(620);
				match(Dynamic_cast);
				setState(621);
				match(Less);
				setState(622);
				typeid();
				setState(623);
				match(Greater);
				setState(624);
				match(LeftParen);
				setState(625);
				expression(0);
				setState(626);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(628);
				match(Static_cast);
				setState(629);
				match(Less);
				setState(630);
				typeid();
				setState(631);
				match(Greater);
				setState(632);
				match(LeftParen);
				setState(633);
				expression(0);
				setState(634);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(636);
				match(Reinterpret_cast);
				setState(637);
				match(Less);
				setState(638);
				typeid();
				setState(639);
				match(Greater);
				setState(640);
				match(LeftParen);
				setState(641);
				expression(0);
				setState(642);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(644);
				match(Const_cast);
				setState(645);
				match(Less);
				setState(646);
				typeid();
				setState(647);
				match(Greater);
				setState(648);
				match(LeftParen);
				setState(649);
				expression(0);
				setState(650);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(652);
				match(Typeid);
				setState(653);
				match(LeftParen);
				setState(654);
				expression(0);
				setState(655);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(657);
				match(Typeid);
				setState(658);
				match(LeftParen);
				setState(659);
				typeid();
				setState(660);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(702);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(664);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(665);
						match(LeftBracket);
						setState(666);
						assignmentexpression();
						setState(667);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(669);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(670);
						match(LeftBracket);
						setState(671);
						bracedinitlist();
						setState(672);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(674);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(675);
						match(LeftParen);
						setState(677);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(676);
							expressionlist();
							}
						}

						setState(679);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(680);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(681);
						match(Dot);
						setState(683);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(682);
							match(Template);
							}
						}

						setState(685);
						idexpressionlapper();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(686);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(687);
						match(Arrow);
						setState(689);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(688);
							match(Template);
							}
						}

						setState(691);
						idexpressionlapper();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(692);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(693);
						match(Dot);
						setState(694);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(695);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(696);
						match(Arrow);
						setState(697);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(698);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(699);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(700);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(701);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(706);
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
			setState(707);
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
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(709);
					nestednamespecifier(0);
					}
					break;
				}
				setState(712);
				typename();
				setState(713);
				match(Doublecolon);
				setState(714);
				match(Tilde);
				setState(715);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				nestednamespecifier(0);
				setState(718);
				match(Template);
				setState(719);
				simpletemplateid();
				setState(720);
				match(Doublecolon);
				setState(721);
				match(Tilde);
				setState(722);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(724);
					nestednamespecifier(0);
					}
				}

				setState(727);
				match(Tilde);
				setState(728);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				match(Tilde);
				setState(730);
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
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				unaryexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				newexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
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
		public TypeidlapperContext typeidlapper() {
			return getRuleContext(TypeidlapperContext.class,0);
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
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(PlusPlus);
				setState(740);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(MinusMinus);
				setState(742);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				unaryoperator();
				setState(744);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(746);
				match(Sizeof);
				setState(747);
				binaryexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(748);
				match(Sizeof);
				setState(749);
				match(LeftParen);
				setState(750);
				typeidlapper();
				setState(751);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				match(Sizeof);
				setState(754);
				match(LeftParen);
				setState(755);
				typeid();
				setState(756);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				match(Sizeof);
				setState(759);
				match(Ellipsis);
				setState(760);
				match(LeftParen);
				setState(761);
				match(Identifier);
				setState(762);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(763);
				match(Alignof);
				setState(764);
				match(LeftParen);
				setState(765);
				typeid();
				setState(766);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(768);
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

	public static class TypeidlapperContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlapper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeidlapper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidlapperContext typeidlapper() throws RecognitionException {
		TypeidlapperContext _localctx = new TypeidlapperContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeidlapper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			typeid();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
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
		enterRule(_localctx, 48, RULE_newexpression);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(775);
					match(Doublecolon);
					}
				}

				setState(778);
				match(New);
				setState(780);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(779);
					newplacement();
					}
				}

				setState(782);
				newtypeid();
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(783);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(786);
					match(Doublecolon);
					}
				}

				setState(789);
				match(New);
				setState(791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(790);
					newplacement();
					}
					break;
				}
				setState(793);
				match(LeftParen);
				setState(794);
				typeid();
				setState(795);
				match(RightParen);
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(796);
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
		enterRule(_localctx, 50, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LeftParen);
			setState(802);
			expressionlist();
			setState(803);
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
		enterRule(_localctx, 52, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			typespecifierseq();
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(806);
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
		enterRule(_localctx, 54, RULE_newdeclarator);
		try {
			setState(814);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				ptroperator();
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(810);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817);
			match(LeftBracket);
			setState(818);
			expression(0);
			setState(819);
			match(RightBracket);
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(820);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(832);
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
					setState(823);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(824);
					match(LeftBracket);
					setState(825);
					constantexpression();
					setState(826);
					match(RightBracket);
					setState(828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(827);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(834);
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
		enterRule(_localctx, 58, RULE_newinitializer);
		int _la;
		try {
			setState(841);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				match(LeftParen);
				setState(837);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(836);
					expressionlist();
					}
				}

				setState(839);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
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
		enterRule(_localctx, 60, RULE_deleteexpression);
		int _la;
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(843);
					match(Doublecolon);
					}
				}

				setState(846);
				match(Delete);
				setState(847);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(848);
					match(Doublecolon);
					}
				}

				setState(851);
				match(Delete);
				setState(852);
				match(LeftBracket);
				setState(853);
				match(RightBracket);
				setState(854);
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
		enterRule(_localctx, 62, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(Noexcept);
			setState(858);
			match(LeftParen);
			setState(859);
			expression(0);
			setState(860);
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
		enterRule(_localctx, 64, RULE_castexpression);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				binaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(LeftParen);
				setState(864);
				typeid();
				setState(865);
				match(RightParen);
				setState(866);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(871);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(879);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(873);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(874);
						match(DotStar);
						setState(875);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(876);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(877);
						match(ArrowStar);
						setState(878);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(883);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(885);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(887);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(888);
						match(Star);
						setState(889);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(890);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(891);
						match(Div);
						setState(892);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(893);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(894);
						match(Mod);
						setState(895);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(900);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(902);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(910);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(904);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(905);
						match(Plus);
						setState(906);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(907);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(908);
						match(Minus);
						setState(909);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(914);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(918);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(919);
						match(LeftShift);
						setState(920);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(921);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(922);
						rightShift();
						setState(923);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(929);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(931);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(933);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(934);
						match(Less);
						setState(935);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(936);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(937);
						match(Greater);
						setState(938);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(939);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(940);
						match(LessEqual);
						setState(941);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(942);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(943);
						match(GreaterEqual);
						setState(944);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(949);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(951);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(953);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(954);
						match(Equal);
						setState(955);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(956);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(957);
						match(NotEqual);
						setState(958);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(963);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(972);
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
					setState(967);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(968);
					match(And);
					setState(969);
					equalityexpression(0);
					}
					} 
				}
				setState(974);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(976);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
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
					setState(978);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(979);
					match(Caret);
					setState(980);
					andexpression(0);
					}
					} 
				}
				setState(985);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(987);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(994);
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
					setState(989);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(990);
					match(Or);
					setState(991);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(996);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(998);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1005);
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
					setState(1000);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1001);
					match(AndAnd);
					setState(1002);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(1007);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1009);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1016);
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
					setState(1011);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1012);
					match(OrOr);
					setState(1013);
					logicalandexpression(0);
					}
					} 
				}
				setState(1018);
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
		enterRule(_localctx, 88, RULE_conditionalexpression);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				logicalorexpression(0);
				setState(1021);
				match(Question);
				setState(1022);
				expression(0);
				setState(1023);
				match(Colon);
				setState(1024);
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
		enterRule(_localctx, 90, RULE_assignmentexpression);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				logicalorexpression(0);
				setState(1030);
				assignmentoperator();
				setState(1031);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
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
		enterRule(_localctx, 92, RULE_assignmentoperator);
		try {
			setState(1047);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(1040);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(1041);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(1043);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(1044);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(1045);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(1046);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1050);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1057);
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
					setState(1052);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1053);
					match(Comma);
					setState(1054);
					assignmentexpression();
					}
					} 
				}
				setState(1059);
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
		enterRule(_localctx, 96, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		public VariabledeclarationstatementContext variabledeclarationstatement() {
			return getRuleContext(VariabledeclarationstatementContext.class,0);
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
		enterRule(_localctx, 98, RULE_statement);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				variabledeclarationstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1064);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1067);
				expressionstatement();
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
				compoundstatement();
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
				selectionstatement();
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
				switchstatement();
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
				iterationstatement();
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
				whilestatement();
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
				dowhilestatement();
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
				jumpstatement();
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
				breakStatement();
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
				continueStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1105);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1104);
					attributespecifierseq(0);
					}
				}

				setState(1107);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1108);
				declarationstatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1110);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1109);
					attributespecifierseq(0);
					}
				}

				setState(1112);
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
		enterRule(_localctx, 100, RULE_labeledstatement);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1115);
					attributespecifierseq(0);
					}
				}

				setState(1118);
				match(Identifier);
				setState(1119);
				match(Colon);
				setState(1120);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1121);
					attributespecifierseq(0);
					}
				}

				setState(1124);
				match(Case);
				setState(1125);
				constantexpression();
				setState(1126);
				match(Colon);
				setState(1127);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1130);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1129);
					attributespecifierseq(0);
					}
				}

				setState(1132);
				match(Default);
				setState(1133);
				match(Colon);
				setState(1134);
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
		enterRule(_localctx, 102, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1137);
				expression(0);
				}
			}

			setState(1140);
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
		enterRule(_localctx, 104, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(LeftBrace);
			setState(1144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1143);
				statementseq();
				}
			}

			setState(1146);
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
		enterRule(_localctx, 106, RULE_statementseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			statement();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				{
				setState(1149);
				statement();
				}
				}
				setState(1154);
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
		enterRule(_localctx, 108, RULE_selectionstatement);
		try {
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(If);
				setState(1156);
				match(LeftParen);
				setState(1157);
				condition();
				setState(1158);
				match(RightParen);
				setState(1159);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(If);
				setState(1162);
				match(LeftParen);
				setState(1163);
				condition();
				setState(1164);
				match(RightParen);
				setState(1165);
				statement();
				setState(1166);
				match(Else);
				setState(1167);
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
		enterRule(_localctx, 110, RULE_switchstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(Switch);
			setState(1172);
			match(LeftParen);
			setState(1173);
			condition();
			setState(1174);
			match(RightParen);
			setState(1175);
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
		enterRule(_localctx, 112, RULE_condition);
		int _la;
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1178);
					attributespecifierseq(0);
					}
				}

				setState(1181);
				declspecifierseq();
				setState(1182);
				declarator();
				setState(1183);
				match(Assign);
				setState(1184);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1187);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1186);
					attributespecifierseq(0);
					}
				}

				setState(1189);
				declspecifierseq();
				setState(1190);
				declarator();
				setState(1191);
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
		enterRule(_localctx, 114, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(While);
			setState(1196);
			match(LeftParen);
			setState(1197);
			condition();
			setState(1198);
			match(RightParen);
			setState(1199);
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
		enterRule(_localctx, 116, RULE_dowhilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(Do);
			setState(1202);
			compoundstatement();
			setState(1203);
			match(While);
			setState(1204);
			match(LeftParen);
			setState(1205);
			expression(0);
			setState(1206);
			match(RightParen);
			setState(1207);
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
		enterRule(_localctx, 118, RULE_iterationstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(For);
			setState(1210);
			match(LeftParen);
			setState(1211);
			forinitstatement();
			setState(1213);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1212);
				condition();
				}
			}

			setState(1215);
			match(Semi);
			setState(1217);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1216);
				expression(0);
				}
			}

			setState(1219);
			match(RightParen);
			setState(1220);
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
		enterRule(_localctx, 120, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(For);
			setState(1223);
			match(LeftParen);
			setState(1224);
			forrangedeclaration();
			setState(1225);
			match(Colon);
			setState(1226);
			forrangeinitializer();
			setState(1227);
			match(RightParen);
			setState(1228);
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
		enterRule(_localctx, 122, RULE_forinitstatement);
		try {
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				variabledeclarationstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1232);
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
		enterRule(_localctx, 124, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1235);
				attributespecifierseq(0);
				}
			}

			setState(1238);
			declspecifierseq();
			setState(1239);
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
		enterRule(_localctx, 126, RULE_forrangeinitializer);
		try {
			setState(1243);
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
				setState(1241);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
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
		enterRule(_localctx, 128, RULE_jumpstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(Goto);
			setState(1246);
			match(Identifier);
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
		enterRule(_localctx, 130, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(Break);
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
		enterRule(_localctx, 132, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(Continue);
			setState(1253);
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
		enterRule(_localctx, 134, RULE_returnStatement);
		int _la;
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(Return);
				setState(1257);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1256);
					expression(0);
					}
				}

				setState(1259);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(Return);
				setState(1261);
				bracedinitlist();
				setState(1262);
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
		enterRule(_localctx, 136, RULE_declarationstatement);
		try {
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1271);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1277);
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
					setState(1273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1274);
					declaration();
					}
					} 
				}
				setState(1279);
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
		enterRule(_localctx, 140, RULE_myclassbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1280);
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
		enterRule(_localctx, 142, RULE_myclassspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			myclasshead();
			setState(1284);
			match(LeftBrace);
			setState(1285);
			myclassbody();
			setState(1286);
			match(RightBrace);
			setState(1287);
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
		enterRule(_localctx, 144, RULE_myclasshead);
		int _la;
		try {
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				classkey();
				setState(1291);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1290);
					attributespecifierseq(0);
					}
				}

				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1293);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1296);
				classheadname();
				setState(1298);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1297);
					classvirtspecifier();
					}
				}

				setState(1301);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1300);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				classkey();
				setState(1305);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1304);
					attributespecifierseq(0);
					}
				}

				setState(1308);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1307);
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
		public VariabledeclarationstatementContext variabledeclarationstatement() {
			return getRuleContext(VariabledeclarationstatementContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_declaration);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				variabledeclarationstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				blockdeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1314);
				myclassspecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315);
				functiondefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1316);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1317);
				explicitinstantiation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1318);
				explicitspecialization();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1319);
				linkagespecification();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1320);
				namespacedefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1321);
				emptydeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1322);
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
		enterRule(_localctx, 148, RULE_blockdeclarationwithoutsimpledeclaration);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				asmdefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				namespacealiasdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1328);
				usingdirective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1329);
				static_assertdeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1330);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1331);
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
		enterRule(_localctx, 150, RULE_blockdeclaration);
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
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
		enterRule(_localctx, 152, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(Using);
			setState(1339);
			match(Identifier);
			setState(1341);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1340);
				attributespecifierseq(0);
				}
			}

			setState(1343);
			match(Assign);
			setState(1344);
			typeid();
			setState(1345);
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
		enterRule(_localctx, 154, RULE_variabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			variabledeclaration();
			setState(1348);
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
		enterRule(_localctx, 156, RULE_variabledeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1350);
				attributespecifierseq(0);
				}
			}

			setState(1354);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(1353);
				declspecifierseqwithouttype();
				}
			}

			setState(1356);
			typespecifier();
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1357);
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
		enterRule(_localctx, 158, RULE_variableDeclaratorList);
		int _la;
		try {
			setState(1369);
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
				setState(1361);
				variableDeclarator();
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1362);
					match(Comma);
					setState(1363);
					variableDeclarator();
					}
					}
					setState(1368);
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
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 160, RULE_variableDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1371);
					ptroperator();
					}
					} 
				}
				setState(1376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1377);
			declaratorid();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBracket) {
				{
				{
				setState(1378);
				match(LeftBracket);
				setState(1380);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1379);
					expression(0);
					}
				}

				setState(1382);
				match(RightBracket);
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1390);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1388);
				match(Assign);
				setState(1389);
				initializerclause();
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

	public static class DimsContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
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
		enterRule(_localctx, 162, RULE_dims);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(LeftBracket);
			setState(1393);
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
		enterRule(_localctx, 164, RULE_simpledeclaration);
		int _la;
		try {
			setState(1409);
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
				setState(1396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1395);
					declspecifierseq();
					}
					break;
				}
				setState(1399);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1398);
					initdeclaratorlist();
					}
				}

				setState(1401);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				attributespecifierseq(0);
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1403);
					declspecifierseq();
					}
					break;
				}
				setState(1406);
				initdeclaratorlist();
				setState(1407);
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
		enterRule(_localctx, 166, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(Static_assert);
			setState(1412);
			match(LeftParen);
			setState(1413);
			constantexpression();
			setState(1414);
			match(Comma);
			setState(1415);
			match(Stringliteral);
			setState(1416);
			match(RightParen);
			setState(1417);
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
		enterRule(_localctx, 168, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
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
		enterRule(_localctx, 170, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			attributespecifierseq(0);
			setState(1422);
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
		enterRule(_localctx, 172, RULE_declspecifier);
		try {
			setState(1426);
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
				setState(1424);
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
				setState(1425);
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
		enterRule(_localctx, 174, RULE_declspecifierseq);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				declspecifier();
				setState(1430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1429);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				declspecifier();
				setState(1433);
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
		enterRule(_localctx, 176, RULE_declspecifierwithouttype);
		try {
			setState(1442);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				storageclassspecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 5);
				{
				setState(1441);
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
		enterRule(_localctx, 178, RULE_declspecifierseqwithouttype);
		int _la;
		try {
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				declspecifierwithouttype();
				setState(1446);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1445);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				declspecifierwithouttype();
				setState(1449);
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
		enterRule(_localctx, 180, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
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
		enterRule(_localctx, 182, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
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
		enterRule(_localctx, 184, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
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
		enterRule(_localctx, 186, RULE_typespecifier);
		try {
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				myclassspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
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
		enterRule(_localctx, 188, RULE_trailingtypespecifier);
		try {
			setState(1468);
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
				setState(1464);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1467);
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
		enterRule(_localctx, 190, RULE_typespecifierseq);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				typespecifier();
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1471);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				typespecifier();
				setState(1475);
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
		enterRule(_localctx, 192, RULE_trailingtypespecifierseq);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				trailingtypespecifier();
				setState(1481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1480);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				trailingtypespecifier();
				setState(1484);
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
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
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
		enterRule(_localctx, 194, RULE_simpletypespecifier);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1488);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1491);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				nestednamespecifier(0);
				setState(1493);
				match(Template);
				setState(1494);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1497);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1498);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1499);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1500);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1501);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1502);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1503);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1504);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1505);
				match(Unsigned);
				setState(1507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1506);
					simpletypespecifier();
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1509);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1510);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1511);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1512);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1513);
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
		enterRule(_localctx, 196, RULE_typename);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				myclassname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1518);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1519);
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
		enterRule(_localctx, 198, RULE_decltypespecifier);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(Decltype);
				setState(1523);
				match(LeftParen);
				setState(1524);
				expression(0);
				setState(1525);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				match(Decltype);
				setState(1528);
				match(LeftParen);
				setState(1529);
				match(Auto);
				setState(1530);
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
		enterRule(_localctx, 200, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				classkey();
				setState(1535);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1534);
					attributespecifierseq(0);
					}
				}

				setState(1538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1537);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1540);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				classkey();
				setState(1543);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1545);
				classkey();
				setState(1546);
				nestednamespecifier(0);
				setState(1548);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1547);
					match(Template);
					}
				}

				setState(1550);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1552);
				match(Enum);
				setState(1554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1553);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1556);
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
		enterRule(_localctx, 202, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
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
		enterRule(_localctx, 204, RULE_enumspecifier);
		int _la;
		try {
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				enumhead();
				setState(1562);
				match(LeftBrace);
				setState(1564);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1563);
					enumeratorlist(0);
					}
				}

				setState(1566);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				enumhead();
				setState(1569);
				match(LeftBrace);
				setState(1570);
				enumeratorlist(0);
				setState(1571);
				match(Comma);
				setState(1572);
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
		enterRule(_localctx, 206, RULE_enumhead);
		int _la;
		try {
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				enumkey();
				setState(1578);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1577);
					attributespecifierseq(0);
					}
				}

				setState(1581);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1580);
					match(Identifier);
					}
				}

				setState(1584);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1583);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				enumkey();
				setState(1588);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1587);
					attributespecifierseq(0);
					}
				}

				setState(1590);
				nestednamespecifier(0);
				setState(1591);
				match(Identifier);
				setState(1593);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1592);
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
		enterRule(_localctx, 208, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			enumkey();
			setState(1599);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1598);
				attributespecifierseq(0);
				}
			}

			setState(1601);
			match(Identifier);
			setState(1603);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1602);
				enumbase();
				}
			}

			setState(1605);
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
		enterRule(_localctx, 210, RULE_enumkey);
		try {
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608);
				match(Enum);
				setState(1609);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1610);
				match(Enum);
				setState(1611);
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
		enterRule(_localctx, 212, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			match(Colon);
			setState(1615);
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
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1618);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1620);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1621);
					match(Comma);
					setState(1622);
					enumeratordefinition();
					}
					} 
				}
				setState(1627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		enterRule(_localctx, 216, RULE_enumeratordefinition);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				enumerator();
				setState(1630);
				match(Assign);
				setState(1631);
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
		enterRule(_localctx, 218, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
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
		enterRule(_localctx, 220, RULE_namespacename);
		try {
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
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
		enterRule(_localctx, 222, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
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
		enterRule(_localctx, 224, RULE_namespacedefinition);
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
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
		enterRule(_localctx, 226, RULE_namednamespacedefinition);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
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
		enterRule(_localctx, 228, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1651);
				match(Inline);
				}
			}

			setState(1654);
			match(Namespace);
			setState(1655);
			match(Identifier);
			setState(1656);
			match(LeftBrace);
			setState(1657);
			namespacebody();
			setState(1658);
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
		enterRule(_localctx, 230, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1660);
				match(Inline);
				}
			}

			setState(1663);
			match(Namespace);
			setState(1664);
			originalnamespacename();
			setState(1665);
			match(LeftBrace);
			setState(1666);
			namespacebody();
			setState(1667);
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
		enterRule(_localctx, 232, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1669);
				match(Inline);
				}
			}

			setState(1672);
			match(Namespace);
			setState(1673);
			match(LeftBrace);
			setState(1674);
			namespacebody();
			setState(1675);
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
		enterRule(_localctx, 234, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1677);
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
		enterRule(_localctx, 236, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
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
		enterRule(_localctx, 238, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(Namespace);
			setState(1683);
			match(Identifier);
			setState(1684);
			match(Assign);
			setState(1685);
			qualifiednamespacespecifier();
			setState(1686);
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
		enterRule(_localctx, 240, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1688);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1691);
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
		enterRule(_localctx, 242, RULE_usingdeclaration);
		int _la;
		try {
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				match(Using);
				setState(1695);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1694);
					match(Typename);
					}
				}

				setState(1697);
				nestednamespecifier(0);
				setState(1698);
				unqualifiedid();
				setState(1699);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				match(Using);
				setState(1702);
				match(Doublecolon);
				setState(1703);
				unqualifiedid();
				setState(1704);
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
		enterRule(_localctx, 244, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1708);
				attributespecifierseq(0);
				}
			}

			setState(1711);
			match(Using);
			setState(1712);
			match(Namespace);
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1713);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1716);
			namespacename();
			setState(1717);
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
		enterRule(_localctx, 246, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(Asm);
			setState(1720);
			match(LeftParen);
			setState(1721);
			match(Stringliteral);
			setState(1722);
			match(RightParen);
			setState(1723);
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
		enterRule(_localctx, 248, RULE_linkagespecification);
		int _la;
		try {
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				match(Extern);
				setState(1726);
				match(Stringliteral);
				setState(1727);
				match(LeftBrace);
				setState(1729);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1728);
					declarationseq(0);
					}
				}

				setState(1731);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				match(Extern);
				setState(1733);
				match(Stringliteral);
				setState(1734);
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
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1738);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1740);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1741);
					attributespecifier();
					}
					} 
				}
				setState(1746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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
		enterRule(_localctx, 252, RULE_attributespecifier);
		try {
			setState(1754);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				match(LeftBracket);
				setState(1748);
				match(LeftBracket);
				setState(1749);
				attributelist(0);
				setState(1750);
				match(RightBracket);
				setState(1751);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1753);
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
		enterRule(_localctx, 254, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				match(Alignas);
				setState(1757);
				match(LeftParen);
				setState(1758);
				typeid();
				setState(1760);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1759);
					match(Ellipsis);
					}
				}

				setState(1762);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764);
				match(Alignas);
				setState(1765);
				match(LeftParen);
				setState(1766);
				constantexpression();
				setState(1768);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1767);
					match(Ellipsis);
					}
				}

				setState(1770);
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
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1775);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1778);
				attribute();
				setState(1779);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1793);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1783);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1784);
						match(Comma);
						setState(1786);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
						case 1:
							{
							setState(1785);
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
						setState(1788);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1789);
						match(Comma);
						setState(1790);
						attribute();
						setState(1791);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
		enterRule(_localctx, 258, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			attributetoken();
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1799);
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
		enterRule(_localctx, 260, RULE_attributetoken);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
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
		enterRule(_localctx, 262, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			attributenamespace();
			setState(1807);
			match(Doublecolon);
			setState(1808);
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
		enterRule(_localctx, 264, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
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
		enterRule(_localctx, 266, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(LeftParen);
			setState(1813);
			balancedtokenseq(0);
			setState(1814);
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
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1817);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1820);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1821);
					balancedtoken();
					}
					} 
				}
				setState(1826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 270, RULE_balancedtoken);
		try {
			setState(1839);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				match(LeftParen);
				setState(1828);
				balancedtokenseq(0);
				setState(1829);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1831);
				match(LeftBracket);
				setState(1832);
				balancedtokenseq(0);
				setState(1833);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1835);
				match(LeftBrace);
				setState(1836);
				balancedtokenseq(0);
				setState(1837);
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
		enterRule(_localctx, 272, RULE_initdeclaratorlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			initdeclarator();
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1842);
				match(Comma);
				setState(1843);
				initdeclarator();
				}
				}
				setState(1848);
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
		enterRule(_localctx, 274, RULE_initdeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			declarator();
			setState(1851);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBrace - 77)) | (1L << (Assign - 77)))) != 0)) {
				{
				setState(1850);
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
		enterRule(_localctx, 276, RULE_declarator);
		try {
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1854);
				noptrdeclarator(0);
				setState(1855);
				parametersandqualifiers();
				setState(1856);
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
		enterRule(_localctx, 278, RULE_ptrdeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1860);
					ptroperator();
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1866);
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
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1869);
				declaratorid();
				setState(1871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1870);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1873);
				match(LeftParen);
				setState(1874);
				ptrdeclarator();
				setState(1875);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1890);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1879);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1880);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1881);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1882);
						match(LeftBracket);
						setState(1884);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1883);
							constantexpression();
							}
						}

						setState(1886);
						match(RightBracket);
						setState(1888);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1887);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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
		enterRule(_localctx, 282, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(LeftParen);
			setState(1896);
			parameterdeclarationclause();
			setState(1897);
			match(RightParen);
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1898);
				cvqualifierseq();
				}
				break;
			}
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1901);
				refqualifier();
				}
				break;
			}
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1904);
				exceptionspecification();
				}
				break;
			}
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1907);
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
		enterRule(_localctx, 284, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			match(Arrow);
			setState(1911);
			trailingtypespecifierseq();
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1912);
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
		enterRule(_localctx, 286, RULE_ptroperator);
		try {
			setState(1938);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				match(Star);
				setState(1917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1916);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1919);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				match(And);
				setState(1924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1923);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926);
				match(AndAnd);
				setState(1928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1927);
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
				setState(1930);
				nestednamespecifier(0);
				setState(1931);
				match(Star);
				setState(1933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1932);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1935);
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
		enterRule(_localctx, 288, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			cvqualifier();
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1941);
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
		enterRule(_localctx, 290, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
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
		enterRule(_localctx, 292, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
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
		enterRule(_localctx, 294, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1948);
				match(Ellipsis);
				}
			}

			setState(1951);
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
		enterRule(_localctx, 296, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			typespecifierseq();
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1954);
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
		enterRule(_localctx, 298, RULE_abstractdeclarator);
		try {
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1958);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1961);
				parametersandqualifiers();
				setState(1962);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1964);
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
		enterRule(_localctx, 300, RULE_ptrabstractdeclarator);
		try {
			setState(1972);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1967);
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
				setState(1968);
				ptroperator();
				setState(1970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1969);
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
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1975);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1976);
				match(LeftBracket);
				setState(1978);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1977);
					constantexpression();
					}
				}

				setState(1980);
				match(RightBracket);
				setState(1982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1981);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1984);
				match(LeftParen);
				setState(1985);
				ptrabstractdeclarator();
				setState(1986);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2001);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1990);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1991);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1992);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1993);
						match(LeftBracket);
						setState(1995);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1994);
							constantexpression();
							}
						}

						setState(1997);
						match(RightBracket);
						setState(1999);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
						case 1:
							{
							setState(1998);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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
		enterRule(_localctx, 304, RULE_abstractpackdeclarator);
		try {
			setState(2010);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(2006);
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
				setState(2007);
				ptroperator();
				setState(2008);
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
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2013);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(2028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2026);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2015);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2016);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2017);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2018);
						match(LeftBracket);
						setState(2020);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(2019);
							constantexpression();
							}
						}

						setState(2022);
						match(RightBracket);
						setState(2024);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
						case 1:
							{
							setState(2023);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		enterRule(_localctx, 308, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(2041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2031);
					parameterdeclarationlist(0);
					}
				}

				setState(2035);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2034);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				parameterdeclarationlist(0);
				setState(2038);
				match(Comma);
				setState(2039);
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
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2044);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(2051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(2046);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2047);
					match(Comma);
					setState(2048);
					parameterdeclaration();
					}
					} 
				}
				setState(2053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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
		enterRule(_localctx, 312, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2055);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2054);
					attributespecifierseq(0);
					}
				}

				setState(2057);
				declspecifierseq();
				setState(2058);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2060);
					attributespecifierseq(0);
					}
				}

				setState(2063);
				declspecifierseq();
				setState(2064);
				declarator();
				setState(2065);
				match(Assign);
				setState(2066);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2069);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2068);
					attributespecifierseq(0);
					}
				}

				setState(2071);
				declspecifierseq();
				setState(2073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2072);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2076);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2075);
					attributespecifierseq(0);
					}
				}

				setState(2078);
				declspecifierseq();
				setState(2080);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2079);
					abstractdeclarator();
					}
				}

				setState(2082);
				match(Assign);
				setState(2083);
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
		enterRule(_localctx, 314, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2087);
				attributespecifierseq(0);
				}
			}

			setState(2091);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(2090);
				declspecifierseqwithouttype();
				}
			}

			setState(2093);
			functionheader();
			setState(2095);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2094);
				virtspecifierseq(0);
				}
			}

			setState(2097);
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
		enterRule(_localctx, 316, RULE_functionheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2099);
				typespecifier();
				}
				break;
			}
			setState(2102);
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
		enterRule(_localctx, 318, RULE_functiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			declaratorid();
			setState(2105);
			match(LeftParen);
			setState(2106);
			parameterdeclarationclause();
			setState(2107);
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
		enterRule(_localctx, 320, RULE_functionbody);
		int _la;
		try {
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2109);
					ctorinitializer();
					}
				}

				setState(2112);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2113);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2114);
				match(Assign);
				setState(2115);
				match(Default);
				setState(2116);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2117);
				match(Assign);
				setState(2118);
				match(Delete);
				setState(2119);
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
		enterRule(_localctx, 322, RULE_initializer);
		try {
			setState(2127);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2123);
				match(LeftParen);
				setState(2124);
				expressionlist();
				setState(2125);
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
		enterRule(_localctx, 324, RULE_braceorequalinitializer);
		try {
			setState(2132);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2129);
				match(Assign);
				setState(2130);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2131);
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
		enterRule(_localctx, 326, RULE_initializerclause);
		try {
			setState(2136);
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
				setState(2134);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
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
		enterRule(_localctx, 328, RULE_initializerlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			initializerclause();
			setState(2143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2139);
					match(Comma);
					setState(2140);
					initializerclause();
					}
					} 
				}
				setState(2145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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
		enterRule(_localctx, 330, RULE_bracedinitlist);
		int _la;
		try {
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2146);
				match(LeftBrace);
				setState(2147);
				initializerlist();
				setState(2149);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2148);
					match(Comma);
					}
				}

				setState(2151);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2153);
				match(LeftBrace);
				setState(2154);
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
		enterRule(_localctx, 332, RULE_myclassname);
		try {
			setState(2159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2157);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2158);
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
		enterRule(_localctx, 334, RULE_classspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			classhead();
			setState(2162);
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
		enterRule(_localctx, 336, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			match(LeftBrace);
			setState(2166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(2165);
				memberspecification();
				}
			}

			setState(2168);
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
		enterRule(_localctx, 338, RULE_classhead);
		int _la;
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				classkey();
				setState(2172);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2171);
					attributespecifierseq(0);
					}
				}

				setState(2175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2174);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2177);
				classheadname();
				setState(2179);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2178);
					classvirtspecifier();
					}
				}

				setState(2182);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2181);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
				classkey();
				setState(2186);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2185);
					attributespecifierseq(0);
					}
				}

				setState(2189);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2188);
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
		enterRule(_localctx, 340, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2193);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2196);
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
		enterRule(_localctx, 342, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
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
		enterRule(_localctx, 344, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
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
		enterRule(_localctx, 346, RULE_memberspecification);
		int _la;
		try {
			setState(2211);
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
				setState(2202);
				memberdeclaration();
				setState(2204);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2203);
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
				setState(2206);
				accessspecifier();
				setState(2207);
				match(Colon);
				setState(2209);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Tilde - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2208);
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
		enterRule(_localctx, 348, RULE_memberdeclaration);
		try {
			setState(2220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2213);
				membervariabledeclarationstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2215);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2216);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2217);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2218);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2219);
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
		enterRule(_localctx, 350, RULE_membervariabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			membervariabledeclaration();
			setState(2223);
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
		enterRule(_localctx, 352, RULE_membervariabledeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2225);
				attributespecifierseq(0);
				}
			}

			setState(2229);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(2228);
				declspecifierseqwithouttype();
				}
			}

			setState(2231);
			typespecifier();
			setState(2235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2232);
					ptroperator();
					}
					} 
				}
				setState(2237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			setState(2239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftBracket - 79)) | (1L << (Tilde - 79)) | (1L << (Colon - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(2238);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2242);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2245);
					match(Comma);
					setState(2246);
					memberdeclarator();
					}
					} 
				}
				setState(2251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
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
		enterRule(_localctx, 356, RULE_memberdeclarator);
		int _la;
		try {
			setState(2276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2252);
				declaratorid();
				setState(2254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2253);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2256);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2259);
				declaratorid();
				setState(2262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2260);
					match(Assign);
					setState(2261);
					initializerclause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2264);
				declaratorid();
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2265);
					bracedinitlist();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2269);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2268);
					match(Identifier);
					}
				}

				setState(2272);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2271);
					attributespecifierseq(0);
					}
				}

				setState(2274);
				match(Colon);
				setState(2275);
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
		int _startState = 358;
		enterRecursionRule(_localctx, 358, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2279);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2281);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2282);
					virtspecifier();
					}
					} 
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
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
		enterRule(_localctx, 360, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
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
		enterRule(_localctx, 362, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			match(Assign);
			setState(2291);
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
		enterRule(_localctx, 364, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			match(Colon);
			setState(2295);
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
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2298);
			basespecifier();
			setState(2300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2299);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2303);
					match(Comma);
					setState(2304);
					basespecifier();
					setState(2306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
					case 1:
						{
						setState(2305);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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
		enterRule(_localctx, 368, RULE_basespecifier);
		int _la;
		try {
			setState(2334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2313);
					attributespecifierseq(0);
					}
				}

				setState(2316);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2318);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2317);
					attributespecifierseq(0);
					}
				}

				setState(2320);
				match(Virtual);
				setState(2322);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2321);
					accessspecifier();
					}
				}

				setState(2324);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2326);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2325);
					attributespecifierseq(0);
					}
				}

				setState(2328);
				accessspecifier();
				setState(2330);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2329);
					match(Virtual);
					}
				}

				setState(2332);
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
		enterRule(_localctx, 370, RULE_classordecltype);
		try {
			setState(2341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2336);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2339);
				myclassname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
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
		enterRule(_localctx, 372, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
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
		enterRule(_localctx, 374, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
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
		enterRule(_localctx, 376, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(Operator);
			setState(2348);
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
		enterRule(_localctx, 378, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			typespecifierseq();
			setState(2352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2351);
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
		enterRule(_localctx, 380, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			ptroperator();
			setState(2356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2355);
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
		enterRule(_localctx, 382, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(Colon);
			setState(2359);
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
		enterRule(_localctx, 384, RULE_meminitializerlist);
		int _la;
		try {
			setState(2372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2361);
				meminitializer();
				setState(2363);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2362);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2365);
				meminitializer();
				setState(2367);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2366);
					match(Ellipsis);
					}
				}

				setState(2369);
				match(Comma);
				setState(2370);
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
		enterRule(_localctx, 386, RULE_meminitializer);
		int _la;
		try {
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2374);
				meminitializerid();
				setState(2375);
				match(LeftParen);
				setState(2377);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2376);
					expressionlist();
					}
				}

				setState(2379);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2381);
				meminitializerid();
				setState(2382);
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
		enterRule(_localctx, 388, RULE_meminitializerid);
		try {
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2386);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2387);
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
		enterRule(_localctx, 390, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(Operator);
			setState(2391);
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
		enterRule(_localctx, 392, RULE_literaloperatorid);
		try {
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2393);
				match(Operator);
				setState(2394);
				match(Stringliteral);
				setState(2395);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2396);
				match(Operator);
				setState(2397);
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
		enterRule(_localctx, 394, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(Template);
			setState(2401);
			match(Less);
			setState(2402);
			templateparameterlist(0);
			setState(2403);
			match(Greater);
			setState(2404);
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
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2407);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2409);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2410);
					match(Comma);
					setState(2411);
					templateparameter();
					}
					} 
				}
				setState(2416);
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
		enterRule(_localctx, 398, RULE_templateparameter);
		try {
			setState(2419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2417);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2418);
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
		enterRule(_localctx, 400, RULE_typeparameter);
		int _la;
		try {
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				match(Class);
				setState(2423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2422);
					match(Ellipsis);
					}
					break;
				}
				setState(2426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2425);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2428);
				match(Class);
				setState(2430);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2429);
					match(Identifier);
					}
				}

				setState(2432);
				match(Assign);
				setState(2433);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2434);
				match(Typename);
				setState(2436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2435);
					match(Ellipsis);
					}
					break;
				}
				setState(2439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2438);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2441);
				match(Typename);
				setState(2443);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2442);
					match(Identifier);
					}
				}

				setState(2445);
				match(Assign);
				setState(2446);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2447);
				match(Template);
				setState(2448);
				match(Less);
				setState(2449);
				templateparameterlist(0);
				setState(2450);
				match(Greater);
				setState(2451);
				match(Class);
				setState(2453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2452);
					match(Ellipsis);
					}
					break;
				}
				setState(2456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2455);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2458);
				match(Template);
				setState(2459);
				match(Less);
				setState(2460);
				templateparameterlist(0);
				setState(2461);
				match(Greater);
				setState(2462);
				match(Class);
				setState(2464);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2463);
					match(Identifier);
					}
				}

				setState(2466);
				match(Assign);
				setState(2467);
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
		enterRule(_localctx, 402, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			templatename();
			setState(2472);
			match(Less);
			setState(2474);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2473);
				templateargumentlist(0);
				}
			}

			setState(2476);
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
		enterRule(_localctx, 404, RULE_templateid);
		int _la;
		try {
			setState(2493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2478);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2479);
				operatorfunctionid();
				setState(2480);
				match(Less);
				setState(2482);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2481);
					templateargumentlist(0);
					}
				}

				setState(2484);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2486);
				literaloperatorid();
				setState(2487);
				match(Less);
				setState(2489);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2488);
					templateargumentlist(0);
					}
				}

				setState(2491);
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
		enterRule(_localctx, 406, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
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
		int _startState = 408;
		enterRecursionRule(_localctx, 408, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2498);
			templateargument();
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				{
				setState(2499);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2502);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2503);
					match(Comma);
					setState(2504);
					templateargument();
					setState(2506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
					case 1:
						{
						setState(2505);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,327,_ctx);
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
		enterRule(_localctx, 410, RULE_templateargument);
		try {
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2513);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2514);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2515);
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
		enterRule(_localctx, 412, RULE_typenamespecifier);
		int _la;
		try {
			setState(2529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(Typename);
				setState(2519);
				nestednamespecifier(0);
				setState(2520);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2522);
				match(Typename);
				setState(2523);
				nestednamespecifier(0);
				setState(2525);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2524);
					match(Template);
					}
				}

				setState(2527);
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
		enterRule(_localctx, 414, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2531);
				match(Extern);
				}
			}

			setState(2534);
			match(Template);
			setState(2535);
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
		enterRule(_localctx, 416, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			match(Template);
			setState(2538);
			match(Less);
			setState(2539);
			match(Greater);
			setState(2540);
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
		enterRule(_localctx, 418, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			match(Try);
			setState(2543);
			compoundstatement();
			setState(2544);
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
		enterRule(_localctx, 420, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			match(Try);
			setState(2548);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2547);
				ctorinitializer();
				}
			}

			setState(2550);
			compoundstatement();
			setState(2551);
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
		enterRule(_localctx, 422, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
			handler();
			setState(2555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2554);
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
		enterRule(_localctx, 424, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			match(Catch);
			setState(2558);
			match(LeftParen);
			setState(2559);
			exceptiondeclaration();
			setState(2560);
			match(RightParen);
			setState(2561);
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
		enterRule(_localctx, 426, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2564);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2563);
					attributespecifierseq(0);
					}
				}

				setState(2566);
				typespecifierseq();
				setState(2567);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2570);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2569);
					attributespecifierseq(0);
					}
				}

				setState(2572);
				typespecifierseq();
				setState(2574);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2573);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2576);
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
		enterRule(_localctx, 428, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
			match(Throw);
			setState(2581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2580);
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
		enterRule(_localctx, 430, RULE_exceptionspecification);
		try {
			setState(2585);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2583);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2584);
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
		enterRule(_localctx, 432, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
			match(Throw);
			setState(2588);
			match(LeftParen);
			setState(2590);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2589);
				typeidlist(0);
				}
			}

			setState(2592);
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
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2595);
			typeid();
			setState(2597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2596);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2599);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2600);
					match(Comma);
					setState(2601);
					typeid();
					setState(2603);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
					case 1:
						{
						setState(2602);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
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
		enterRule(_localctx, 436, RULE_noexceptspecification);
		try {
			setState(2616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				match(Noexcept);
				setState(2611);
				match(LeftParen);
				setState(2612);
				constantexpression();
				setState(2613);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2615);
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
		enterRule(_localctx, 438, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			match(Greater);
			setState(2619);
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
		enterRule(_localctx, 440, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2621);
			match(Greater);
			setState(2622);
			match(Greater);
			setState(2623);
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
		enterRule(_localctx, 442, RULE_operator);
		try {
			setState(2673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2625);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2627);
				match(New);
				setState(2628);
				match(LeftBracket);
				setState(2629);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2630);
				match(Delete);
				setState(2631);
				match(LeftBracket);
				setState(2632);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2633);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2634);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2635);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2636);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2637);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2638);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2639);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2640);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2641);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2642);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2643);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2644);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2645);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2646);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2647);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2648);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2649);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2650);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2651);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2652);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2653);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2654);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2655);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2656);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2657);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2658);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2659);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2660);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2661);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2662);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2663);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2664);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2665);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2666);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2667);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2668);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2669);
				match(LeftParen);
				setState(2670);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2671);
				match(LeftBracket);
				setState(2672);
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
		enterRule(_localctx, 444, RULE_literal);
		try {
			setState(2682);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2675);
				integerliteral();
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2676);
				characterliteral();
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2677);
				floatingliteral();
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2678);
				stringliteral();
				}
				break;
			case Booleanliteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2679);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2680);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2681);
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
		enterRule(_localctx, 446, RULE_integerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
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
		enterRule(_localctx, 448, RULE_characterliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
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
		enterRule(_localctx, 450, RULE_floatingliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2688);
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
		enterRule(_localctx, 452, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
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
		enterRule(_localctx, 454, RULE_booleanliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2692);
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
		enterRule(_localctx, 456, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2694);
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
		enterRule(_localctx, 458, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
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
		case 28:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 33:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 34:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 35:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 36:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 37:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 38:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 39:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 40:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 41:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 42:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 43:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 69:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 107:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 125:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 128:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 134:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 140:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 151:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 153:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 155:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 177:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 179:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 183:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 198:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 204:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 217:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0a8d\4\2\t"+
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
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\3\2\5"+
		"\2\u01d0\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01da\n\3\3\4\3\4\5\4"+
		"\u01de\n\4\3\5\3\5\5\5\u01e2\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u01ed\n\6\3\7\3\7\5\7\u01f1\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0200\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0207\n\b\3\b\3"+
		"\b\3\b\7\b\u020c\n\b\f\b\16\b\u020f\13\b\3\t\3\t\5\t\u0213\n\t\3\t\3\t"+
		"\3\n\3\n\5\n\u0219\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0223"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u022a\n\r\3\r\3\r\3\r\3\r\5\r\u0230\n\r"+
		"\7\r\u0232\n\r\f\r\16\r\u0235\13\r\3\16\3\16\5\16\u0239\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u023f\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0246\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u024c\n\21\3\21\5\21\u024f\n\21\3\21\5\21\u0252"+
		"\n\21\3\21\5\21\u0255\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u025e"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0265\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0299\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u02a8\n\23\3\23\3\23\3\23\3\23\5\23\u02ae"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u02b4\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u02c1\n\23\f\23\16\23\u02c4\13\23\3\24"+
		"\3\24\3\25\5\25\u02c9\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u02d8\n\25\3\25\3\25\3\25\3\25\5\25\u02de\n"+
		"\25\3\26\3\26\3\26\3\26\5\26\u02e4\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0304\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\5\32\u030b\n\32\3\32\3\32\5\32\u030f\n\32\3\32\3"+
		"\32\5\32\u0313\n\32\3\32\5\32\u0316\n\32\3\32\3\32\5\32\u031a\n\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0320\n\32\5\32\u0322\n\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\5\34\u032a\n\34\3\35\3\35\5\35\u032e\n\35\3\35\5\35\u0331\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0338\n\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u033f\n\36\7\36\u0341\n\36\f\36\16\36\u0344\13\36\3\37\3\37\5\37\u0348"+
		"\n\37\3\37\3\37\5\37\u034c\n\37\3 \5 \u034f\n \3 \3 \3 \5 \u0354\n \3"+
		" \3 \3 \3 \5 \u035a\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0367"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0372\n#\f#\16#\u0375\13#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0383\n$\f$\16$\u0386\13$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\7%\u0391\n%\f%\16%\u0394\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\7&\u03a0\n&\f&\16&\u03a3\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\7\'\u03b4\n\'\f\'\16\'\u03b7\13\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\7(\u03c2\n(\f(\16(\u03c5\13(\3)\3)\3)\3)\3)\3)\7)\u03cd"+
		"\n)\f)\16)\u03d0\13)\3*\3*\3*\3*\3*\3*\7*\u03d8\n*\f*\16*\u03db\13*\3"+
		"+\3+\3+\3+\3+\3+\7+\u03e3\n+\f+\16+\u03e6\13+\3,\3,\3,\3,\3,\3,\7,\u03ee"+
		"\n,\f,\16,\u03f1\13,\3-\3-\3-\3-\3-\3-\7-\u03f9\n-\f-\16-\u03fc\13-\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u0405\n.\3/\3/\3/\3/\3/\3/\5/\u040d\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u041a\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u0422\n\61\f\61\16\61\u0425\13\61\3\62\3\62"+
		"\3\63\3\63\3\63\5\63\u042c\n\63\3\63\3\63\5\63\u0430\n\63\3\63\3\63\5"+
		"\63\u0434\n\63\3\63\3\63\5\63\u0438\n\63\3\63\3\63\5\63\u043c\n\63\3\63"+
		"\3\63\5\63\u0440\n\63\3\63\3\63\5\63\u0444\n\63\3\63\3\63\5\63\u0448\n"+
		"\63\3\63\3\63\5\63\u044c\n\63\3\63\3\63\5\63\u0450\n\63\3\63\3\63\5\63"+
		"\u0454\n\63\3\63\3\63\3\63\5\63\u0459\n\63\3\63\5\63\u045c\n\63\3\64\5"+
		"\64\u045f\n\64\3\64\3\64\3\64\3\64\5\64\u0465\n\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u046d\n\64\3\64\3\64\3\64\5\64\u0472\n\64\3\65\5\65\u0475"+
		"\n\65\3\65\3\65\3\66\3\66\5\66\u047b\n\66\3\66\3\66\3\67\3\67\7\67\u0481"+
		"\n\67\f\67\16\67\u0484\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\58\u0494\n8\39\39\39\39\39\39\3:\3:\5:\u049e\n:\3:\3:\3:\3:\3:\3:\5"+
		":\u04a6\n:\3:\3:\3:\3:\5:\u04ac\n:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\5=\u04c0\n=\3=\3=\5=\u04c4\n=\3=\3=\3=\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3?\5?\u04d4\n?\3@\5@\u04d7\n@\3@\3@\3@\3A\3A\5A\u04de"+
		"\nA\3B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\5E\u04ec\nE\3E\3E\3E\3E\3E\5E"+
		"\u04f3\nE\3F\3F\5F\u04f7\nF\3G\3G\3G\3G\3G\7G\u04fe\nG\fG\16G\u0501\13"+
		"G\3H\5H\u0504\nH\3I\3I\3I\3I\3I\3I\3J\3J\5J\u050e\nJ\3J\5J\u0511\nJ\3"+
		"J\3J\5J\u0515\nJ\3J\5J\u0518\nJ\3J\3J\5J\u051c\nJ\3J\5J\u051f\nJ\5J\u0521"+
		"\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u052e\nK\3L\3L\3L\3L\3L\3L\3L"+
		"\5L\u0537\nL\3M\3M\5M\u053b\nM\3N\3N\3N\5N\u0540\nN\3N\3N\3N\3N\3O\3O"+
		"\3O\3P\5P\u054a\nP\3P\5P\u054d\nP\3P\3P\5P\u0551\nP\3Q\3Q\3Q\3Q\7Q\u0557"+
		"\nQ\fQ\16Q\u055a\13Q\5Q\u055c\nQ\3R\7R\u055f\nR\fR\16R\u0562\13R\3R\3"+
		"R\3R\5R\u0567\nR\3R\7R\u056a\nR\fR\16R\u056d\13R\3R\3R\5R\u0571\nR\3S"+
		"\3S\3S\3T\5T\u0577\nT\3T\5T\u057a\nT\3T\3T\3T\5T\u057f\nT\3T\3T\3T\5T"+
		"\u0584\nT\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3W\3W\3W\3X\3X\5X\u0595\nX\3Y"+
		"\3Y\5Y\u0599\nY\3Y\3Y\3Y\5Y\u059e\nY\3Z\3Z\3Z\3Z\3Z\5Z\u05a5\nZ\3[\3["+
		"\5[\u05a9\n[\3[\3[\3[\5[\u05ae\n[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\5_\u05b9"+
		"\n_\3`\3`\3`\3`\5`\u05bf\n`\3a\3a\5a\u05c3\na\3a\3a\3a\5a\u05c8\na\3b"+
		"\3b\5b\u05cc\nb\3b\3b\3b\5b\u05d1\nb\3c\5c\u05d4\nc\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u05e6\nc\3c\3c\3c\3c\3c\5c\u05ed\nc"+
		"\3d\3d\3d\3d\5d\u05f3\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u05fe\ne\3f\3f"+
		"\5f\u0602\nf\3f\5f\u0605\nf\3f\3f\3f\3f\3f\3f\3f\3f\5f\u060f\nf\3f\3f"+
		"\3f\3f\5f\u0615\nf\3f\5f\u0618\nf\3g\3g\3h\3h\3h\5h\u061f\nh\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\5h\u0629\nh\3i\3i\5i\u062d\ni\3i\5i\u0630\ni\3i\5i\u0633"+
		"\ni\3i\3i\5i\u0637\ni\3i\3i\3i\5i\u063c\ni\5i\u063e\ni\3j\3j\5j\u0642"+
		"\nj\3j\3j\5j\u0646\nj\3j\3j\3k\3k\3k\3k\3k\5k\u064f\nk\3l\3l\3l\3m\3m"+
		"\3m\3m\3m\3m\7m\u065a\nm\fm\16m\u065d\13m\3n\3n\3n\3n\3n\5n\u0664\nn\3"+
		"o\3o\3p\3p\5p\u066a\np\3q\3q\3r\3r\5r\u0670\nr\3s\3s\5s\u0674\ns\3t\5"+
		"t\u0677\nt\3t\3t\3t\3t\3t\3t\3u\5u\u0680\nu\3u\3u\3u\3u\3u\3u\3v\5v\u0689"+
		"\nv\3v\3v\3v\3v\3v\3w\5w\u0691\nw\3x\3x\3y\3y\3y\3y\3y\3y\3z\5z\u069c"+
		"\nz\3z\3z\3{\3{\5{\u06a2\n{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u06ad\n{\3|"+
		"\5|\u06b0\n|\3|\3|\3|\5|\u06b5\n|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\3~"+
		"\3~\5~\u06c4\n~\3~\3~\3~\3~\5~\u06ca\n~\3\177\3\177\3\177\3\177\3\177"+
		"\7\177\u06d1\n\177\f\177\16\177\u06d4\13\177\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06dd\n\u0080\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u06e3\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u06eb\n\u0081\3\u0081\3\u0081\5\u0081\u06ef\n\u0081"+
		"\3\u0082\3\u0082\5\u0082\u06f3\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06f8\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06fd\n\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0704\n\u0082\f\u0082\16\u0082"+
		"\u0707\13\u0082\3\u0083\3\u0083\5\u0083\u070b\n\u0083\3\u0084\3\u0084"+
		"\5\u0084\u070f\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u071d\n\u0088"+
		"\3\u0088\3\u0088\7\u0088\u0721\n\u0088\f\u0088\16\u0088\u0724\13\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u0732\n\u0089\3\u008a\3\u008a\3\u008a"+
		"\7\u008a\u0737\n\u008a\f\u008a\16\u008a\u073a\13\u008a\3\u008b\3\u008b"+
		"\5\u008b\u073e\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0745\n\u008c\3\u008d\7\u008d\u0748\n\u008d\f\u008d\16\u008d\u074b\13"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0752\n\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0758\n\u008e\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\5\u008e\u075f\n\u008e\3\u008e\3\u008e\5\u008e\u0763"+
		"\n\u008e\7\u008e\u0765\n\u008e\f\u008e\16\u008e\u0768\13\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u076e\n\u008f\3\u008f\5\u008f\u0771\n"+
		"\u008f\3\u008f\5\u008f\u0774\n\u008f\3\u008f\5\u008f\u0777\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u077c\n\u0090\3\u0091\3\u0091\5\u0091\u0780\n"+
		"\u0091\3\u0091\5\u0091\u0783\n\u0091\3\u0091\3\u0091\5\u0091\u0787\n\u0091"+
		"\3\u0091\3\u0091\5\u0091\u078b\n\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0790\n\u0091\3\u0091\5\u0091\u0793\n\u0091\5\u0091\u0795\n\u0091\3\u0092"+
		"\3\u0092\5\u0092\u0799\n\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095"+
		"\5\u0095\u07a0\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u07a6\n"+
		"\u0096\3\u0097\3\u0097\5\u0097\u07aa\n\u0097\3\u0097\3\u0097\3\u0097\3"+
		"\u0097\5\u0097\u07b0\n\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u07b5\n\u0098"+
		"\5\u0098\u07b7\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u07bd\n"+
		"\u0099\3\u0099\3\u0099\5\u0099\u07c1\n\u0099\3\u0099\3\u0099\3\u0099\3"+
		"\u0099\5\u0099\u07c7\n\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5"+
		"\u0099\u07ce\n\u0099\3\u0099\3\u0099\5\u0099\u07d2\n\u0099\7\u0099\u07d4"+
		"\n\u0099\f\u0099\16\u0099\u07d7\13\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u07dd\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u07e7\n\u009b\3\u009b\3\u009b\5\u009b\u07eb\n"+
		"\u009b\7\u009b\u07ed\n\u009b\f\u009b\16\u009b\u07f0\13\u009b\3\u009c\5"+
		"\u009c\u07f3\n\u009c\3\u009c\5\u009c\u07f6\n\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u07fc\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\7\u009d\u0804\n\u009d\f\u009d\16\u009d\u0807\13\u009d\3\u009e"+
		"\5\u009e\u080a\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0810\n"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0818\n"+
		"\u009e\3\u009e\3\u009e\5\u009e\u081c\n\u009e\3\u009e\5\u009e\u081f\n\u009e"+
		"\3\u009e\3\u009e\5\u009e\u0823\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u0828\n\u009e\3\u009f\5\u009f\u082b\n\u009f\3\u009f\5\u009f\u082e\n\u009f"+
		"\3\u009f\3\u009f\5\u009f\u0832\n\u009f\3\u009f\3\u009f\3\u00a0\5\u00a0"+
		"\u0837\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a2\5\u00a2\u0841\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u084b\n\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0852\n\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0857\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u085b\n\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\7\u00a6\u0860\n\u00a6\f\u00a6\16\u00a6\u0863\13\u00a6\3\u00a7\3"+
		"\u00a7\3\u00a7\5\u00a7\u0868\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5"+
		"\u00a7\u086e\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u0872\n\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u0879\n\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\5\u00ab\u087f\n\u00ab\3\u00ab\5\u00ab\u0882\n\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u0886\n\u00ab\3\u00ab\5\u00ab\u0889\n\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u088d\n\u00ab\3\u00ab\5\u00ab\u0890\n\u00ab\5\u00ab\u0892\n\u00ab"+
		"\3\u00ac\5\u00ac\u0895\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\5\u00af\u089f\n\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u08a4\n\u00af\5\u00af\u08a6\n\u00af\3\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08af\n\u00b0\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b2\5\u00b2\u08b5\n\u00b2\3\u00b2\5\u00b2\u08b8\n\u00b2\3\u00b2"+
		"\3\u00b2\7\u00b2\u08bc\n\u00b2\f\u00b2\16\u00b2\u08bf\13\u00b2\3\u00b2"+
		"\5\u00b2\u08c2\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\7\u00b3\u08ca\n\u00b3\f\u00b3\16\u00b3\u08cd\13\u00b3\3\u00b4\3\u00b4"+
		"\5\u00b4\u08d1\n\u00b4\3\u00b4\5\u00b4\u08d4\n\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\5\u00b4\u08d9\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u08dd\n\u00b4\3\u00b4"+
		"\5\u00b4\u08e0\n\u00b4\3\u00b4\5\u00b4\u08e3\n\u00b4\3\u00b4\3\u00b4\5"+
		"\u00b4\u08e7\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u08ee"+
		"\n\u00b5\f\u00b5\16\u00b5\u08f1\13\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u08ff\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0905\n\u00b9\7"+
		"\u00b9\u0907\n\u00b9\f\u00b9\16\u00b9\u090a\13\u00b9\3\u00ba\5\u00ba\u090d"+
		"\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0911\n\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0915\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0919\n\u00ba\3\u00ba\3\u00ba\5"+
		"\u00ba\u091d\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0921\n\u00ba\3\u00bb\5\u00bb"+
		"\u0924\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0928\n\u00bb\3\u00bc\3\u00bc\3"+
		"\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\5\u00bf\u0933\n"+
		"\u00bf\3\u00c0\3\u00c0\5\u00c0\u0937\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c2\3\u00c2\5\u00c2\u093e\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0942\n\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0947\n\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u094c\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3"+
		"\u0953\n\u00c3\3\u00c4\3\u00c4\5\u00c4\u0957\n\u00c4\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0961\n\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u096f\n\u00c8\f\u00c8\16\u00c8\u0972"+
		"\13\u00c8\3\u00c9\3\u00c9\5\u00c9\u0976\n\u00c9\3\u00ca\3\u00ca\5\u00ca"+
		"\u097a\n\u00ca\3\u00ca\5\u00ca\u097d\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0981"+
		"\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0987\n\u00ca\3\u00ca"+
		"\5\u00ca\u098a\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u098e\n\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0998\n"+
		"\u00ca\3\u00ca\5\u00ca\u099b\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u09a3\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09a8"+
		"\n\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09ad\n\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09b5\n\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09bc\n\u00cc\3\u00cc\3\u00cc\5\u00cc"+
		"\u09c0\n\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09c7\n"+
		"\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09cd\n\u00ce\7\u00ce\u09cf"+
		"\n\u00ce\f\u00ce\16\u00ce\u09d2\13\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf"+
		"\u09d7\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u09e0\n\u00d0\3\u00d0\3\u00d0\5\u00d0\u09e4\n\u00d0\3\u00d1\5"+
		"\u00d1\u09e7\n\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\5\u00d4"+
		"\u09f7\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\5\u00d5\u09fe\n"+
		"\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7\5\u00d7"+
		"\u0a07\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a0d\n\u00d7\3"+
		"\u00d7\3\u00d7\5\u00d7\u0a11\n\u00d7\3\u00d7\5\u00d7\u0a14\n\u00d7\3\u00d8"+
		"\3\u00d8\5\u00d8\u0a18\n\u00d8\3\u00d9\3\u00d9\5\u00d9\u0a1c\n\u00d9\3"+
		"\u00da\3\u00da\3\u00da\5\u00da\u0a21\n\u00da\3\u00da\3\u00da\3\u00db\3"+
		"\u00db\3\u00db\5\u00db\u0a28\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5"+
		"\u00db\u0a2e\n\u00db\7\u00db\u0a30\n\u00db\f\u00db\16\u00db\u0a33\13\u00db"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0a3b\n\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\5\u00df\u0a74\n\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\5\u00e0\u0a7d\n\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2"+
		"\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e7"+
		"\3\u00e7\3\u00e7\2!\16\30$:DFHJLNPRTVX`\u008c\u00d8\u00fc\u0102\u010e"+
		"\u011a\u0130\u0134\u0138\u0164\u0168\u0170\u018e\u019a\u01b4\u00e8\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\2\f\4\2[[__\4\2UW[^\7\2\36\36))\63\6399@@\5\2\34\34"+
		"&&JJ\4\2\20\20LL\4\2[[pp\5\2\17\17<<GG\4\2  //\3\2\60\62\3\2\u0089\u008c"+
		"\u0bb2\2\u01cf\3\2\2\2\4\u01d9\3\2\2\2\6\u01dd\3\2\2\2\b\u01e1\3\2\2\2"+
		"\n\u01ec\3\2\2\2\f\u01ee\3\2\2\2\16\u01ff\3\2\2\2\20\u0210\3\2\2\2\22"+
		"\u0216\3\2\2\2\24\u0222\3\2\2\2\26\u0224\3\2\2\2\30\u0226\3\2\2\2\32\u0238"+
		"\3\2\2\2\34\u023e\3\2\2\2\36\u0245\3\2\2\2 \u0247\3\2\2\2\"\u0256\3\2"+
		"\2\2$\u0298\3\2\2\2&\u02c5\3\2\2\2(\u02dd\3\2\2\2*\u02e3\3\2\2\2,\u0303"+
		"\3\2\2\2.\u0305\3\2\2\2\60\u0307\3\2\2\2\62\u0321\3\2\2\2\64\u0323\3\2"+
		"\2\2\66\u0327\3\2\2\28\u0330\3\2\2\2:\u0332\3\2\2\2<\u034b\3\2\2\2>\u0359"+
		"\3\2\2\2@\u035b\3\2\2\2B\u0366\3\2\2\2D\u0368\3\2\2\2F\u0376\3\2\2\2H"+
		"\u0387\3\2\2\2J\u0395\3\2\2\2L\u03a4\3\2\2\2N\u03b8\3\2\2\2P\u03c6\3\2"+
		"\2\2R\u03d1\3\2\2\2T\u03dc\3\2\2\2V\u03e7\3\2\2\2X\u03f2\3\2\2\2Z\u0404"+
		"\3\2\2\2\\\u040c\3\2\2\2^\u0419\3\2\2\2`\u041b\3\2\2\2b\u0426\3\2\2\2"+
		"d\u045b\3\2\2\2f\u0471\3\2\2\2h\u0474\3\2\2\2j\u0478\3\2\2\2l\u047e\3"+
		"\2\2\2n\u0493\3\2\2\2p\u0495\3\2\2\2r\u04ab\3\2\2\2t\u04ad\3\2\2\2v\u04b3"+
		"\3\2\2\2x\u04bb\3\2\2\2z\u04c8\3\2\2\2|\u04d3\3\2\2\2~\u04d6\3\2\2\2\u0080"+
		"\u04dd\3\2\2\2\u0082\u04df\3\2\2\2\u0084\u04e3\3\2\2\2\u0086\u04e6\3\2"+
		"\2\2\u0088\u04f2\3\2\2\2\u008a\u04f6\3\2\2\2\u008c\u04f8\3\2\2\2\u008e"+
		"\u0503\3\2\2\2\u0090\u0505\3\2\2\2\u0092\u0520\3\2\2\2\u0094\u052d\3\2"+
		"\2\2\u0096\u0536\3\2\2\2\u0098\u053a\3\2\2\2\u009a\u053c\3\2\2\2\u009c"+
		"\u0545\3\2\2\2\u009e\u0549\3\2\2\2\u00a0\u055b\3\2\2\2\u00a2\u0560\3\2"+
		"\2\2\u00a4\u0572\3\2\2\2\u00a6\u0583\3\2\2\2\u00a8\u0585\3\2\2\2\u00aa"+
		"\u058d\3\2\2\2\u00ac\u058f\3\2\2\2\u00ae\u0594\3\2\2\2\u00b0\u059d\3\2"+
		"\2\2\u00b2\u05a4\3\2\2\2\u00b4\u05ad\3\2\2\2\u00b6\u05af\3\2\2\2\u00b8"+
		"\u05b1\3\2\2\2\u00ba\u05b3\3\2\2\2\u00bc\u05b8\3\2\2\2\u00be\u05be\3\2"+
		"\2\2\u00c0\u05c7\3\2\2\2\u00c2\u05d0\3\2\2\2\u00c4\u05ec\3\2\2\2\u00c6"+
		"\u05f2\3\2\2\2\u00c8\u05fd\3\2\2\2\u00ca\u0617\3\2\2\2\u00cc\u0619\3\2"+
		"\2\2\u00ce\u0628\3\2\2\2\u00d0\u063d\3\2\2\2\u00d2\u063f\3\2\2\2\u00d4"+
		"\u064e\3\2\2\2\u00d6\u0650\3\2\2\2\u00d8\u0653\3\2\2\2\u00da\u0663\3\2"+
		"\2\2\u00dc\u0665\3\2\2\2\u00de\u0669\3\2\2\2\u00e0\u066b\3\2\2\2\u00e2"+
		"\u066f\3\2\2\2\u00e4\u0673\3\2\2\2\u00e6\u0676\3\2\2\2\u00e8\u067f\3\2"+
		"\2\2\u00ea\u0688\3\2\2\2\u00ec\u0690\3\2\2\2\u00ee\u0692\3\2\2\2\u00f0"+
		"\u0694\3\2\2\2\u00f2\u069b\3\2\2\2\u00f4\u06ac\3\2\2\2\u00f6\u06af\3\2"+
		"\2\2\u00f8\u06b9\3\2\2\2\u00fa\u06c9\3\2\2\2\u00fc\u06cb\3\2\2\2\u00fe"+
		"\u06dc\3\2\2\2\u0100\u06ee\3\2\2\2\u0102\u06f7\3\2\2\2\u0104\u0708\3\2"+
		"\2\2\u0106\u070e\3\2\2\2\u0108\u0710\3\2\2\2\u010a\u0714\3\2\2\2\u010c"+
		"\u0716\3\2\2\2\u010e\u071a\3\2\2\2\u0110\u0731\3\2\2\2\u0112\u0733\3\2"+
		"\2\2\u0114\u073b\3\2\2\2\u0116\u0744\3\2\2\2\u0118\u0749\3\2\2\2\u011a"+
		"\u0757\3\2\2\2\u011c\u0769\3\2\2\2\u011e\u0778\3\2\2\2\u0120\u0794\3\2"+
		"\2\2\u0122\u0796\3\2\2\2\u0124\u079a\3\2\2\2\u0126\u079c\3\2\2\2\u0128"+
		"\u079f\3\2\2\2\u012a\u07a3\3\2\2\2\u012c\u07af\3\2\2\2\u012e\u07b6\3\2"+
		"\2\2\u0130\u07c6\3\2\2\2\u0132\u07dc\3\2\2\2\u0134\u07de\3\2\2\2\u0136"+
		"\u07fb\3\2\2\2\u0138\u07fd\3\2\2\2\u013a\u0827\3\2\2\2\u013c\u082a\3\2"+
		"\2\2\u013e\u0836\3\2\2\2\u0140\u083a\3\2\2\2\u0142\u084a\3\2\2\2\u0144"+
		"\u0851\3\2\2\2\u0146\u0856\3\2\2\2\u0148\u085a\3\2\2\2\u014a\u085c\3\2"+
		"\2\2\u014c\u086d\3\2\2\2\u014e\u0871\3\2\2\2\u0150\u0873\3\2\2\2\u0152"+
		"\u0876\3\2\2\2\u0154\u0891\3\2\2\2\u0156\u0894\3\2\2\2\u0158\u0898\3\2"+
		"\2\2\u015a\u089a\3\2\2\2\u015c\u08a5\3\2\2\2\u015e\u08ae\3\2\2\2\u0160"+
		"\u08b0\3\2\2\2\u0162\u08b4\3\2\2\2\u0164\u08c3\3\2\2\2\u0166\u08e6\3\2"+
		"\2\2\u0168\u08e8\3\2\2\2\u016a\u08f2\3\2\2\2\u016c\u08f4\3\2\2\2\u016e"+
		"\u08f8\3\2\2\2\u0170\u08fb\3\2\2\2\u0172\u0920\3\2\2\2\u0174\u0927\3\2"+
		"\2\2\u0176\u0929\3\2\2\2\u0178\u092b\3\2\2\2\u017a\u092d\3\2\2\2\u017c"+
		"\u0930\3\2\2\2\u017e\u0934\3\2\2\2\u0180\u0938\3\2\2\2\u0182\u0946\3\2"+
		"\2\2\u0184\u0952\3\2\2\2\u0186\u0956\3\2\2\2\u0188\u0958\3\2\2\2\u018a"+
		"\u0960\3\2\2\2\u018c\u0962\3\2\2\2\u018e\u0968\3\2\2\2\u0190\u0975\3\2"+
		"\2\2\u0192\u09a7\3\2\2\2\u0194\u09a9\3\2\2\2\u0196\u09bf\3\2\2\2\u0198"+
		"\u09c1\3\2\2\2\u019a\u09c3\3\2\2\2\u019c\u09d6\3\2\2\2\u019e\u09e3\3\2"+
		"\2\2\u01a0\u09e6\3\2\2\2\u01a2\u09eb\3\2\2\2\u01a4\u09f0\3\2\2\2\u01a6"+
		"\u09f4\3\2\2\2\u01a8\u09fb\3\2\2\2\u01aa\u09ff\3\2\2\2\u01ac\u0a13\3\2"+
		"\2\2\u01ae\u0a15\3\2\2\2\u01b0\u0a1b\3\2\2\2\u01b2\u0a1d\3\2\2\2\u01b4"+
		"\u0a24\3\2\2\2\u01b6\u0a3a\3\2\2\2\u01b8\u0a3c\3\2\2\2\u01ba\u0a3f\3\2"+
		"\2\2\u01bc\u0a73\3\2\2\2\u01be\u0a7c\3\2\2\2\u01c0\u0a7e\3\2\2\2\u01c2"+
		"\u0a80\3\2\2\2\u01c4\u0a82\3\2\2\2\u01c6\u0a84\3\2\2\2\u01c8\u0a86\3\2"+
		"\2\2\u01ca\u0a88\3\2\2\2\u01cc\u0a8a\3\2\2\2\u01ce\u01d0\5\u008cG\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\3\3\2\2\2\u01d1\u01da\5\u01be"+
		"\u00e0\2\u01d2\u01da\7?\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d5\5`\61\2\u01d5"+
		"\u01d6\7P\2\2\u01d6\u01da\3\2\2\2\u01d7\u01da\5\b\5\2\u01d8\u01da\5\20"+
		"\t\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\5\3\2\2\2\u01db\u01de\5\n\6\2"+
		"\u01dc\u01de\5\f\7\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\7\3"+
		"\2\2\2\u01df\u01e2\5\n\6\2\u01e0\u01e2\5\f\7\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\t\3\2\2\2\u01e3\u01ed\7~\2\2\u01e4\u01ed\5\u0188"+
		"\u00c5\2\u01e5\u01ed\5\u017a\u00be\2\u01e6\u01ed\5\u018a\u00c6\2\u01e7"+
		"\u01e8\7]\2\2\u01e8\u01ed\5\u014e\u00a8\2\u01e9\u01ea\7]\2\2\u01ea\u01ed"+
		"\5\u00c8e\2\u01eb\u01ed\5\u0196\u00cc\2\u01ec\u01e3\3\2\2\2\u01ec\u01e4"+
		"\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\13\3\2\2\2\u01ee\u01f0\5\16\b"+
		"\2\u01ef\u01f1\7>\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\5\n\6\2\u01f3\r\3\2\2\2\u01f4\u01f5\b\b\1\2\u01f5"+
		"\u0200\7y\2\2\u01f6\u01f7\5\u00c6d\2\u01f7\u01f8\7y\2\2\u01f8\u0200\3"+
		"\2\2\2\u01f9\u01fa\5\u00dep\2\u01fa\u01fb\7y\2\2\u01fb\u0200\3\2\2\2\u01fc"+
		"\u01fd\5\u00c8e\2\u01fd\u01fe\7y\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f4\3"+
		"\2\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200"+
		"\u020d\3\2\2\2\u0201\u0202\f\4\2\2\u0202\u0203\7~\2\2\u0203\u020c\7y\2"+
		"\2\u0204\u0206\f\3\2\2\u0205\u0207\7>\2\2\u0206\u0205\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5\u0194\u00cb\2\u0209\u020a\7"+
		"y\2\2\u020a\u020c\3\2\2\2\u020b\u0201\3\2\2\2\u020b\u0204\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\17\3\2\2"+
		"\2\u020f\u020d\3\2\2\2\u0210\u0212\5\22\n\2\u0211\u0213\5 \21\2\u0212"+
		"\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5j"+
		"\66\2\u0215\21\3\2\2\2\u0216\u0218\7Q\2\2\u0217\u0219\5\24\13\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7R"+
		"\2\2\u021b\23\3\2\2\2\u021c\u0223\5\26\f\2\u021d\u0223\5\30\r\2\u021e"+
		"\u021f\5\26\f\2\u021f\u0220\7t\2\2\u0220\u0221\5\30\r\2\u0221\u0223\3"+
		"\2\2\2\u0222\u021c\3\2\2\2\u0222\u021d\3\2\2\2\u0222\u021e\3\2\2\2\u0223"+
		"\25\3\2\2\2\u0224\u0225\t\2\2\2\u0225\27\3\2\2\2\u0226\u0227\b\r\1\2\u0227"+
		"\u0229\5\32\16\2\u0228\u022a\7}\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3"+
		"\2\2\2\u022a\u0233\3\2\2\2\u022b\u022c\f\3\2\2\u022c\u022d\7t\2\2\u022d"+
		"\u022f\5\32\16\2\u022e\u0230\7}\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3"+
		"\2\2\2\u0230\u0232\3\2\2\2\u0231\u022b\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\31\3\2\2\2\u0235\u0233\3\2\2"+
		"\2\u0236\u0239\5\34\17\2\u0237\u0239\5\36\20\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0237\3\2\2\2\u0239\33\3\2\2\2\u023a\u023f\7~\2\2\u023b\u023c\7[\2\2"+
		"\u023c\u023f\7~\2\2\u023d\u023f\7?\2\2\u023e\u023a\3\2\2\2\u023e\u023b"+
		"\3\2\2\2\u023e\u023d\3\2\2\2\u023f\35\3\2\2\2\u0240\u0241\7~\2\2\u0241"+
		"\u0246\5\u0144\u00a3\2\u0242\u0243\7[\2\2\u0243\u0244\7~\2\2\u0244\u0246"+
		"\5\u0144\u00a3\2\u0245\u0240\3\2\2\2\u0245\u0242\3\2\2\2\u0246\37\3\2"+
		"\2\2\u0247\u0248\7O\2\2\u0248\u0249\5\u0136\u009c\2\u0249\u024b\7P\2\2"+
		"\u024a\u024c\7)\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e"+
		"\3\2\2\2\u024d\u024f\5\u01b0\u00d9\2\u024e\u024d\3\2\2\2\u024e\u024f\3"+
		"\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5\u00fc\177\2\u0251\u0250\3\2\2"+
		"\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0255\5\u011e\u0090\2"+
		"\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255!\3\2\2\2\u0256\u0257\5"+
		"\6\4\2\u0257#\3\2\2\2\u0258\u0259\b\23\1\2\u0259\u0299\5\4\3\2\u025a\u025b"+
		"\5\u00c4c\2\u025b\u025d\7O\2\2\u025c\u025e\5&\24\2\u025d\u025c\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7P\2\2\u0260\u0299"+
		"\3\2\2\2\u0261\u0262\5\u019e\u00d0\2\u0262\u0264\7O\2\2\u0263\u0265\5"+
		"&\24\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0267\7P\2\2\u0267\u0299\3\2\2\2\u0268\u0269\5\u00c4c\2\u0269\u026a\5"+
		"\u014c\u00a7\2\u026a\u0299\3\2\2\2\u026b\u026c\5\u019e\u00d0\2\u026c\u026d"+
		"\5\u014c\u00a7\2\u026d\u0299\3\2\2\2\u026e\u026f\7\31\2\2\u026f\u0270"+
		"\7`\2\2\u0270\u0271\5\u012a\u0096\2\u0271\u0272\7a\2\2\u0272\u0273\7O"+
		"\2\2\u0273\u0274\5`\61\2\u0274\u0275\7P\2\2\u0275\u0299\3\2\2\2\u0276"+
		"\u0277\7;\2\2\u0277\u0278\7`\2\2\u0278\u0279\5\u012a\u0096\2\u0279\u027a"+
		"\7a\2\2\u027a\u027b\7O\2\2\u027b\u027c\5`\61\2\u027c\u027d\7P\2\2\u027d"+
		"\u0299\3\2\2\2\u027e\u027f\7\64\2\2\u027f\u0280\7`\2\2\u0280\u0281\5\u012a"+
		"\u0096\2\u0281\u0282\7a\2\2\u0282\u0283\7O\2\2\u0283\u0284\5`\61\2\u0284"+
		"\u0285\7P\2\2\u0285\u0299\3\2\2\2\u0286\u0287\7\22\2\2\u0287\u0288\7`"+
		"\2\2\u0288\u0289\5\u012a\u0096\2\u0289\u028a\7a\2\2\u028a\u028b\7O\2\2"+
		"\u028b\u028c\5`\61\2\u028c\u028d\7P\2\2\u028d\u0299\3\2\2\2\u028e\u028f"+
		"\7E\2\2\u028f\u0290\7O\2\2\u0290\u0291\5`\61\2\u0291\u0292\7P\2\2\u0292"+
		"\u0299\3\2\2\2\u0293\u0294\7E\2\2\u0294\u0295\7O\2\2\u0295\u0296\5\u012a"+
		"\u0096\2\u0296\u0297\7P\2\2\u0297\u0299\3\2\2\2\u0298\u0258\3\2\2\2\u0298"+
		"\u025a\3\2\2\2\u0298\u0261\3\2\2\2\u0298\u0268\3\2\2\2\u0298\u026b\3\2"+
		"\2\2\u0298\u026e\3\2\2\2\u0298\u0276\3\2\2\2\u0298\u027e\3\2\2\2\u0298"+
		"\u0286\3\2\2\2\u0298\u028e\3\2\2\2\u0298\u0293\3\2\2\2\u0299\u02c2\3\2"+
		"\2\2\u029a\u029b\f\25\2\2\u029b\u029c\7Q\2\2\u029c\u029d\5\\/\2\u029d"+
		"\u029e\7R\2\2\u029e\u02c1\3\2\2\2\u029f\u02a0\f\24\2\2\u02a0\u02a1\7Q"+
		"\2\2\u02a1\u02a2\5\u014c\u00a7\2\u02a2\u02a3\7R\2\2\u02a3\u02c1\3\2\2"+
		"\2\u02a4\u02a5\f\23\2\2\u02a5\u02a7\7O\2\2\u02a6\u02a8\5&\24\2\u02a7\u02a6"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02c1\7P\2\2\u02aa"+
		"\u02ab\f\16\2\2\u02ab\u02ad\7{\2\2\u02ac\u02ae\7>\2\2\u02ad\u02ac\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02c1\5\"\22\2\u02b0"+
		"\u02b1\f\r\2\2\u02b1\u02b3\7v\2\2\u02b2\u02b4\7>\2\2\u02b3\u02b2\3\2\2"+
		"\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02c1\5\"\22\2\u02b6"+
		"\u02b7\f\f\2\2\u02b7\u02b8\7{\2\2\u02b8\u02c1\5(\25\2\u02b9\u02ba\f\13"+
		"\2\2\u02ba\u02bb\7v\2\2\u02bb\u02c1\5(\25\2\u02bc\u02bd\f\n\2\2\u02bd"+
		"\u02c1\7r\2\2\u02be\u02bf\f\t\2\2\u02bf\u02c1\7s\2\2\u02c0\u029a\3\2\2"+
		"\2\u02c0\u029f\3\2\2\2\u02c0\u02a4\3\2\2\2\u02c0\u02aa\3\2\2\2\u02c0\u02b0"+
		"\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0\u02b9\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3%\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\5\u014a\u00a6\2\u02c6"+
		"\'\3\2\2\2\u02c7\u02c9\5\16\b\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2"+
		"\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\5\u00c6d\2\u02cb\u02cc\7y\2\2\u02cc"+
		"\u02cd\7]\2\2\u02cd\u02ce\5\u00c6d\2\u02ce\u02de\3\2\2\2\u02cf\u02d0\5"+
		"\16\b\2\u02d0\u02d1\7>\2\2\u02d1\u02d2\5\u0194\u00cb\2\u02d2\u02d3\7y"+
		"\2\2\u02d3\u02d4\7]\2\2\u02d4\u02d5\5\u00c6d\2\u02d5\u02de\3\2\2\2\u02d6"+
		"\u02d8\5\16\b\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3"+
		"\2\2\2\u02d9\u02da\7]\2\2\u02da\u02de\5\u00c6d\2\u02db\u02dc\7]\2\2\u02dc"+
		"\u02de\5\u00c8e\2\u02dd\u02c8\3\2\2\2\u02dd\u02cf\3\2\2\2\u02dd\u02d7"+
		"\3\2\2\2\u02dd\u02db\3\2\2\2\u02de)\3\2\2\2\u02df\u02e4\5$\23\2\u02e0"+
		"\u02e4\5,\27\2\u02e1\u02e4\5\62\32\2\u02e2\u02e4\5> \2\u02e3\u02df\3\2"+
		"\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4"+
		"+\3\2\2\2\u02e5\u02e6\7r\2\2\u02e6\u0304\5B\"\2\u02e7\u02e8\7s\2\2\u02e8"+
		"\u0304\5B\"\2\u02e9\u02ea\5\60\31\2\u02ea\u02eb\5B\"\2\u02eb\u0304\3\2"+
		"\2\2\u02ec\u02ed\78\2\2\u02ed\u0304\5*\26\2\u02ee\u02ef\78\2\2\u02ef\u02f0"+
		"\7O\2\2\u02f0\u02f1\5.\30\2\u02f1\u02f2\7P\2\2\u02f2\u0304\3\2\2\2\u02f3"+
		"\u02f4\78\2\2\u02f4\u02f5\7O\2\2\u02f5\u02f6\5\u012a\u0096\2\u02f6\u02f7"+
		"\7P\2\2\u02f7\u0304\3\2\2\2\u02f8\u02f9\78\2\2\u02f9\u02fa\7}\2\2\u02fa"+
		"\u02fb\7O\2\2\u02fb\u02fc\7~\2\2\u02fc\u0304\7P\2\2\u02fd\u02fe\7\5\2"+
		"\2\u02fe\u02ff\7O\2\2\u02ff\u0300\5\u012a\u0096\2\u0300\u0301\7P\2\2\u0301"+
		"\u0304\3\2\2\2\u0302\u0304\5@!\2\u0303\u02e5\3\2\2\2\u0303\u02e7\3\2\2"+
		"\2\u0303\u02e9\3\2\2\2\u0303\u02ec\3\2\2\2\u0303\u02ee\3\2\2\2\u0303\u02f3"+
		"\3\2\2\2\u0303\u02f8\3\2\2\2\u0303\u02fd\3\2\2\2\u0303\u0302\3\2\2\2\u0304"+
		"-\3\2\2\2\u0305\u0306\5\u012a\u0096\2\u0306/\3\2\2\2\u0307\u0308\t\3\2"+
		"\2\u0308\61\3\2\2\2\u0309\u030b\7y\2\2\u030a\u0309\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7+\2\2\u030d\u030f\5\64\33\2"+
		"\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312"+
		"\5\66\34\2\u0311\u0313\5<\37\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2"+
		"\u0313\u0322\3\2\2\2\u0314\u0316\7y\2\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\7+\2\2\u0318\u031a\5\64\33\2"+
		"\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c"+
		"\7O\2\2\u031c\u031d\5\u012a\u0096\2\u031d\u031f\7P\2\2\u031e\u0320\5<"+
		"\37\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321"+
		"\u030a\3\2\2\2\u0321\u0315\3\2\2\2\u0322\63\3\2\2\2\u0323\u0324\7O\2\2"+
		"\u0324\u0325\5&\24\2\u0325\u0326\7P\2\2\u0326\65\3\2\2\2\u0327\u0329\5"+
		"\u00c0a\2\u0328\u032a\58\35\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2"+
		"\u032a\67\3\2\2\2\u032b\u032d\5\u0120\u0091\2\u032c\u032e\58\35\2\u032d"+
		"\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u0331\5:"+
		"\36\2\u0330\u032b\3\2\2\2\u0330\u032f\3\2\2\2\u03319\3\2\2\2\u0332\u0333"+
		"\b\36\1\2\u0333\u0334\7Q\2\2\u0334\u0335\5`\61\2\u0335\u0337\7R\2\2\u0336"+
		"\u0338\5\u00fc\177\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0342"+
		"\3\2\2\2\u0339\u033a\f\3\2\2\u033a\u033b\7Q\2\2\u033b\u033c\5b\62\2\u033c"+
		"\u033e\7R\2\2\u033d\u033f\5\u00fc\177\2\u033e\u033d\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0339\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343;\3\2\2\2\u0344\u0342\3\2\2\2"+
		"\u0345\u0347\7O\2\2\u0346\u0348\5&\24\2\u0347\u0346\3\2\2\2\u0347\u0348"+
		"\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034c\7P\2\2\u034a\u034c\5\u014c\u00a7"+
		"\2\u034b\u0345\3\2\2\2\u034b\u034a\3\2\2\2\u034c=\3\2\2\2\u034d\u034f"+
		"\7y\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0351\7\26\2\2\u0351\u035a\5B\"\2\u0352\u0354\7y\2\2\u0353\u0352\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7\26\2\2\u0356"+
		"\u0357\7Q\2\2\u0357\u0358\7R\2\2\u0358\u035a\5B\"\2\u0359\u034e\3\2\2"+
		"\2\u0359\u0353\3\2\2\2\u035a?\3\2\2\2\u035b\u035c\7,\2\2\u035c\u035d\7"+
		"O\2\2\u035d\u035e\5`\61\2\u035e\u035f\7P\2\2\u035fA\3\2\2\2\u0360\u0367"+
		"\5*\26\2\u0361\u0362\7O\2\2\u0362\u0363\5\u012a\u0096\2\u0363\u0364\7"+
		"P\2\2\u0364\u0365\5B\"\2\u0365\u0367\3\2\2\2\u0366\u0360\3\2\2\2\u0366"+
		"\u0361\3\2\2\2\u0367C\3\2\2\2\u0368\u0369\b#\1\2\u0369\u036a\5B\"\2\u036a"+
		"\u0373\3\2\2\2\u036b\u036c\f\4\2\2\u036c\u036d\7|\2\2\u036d\u0372\5B\""+
		"\2\u036e\u036f\f\3\2\2\u036f\u0370\7u\2\2\u0370\u0372\5B\"\2\u0371\u036b"+
		"\3\2\2\2\u0371\u036e\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374E\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\b$\1\2\u0377"+
		"\u0378\5D#\2\u0378\u0384\3\2\2\2\u0379\u037a\f\5\2\2\u037a\u037b\7W\2"+
		"\2\u037b\u0383\5D#\2\u037c\u037d\f\4\2\2\u037d\u037e\7X\2\2\u037e\u0383"+
		"\5D#\2\u037f\u0380\f\3\2\2\u0380\u0381\7Y\2\2\u0381\u0383\5D#\2\u0382"+
		"\u0379\3\2\2\2\u0382\u037c\3\2\2\2\u0382\u037f\3\2\2\2\u0383\u0386\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385G\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u0388\b%\1\2\u0388\u0389\5F$\2\u0389\u0392\3\2\2\2\u038a"+
		"\u038b\f\4\2\2\u038b\u038c\7U\2\2\u038c\u0391\5F$\2\u038d\u038e\f\3\2"+
		"\2\u038e\u038f\7V\2\2\u038f\u0391\5F$\2\u0390\u038a\3\2\2\2\u0390\u038d"+
		"\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"I\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\b&\1\2\u0396\u0397\5H%\2\u0397"+
		"\u03a1\3\2\2\2\u0398\u0399\f\4\2\2\u0399\u039a\7j\2\2\u039a\u03a0\5H%"+
		"\2\u039b\u039c\f\3\2\2\u039c\u039d\5\u01b8\u00dd\2\u039d\u039e\5H%\2\u039e"+
		"\u03a0\3\2\2\2\u039f\u0398\3\2\2\2\u039f\u039b\3\2\2\2\u03a0\u03a3\3\2"+
		"\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2K\3\2\2\2\u03a3\u03a1"+
		"\3\2\2\2\u03a4\u03a5\b\'\1\2\u03a5\u03a6\5J&\2\u03a6\u03b5\3\2\2\2\u03a7"+
		"\u03a8\f\6\2\2\u03a8\u03a9\7`\2\2\u03a9\u03b4\5J&\2\u03aa\u03ab\f\5\2"+
		"\2\u03ab\u03ac\7a\2\2\u03ac\u03b4\5J&\2\u03ad\u03ae\f\4\2\2\u03ae\u03af"+
		"\7n\2\2\u03af\u03b4\5J&\2\u03b0\u03b1\f\3\2\2\u03b1\u03b2\7o\2\2\u03b2"+
		"\u03b4\5J&\2\u03b3\u03a7\3\2\2\2\u03b3\u03aa\3\2\2\2\u03b3\u03ad\3\2\2"+
		"\2\u03b3\u03b0\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6M\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\b(\1\2\u03b9\u03ba"+
		"\5L\'\2\u03ba\u03c3\3\2\2\2\u03bb\u03bc\f\4\2\2\u03bc\u03bd\7l\2\2\u03bd"+
		"\u03c2\5L\'\2\u03be\u03bf\f\3\2\2\u03bf\u03c0\7m\2\2\u03c0\u03c2\5L\'"+
		"\2\u03c1\u03bb\3\2\2\2\u03c1\u03be\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4O\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03c7\b)\1\2\u03c7\u03c8\5N(\2\u03c8\u03ce\3\2\2\2\u03c9\u03ca\f\3\2"+
		"\2\u03ca\u03cb\7[\2\2\u03cb\u03cd\5N(\2\u03cc\u03c9\3\2\2\2\u03cd\u03d0"+
		"\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfQ\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d1\u03d2\b*\1\2\u03d2\u03d3\5P)\2\u03d3\u03d9\3\2\2"+
		"\2\u03d4\u03d5\f\3\2\2\u03d5\u03d6\7Z\2\2\u03d6\u03d8\5P)\2\u03d7\u03d4"+
		"\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"S\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\b+\1\2\u03dd\u03de\5R*\2\u03de"+
		"\u03e4\3\2\2\2\u03df\u03e0\f\3\2\2\u03e0\u03e1\7\\\2\2\u03e1\u03e3\5R"+
		"*\2\u03e2\u03df\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5U\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e8\b,\1\2\u03e8"+
		"\u03e9\5T+\2\u03e9\u03ef\3\2\2\2\u03ea\u03eb\f\3\2\2\u03eb\u03ec\7p\2"+
		"\2\u03ec\u03ee\5T+\2\u03ed\u03ea\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0W\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f3\b-\1\2\u03f3\u03f4\5V,\2\u03f4\u03fa\3\2\2\2\u03f5\u03f6\f\3\2"+
		"\2\u03f6\u03f7\7q\2\2\u03f7\u03f9\5V,\2\u03f8\u03f5\3\2\2\2\u03f9\u03fc"+
		"\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fbY\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fd\u0405\5X-\2\u03fe\u03ff\5X-\2\u03ff\u0400\7w\2\2"+
		"\u0400\u0401\5`\61\2\u0401\u0402\7x\2\2\u0402\u0403\5\\/\2\u0403\u0405"+
		"\3\2\2\2\u0404\u03fd\3\2\2\2\u0404\u03fe\3\2\2\2\u0405[\3\2\2\2\u0406"+
		"\u040d\5Z.\2\u0407\u0408\5X-\2\u0408\u0409\5^\60\2\u0409\u040a\5\u0148"+
		"\u00a5\2\u040a\u040d\3\2\2\2\u040b\u040d\5\u01ae\u00d8\2\u040c\u0406\3"+
		"\2\2\2\u040c\u0407\3\2\2\2\u040c\u040b\3\2\2\2\u040d]\3\2\2\2\u040e\u041a"+
		"\7_\2\2\u040f\u041a\7d\2\2\u0410\u041a\7e\2\2\u0411\u041a\7f\2\2\u0412"+
		"\u041a\7b\2\2\u0413\u041a\7c\2\2\u0414\u041a\5\u01ba\u00de\2\u0415\u041a"+
		"\7k\2\2\u0416\u041a\7h\2\2\u0417\u041a\7g\2\2\u0418\u041a\7i\2\2\u0419"+
		"\u040e\3\2\2\2\u0419\u040f\3\2\2\2\u0419\u0410\3\2\2\2\u0419\u0411\3\2"+
		"\2\2\u0419\u0412\3\2\2\2\u0419\u0413\3\2\2\2\u0419\u0414\3\2\2\2\u0419"+
		"\u0415\3\2\2\2\u0419\u0416\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u0418\3\2"+
		"\2\2\u041a_\3\2\2\2\u041b\u041c\b\61\1\2\u041c\u041d\5\\/\2\u041d\u0423"+
		"\3\2\2\2\u041e\u041f\f\3\2\2\u041f\u0420\7t\2\2\u0420\u0422\5\\/\2\u0421"+
		"\u041e\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2"+
		"\2\2\u0424a\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\5Z.\2\u0427c\3\2\2"+
		"\2\u0428\u045c\5f\64\2\u0429\u045c\5\u009cO\2\u042a\u042c\5\u00fc\177"+
		"\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u045c"+
		"\5h\65\2\u042e\u0430\5\u00fc\177\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2"+
		"\2\2\u0430\u0431\3\2\2\2\u0431\u045c\5j\66\2\u0432\u0434\5\u00fc\177\2"+
		"\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u045c"+
		"\5n8\2\u0436\u0438\5\u00fc\177\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2"+
		"\2\u0438\u0439\3\2\2\2\u0439\u045c\5p9\2\u043a\u043c\5\u00fc\177\2\u043b"+
		"\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u045c\5x"+
		"=\2\u043e\u0440\5\u00fc\177\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2"+
		"\u0440\u0441\3\2\2\2\u0441\u045c\5t;\2\u0442\u0444\5\u00fc\177\2\u0443"+
		"\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u045c\5v"+
		"<\2\u0446\u0448\5\u00fc\177\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2"+
		"\u0448\u0449\3\2\2\2\u0449\u045c\5\u0082B\2\u044a\u044c\5\u00fc\177\2"+
		"\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u045c"+
		"\5\u0084C\2\u044e\u0450\5\u00fc\177\2\u044f\u044e\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u045c\5\u0086D\2\u0452\u0454\5\u00fc"+
		"\177\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u045c\5\u0088E\2\u0456\u045c\5\u008aF\2\u0457\u0459\5\u00fc\177\2\u0458"+
		"\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\5\u01a4"+
		"\u00d3\2\u045b\u0428\3\2\2\2\u045b\u0429\3\2\2\2\u045b\u042b\3\2\2\2\u045b"+
		"\u042f\3\2\2\2\u045b\u0433\3\2\2\2\u045b\u0437\3\2\2\2\u045b\u043b\3\2"+
		"\2\2\u045b\u043f\3\2\2\2\u045b\u0443\3\2\2\2\u045b\u0447\3\2\2\2\u045b"+
		"\u044b\3\2\2\2\u045b\u044f\3\2\2\2\u045b\u0453\3\2\2\2\u045b\u0456\3\2"+
		"\2\2\u045b\u0458\3\2\2\2\u045ce\3\2\2\2\u045d\u045f\5\u00fc\177\2\u045e"+
		"\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7~"+
		"\2\2\u0461\u0462\7x\2\2\u0462\u0472\5d\63\2\u0463\u0465\5\u00fc\177\2"+
		"\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467"+
		"\7\n\2\2\u0467\u0468\5b\62\2\u0468\u0469\7x\2\2\u0469\u046a\5d\63\2\u046a"+
		"\u0472\3\2\2\2\u046b\u046d\5\u00fc\177\2\u046c\u046b\3\2\2\2\u046c\u046d"+
		"\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\7\25\2\2\u046f\u0470\7x\2\2\u0470"+
		"\u0472\5d\63\2\u0471\u045e\3\2\2\2\u0471\u0464\3\2\2\2\u0471\u046c\3\2"+
		"\2\2\u0472g\3\2\2\2\u0473\u0475\5`\61\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7z\2\2\u0477i\3\2\2\2\u0478\u047a"+
		"\7S\2\2\u0479\u047b\5l\67\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u047d\7T\2\2\u047dk\3\2\2\2\u047e\u0482\5d\63\2\u047f"+
		"\u0481\5d\63\2\u0480\u047f\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2"+
		"\2\2\u0482\u0483\3\2\2\2\u0483m\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0486"+
		"\7%\2\2\u0486\u0487\7O\2\2\u0487\u0488\5r:\2\u0488\u0489\7P\2\2\u0489"+
		"\u048a\5d\63\2\u048a\u0494\3\2\2\2\u048b\u048c\7%\2\2\u048c\u048d\7O\2"+
		"\2\u048d\u048e\5r:\2\u048e\u048f\7P\2\2\u048f\u0490\5d\63\2\u0490\u0491"+
		"\7\32\2\2\u0491\u0492\5d\63\2\u0492\u0494\3\2\2\2\u0493\u0485\3\2\2\2"+
		"\u0493\u048b\3\2\2\2\u0494o\3\2\2\2\u0495\u0496\7=\2\2\u0496\u0497\7O"+
		"\2\2\u0497\u0498\5r:\2\u0498\u0499\7P\2\2\u0499\u049a\5d\63\2\u049aq\3"+
		"\2\2\2\u049b\u04ac\5`\61\2\u049c\u049e\5\u00fc\177\2\u049d\u049c\3\2\2"+
		"\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\5\u00b0Y\2\u04a0"+
		"\u04a1\5\u0116\u008c\2\u04a1\u04a2\7_\2\2\u04a2\u04a3\5\u0148\u00a5\2"+
		"\u04a3\u04ac\3\2\2\2\u04a4\u04a6\5\u00fc\177\2\u04a5\u04a4\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\5\u00b0Y\2\u04a8\u04a9"+
		"\5\u0116\u008c\2\u04a9\u04aa\5\u014c\u00a7\2\u04aa\u04ac\3\2\2\2\u04ab"+
		"\u049b\3\2\2\2\u04ab\u049d\3\2\2\2\u04ab\u04a5\3\2\2\2\u04acs\3\2\2\2"+
		"\u04ad\u04ae\7N\2\2\u04ae\u04af\7O\2\2\u04af\u04b0\5r:\2\u04b0\u04b1\7"+
		"P\2\2\u04b1\u04b2\5d\63\2\u04b2u\3\2\2\2\u04b3\u04b4\7\27\2\2\u04b4\u04b5"+
		"\5j\66\2\u04b5\u04b6\7N\2\2\u04b6\u04b7\7O\2\2\u04b7\u04b8\5`\61\2\u04b8"+
		"\u04b9\7P\2\2\u04b9\u04ba\7z\2\2\u04baw\3\2\2\2\u04bb\u04bc\7\"\2\2\u04bc"+
		"\u04bd\7O\2\2\u04bd\u04bf\5|?\2\u04be\u04c0\5r:\2\u04bf\u04be\3\2\2\2"+
		"\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c3\7z\2\2\u04c2\u04c4"+
		"\5`\61\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5"+
		"\u04c6\7P\2\2\u04c6\u04c7\5d\63\2\u04c7y\3\2\2\2\u04c8\u04c9\7\"\2\2\u04c9"+
		"\u04ca\7O\2\2\u04ca\u04cb\5~@\2\u04cb\u04cc\7x\2\2\u04cc\u04cd\5\u0080"+
		"A\2\u04cd\u04ce\7P\2\2\u04ce\u04cf\5d\63\2\u04cf{\3\2\2\2\u04d0\u04d4"+
		"\5h\65\2\u04d1\u04d4\5\u009cO\2\u04d2\u04d4\5\u00a6T\2\u04d3\u04d0\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4}\3\2\2\2\u04d5\u04d7"+
		"\5\u00fc\177\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2"+
		"\2\2\u04d8\u04d9\5\u00b0Y\2\u04d9\u04da\5\u0116\u008c\2\u04da\177\3\2"+
		"\2\2\u04db\u04de\5`\61\2\u04dc\u04de\5\u014c\u00a7\2\u04dd\u04db\3\2\2"+
		"\2\u04dd\u04dc\3\2\2\2\u04de\u0081\3\2\2\2\u04df\u04e0\7$\2\2\u04e0\u04e1"+
		"\7~\2\2\u04e1\u04e2\7z\2\2\u04e2\u0083\3\2\2\2\u04e3\u04e4\7\t\2\2\u04e4"+
		"\u04e5\7z\2\2\u04e5\u0085\3\2\2\2\u04e6\u04e7\7\23\2\2\u04e7\u04e8\7z"+
		"\2\2\u04e8\u0087\3\2\2\2\u04e9\u04eb\7\65\2\2\u04ea\u04ec\5`\61\2\u04eb"+
		"\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04f3\7z"+
		"\2\2\u04ee\u04ef\7\65\2\2\u04ef\u04f0\5\u014c\u00a7\2\u04f0\u04f1\7z\2"+
		"\2\u04f1\u04f3\3\2\2\2\u04f2\u04e9\3\2\2\2\u04f2\u04ee\3\2\2\2\u04f3\u0089"+
		"\3\2\2\2\u04f4\u04f7\5\u00a6T\2\u04f5\u04f7\5\u0096L\2\u04f6\u04f4\3\2"+
		"\2\2\u04f6\u04f5\3\2\2\2\u04f7\u008b\3\2\2\2\u04f8\u04f9\bG\1\2\u04f9"+
		"\u04fa\5\u0094K\2\u04fa\u04ff\3\2\2\2\u04fb\u04fc\f\3\2\2\u04fc\u04fe"+
		"\5\u0094K\2\u04fd\u04fb\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2"+
		"\2\u04ff\u0500\3\2\2\2\u0500\u008d\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u0504"+
		"\5\u015c\u00af\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u008f\3"+
		"\2\2\2\u0505\u0506\5\u0092J\2\u0506\u0507\7S\2\2\u0507\u0508\5\u008eH"+
		"\2\u0508\u0509\7T\2\2\u0509\u050a\7z\2\2\u050a\u0091\3\2\2\2\u050b\u050d"+
		"\5\u015a\u00ae\2\u050c\u050e\5\u00fc\177\2\u050d\u050c\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\5\16\b\2\u0510\u050f\3\2\2\2"+
		"\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\5\u0156\u00ac\2\u0513"+
		"\u0515\5\u0158\u00ad\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517"+
		"\3\2\2\2\u0516\u0518\5\u016e\u00b8\2\u0517\u0516\3\2\2\2\u0517\u0518\3"+
		"\2\2\2\u0518\u0521\3\2\2\2\u0519\u051b\5\u015a\u00ae\2\u051a\u051c\5\u00fc"+
		"\177\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d"+
		"\u051f\5\u016e\u00b8\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0521"+
		"\3\2\2\2\u0520\u050b\3\2\2\2\u0520\u0519\3\2\2\2\u0521\u0093\3\2\2\2\u0522"+
		"\u052e\5\u009cO\2\u0523\u052e\5\u0098M\2\u0524\u052e\5\u0090I\2\u0525"+
		"\u052e\5\u013c\u009f\2\u0526\u052e\5\u018c\u00c7\2\u0527\u052e\5\u01a0"+
		"\u00d1\2\u0528\u052e\5\u01a2\u00d2\2\u0529\u052e\5\u00fa~\2\u052a\u052e"+
		"\5\u00e2r\2\u052b\u052e\5\u00aaV\2\u052c\u052e\5\u00acW\2\u052d\u0522"+
		"\3\2\2\2\u052d\u0523\3\2\2\2\u052d\u0524\3\2\2\2\u052d\u0525\3\2\2\2\u052d"+
		"\u0526\3\2\2\2\u052d\u0527\3\2\2\2\u052d\u0528\3\2\2\2\u052d\u0529\3\2"+
		"\2\2\u052d\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e"+
		"\u0095\3\2\2\2\u052f\u0537\5\u00f8}\2\u0530\u0537\5\u00f0y\2\u0531\u0537"+
		"\5\u00f4{\2\u0532\u0537\5\u00f6|\2\u0533\u0537\5\u00a8U\2\u0534\u0537"+
		"\5\u009aN\2\u0535\u0537\5\u00d2j\2\u0536\u052f\3\2\2\2\u0536\u0530\3\2"+
		"\2\2\u0536\u0531\3\2\2\2\u0536\u0532\3\2\2\2\u0536\u0533\3\2\2\2\u0536"+
		"\u0534\3\2\2\2\u0536\u0535\3\2\2\2\u0537\u0097\3\2\2\2\u0538\u053b\5\u00a6"+
		"T\2\u0539\u053b\5\u0096L\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b"+
		"\u0099\3\2\2\2\u053c\u053d\7I\2\2\u053d\u053f\7~\2\2\u053e\u0540\5\u00fc"+
		"\177\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u0542\7_\2\2\u0542\u0543\5\u012a\u0096\2\u0543\u0544\7z\2\2\u0544\u009b"+
		"\3\2\2\2\u0545\u0546\5\u009eP\2\u0546\u0547\7z\2\2\u0547\u009d\3\2\2\2"+
		"\u0548\u054a\5\u00fc\177\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u054c\3\2\2\2\u054b\u054d\5\u00b4[\2\u054c\u054b\3\2\2\2\u054c\u054d"+
		"\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\5\u00bc_\2\u054f\u0551\5\u00a0"+
		"Q\2\u0550\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u009f\3\2\2\2\u0552"+
		"\u055c\3\2\2\2\u0553\u0558\5\u00a2R\2\u0554\u0555\7t\2\2\u0555\u0557\5"+
		"\u00a2R\2\u0556\u0554\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2"+
		"\u0558\u0559\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u0552"+
		"\3\2\2\2\u055b\u0553\3\2\2\2\u055c\u00a1\3\2\2\2\u055d\u055f\5\u0120\u0091"+
		"\2\u055e\u055d\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561"+
		"\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u056b\5\u0128\u0095"+
		"\2\u0564\u0566\7Q\2\2\u0565\u0567\5`\61\2\u0566\u0565\3\2\2\2\u0566\u0567"+
		"\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\7R\2\2\u0569\u0564\3\2\2\2\u056a"+
		"\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u0570\3\2"+
		"\2\2\u056d\u056b\3\2\2\2\u056e\u056f\7_\2\2\u056f\u0571\5\u0148\u00a5"+
		"\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u00a3\3\2\2\2\u0572\u0573"+
		"\7Q\2\2\u0573\u0574\7R\2\2\u0574\u00a5\3\2\2\2\u0575\u0577\5\u00b0Y\2"+
		"\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u057a"+
		"\5\u0112\u008a\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b\3"+
		"\2\2\2\u057b\u0584\7z\2\2\u057c\u057e\5\u00fc\177\2\u057d\u057f\5\u00b0"+
		"Y\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0581\5\u0112\u008a\2\u0581\u0582\7z\2\2\u0582\u0584\3\2\2\2\u0583\u0576"+
		"\3\2\2\2\u0583\u057c\3\2\2\2\u0584\u00a7\3\2\2\2\u0585\u0586\7:\2\2\u0586"+
		"\u0587\7O\2\2\u0587\u0588\5b\62\2\u0588\u0589\7t\2\2\u0589\u058a\7\u0087"+
		"\2\2\u058a\u058b\7P\2\2\u058b\u058c\7z\2\2\u058c\u00a9\3\2\2\2\u058d\u058e"+
		"\7z\2\2\u058e\u00ab\3\2\2\2\u058f\u0590\5\u00fc\177\2\u0590\u0591\7z\2"+
		"\2\u0591\u00ad\3\2\2\2\u0592\u0595\5\u00b2Z\2\u0593\u0595\5\u00bc_\2\u0594"+
		"\u0592\3\2\2\2\u0594\u0593\3\2\2\2\u0595\u00af\3\2\2\2\u0596\u0598\5\u00ae"+
		"X\2\u0597\u0599\5\u00fc\177\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2"+
		"\u0599\u059e\3\2\2\2\u059a\u059b\5\u00aeX\2\u059b\u059c\5\u00b0Y\2\u059c"+
		"\u059e\3\2\2\2\u059d\u0596\3\2\2\2\u059d\u059a\3\2\2\2\u059e\u00b1\3\2"+
		"\2\2\u059f\u05a5\5\u00b6\\\2\u05a0\u05a5\5\u00b8]\2\u05a1\u05a5\7#\2\2"+
		"\u05a2\u05a5\7D\2\2\u05a3\u05a5\7\21\2\2\u05a4\u059f\3\2\2\2\u05a4\u05a0"+
		"\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a3\3\2\2\2\u05a5"+
		"\u00b3\3\2\2\2\u05a6\u05a8\5\u00b2Z\2\u05a7\u05a9\5\u00fc\177\2\u05a8"+
		"\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ae\3\2\2\2\u05aa\u05ab\5\u00b2"+
		"Z\2\u05ab\u05ac\5\u00b0Y\2\u05ac\u05ae\3\2\2\2\u05ad\u05a6\3\2\2\2\u05ad"+
		"\u05aa\3\2\2\2\u05ae\u00b5\3\2\2\2\u05af\u05b0\t\4\2\2\u05b0\u00b7\3\2"+
		"\2\2\u05b1\u05b2\t\5\2\2\u05b2\u00b9\3\2\2\2\u05b3\u05b4\7~\2\2\u05b4"+
		"\u00bb\3\2\2\2\u05b5\u05b9\5\u00be`\2\u05b6\u05b9\5\u0090I\2\u05b7\u05b9"+
		"\5\u00ceh\2\u05b8\u05b5\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b7\3\2\2"+
		"\2\u05b9\u00bd\3\2\2\2\u05ba\u05bf\5\u00c4c\2\u05bb\u05bf\5\u00caf\2\u05bc"+
		"\u05bf\5\u019e\u00d0\2\u05bd\u05bf\5\u0124\u0093\2\u05be\u05ba\3\2\2\2"+
		"\u05be\u05bb\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bf\u00bf"+
		"\3\2\2\2\u05c0\u05c2\5\u00bc_\2\u05c1\u05c3\5\u00fc\177\2\u05c2\u05c1"+
		"\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c8\3\2\2\2\u05c4\u05c5\5\u00bc_"+
		"\2\u05c5\u05c6\5\u00c0a\2\u05c6\u05c8\3\2\2\2\u05c7\u05c0\3\2\2\2\u05c7"+
		"\u05c4\3\2\2\2\u05c8\u00c1\3\2\2\2\u05c9\u05cb\5\u00be`\2\u05ca\u05cc"+
		"\5\u00fc\177\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d1\3\2"+
		"\2\2\u05cd\u05ce\5\u00be`\2\u05ce\u05cf\5\u00c2b\2\u05cf\u05d1\3\2\2\2"+
		"\u05d0\u05c9\3\2\2\2\u05d0\u05cd\3\2\2\2\u05d1\u00c3\3\2\2\2\u05d2\u05d4"+
		"\5\16\b\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2"+
		"\u05d5\u05ed\5\u00c6d\2\u05d6\u05d7\5\16\b\2\u05d7\u05d8\7>\2\2\u05d8"+
		"\u05d9\5\u0194\u00cb\2\u05d9\u05ed\3\2\2\2\u05da\u05ed\7\f\2\2\u05db\u05ed"+
		"\7\r\2\2\u05dc\u05ed\7\16\2\2\u05dd\u05ed\7M\2\2\u05de\u05ed\7\b\2\2\u05df"+
		"\u05ed\7\66\2\2\u05e0\u05ed\7\'\2\2\u05e1\u05ed\7(\2\2\u05e2\u05ed\7\67"+
		"\2\2\u05e3\u05e5\7H\2\2\u05e4\u05e6\5\u00c4c\2\u05e5\u05e4\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u05ed\3\2\2\2\u05e7\u05ed\7!\2\2\u05e8\u05ed\7\30"+
		"\2\2\u05e9\u05ed\7K\2\2\u05ea\u05ed\7\7\2\2\u05eb\u05ed\5\u00c8e\2\u05ec"+
		"\u05d3\3\2\2\2\u05ec\u05d6\3\2\2\2\u05ec\u05da\3\2\2\2\u05ec\u05db\3\2"+
		"\2\2\u05ec\u05dc\3\2\2\2\u05ec\u05dd\3\2\2\2\u05ec\u05de\3\2\2\2\u05ec"+
		"\u05df\3\2\2\2\u05ec\u05e0\3\2\2\2\u05ec\u05e1\3\2\2\2\u05ec\u05e2\3\2"+
		"\2\2\u05ec\u05e3\3\2\2\2\u05ec\u05e7\3\2\2\2\u05ec\u05e8\3\2\2\2\u05ec"+
		"\u05e9\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05eb\3\2\2\2\u05ed\u00c5\3\2"+
		"\2\2\u05ee\u05f3\5\u014e\u00a8\2\u05ef\u05f3\5\u00ccg\2\u05f0\u05f3\5"+
		"\u00ba^\2\u05f1\u05f3\5\u0194\u00cb\2\u05f2\u05ee\3\2\2\2\u05f2\u05ef"+
		"\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u00c7\3\2\2\2\u05f4"+
		"\u05f5\7\24\2\2\u05f5\u05f6\7O\2\2\u05f6\u05f7\5`\61\2\u05f7\u05f8\7P"+
		"\2\2\u05f8\u05fe\3\2\2\2\u05f9\u05fa\7\24\2\2\u05fa\u05fb\7O\2\2\u05fb"+
		"\u05fc\7\7\2\2\u05fc\u05fe\7P\2\2\u05fd\u05f4\3\2\2\2\u05fd\u05f9\3\2"+
		"\2\2\u05fe\u00c9\3\2\2\2\u05ff\u0601\5\u015a\u00ae\2\u0600\u0602\5\u00fc"+
		"\177\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603"+
		"\u0605\5\16\b\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3"+
		"\2\2\2\u0606\u0607\7~\2\2\u0607\u0618\3\2\2\2\u0608\u0609\5\u015a\u00ae"+
		"\2\u0609\u060a\5\u0194\u00cb\2\u060a\u0618\3\2\2\2\u060b\u060c\5\u015a"+
		"\u00ae\2\u060c\u060e\5\16\b\2\u060d\u060f\7>\2\2\u060e\u060d\3\2\2\2\u060e"+
		"\u060f\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\5\u0194\u00cb\2\u0611\u0618"+
		"\3\2\2\2\u0612\u0614\7\33\2\2\u0613\u0615\5\16\b\2\u0614\u0613\3\2\2\2"+
		"\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\7~\2\2\u0617\u05ff"+
		"\3\2\2\2\u0617\u0608\3\2\2\2\u0617\u060b\3\2\2\2\u0617\u0612\3\2\2\2\u0618"+
		"\u00cb\3\2\2\2\u0619\u061a\7~\2\2\u061a\u00cd\3\2\2\2\u061b\u061c\5\u00d0"+
		"i\2\u061c\u061e\7S\2\2\u061d\u061f\5\u00d8m\2\u061e\u061d\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\7T\2\2\u0621\u0629\3\2"+
		"\2\2\u0622\u0623\5\u00d0i\2\u0623\u0624\7S\2\2\u0624\u0625\5\u00d8m\2"+
		"\u0625\u0626\7t\2\2\u0626\u0627\7T\2\2\u0627\u0629\3\2\2\2\u0628\u061b"+
		"\3\2\2\2\u0628\u0622\3\2\2\2\u0629\u00cf\3\2\2\2\u062a\u062c\5\u00d4k"+
		"\2\u062b\u062d\5\u00fc\177\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u062f\3\2\2\2\u062e\u0630\7~\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2"+
		"\2\2\u0630\u0632\3\2\2\2\u0631\u0633\5\u00d6l\2\u0632\u0631\3\2\2\2\u0632"+
		"\u0633\3\2\2\2\u0633\u063e\3\2\2\2\u0634\u0636\5\u00d4k\2\u0635\u0637"+
		"\5\u00fc\177\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638\3\2"+
		"\2\2\u0638\u0639\5\16\b\2\u0639\u063b\7~\2\2\u063a\u063c\5\u00d6l\2\u063b"+
		"\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u062a\3\2"+
		"\2\2\u063d\u0634\3\2\2\2\u063e\u00d1\3\2\2\2\u063f\u0641\5\u00d4k\2\u0640"+
		"\u0642\5\u00fc\177\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0645\7~\2\2\u0644\u0646\5\u00d6l\2\u0645\u0644\3\2\2\2"+
		"\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\7z\2\2\u0648\u00d3"+
		"\3\2\2\2\u0649\u064f\7\33\2\2\u064a\u064b\7\33\2\2\u064b\u064f\7\17\2"+
		"\2\u064c\u064d\7\33\2\2\u064d\u064f\7<\2\2\u064e\u0649\3\2\2\2\u064e\u064a"+
		"\3\2\2\2\u064e\u064c\3\2\2\2\u064f\u00d5\3\2\2\2\u0650\u0651\7x\2\2\u0651"+
		"\u0652\5\u00c0a\2\u0652\u00d7\3\2\2\2\u0653\u0654\bm\1\2\u0654\u0655\5"+
		"\u00dan\2\u0655\u065b\3\2\2\2\u0656\u0657\f\3\2\2\u0657\u0658\7t\2\2\u0658"+
		"\u065a\5\u00dan\2\u0659\u0656\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u00d9\3\2\2\2\u065d\u065b\3\2\2\2\u065e"+
		"\u0664\5\u00dco\2\u065f\u0660\5\u00dco\2\u0660\u0661\7_\2\2\u0661\u0662"+
		"\5b\62\2\u0662\u0664\3\2\2\2\u0663\u065e\3\2\2\2\u0663\u065f\3\2\2\2\u0664"+
		"\u00db\3\2\2\2\u0665\u0666\7~\2\2\u0666\u00dd\3\2\2\2\u0667\u066a\5\u00e0"+
		"q\2\u0668\u066a\5\u00eex\2\u0669\u0667\3\2\2\2\u0669\u0668\3\2\2\2\u066a"+
		"\u00df\3\2\2\2\u066b\u066c\7~\2\2\u066c\u00e1\3\2\2\2\u066d\u0670\5\u00e4"+
		"s\2\u066e\u0670\5\u00eav\2\u066f\u066d\3\2\2\2\u066f\u066e\3\2\2\2\u0670"+
		"\u00e3\3\2\2\2\u0671\u0674\5\u00e6t\2\u0672\u0674\5\u00e8u\2\u0673\u0671"+
		"\3\2\2\2\u0673\u0672\3\2\2\2\u0674\u00e5\3\2\2\2\u0675\u0677\7&\2\2\u0676"+
		"\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\7*"+
		"\2\2\u0679\u067a\7~\2\2\u067a\u067b\7S\2\2\u067b\u067c\5\u00ecw\2\u067c"+
		"\u067d\7T\2\2\u067d\u00e7\3\2\2\2\u067e\u0680\7&\2\2\u067f\u067e\3\2\2"+
		"\2\u067f\u0680\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682\7*\2\2\u0682\u0683"+
		"\5\u00e0q\2\u0683\u0684\7S\2\2\u0684\u0685\5\u00ecw\2\u0685\u0686\7T\2"+
		"\2\u0686\u00e9\3\2\2\2\u0687\u0689\7&\2\2\u0688\u0687\3\2\2\2\u0688\u0689"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b\7*\2\2\u068b\u068c\7S\2\2\u068c"+
		"\u068d\5\u00ecw\2\u068d\u068e\7T\2\2\u068e\u00eb\3\2\2\2\u068f\u0691\5"+
		"\u008cG\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u00ed\3\2\2\2"+
		"\u0692\u0693\7~\2\2\u0693\u00ef\3\2\2\2\u0694\u0695\7*\2\2\u0695\u0696"+
		"\7~\2\2\u0696\u0697\7_\2\2\u0697\u0698\5\u00f2z\2\u0698\u0699\7z\2\2\u0699"+
		"\u00f1\3\2\2\2\u069a\u069c\5\16\b\2\u069b\u069a\3\2\2\2\u069b\u069c\3"+
		"\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\5\u00dep\2\u069e\u00f3\3\2\2\2"+
		"\u069f\u06a1\7I\2\2\u06a0\u06a2\7F\2\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\5\16\b\2\u06a4\u06a5\5\n\6\2"+
		"\u06a5\u06a6\7z\2\2\u06a6\u06ad\3\2\2\2\u06a7\u06a8\7I\2\2\u06a8\u06a9"+
		"\7y\2\2\u06a9\u06aa\5\n\6\2\u06aa\u06ab\7z\2\2\u06ab\u06ad\3\2\2\2\u06ac"+
		"\u069f\3\2\2\2\u06ac\u06a7\3\2\2\2\u06ad\u00f5\3\2\2\2\u06ae\u06b0\5\u00fc"+
		"\177\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u06b2\7I\2\2\u06b2\u06b4\7*\2\2\u06b3\u06b5\5\16\b\2\u06b4\u06b3\3\2"+
		"\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\5\u00dep\2\u06b7"+
		"\u06b8\7z\2\2\u06b8\u00f7\3\2\2\2\u06b9\u06ba\7\6\2\2\u06ba\u06bb\7O\2"+
		"\2\u06bb\u06bc\7\u0087\2\2\u06bc\u06bd\7P\2\2\u06bd\u06be\7z\2\2\u06be"+
		"\u00f9\3\2\2\2\u06bf\u06c0\7\36\2\2\u06c0\u06c1\7\u0087\2\2\u06c1\u06c3"+
		"\7S\2\2\u06c2\u06c4\5\u008cG\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2"+
		"\u06c4\u06c5\3\2\2\2\u06c5\u06ca\7T\2\2\u06c6\u06c7\7\36\2\2\u06c7\u06c8"+
		"\7\u0087\2\2\u06c8\u06ca\5\u0094K\2\u06c9\u06bf\3\2\2\2\u06c9\u06c6\3"+
		"\2\2\2\u06ca\u00fb\3\2\2\2\u06cb\u06cc\b\177\1\2\u06cc\u06cd\5\u00fe\u0080"+
		"\2\u06cd\u06d2\3\2\2\2\u06ce\u06cf\f\3\2\2\u06cf\u06d1\5\u00fe\u0080\2"+
		"\u06d0\u06ce\3\2\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3"+
		"\3\2\2\2\u06d3\u00fd\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d6\7Q\2\2\u06d6"+
		"\u06d7\7Q\2\2\u06d7\u06d8\5\u0102\u0082\2\u06d8\u06d9\7R\2\2\u06d9\u06da"+
		"\7R\2\2\u06da\u06dd\3\2\2\2\u06db\u06dd\5\u0100\u0081\2\u06dc\u06d5\3"+
		"\2\2\2\u06dc\u06db\3\2\2\2\u06dd\u00ff\3\2\2\2\u06de\u06df\7\4\2\2\u06df"+
		"\u06e0\7O\2\2\u06e0\u06e2\5\u012a\u0096\2\u06e1\u06e3\7}\2\2\u06e2\u06e1"+
		"\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7P\2\2\u06e5"+
		"\u06ef\3\2\2\2\u06e6\u06e7\7\4\2\2\u06e7\u06e8\7O\2\2\u06e8\u06ea\5b\62"+
		"\2\u06e9\u06eb\7}\2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u06ed\7P\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06de\3\2\2\2\u06ee"+
		"\u06e6\3\2\2\2\u06ef\u0101\3\2\2\2\u06f0\u06f2\b\u0082\1\2\u06f1\u06f3"+
		"\5\u0104\u0083\2\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f8\3"+
		"\2\2\2\u06f4\u06f5\5\u0104\u0083\2\u06f5\u06f6\7}\2\2\u06f6\u06f8\3\2"+
		"\2\2\u06f7\u06f0\3\2\2\2\u06f7\u06f4\3\2\2\2\u06f8\u0705\3\2\2\2\u06f9"+
		"\u06fa\f\5\2\2\u06fa\u06fc\7t\2\2\u06fb\u06fd\5\u0104\u0083\2\u06fc\u06fb"+
		"\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0704\3\2\2\2\u06fe\u06ff\f\3\2\2\u06ff"+
		"\u0700\7t\2\2\u0700\u0701\5\u0104\u0083\2\u0701\u0702\7}\2\2\u0702\u0704"+
		"\3\2\2\2\u0703\u06f9\3\2\2\2\u0703\u06fe\3\2\2\2\u0704\u0707\3\2\2\2\u0705"+
		"\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0103\3\2\2\2\u0707\u0705\3\2"+
		"\2\2\u0708\u070a\5\u0106\u0084\2\u0709\u070b\5\u010c\u0087\2\u070a\u0709"+
		"\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0105\3\2\2\2\u070c\u070f\7~\2\2\u070d"+
		"\u070f\5\u0108\u0085\2\u070e\u070c\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u0107"+
		"\3\2\2\2\u0710\u0711\5\u010a\u0086\2\u0711\u0712\7y\2\2\u0712\u0713\7"+
		"~\2\2\u0713\u0109\3\2\2\2\u0714\u0715\7~\2\2\u0715\u010b\3\2\2\2\u0716"+
		"\u0717\7O\2\2\u0717\u0718\5\u010e\u0088\2\u0718\u0719\7P\2\2\u0719\u010d"+
		"\3\2\2\2\u071a\u071c\b\u0088\1\2\u071b\u071d\5\u0110\u0089\2\u071c\u071b"+
		"\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0722\3\2\2\2\u071e\u071f\f\3\2\2\u071f"+
		"\u0721\5\u0110\u0089\2\u0720\u071e\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u010f\3\2\2\2\u0724\u0722\3\2\2\2\u0725"+
		"\u0726\7O\2\2\u0726\u0727\5\u010e\u0088\2\u0727\u0728\7P\2\2\u0728\u0732"+
		"\3\2\2\2\u0729\u072a\7Q\2\2\u072a\u072b\5\u010e\u0088\2\u072b\u072c\7"+
		"R\2\2\u072c\u0732\3\2\2\2\u072d\u072e\7S\2\2\u072e\u072f\5\u010e\u0088"+
		"\2\u072f\u0730\7T\2\2\u0730\u0732\3\2\2\2\u0731\u0725\3\2\2\2\u0731\u0729"+
		"\3\2\2\2\u0731\u072d\3\2\2\2\u0732\u0111\3\2\2\2\u0733\u0738\5\u0114\u008b"+
		"\2\u0734\u0735\7t\2\2\u0735\u0737\5\u0114\u008b\2\u0736\u0734\3\2\2\2"+
		"\u0737\u073a\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0113"+
		"\3\2\2\2\u073a\u0738\3\2\2\2\u073b\u073d\5\u0116\u008c\2\u073c\u073e\5"+
		"\u0144\u00a3\2\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0115\3\2"+
		"\2\2\u073f\u0745\5\u0118\u008d\2\u0740\u0741\5\u011a\u008e\2\u0741\u0742"+
		"\5\u011c\u008f\2\u0742\u0743\5\u011e\u0090\2\u0743\u0745\3\2\2\2\u0744"+
		"\u073f\3\2\2\2\u0744\u0740\3\2\2\2\u0745\u0117\3\2\2\2\u0746\u0748\5\u0120"+
		"\u0091\2\u0747\u0746\3\2\2\2\u0748\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749"+
		"\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u0749\3\2\2\2\u074c\u074d\5\u011a"+
		"\u008e\2\u074d\u0119\3\2\2\2\u074e\u074f\b\u008e\1\2\u074f\u0751\5\u0128"+
		"\u0095\2\u0750\u0752\5\u00fc\177\2\u0751\u0750\3\2\2\2\u0751\u0752\3\2"+
		"\2\2\u0752\u0758\3\2\2\2\u0753\u0754\7O\2\2\u0754\u0755\5\u0118\u008d"+
		"\2\u0755\u0756\7P\2\2\u0756\u0758\3\2\2\2\u0757\u074e\3\2\2\2\u0757\u0753"+
		"\3\2\2\2\u0758\u0766\3\2\2\2\u0759\u075a\f\5\2\2\u075a\u0765\5\u011c\u008f"+
		"\2\u075b\u075c\f\4\2\2\u075c\u075e\7Q\2\2\u075d\u075f\5b\62\2\u075e\u075d"+
		"\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\7R\2\2\u0761"+
		"\u0763\5\u00fc\177\2\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765"+
		"\3\2\2\2\u0764\u0759\3\2\2\2\u0764\u075b\3\2\2\2\u0765\u0768\3\2\2\2\u0766"+
		"\u0764\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u011b\3\2\2\2\u0768\u0766\3\2"+
		"\2\2\u0769\u076a\7O\2\2\u076a\u076b\5\u0136\u009c\2\u076b\u076d\7P\2\2"+
		"\u076c\u076e\5\u0122\u0092\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e"+
		"\u0770\3\2\2\2\u076f\u0771\5\u0126\u0094\2\u0770\u076f\3\2\2\2\u0770\u0771"+
		"\3\2\2\2\u0771\u0773\3\2\2\2\u0772\u0774\5\u01b0\u00d9\2\u0773\u0772\3"+
		"\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\3\2\2\2\u0775\u0777\5\u00fc\177"+
		"\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u011d\3\2\2\2\u0778\u0779"+
		"\7v\2\2\u0779\u077b\5\u00c2b\2\u077a\u077c\5\u012c\u0097\2\u077b\u077a"+
		"\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u011f\3\2\2\2\u077d\u077f\7W\2\2\u077e"+
		"\u0780\5\u00fc\177\2\u077f\u077e\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782"+
		"\3\2\2\2\u0781\u0783\5\u0122\u0092\2\u0782\u0781\3\2\2\2\u0782\u0783\3"+
		"\2\2\2\u0783\u0795\3\2\2\2\u0784\u0786\7[\2\2\u0785\u0787\5\u00fc\177"+
		"\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0795\3\2\2\2\u0788\u078a"+
		"\7p\2\2\u0789\u078b\5\u00fc\177\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2"+
		"\2\2\u078b\u0795\3\2\2\2\u078c\u078d\5\16\b\2\u078d\u078f\7W\2\2\u078e"+
		"\u0790\5\u00fc\177\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792"+
		"\3\2\2\2\u0791\u0793\5\u0122\u0092\2\u0792\u0791\3\2\2\2\u0792\u0793\3"+
		"\2\2\2\u0793\u0795\3\2\2\2\u0794\u077d\3\2\2\2\u0794\u0784\3\2\2\2\u0794"+
		"\u0788\3\2\2\2\u0794\u078c\3\2\2\2\u0795\u0121\3\2\2\2\u0796\u0798\5\u0124"+
		"\u0093\2\u0797\u0799\5\u0122\u0092\2\u0798\u0797\3\2\2\2\u0798\u0799\3"+
		"\2\2\2\u0799\u0123\3\2\2\2\u079a\u079b\t\6\2\2\u079b\u0125\3\2\2\2\u079c"+
		"\u079d\t\7\2\2\u079d\u0127\3\2\2\2\u079e\u07a0\7}\2\2\u079f\u079e\3\2"+
		"\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\5\6\4\2\u07a2"+
		"\u0129\3\2\2\2\u07a3\u07a5\5\u00c0a\2\u07a4\u07a6\5\u012c\u0097\2\u07a5"+
		"\u07a4\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u012b\3\2\2\2\u07a7\u07b0\5\u012e"+
		"\u0098\2\u07a8\u07aa\5\u0130\u0099\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3"+
		"\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\5\u011c\u008f\2\u07ac\u07ad\5\u011e"+
		"\u0090\2\u07ad\u07b0\3\2\2\2\u07ae\u07b0\5\u0132\u009a\2\u07af\u07a7\3"+
		"\2\2\2\u07af\u07a9\3\2\2\2\u07af\u07ae\3\2\2\2\u07b0\u012d\3\2\2\2\u07b1"+
		"\u07b7\5\u0130\u0099\2\u07b2\u07b4\5\u0120\u0091\2\u07b3\u07b5\5\u012e"+
		"\u0098\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b7\3\2\2\2\u07b6"+
		"\u07b1\3\2\2\2\u07b6\u07b2\3\2\2\2\u07b7\u012f\3\2\2\2\u07b8\u07b9\b\u0099"+
		"\1\2\u07b9\u07c7\5\u011c\u008f\2\u07ba\u07bc\7Q\2\2\u07bb\u07bd\5b\62"+
		"\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07c0"+
		"\7R\2\2\u07bf\u07c1\5\u00fc\177\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2"+
		"\2\2\u07c1\u07c7\3\2\2\2\u07c2\u07c3\7O\2\2\u07c3\u07c4\5\u012e\u0098"+
		"\2\u07c4\u07c5\7P\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07b8\3\2\2\2\u07c6\u07ba"+
		"\3\2\2\2\u07c6\u07c2\3\2\2\2\u07c7\u07d5\3\2\2\2\u07c8\u07c9\f\7\2\2\u07c9"+
		"\u07d4\5\u011c\u008f\2\u07ca\u07cb\f\5\2\2\u07cb\u07cd\7Q\2\2\u07cc\u07ce"+
		"\5b\62\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf"+
		"\u07d1\7R\2\2\u07d0\u07d2\5\u00fc\177\2\u07d1\u07d0\3\2\2\2\u07d1\u07d2"+
		"\3\2\2\2\u07d2\u07d4\3\2\2\2\u07d3\u07c8\3\2\2\2\u07d3\u07ca\3\2\2\2\u07d4"+
		"\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u0131\3\2"+
		"\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07dd\5\u0134\u009b\2\u07d9\u07da\5\u0120"+
		"\u0091\2\u07da\u07db\5\u0132\u009a\2\u07db\u07dd\3\2\2\2\u07dc\u07d8\3"+
		"\2\2\2\u07dc\u07d9\3\2\2\2\u07dd\u0133\3\2\2\2\u07de\u07df\b\u009b\1\2"+
		"\u07df\u07e0\7}\2\2\u07e0\u07ee\3\2\2\2\u07e1\u07e2\f\5\2\2\u07e2\u07ed"+
		"\5\u011c\u008f\2\u07e3\u07e4\f\4\2\2\u07e4\u07e6\7Q\2\2\u07e5\u07e7\5"+
		"b\62\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8"+
		"\u07ea\7R\2\2\u07e9\u07eb\5\u00fc\177\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb"+
		"\3\2\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07e1\3\2\2\2\u07ec\u07e3\3\2\2\2\u07ed"+
		"\u07f0\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u0135\3\2"+
		"\2\2\u07f0\u07ee\3\2\2\2\u07f1\u07f3\5\u0138\u009d\2\u07f2\u07f1\3\2\2"+
		"\2\u07f2\u07f3\3\2\2\2\u07f3\u07f5\3\2\2\2\u07f4\u07f6\7}\2\2\u07f5\u07f4"+
		"\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07fc\3\2\2\2\u07f7\u07f8\5\u0138\u009d"+
		"\2\u07f8\u07f9\7t\2\2\u07f9\u07fa\7}\2\2\u07fa\u07fc\3\2\2\2\u07fb\u07f2"+
		"\3\2\2\2\u07fb\u07f7\3\2\2\2\u07fc\u0137\3\2\2\2\u07fd\u07fe\b\u009d\1"+
		"\2\u07fe\u07ff\5\u013a\u009e\2\u07ff\u0805\3\2\2\2\u0800\u0801\f\3\2\2"+
		"\u0801\u0802\7t\2\2\u0802\u0804\5\u013a\u009e\2\u0803\u0800\3\2\2\2\u0804"+
		"\u0807\3\2\2\2\u0805\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0139\3\2"+
		"\2\2\u0807\u0805\3\2\2\2\u0808\u080a\5\u00fc\177\2\u0809\u0808\3\2\2\2"+
		"\u0809\u080a\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\5\u00b0Y\2\u080c"+
		"\u080d\5\u0116\u008c\2\u080d\u0828\3\2\2\2\u080e\u0810\5\u00fc\177\2\u080f"+
		"\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\5\u00b0"+
		"Y\2\u0812\u0813\5\u0116\u008c\2\u0813\u0814\7_\2\2\u0814\u0815\5\u0148"+
		"\u00a5\2\u0815\u0828\3\2\2\2\u0816\u0818\5\u00fc\177\2\u0817\u0816\3\2"+
		"\2\2\u0817\u0818\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081b\5\u00b0Y\2\u081a"+
		"\u081c\5\u012c\u0097\2\u081b\u081a\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u0828"+
		"\3\2\2\2\u081d\u081f\5\u00fc\177\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2"+
		"\2\2\u081f\u0820\3\2\2\2\u0820\u0822\5\u00b0Y\2\u0821\u0823\5\u012c\u0097"+
		"\2\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825"+
		"\7_\2\2\u0825\u0826\5\u0148\u00a5\2\u0826\u0828\3\2\2\2\u0827\u0809\3"+
		"\2\2\2\u0827\u080f\3\2\2\2\u0827\u0817\3\2\2\2\u0827\u081e\3\2\2\2\u0828"+
		"\u013b\3\2\2\2\u0829\u082b\5\u00fc\177\2\u082a\u0829\3\2\2\2\u082a\u082b"+
		"\3\2\2\2\u082b\u082d\3\2\2\2\u082c\u082e\5\u00b4[\2\u082d\u082c\3\2\2"+
		"\2\u082d\u082e\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\5\u013e\u00a0\2"+
		"\u0830\u0832\5\u0168\u00b5\2\u0831\u0830\3\2\2\2\u0831\u0832\3\2\2\2\u0832"+
		"\u0833\3\2\2\2\u0833\u0834\5\u0142\u00a2\2\u0834\u013d\3\2\2\2\u0835\u0837"+
		"\5\u00bc_\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\3\2\2"+
		"\2\u0838\u0839\5\u0140\u00a1\2\u0839\u013f\3\2\2\2\u083a\u083b\5\u0128"+
		"\u0095\2\u083b\u083c\7O\2\2\u083c\u083d\5\u0136\u009c\2\u083d\u083e\7"+
		"P\2\2\u083e\u0141\3\2\2\2\u083f\u0841\5\u0180\u00c1\2\u0840\u083f\3\2"+
		"\2\2\u0840\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u084b\5j\66\2\u0843"+
		"\u084b\5\u01a6\u00d4\2\u0844\u0845\7_\2\2\u0845\u0846\7\25\2\2\u0846\u084b"+
		"\7z\2\2\u0847\u0848\7_\2\2\u0848\u0849\7\26\2\2\u0849\u084b\7z\2\2\u084a"+
		"\u0840\3\2\2\2\u084a\u0843\3\2\2\2\u084a\u0844\3\2\2\2\u084a\u0847\3\2"+
		"\2\2\u084b\u0143\3\2\2\2\u084c\u0852\5\u0146\u00a4\2\u084d\u084e\7O\2"+
		"\2\u084e\u084f\5&\24\2\u084f\u0850\7P\2\2\u0850\u0852\3\2\2\2\u0851\u084c"+
		"\3\2\2\2\u0851\u084d\3\2\2\2\u0852\u0145\3\2\2\2\u0853\u0854\7_\2\2\u0854"+
		"\u0857\5\u0148\u00a5\2\u0855\u0857\5\u014c\u00a7\2\u0856\u0853\3\2\2\2"+
		"\u0856\u0855\3\2\2\2\u0857\u0147\3\2\2\2\u0858\u085b\5\\/\2\u0859\u085b"+
		"\5\u014c\u00a7\2\u085a\u0858\3\2\2\2\u085a\u0859\3\2\2\2\u085b\u0149\3"+
		"\2\2\2\u085c\u0861\5\u0148\u00a5\2\u085d\u085e\7t\2\2\u085e\u0860\5\u0148"+
		"\u00a5\2\u085f\u085d\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u085f\3\2\2\2\u0861"+
		"\u0862\3\2\2\2\u0862\u014b\3\2\2\2\u0863\u0861\3\2\2\2\u0864\u0865\7S"+
		"\2\2\u0865\u0867\5\u014a\u00a6\2\u0866\u0868\7t\2\2\u0867\u0866\3\2\2"+
		"\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\7T\2\2\u086a\u086e"+
		"\3\2\2\2\u086b\u086c\7S\2\2\u086c\u086e\7T\2\2\u086d\u0864\3\2\2\2\u086d"+
		"\u086b\3\2\2\2\u086e\u014d\3\2\2\2\u086f\u0872\7~\2\2\u0870\u0872\5\u0194"+
		"\u00cb\2\u0871\u086f\3\2\2\2\u0871\u0870\3\2\2\2\u0872\u014f\3\2\2\2\u0873"+
		"\u0874\5\u0154\u00ab\2\u0874\u0875\5\u0152\u00aa\2\u0875\u0151\3\2\2\2"+
		"\u0876\u0878\7S\2\2\u0877\u0879\5\u015c\u00af\2\u0878\u0877\3\2\2\2\u0878"+
		"\u0879\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087b\7T\2\2\u087b\u0153\3\2"+
		"\2\2\u087c\u087e\5\u015a\u00ae\2\u087d\u087f\5\u00fc\177\2\u087e\u087d"+
		"\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\3\2\2\2\u0880\u0882\5\16\b\2"+
		"\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0885"+
		"\5\u0156\u00ac\2\u0884\u0886\5\u0158\u00ad\2\u0885\u0884\3\2\2\2\u0885"+
		"\u0886\3\2\2\2\u0886\u0888\3\2\2\2\u0887\u0889\5\u016e\u00b8\2\u0888\u0887"+
		"\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u0892\3\2\2\2\u088a\u088c\5\u015a\u00ae"+
		"\2\u088b\u088d\5\u00fc\177\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d"+
		"\u088f\3\2\2\2\u088e\u0890\5\u016e\u00b8\2\u088f\u088e\3\2\2\2\u088f\u0890"+
		"\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u087c\3\2\2\2\u0891\u088a\3\2\2\2\u0892"+
		"\u0155\3\2\2\2\u0893\u0895\5\16\b\2\u0894\u0893\3\2\2\2\u0894\u0895\3"+
		"\2\2\2\u0895\u0896\3\2\2\2\u0896\u0897\5\u014e\u00a8\2\u0897\u0157\3\2"+
		"\2\2\u0898\u0899\7 \2\2\u0899\u0159\3\2\2\2\u089a\u089b\t\b\2\2\u089b"+
		"\u015b\3\2\2\2\u089c\u089e\5\u015e\u00b0\2\u089d\u089f\5\u015c\u00af\2"+
		"\u089e\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a6\3\2\2\2\u08a0\u08a1"+
		"\5\u0178\u00bd\2\u08a1\u08a3\7x\2\2\u08a2\u08a4\5\u015c\u00af\2\u08a3"+
		"\u08a2\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5\u089c\3\2"+
		"\2\2\u08a5\u08a0\3\2\2\2\u08a6\u015d\3\2\2\2\u08a7\u08af\5\u0160\u00b1"+
		"\2\u08a8\u08af\5\u013c\u009f\2\u08a9\u08af\5\u00f4{\2\u08aa\u08af\5\u00a8"+
		"U\2\u08ab\u08af\5\u018c\u00c7\2\u08ac\u08af\5\u009aN\2\u08ad\u08af\5\u00aa"+
		"V\2\u08ae\u08a7\3\2\2\2\u08ae\u08a8\3\2\2\2\u08ae\u08a9\3\2\2\2\u08ae"+
		"\u08aa\3\2\2\2\u08ae\u08ab\3\2\2\2\u08ae\u08ac\3\2\2\2\u08ae\u08ad\3\2"+
		"\2\2\u08af\u015f\3\2\2\2\u08b0\u08b1\5\u0162\u00b2\2\u08b1\u08b2\7z\2"+
		"\2\u08b2\u0161\3\2\2\2\u08b3\u08b5\5\u00fc\177\2\u08b4\u08b3\3\2\2\2\u08b4"+
		"\u08b5\3\2\2\2\u08b5\u08b7\3\2\2\2\u08b6\u08b8\5\u00b4[\2\u08b7\u08b6"+
		"\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08bd\5\u00bc_"+
		"\2\u08ba\u08bc\5\u0120\u0091\2\u08bb\u08ba\3\2\2\2\u08bc\u08bf\3\2\2\2"+
		"\u08bd\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c1\3\2\2\2\u08bf\u08bd"+
		"\3\2\2\2\u08c0\u08c2\5\u0164\u00b3\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3"+
		"\2\2\2\u08c2\u0163\3\2\2\2\u08c3\u08c4\b\u00b3\1\2\u08c4\u08c5\5\u0166"+
		"\u00b4\2\u08c5\u08cb\3\2\2\2\u08c6\u08c7\f\3\2\2\u08c7\u08c8\7t\2\2\u08c8"+
		"\u08ca\5\u0166\u00b4\2\u08c9\u08c6\3\2\2\2\u08ca\u08cd\3\2\2\2\u08cb\u08c9"+
		"\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u0165\3\2\2\2\u08cd\u08cb\3\2\2\2\u08ce"+
		"\u08d0\5\u0128\u0095\2\u08cf\u08d1\5\u0168\u00b5\2\u08d0\u08cf\3\2\2\2"+
		"\u08d0\u08d1\3\2\2\2\u08d1\u08d3\3\2\2\2\u08d2\u08d4\5\u016c\u00b7\2\u08d3"+
		"\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08e7\3\2\2\2\u08d5\u08d8\5\u0128"+
		"\u0095\2\u08d6\u08d7\7_\2\2\u08d7\u08d9\5\u0148\u00a5\2\u08d8\u08d6\3"+
		"\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08e7\3\2\2\2\u08da\u08dc\5\u0128\u0095"+
		"\2\u08db\u08dd\5\u014c\u00a7\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2"+
		"\u08dd\u08e7\3\2\2\2\u08de\u08e0\7~\2\2\u08df\u08de\3\2\2\2\u08df\u08e0"+
		"\3\2\2\2\u08e0\u08e2\3\2\2\2\u08e1\u08e3\5\u00fc\177\2\u08e2\u08e1\3\2"+
		"\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\7x\2\2\u08e5"+
		"\u08e7\5b\62\2\u08e6\u08ce\3\2\2\2\u08e6\u08d5\3\2\2\2\u08e6\u08da\3\2"+
		"\2\2\u08e6\u08df\3\2\2\2\u08e7\u0167\3\2\2\2\u08e8\u08e9\b\u00b5\1\2\u08e9"+
		"\u08ea\5\u016a\u00b6\2\u08ea\u08ef\3\2\2\2\u08eb\u08ec\f\3\2\2\u08ec\u08ee"+
		"\5\u016a\u00b6\2\u08ed\u08eb\3\2\2\2\u08ee\u08f1\3\2\2\2\u08ef\u08ed\3"+
		"\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u0169\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f2"+
		"\u08f3\t\t\2\2\u08f3\u016b\3\2\2\2\u08f4\u08f5\7_\2\2\u08f5\u08f6\7\u0081"+
		"\2\2\u08f6\u08f7\b\u00b7\1\2\u08f7\u016d\3\2\2\2\u08f8\u08f9\7x\2\2\u08f9"+
		"\u08fa\5\u0170\u00b9\2\u08fa\u016f\3\2\2\2\u08fb\u08fc\b\u00b9\1\2\u08fc"+
		"\u08fe\5\u0172\u00ba\2\u08fd\u08ff\7}\2\2\u08fe\u08fd\3\2\2\2\u08fe\u08ff"+
		"\3\2\2\2\u08ff\u0908\3\2\2\2\u0900\u0901\f\3\2\2\u0901\u0902\7t\2\2\u0902"+
		"\u0904\5\u0172\u00ba\2\u0903\u0905\7}\2\2\u0904\u0903\3\2\2\2\u0904\u0905"+
		"\3\2\2\2\u0905\u0907\3\2\2\2\u0906\u0900\3\2\2\2\u0907\u090a\3\2\2\2\u0908"+
		"\u0906\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0171\3\2\2\2\u090a\u0908\3\2"+
		"\2\2\u090b\u090d\5\u00fc\177\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2\2"+
		"\u090d\u090e\3\2\2\2\u090e\u0921\5\u0176\u00bc\2\u090f\u0911\5\u00fc\177"+
		"\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0914"+
		"\7J\2\2\u0913\u0915\5\u0178\u00bd\2\u0914\u0913\3\2\2\2\u0914\u0915\3"+
		"\2\2\2\u0915\u0916\3\2\2\2\u0916\u0921\5\u0176\u00bc\2\u0917\u0919\5\u00fc"+
		"\177\2\u0918\u0917\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u091a\3\2\2\2\u091a"+
		"\u091c\5\u0178\u00bd\2\u091b\u091d\7J\2\2\u091c\u091b\3\2\2\2\u091c\u091d"+
		"\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u091f\5\u0176\u00bc\2\u091f\u0921\3"+
		"\2\2\2\u0920\u090c\3\2\2\2\u0920\u0910\3\2\2\2\u0920\u0918\3\2\2\2\u0921"+
		"\u0173\3\2\2\2\u0922\u0924\5\16\b\2\u0923\u0922\3\2\2\2\u0923\u0924\3"+
		"\2\2\2\u0924\u0925\3\2\2\2\u0925\u0928\5\u014e\u00a8\2\u0926\u0928\5\u00c8"+
		"e\2\u0927\u0923\3\2\2\2\u0927\u0926\3\2\2\2\u0928\u0175\3\2\2\2\u0929"+
		"\u092a\5\u0174\u00bb\2\u092a\u0177\3\2\2\2\u092b\u092c\t\n\2\2\u092c\u0179"+
		"\3\2\2\2\u092d\u092e\7.\2\2\u092e\u092f\5\u017c\u00bf\2\u092f\u017b\3"+
		"\2\2\2\u0930\u0932\5\u00c0a\2\u0931\u0933\5\u017e\u00c0\2\u0932\u0931"+
		"\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u017d\3\2\2\2\u0934\u0936\5\u0120\u0091"+
		"\2\u0935\u0937\5\u017e\u00c0\2\u0936\u0935\3\2\2\2\u0936\u0937\3\2\2\2"+
		"\u0937\u017f\3\2\2\2\u0938\u0939\7x\2\2\u0939\u093a\5\u0182\u00c2\2\u093a"+
		"\u0181\3\2\2\2\u093b\u093d\5\u0184\u00c3\2\u093c\u093e\7}\2\2\u093d\u093c"+
		"\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0947\3\2\2\2\u093f\u0941\5\u0184\u00c3"+
		"\2\u0940\u0942\7}\2\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0943"+
		"\3\2\2\2\u0943\u0944\7t\2\2\u0944\u0945\5\u0182\u00c2\2\u0945\u0947\3"+
		"\2\2\2\u0946\u093b\3\2\2\2\u0946\u093f\3\2\2\2\u0947\u0183\3\2\2\2\u0948"+
		"\u0949\5\u0186\u00c4\2\u0949\u094b\7O\2\2\u094a\u094c\5&\24\2\u094b\u094a"+
		"\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\7P\2\2\u094e"+
		"\u0953\3\2\2\2\u094f\u0950\5\u0186\u00c4\2\u0950\u0951\5\u014c\u00a7\2"+
		"\u0951\u0953\3\2\2\2\u0952\u0948\3\2\2\2\u0952\u094f\3\2\2\2\u0953\u0185"+
		"\3\2\2\2\u0954\u0957\5\u0174\u00bb\2\u0955\u0957\7~\2\2\u0956\u0954\3"+
		"\2\2\2\u0956\u0955\3\2\2\2\u0957\u0187\3\2\2\2\u0958\u0959\7.\2\2\u0959"+
		"\u095a\5\u01bc\u00df\2\u095a\u0189\3\2\2\2\u095b\u095c\7.\2\2\u095c\u095d"+
		"\7\u0087\2\2\u095d\u0961\7~\2\2\u095e\u095f\7.\2\2\u095f\u0961\7\u008b"+
		"\2\2\u0960\u095b\3\2\2\2\u0960\u095e\3\2\2\2\u0961\u018b\3\2\2\2\u0962"+
		"\u0963\7>\2\2\u0963\u0964\7`\2\2\u0964\u0965\5\u018e\u00c8\2\u0965\u0966"+
		"\7a\2\2\u0966\u0967\5\u0094K\2\u0967\u018d\3\2\2\2\u0968\u0969\b\u00c8"+
		"\1\2\u0969\u096a\5\u0190\u00c9\2\u096a\u0970\3\2\2\2\u096b\u096c\f\3\2"+
		"\2\u096c\u096d\7t\2\2\u096d\u096f\5\u0190\u00c9\2\u096e\u096b\3\2\2\2"+
		"\u096f\u0972\3\2\2\2\u0970\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u018f"+
		"\3\2\2\2\u0972\u0970";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0973\u0976\5\u0192\u00ca\2\u0974\u0976\5\u013a\u009e\2\u0975"+
		"\u0973\3\2\2\2\u0975\u0974\3\2\2\2\u0976\u0191\3\2\2\2\u0977\u0979\7\17"+
		"\2\2\u0978\u097a\7}\2\2\u0979\u0978\3\2\2\2\u0979\u097a\3\2\2\2\u097a"+
		"\u097c\3\2\2\2\u097b\u097d\7~\2\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2"+
		"\2\2\u097d\u09a8\3\2\2\2\u097e\u0980\7\17\2\2\u097f\u0981\7~\2\2\u0980"+
		"\u097f\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\7_"+
		"\2\2\u0983\u09a8\5\u012a\u0096\2\u0984\u0986\7F\2\2\u0985\u0987\7}\2\2"+
		"\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0989\3\2\2\2\u0988\u098a"+
		"\7~\2\2\u0989\u0988\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u09a8\3\2\2\2\u098b"+
		"\u098d\7F\2\2\u098c\u098e\7~\2\2\u098d\u098c\3\2\2\2\u098d\u098e\3\2\2"+
		"\2\u098e\u098f\3\2\2\2\u098f\u0990\7_\2\2\u0990\u09a8\5\u012a\u0096\2"+
		"\u0991\u0992\7>\2\2\u0992\u0993\7`\2\2\u0993\u0994\5\u018e\u00c8\2\u0994"+
		"\u0995\7a\2\2\u0995\u0997\7\17\2\2\u0996\u0998\7}\2\2\u0997\u0996\3\2"+
		"\2\2\u0997\u0998\3\2\2\2\u0998\u099a\3\2\2\2\u0999\u099b\7~\2\2\u099a"+
		"\u0999\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u09a8\3\2\2\2\u099c\u099d\7>"+
		"\2\2\u099d\u099e\7`\2\2\u099e\u099f\5\u018e\u00c8\2\u099f\u09a0\7a\2\2"+
		"\u09a0\u09a2\7\17\2\2\u09a1\u09a3\7~\2\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3"+
		"\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\7_\2\2\u09a5\u09a6\5\6\4\2\u09a6"+
		"\u09a8\3\2\2\2\u09a7\u0977\3\2\2\2\u09a7\u097e\3\2\2\2\u09a7\u0984\3\2"+
		"\2\2\u09a7\u098b\3\2\2\2\u09a7\u0991\3\2\2\2\u09a7\u099c\3\2\2\2\u09a8"+
		"\u0193\3\2\2\2\u09a9\u09aa\5\u0198\u00cd\2\u09aa\u09ac\7`\2\2\u09ab\u09ad"+
		"\5\u019a\u00ce\2\u09ac\u09ab\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\3"+
		"\2\2\2\u09ae\u09af\7a\2\2\u09af\u0195\3\2\2\2\u09b0\u09c0\5\u0194\u00cb"+
		"\2\u09b1\u09b2\5\u0188\u00c5\2\u09b2\u09b4\7`\2\2\u09b3\u09b5\5\u019a"+
		"\u00ce\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6"+
		"\u09b7\7a\2\2\u09b7\u09c0\3\2\2\2\u09b8\u09b9\5\u018a\u00c6\2\u09b9\u09bb"+
		"\7`\2\2\u09ba\u09bc\5\u019a\u00ce\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3"+
		"\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\7a\2\2\u09be\u09c0\3\2\2\2\u09bf"+
		"\u09b0\3\2\2\2\u09bf\u09b1\3\2\2\2\u09bf\u09b8\3\2\2\2\u09c0\u0197\3\2"+
		"\2\2\u09c1\u09c2\7~\2\2\u09c2\u0199\3\2\2\2\u09c3\u09c4\b\u00ce\1\2\u09c4"+
		"\u09c6\5\u019c\u00cf\2\u09c5\u09c7\7}\2\2\u09c6\u09c5\3\2\2\2\u09c6\u09c7"+
		"\3\2\2\2\u09c7\u09d0\3\2\2\2\u09c8\u09c9\f\3\2\2\u09c9\u09ca\7t\2\2\u09ca"+
		"\u09cc\5\u019c\u00cf\2\u09cb\u09cd\7}\2\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd"+
		"\3\2\2\2\u09cd\u09cf\3\2\2\2\u09ce\u09c8\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0"+
		"\u09ce\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u019b\3\2\2\2\u09d2\u09d0\3\2"+
		"\2\2\u09d3\u09d7\5b\62\2\u09d4\u09d7\5\u012a\u0096\2\u09d5\u09d7\5\6\4"+
		"\2\u09d6\u09d3\3\2\2\2\u09d6\u09d4\3\2\2\2\u09d6\u09d5\3\2\2\2\u09d7\u019d"+
		"\3\2\2\2\u09d8\u09d9\7F\2\2\u09d9\u09da\5\16\b\2\u09da\u09db\7~\2\2\u09db"+
		"\u09e4\3\2\2\2\u09dc\u09dd\7F\2\2\u09dd\u09df\5\16\b\2\u09de\u09e0\7>"+
		"\2\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1"+
		"\u09e2\5\u0194\u00cb\2\u09e2\u09e4\3\2\2\2\u09e3\u09d8\3\2\2\2\u09e3\u09dc"+
		"\3\2\2\2\u09e4\u019f\3\2\2\2\u09e5\u09e7\7\36\2\2\u09e6\u09e5\3\2\2\2"+
		"\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\7>\2\2\u09e9\u09ea"+
		"\5\u0094K\2\u09ea\u01a1\3\2\2\2\u09eb\u09ec\7>\2\2\u09ec\u09ed\7`\2\2"+
		"\u09ed\u09ee\7a\2\2\u09ee\u09ef\5\u0094K\2\u09ef\u01a3\3\2\2\2\u09f0\u09f1"+
		"\7C\2\2\u09f1\u09f2\5j\66\2\u09f2\u09f3\5\u01a8\u00d5\2\u09f3\u01a5\3"+
		"\2\2\2\u09f4\u09f6\7C\2\2\u09f5\u09f7\5\u0180\u00c1\2\u09f6\u09f5\3\2"+
		"\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\5j\66\2\u09f9"+
		"\u09fa\5\u01a8\u00d5\2\u09fa\u01a7\3\2\2\2\u09fb\u09fd\5\u01aa\u00d6\2"+
		"\u09fc\u09fe\5\u01a8\u00d5\2\u09fd\u09fc\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe"+
		"\u01a9\3\2\2\2\u09ff\u0a00\7\13\2\2\u0a00\u0a01\7O\2\2\u0a01\u0a02\5\u01ac"+
		"\u00d7\2\u0a02\u0a03\7P\2\2\u0a03\u0a04\5j\66\2\u0a04\u01ab\3\2\2\2\u0a05"+
		"\u0a07\5\u00fc\177\2\u0a06\u0a05\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07\u0a08"+
		"\3\2\2\2\u0a08\u0a09\5\u00c0a\2\u0a09\u0a0a\5\u0116\u008c\2\u0a0a\u0a14"+
		"\3\2\2\2\u0a0b\u0a0d\5\u00fc\177\2\u0a0c\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2"+
		"\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a10\5\u00c0a\2\u0a0f\u0a11\5\u012c\u0097"+
		"\2\u0a10\u0a0f\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a14\3\2\2\2\u0a12\u0a14"+
		"\7}\2\2\u0a13\u0a06\3\2\2\2\u0a13\u0a0c\3\2\2\2\u0a13\u0a12\3\2\2\2\u0a14"+
		"\u01ad\3\2\2\2\u0a15\u0a17\7A\2\2\u0a16\u0a18\5\\/\2\u0a17\u0a16\3\2\2"+
		"\2\u0a17\u0a18\3\2\2\2\u0a18\u01af\3\2\2\2\u0a19\u0a1c\5\u01b2\u00da\2"+
		"\u0a1a\u0a1c\5\u01b6\u00dc\2\u0a1b\u0a19\3\2\2\2\u0a1b\u0a1a\3\2\2\2\u0a1c"+
		"\u01b1\3\2\2\2\u0a1d\u0a1e\7A\2\2\u0a1e\u0a20\7O\2\2\u0a1f\u0a21\5\u01b4"+
		"\u00db\2\u0a20\u0a1f\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22"+
		"\u0a23\7P\2\2\u0a23\u01b3\3\2\2\2\u0a24\u0a25\b\u00db\1\2\u0a25\u0a27"+
		"\5\u012a\u0096\2\u0a26\u0a28\7}\2\2\u0a27\u0a26\3\2\2\2\u0a27\u0a28\3"+
		"\2\2\2\u0a28\u0a31\3\2\2\2\u0a29\u0a2a\f\3\2\2\u0a2a\u0a2b\7t\2\2\u0a2b"+
		"\u0a2d\5\u012a\u0096\2\u0a2c\u0a2e\7}\2\2\u0a2d\u0a2c\3\2\2\2\u0a2d\u0a2e"+
		"\3\2\2\2\u0a2e\u0a30\3\2\2\2\u0a2f\u0a29\3\2\2\2\u0a30\u0a33\3\2\2\2\u0a31"+
		"\u0a2f\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u01b5\3\2\2\2\u0a33\u0a31\3\2"+
		"\2\2\u0a34\u0a35\7,\2\2\u0a35\u0a36\7O\2\2\u0a36\u0a37\5b\62\2\u0a37\u0a38"+
		"\7P\2\2\u0a38\u0a3b\3\2\2\2\u0a39\u0a3b\7,\2\2\u0a3a\u0a34\3\2\2\2\u0a3a"+
		"\u0a39\3\2\2\2\u0a3b\u01b7\3\2\2\2\u0a3c\u0a3d\7a\2\2\u0a3d\u0a3e\7a\2"+
		"\2\u0a3e\u01b9\3\2\2\2\u0a3f\u0a40\7a\2\2\u0a40\u0a41\7a\2\2\u0a41\u0a42"+
		"\7_\2\2\u0a42\u01bb\3\2\2\2\u0a43\u0a74\7+\2\2\u0a44\u0a74\7\26\2\2\u0a45"+
		"\u0a46\7+\2\2\u0a46\u0a47\7Q\2\2\u0a47\u0a74\7R\2\2\u0a48\u0a49\7\26\2"+
		"\2\u0a49\u0a4a\7Q\2\2\u0a4a\u0a74\7R\2\2\u0a4b\u0a74\7U\2\2\u0a4c\u0a74"+
		"\7V\2\2\u0a4d\u0a74\7W\2\2\u0a4e\u0a74\7X\2\2\u0a4f\u0a74\7Y\2\2\u0a50"+
		"\u0a74\7Z\2\2\u0a51\u0a74\7[\2\2\u0a52\u0a74\7\\\2\2\u0a53\u0a74\7]\2"+
		"\2\u0a54\u0a74\7^\2\2\u0a55\u0a74\7_\2\2\u0a56\u0a74\7`\2\2\u0a57\u0a74"+
		"\7a\2\2\u0a58\u0a74\7b\2\2\u0a59\u0a74\7c\2\2\u0a5a\u0a74\7d\2\2\u0a5b"+
		"\u0a74\7e\2\2\u0a5c\u0a74\7f\2\2\u0a5d\u0a74\7g\2\2\u0a5e\u0a74\7h\2\2"+
		"\u0a5f\u0a74\7i\2\2\u0a60\u0a74\7j\2\2\u0a61\u0a74\5\u01b8\u00dd\2\u0a62"+
		"\u0a74\5\u01ba\u00de\2\u0a63\u0a74\7k\2\2\u0a64\u0a74\7l\2\2\u0a65\u0a74"+
		"\7m\2\2\u0a66\u0a74\7n\2\2\u0a67\u0a74\7o\2\2\u0a68\u0a74\7p\2\2\u0a69"+
		"\u0a74\7q\2\2\u0a6a\u0a74\7r\2\2\u0a6b\u0a74\7s\2\2\u0a6c\u0a74\7t\2\2"+
		"\u0a6d\u0a74\7u\2\2\u0a6e\u0a74\7v\2\2\u0a6f\u0a70\7O\2\2\u0a70\u0a74"+
		"\7P\2\2\u0a71\u0a72\7Q\2\2\u0a72\u0a74\7R\2\2\u0a73\u0a43\3\2\2\2\u0a73"+
		"\u0a44\3\2\2\2\u0a73\u0a45\3\2\2\2\u0a73\u0a48\3\2\2\2\u0a73\u0a4b\3\2"+
		"\2\2\u0a73\u0a4c\3\2\2\2\u0a73\u0a4d\3\2\2\2\u0a73\u0a4e\3\2\2\2\u0a73"+
		"\u0a4f\3\2\2\2\u0a73\u0a50\3\2\2\2\u0a73\u0a51\3\2\2\2\u0a73\u0a52\3\2"+
		"\2\2\u0a73\u0a53\3\2\2\2\u0a73\u0a54\3\2\2\2\u0a73\u0a55\3\2\2\2\u0a73"+
		"\u0a56\3\2\2\2\u0a73\u0a57\3\2\2\2\u0a73\u0a58\3\2\2\2\u0a73\u0a59\3\2"+
		"\2\2\u0a73\u0a5a\3\2\2\2\u0a73\u0a5b\3\2\2\2\u0a73\u0a5c\3\2\2\2\u0a73"+
		"\u0a5d\3\2\2\2\u0a73\u0a5e\3\2\2\2\u0a73\u0a5f\3\2\2\2\u0a73\u0a60\3\2"+
		"\2\2\u0a73\u0a61\3\2\2\2\u0a73\u0a62\3\2\2\2\u0a73\u0a63\3\2\2\2\u0a73"+
		"\u0a64\3\2\2\2\u0a73\u0a65\3\2\2\2\u0a73\u0a66\3\2\2\2\u0a73\u0a67\3\2"+
		"\2\2\u0a73\u0a68\3\2\2\2\u0a73\u0a69\3\2\2\2\u0a73\u0a6a\3\2\2\2\u0a73"+
		"\u0a6b\3\2\2\2\u0a73\u0a6c\3\2\2\2\u0a73\u0a6d\3\2\2\2\u0a73\u0a6e\3\2"+
		"\2\2\u0a73\u0a6f\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u01bd\3\2\2\2\u0a75"+
		"\u0a7d\5\u01c0\u00e1\2\u0a76\u0a7d\5\u01c2\u00e2\2\u0a77\u0a7d\5\u01c4"+
		"\u00e3\2\u0a78\u0a7d\5\u01c6\u00e4\2\u0a79\u0a7d\5\u01c8\u00e5\2\u0a7a"+
		"\u0a7d\5\u01ca\u00e6\2\u0a7b\u0a7d\5\u01cc\u00e7\2\u0a7c\u0a75\3\2\2\2"+
		"\u0a7c\u0a76\3\2\2\2\u0a7c\u0a77\3\2\2\2\u0a7c\u0a78\3\2\2\2\u0a7c\u0a79"+
		"\3\2\2\2\u0a7c\u0a7a\3\2\2\2\u0a7c\u0a7b\3\2\2\2\u0a7d\u01bf\3\2\2\2\u0a7e"+
		"\u0a7f\7\177\2\2\u0a7f\u01c1\3\2\2\2\u0a80\u0a81\7\u0085\2\2\u0a81\u01c3"+
		"\3\2\2\2\u0a82\u0a83\7\u0086\2\2\u0a83\u01c5\3\2\2\2\u0a84\u0a85\7\u0087"+
		"\2\2\u0a85\u01c7\3\2\2\2\u0a86\u0a87\7\u0088\2\2\u0a87\u01c9\3\2\2\2\u0a88"+
		"\u0a89\7-\2\2\u0a89\u01cb\3\2\2\2\u0a8a\u0a8b\t\13\2\2\u0a8b\u01cd\3\2"+
		"\2\2\u015d\u01cf\u01d9\u01dd\u01e1\u01ec\u01f0\u01ff\u0206\u020b\u020d"+
		"\u0212\u0218\u0222\u0229\u022f\u0233\u0238\u023e\u0245\u024b\u024e\u0251"+
		"\u0254\u025d\u0264\u0298\u02a7\u02ad\u02b3\u02c0\u02c2\u02c8\u02d7\u02dd"+
		"\u02e3\u0303\u030a\u030e\u0312\u0315\u0319\u031f\u0321\u0329\u032d\u0330"+
		"\u0337\u033e\u0342\u0347\u034b\u034e\u0353\u0359\u0366\u0371\u0373\u0382"+
		"\u0384\u0390\u0392\u039f\u03a1\u03b3\u03b5\u03c1\u03c3\u03ce\u03d9\u03e4"+
		"\u03ef\u03fa\u0404\u040c\u0419\u0423\u042b\u042f\u0433\u0437\u043b\u043f"+
		"\u0443\u0447\u044b\u044f\u0453\u0458\u045b\u045e\u0464\u046c\u0471\u0474"+
		"\u047a\u0482\u0493\u049d\u04a5\u04ab\u04bf\u04c3\u04d3\u04d6\u04dd\u04eb"+
		"\u04f2\u04f6\u04ff\u0503\u050d\u0510\u0514\u0517\u051b\u051e\u0520\u052d"+
		"\u0536\u053a\u053f\u0549\u054c\u0550\u0558\u055b\u0560\u0566\u056b\u0570"+
		"\u0576\u0579\u057e\u0583\u0594\u0598\u059d\u05a4\u05a8\u05ad\u05b8\u05be"+
		"\u05c2\u05c7\u05cb\u05d0\u05d3\u05e5\u05ec\u05f2\u05fd\u0601\u0604\u060e"+
		"\u0614\u0617\u061e\u0628\u062c\u062f\u0632\u0636\u063b\u063d\u0641\u0645"+
		"\u064e\u065b\u0663\u0669\u066f\u0673\u0676\u067f\u0688\u0690\u069b\u06a1"+
		"\u06ac\u06af\u06b4\u06c3\u06c9\u06d2\u06dc\u06e2\u06ea\u06ee\u06f2\u06f7"+
		"\u06fc\u0703\u0705\u070a\u070e\u071c\u0722\u0731\u0738\u073d\u0744\u0749"+
		"\u0751\u0757\u075e\u0762\u0764\u0766\u076d\u0770\u0773\u0776\u077b\u077f"+
		"\u0782\u0786\u078a\u078f\u0792\u0794\u0798\u079f\u07a5\u07a9\u07af\u07b4"+
		"\u07b6\u07bc\u07c0\u07c6\u07cd\u07d1\u07d3\u07d5\u07dc\u07e6\u07ea\u07ec"+
		"\u07ee\u07f2\u07f5\u07fb\u0805\u0809\u080f\u0817\u081b\u081e\u0822\u0827"+
		"\u082a\u082d\u0831\u0836\u0840\u084a\u0851\u0856\u085a\u0861\u0867\u086d"+
		"\u0871\u0878\u087e\u0881\u0885\u0888\u088c\u088f\u0891\u0894\u089e\u08a3"+
		"\u08a5\u08ae\u08b4\u08b7\u08bd\u08c1\u08cb\u08d0\u08d3\u08d8\u08dc\u08df"+
		"\u08e2\u08e6\u08ef\u08fe\u0904\u0908\u090c\u0910\u0914\u0918\u091c\u0920"+
		"\u0923\u0927\u0932\u0936\u093d\u0941\u0946\u094b\u0952\u0956\u0960\u0970"+
		"\u0975\u0979\u097c\u0980\u0986\u0989\u098d\u0997\u099a\u09a2\u09a7\u09ac"+
		"\u09b4\u09bb\u09bf\u09c6\u09cc\u09d0\u09d6\u09df\u09e3\u09e6\u09f6\u09fd"+
		"\u0a06\u0a0c\u0a10\u0a13\u0a17\u0a1b\u0a20\u0a27\u0a2d\u0a31\u0a3a\u0a73"+
		"\u0a7c";
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
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
		RULE_postfixexpression = 16, RULE_expressionlist = 17, RULE_pseudodestructorname = 18, 
		RULE_unaryexpression = 19, RULE_unaryoperator = 20, RULE_newexpression = 21, 
		RULE_newplacement = 22, RULE_newtypeid = 23, RULE_newdeclarator = 24, 
		RULE_noptrnewdeclarator = 25, RULE_newinitializer = 26, RULE_deleteexpression = 27, 
		RULE_noexceptexpression = 28, RULE_castexpression = 29, RULE_pmexpression = 30, 
		RULE_multiplicativeexpression = 31, RULE_additiveexpression = 32, RULE_shiftexpression = 33, 
		RULE_relationalexpression = 34, RULE_equalityexpression = 35, RULE_andexpression = 36, 
		RULE_exclusiveorexpression = 37, RULE_inclusiveorexpression = 38, RULE_logicalandexpression = 39, 
		RULE_logicalorexpression = 40, RULE_conditionalexpression = 41, RULE_assignmentexpression = 42, 
		RULE_assignmentoperator = 43, RULE_expression = 44, RULE_constantexpression = 45, 
		RULE_statement = 46, RULE_labeledstatement = 47, RULE_expressionstatement = 48, 
		RULE_compoundstatement = 49, RULE_statementseq = 50, RULE_selectionstatement = 51, 
		RULE_condition = 52, RULE_iterationstatement = 53, RULE_forinitstatement = 54, 
		RULE_forrangedeclaration = 55, RULE_forrangeinitializer = 56, RULE_jumpstatement = 57, 
		RULE_declarationstatement = 58, RULE_declarationseq = 59, RULE_declaration = 60, 
		RULE_blockdeclarationwithoutsimpledeclaration = 61, RULE_blockdeclaration = 62, 
		RULE_aliasdeclaration = 63, RULE_variabledeclarationstatement = 64, RULE_variabledeclaration = 65, 
		RULE_variableDeclaratorList = 66, RULE_variableDeclarator = 67, RULE_simpledeclaration = 68, 
		RULE_static_assertdeclaration = 69, RULE_emptydeclaration = 70, RULE_attributedeclaration = 71, 
		RULE_declspecifier = 72, RULE_declspecifierseq = 73, RULE_declspecifierwithouttype = 74, 
		RULE_declspecifierseqwithouttype = 75, RULE_storageclassspecifier = 76, 
		RULE_functionspecifier = 77, RULE_typedefname = 78, RULE_typespecifier = 79, 
		RULE_trailingtypespecifier = 80, RULE_typespecifierseq = 81, RULE_trailingtypespecifierseq = 82, 
		RULE_simpletypespecifier = 83, RULE_typename = 84, RULE_decltypespecifier = 85, 
		RULE_elaboratedtypespecifier = 86, RULE_enumname = 87, RULE_enumspecifier = 88, 
		RULE_enumhead = 89, RULE_opaqueenumdeclaration = 90, RULE_enumkey = 91, 
		RULE_enumbase = 92, RULE_enumeratorlist = 93, RULE_enumeratordefinition = 94, 
		RULE_enumerator = 95, RULE_namespacename = 96, RULE_originalnamespacename = 97, 
		RULE_namespacedefinition = 98, RULE_namednamespacedefinition = 99, RULE_originalnamespacedefinition = 100, 
		RULE_extensionnamespacedefinition = 101, RULE_unnamednamespacedefinition = 102, 
		RULE_namespacebody = 103, RULE_namespacealias = 104, RULE_namespacealiasdefinition = 105, 
		RULE_qualifiednamespacespecifier = 106, RULE_usingdeclaration = 107, RULE_usingdirective = 108, 
		RULE_asmdefinition = 109, RULE_linkagespecification = 110, RULE_attributespecifierseq = 111, 
		RULE_attributespecifier = 112, RULE_alignmentspecifier = 113, RULE_attributelist = 114, 
		RULE_attribute = 115, RULE_attributetoken = 116, RULE_attributescopedtoken = 117, 
		RULE_attributenamespace = 118, RULE_attributeargumentclause = 119, RULE_balancedtokenseq = 120, 
		RULE_balancedtoken = 121, RULE_initdeclaratorlist = 122, RULE_initdeclarator = 123, 
		RULE_declarator = 124, RULE_ptrdeclarator = 125, RULE_noptrdeclarator = 126, 
		RULE_parametersandqualifiers = 127, RULE_trailingreturntype = 128, RULE_ptroperator = 129, 
		RULE_cvqualifierseq = 130, RULE_cvqualifier = 131, RULE_refqualifier = 132, 
		RULE_declaratorid = 133, RULE_typeid = 134, RULE_abstractdeclarator = 135, 
		RULE_ptrabstractdeclarator = 136, RULE_noptrabstractdeclarator = 137, 
		RULE_abstractpackdeclarator = 138, RULE_noptrabstractpackdeclarator = 139, 
		RULE_parameterdeclarationclause = 140, RULE_parameterdeclarationlist = 141, 
		RULE_parameterdeclaration = 142, RULE_functiondefinition = 143, RULE_functionheader = 144, 
		RULE_functiondeclarator = 145, RULE_functionbody = 146, RULE_initializer = 147, 
		RULE_braceorequalinitializer = 148, RULE_initializerclause = 149, RULE_initializerlist = 150, 
		RULE_bracedinitlist = 151, RULE_classname = 152, RULE_classspecifier = 153, 
		RULE_classbody = 154, RULE_classhead = 155, RULE_classheadname = 156, 
		RULE_classvirtspecifier = 157, RULE_classkey = 158, RULE_memberspecification = 159, 
		RULE_memberdeclaration = 160, RULE_memberdeclaratorlist = 161, RULE_memberdeclarator = 162, 
		RULE_virtspecifierseq = 163, RULE_virtspecifier = 164, RULE_purespecifier = 165, 
		RULE_baseclause = 166, RULE_basespecifierlist = 167, RULE_basespecifier = 168, 
		RULE_classordecltype = 169, RULE_basetypespecifier = 170, RULE_accessspecifier = 171, 
		RULE_conversionfunctionid = 172, RULE_conversiontypeid = 173, RULE_conversiondeclarator = 174, 
		RULE_ctorinitializer = 175, RULE_meminitializerlist = 176, RULE_meminitializer = 177, 
		RULE_meminitializerid = 178, RULE_operatorfunctionid = 179, RULE_literaloperatorid = 180, 
		RULE_templatedeclaration = 181, RULE_templateparameterlist = 182, RULE_templateparameter = 183, 
		RULE_typeparameter = 184, RULE_simpletemplateid = 185, RULE_templateid = 186, 
		RULE_templatename = 187, RULE_templateargumentlist = 188, RULE_templateargument = 189, 
		RULE_typenamespecifier = 190, RULE_explicitinstantiation = 191, RULE_explicitspecialization = 192, 
		RULE_tryblock = 193, RULE_functiontryblock = 194, RULE_handlerseq = 195, 
		RULE_handler = 196, RULE_exceptiondeclaration = 197, RULE_throwexpression = 198, 
		RULE_exceptionspecification = 199, RULE_dynamicexceptionspecification = 200, 
		RULE_typeidlist = 201, RULE_noexceptspecification = 202, RULE_rightShift = 203, 
		RULE_rightShiftAssign = 204, RULE_operator = 205, RULE_literal = 206, 
		RULE_integerliteral = 207, RULE_floatingliteral = 208, RULE_stringliteral = 209, 
		RULE_booleanliteral = 210, RULE_pointerliteral = 211, RULE_userdefinedliteral = 212;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "identexpression", 
		"unqualifiedid", "qualifiedid", "nestednamespecifier", "lambdaexpression", 
		"lambdaintroducer", "lambdacapture", "capturedefault", "capturelist", 
		"capture", "simplecapture", "initcapture", "lambdadeclarator", "postfixexpression", 
		"expressionlist", "pseudodestructorname", "unaryexpression", "unaryoperator", 
		"newexpression", "newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", 
		"newinitializer", "deleteexpression", "noexceptexpression", "castexpression", 
		"pmexpression", "multiplicativeexpression", "additiveexpression", "shiftexpression", 
		"relationalexpression", "equalityexpression", "andexpression", "exclusiveorexpression", 
		"inclusiveorexpression", "logicalandexpression", "logicalorexpression", 
		"conditionalexpression", "assignmentexpression", "assignmentoperator", 
		"expression", "constantexpression", "statement", "labeledstatement", "expressionstatement", 
		"compoundstatement", "statementseq", "selectionstatement", "condition", 
		"iterationstatement", "forinitstatement", "forrangedeclaration", "forrangeinitializer", 
		"jumpstatement", "declarationstatement", "declarationseq", "declaration", 
		"blockdeclarationwithoutsimpledeclaration", "blockdeclaration", "aliasdeclaration", 
		"variabledeclarationstatement", "variabledeclaration", "variableDeclaratorList", 
		"variableDeclarator", "simpledeclaration", "static_assertdeclaration", 
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
		"bracedinitlist", "classname", "classspecifier", "classbody", "classhead", 
		"classheadname", "classvirtspecifier", "classkey", "memberspecification", 
		"memberdeclaration", "memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", 
		"virtspecifier", "purespecifier", "baseclause", "basespecifierlist", "basespecifier", 
		"classordecltype", "basetypespecifier", "accessspecifier", "conversionfunctionid", 
		"conversiontypeid", "conversiondeclarator", "ctorinitializer", "meminitializerlist", 
		"meminitializer", "meminitializerid", "operatorfunctionid", "literaloperatorid", 
		"templatedeclaration", "templateparameterlist", "templateparameter", "typeparameter", 
		"simpletemplateid", "templateid", "templatename", "templateargumentlist", 
		"templateargument", "typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "integerliteral", "floatingliteral", "stringliteral", 
		"booleanliteral", "pointerliteral", "userdefinedliteral"
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
			setState(427);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(426);
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
			setState(437);
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
				setState(429);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(LeftParen);
				setState(432);
				expression(0);
				setState(433);
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
				setState(435);
				identexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
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
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
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
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(Tilde);
				setState(452);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(Tilde);
				setState(454);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
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
			setState(458);
			nestednamespecifier(0);
			setState(460);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(459);
				match(Template);
				}
			}

			setState(462);
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(465);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(466);
				typename();
				setState(467);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(469);
				namespacename();
				setState(470);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(472);
				decltypespecifier();
				setState(473);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(477);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(478);
						match(Identifier);
						setState(479);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(480);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(482);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(481);
							match(Template);
							}
						}

						setState(484);
						simpletemplateid();
						setState(485);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(491);
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
			setState(492);
			lambdaintroducer();
			setState(494);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(493);
				lambdadeclarator();
				}
			}

			setState(496);
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
			setState(498);
			match(LeftBracket);
			setState(500);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(499);
				lambdacapture();
				}
			}

			setState(502);
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
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				capturedefault();
				setState(507);
				match(Comma);
				setState(508);
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
			setState(512);
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
			setState(515);
			capture();
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(516);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(527);
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
					setState(519);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(520);
					match(Comma);
					setState(521);
					capture();
					setState(523);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(522);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(529);
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
			setState(538);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(And);
				setState(536);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
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
			setState(545);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(Identifier);
				setState(541);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(And);
				setState(543);
				match(Identifier);
				setState(544);
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
			setState(547);
			match(LeftParen);
			setState(548);
			parameterdeclarationclause();
			setState(549);
			match(RightParen);
			setState(551);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(550);
				match(Mutable);
				}
			}

			setState(554);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(553);
				exceptionspecification();
				}
			}

			setState(557);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(556);
				attributespecifierseq(0);
				}
			}

			setState(560);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(559);
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
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(563);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(564);
				simpletypespecifier();
				setState(565);
				match(LeftParen);
				setState(567);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(566);
					expressionlist();
					}
				}

				setState(569);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(571);
				typenamespecifier();
				setState(572);
				match(LeftParen);
				setState(574);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(573);
					expressionlist();
					}
				}

				setState(576);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(578);
				simpletypespecifier();
				setState(579);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(581);
				typenamespecifier();
				setState(582);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(584);
				match(Dynamic_cast);
				setState(585);
				match(Less);
				setState(586);
				typeid();
				setState(587);
				match(Greater);
				setState(588);
				match(LeftParen);
				setState(589);
				expression(0);
				setState(590);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(592);
				match(Static_cast);
				setState(593);
				match(Less);
				setState(594);
				typeid();
				setState(595);
				match(Greater);
				setState(596);
				match(LeftParen);
				setState(597);
				expression(0);
				setState(598);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(600);
				match(Reinterpret_cast);
				setState(601);
				match(Less);
				setState(602);
				typeid();
				setState(603);
				match(Greater);
				setState(604);
				match(LeftParen);
				setState(605);
				expression(0);
				setState(606);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(608);
				match(Const_cast);
				setState(609);
				match(Less);
				setState(610);
				typeid();
				setState(611);
				match(Greater);
				setState(612);
				match(LeftParen);
				setState(613);
				expression(0);
				setState(614);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(616);
				match(Typeid);
				setState(617);
				match(LeftParen);
				setState(618);
				expression(0);
				setState(619);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(621);
				match(Typeid);
				setState(622);
				match(LeftParen);
				setState(623);
				typeid();
				setState(624);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(666);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(628);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(629);
						match(LeftBracket);
						setState(630);
						expression(0);
						setState(631);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(633);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(634);
						match(LeftBracket);
						setState(635);
						bracedinitlist();
						setState(636);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(638);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(639);
						match(LeftParen);
						setState(641);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(640);
							expressionlist();
							}
						}

						setState(643);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(644);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(645);
						match(Dot);
						setState(647);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(646);
							match(Template);
							}
						}

						setState(649);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(650);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(651);
						match(Arrow);
						setState(653);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(652);
							match(Template);
							}
						}

						setState(655);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(656);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(657);
						match(Dot);
						setState(658);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(659);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(660);
						match(Arrow);
						setState(661);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(662);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(663);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(664);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(665);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(670);
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
		enterRule(_localctx, 34, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_pseudodestructorname);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(673);
					nestednamespecifier(0);
					}
					break;
				}
				setState(676);
				typename();
				setState(677);
				match(Doublecolon);
				setState(678);
				match(Tilde);
				setState(679);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				nestednamespecifier(0);
				setState(682);
				match(Template);
				setState(683);
				simpletemplateid();
				setState(684);
				match(Doublecolon);
				setState(685);
				match(Tilde);
				setState(686);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(688);
					nestednamespecifier(0);
					}
				}

				setState(691);
				match(Tilde);
				setState(692);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(Tilde);
				setState(694);
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_unaryexpression);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				match(PlusPlus);
				setState(699);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(MinusMinus);
				setState(701);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				unaryoperator();
				setState(703);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(705);
				match(Sizeof);
				setState(706);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(707);
				match(Sizeof);
				setState(708);
				match(LeftParen);
				setState(709);
				typeid();
				setState(710);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(712);
				match(Sizeof);
				setState(713);
				match(Ellipsis);
				setState(714);
				match(LeftParen);
				setState(715);
				match(Identifier);
				setState(716);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(717);
				match(Alignof);
				setState(718);
				match(LeftParen);
				setState(719);
				typeid();
				setState(720);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(722);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(723);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(724);
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
		enterRule(_localctx, 40, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		enterRule(_localctx, 42, RULE_newexpression);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(729);
					match(Doublecolon);
					}
				}

				setState(732);
				match(New);
				setState(734);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(733);
					newplacement();
					}
				}

				setState(736);
				newtypeid();
				setState(738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(737);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(740);
					match(Doublecolon);
					}
				}

				setState(743);
				match(New);
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(744);
					newplacement();
					}
					break;
				}
				setState(747);
				match(LeftParen);
				setState(748);
				typeid();
				setState(749);
				match(RightParen);
				setState(751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(750);
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
		enterRule(_localctx, 44, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LeftParen);
			setState(756);
			expressionlist();
			setState(757);
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
		enterRule(_localctx, 46, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			typespecifierseq();
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(760);
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
		enterRule(_localctx, 48, RULE_newdeclarator);
		try {
			setState(768);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				ptroperator();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(764);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(771);
			match(LeftBracket);
			setState(772);
			expression(0);
			setState(773);
			match(RightBracket);
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(774);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(777);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(778);
					match(LeftBracket);
					setState(779);
					constantexpression();
					setState(780);
					match(RightBracket);
					setState(782);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(781);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 52, RULE_newinitializer);
		int _la;
		try {
			setState(795);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(LeftParen);
				setState(791);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(790);
					expressionlist();
					}
				}

				setState(793);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
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
		enterRule(_localctx, 54, RULE_deleteexpression);
		int _la;
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(797);
					match(Doublecolon);
					}
				}

				setState(800);
				match(Delete);
				setState(801);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(802);
					match(Doublecolon);
					}
				}

				setState(805);
				match(Delete);
				setState(806);
				match(LeftBracket);
				setState(807);
				match(RightBracket);
				setState(808);
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
		enterRule(_localctx, 56, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(Noexcept);
			setState(812);
			match(LeftParen);
			setState(813);
			expression(0);
			setState(814);
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
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_castexpression);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(LeftParen);
				setState(818);
				typeid();
				setState(819);
				match(RightParen);
				setState(820);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(825);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(827);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(828);
						match(DotStar);
						setState(829);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(830);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(831);
						match(ArrowStar);
						setState(832);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(839);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(850);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(841);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(842);
						match(Star);
						setState(843);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(844);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(845);
						match(Div);
						setState(846);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(847);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(848);
						match(Mod);
						setState(849);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(856);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(864);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(858);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(859);
						match(Plus);
						setState(860);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(861);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(862);
						match(Minus);
						setState(863);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(870);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(879);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(872);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(873);
						match(LeftShift);
						setState(874);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(875);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(876);
						rightShift();
						setState(877);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(885);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(899);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(887);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(888);
						match(Less);
						setState(889);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(890);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(891);
						match(Greater);
						setState(892);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(893);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(894);
						match(LessEqual);
						setState(895);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(896);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(897);
						match(GreaterEqual);
						setState(898);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(905);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(913);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(907);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(908);
						match(Equal);
						setState(909);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(910);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(911);
						match(NotEqual);
						setState(912);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(919);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(921);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(922);
					match(And);
					setState(923);
					equalityexpression(0);
					}
					} 
				}
				setState(928);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(930);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(932);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(933);
					match(Caret);
					setState(934);
					andexpression(0);
					}
					} 
				}
				setState(939);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(941);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(943);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(944);
					match(Or);
					setState(945);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(950);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(952);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(954);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(955);
					match(AndAnd);
					setState(956);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(961);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(963);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(965);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(966);
					match(OrOr);
					setState(967);
					logicalandexpression(0);
					}
					} 
				}
				setState(972);
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
		enterRule(_localctx, 82, RULE_conditionalexpression);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				logicalorexpression(0);
				setState(975);
				match(Question);
				setState(976);
				expression(0);
				setState(977);
				match(Colon);
				setState(978);
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
		enterRule(_localctx, 84, RULE_assignmentexpression);
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				logicalorexpression(0);
				setState(984);
				assignmentoperator();
				setState(985);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
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
		enterRule(_localctx, 86, RULE_assignmentoperator);
		try {
			setState(1001);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(994);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(995);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(996);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(997);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(998);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(999);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(1000);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1004);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1006);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1007);
					match(Comma);
					setState(1008);
					assignmentexpression();
					}
					} 
				}
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 90, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
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
		enterRule(_localctx, 92, RULE_statement);
		int _la;
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(1017);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1020);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1021);
					attributespecifierseq(0);
					}
				}

				setState(1024);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1026);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1025);
					attributespecifierseq(0);
					}
				}

				setState(1028);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1030);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1029);
					attributespecifierseq(0);
					}
				}

				setState(1032);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1034);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1033);
					attributespecifierseq(0);
					}
				}

				setState(1036);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1037);
				variabledeclarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1038);
				declarationstatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1040);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1039);
					attributespecifierseq(0);
					}
				}

				setState(1042);
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
		enterRule(_localctx, 94, RULE_labeledstatement);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1045);
					attributespecifierseq(0);
					}
				}

				setState(1048);
				match(Identifier);
				setState(1049);
				match(Colon);
				setState(1050);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1051);
					attributespecifierseq(0);
					}
				}

				setState(1054);
				match(Case);
				setState(1055);
				constantexpression();
				setState(1056);
				match(Colon);
				setState(1057);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1059);
					attributespecifierseq(0);
					}
				}

				setState(1062);
				match(Default);
				setState(1063);
				match(Colon);
				setState(1064);
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
		enterRule(_localctx, 96, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1067);
				expression(0);
				}
			}

			setState(1070);
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
		enterRule(_localctx, 98, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(LeftBrace);
			setState(1074);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1073);
				statementseq();
				}
			}

			setState(1076);
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
		enterRule(_localctx, 100, RULE_statementseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			statement();
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				{
				setState(1079);
				statement();
				}
				}
				setState(1084);
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
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
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
		enterRule(_localctx, 102, RULE_selectionstatement);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(If);
				setState(1086);
				match(LeftParen);
				setState(1087);
				condition();
				setState(1088);
				match(RightParen);
				setState(1089);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				match(If);
				setState(1092);
				match(LeftParen);
				setState(1093);
				condition();
				setState(1094);
				match(RightParen);
				setState(1095);
				statement();
				setState(1096);
				match(Else);
				setState(1097);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				match(Switch);
				setState(1100);
				match(LeftParen);
				setState(1101);
				condition();
				setState(1102);
				match(RightParen);
				setState(1103);
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
		enterRule(_localctx, 104, RULE_condition);
		int _la;
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1108);
					attributespecifierseq(0);
					}
				}

				setState(1111);
				declspecifierseq();
				setState(1112);
				declarator();
				setState(1113);
				match(Assign);
				setState(1114);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1116);
					attributespecifierseq(0);
					}
				}

				setState(1119);
				declspecifierseq();
				setState(1120);
				declarator();
				setState(1121);
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

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
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
		enterRule(_localctx, 106, RULE_iterationstatement);
		int _la;
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(While);
				setState(1126);
				match(LeftParen);
				setState(1127);
				condition();
				setState(1128);
				match(RightParen);
				setState(1129);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(Do);
				setState(1132);
				statement();
				setState(1133);
				match(While);
				setState(1134);
				match(LeftParen);
				setState(1135);
				expression(0);
				setState(1136);
				match(RightParen);
				setState(1137);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				match(For);
				setState(1140);
				match(LeftParen);
				setState(1141);
				forinitstatement();
				setState(1143);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1142);
					condition();
					}
				}

				setState(1145);
				match(Semi);
				setState(1147);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1146);
					expression(0);
					}
				}

				setState(1149);
				match(RightParen);
				setState(1150);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1152);
				match(For);
				setState(1153);
				match(LeftParen);
				setState(1154);
				forrangedeclaration();
				setState(1155);
				match(Colon);
				setState(1156);
				forrangeinitializer();
				setState(1157);
				match(RightParen);
				setState(1158);
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

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
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
		enterRule(_localctx, 108, RULE_forinitstatement);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
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
		enterRule(_localctx, 110, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1166);
				attributespecifierseq(0);
				}
			}

			setState(1169);
			declspecifierseq();
			setState(1170);
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
		enterRule(_localctx, 112, RULE_forrangeinitializer);
		try {
			setState(1174);
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
				setState(1172);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
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
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
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
		enterRule(_localctx, 114, RULE_jumpstatement);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				match(Break);
				setState(1177);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(Continue);
				setState(1179);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1180);
				match(Return);
				setState(1182);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1181);
					expression(0);
					}
				}

				setState(1184);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1185);
				match(Return);
				setState(1186);
				bracedinitlist();
				setState(1187);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1189);
				match(Goto);
				setState(1190);
				match(Identifier);
				setState(1191);
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
		enterRule(_localctx, 116, RULE_declarationstatement);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1199);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1201);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1202);
					declaration();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
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
		enterRule(_localctx, 120, RULE_declaration);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1212);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1213);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1214);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1215);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1216);
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
		enterRule(_localctx, 122, RULE_blockdeclarationwithoutsimpledeclaration);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				asmdefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				namespacealiasdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1221);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1222);
				usingdirective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1223);
				static_assertdeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1224);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1225);
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
		enterRule(_localctx, 124, RULE_blockdeclaration);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
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
		enterRule(_localctx, 126, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(Using);
			setState(1233);
			match(Identifier);
			setState(1235);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1234);
				attributespecifierseq(0);
				}
			}

			setState(1237);
			match(Assign);
			setState(1238);
			typeid();
			setState(1239);
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
		enterRule(_localctx, 128, RULE_variabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			variabledeclaration();
			setState(1242);
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
		public List<PtroperatorContext> ptroperator() {
			return getRuleContexts(PtroperatorContext.class);
		}
		public PtroperatorContext ptroperator(int i) {
			return getRuleContext(PtroperatorContext.class,i);
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
		enterRule(_localctx, 130, RULE_variabledeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1244);
				attributespecifierseq(0);
				}
			}

			setState(1248);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(1247);
				declspecifierseqwithouttype();
				}
			}

			setState(1250);
			typespecifier();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1251);
					ptroperator();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(1258);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Operator || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Tilde - 91)) | (1L << (Doublecolon - 91)) | (1L << (Ellipsis - 91)) | (1L << (Identifier - 91)))) != 0)) {
				{
				setState(1257);
				variableDeclaratorList(0);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
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
		return variableDeclaratorList(0);
	}

	private VariableDeclaratorListContext variableDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, _parentState);
		VariableDeclaratorListContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_variableDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1261);
			variableDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclaratorList);
					setState(1263);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1264);
					match(Comma);
					setState(1265);
					variableDeclarator();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
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
		enterRule(_localctx, 134, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			declaratorid();
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1272);
				match(Assign);
				setState(1273);
				initializerclause();
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
		enterRule(_localctx, 136, RULE_simpledeclaration);
		int _la;
		try {
			setState(1290);
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
				setState(1277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1276);
					declspecifierseq();
					}
					break;
				}
				setState(1280);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1279);
					initdeclaratorlist(0);
					}
				}

				setState(1282);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				attributespecifierseq(0);
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1284);
					declspecifierseq();
					}
					break;
				}
				setState(1287);
				initdeclaratorlist(0);
				setState(1288);
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
		enterRule(_localctx, 138, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(Static_assert);
			setState(1293);
			match(LeftParen);
			setState(1294);
			constantexpression();
			setState(1295);
			match(Comma);
			setState(1296);
			match(Stringliteral);
			setState(1297);
			match(RightParen);
			setState(1298);
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
		enterRule(_localctx, 140, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
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
		enterRule(_localctx, 142, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			attributespecifierseq(0);
			setState(1303);
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
		enterRule(_localctx, 144, RULE_declspecifier);
		try {
			setState(1307);
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
				setState(1305);
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
				setState(1306);
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
		enterRule(_localctx, 146, RULE_declspecifierseq);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				declspecifier();
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1310);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				declspecifier();
				setState(1314);
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
		enterRule(_localctx, 148, RULE_declspecifierwithouttype);
		try {
			setState(1323);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				storageclassspecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 5);
				{
				setState(1322);
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
		enterRule(_localctx, 150, RULE_declspecifierseqwithouttype);
		int _la;
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				declspecifierwithouttype();
				setState(1327);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1326);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				declspecifierwithouttype();
				setState(1330);
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
		enterRule(_localctx, 152, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
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
		enterRule(_localctx, 154, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
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
		enterRule(_localctx, 156, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
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
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
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
		enterRule(_localctx, 158, RULE_typespecifier);
		try {
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
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
		enterRule(_localctx, 160, RULE_trailingtypespecifier);
		try {
			setState(1349);
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
				setState(1345);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1347);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1348);
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
		enterRule(_localctx, 162, RULE_typespecifierseq);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				typespecifier();
				setState(1353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1352);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				typespecifier();
				setState(1356);
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
		enterRule(_localctx, 164, RULE_trailingtypespecifierseq);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				trailingtypespecifier();
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1361);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				trailingtypespecifier();
				setState(1365);
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
		enterRule(_localctx, 166, RULE_simpletypespecifier);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1369);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1372);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				nestednamespecifier(0);
				setState(1374);
				match(Template);
				setState(1375);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1377);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1378);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1379);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1380);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1381);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1382);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1383);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1384);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1385);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1386);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1387);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1388);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1389);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1390);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1391);
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
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
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
		enterRule(_localctx, 168, RULE_typename);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1395);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1397);
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
		enterRule(_localctx, 170, RULE_decltypespecifier);
		try {
			setState(1409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				match(Decltype);
				setState(1401);
				match(LeftParen);
				setState(1402);
				expression(0);
				setState(1403);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				match(Decltype);
				setState(1406);
				match(LeftParen);
				setState(1407);
				match(Auto);
				setState(1408);
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
		enterRule(_localctx, 172, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				classkey();
				setState(1413);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1412);
					attributespecifierseq(0);
					}
				}

				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1415);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1418);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				classkey();
				setState(1421);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				classkey();
				setState(1424);
				nestednamespecifier(0);
				setState(1426);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1425);
					match(Template);
					}
				}

				setState(1428);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				match(Enum);
				setState(1432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1431);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1434);
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
		enterRule(_localctx, 174, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
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
		enterRule(_localctx, 176, RULE_enumspecifier);
		int _la;
		try {
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				enumhead();
				setState(1440);
				match(LeftBrace);
				setState(1442);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1441);
					enumeratorlist(0);
					}
				}

				setState(1444);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				enumhead();
				setState(1447);
				match(LeftBrace);
				setState(1448);
				enumeratorlist(0);
				setState(1449);
				match(Comma);
				setState(1450);
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
		enterRule(_localctx, 178, RULE_enumhead);
		int _la;
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				enumkey();
				setState(1456);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1455);
					attributespecifierseq(0);
					}
				}

				setState(1459);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1458);
					match(Identifier);
					}
				}

				setState(1462);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1461);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				enumkey();
				setState(1466);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1465);
					attributespecifierseq(0);
					}
				}

				setState(1468);
				nestednamespecifier(0);
				setState(1469);
				match(Identifier);
				setState(1471);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1470);
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
		enterRule(_localctx, 180, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			enumkey();
			setState(1477);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1476);
				attributespecifierseq(0);
				}
			}

			setState(1479);
			match(Identifier);
			setState(1481);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1480);
				enumbase();
				}
			}

			setState(1483);
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
		enterRule(_localctx, 182, RULE_enumkey);
		try {
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				match(Enum);
				setState(1487);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				match(Enum);
				setState(1489);
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
		enterRule(_localctx, 184, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(Colon);
			setState(1493);
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
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1496);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1498);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1499);
					match(Comma);
					setState(1500);
					enumeratordefinition();
					}
					} 
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		enterRule(_localctx, 188, RULE_enumeratordefinition);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				enumerator();
				setState(1508);
				match(Assign);
				setState(1509);
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
		enterRule(_localctx, 190, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
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
		enterRule(_localctx, 192, RULE_namespacename);
		try {
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1516);
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
		enterRule(_localctx, 194, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
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
		enterRule(_localctx, 196, RULE_namespacedefinition);
		try {
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
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
		enterRule(_localctx, 198, RULE_namednamespacedefinition);
		try {
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
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
		enterRule(_localctx, 200, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1529);
				match(Inline);
				}
			}

			setState(1532);
			match(Namespace);
			setState(1533);
			match(Identifier);
			setState(1534);
			match(LeftBrace);
			setState(1535);
			namespacebody();
			setState(1536);
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
		enterRule(_localctx, 202, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1538);
				match(Inline);
				}
			}

			setState(1541);
			match(Namespace);
			setState(1542);
			originalnamespacename();
			setState(1543);
			match(LeftBrace);
			setState(1544);
			namespacebody();
			setState(1545);
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
		enterRule(_localctx, 204, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1547);
				match(Inline);
				}
			}

			setState(1550);
			match(Namespace);
			setState(1551);
			match(LeftBrace);
			setState(1552);
			namespacebody();
			setState(1553);
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
		enterRule(_localctx, 206, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1555);
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
		enterRule(_localctx, 208, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
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
		enterRule(_localctx, 210, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(Namespace);
			setState(1561);
			match(Identifier);
			setState(1562);
			match(Assign);
			setState(1563);
			qualifiednamespacespecifier();
			setState(1564);
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
		enterRule(_localctx, 212, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1566);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1569);
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
		enterRule(_localctx, 214, RULE_usingdeclaration);
		int _la;
		try {
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1571);
				match(Using);
				setState(1573);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1572);
					match(Typename);
					}
				}

				setState(1575);
				nestednamespecifier(0);
				setState(1576);
				unqualifiedid();
				setState(1577);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				match(Using);
				setState(1580);
				match(Doublecolon);
				setState(1581);
				unqualifiedid();
				setState(1582);
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
		enterRule(_localctx, 216, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1586);
				attributespecifierseq(0);
				}
			}

			setState(1589);
			match(Using);
			setState(1590);
			match(Namespace);
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1591);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1594);
			namespacename();
			setState(1595);
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
		enterRule(_localctx, 218, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			match(Asm);
			setState(1598);
			match(LeftParen);
			setState(1599);
			match(Stringliteral);
			setState(1600);
			match(RightParen);
			setState(1601);
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
		enterRule(_localctx, 220, RULE_linkagespecification);
		int _la;
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				match(Extern);
				setState(1604);
				match(Stringliteral);
				setState(1605);
				match(LeftBrace);
				setState(1607);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1606);
					declarationseq(0);
					}
				}

				setState(1609);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				match(Extern);
				setState(1611);
				match(Stringliteral);
				setState(1612);
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
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1616);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1618);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1619);
					attributespecifier();
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		enterRule(_localctx, 224, RULE_attributespecifier);
		try {
			setState(1632);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				match(LeftBracket);
				setState(1626);
				match(LeftBracket);
				setState(1627);
				attributelist(0);
				setState(1628);
				match(RightBracket);
				setState(1629);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
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
		enterRule(_localctx, 226, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(Alignas);
				setState(1635);
				match(LeftParen);
				setState(1636);
				typeid();
				setState(1638);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1637);
					match(Ellipsis);
					}
				}

				setState(1640);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1642);
				match(Alignas);
				setState(1643);
				match(LeftParen);
				setState(1644);
				constantexpression();
				setState(1646);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1645);
					match(Ellipsis);
					}
				}

				setState(1648);
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
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1653);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1656);
				attribute();
				setState(1657);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1671);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1661);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1662);
						match(Comma);
						setState(1664);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1663);
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
						setState(1666);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1667);
						match(Comma);
						setState(1668);
						attribute();
						setState(1669);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		enterRule(_localctx, 230, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			attributetoken();
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1677);
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
		enterRule(_localctx, 232, RULE_attributetoken);
		try {
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
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
		enterRule(_localctx, 234, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			attributenamespace();
			setState(1685);
			match(Doublecolon);
			setState(1686);
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
		enterRule(_localctx, 236, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 238, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(LeftParen);
			setState(1691);
			balancedtokenseq(0);
			setState(1692);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1695);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1698);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1699);
					balancedtoken();
					}
					} 
				}
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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
		enterRule(_localctx, 242, RULE_balancedtoken);
		try {
			setState(1717);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705);
				match(LeftParen);
				setState(1706);
				balancedtokenseq(0);
				setState(1707);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				match(LeftBracket);
				setState(1710);
				balancedtokenseq(0);
				setState(1711);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1713);
				match(LeftBrace);
				setState(1714);
				balancedtokenseq(0);
				setState(1715);
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
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
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
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1720);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1722);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1723);
					match(Comma);
					setState(1724);
					initdeclarator();
					}
					} 
				}
				setState(1729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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
		enterRule(_localctx, 246, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			declarator();
			setState(1732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1731);
				initializer();
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
		enterRule(_localctx, 248, RULE_declarator);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				noptrdeclarator(0);
				setState(1736);
				parametersandqualifiers();
				setState(1737);
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
		enterRule(_localctx, 250, RULE_ptrdeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1741);
					ptroperator();
					}
					} 
				}
				setState(1746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			setState(1747);
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
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1750);
				declaratorid();
				setState(1752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1751);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1754);
				match(LeftParen);
				setState(1755);
				ptrdeclarator();
				setState(1756);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1771);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1760);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1761);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1762);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1763);
						match(LeftBracket);
						setState(1765);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1764);
							constantexpression();
							}
						}

						setState(1767);
						match(RightBracket);
						setState(1769);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
						case 1:
							{
							setState(1768);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1775);
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
		enterRule(_localctx, 254, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(LeftParen);
			setState(1777);
			parameterdeclarationclause();
			setState(1778);
			match(RightParen);
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1779);
				cvqualifierseq();
				}
				break;
			}
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1782);
				refqualifier();
				}
				break;
			}
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1785);
				exceptionspecification();
				}
				break;
			}
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1788);
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
		enterRule(_localctx, 256, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(Arrow);
			setState(1792);
			trailingtypespecifierseq();
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1793);
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
		enterRule(_localctx, 258, RULE_ptroperator);
		try {
			setState(1819);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1796);
				match(Star);
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1797);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1800);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				match(And);
				setState(1805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1804);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1807);
				match(AndAnd);
				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1808);
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
				setState(1811);
				nestednamespecifier(0);
				setState(1812);
				match(Star);
				setState(1814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1813);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1816);
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
		enterRule(_localctx, 260, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			cvqualifier();
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1822);
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
		enterRule(_localctx, 262, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
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
		enterRule(_localctx, 264, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
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
		enterRule(_localctx, 266, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1829);
				match(Ellipsis);
				}
			}

			setState(1832);
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
		enterRule(_localctx, 268, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			typespecifierseq();
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1835);
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
		enterRule(_localctx, 270, RULE_abstractdeclarator);
		try {
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1839);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1842);
				parametersandqualifiers();
				setState(1843);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1845);
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
		enterRule(_localctx, 272, RULE_ptrabstractdeclarator);
		try {
			setState(1853);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1848);
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
				setState(1849);
				ptroperator();
				setState(1851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1850);
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
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1856);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1857);
				match(LeftBracket);
				setState(1859);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1858);
					constantexpression();
					}
				}

				setState(1861);
				match(RightBracket);
				setState(1863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1862);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1865);
				match(LeftParen);
				setState(1866);
				ptrabstractdeclarator();
				setState(1867);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1871);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1872);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1873);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1874);
						match(LeftBracket);
						setState(1876);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1875);
							constantexpression();
							}
						}

						setState(1878);
						match(RightBracket);
						setState(1880);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
						case 1:
							{
							setState(1879);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		enterRule(_localctx, 276, RULE_abstractpackdeclarator);
		try {
			setState(1891);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
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
				setState(1888);
				ptroperator();
				setState(1889);
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
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1894);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1896);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1897);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1898);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1899);
						match(LeftBracket);
						setState(1901);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1900);
							constantexpression();
							}
						}

						setState(1903);
						match(RightBracket);
						setState(1905);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
						case 1:
							{
							setState(1904);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		enterRule(_localctx, 280, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1913);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1912);
					parameterdeclarationlist(0);
					}
				}

				setState(1916);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1915);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1918);
				parameterdeclarationlist(0);
				setState(1919);
				match(Comma);
				setState(1920);
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
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1925);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1927);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1928);
					match(Comma);
					setState(1929);
					parameterdeclaration();
					}
					} 
				}
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		enterRule(_localctx, 284, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1936);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1935);
					attributespecifierseq(0);
					}
				}

				setState(1938);
				declspecifierseq();
				setState(1939);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1941);
					attributespecifierseq(0);
					}
				}

				setState(1944);
				declspecifierseq();
				setState(1945);
				declarator();
				setState(1946);
				match(Assign);
				setState(1947);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1950);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1949);
					attributespecifierseq(0);
					}
				}

				setState(1952);
				declspecifierseq();
				setState(1954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1953);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1957);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1956);
					attributespecifierseq(0);
					}
				}

				setState(1959);
				declspecifierseq();
				setState(1961);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1960);
					abstractdeclarator();
					}
				}

				setState(1963);
				match(Assign);
				setState(1964);
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
		enterRule(_localctx, 286, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1968);
				attributespecifierseq(0);
				}
			}

			setState(1972);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(1971);
				declspecifierseqwithouttype();
				}
			}

			setState(1974);
			functionheader();
			setState(1976);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1975);
				virtspecifierseq(0);
				}
			}

			setState(1978);
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
		enterRule(_localctx, 288, RULE_functionheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1980);
				typespecifier();
				}
				break;
			}
			setState(1983);
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
		enterRule(_localctx, 290, RULE_functiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			declaratorid();
			setState(1986);
			match(LeftParen);
			setState(1987);
			parameterdeclarationclause();
			setState(1988);
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
		enterRule(_localctx, 292, RULE_functionbody);
		int _la;
		try {
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1990);
					ctorinitializer();
					}
				}

				setState(1993);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1994);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1995);
				match(Assign);
				setState(1996);
				match(Default);
				setState(1997);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1998);
				match(Assign);
				setState(1999);
				match(Delete);
				setState(2000);
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
		enterRule(_localctx, 294, RULE_initializer);
		try {
			setState(2008);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2004);
				match(LeftParen);
				setState(2005);
				expressionlist();
				setState(2006);
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
		enterRule(_localctx, 296, RULE_braceorequalinitializer);
		try {
			setState(2013);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				match(Assign);
				setState(2011);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2012);
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
		enterRule(_localctx, 298, RULE_initializerclause);
		try {
			setState(2017);
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
				setState(2015);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2016);
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
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
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
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2020);
			initializerclause();
			setState(2022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2021);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2024);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2025);
					match(Comma);
					setState(2026);
					initializerclause();
					setState(2028);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(2027);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
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

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
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
		enterRule(_localctx, 302, RULE_bracedinitlist);
		int _la;
		try {
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(LeftBrace);
				setState(2036);
				initializerlist(0);
				setState(2038);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2037);
					match(Comma);
					}
				}

				setState(2040);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(LeftBrace);
				setState(2043);
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

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_classname);
		try {
			setState(2048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047);
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
		enterRule(_localctx, 306, RULE_classspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			classhead();
			setState(2051);
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
		enterRule(_localctx, 308, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			match(LeftBrace);
			setState(2055);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(2054);
				memberspecification();
				}
			}

			setState(2057);
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
		enterRule(_localctx, 310, RULE_classhead);
		int _la;
		try {
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				classkey();
				setState(2061);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2060);
					attributespecifierseq(0);
					}
				}

				setState(2063);
				classheadname();
				setState(2065);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2064);
					classvirtspecifier();
					}
				}

				setState(2068);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2067);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2070);
				classkey();
				setState(2072);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2071);
					attributespecifierseq(0);
					}
				}

				setState(2075);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2074);
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
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
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
		enterRule(_localctx, 312, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2079);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2082);
			classname();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 314, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
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
		enterRule(_localctx, 316, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
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
		enterRule(_localctx, 318, RULE_memberspecification);
		int _la;
		try {
			setState(2097);
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
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2088);
				memberdeclaration();
				setState(2090);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2089);
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
				setState(2092);
				accessspecifier();
				setState(2093);
				match(Colon);
				setState(2095);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2094);
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
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
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
		enterRule(_localctx, 320, RULE_memberdeclaration);
		int _la;
		try {
			setState(2115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2099);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2102);
					declspecifierseq();
					}
					break;
				}
				setState(2106);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Colon - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2105);
					memberdeclaratorlist(0);
					}
				}

				setState(2108);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2111);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2112);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2113);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2114);
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
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2118);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2120);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2121);
					match(Comma);
					setState(2122);
					memberdeclarator();
					}
					} 
				}
				setState(2127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
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
		enterRule(_localctx, 324, RULE_memberdeclarator);
		int _la;
		try {
			setState(2147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2128);
				declarator();
				setState(2130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2129);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2132);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
				declarator();
				setState(2137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2136);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2140);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2139);
					match(Identifier);
					}
				}

				setState(2143);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2142);
					attributespecifierseq(0);
					}
				}

				setState(2145);
				match(Colon);
				setState(2146);
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
		int _startState = 326;
		enterRecursionRule(_localctx, 326, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2150);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2152);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2153);
					virtspecifier();
					}
					} 
				}
				setState(2158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
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
		enterRule(_localctx, 328, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
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
		enterRule(_localctx, 330, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			match(Assign);
			setState(2162);
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
		enterRule(_localctx, 332, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			match(Colon);
			setState(2166);
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
		int _startState = 334;
		enterRecursionRule(_localctx, 334, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2169);
			basespecifier();
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2170);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2173);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2174);
					match(Comma);
					setState(2175);
					basespecifier();
					setState(2177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						setState(2176);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
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
		enterRule(_localctx, 336, RULE_basespecifier);
		int _la;
		try {
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2184);
					attributespecifierseq(0);
					}
				}

				setState(2187);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2189);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2188);
					attributespecifierseq(0);
					}
				}

				setState(2191);
				match(Virtual);
				setState(2193);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2192);
					accessspecifier();
					}
				}

				setState(2195);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2197);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2196);
					attributespecifierseq(0);
					}
				}

				setState(2199);
				accessspecifier();
				setState(2201);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2200);
					match(Virtual);
					}
				}

				setState(2203);
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
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
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
		enterRule(_localctx, 338, RULE_classordecltype);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2207);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2210);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
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
		enterRule(_localctx, 340, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
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
		enterRule(_localctx, 342, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2216);
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
		enterRule(_localctx, 344, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(Operator);
			setState(2219);
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
		enterRule(_localctx, 346, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			typespecifierseq();
			setState(2223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2222);
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
		enterRule(_localctx, 348, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			ptroperator();
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2226);
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
		enterRule(_localctx, 350, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(Colon);
			setState(2230);
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
		enterRule(_localctx, 352, RULE_meminitializerlist);
		int _la;
		try {
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				meminitializer();
				setState(2234);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2233);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2236);
				meminitializer();
				setState(2238);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2237);
					match(Ellipsis);
					}
				}

				setState(2240);
				match(Comma);
				setState(2241);
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
		enterRule(_localctx, 354, RULE_meminitializer);
		int _la;
		try {
			setState(2255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				meminitializerid();
				setState(2246);
				match(LeftParen);
				setState(2248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2247);
					expressionlist();
					}
				}

				setState(2250);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2252);
				meminitializerid();
				setState(2253);
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
		enterRule(_localctx, 356, RULE_meminitializerid);
		try {
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2257);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2258);
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
		enterRule(_localctx, 358, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			match(Operator);
			setState(2262);
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
		enterRule(_localctx, 360, RULE_literaloperatorid);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264);
				match(Operator);
				setState(2265);
				match(Stringliteral);
				setState(2266);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2267);
				match(Operator);
				setState(2268);
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
		enterRule(_localctx, 362, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			match(Template);
			setState(2272);
			match(Less);
			setState(2273);
			templateparameterlist(0);
			setState(2274);
			match(Greater);
			setState(2275);
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
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2278);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2281);
					match(Comma);
					setState(2282);
					templateparameter();
					}
					} 
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,290,_ctx);
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
		enterRule(_localctx, 366, RULE_templateparameter);
		try {
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2288);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
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
		enterRule(_localctx, 368, RULE_typeparameter);
		int _la;
		try {
			setState(2340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2292);
				match(Class);
				setState(2294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2293);
					match(Ellipsis);
					}
					break;
				}
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2296);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299);
				match(Class);
				setState(2301);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2300);
					match(Identifier);
					}
				}

				setState(2303);
				match(Assign);
				setState(2304);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2305);
				match(Typename);
				setState(2307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2306);
					match(Ellipsis);
					}
					break;
				}
				setState(2310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2309);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2312);
				match(Typename);
				setState(2314);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2313);
					match(Identifier);
					}
				}

				setState(2316);
				match(Assign);
				setState(2317);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2318);
				match(Template);
				setState(2319);
				match(Less);
				setState(2320);
				templateparameterlist(0);
				setState(2321);
				match(Greater);
				setState(2322);
				match(Class);
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2323);
					match(Ellipsis);
					}
					break;
				}
				setState(2327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2326);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2329);
				match(Template);
				setState(2330);
				match(Less);
				setState(2331);
				templateparameterlist(0);
				setState(2332);
				match(Greater);
				setState(2333);
				match(Class);
				setState(2335);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2334);
					match(Identifier);
					}
				}

				setState(2337);
				match(Assign);
				setState(2338);
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
		enterRule(_localctx, 370, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			templatename();
			setState(2343);
			match(Less);
			setState(2345);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2344);
				templateargumentlist(0);
				}
			}

			setState(2347);
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
		enterRule(_localctx, 372, RULE_templateid);
		int _la;
		try {
			setState(2364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2350);
				operatorfunctionid();
				setState(2351);
				match(Less);
				setState(2353);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2352);
					templateargumentlist(0);
					}
				}

				setState(2355);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2357);
				literaloperatorid();
				setState(2358);
				match(Less);
				setState(2360);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2359);
					templateargumentlist(0);
					}
				}

				setState(2362);
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
		enterRule(_localctx, 374, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
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
		int _startState = 376;
		enterRecursionRule(_localctx, 376, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2369);
			templateargument();
			setState(2371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2370);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2374);
					match(Comma);
					setState(2375);
					templateargument();
					setState(2377);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
					case 1:
						{
						setState(2376);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2383);
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
		enterRule(_localctx, 378, RULE_templateargument);
		try {
			setState(2387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2384);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2385);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2386);
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
		enterRule(_localctx, 380, RULE_typenamespecifier);
		int _la;
		try {
			setState(2400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2389);
				match(Typename);
				setState(2390);
				nestednamespecifier(0);
				setState(2391);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393);
				match(Typename);
				setState(2394);
				nestednamespecifier(0);
				setState(2396);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2395);
					match(Template);
					}
				}

				setState(2398);
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
		enterRule(_localctx, 382, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2402);
				match(Extern);
				}
			}

			setState(2405);
			match(Template);
			setState(2406);
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
		enterRule(_localctx, 384, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2408);
			match(Template);
			setState(2409);
			match(Less);
			setState(2410);
			match(Greater);
			setState(2411);
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
		enterRule(_localctx, 386, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			match(Try);
			setState(2414);
			compoundstatement();
			setState(2415);
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
		enterRule(_localctx, 388, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			match(Try);
			setState(2419);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2418);
				ctorinitializer();
				}
			}

			setState(2421);
			compoundstatement();
			setState(2422);
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
		enterRule(_localctx, 390, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			handler();
			setState(2426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2425);
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
		enterRule(_localctx, 392, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(Catch);
			setState(2429);
			match(LeftParen);
			setState(2430);
			exceptiondeclaration();
			setState(2431);
			match(RightParen);
			setState(2432);
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
		enterRule(_localctx, 394, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2435);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2434);
					attributespecifierseq(0);
					}
				}

				setState(2437);
				typespecifierseq();
				setState(2438);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2440);
					attributespecifierseq(0);
					}
				}

				setState(2443);
				typespecifierseq();
				setState(2445);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2444);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2447);
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
		enterRule(_localctx, 396, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			match(Throw);
			setState(2452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2451);
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
		enterRule(_localctx, 398, RULE_exceptionspecification);
		try {
			setState(2456);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2454);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
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
		enterRule(_localctx, 400, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			match(Throw);
			setState(2459);
			match(LeftParen);
			setState(2461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2460);
				typeidlist(0);
				}
			}

			setState(2463);
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
		int _startState = 402;
		enterRecursionRule(_localctx, 402, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2466);
			typeid();
			setState(2468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				{
				setState(2467);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2470);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2471);
					match(Comma);
					setState(2472);
					typeid();
					setState(2474);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
					case 1:
						{
						setState(2473);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,324,_ctx);
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
		enterRule(_localctx, 404, RULE_noexceptspecification);
		try {
			setState(2487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2481);
				match(Noexcept);
				setState(2482);
				match(LeftParen);
				setState(2483);
				constantexpression();
				setState(2484);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2486);
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
		enterRule(_localctx, 406, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			match(Greater);
			setState(2490);
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
		enterRule(_localctx, 408, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492);
			match(Greater);
			setState(2493);
			match(Greater);
			setState(2494);
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
		enterRule(_localctx, 410, RULE_operator);
		try {
			setState(2544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2496);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2497);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2498);
				match(New);
				setState(2499);
				match(LeftBracket);
				setState(2500);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2501);
				match(Delete);
				setState(2502);
				match(LeftBracket);
				setState(2503);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2504);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2505);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2506);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2507);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2508);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2509);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2510);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2511);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2512);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2513);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2514);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2515);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2516);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2517);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2518);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2519);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2520);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2521);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2522);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2523);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2524);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2525);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2526);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2527);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2528);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2529);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2530);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2531);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2532);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2533);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2534);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2535);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2536);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2537);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2538);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2539);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2540);
				match(LeftParen);
				setState(2541);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2542);
				match(LeftBracket);
				setState(2543);
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
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
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
		enterRule(_localctx, 412, RULE_literal);
		try {
			setState(2553);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2546);
				integerliteral();
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2547);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2548);
				floatingliteral();
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2549);
				stringliteral();
				}
				break;
			case Booleanliteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2550);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2551);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2552);
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
		enterRule(_localctx, 414, RULE_integerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
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
		enterRule(_localctx, 416, RULE_floatingliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
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
		enterRule(_localctx, 418, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
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
		enterRule(_localctx, 420, RULE_booleanliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2561);
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
		enterRule(_localctx, 422, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2563);
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
		enterRule(_localctx, 424, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
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
		case 16:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 25:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 30:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 31:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 32:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 33:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 34:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 35:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 36:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 37:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 38:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 39:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 40:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 44:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 59:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 66:
			return variableDeclaratorList_sempred((VariableDeclaratorListContext)_localctx, predIndex);
		case 93:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 111:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 114:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 120:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 122:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 126:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 137:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 139:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 141:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 150:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 161:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 163:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 167:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 182:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 188:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 201:
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
	private boolean variableDeclaratorList_sempred(VariableDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 3);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0a0a\4\2\t"+
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
		"\t\u00d6\3\2\5\2\u01ae\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01b8\n"+
		"\3\3\4\3\4\5\4\u01bc\n\4\3\5\3\5\5\5\u01c0\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u01cb\n\6\3\7\3\7\5\7\u01cf\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01de\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e5"+
		"\n\b\3\b\3\b\3\b\7\b\u01ea\n\b\f\b\16\b\u01ed\13\b\3\t\3\t\5\t\u01f1\n"+
		"\t\3\t\3\t\3\n\3\n\5\n\u01f7\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0201\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u0208\n\r\3\r\3\r\3\r\3\r\5\r"+
		"\u020e\n\r\7\r\u0210\n\r\f\r\16\r\u0213\13\r\3\16\3\16\5\16\u0217\n\16"+
		"\3\17\3\17\3\17\3\17\5\17\u021d\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0224"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u022a\n\21\3\21\5\21\u022d\n\21\3\21\5"+
		"\21\u0230\n\21\3\21\5\21\u0233\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u023a"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0241\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0275\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0284\n\22\3\22\3\22\3\22\3\22\5\22\u028a"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0290\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u029d\n\22\f\22\16\22\u02a0\13\22\3\23"+
		"\3\23\3\24\5\24\u02a5\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u02b4\n\24\3\24\3\24\3\24\3\24\5\24\u02ba\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u02d8\n\25\3\26\3\26\3\27\5\27\u02dd\n\27\3\27\3\27\5\27\u02e1"+
		"\n\27\3\27\3\27\5\27\u02e5\n\27\3\27\5\27\u02e8\n\27\3\27\3\27\5\27\u02ec"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u02f2\n\27\5\27\u02f4\n\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\5\31\u02fc\n\31\3\32\3\32\5\32\u0300\n\32\3\32\5\32"+
		"\u0303\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u030a\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u0311\n\33\7\33\u0313\n\33\f\33\16\33\u0316\13\33\3\34\3"+
		"\34\5\34\u031a\n\34\3\34\3\34\5\34\u031e\n\34\3\35\5\35\u0321\n\35\3\35"+
		"\3\35\3\35\5\35\u0326\n\35\3\35\3\35\3\35\3\35\5\35\u032c\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0339\n\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \7 \u0344\n \f \16 \u0347\13 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\7!\u0355\n!\f!\16!\u0358\13!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u0363\n\"\f\"\16\"\u0366\13\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u0372\n#\f#\16#\u0375\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\7$\u0386\n$\f$\16$\u0389\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\7%\u0394\n%\f%\16%\u0397\13%\3&\3&\3&\3&\3&\3&\7&\u039f\n&\f&\16&\u03a2"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03aa\n\'\f\'\16\'\u03ad\13\'\3(\3(\3"+
		"(\3(\3(\3(\7(\u03b5\n(\f(\16(\u03b8\13(\3)\3)\3)\3)\3)\3)\7)\u03c0\n)"+
		"\f)\16)\u03c3\13)\3*\3*\3*\3*\3*\3*\7*\u03cb\n*\f*\16*\u03ce\13*\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u03d7\n+\3,\3,\3,\3,\3,\3,\5,\u03df\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u03ec\n-\3.\3.\3.\3.\3.\3.\7.\u03f4\n.\f.\16"+
		".\u03f7\13.\3/\3/\3\60\3\60\5\60\u03fd\n\60\3\60\3\60\5\60\u0401\n\60"+
		"\3\60\3\60\5\60\u0405\n\60\3\60\3\60\5\60\u0409\n\60\3\60\3\60\5\60\u040d"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u0413\n\60\3\60\5\60\u0416\n\60\3\61\5"+
		"\61\u0419\n\61\3\61\3\61\3\61\3\61\5\61\u041f\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0427\n\61\3\61\3\61\3\61\5\61\u042c\n\61\3\62\5\62\u042f"+
		"\n\62\3\62\3\62\3\63\3\63\5\63\u0435\n\63\3\63\3\63\3\64\3\64\7\64\u043b"+
		"\n\64\f\64\16\64\u043e\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0454"+
		"\n\65\3\66\3\66\5\66\u0458\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0460"+
		"\n\66\3\66\3\66\3\66\3\66\5\66\u0466\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u047a"+
		"\n\67\3\67\3\67\5\67\u047e\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u048b\n\67\38\38\58\u048f\n8\39\59\u0492\n9\39\3"+
		"9\39\3:\3:\5:\u0499\n:\3;\3;\3;\3;\3;\3;\5;\u04a1\n;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u04ab\n;\3<\3<\5<\u04af\n<\3=\3=\3=\3=\3=\7=\u04b6\n=\f=\16"+
		"=\u04b9\13=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04c4\n>\3?\3?\3?\3?\3?\3?\3"+
		"?\5?\u04cd\n?\3@\3@\5@\u04d1\n@\3A\3A\3A\5A\u04d6\nA\3A\3A\3A\3A\3B\3"+
		"B\3B\3C\5C\u04e0\nC\3C\5C\u04e3\nC\3C\3C\7C\u04e7\nC\fC\16C\u04ea\13C"+
		"\3C\5C\u04ed\nC\3D\3D\3D\3D\3D\3D\7D\u04f5\nD\fD\16D\u04f8\13D\3E\3E\3"+
		"E\5E\u04fd\nE\3F\5F\u0500\nF\3F\5F\u0503\nF\3F\3F\3F\5F\u0508\nF\3F\3"+
		"F\3F\5F\u050d\nF\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3I\3I\3J\3J\5J\u051e"+
		"\nJ\3K\3K\5K\u0522\nK\3K\3K\3K\5K\u0527\nK\3L\3L\3L\3L\3L\5L\u052e\nL"+
		"\3M\3M\5M\u0532\nM\3M\3M\3M\5M\u0537\nM\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\5Q"+
		"\u0542\nQ\3R\3R\3R\3R\5R\u0548\nR\3S\3S\5S\u054c\nS\3S\3S\3S\5S\u0551"+
		"\nS\3T\3T\5T\u0555\nT\3T\3T\3T\5T\u055a\nT\3U\5U\u055d\nU\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0573\nU\3V\3V\3V"+
		"\3V\5V\u0579\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0584\nW\3X\3X\5X\u0588"+
		"\nX\3X\5X\u058b\nX\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0595\nX\3X\3X\3X\3X\5X"+
		"\u059b\nX\3X\5X\u059e\nX\3Y\3Y\3Z\3Z\3Z\5Z\u05a5\nZ\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\5Z\u05af\nZ\3[\3[\5[\u05b3\n[\3[\5[\u05b6\n[\3[\5[\u05b9\n[\3["+
		"\3[\5[\u05bd\n[\3[\3[\3[\5[\u05c2\n[\5[\u05c4\n[\3\\\3\\\5\\\u05c8\n\\"+
		"\3\\\3\\\5\\\u05cc\n\\\3\\\3\\\3]\3]\3]\3]\3]\5]\u05d5\n]\3^\3^\3^\3_"+
		"\3_\3_\3_\3_\3_\7_\u05e0\n_\f_\16_\u05e3\13_\3`\3`\3`\3`\3`\5`\u05ea\n"+
		"`\3a\3a\3b\3b\5b\u05f0\nb\3c\3c\3d\3d\5d\u05f6\nd\3e\3e\5e\u05fa\ne\3"+
		"f\5f\u05fd\nf\3f\3f\3f\3f\3f\3f\3g\5g\u0606\ng\3g\3g\3g\3g\3g\3g\3h\5"+
		"h\u060f\nh\3h\3h\3h\3h\3h\3i\5i\u0617\ni\3j\3j\3k\3k\3k\3k\3k\3k\3l\5"+
		"l\u0622\nl\3l\3l\3m\3m\5m\u0628\nm\3m\3m\3m\3m\3m\3m\3m\3m\3m\5m\u0633"+
		"\nm\3n\5n\u0636\nn\3n\3n\3n\5n\u063b\nn\3n\3n\3n\3o\3o\3o\3o\3o\3o\3p"+
		"\3p\3p\3p\5p\u064a\np\3p\3p\3p\3p\5p\u0650\np\3q\3q\3q\3q\3q\7q\u0657"+
		"\nq\fq\16q\u065a\13q\3r\3r\3r\3r\3r\3r\3r\5r\u0663\nr\3s\3s\3s\3s\5s\u0669"+
		"\ns\3s\3s\3s\3s\3s\3s\5s\u0671\ns\3s\3s\5s\u0675\ns\3t\3t\5t\u0679\nt"+
		"\3t\3t\3t\5t\u067e\nt\3t\3t\3t\5t\u0683\nt\3t\3t\3t\3t\3t\7t\u068a\nt"+
		"\ft\16t\u068d\13t\3u\3u\5u\u0691\nu\3v\3v\5v\u0695\nv\3w\3w\3w\3w\3x\3"+
		"x\3y\3y\3y\3y\3z\3z\5z\u06a3\nz\3z\3z\7z\u06a7\nz\fz\16z\u06aa\13z\3{"+
		"\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u06b8\n{\3|\3|\3|\3|\3|\3|\7|\u06c0"+
		"\n|\f|\16|\u06c3\13|\3}\3}\5}\u06c7\n}\3~\3~\3~\3~\3~\5~\u06ce\n~\3\177"+
		"\7\177\u06d1\n\177\f\177\16\177\u06d4\13\177\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u06db\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u06e1\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06e8\n"+
		"\u0080\3\u0080\3\u0080\5\u0080\u06ec\n\u0080\7\u0080\u06ee\n\u0080\f\u0080"+
		"\16\u0080\u06f1\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u06f7"+
		"\n\u0081\3\u0081\5\u0081\u06fa\n\u0081\3\u0081\5\u0081\u06fd\n\u0081\3"+
		"\u0081\5\u0081\u0700\n\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0705\n\u0082"+
		"\3\u0083\3\u0083\5\u0083\u0709\n\u0083\3\u0083\5\u0083\u070c\n\u0083\3"+
		"\u0083\3\u0083\5\u0083\u0710\n\u0083\3\u0083\3\u0083\5\u0083\u0714\n\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u0719\n\u0083\3\u0083\5\u0083\u071c\n"+
		"\u0083\5\u0083\u071e\n\u0083\3\u0084\3\u0084\5\u0084\u0722\n\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\5\u0087\u0729\n\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\5\u0088\u072f\n\u0088\3\u0089\3\u0089\5\u0089\u0733\n"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0739\n\u0089\3\u008a\3"+
		"\u008a\3\u008a\5\u008a\u073e\n\u008a\5\u008a\u0740\n\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u0746\n\u008b\3\u008b\3\u008b\5\u008b\u074a\n"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0750\n\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0757\n\u008b\3\u008b\3\u008b\5"+
		"\u008b\u075b\n\u008b\7\u008b\u075d\n\u008b\f\u008b\16\u008b\u0760\13\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0766\n\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0770\n\u008d"+
		"\3\u008d\3\u008d\5\u008d\u0774\n\u008d\7\u008d\u0776\n\u008d\f\u008d\16"+
		"\u008d\u0779\13\u008d\3\u008e\5\u008e\u077c\n\u008e\3\u008e\5\u008e\u077f"+
		"\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0785\n\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u078d\n\u008f\f\u008f"+
		"\16\u008f\u0790\13\u008f\3\u0090\5\u0090\u0793\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u0799\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u07a1\n\u0090\3\u0090\3\u0090\5\u0090\u07a5\n"+
		"\u0090\3\u0090\5\u0090\u07a8\n\u0090\3\u0090\3\u0090\5\u0090\u07ac\n\u0090"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u07b1\n\u0090\3\u0091\5\u0091\u07b4\n"+
		"\u0091\3\u0091\5\u0091\u07b7\n\u0091\3\u0091\3\u0091\5\u0091\u07bb\n\u0091"+
		"\3\u0091\3\u0091\3\u0092\5\u0092\u07c0\n\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\5\u0094\u07ca\n\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u07d4"+
		"\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u07db\n\u0095"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u07e0\n\u0096\3\u0097\3\u0097\5\u0097"+
		"\u07e4\n\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u07e9\n\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\5\u0098\u07ef\n\u0098\7\u0098\u07f1\n\u0098\f\u0098"+
		"\16\u0098\u07f4\13\u0098\3\u0099\3\u0099\3\u0099\5\u0099\u07f9\n\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u07ff\n\u0099\3\u009a\3\u009a"+
		"\5\u009a\u0803\n\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c"+
		"\u080a\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u0810\n\u009d\3"+
		"\u009d\3\u009d\5\u009d\u0814\n\u009d\3\u009d\5\u009d\u0817\n\u009d\3\u009d"+
		"\3\u009d\5\u009d\u081b\n\u009d\3\u009d\5\u009d\u081e\n\u009d\5\u009d\u0820"+
		"\n\u009d\3\u009e\5\u009e\u0823\n\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1\u082d\n\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0832\n\u00a1\5\u00a1\u0834\n\u00a1\3\u00a2\5\u00a2\u0837"+
		"\n\u00a2\3\u00a2\5\u00a2\u083a\n\u00a2\3\u00a2\5\u00a2\u083d\n\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0846\n"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u084e\n"+
		"\u00a3\f\u00a3\16\u00a3\u0851\13\u00a3\3\u00a4\3\u00a4\5\u00a4\u0855\n"+
		"\u00a4\3\u00a4\5\u00a4\u0858\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u085c\n\u00a4"+
		"\3\u00a4\5\u00a4\u085f\n\u00a4\3\u00a4\5\u00a4\u0862\n\u00a4\3\u00a4\3"+
		"\u00a4\5\u00a4\u0866\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7"+
		"\u00a5\u086d\n\u00a5\f\u00a5\16\u00a5\u0870\13\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u087e\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0884\n\u00a9\7\u00a9\u0886\n\u00a9\f\u00a9\16\u00a9\u0889\13\u00a9\3"+
		"\u00aa\5\u00aa\u088c\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0890\n\u00aa\3\u00aa"+
		"\3\u00aa\5\u00aa\u0894\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0898\n\u00aa\3"+
		"\u00aa\3\u00aa\5\u00aa\u089c\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u08a0\n\u00aa"+
		"\3\u00ab\5\u00ab\u08a3\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u08a7\n\u00ab\3"+
		"\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\5\u00af\u08b2\n\u00af\3\u00b0\3\u00b0\5\u00b0\u08b6\n\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u08bd\n\u00b2\3\u00b2\3\u00b2\5"+
		"\u00b2\u08c1\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08c6\n\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u08cb\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u08d2\n\u00b3\3\u00b4\3\u00b4\5\u00b4\u08d6\n\u00b4\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u08e0\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u08ee\n\u00b8\f\u00b8"+
		"\16\u00b8\u08f1\13\u00b8\3\u00b9\3\u00b9\5\u00b9\u08f5\n\u00b9\3\u00ba"+
		"\3\u00ba\5\u00ba\u08f9\n\u00ba\3\u00ba\5\u00ba\u08fc\n\u00ba\3\u00ba\3"+
		"\u00ba\5\u00ba\u0900\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0906"+
		"\n\u00ba\3\u00ba\5\u00ba\u0909\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u090d\n"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u0917\n\u00ba\3\u00ba\5\u00ba\u091a\n\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0922\n\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\5\u00ba\u0927\n\u00ba\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u092c\n\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0934\n\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u093b\n\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u093f\n\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be"+
		"\5\u00be\u0946\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u094c\n"+
		"\u00be\7\u00be\u094e\n\u00be\f\u00be\16\u00be\u0951\13\u00be\3\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0956\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c0\3\u00c0\5\u00c0\u095f\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u0963"+
		"\n\u00c0\3\u00c1\5\u00c1\u0966\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\5\u00c4\u0976\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\5\u00c5\u097d\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c7\5\u00c7\u0986\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u098c\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0990\n\u00c7\3\u00c7\5\u00c7\u0993"+
		"\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u0997\n\u00c8\3\u00c9\3\u00c9\5\u00c9"+
		"\u099b\n\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09a0\n\u00ca\3\u00ca\3"+
		"\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09a7\n\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u09ad\n\u00cb\7\u00cb\u09af\n\u00cb\f\u00cb\16"+
		"\u00cb\u09b2\13\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u09ba\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09f3\n\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u09fc\n\u00d0\3\u00d1"+
		"\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\2$\16\30\"\64>@BDFHJLNPRZx\u0086\u00bc\u00e0"+
		"\u00e6\u00f2\u00f6\u00fe\u0114\u0118\u011c\u012e\u0144\u0148\u0150\u016e"+
		"\u017a\u0194\u00d7\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\2\f\4\2[[__\4\2UW[^\7\2\36\36))\63\6399@@\5\2\34\34&&JJ\4"+
		"\2\20\20LL\4\2[[pp\5\2\17\17<<GG\4\2  //\3\2\60\62\3\2\u0089\u008c\u0b29"+
		"\2\u01ad\3\2\2\2\4\u01b7\3\2\2\2\6\u01bb\3\2\2\2\b\u01bf\3\2\2\2\n\u01ca"+
		"\3\2\2\2\f\u01cc\3\2\2\2\16\u01dd\3\2\2\2\20\u01ee\3\2\2\2\22\u01f4\3"+
		"\2\2\2\24\u0200\3\2\2\2\26\u0202\3\2\2\2\30\u0204\3\2\2\2\32\u0216\3\2"+
		"\2\2\34\u021c\3\2\2\2\36\u0223\3\2\2\2 \u0225\3\2\2\2\"\u0274\3\2\2\2"+
		"$\u02a1\3\2\2\2&\u02b9\3\2\2\2(\u02d7\3\2\2\2*\u02d9\3\2\2\2,\u02f3\3"+
		"\2\2\2.\u02f5\3\2\2\2\60\u02f9\3\2\2\2\62\u0302\3\2\2\2\64\u0304\3\2\2"+
		"\2\66\u031d\3\2\2\28\u032b\3\2\2\2:\u032d\3\2\2\2<\u0338\3\2\2\2>\u033a"+
		"\3\2\2\2@\u0348\3\2\2\2B\u0359\3\2\2\2D\u0367\3\2\2\2F\u0376\3\2\2\2H"+
		"\u038a\3\2\2\2J\u0398\3\2\2\2L\u03a3\3\2\2\2N\u03ae\3\2\2\2P\u03b9\3\2"+
		"\2\2R\u03c4\3\2\2\2T\u03d6\3\2\2\2V\u03de\3\2\2\2X\u03eb\3\2\2\2Z\u03ed"+
		"\3\2\2\2\\\u03f8\3\2\2\2^\u0415\3\2\2\2`\u042b\3\2\2\2b\u042e\3\2\2\2"+
		"d\u0432\3\2\2\2f\u0438\3\2\2\2h\u0453\3\2\2\2j\u0465\3\2\2\2l\u048a\3"+
		"\2\2\2n\u048e\3\2\2\2p\u0491\3\2\2\2r\u0498\3\2\2\2t\u04aa\3\2\2\2v\u04ae"+
		"\3\2\2\2x\u04b0\3\2\2\2z\u04c3\3\2\2\2|\u04cc\3\2\2\2~\u04d0\3\2\2\2\u0080"+
		"\u04d2\3\2\2\2\u0082\u04db\3\2\2\2\u0084\u04df\3\2\2\2\u0086\u04ee\3\2"+
		"\2\2\u0088\u04f9\3\2\2\2\u008a\u050c\3\2\2\2\u008c\u050e\3\2\2\2\u008e"+
		"\u0516\3\2\2\2\u0090\u0518\3\2\2\2\u0092\u051d\3\2\2\2\u0094\u0526\3\2"+
		"\2\2\u0096\u052d\3\2\2\2\u0098\u0536\3\2\2\2\u009a\u0538\3\2\2\2\u009c"+
		"\u053a\3\2\2\2\u009e\u053c\3\2\2\2\u00a0\u0541\3\2\2\2\u00a2\u0547\3\2"+
		"\2\2\u00a4\u0550\3\2\2\2\u00a6\u0559\3\2\2\2\u00a8\u0572\3\2\2\2\u00aa"+
		"\u0578\3\2\2\2\u00ac\u0583\3\2\2\2\u00ae\u059d\3\2\2\2\u00b0\u059f\3\2"+
		"\2\2\u00b2\u05ae\3\2\2\2\u00b4\u05c3\3\2\2\2\u00b6\u05c5\3\2\2\2\u00b8"+
		"\u05d4\3\2\2\2\u00ba\u05d6\3\2\2\2\u00bc\u05d9\3\2\2\2\u00be\u05e9\3\2"+
		"\2\2\u00c0\u05eb\3\2\2\2\u00c2\u05ef\3\2\2\2\u00c4\u05f1\3\2\2\2\u00c6"+
		"\u05f5\3\2\2\2\u00c8\u05f9\3\2\2\2\u00ca\u05fc\3\2\2\2\u00cc\u0605\3\2"+
		"\2\2\u00ce\u060e\3\2\2\2\u00d0\u0616\3\2\2\2\u00d2\u0618\3\2\2\2\u00d4"+
		"\u061a\3\2\2\2\u00d6\u0621\3\2\2\2\u00d8\u0632\3\2\2\2\u00da\u0635\3\2"+
		"\2\2\u00dc\u063f\3\2\2\2\u00de\u064f\3\2\2\2\u00e0\u0651\3\2\2\2\u00e2"+
		"\u0662\3\2\2\2\u00e4\u0674\3\2\2\2\u00e6\u067d\3\2\2\2\u00e8\u068e\3\2"+
		"\2\2\u00ea\u0694\3\2\2\2\u00ec\u0696\3\2\2\2\u00ee\u069a\3\2\2\2\u00f0"+
		"\u069c\3\2\2\2\u00f2\u06a0\3\2\2\2\u00f4\u06b7\3\2\2\2\u00f6\u06b9\3\2"+
		"\2\2\u00f8\u06c4\3\2\2\2\u00fa\u06cd\3\2\2\2\u00fc\u06d2\3\2\2\2\u00fe"+
		"\u06e0\3\2\2\2\u0100\u06f2\3\2\2\2\u0102\u0701\3\2\2\2\u0104\u071d\3\2"+
		"\2\2\u0106\u071f\3\2\2\2\u0108\u0723\3\2\2\2\u010a\u0725\3\2\2\2\u010c"+
		"\u0728\3\2\2\2\u010e\u072c\3\2\2\2\u0110\u0738\3\2\2\2\u0112\u073f\3\2"+
		"\2\2\u0114\u074f\3\2\2\2\u0116\u0765\3\2\2\2\u0118\u0767\3\2\2\2\u011a"+
		"\u0784\3\2\2\2\u011c\u0786\3\2\2\2\u011e\u07b0\3\2\2\2\u0120\u07b3\3\2"+
		"\2\2\u0122\u07bf\3\2\2\2\u0124\u07c3\3\2\2\2\u0126\u07d3\3\2\2\2\u0128"+
		"\u07da\3\2\2\2\u012a\u07df\3\2\2\2\u012c\u07e3\3\2\2\2\u012e\u07e5\3\2"+
		"\2\2\u0130\u07fe\3\2\2\2\u0132\u0802\3\2\2\2\u0134\u0804\3\2\2\2\u0136"+
		"\u0807\3\2\2\2\u0138\u081f\3\2\2\2\u013a\u0822\3\2\2\2\u013c\u0826\3\2"+
		"\2\2\u013e\u0828\3\2\2\2\u0140\u0833\3\2\2\2\u0142\u0845\3\2\2\2\u0144"+
		"\u0847\3\2\2\2\u0146\u0865\3\2\2\2\u0148\u0867\3\2\2\2\u014a\u0871\3\2"+
		"\2\2\u014c\u0873\3\2\2\2\u014e\u0877\3\2\2\2\u0150\u087a\3\2\2\2\u0152"+
		"\u089f\3\2\2\2\u0154\u08a6\3\2\2\2\u0156\u08a8\3\2\2\2\u0158\u08aa\3\2"+
		"\2\2\u015a\u08ac\3\2\2\2\u015c\u08af\3\2\2\2\u015e\u08b3\3\2\2\2\u0160"+
		"\u08b7\3\2\2\2\u0162\u08c5\3\2\2\2\u0164\u08d1\3\2\2\2\u0166\u08d5\3\2"+
		"\2\2\u0168\u08d7\3\2\2\2\u016a\u08df\3\2\2\2\u016c\u08e1\3\2\2\2\u016e"+
		"\u08e7\3\2\2\2\u0170\u08f4\3\2\2\2\u0172\u0926\3\2\2\2\u0174\u0928\3\2"+
		"\2\2\u0176\u093e\3\2\2\2\u0178\u0940\3\2\2\2\u017a\u0942\3\2\2\2\u017c"+
		"\u0955\3\2\2\2\u017e\u0962\3\2\2\2\u0180\u0965\3\2\2\2\u0182\u096a\3\2"+
		"\2\2\u0184\u096f\3\2\2\2\u0186\u0973\3\2\2\2\u0188\u097a\3\2\2\2\u018a"+
		"\u097e\3\2\2\2\u018c\u0992\3\2\2\2\u018e\u0994\3\2\2\2\u0190\u099a\3\2"+
		"\2\2\u0192\u099c\3\2\2\2\u0194\u09a3\3\2\2\2\u0196\u09b9\3\2\2\2\u0198"+
		"\u09bb\3\2\2\2\u019a\u09be\3\2\2\2\u019c\u09f2\3\2\2\2\u019e\u09fb\3\2"+
		"\2\2\u01a0\u09fd\3\2\2\2\u01a2\u09ff\3\2\2\2\u01a4\u0a01\3\2\2\2\u01a6"+
		"\u0a03\3\2\2\2\u01a8\u0a05\3\2\2\2\u01aa\u0a07\3\2\2\2\u01ac\u01ae\5x"+
		"=\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\3\3\2\2\2\u01af\u01b8"+
		"\5\u019e\u00d0\2\u01b0\u01b8\7?\2\2\u01b1\u01b2\7O\2\2\u01b2\u01b3\5Z"+
		".\2\u01b3\u01b4\7P\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b8\5\b\5\2\u01b6\u01b8"+
		"\5\20\t\2\u01b7\u01af\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b1\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\5\3\2\2\2\u01b9\u01bc\5"+
		"\n\6\2\u01ba\u01bc\5\f\7\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\7\3\2\2\2\u01bd\u01c0\5\n\6\2\u01be\u01c0\5\f\7\2\u01bf\u01bd\3\2\2\2"+
		"\u01bf\u01be\3\2\2\2\u01c0\t\3\2\2\2\u01c1\u01cb\7~\2\2\u01c2\u01cb\5"+
		"\u0168\u00b5\2\u01c3\u01cb\5\u015a\u00ae\2\u01c4\u01cb\5\u016a\u00b6\2"+
		"\u01c5\u01c6\7]\2\2\u01c6\u01cb\5\u0132\u009a\2\u01c7\u01c8\7]\2\2\u01c8"+
		"\u01cb\5\u00acW\2\u01c9\u01cb\5\u0176\u00bc\2\u01ca\u01c1\3\2\2\2\u01ca"+
		"\u01c2\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01c5\3\2"+
		"\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\13\3\2\2\2\u01cc\u01ce"+
		"\5\16\b\2\u01cd\u01cf\7>\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\5\n\6\2\u01d1\r\3\2\2\2\u01d2\u01d3\b\b\1\2"+
		"\u01d3\u01de\7y\2\2\u01d4\u01d5\5\u00aaV\2\u01d5\u01d6\7y\2\2\u01d6\u01de"+
		"\3\2\2\2\u01d7\u01d8\5\u00c2b\2\u01d8\u01d9\7y\2\2\u01d9\u01de\3\2\2\2"+
		"\u01da\u01db\5\u00acW\2\u01db\u01dc\7y\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d2"+
		"\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01da\3\2\2\2\u01de"+
		"\u01eb\3\2\2\2\u01df\u01e0\f\4\2\2\u01e0\u01e1\7~\2\2\u01e1\u01ea\7y\2"+
		"\2\u01e2\u01e4\f\3\2\2\u01e3\u01e5\7>\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\5\u0174\u00bb\2\u01e7\u01e8\7"+
		"y\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e2\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\17\3\2\2"+
		"\2\u01ed\u01eb\3\2\2\2\u01ee\u01f0\5\22\n\2\u01ef\u01f1\5 \21\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5d"+
		"\63\2\u01f3\21\3\2\2\2\u01f4\u01f6\7Q\2\2\u01f5\u01f7\5\24\13\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7R"+
		"\2\2\u01f9\23\3\2\2\2\u01fa\u0201\5\26\f\2\u01fb\u0201\5\30\r\2\u01fc"+
		"\u01fd\5\26\f\2\u01fd\u01fe\7t\2\2\u01fe\u01ff\5\30\r\2\u01ff\u0201\3"+
		"\2\2\2\u0200\u01fa\3\2\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc\3\2\2\2\u0201"+
		"\25\3\2\2\2\u0202\u0203\t\2\2\2\u0203\27\3\2\2\2\u0204\u0205\b\r\1\2\u0205"+
		"\u0207\5\32\16\2\u0206\u0208\7}\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3"+
		"\2\2\2\u0208\u0211\3\2\2\2\u0209\u020a\f\3\2\2\u020a\u020b\7t\2\2\u020b"+
		"\u020d\5\32\16\2\u020c\u020e\7}\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3"+
		"\2\2\2\u020e\u0210\3\2\2\2\u020f\u0209\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\31\3\2\2\2\u0213\u0211\3\2\2"+
		"\2\u0214\u0217\5\34\17\2\u0215\u0217\5\36\20\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0215\3\2\2\2\u0217\33\3\2\2\2\u0218\u021d\7~\2\2\u0219\u021a\7[\2\2"+
		"\u021a\u021d\7~\2\2\u021b\u021d\7?\2\2\u021c\u0218\3\2\2\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021b\3\2\2\2\u021d\35\3\2\2\2\u021e\u021f\7~\2\2\u021f"+
		"\u0224\5\u0128\u0095\2\u0220\u0221\7[\2\2\u0221\u0222\7~\2\2\u0222\u0224"+
		"\5\u0128\u0095\2\u0223\u021e\3\2\2\2\u0223\u0220\3\2\2\2\u0224\37\3\2"+
		"\2\2\u0225\u0226\7O\2\2\u0226\u0227\5\u011a\u008e\2\u0227\u0229\7P\2\2"+
		"\u0228\u022a\7)\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c"+
		"\3\2\2\2\u022b\u022d\5\u0190\u00c9\2\u022c\u022b\3\2\2\2\u022c\u022d\3"+
		"\2\2\2\u022d\u022f\3\2\2\2\u022e\u0230\5\u00e0q\2\u022f\u022e\3\2\2\2"+
		"\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0233\5\u0102\u0082\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233!\3\2\2\2\u0234\u0235\b\22\1\2"+
		"\u0235\u0275\5\4\3\2\u0236\u0237\5\u00a8U\2\u0237\u0239\7O\2\2\u0238\u023a"+
		"\5$\23\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\7P\2\2\u023c\u0275\3\2\2\2\u023d\u023e\5\u017e\u00c0\2\u023e\u0240"+
		"\7O\2\2\u023f\u0241\5$\23\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\7P\2\2\u0243\u0275\3\2\2\2\u0244\u0245\5\u00a8"+
		"U\2\u0245\u0246\5\u0130\u0099\2\u0246\u0275\3\2\2\2\u0247\u0248\5\u017e"+
		"\u00c0\2\u0248\u0249\5\u0130\u0099\2\u0249\u0275\3\2\2\2\u024a\u024b\7"+
		"\31\2\2\u024b\u024c\7`\2\2\u024c\u024d\5\u010e\u0088\2\u024d\u024e\7a"+
		"\2\2\u024e\u024f\7O\2\2\u024f\u0250\5Z.\2\u0250\u0251\7P\2\2\u0251\u0275"+
		"\3\2\2\2\u0252\u0253\7;\2\2\u0253\u0254\7`\2\2\u0254\u0255\5\u010e\u0088"+
		"\2\u0255\u0256\7a\2\2\u0256\u0257\7O\2\2\u0257\u0258\5Z.\2\u0258\u0259"+
		"\7P\2\2\u0259\u0275\3\2\2\2\u025a\u025b\7\64\2\2\u025b\u025c\7`\2\2\u025c"+
		"\u025d\5\u010e\u0088\2\u025d\u025e\7a\2\2\u025e\u025f\7O\2\2\u025f\u0260"+
		"\5Z.\2\u0260\u0261\7P\2\2\u0261\u0275\3\2\2\2\u0262\u0263\7\22\2\2\u0263"+
		"\u0264\7`\2\2\u0264\u0265\5\u010e\u0088\2\u0265\u0266\7a\2\2\u0266\u0267"+
		"\7O\2\2\u0267\u0268\5Z.\2\u0268\u0269\7P\2\2\u0269\u0275\3\2\2\2\u026a"+
		"\u026b\7E\2\2\u026b\u026c\7O\2\2\u026c\u026d\5Z.\2\u026d\u026e\7P\2\2"+
		"\u026e\u0275\3\2\2\2\u026f\u0270\7E\2\2\u0270\u0271\7O\2\2\u0271\u0272"+
		"\5\u010e\u0088\2\u0272\u0273\7P\2\2\u0273\u0275\3\2\2\2\u0274\u0234\3"+
		"\2\2\2\u0274\u0236\3\2\2\2\u0274\u023d\3\2\2\2\u0274\u0244\3\2\2\2\u0274"+
		"\u0247\3\2\2\2\u0274\u024a\3\2\2\2\u0274\u0252\3\2\2\2\u0274\u025a\3\2"+
		"\2\2\u0274\u0262\3\2\2\2\u0274\u026a\3\2\2\2\u0274\u026f\3\2\2\2\u0275"+
		"\u029e\3\2\2\2\u0276\u0277\f\25\2\2\u0277\u0278\7Q\2\2\u0278\u0279\5Z"+
		".\2\u0279\u027a\7R\2\2\u027a\u029d\3\2\2\2\u027b\u027c\f\24\2\2\u027c"+
		"\u027d\7Q\2\2\u027d\u027e\5\u0130\u0099\2\u027e\u027f\7R\2\2\u027f\u029d"+
		"\3\2\2\2\u0280\u0281\f\23\2\2\u0281\u0283\7O\2\2\u0282\u0284\5$\23\2\u0283"+
		"\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u029d\7P"+
		"\2\2\u0286\u0287\f\16\2\2\u0287\u0289\7{\2\2\u0288\u028a\7>\2\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u029d\5\6"+
		"\4\2\u028c\u028d\f\r\2\2\u028d\u028f\7v\2\2\u028e\u0290\7>\2\2\u028f\u028e"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u029d\5\6\4\2\u0292"+
		"\u0293\f\f\2\2\u0293\u0294\7{\2\2\u0294\u029d\5&\24\2\u0295\u0296\f\13"+
		"\2\2\u0296\u0297\7v\2\2\u0297\u029d\5&\24\2\u0298\u0299\f\n\2\2\u0299"+
		"\u029d\7r\2\2\u029a\u029b\f\t\2\2\u029b\u029d\7s\2\2\u029c\u0276\3\2\2"+
		"\2\u029c\u027b\3\2\2\2\u029c\u0280\3\2\2\2\u029c\u0286\3\2\2\2\u029c\u028c"+
		"\3\2\2\2\u029c\u0292\3\2\2\2\u029c\u0295\3\2\2\2\u029c\u0298\3\2\2\2\u029c"+
		"\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f#\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\5\u012e\u0098\2\u02a2"+
		"%\3\2\2\2\u02a3\u02a5\5\16\b\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2"+
		"\u02a5\u02a6\3\2\2\2\u02a6\u02a7\5\u00aaV\2\u02a7\u02a8\7y\2\2\u02a8\u02a9"+
		"\7]\2\2\u02a9\u02aa\5\u00aaV\2\u02aa\u02ba\3\2\2\2\u02ab\u02ac\5\16\b"+
		"\2\u02ac\u02ad\7>\2\2\u02ad\u02ae\5\u0174\u00bb\2\u02ae\u02af\7y\2\2\u02af"+
		"\u02b0\7]\2\2\u02b0\u02b1\5\u00aaV\2\u02b1\u02ba\3\2\2\2\u02b2\u02b4\5"+
		"\16\b\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\7]\2\2\u02b6\u02ba\5\u00aaV\2\u02b7\u02b8\7]\2\2\u02b8\u02ba\5"+
		"\u00acW\2\u02b9\u02a4\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9\u02b3\3\2\2\2"+
		"\u02b9\u02b7\3\2\2\2\u02ba\'\3\2\2\2\u02bb\u02d8\5\"\22\2\u02bc\u02bd"+
		"\7r\2\2\u02bd\u02d8\5<\37\2\u02be\u02bf\7s\2\2\u02bf\u02d8\5<\37\2\u02c0"+
		"\u02c1\5*\26\2\u02c1\u02c2\5<\37\2\u02c2\u02d8\3\2\2\2\u02c3\u02c4\78"+
		"\2\2\u02c4\u02d8\5(\25\2\u02c5\u02c6\78\2\2\u02c6\u02c7\7O\2\2\u02c7\u02c8"+
		"\5\u010e\u0088\2\u02c8\u02c9\7P\2\2\u02c9\u02d8\3\2\2\2\u02ca\u02cb\7"+
		"8\2\2\u02cb\u02cc\7}\2\2\u02cc\u02cd\7O\2\2\u02cd\u02ce\7~\2\2\u02ce\u02d8"+
		"\7P\2\2\u02cf\u02d0\7\5\2\2\u02d0\u02d1\7O\2\2\u02d1\u02d2\5\u010e\u0088"+
		"\2\u02d2\u02d3\7P\2\2\u02d3\u02d8\3\2\2\2\u02d4\u02d8\5:\36\2\u02d5\u02d8"+
		"\5,\27\2\u02d6\u02d8\58\35\2\u02d7\u02bb\3\2\2\2\u02d7\u02bc\3\2\2\2\u02d7"+
		"\u02be\3\2\2\2\u02d7\u02c0\3\2\2\2\u02d7\u02c3\3\2\2\2\u02d7\u02c5\3\2"+
		"\2\2\u02d7\u02ca\3\2\2\2\u02d7\u02cf\3\2\2\2\u02d7\u02d4\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8)\3\2\2\2\u02d9\u02da\t\3\2\2"+
		"\u02da+\3\2\2\2\u02db\u02dd\7y\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\7+\2\2\u02df\u02e1\5.\30\2\u02e0"+
		"\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\5\60"+
		"\31\2\u02e3\u02e5\5\66\34\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02f4\3\2\2\2\u02e6\u02e8\7y\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\7+\2\2\u02ea\u02ec\5.\30\2\u02eb"+
		"\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\7O"+
		"\2\2\u02ee\u02ef\5\u010e\u0088\2\u02ef\u02f1\7P\2\2\u02f0\u02f2\5\66\34"+
		"\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02dc"+
		"\3\2\2\2\u02f3\u02e7\3\2\2\2\u02f4-\3\2\2\2\u02f5\u02f6\7O\2\2\u02f6\u02f7"+
		"\5$\23\2\u02f7\u02f8\7P\2\2\u02f8/\3\2\2\2\u02f9\u02fb\5\u00a4S\2\u02fa"+
		"\u02fc\5\62\32\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\61\3\2"+
		"\2\2\u02fd\u02ff\5\u0104\u0083\2\u02fe\u0300\5\62\32\2\u02ff\u02fe\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u0303\5\64\33\2\u0302"+
		"\u02fd\3\2\2\2\u0302\u0301\3\2\2\2\u0303\63\3\2\2\2\u0304\u0305\b\33\1"+
		"\2\u0305\u0306\7Q\2\2\u0306\u0307\5Z.\2\u0307\u0309\7R\2\2\u0308\u030a"+
		"\5\u00e0q\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0314\3\2\2"+
		"\2\u030b\u030c\f\3\2\2\u030c\u030d\7Q\2\2\u030d\u030e\5\\/\2\u030e\u0310"+
		"\7R\2\2\u030f\u0311\5\u00e0q\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2"+
		"\u0311\u0313\3\2\2\2\u0312\u030b\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\65\3\2\2\2\u0316\u0314\3\2\2\2\u0317"+
		"\u0319\7O\2\2\u0318\u031a\5$\23\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031e\7P\2\2\u031c\u031e\5\u0130\u0099"+
		"\2\u031d\u0317\3\2\2\2\u031d\u031c\3\2\2\2\u031e\67\3\2\2\2\u031f\u0321"+
		"\7y\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\7\26\2\2\u0323\u032c\5<\37\2\u0324\u0326\7y\2\2\u0325\u0324\3\2"+
		"\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\7\26\2\2\u0328"+
		"\u0329\7Q\2\2\u0329\u032a\7R\2\2\u032a\u032c\5<\37\2\u032b\u0320\3\2\2"+
		"\2\u032b\u0325\3\2\2\2\u032c9\3\2\2\2\u032d\u032e\7,\2\2\u032e\u032f\7"+
		"O\2\2\u032f\u0330\5Z.\2\u0330\u0331\7P\2\2\u0331;\3\2\2\2\u0332\u0339"+
		"\5(\25\2\u0333\u0334\7O\2\2\u0334\u0335\5\u010e\u0088\2\u0335\u0336\7"+
		"P\2\2\u0336\u0337\5<\37\2\u0337\u0339\3\2\2\2\u0338\u0332\3\2\2\2\u0338"+
		"\u0333\3\2\2\2\u0339=\3\2\2\2\u033a\u033b\b \1\2\u033b\u033c\5<\37\2\u033c"+
		"\u0345\3\2\2\2\u033d\u033e\f\4\2\2\u033e\u033f\7|\2\2\u033f\u0344\5<\37"+
		"\2\u0340\u0341\f\3\2\2\u0341\u0342\7u\2\2\u0342\u0344\5<\37\2\u0343\u033d"+
		"\3\2\2\2\u0343\u0340\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346?\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\b!\1\2\u0349"+
		"\u034a\5> \2\u034a\u0356\3\2\2\2\u034b\u034c\f\5\2\2\u034c\u034d\7W\2"+
		"\2\u034d\u0355\5> \2\u034e\u034f\f\4\2\2\u034f\u0350\7X\2\2\u0350\u0355"+
		"\5> \2\u0351\u0352\f\3\2\2\u0352\u0353\7Y\2\2\u0353\u0355\5> \2\u0354"+
		"\u034b\3\2\2\2\u0354\u034e\3\2\2\2\u0354\u0351\3\2\2\2\u0355\u0358\3\2"+
		"\2\2\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357A\3\2\2\2\u0358\u0356"+
		"\3\2\2\2\u0359\u035a\b\"\1\2\u035a\u035b\5@!\2\u035b\u0364\3\2\2\2\u035c"+
		"\u035d\f\4\2\2\u035d\u035e\7U\2\2\u035e\u0363\5@!\2\u035f\u0360\f\3\2"+
		"\2\u0360\u0361\7V\2\2\u0361\u0363\5@!\2\u0362\u035c\3\2\2\2\u0362\u035f"+
		"\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"C\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\b#\1\2\u0368\u0369\5B\"\2\u0369"+
		"\u0373\3\2\2\2\u036a\u036b\f\4\2\2\u036b\u036c\7j\2\2\u036c\u0372\5B\""+
		"\2\u036d\u036e\f\3\2\2\u036e\u036f\5\u0198\u00cd\2\u036f\u0370\5B\"\2"+
		"\u0370\u0372\3\2\2\2\u0371\u036a\3\2\2\2\u0371\u036d\3\2\2\2\u0372\u0375"+
		"\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374E\3\2\2\2\u0375"+
		"\u0373\3\2\2\2\u0376\u0377\b$\1\2\u0377\u0378\5D#\2\u0378\u0387\3\2\2"+
		"\2\u0379\u037a\f\6\2\2\u037a\u037b\7`\2\2\u037b\u0386\5D#\2\u037c\u037d"+
		"\f\5\2\2\u037d\u037e\7a\2\2\u037e\u0386\5D#\2\u037f\u0380\f\4\2\2\u0380"+
		"\u0381\7n\2\2\u0381\u0386\5D#\2\u0382\u0383\f\3\2\2\u0383\u0384\7o\2\2"+
		"\u0384\u0386\5D#\2\u0385\u0379\3\2\2\2\u0385\u037c\3\2\2\2\u0385\u037f"+
		"\3\2\2\2\u0385\u0382\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388G\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b\b%\1\2\u038b"+
		"\u038c\5F$\2\u038c\u0395\3\2\2\2\u038d\u038e\f\4\2\2\u038e\u038f\7l\2"+
		"\2\u038f\u0394\5F$\2\u0390\u0391\f\3\2\2\u0391\u0392\7m\2\2\u0392\u0394"+
		"\5F$\2\u0393\u038d\3\2\2\2\u0393\u0390\3\2\2\2\u0394\u0397\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396I\3\2\2\2\u0397\u0395\3\2\2\2"+
		"\u0398\u0399\b&\1\2\u0399\u039a\5H%\2\u039a\u03a0\3\2\2\2\u039b\u039c"+
		"\f\3\2\2\u039c\u039d\7[\2\2\u039d\u039f\5H%\2\u039e\u039b\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1K\3\2\2\2"+
		"\u03a2\u03a0\3\2\2\2\u03a3\u03a4\b\'\1\2\u03a4\u03a5\5J&\2\u03a5\u03ab"+
		"\3\2\2\2\u03a6\u03a7\f\3\2\2\u03a7\u03a8\7Z\2\2\u03a8\u03aa\5J&\2\u03a9"+
		"\u03a6\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03acM\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\b(\1\2\u03af\u03b0"+
		"\5L\'\2\u03b0\u03b6\3\2\2\2\u03b1\u03b2\f\3\2\2\u03b2\u03b3\7\\\2\2\u03b3"+
		"\u03b5\5L\'\2\u03b4\u03b1\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7O\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba"+
		"\b)\1\2\u03ba\u03bb\5N(\2\u03bb\u03c1\3\2\2\2\u03bc\u03bd\f\3\2\2\u03bd"+
		"\u03be\7p\2\2\u03be\u03c0\5N(\2\u03bf\u03bc\3\2\2\2\u03c0\u03c3\3\2\2"+
		"\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2Q\3\2\2\2\u03c3\u03c1"+
		"\3\2\2\2\u03c4\u03c5\b*\1\2\u03c5\u03c6\5P)\2\u03c6\u03cc\3\2\2\2\u03c7"+
		"\u03c8\f\3\2\2\u03c8\u03c9\7q\2\2\u03c9\u03cb\5P)\2\u03ca\u03c7\3\2\2"+
		"\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cdS"+
		"\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d7\5R*\2\u03d0\u03d1\5R*\2\u03d1"+
		"\u03d2\7w\2\2\u03d2\u03d3\5Z.\2\u03d3\u03d4\7x\2\2\u03d4\u03d5\5V,\2\u03d5"+
		"\u03d7\3\2\2\2\u03d6\u03cf\3\2\2\2\u03d6\u03d0\3\2\2\2\u03d7U\3\2\2\2"+
		"\u03d8\u03df\5T+\2\u03d9\u03da\5R*\2\u03da\u03db\5X-\2\u03db\u03dc\5\u012c"+
		"\u0097\2\u03dc\u03df\3\2\2\2\u03dd\u03df\5\u018e\u00c8\2\u03de\u03d8\3"+
		"\2\2\2\u03de\u03d9\3\2\2\2\u03de\u03dd\3\2\2\2\u03dfW\3\2\2\2\u03e0\u03ec"+
		"\7_\2\2\u03e1\u03ec\7d\2\2\u03e2\u03ec\7e\2\2\u03e3\u03ec\7f\2\2\u03e4"+
		"\u03ec\7b\2\2\u03e5\u03ec\7c\2\2\u03e6\u03ec\5\u019a\u00ce\2\u03e7\u03ec"+
		"\7k\2\2\u03e8\u03ec\7h\2\2\u03e9\u03ec\7g\2\2\u03ea\u03ec\7i\2\2\u03eb"+
		"\u03e0\3\2\2\2\u03eb\u03e1\3\2\2\2\u03eb\u03e2\3\2\2\2\u03eb\u03e3\3\2"+
		"\2\2\u03eb\u03e4\3\2\2\2\u03eb\u03e5\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb"+
		"\u03e7\3\2\2\2\u03eb\u03e8\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2"+
		"\2\2\u03ecY\3\2\2\2\u03ed\u03ee\b.\1\2\u03ee\u03ef\5V,\2\u03ef\u03f5\3"+
		"\2\2\2\u03f0\u03f1\f\3\2\2\u03f1\u03f2\7t\2\2\u03f2\u03f4\5V,\2\u03f3"+
		"\u03f0\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6[\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03f9\5T+\2\u03f9]\3\2\2"+
		"\2\u03fa\u0416\5`\61\2\u03fb\u03fd\5\u00e0q\2\u03fc\u03fb\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0416\5b\62\2\u03ff\u0401\5\u00e0"+
		"q\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0416\5d\63\2\u0403\u0405\5\u00e0q\2\u0404\u0403\3\2\2\2\u0404\u0405"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0416\5h\65\2\u0407\u0409\5\u00e0q"+
		"\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u0416"+
		"\5l\67\2\u040b\u040d\5\u00e0q\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2"+
		"\2\u040d\u040e\3\2\2\2\u040e\u0416\5t;\2\u040f\u0416\5\u0082B\2\u0410"+
		"\u0416\5v<\2\u0411\u0413\5\u00e0q\2\u0412\u0411\3\2\2\2\u0412\u0413\3"+
		"\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\5\u0184\u00c3\2\u0415\u03fa\3\2"+
		"\2\2\u0415\u03fc\3\2\2\2\u0415\u0400\3\2\2\2\u0415\u0404\3\2\2\2\u0415"+
		"\u0408\3\2\2\2\u0415\u040c\3\2\2\2\u0415\u040f\3\2\2\2\u0415\u0410\3\2"+
		"\2\2\u0415\u0412\3\2\2\2\u0416_\3\2\2\2\u0417\u0419\5\u00e0q\2\u0418\u0417"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\7~\2\2\u041b"+
		"\u041c\7x\2\2\u041c\u042c\5^\60\2\u041d\u041f\5\u00e0q\2\u041e\u041d\3"+
		"\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\7\n\2\2\u0421"+
		"\u0422\5\\/\2\u0422\u0423\7x\2\2\u0423\u0424\5^\60\2\u0424\u042c\3\2\2"+
		"\2\u0425\u0427\5\u00e0q\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u0429\7\25\2\2\u0429\u042a\7x\2\2\u042a\u042c\5^"+
		"\60\2\u042b\u0418\3\2\2\2\u042b\u041e\3\2\2\2\u042b\u0426\3\2\2\2\u042c"+
		"a\3\2\2\2\u042d\u042f\5Z.\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0431\7z\2\2\u0431c\3\2\2\2\u0432\u0434\7S\2\2\u0433"+
		"\u0435\5f\64\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2"+
		"\2\2\u0436\u0437\7T\2\2\u0437e\3\2\2\2\u0438\u043c\5^\60\2\u0439\u043b"+
		"\5^\60\2\u043a\u0439\3\2\2\2\u043b\u043e\3\2\2\2\u043c\u043a\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043dg\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0440\7%\2\2\u0440"+
		"\u0441\7O\2\2\u0441\u0442\5j\66\2\u0442\u0443\7P\2\2\u0443\u0444\5^\60"+
		"\2\u0444\u0454\3\2\2\2\u0445\u0446\7%\2\2\u0446\u0447\7O\2\2\u0447\u0448"+
		"\5j\66\2\u0448\u0449\7P\2\2\u0449\u044a\5^\60\2\u044a\u044b\7\32\2\2\u044b"+
		"\u044c\5^\60\2\u044c\u0454\3\2\2\2\u044d\u044e\7=\2\2\u044e\u044f\7O\2"+
		"\2\u044f\u0450\5j\66\2\u0450\u0451\7P\2\2\u0451\u0452\5^\60\2\u0452\u0454"+
		"\3\2\2\2\u0453\u043f\3\2\2\2\u0453\u0445\3\2\2\2\u0453\u044d\3\2\2\2\u0454"+
		"i\3\2\2\2\u0455\u0466\5Z.\2\u0456\u0458\5\u00e0q\2\u0457\u0456\3\2\2\2"+
		"\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\5\u0094K\2\u045a"+
		"\u045b\5\u00fa~\2\u045b\u045c\7_\2\2\u045c\u045d\5\u012c\u0097\2\u045d"+
		"\u0466\3\2\2\2\u045e\u0460\5\u00e0q\2\u045f\u045e\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\5\u0094K\2\u0462\u0463\5\u00fa"+
		"~\2\u0463\u0464\5\u0130\u0099\2\u0464\u0466\3\2\2\2\u0465\u0455\3\2\2"+
		"\2\u0465\u0457\3\2\2\2\u0465\u045f\3\2\2\2\u0466k\3\2\2\2\u0467\u0468"+
		"\7N\2\2\u0468\u0469\7O\2\2\u0469\u046a\5j\66\2\u046a\u046b\7P\2\2\u046b"+
		"\u046c\5^\60\2\u046c\u048b\3\2\2\2\u046d\u046e\7\27\2\2\u046e\u046f\5"+
		"^\60\2\u046f\u0470\7N\2\2\u0470\u0471\7O\2\2\u0471\u0472\5Z.\2\u0472\u0473"+
		"\7P\2\2\u0473\u0474\7z\2\2\u0474\u048b\3\2\2\2\u0475\u0476\7\"\2\2\u0476"+
		"\u0477\7O\2\2\u0477\u0479\5n8\2\u0478\u047a\5j\66\2\u0479\u0478\3\2\2"+
		"\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\7z\2\2\u047c\u047e"+
		"\5Z.\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0480\7P\2\2\u0480\u0481\5^\60\2\u0481\u048b\3\2\2\2\u0482\u0483\7\""+
		"\2\2\u0483\u0484\7O\2\2\u0484\u0485\5p9\2\u0485\u0486\7x\2\2\u0486\u0487"+
		"\5r:\2\u0487\u0488\7P\2\2\u0488\u0489\5^\60\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0467\3\2\2\2\u048a\u046d\3\2\2\2\u048a\u0475\3\2\2\2\u048a\u0482\3\2"+
		"\2\2\u048bm\3\2\2\2\u048c\u048f\5b\62\2\u048d\u048f\5\u008aF\2\u048e\u048c"+
		"\3\2\2\2\u048e\u048d\3\2\2\2\u048fo\3\2\2\2\u0490\u0492\5\u00e0q\2\u0491"+
		"\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\5\u0094"+
		"K\2\u0494\u0495\5\u00fa~\2\u0495q\3\2\2\2\u0496\u0499\5Z.\2\u0497\u0499"+
		"\5\u0130\u0099\2\u0498\u0496\3\2\2\2\u0498\u0497\3\2\2\2\u0499s\3\2\2"+
		"\2\u049a\u049b\7\t\2\2\u049b\u04ab\7z\2\2\u049c\u049d\7\23\2\2\u049d\u04ab"+
		"\7z\2\2\u049e\u04a0\7\65\2\2\u049f\u04a1\5Z.\2\u04a0\u049f\3\2\2\2\u04a0"+
		"\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04ab\7z\2\2\u04a3\u04a4\7\65"+
		"\2\2\u04a4\u04a5\5\u0130\u0099\2\u04a5\u04a6\7z\2\2\u04a6\u04ab\3\2\2"+
		"\2\u04a7\u04a8\7$\2\2\u04a8\u04a9\7~\2\2\u04a9\u04ab\7z\2\2\u04aa\u049a"+
		"\3\2\2\2\u04aa\u049c\3\2\2\2\u04aa\u049e\3\2\2\2\u04aa\u04a3\3\2\2\2\u04aa"+
		"\u04a7\3\2\2\2\u04abu\3\2\2\2\u04ac\u04af\5\u008aF\2\u04ad\u04af\5|?\2"+
		"\u04ae\u04ac\3\2\2\2\u04ae\u04ad\3\2\2\2\u04afw\3\2\2\2\u04b0\u04b1\b"+
		"=\1\2\u04b1\u04b2\5z>\2\u04b2\u04b7\3\2\2\2\u04b3\u04b4\f\3\2\2\u04b4"+
		"\u04b6\5z>\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2"+
		"\2\u04b7\u04b8\3\2\2\2\u04b8y\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04c4"+
		"\5~@\2\u04bb\u04c4\5\u0120\u0091\2\u04bc\u04c4\5\u016c\u00b7\2\u04bd\u04c4"+
		"\5\u0180\u00c1\2\u04be\u04c4\5\u0182\u00c2\2\u04bf\u04c4\5\u00dep\2\u04c0"+
		"\u04c4\5\u00c6d\2\u04c1\u04c4\5\u008eH\2\u04c2\u04c4\5\u0090I\2\u04c3"+
		"\u04ba\3\2\2\2\u04c3\u04bb\3\2\2\2\u04c3\u04bc\3\2\2\2\u04c3\u04bd\3\2"+
		"\2\2\u04c3\u04be\3\2\2\2\u04c3\u04bf\3\2\2\2\u04c3\u04c0\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4{\3\2\2\2\u04c5\u04cd\5\u00dc"+
		"o\2\u04c6\u04cd\5\u00d4k\2\u04c7\u04cd\5\u00d8m\2\u04c8\u04cd\5\u00da"+
		"n\2\u04c9\u04cd\5\u008cG\2\u04ca\u04cd\5\u0080A\2\u04cb\u04cd\5\u00b6"+
		"\\\2\u04cc\u04c5\3\2\2\2\u04cc\u04c6\3\2\2\2\u04cc\u04c7\3\2\2\2\u04cc"+
		"\u04c8\3\2\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cb\3\2"+
		"\2\2\u04cd}\3\2\2\2\u04ce\u04d1\5\u008aF\2\u04cf\u04d1\5|?\2\u04d0\u04ce"+
		"\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\177\3\2\2\2\u04d2\u04d3\7I\2\2\u04d3"+
		"\u04d5\7~\2\2\u04d4\u04d6\5\u00e0q\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3"+
		"\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\7_\2\2\u04d8\u04d9\5\u010e\u0088"+
		"\2\u04d9\u04da\7z\2\2\u04da\u0081\3\2\2\2\u04db\u04dc\5\u0084C\2\u04dc"+
		"\u04dd\7z\2\2\u04dd\u0083\3\2\2\2\u04de\u04e0\5\u00e0q\2\u04df\u04de\3"+
		"\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04e3\5\u0098M\2"+
		"\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e8"+
		"\5\u00a0Q\2\u04e5\u04e7\5\u0104\u0083\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea"+
		"\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea"+
		"\u04e8\3\2\2\2\u04eb\u04ed\5\u0086D\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u0085\3\2\2\2\u04ee\u04ef\bD\1\2\u04ef\u04f0\5\u0088E\2"+
		"\u04f0\u04f6\3\2\2\2\u04f1\u04f2\f\3\2\2\u04f2\u04f3\7t\2\2\u04f3\u04f5"+
		"\5\u0088E\2\u04f4\u04f1\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2"+
		"\2\u04f6\u04f7\3\2\2\2\u04f7\u0087\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fc"+
		"\5\u010c\u0087\2\u04fa\u04fb\7_\2\2\u04fb\u04fd\5\u012c\u0097\2\u04fc"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0089\3\2\2\2\u04fe\u0500\5\u0094"+
		"K\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501"+
		"\u0503\5\u00f6|\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u050d\7z\2\2\u0505\u0507\5\u00e0q\2\u0506\u0508\5\u0094"+
		"K\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050a\5\u00f6|\2\u050a\u050b\7z\2\2\u050b\u050d\3\2\2\2\u050c\u04ff\3"+
		"\2\2\2\u050c\u0505\3\2\2\2\u050d\u008b\3\2\2\2\u050e\u050f\7:\2\2\u050f"+
		"\u0510\7O\2\2\u0510\u0511\5\\/\2\u0511\u0512\7t\2\2\u0512\u0513\7\u0087"+
		"\2\2\u0513\u0514\7P\2\2\u0514\u0515\7z\2\2\u0515\u008d\3\2\2\2\u0516\u0517"+
		"\7z\2\2\u0517\u008f\3\2\2\2\u0518\u0519\5\u00e0q\2\u0519\u051a\7z\2\2"+
		"\u051a\u0091\3\2\2\2\u051b\u051e\5\u0096L\2\u051c\u051e\5\u00a0Q\2\u051d"+
		"\u051b\3\2\2\2\u051d\u051c\3\2\2\2\u051e\u0093\3\2\2\2\u051f\u0521\5\u0092"+
		"J\2\u0520\u0522\5\u00e0q\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0527\3\2\2\2\u0523\u0524\5\u0092J\2\u0524\u0525\5\u0094K\2\u0525\u0527"+
		"\3\2\2\2\u0526\u051f\3\2\2\2\u0526\u0523\3\2\2\2\u0527\u0095\3\2\2\2\u0528"+
		"\u052e\5\u009aN\2\u0529\u052e\5\u009cO\2\u052a\u052e\7#\2\2\u052b\u052e"+
		"\7D\2\2\u052c\u052e\7\21\2\2\u052d\u0528\3\2\2\2\u052d\u0529\3\2\2\2\u052d"+
		"\u052a\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u0097\3\2"+
		"\2\2\u052f\u0531\5\u0096L\2\u0530\u0532\5\u00e0q\2\u0531\u0530\3\2\2\2"+
		"\u0531\u0532\3\2\2\2\u0532\u0537\3\2\2\2\u0533\u0534\5\u0096L\2\u0534"+
		"\u0535\5\u0094K\2\u0535\u0537\3\2\2\2\u0536\u052f\3\2\2\2\u0536\u0533"+
		"\3\2\2\2\u0537\u0099\3\2\2\2\u0538\u0539\t\4\2\2\u0539\u009b\3\2\2\2\u053a"+
		"\u053b\t\5\2\2\u053b\u009d\3\2\2\2\u053c\u053d\7~\2\2\u053d\u009f\3\2"+
		"\2\2\u053e\u0542\5\u00a2R\2\u053f\u0542\5\u0134\u009b\2\u0540\u0542\5"+
		"\u00b2Z\2\u0541\u053e\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0540\3\2\2\2"+
		"\u0542\u00a1\3\2\2\2\u0543\u0548\5\u00a8U\2\u0544\u0548\5\u00aeX\2\u0545"+
		"\u0548\5\u017e\u00c0\2\u0546\u0548\5\u0108\u0085\2\u0547\u0543\3\2\2\2"+
		"\u0547\u0544\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2\2\2\u0548\u00a3"+
		"\3\2\2\2\u0549\u054b\5\u00a0Q\2\u054a\u054c\5\u00e0q\2\u054b\u054a\3\2"+
		"\2\2\u054b\u054c\3\2\2\2\u054c\u0551\3\2\2\2\u054d\u054e\5\u00a0Q\2\u054e"+
		"\u054f\5\u00a4S\2\u054f\u0551\3\2\2\2\u0550\u0549\3\2\2\2\u0550\u054d"+
		"\3\2\2\2\u0551\u00a5\3\2\2\2\u0552\u0554\5\u00a2R\2\u0553\u0555\5\u00e0"+
		"q\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u055a\3\2\2\2\u0556"+
		"\u0557\5\u00a2R\2\u0557\u0558\5\u00a6T\2\u0558\u055a\3\2\2\2\u0559\u0552"+
		"\3\2\2\2\u0559\u0556\3\2\2\2\u055a\u00a7\3\2\2\2\u055b\u055d\5\16\b\2"+
		"\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0573"+
		"\5\u00aaV\2\u055f\u0560\5\16\b\2\u0560\u0561\7>\2\2\u0561\u0562\5\u0174"+
		"\u00bb\2\u0562\u0573\3\2\2\2\u0563\u0573\7\f\2\2\u0564\u0573\7\r\2\2\u0565"+
		"\u0573\7\16\2\2\u0566\u0573\7M\2\2\u0567\u0573\7\b\2\2\u0568\u0573\7\66"+
		"\2\2\u0569\u0573\7\'\2\2\u056a\u0573\7(\2\2\u056b\u0573\7\67\2\2\u056c"+
		"\u0573\7H\2\2\u056d\u0573\7!\2\2\u056e\u0573\7\30\2\2\u056f\u0573\7K\2"+
		"\2\u0570\u0573\7\7\2\2\u0571\u0573\5\u00acW\2\u0572\u055c\3\2\2\2\u0572"+
		"\u055f\3\2\2\2\u0572\u0563\3\2\2\2\u0572\u0564\3\2\2\2\u0572\u0565\3\2"+
		"\2\2\u0572\u0566\3\2\2\2\u0572\u0567\3\2\2\2\u0572\u0568\3\2\2\2\u0572"+
		"\u0569\3\2\2\2\u0572\u056a\3\2\2\2\u0572\u056b\3\2\2\2\u0572\u056c\3\2"+
		"\2\2\u0572\u056d\3\2\2\2\u0572\u056e\3\2\2\2\u0572\u056f\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0572\u0571\3\2\2\2\u0573\u00a9\3\2\2\2\u0574\u0579\5\u0132"+
		"\u009a\2\u0575\u0579\5\u00b0Y\2\u0576\u0579\5\u009eP\2\u0577\u0579\5\u0174"+
		"\u00bb\2\u0578\u0574\3\2\2\2\u0578\u0575\3\2\2\2\u0578\u0576\3\2\2\2\u0578"+
		"\u0577\3\2\2\2\u0579\u00ab\3\2\2\2\u057a\u057b\7\24\2\2\u057b\u057c\7"+
		"O\2\2\u057c\u057d\5Z.\2\u057d\u057e\7P\2\2\u057e\u0584\3\2\2\2\u057f\u0580"+
		"\7\24\2\2\u0580\u0581\7O\2\2\u0581\u0582\7\7\2\2\u0582\u0584\7P\2\2\u0583"+
		"\u057a\3\2\2\2\u0583\u057f\3\2\2\2\u0584\u00ad\3\2\2\2\u0585\u0587\5\u013e"+
		"\u00a0\2\u0586\u0588\5\u00e0q\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2"+
		"\2\u0588\u058a\3\2\2\2\u0589\u058b\5\16\b\2\u058a\u0589\3\2\2\2\u058a"+
		"\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\7~\2\2\u058d\u059e\3\2"+
		"\2\2\u058e\u058f\5\u013e\u00a0\2\u058f\u0590\5\u0174\u00bb\2\u0590\u059e"+
		"\3\2\2\2\u0591\u0592\5\u013e\u00a0\2\u0592\u0594\5\16\b\2\u0593\u0595"+
		"\7>\2\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596"+
		"\u0597\5\u0174\u00bb\2\u0597\u059e\3\2\2\2\u0598\u059a\7\33\2\2\u0599"+
		"\u059b\5\16\b\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\3"+
		"\2\2\2\u059c\u059e\7~\2\2\u059d\u0585\3\2\2\2\u059d\u058e\3\2\2\2\u059d"+
		"\u0591\3\2\2\2\u059d\u0598\3\2\2\2\u059e\u00af\3\2\2\2\u059f\u05a0\7~"+
		"\2\2\u05a0\u00b1\3\2\2\2\u05a1\u05a2\5\u00b4[\2\u05a2\u05a4\7S\2\2\u05a3"+
		"\u05a5\5\u00bc_\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6"+
		"\3\2\2\2\u05a6\u05a7\7T\2\2\u05a7\u05af\3\2\2\2\u05a8\u05a9\5\u00b4[\2"+
		"\u05a9\u05aa\7S\2\2\u05aa\u05ab\5\u00bc_\2\u05ab\u05ac\7t\2\2\u05ac\u05ad"+
		"\7T\2\2\u05ad\u05af\3\2\2\2\u05ae\u05a1\3\2\2\2\u05ae\u05a8\3\2\2\2\u05af"+
		"\u00b3\3\2\2\2\u05b0\u05b2\5\u00b8]\2\u05b1\u05b3\5\u00e0q\2\u05b2\u05b1"+
		"\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b6\7~\2\2\u05b5"+
		"\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b9\5\u00ba"+
		"^\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05c4\3\2\2\2\u05ba"+
		"\u05bc\5\u00b8]\2\u05bb\u05bd\5\u00e0q\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd"+
		"\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\5\16\b\2\u05bf\u05c1\7~\2\2\u05c0"+
		"\u05c2\5\u00ba^\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4"+
		"\3\2\2\2\u05c3\u05b0\3\2\2\2\u05c3\u05ba\3\2\2\2\u05c4\u00b5\3\2\2\2\u05c5"+
		"\u05c7\5\u00b8]\2\u05c6\u05c8\5\u00e0q\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\7~\2\2\u05ca\u05cc\5\u00ba^\2"+
		"\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce"+
		"\7z\2\2\u05ce\u00b7\3\2\2\2\u05cf\u05d5\7\33\2\2\u05d0\u05d1\7\33\2\2"+
		"\u05d1\u05d5\7\17\2\2\u05d2\u05d3\7\33\2\2\u05d3\u05d5\7<\2\2\u05d4\u05cf"+
		"\3\2\2\2\u05d4\u05d0\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5\u00b9\3\2\2\2\u05d6"+
		"\u05d7\7x\2\2\u05d7\u05d8\5\u00a4S\2\u05d8\u00bb\3\2\2\2\u05d9\u05da\b"+
		"_\1\2\u05da\u05db\5\u00be`\2\u05db\u05e1\3\2\2\2\u05dc\u05dd\f\3\2\2\u05dd"+
		"\u05de\7t\2\2\u05de\u05e0\5\u00be`\2\u05df\u05dc\3\2\2\2\u05e0\u05e3\3"+
		"\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u00bd\3\2\2\2\u05e3"+
		"\u05e1\3\2\2\2\u05e4\u05ea\5\u00c0a\2\u05e5\u05e6\5\u00c0a\2\u05e6\u05e7"+
		"\7_\2\2\u05e7\u05e8\5\\/\2\u05e8\u05ea\3\2\2\2\u05e9\u05e4\3\2\2\2\u05e9"+
		"\u05e5\3\2\2\2\u05ea\u00bf\3\2\2\2\u05eb\u05ec\7~\2\2\u05ec\u00c1\3\2"+
		"\2\2\u05ed\u05f0\5\u00c4c\2\u05ee\u05f0\5\u00d2j\2\u05ef\u05ed\3\2\2\2"+
		"\u05ef\u05ee\3\2\2\2\u05f0\u00c3\3\2\2\2\u05f1\u05f2\7~\2\2\u05f2\u00c5"+
		"\3\2\2\2\u05f3\u05f6\5\u00c8e\2\u05f4\u05f6\5\u00ceh\2\u05f5\u05f3\3\2"+
		"\2\2\u05f5\u05f4\3\2\2\2\u05f6\u00c7\3\2\2\2\u05f7\u05fa\5\u00caf\2\u05f8"+
		"\u05fa\5\u00ccg\2\u05f9\u05f7\3\2\2\2\u05f9\u05f8\3\2\2\2\u05fa\u00c9"+
		"\3\2\2\2\u05fb\u05fd\7&\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u05ff\7*\2\2\u05ff\u0600\7~\2\2\u0600\u0601\7S\2"+
		"\2\u0601\u0602\5\u00d0i\2\u0602\u0603\7T\2\2\u0603\u00cb\3\2\2\2\u0604"+
		"\u0606\7&\2\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2"+
		"\2\2\u0607\u0608\7*\2\2\u0608\u0609\5\u00c4c\2\u0609\u060a\7S\2\2\u060a"+
		"\u060b\5\u00d0i\2\u060b\u060c\7T\2\2\u060c\u00cd\3\2\2\2\u060d\u060f\7"+
		"&\2\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0611\7*\2\2\u0611\u0612\7S\2\2\u0612\u0613\5\u00d0i\2\u0613\u0614\7"+
		"T\2\2\u0614\u00cf\3\2\2\2\u0615\u0617\5x=\2\u0616\u0615\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u00d1\3\2\2\2\u0618\u0619\7~\2\2\u0619\u00d3\3\2"+
		"\2\2\u061a\u061b\7*\2\2\u061b\u061c\7~\2\2\u061c\u061d\7_\2\2\u061d\u061e"+
		"\5\u00d6l\2\u061e\u061f\7z\2\2\u061f\u00d5\3\2\2\2\u0620\u0622\5\16\b"+
		"\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624"+
		"\5\u00c2b\2\u0624\u00d7\3\2\2\2\u0625\u0627\7I\2\2\u0626\u0628\7F\2\2"+
		"\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a"+
		"\5\16\b\2\u062a\u062b\5\n\6\2\u062b\u062c\7z\2\2\u062c\u0633\3\2\2\2\u062d"+
		"\u062e\7I\2\2\u062e\u062f\7y\2\2\u062f\u0630\5\n\6\2\u0630\u0631\7z\2"+
		"\2\u0631\u0633\3\2\2\2\u0632\u0625\3\2\2\2\u0632\u062d\3\2\2\2\u0633\u00d9"+
		"\3\2\2\2\u0634\u0636\5\u00e0q\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2"+
		"\2\u0636\u0637\3\2\2\2\u0637\u0638\7I\2\2\u0638\u063a\7*\2\2\u0639\u063b"+
		"\5\16\b\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2\2\2"+
		"\u063c\u063d\5\u00c2b\2\u063d\u063e\7z\2\2\u063e\u00db\3\2\2\2\u063f\u0640"+
		"\7\6\2\2\u0640\u0641\7O\2\2\u0641\u0642\7\u0087\2\2\u0642\u0643\7P\2\2"+
		"\u0643\u0644\7z\2\2\u0644\u00dd\3\2\2\2\u0645\u0646\7\36\2\2\u0646\u0647"+
		"\7\u0087\2\2\u0647\u0649\7S\2\2\u0648\u064a\5x=\2\u0649\u0648\3\2\2\2"+
		"\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u0650\7T\2\2\u064c\u064d"+
		"\7\36\2\2\u064d\u064e\7\u0087\2\2\u064e\u0650\5z>\2\u064f\u0645\3\2\2"+
		"\2\u064f\u064c\3\2\2\2\u0650\u00df\3\2\2\2\u0651\u0652\bq\1\2\u0652\u0653"+
		"\5\u00e2r\2\u0653\u0658\3\2\2\2\u0654\u0655\f\3\2\2\u0655\u0657\5\u00e2"+
		"r\2\u0656\u0654\3\2\2\2\u0657\u065a\3\2\2\2\u0658\u0656\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u00e1\3\2\2\2\u065a\u0658\3\2\2\2\u065b\u065c\7Q"+
		"\2\2\u065c\u065d\7Q\2\2\u065d\u065e\5\u00e6t\2\u065e\u065f\7R\2\2\u065f"+
		"\u0660\7R\2\2\u0660\u0663\3\2\2\2\u0661\u0663\5\u00e4s\2\u0662\u065b\3"+
		"\2\2\2\u0662\u0661\3\2\2\2\u0663\u00e3\3\2\2\2\u0664\u0665\7\4\2\2\u0665"+
		"\u0666\7O\2\2\u0666\u0668\5\u010e\u0088\2\u0667\u0669\7}\2\2\u0668\u0667"+
		"\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066b\7P\2\2\u066b"+
		"\u0675\3\2\2\2\u066c\u066d\7\4\2\2\u066d\u066e\7O\2\2\u066e\u0670\5\\"+
		"/\2\u066f\u0671\7}\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0673\7P\2\2\u0673\u0675\3\2\2\2\u0674\u0664\3\2\2\2\u0674"+
		"\u066c\3\2\2\2\u0675\u00e5\3\2\2\2\u0676\u0678\bt\1\2\u0677\u0679\5\u00e8"+
		"u\2\u0678\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067e\3\2\2\2\u067a"+
		"\u067b\5\u00e8u\2\u067b\u067c\7}\2\2\u067c\u067e\3\2\2\2\u067d\u0676\3"+
		"\2\2\2\u067d\u067a\3\2\2\2\u067e\u068b\3\2\2\2\u067f\u0680\f\5\2\2\u0680"+
		"\u0682\7t\2\2\u0681\u0683\5\u00e8u\2\u0682\u0681\3\2\2\2\u0682\u0683\3"+
		"\2\2\2\u0683\u068a\3\2\2\2\u0684\u0685\f\3\2\2\u0685\u0686\7t\2\2\u0686"+
		"\u0687\5\u00e8u\2\u0687\u0688\7}\2\2\u0688\u068a\3\2\2\2\u0689\u067f\3"+
		"\2\2\2\u0689\u0684\3\2\2\2\u068a\u068d\3\2\2\2\u068b\u0689\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u00e7\3\2\2\2\u068d\u068b\3\2\2\2\u068e\u0690\5\u00ea"+
		"v\2\u068f\u0691\5\u00f0y\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691"+
		"\u00e9\3\2\2\2\u0692\u0695\7~\2\2\u0693\u0695\5\u00ecw\2\u0694\u0692\3"+
		"\2\2\2\u0694\u0693\3\2\2\2\u0695\u00eb\3\2\2\2\u0696\u0697\5\u00eex\2"+
		"\u0697\u0698\7y\2\2\u0698\u0699\7~\2\2\u0699\u00ed\3\2\2\2\u069a\u069b"+
		"\7~\2\2\u069b\u00ef\3\2\2\2\u069c\u069d\7O\2\2\u069d\u069e\5\u00f2z\2"+
		"\u069e\u069f\7P\2\2\u069f\u00f1\3\2\2\2\u06a0\u06a2\bz\1\2\u06a1\u06a3"+
		"\5\u00f4{\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a8\3\2\2"+
		"\2\u06a4\u06a5\f\3\2\2\u06a5\u06a7\5\u00f4{\2\u06a6\u06a4\3\2\2\2\u06a7"+
		"\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u00f3\3\2"+
		"\2\2\u06aa\u06a8\3\2\2\2\u06ab\u06ac\7O\2\2\u06ac\u06ad\5\u00f2z\2\u06ad"+
		"\u06ae\7P\2\2\u06ae\u06b8\3\2\2\2\u06af\u06b0\7Q\2\2\u06b0\u06b1\5\u00f2"+
		"z\2\u06b1\u06b2\7R\2\2\u06b2\u06b8\3\2\2\2\u06b3\u06b4\7S\2\2\u06b4\u06b5"+
		"\5\u00f2z\2\u06b5\u06b6\7T\2\2\u06b6\u06b8\3\2\2\2\u06b7\u06ab\3\2\2\2"+
		"\u06b7\u06af\3\2\2\2\u06b7\u06b3\3\2\2\2\u06b8\u00f5\3\2\2\2\u06b9\u06ba"+
		"\b|\1\2\u06ba\u06bb\5\u00f8}\2\u06bb\u06c1\3\2\2\2\u06bc\u06bd\f\3\2\2"+
		"\u06bd\u06be\7t\2\2\u06be\u06c0\5\u00f8}\2\u06bf\u06bc\3\2\2\2\u06c0\u06c3"+
		"\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u00f7\3\2\2\2\u06c3"+
		"\u06c1\3\2\2\2\u06c4\u06c6\5\u00fa~\2\u06c5\u06c7\5\u0128\u0095\2\u06c6"+
		"\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u00f9\3\2\2\2\u06c8\u06ce\5\u00fc"+
		"\177\2\u06c9\u06ca\5\u00fe\u0080\2\u06ca\u06cb\5\u0100\u0081\2\u06cb\u06cc"+
		"\5\u0102\u0082\2\u06cc\u06ce\3\2\2\2\u06cd\u06c8\3\2\2\2\u06cd\u06c9\3"+
		"\2\2\2\u06ce\u00fb\3\2\2\2\u06cf\u06d1\5\u0104\u0083\2\u06d0\u06cf\3\2"+
		"\2\2\u06d1\u06d4\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3"+
		"\u06d5\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d5\u06d6\5\u00fe\u0080\2\u06d6\u00fd"+
		"\3\2\2\2\u06d7\u06d8\b\u0080\1\2\u06d8\u06da\5\u010c\u0087\2\u06d9\u06db"+
		"\5\u00e0q\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06e1\3\2\2"+
		"\2\u06dc\u06dd\7O\2\2\u06dd\u06de\5\u00fc\177\2\u06de\u06df\7P\2\2\u06df"+
		"\u06e1\3\2\2\2\u06e0\u06d7\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e1\u06ef\3\2"+
		"\2\2\u06e2\u06e3\f\5\2\2\u06e3\u06ee\5\u0100\u0081\2\u06e4\u06e5\f\4\2"+
		"\2\u06e5\u06e7\7Q\2\2\u06e6\u06e8\5\\/\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8"+
		"\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb\7R\2\2\u06ea\u06ec\5\u00e0q\2"+
		"\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06e2"+
		"\3\2\2\2\u06ed\u06e4\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u00ff\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f3\7O"+
		"\2\2\u06f3\u06f4\5\u011a\u008e\2\u06f4\u06f6\7P\2\2\u06f5\u06f7\5\u0106"+
		"\u0084\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9\3\2\2\2\u06f8"+
		"\u06fa\5\u010a\u0086\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fc"+
		"\3\2\2\2\u06fb\u06fd\5\u0190\u00c9\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3"+
		"\2\2\2\u06fd\u06ff\3\2\2\2\u06fe\u0700\5\u00e0q\2\u06ff\u06fe\3\2\2\2"+
		"\u06ff\u0700\3\2\2\2\u0700\u0101\3\2\2\2\u0701\u0702\7v\2\2\u0702\u0704"+
		"\5\u00a6T\2\u0703\u0705\5\u0110\u0089\2\u0704\u0703\3\2\2\2\u0704\u0705"+
		"\3\2\2\2\u0705\u0103\3\2\2\2\u0706\u0708\7W\2\2\u0707\u0709\5\u00e0q\2"+
		"\u0708\u0707\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070b\3\2\2\2\u070a\u070c"+
		"\5\u0106\u0084\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u071e\3"+
		"\2\2\2\u070d\u070f\7[\2\2\u070e\u0710\5\u00e0q\2\u070f\u070e\3\2\2\2\u070f"+
		"\u0710\3\2\2\2\u0710\u071e\3\2\2\2\u0711\u0713\7p\2\2\u0712\u0714\5\u00e0"+
		"q\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u071e\3\2\2\2\u0715"+
		"\u0716\5\16\b\2\u0716\u0718\7W\2\2\u0717\u0719\5\u00e0q\2\u0718\u0717"+
		"\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b\3\2\2\2\u071a\u071c\5\u0106\u0084"+
		"\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u0706"+
		"\3\2\2\2\u071d\u070d\3\2\2\2\u071d\u0711\3\2\2\2\u071d\u0715\3\2\2\2\u071e"+
		"\u0105\3\2\2\2\u071f\u0721\5\u0108\u0085\2\u0720\u0722\5\u0106\u0084\2"+
		"\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0107\3\2\2\2\u0723\u0724"+
		"\t\6\2\2\u0724\u0109\3\2\2\2\u0725\u0726\t\7\2\2\u0726\u010b\3\2\2\2\u0727"+
		"\u0729\7}\2\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3\2"+
		"\2\2\u072a\u072b\5\6\4\2\u072b\u010d\3\2\2\2\u072c\u072e\5\u00a4S\2\u072d"+
		"\u072f\5\u0110\u0089\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u010f"+
		"\3\2\2\2\u0730\u0739\5\u0112\u008a\2\u0731\u0733\5\u0114\u008b\2\u0732"+
		"\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0735\5\u0100"+
		"\u0081\2\u0735\u0736\5\u0102\u0082\2\u0736\u0739\3\2\2\2\u0737\u0739\5"+
		"\u0116\u008c\2\u0738\u0730\3\2\2\2\u0738\u0732\3\2\2\2\u0738\u0737\3\2"+
		"\2\2\u0739\u0111\3\2\2\2\u073a\u0740\5\u0114\u008b\2\u073b\u073d\5\u0104"+
		"\u0083\2\u073c\u073e\5\u0112\u008a\2\u073d\u073c\3\2\2\2\u073d\u073e\3"+
		"\2\2\2\u073e\u0740\3\2\2\2\u073f\u073a\3\2\2\2\u073f\u073b\3\2\2\2\u0740"+
		"\u0113\3\2\2\2\u0741\u0742\b\u008b\1\2\u0742\u0750\5\u0100\u0081\2\u0743"+
		"\u0745\7Q\2\2\u0744\u0746\5\\/\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2"+
		"\2\u0746\u0747\3\2\2\2\u0747\u0749\7R\2\2\u0748\u074a\5\u00e0q\2\u0749"+
		"\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u0750\3\2\2\2\u074b\u074c\7O"+
		"\2\2\u074c\u074d\5\u0112\u008a\2\u074d\u074e\7P\2\2\u074e\u0750\3\2\2"+
		"\2\u074f\u0741\3\2\2\2\u074f\u0743\3\2\2\2\u074f\u074b\3\2\2\2\u0750\u075e"+
		"\3\2\2\2\u0751\u0752\f\7\2\2\u0752\u075d\5\u0100\u0081\2\u0753\u0754\f"+
		"\5\2\2\u0754\u0756\7Q\2\2\u0755\u0757\5\\/\2\u0756\u0755\3\2\2\2\u0756"+
		"\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a\7R\2\2\u0759\u075b\5\u00e0"+
		"q\2\u075a\u0759\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075d\3\2\2\2\u075c"+
		"\u0751\3\2\2\2\u075c\u0753\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2"+
		"\2\2\u075e\u075f\3\2\2\2\u075f\u0115\3\2\2\2\u0760\u075e\3\2\2\2\u0761"+
		"\u0766\5\u0118\u008d\2\u0762\u0763\5\u0104\u0083\2\u0763\u0764\5\u0116"+
		"\u008c\2\u0764\u0766\3\2\2\2\u0765\u0761\3\2\2\2\u0765\u0762\3\2\2\2\u0766"+
		"\u0117\3\2\2\2\u0767\u0768\b\u008d\1\2\u0768\u0769\7}\2\2\u0769\u0777"+
		"\3\2\2\2\u076a\u076b\f\5\2\2\u076b\u0776\5\u0100\u0081\2\u076c\u076d\f"+
		"\4\2\2\u076d\u076f\7Q\2\2\u076e\u0770\5\\/\2\u076f\u076e\3\2\2\2\u076f"+
		"\u0770\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0773\7R\2\2\u0772\u0774\5\u00e0"+
		"q\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0776\3\2\2\2\u0775"+
		"\u076a\3\2\2\2\u0775\u076c\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2"+
		"\2\2\u0777\u0778\3\2\2\2\u0778\u0119\3\2\2\2\u0779\u0777\3\2\2\2\u077a"+
		"\u077c\5\u011c\u008f\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077e"+
		"\3\2\2\2\u077d\u077f\7}\2\2\u077e\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u0785\3\2\2\2\u0780\u0781\5\u011c\u008f\2\u0781\u0782\7t\2\2\u0782\u0783"+
		"\7}\2\2\u0783\u0785\3\2\2\2\u0784\u077b\3\2\2\2\u0784\u0780\3\2\2\2\u0785"+
		"\u011b\3\2\2\2\u0786\u0787\b\u008f\1\2\u0787\u0788\5\u011e\u0090\2\u0788"+
		"\u078e\3\2\2\2\u0789\u078a\f\3\2\2\u078a\u078b\7t\2\2\u078b\u078d\5\u011e"+
		"\u0090\2\u078c\u0789\3\2\2\2\u078d\u0790\3\2\2\2\u078e\u078c\3\2\2\2\u078e"+
		"\u078f\3\2\2\2\u078f\u011d\3\2\2\2\u0790\u078e\3\2\2\2\u0791\u0793\5\u00e0"+
		"q\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\3\2\2\2\u0794"+
		"\u0795\5\u0094K\2\u0795\u0796\5\u00fa~\2\u0796\u07b1\3\2\2\2\u0797\u0799"+
		"\5\u00e0q\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a\3\2\2"+
		"\2\u079a\u079b\5\u0094K\2\u079b\u079c\5\u00fa~\2\u079c\u079d\7_\2\2\u079d"+
		"\u079e\5\u012c\u0097\2\u079e\u07b1\3\2\2\2\u079f\u07a1\5\u00e0q\2\u07a0"+
		"\u079f\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\5\u0094"+
		"K\2\u07a3\u07a5\5\u0110\u0089\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5\3\2\2"+
		"\2\u07a5\u07b1\3\2\2\2\u07a6\u07a8\5\u00e0q\2\u07a7\u07a6\3\2\2\2\u07a7"+
		"\u07a8\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ab\5\u0094K\2\u07aa\u07ac"+
		"\5\u0110\u0089\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ad\3"+
		"\2\2\2\u07ad\u07ae\7_\2\2\u07ae\u07af\5\u012c\u0097\2\u07af\u07b1\3\2"+
		"\2\2\u07b0\u0792\3\2\2\2\u07b0\u0798\3\2\2\2\u07b0\u07a0\3\2\2\2\u07b0"+
		"\u07a7\3\2\2\2\u07b1\u011f\3\2\2\2\u07b2\u07b4\5\u00e0q\2\u07b3\u07b2"+
		"\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\5\u0098M"+
		"\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba"+
		"\5\u0122\u0092\2\u07b9\u07bb\5\u0148\u00a5\2\u07ba\u07b9\3\2\2\2\u07ba"+
		"\u07bb\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bd\5\u0126\u0094\2\u07bd\u0121"+
		"\3\2\2\2\u07be\u07c0\5\u00a0Q\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2"+
		"\2\u07c0\u07c1\3\2\2\2\u07c1\u07c2\5\u0124\u0093\2\u07c2\u0123\3\2\2\2"+
		"\u07c3\u07c4\5\u010c\u0087\2\u07c4\u07c5\7O\2\2\u07c5\u07c6\5\u011a\u008e"+
		"\2\u07c6\u07c7\7P\2\2\u07c7\u0125\3\2\2\2\u07c8\u07ca\5\u0160\u00b1\2"+
		"\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07d4"+
		"\5d\63\2\u07cc\u07d4\5\u0186\u00c4\2\u07cd\u07ce\7_\2\2\u07ce\u07cf\7"+
		"\25\2\2\u07cf\u07d4\7z\2\2\u07d0\u07d1\7_\2\2\u07d1\u07d2\7\26\2\2\u07d2"+
		"\u07d4\7z\2\2\u07d3\u07c9\3\2\2\2\u07d3\u07cc\3\2\2\2\u07d3\u07cd\3\2"+
		"\2\2\u07d3\u07d0\3\2\2\2\u07d4\u0127\3\2\2\2\u07d5\u07db\5\u012a\u0096"+
		"\2\u07d6\u07d7\7O\2\2\u07d7\u07d8\5$\23\2\u07d8\u07d9\7P\2\2\u07d9\u07db"+
		"\3\2\2\2\u07da\u07d5\3\2\2\2\u07da\u07d6\3\2\2\2\u07db\u0129\3\2\2\2\u07dc"+
		"\u07dd\7_\2\2\u07dd\u07e0\5\u012c\u0097\2\u07de\u07e0\5\u0130\u0099\2"+
		"\u07df\u07dc\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u012b\3\2\2\2\u07e1\u07e4"+
		"\5V,\2\u07e2\u07e4\5\u0130\u0099\2\u07e3\u07e1\3\2\2\2\u07e3\u07e2\3\2"+
		"\2\2\u07e4\u012d\3\2\2\2\u07e5\u07e6\b\u0098\1\2\u07e6\u07e8\5\u012c\u0097"+
		"\2\u07e7\u07e9\7}\2\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07f2"+
		"\3\2\2\2\u07ea\u07eb\f\3\2\2\u07eb\u07ec\7t\2\2\u07ec\u07ee\5\u012c\u0097"+
		"\2\u07ed\u07ef\7}\2\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f1"+
		"\3\2\2\2\u07f0\u07ea\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2"+
		"\u07f3\3\2\2\2\u07f3\u012f\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07f6\7S"+
		"\2\2\u07f6\u07f8\5\u012e\u0098\2\u07f7\u07f9\7t\2\2\u07f8\u07f7\3\2\2"+
		"\2\u07f8\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\7T\2\2\u07fb\u07ff"+
		"\3\2\2\2\u07fc\u07fd\7S\2\2\u07fd\u07ff\7T\2\2\u07fe\u07f5\3\2\2\2\u07fe"+
		"\u07fc\3\2\2\2\u07ff\u0131\3\2\2\2\u0800\u0803\7~\2\2\u0801\u0803\5\u0174"+
		"\u00bb\2\u0802\u0800\3\2\2\2\u0802\u0801\3\2\2\2\u0803\u0133\3\2\2\2\u0804"+
		"\u0805\5\u0138\u009d\2\u0805\u0806\5\u0136\u009c\2\u0806\u0135\3\2\2\2"+
		"\u0807\u0809\7S\2\2\u0808\u080a\5\u0140\u00a1\2\u0809\u0808\3\2\2\2\u0809"+
		"\u080a\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\7T\2\2\u080c\u0137\3\2"+
		"\2\2\u080d\u080f\5\u013e\u00a0\2\u080e\u0810\5\u00e0q\2\u080f\u080e\3"+
		"\2\2\2\u080f\u0810\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0813\5\u013a\u009e"+
		"\2\u0812\u0814\5\u013c\u009f\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2"+
		"\u0814\u0816\3\2\2\2\u0815\u0817\5\u014e\u00a8\2\u0816\u0815\3\2\2\2\u0816"+
		"\u0817\3\2\2\2\u0817\u0820\3\2\2\2\u0818\u081a\5\u013e\u00a0\2\u0819\u081b"+
		"\5\u00e0q\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081d\3\2\2"+
		"\2\u081c\u081e\5\u014e\u00a8\2\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2"+
		"\u081e\u0820\3\2\2\2\u081f\u080d\3\2\2\2\u081f\u0818\3\2\2\2\u0820\u0139"+
		"\3\2\2\2\u0821\u0823\5\16\b\2\u0822\u0821\3\2\2\2\u0822\u0823\3\2\2\2"+
		"\u0823\u0824\3\2\2\2\u0824\u0825\5\u0132\u009a\2\u0825\u013b\3\2\2\2\u0826"+
		"\u0827\7 \2\2\u0827\u013d\3\2\2\2\u0828\u0829\t\b\2\2\u0829\u013f\3\2"+
		"\2\2\u082a\u082c\5\u0142\u00a2\2\u082b\u082d\5\u0140\u00a1\2\u082c\u082b"+
		"\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0834\3\2\2\2\u082e\u082f\5\u0158\u00ad"+
		"\2\u082f\u0831\7x\2\2\u0830\u0832\5\u0140\u00a1\2\u0831\u0830\3\2\2\2"+
		"\u0831\u0832\3\2\2\2\u0832\u0834\3\2\2\2\u0833\u082a\3\2\2\2\u0833\u082e"+
		"\3\2\2\2\u0834\u0141\3\2\2\2\u0835\u0837\5\u00e0q\2\u0836\u0835\3\2\2"+
		"\2\u0836\u0837\3\2\2\2\u0837\u0839\3\2\2\2\u0838\u083a\5\u0094K\2\u0839"+
		"\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\3\2\2\2\u083b\u083d\5\u0144"+
		"\u00a3\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083e\3\2\2\2\u083e"+
		"\u0846\7z\2\2\u083f\u0846\5\u0120\u0091\2\u0840\u0846\5\u00d8m\2\u0841"+
		"\u0846\5\u008cG\2\u0842\u0846\5\u016c\u00b7\2\u0843\u0846\5\u0080A\2\u0844"+
		"\u0846\5\u008eH\2\u0845\u0836\3\2\2\2\u0845\u083f\3\2\2\2\u0845\u0840"+
		"\3\2\2\2\u0845\u0841\3\2\2\2\u0845\u0842\3\2\2\2\u0845\u0843\3\2\2\2\u0845"+
		"\u0844\3\2\2\2\u0846\u0143\3\2\2\2\u0847\u0848\b\u00a3\1\2\u0848\u0849"+
		"\5\u0146\u00a4\2\u0849\u084f\3\2\2\2\u084a\u084b\f\3\2\2\u084b\u084c\7"+
		"t\2\2\u084c\u084e\5\u0146\u00a4\2\u084d\u084a\3\2\2\2\u084e\u0851\3\2"+
		"\2\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0145\3\2\2\2\u0851"+
		"\u084f\3\2\2\2\u0852\u0854\5\u00fa~\2\u0853\u0855\5\u0148\u00a5\2\u0854"+
		"\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2\2\2\u0856\u0858\5\u014c"+
		"\u00a7\2\u0857\u0856\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0866\3\2\2\2\u0859"+
		"\u085b\5\u00fa~\2\u085a\u085c\5\u012a\u0096\2\u085b\u085a\3\2\2\2\u085b"+
		"\u085c\3\2\2\2\u085c\u0866\3\2\2\2\u085d\u085f\7~\2\2\u085e\u085d\3\2"+
		"\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u0862\5\u00e0q\2\u0861"+
		"\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\7x"+
		"\2\2\u0864\u0866\5\\/\2\u0865\u0852\3\2\2\2\u0865\u0859\3\2\2\2\u0865"+
		"\u085e\3\2\2\2\u0866\u0147\3\2\2\2\u0867\u0868\b\u00a5\1\2\u0868\u0869"+
		"\5\u014a\u00a6\2\u0869\u086e\3\2\2\2\u086a\u086b\f\3\2\2\u086b\u086d\5"+
		"\u014a\u00a6\2\u086c\u086a\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c\3\2"+
		"\2\2\u086e\u086f\3\2\2\2\u086f\u0149\3\2\2\2\u0870\u086e\3\2\2\2\u0871"+
		"\u0872\t\t\2\2\u0872\u014b\3\2\2\2\u0873\u0874\7_\2\2\u0874\u0875\7\u0081"+
		"\2\2\u0875\u0876\b\u00a7\1\2\u0876\u014d\3\2\2\2\u0877\u0878\7x\2\2\u0878"+
		"\u0879\5\u0150\u00a9\2\u0879\u014f\3\2\2\2\u087a\u087b\b\u00a9\1\2\u087b"+
		"\u087d\5\u0152\u00aa\2\u087c\u087e\7}\2\2\u087d\u087c\3\2\2\2\u087d\u087e"+
		"\3\2\2\2\u087e\u0887\3\2\2\2\u087f\u0880\f\3\2\2\u0880\u0881\7t\2\2\u0881"+
		"\u0883\5\u0152\u00aa\2\u0882\u0884\7}\2\2\u0883\u0882\3\2\2\2\u0883\u0884"+
		"\3\2\2\2\u0884\u0886\3\2\2\2\u0885\u087f\3\2\2\2\u0886\u0889\3\2\2\2\u0887"+
		"\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0151\3\2\2\2\u0889\u0887\3\2"+
		"\2\2\u088a\u088c\5\u00e0q\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c"+
		"\u088d\3\2\2\2\u088d\u08a0\5\u0156\u00ac\2\u088e\u0890\5\u00e0q\2\u088f"+
		"\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893\7J"+
		"\2\2\u0892\u0894\5\u0158\u00ad\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2"+
		"\2\u0894\u0895\3\2\2\2\u0895\u08a0\5\u0156\u00ac\2\u0896\u0898\5\u00e0"+
		"q\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u0899\3\2\2\2\u0899"+
		"\u089b\5\u0158\u00ad\2\u089a\u089c\7J\2\2\u089b\u089a\3\2\2\2\u089b\u089c"+
		"\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089e\5\u0156\u00ac\2\u089e\u08a0\3"+
		"\2\2\2\u089f\u088b\3\2\2\2\u089f\u088f\3\2\2\2\u089f\u0897\3\2\2\2\u08a0"+
		"\u0153\3\2\2\2\u08a1\u08a3\5\16\b\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3"+
		"\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a7\5\u0132\u009a\2\u08a5\u08a7\5\u00ac"+
		"W\2\u08a6\u08a2\3\2\2\2\u08a6\u08a5\3\2\2\2\u08a7\u0155\3\2\2\2\u08a8"+
		"\u08a9\5\u0154\u00ab\2\u08a9\u0157\3\2\2\2\u08aa\u08ab\t\n\2\2\u08ab\u0159"+
		"\3\2\2\2\u08ac\u08ad\7.\2\2\u08ad\u08ae\5\u015c\u00af\2\u08ae\u015b\3"+
		"\2\2\2\u08af\u08b1\5\u00a4S\2\u08b0\u08b2\5\u015e\u00b0\2\u08b1\u08b0"+
		"\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u015d\3\2\2\2\u08b3\u08b5\5\u0104\u0083"+
		"\2\u08b4\u08b6\5\u015e\u00b0\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2"+
		"\u08b6\u015f\3\2\2\2\u08b7\u08b8\7x\2\2\u08b8\u08b9\5\u0162\u00b2\2\u08b9"+
		"\u0161\3\2\2\2\u08ba\u08bc\5\u0164\u00b3\2\u08bb\u08bd\7}\2\2\u08bc\u08bb"+
		"\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08c6\3\2\2\2\u08be\u08c0\5\u0164\u00b3"+
		"\2\u08bf\u08c1\7}\2\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2"+
		"\3\2\2\2\u08c2\u08c3\7t\2\2\u08c3\u08c4\5\u0162\u00b2\2\u08c4\u08c6\3"+
		"\2\2\2\u08c5\u08ba\3\2\2\2\u08c5\u08be\3\2\2\2\u08c6\u0163\3\2\2\2\u08c7"+
		"\u08c8\5\u0166\u00b4\2\u08c8\u08ca\7O\2\2\u08c9\u08cb\5$\23\2\u08ca\u08c9"+
		"\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\7P\2\2\u08cd"+
		"\u08d2\3\2\2\2\u08ce\u08cf\5\u0166\u00b4\2\u08cf\u08d0\5\u0130\u0099\2"+
		"\u08d0\u08d2\3\2\2\2\u08d1\u08c7\3\2\2\2\u08d1\u08ce\3\2\2\2\u08d2\u0165"+
		"\3\2\2\2\u08d3\u08d6\5\u0154\u00ab\2\u08d4\u08d6\7~\2\2\u08d5\u08d3\3"+
		"\2\2\2\u08d5\u08d4\3\2\2\2\u08d6\u0167\3\2\2\2\u08d7\u08d8\7.\2\2\u08d8"+
		"\u08d9\5\u019c\u00cf\2\u08d9\u0169\3\2\2\2\u08da\u08db\7.\2\2\u08db\u08dc"+
		"\7\u0087\2\2\u08dc\u08e0\7~\2\2\u08dd\u08de\7.\2\2\u08de\u08e0\7\u008b"+
		"\2\2\u08df\u08da\3\2\2\2\u08df\u08dd\3\2\2\2\u08e0\u016b\3\2\2\2\u08e1"+
		"\u08e2\7>\2\2\u08e2\u08e3\7`\2\2\u08e3\u08e4\5\u016e\u00b8\2\u08e4\u08e5"+
		"\7a\2\2\u08e5\u08e6\5z>\2\u08e6\u016d\3\2\2\2\u08e7\u08e8\b\u00b8\1\2"+
		"\u08e8\u08e9\5\u0170\u00b9\2\u08e9\u08ef\3\2\2\2\u08ea\u08eb\f\3\2\2\u08eb"+
		"\u08ec\7t\2\2\u08ec\u08ee\5\u0170\u00b9\2\u08ed\u08ea\3\2\2\2\u08ee\u08f1"+
		"\3\2\2\2\u08ef\u08ed\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u016f\3\2\2\2\u08f1"+
		"\u08ef\3\2\2\2\u08f2\u08f5\5\u0172\u00ba\2\u08f3\u08f5\5\u011e\u0090\2"+
		"\u08f4\u08f2\3\2\2\2\u08f4\u08f3\3\2\2\2\u08f5\u0171\3\2\2\2\u08f6\u08f8"+
		"\7\17\2\2\u08f7\u08f9\7}\2\2\u08f8\u08f7\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9"+
		"\u08fb\3\2\2\2\u08fa\u08fc\7~\2\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2"+
		"\2\2\u08fc\u0927\3\2\2\2\u08fd\u08ff\7\17\2\2\u08fe\u0900\7~\2\2\u08ff"+
		"\u08fe\3\2\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\7_"+
		"\2\2\u0902\u0927\5\u010e\u0088\2\u0903\u0905\7F\2\2\u0904\u0906\7}\2\2"+
		"\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0908\3\2\2\2\u0907\u0909"+
		"\7~\2\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0927\3\2\2\2\u090a"+
		"\u090c\7F\2\2\u090b\u090d\7~\2\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2"+
		"\2\u090d\u090e\3\2\2\2\u090e\u090f\7_\2\2\u090f\u0927\5\u010e\u0088\2"+
		"\u0910\u0911\7>\2\2\u0911\u0912\7`\2\2\u0912\u0913\5\u016e\u00b8\2\u0913"+
		"\u0914\7a\2\2\u0914\u0916\7\17\2\2\u0915\u0917\7}\2\2\u0916\u0915\3\2"+
		"\2\2\u0916\u0917\3\2\2\2\u0917\u0919\3\2\2\2\u0918\u091a\7~\2\2\u0919"+
		"\u0918\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u0927\3\2\2\2\u091b\u091c\7>"+
		"\2\2\u091c\u091d\7`\2\2\u091d\u091e\5\u016e\u00b8\2\u091e\u091f\7a\2\2"+
		"\u091f\u0921\7\17\2\2\u0920\u0922\7~\2\2\u0921\u0920\3\2\2\2\u0921\u0922"+
		"\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\7_\2\2\u0924\u0925\5\6\4\2\u0925"+
		"\u0927\3\2\2\2\u0926\u08f6\3\2\2\2\u0926\u08fd\3\2\2\2\u0926\u0903\3\2"+
		"\2\2\u0926\u090a\3\2\2\2\u0926\u0910\3\2\2\2\u0926\u091b\3\2\2\2\u0927"+
		"\u0173\3\2\2\2\u0928\u0929\5\u0178\u00bd\2\u0929\u092b\7`\2\2\u092a\u092c"+
		"\5\u017a\u00be\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d\3"+
		"\2\2\2\u092d\u092e\7a\2\2\u092e\u0175\3\2\2\2\u092f\u093f\5\u0174\u00bb"+
		"\2\u0930\u0931\5\u0168\u00b5\2\u0931\u0933\7`\2\2\u0932\u0934\5\u017a"+
		"\u00be\2\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\3\2\2\2\u0935"+
		"\u0936\7a\2\2\u0936\u093f\3\2\2\2\u0937\u0938\5\u016a\u00b6\2\u0938\u093a"+
		"\7`\2\2\u0939\u093b\5\u017a\u00be\2\u093a\u0939\3\2\2\2\u093a\u093b\3"+
		"\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\7a\2\2\u093d\u093f\3\2\2\2\u093e"+
		"\u092f\3\2\2\2\u093e\u0930\3\2\2\2\u093e\u0937\3\2\2\2\u093f\u0177\3\2"+
		"\2\2\u0940\u0941\7~\2\2\u0941\u0179\3\2\2\2\u0942\u0943\b\u00be\1\2\u0943"+
		"\u0945\5\u017c\u00bf\2\u0944\u0946\7}\2\2\u0945\u0944\3\2\2\2\u0945\u0946"+
		"\3\2\2\2\u0946\u094f\3\2\2\2\u0947\u0948\f\3\2\2\u0948\u0949\7t\2\2\u0949"+
		"\u094b\5\u017c\u00bf\2\u094a\u094c\7}\2\2\u094b\u094a\3\2\2\2\u094b\u094c"+
		"\3\2\2\2\u094c\u094e\3\2\2\2\u094d\u0947\3\2\2\2\u094e\u0951\3\2\2\2\u094f"+
		"\u094d\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u017b\3\2\2\2\u0951\u094f\3\2"+
		"\2\2\u0952\u0956\5\\/\2\u0953\u0956\5\u010e\u0088\2\u0954\u0956\5\6\4"+
		"\2\u0955\u0952\3\2\2\2\u0955\u0953\3\2\2\2\u0955\u0954\3\2\2\2\u0956\u017d"+
		"\3\2\2\2\u0957\u0958\7F\2\2\u0958\u0959\5\16\b\2\u0959\u095a\7~\2\2\u095a"+
		"\u0963\3\2\2\2\u095b\u095c\7F\2\2\u095c\u095e\5\16\b\2\u095d\u095f\7>"+
		"\2\2\u095e\u095d\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0960\3\2\2\2\u0960"+
		"\u0961\5\u0174\u00bb\2\u0961\u0963\3\2\2\2\u0962\u0957\3\2\2\2\u0962\u095b"+
		"\3\2\2\2\u0963\u017f\3\2\2\2\u0964\u0966\7\36\2\2\u0965\u0964\3\2\2\2"+
		"\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7>\2\2\u0968\u0969"+
		"\5z>\2\u0969\u0181\3\2\2\2\u096a\u096b\7>\2\2\u096b\u096c\7`\2\2\u096c"+
		"\u096d\7a\2\2\u096d\u096e\5z>\2\u096e\u0183\3\2\2\2\u096f\u0970\7C\2\2"+
		"\u0970\u0971\5d\63\2\u0971\u0972\5\u0188\u00c5\2\u0972\u0185\3\2\2\2\u0973"+
		"\u0975\7C\2\2\u0974\u0976\5\u0160\u00b1\2\u0975\u0974\3\2\2\2\u0975\u0976"+
		"\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\5d\63\2\u0978\u0979\5\u0188\u00c5"+
		"\2\u0979\u0187\3\2\2\2\u097a\u097c\5\u018a\u00c6\2\u097b\u097d\5\u0188"+
		"\u00c5\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u0189\3\2\2\2\u097e"+
		"\u097f\7\13\2\2\u097f\u0980\7O\2\2\u0980\u0981\5\u018c\u00c7\2\u0981\u0982"+
		"\7P\2\2\u0982\u0983\5d\63\2\u0983\u018b\3\2\2\2\u0984\u0986\5\u00e0q\2"+
		"\u0985\u0984\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988"+
		"\5\u00a4S\2\u0988\u0989\5\u00fa~\2\u0989\u0993\3\2\2\2\u098a\u098c\5\u00e0"+
		"q";
	private static final String _serializedATNSegment1 =
		"\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098f"+
		"\5\u00a4S\2\u098e\u0990\5\u0110\u0089\2\u098f\u098e\3\2\2\2\u098f\u0990"+
		"\3\2\2\2\u0990\u0993\3\2\2\2\u0991\u0993\7}\2\2\u0992\u0985\3\2\2\2\u0992"+
		"\u098b\3\2\2\2\u0992\u0991\3\2\2\2\u0993\u018d\3\2\2\2\u0994\u0996\7A"+
		"\2\2\u0995\u0997\5V,\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u018f"+
		"\3\2\2\2\u0998\u099b\5\u0192\u00ca\2\u0999\u099b\5\u0196\u00cc\2\u099a"+
		"\u0998\3\2\2\2\u099a\u0999\3\2\2\2\u099b\u0191\3\2\2\2\u099c\u099d\7A"+
		"\2\2\u099d\u099f\7O\2\2\u099e\u09a0\5\u0194\u00cb\2\u099f\u099e\3\2\2"+
		"\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\7P\2\2\u09a2\u0193"+
		"\3\2\2\2\u09a3\u09a4\b\u00cb\1\2\u09a4\u09a6\5\u010e\u0088\2\u09a5\u09a7"+
		"\7}\2\2\u09a6\u09a5\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09b0\3\2\2\2\u09a8"+
		"\u09a9\f\3\2\2\u09a9\u09aa\7t\2\2\u09aa\u09ac\5\u010e\u0088\2\u09ab\u09ad"+
		"\7}\2\2\u09ac\u09ab\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09af\3\2\2\2\u09ae"+
		"\u09a8\3\2\2\2\u09af\u09b2\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b0\u09b1\3\2"+
		"\2\2\u09b1\u0195\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b3\u09b4\7,\2\2\u09b4"+
		"\u09b5\7O\2\2\u09b5\u09b6\5\\/\2\u09b6\u09b7\7P\2\2\u09b7\u09ba\3\2\2"+
		"\2\u09b8\u09ba\7,\2\2\u09b9\u09b3\3\2\2\2\u09b9\u09b8\3\2\2\2\u09ba\u0197"+
		"\3\2\2\2\u09bb\u09bc\7a\2\2\u09bc\u09bd\7a\2\2\u09bd\u0199\3\2\2\2\u09be"+
		"\u09bf\7a\2\2\u09bf\u09c0\7a\2\2\u09c0\u09c1\7_\2\2\u09c1\u019b\3\2\2"+
		"\2\u09c2\u09f3\7+\2\2\u09c3\u09f3\7\26\2\2\u09c4\u09c5\7+\2\2\u09c5\u09c6"+
		"\7Q\2\2\u09c6\u09f3\7R\2\2\u09c7\u09c8\7\26\2\2\u09c8\u09c9\7Q\2\2\u09c9"+
		"\u09f3\7R\2\2\u09ca\u09f3\7U\2\2\u09cb\u09f3\7V\2\2\u09cc\u09f3\7W\2\2"+
		"\u09cd\u09f3\7X\2\2\u09ce\u09f3\7Y\2\2\u09cf\u09f3\7Z\2\2\u09d0\u09f3"+
		"\7[\2\2\u09d1\u09f3\7\\\2\2\u09d2\u09f3\7]\2\2\u09d3\u09f3\7^\2\2\u09d4"+
		"\u09f3\7_\2\2\u09d5\u09f3\7`\2\2\u09d6\u09f3\7a\2\2\u09d7\u09f3\7b\2\2"+
		"\u09d8\u09f3\7c\2\2\u09d9\u09f3\7d\2\2\u09da\u09f3\7e\2\2\u09db\u09f3"+
		"\7f\2\2\u09dc\u09f3\7g\2\2\u09dd\u09f3\7h\2\2\u09de\u09f3\7i\2\2\u09df"+
		"\u09f3\7j\2\2\u09e0\u09f3\5\u0198\u00cd\2\u09e1\u09f3\5\u019a\u00ce\2"+
		"\u09e2\u09f3\7k\2\2\u09e3\u09f3\7l\2\2\u09e4\u09f3\7m\2\2\u09e5\u09f3"+
		"\7n\2\2\u09e6\u09f3\7o\2\2\u09e7\u09f3\7p\2\2\u09e8\u09f3\7q\2\2\u09e9"+
		"\u09f3\7r\2\2\u09ea\u09f3\7s\2\2\u09eb\u09f3\7t\2\2\u09ec\u09f3\7u\2\2"+
		"\u09ed\u09f3\7v\2\2\u09ee\u09ef\7O\2\2\u09ef\u09f3\7P\2\2\u09f0\u09f1"+
		"\7Q\2\2\u09f1\u09f3\7R\2\2\u09f2\u09c2\3\2\2\2\u09f2\u09c3\3\2\2\2\u09f2"+
		"\u09c4\3\2\2\2\u09f2\u09c7\3\2\2\2\u09f2\u09ca\3\2\2\2\u09f2\u09cb\3\2"+
		"\2\2\u09f2\u09cc\3\2\2\2\u09f2\u09cd\3\2\2\2\u09f2\u09ce\3\2\2\2\u09f2"+
		"\u09cf\3\2\2\2\u09f2\u09d0\3\2\2\2\u09f2\u09d1\3\2\2\2\u09f2\u09d2\3\2"+
		"\2\2\u09f2\u09d3\3\2\2\2\u09f2\u09d4\3\2\2\2\u09f2\u09d5\3\2\2\2\u09f2"+
		"\u09d6\3\2\2\2\u09f2\u09d7\3\2\2\2\u09f2\u09d8\3\2\2\2\u09f2\u09d9\3\2"+
		"\2\2\u09f2\u09da\3\2\2\2\u09f2\u09db\3\2\2\2\u09f2\u09dc\3\2\2\2\u09f2"+
		"\u09dd\3\2\2\2\u09f2\u09de\3\2\2\2\u09f2\u09df\3\2\2\2\u09f2\u09e0\3\2"+
		"\2\2\u09f2\u09e1\3\2\2\2\u09f2\u09e2\3\2\2\2\u09f2\u09e3\3\2\2\2\u09f2"+
		"\u09e4\3\2\2\2\u09f2\u09e5\3\2\2\2\u09f2\u09e6\3\2\2\2\u09f2\u09e7\3\2"+
		"\2\2\u09f2\u09e8\3\2\2\2\u09f2\u09e9\3\2\2\2\u09f2\u09ea\3\2\2\2\u09f2"+
		"\u09eb\3\2\2\2\u09f2\u09ec\3\2\2\2\u09f2\u09ed\3\2\2\2\u09f2\u09ee\3\2"+
		"\2\2\u09f2\u09f0\3\2\2\2\u09f3\u019d\3\2\2\2\u09f4\u09fc\5\u01a0\u00d1"+
		"\2\u09f5\u09fc\7\u0085\2\2\u09f6\u09fc\5\u01a2\u00d2\2\u09f7\u09fc\5\u01a4"+
		"\u00d3\2\u09f8\u09fc\5\u01a6\u00d4\2\u09f9\u09fc\5\u01a8\u00d5\2\u09fa"+
		"\u09fc\5\u01aa\u00d6\2\u09fb\u09f4\3\2\2\2\u09fb\u09f5\3\2\2\2\u09fb\u09f6"+
		"\3\2\2\2\u09fb\u09f7\3\2\2\2\u09fb\u09f8\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb"+
		"\u09fa\3\2\2\2\u09fc\u019f\3\2\2\2\u09fd\u09fe\7\177\2\2\u09fe\u01a1\3"+
		"\2\2\2\u09ff\u0a00\7\u0086\2\2\u0a00\u01a3\3\2\2\2\u0a01\u0a02\7\u0087"+
		"\2\2\u0a02\u01a5\3\2\2\2\u0a03\u0a04\7\u0088\2\2\u0a04\u01a7\3\2\2\2\u0a05"+
		"\u0a06\7-\2\2\u0a06\u01a9\3\2\2\2\u0a07\u0a08\t\13\2\2\u0a08\u01ab\3\2"+
		"\2\2\u014a\u01ad\u01b7\u01bb\u01bf\u01ca\u01ce\u01dd\u01e4\u01e9\u01eb"+
		"\u01f0\u01f6\u0200\u0207\u020d\u0211\u0216\u021c\u0223\u0229\u022c\u022f"+
		"\u0232\u0239\u0240\u0274\u0283\u0289\u028f\u029c\u029e\u02a4\u02b3\u02b9"+
		"\u02d7\u02dc\u02e0\u02e4\u02e7\u02eb\u02f1\u02f3\u02fb\u02ff\u0302\u0309"+
		"\u0310\u0314\u0319\u031d\u0320\u0325\u032b\u0338\u0343\u0345\u0354\u0356"+
		"\u0362\u0364\u0371\u0373\u0385\u0387\u0393\u0395\u03a0\u03ab\u03b6\u03c1"+
		"\u03cc\u03d6\u03de\u03eb\u03f5\u03fc\u0400\u0404\u0408\u040c\u0412\u0415"+
		"\u0418\u041e\u0426\u042b\u042e\u0434\u043c\u0453\u0457\u045f\u0465\u0479"+
		"\u047d\u048a\u048e\u0491\u0498\u04a0\u04aa\u04ae\u04b7\u04c3\u04cc\u04d0"+
		"\u04d5\u04df\u04e2\u04e8\u04ec\u04f6\u04fc\u04ff\u0502\u0507\u050c\u051d"+
		"\u0521\u0526\u052d\u0531\u0536\u0541\u0547\u054b\u0550\u0554\u0559\u055c"+
		"\u0572\u0578\u0583\u0587\u058a\u0594\u059a\u059d\u05a4\u05ae\u05b2\u05b5"+
		"\u05b8\u05bc\u05c1\u05c3\u05c7\u05cb\u05d4\u05e1\u05e9\u05ef\u05f5\u05f9"+
		"\u05fc\u0605\u060e\u0616\u0621\u0627\u0632\u0635\u063a\u0649\u064f\u0658"+
		"\u0662\u0668\u0670\u0674\u0678\u067d\u0682\u0689\u068b\u0690\u0694\u06a2"+
		"\u06a8\u06b7\u06c1\u06c6\u06cd\u06d2\u06da\u06e0\u06e7\u06eb\u06ed\u06ef"+
		"\u06f6\u06f9\u06fc\u06ff\u0704\u0708\u070b\u070f\u0713\u0718\u071b\u071d"+
		"\u0721\u0728\u072e\u0732\u0738\u073d\u073f\u0745\u0749\u074f\u0756\u075a"+
		"\u075c\u075e\u0765\u076f\u0773\u0775\u0777\u077b\u077e\u0784\u078e\u0792"+
		"\u0798\u07a0\u07a4\u07a7\u07ab\u07b0\u07b3\u07b6\u07ba\u07bf\u07c9\u07d3"+
		"\u07da\u07df\u07e3\u07e8\u07ee\u07f2\u07f8\u07fe\u0802\u0809\u080f\u0813"+
		"\u0816\u081a\u081d\u081f\u0822\u082c\u0831\u0833\u0836\u0839\u083c\u0845"+
		"\u084f\u0854\u0857\u085b\u085e\u0861\u0865\u086e\u087d\u0883\u0887\u088b"+
		"\u088f\u0893\u0897\u089b\u089f\u08a2\u08a6\u08b1\u08b5\u08bc\u08c0\u08c5"+
		"\u08ca\u08d1\u08d5\u08df\u08ef\u08f4\u08f8\u08fb\u08ff\u0905\u0908\u090c"+
		"\u0916\u0919\u0921\u0926\u092b\u0933\u093a\u093e\u0945\u094b\u094f\u0955"+
		"\u095e\u0962\u0965\u0975\u097c\u0985\u098b\u098f\u0992\u0996\u099a\u099f"+
		"\u09a6\u09ac\u09b0\u09b9\u09f2\u09fb";
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
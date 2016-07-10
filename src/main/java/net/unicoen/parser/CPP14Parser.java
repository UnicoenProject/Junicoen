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
		RULE_postbinexpression = 19, RULE_binaryexpression = 20, RULE_unaryexpression = 21, 
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
		RULE_statementseq = 52, RULE_selectionstatement = 53, RULE_condition = 54, 
		RULE_iterationstatement = 55, RULE_forinitstatement = 56, RULE_forrangedeclaration = 57, 
		RULE_forrangeinitializer = 58, RULE_jumpstatement = 59, RULE_declarationstatement = 60, 
		RULE_declarationseq = 61, RULE_declaration = 62, RULE_blockdeclarationwithoutsimpledeclaration = 63, 
		RULE_blockdeclaration = 64, RULE_aliasdeclaration = 65, RULE_variabledeclarationstatement = 66, 
		RULE_variabledeclaration = 67, RULE_variableDeclaratorList = 68, RULE_arrayDeclarator = 69, 
		RULE_arrayCreationExpression = 70, RULE_dimExprs = 71, RULE_dimExpr = 72, 
		RULE_variableDeclarator = 73, RULE_dims = 74, RULE_simpledeclaration = 75, 
		RULE_static_assertdeclaration = 76, RULE_emptydeclaration = 77, RULE_attributedeclaration = 78, 
		RULE_declspecifier = 79, RULE_declspecifierseq = 80, RULE_declspecifierwithouttype = 81, 
		RULE_declspecifierseqwithouttype = 82, RULE_storageclassspecifier = 83, 
		RULE_functionspecifier = 84, RULE_typedefname = 85, RULE_typespecifier = 86, 
		RULE_trailingtypespecifier = 87, RULE_typespecifierseq = 88, RULE_trailingtypespecifierseq = 89, 
		RULE_simpletypespecifier = 90, RULE_typename = 91, RULE_decltypespecifier = 92, 
		RULE_elaboratedtypespecifier = 93, RULE_enumname = 94, RULE_enumspecifier = 95, 
		RULE_enumhead = 96, RULE_opaqueenumdeclaration = 97, RULE_enumkey = 98, 
		RULE_enumbase = 99, RULE_enumeratorlist = 100, RULE_enumeratordefinition = 101, 
		RULE_enumerator = 102, RULE_namespacename = 103, RULE_originalnamespacename = 104, 
		RULE_namespacedefinition = 105, RULE_namednamespacedefinition = 106, RULE_originalnamespacedefinition = 107, 
		RULE_extensionnamespacedefinition = 108, RULE_unnamednamespacedefinition = 109, 
		RULE_namespacebody = 110, RULE_namespacealias = 111, RULE_namespacealiasdefinition = 112, 
		RULE_qualifiednamespacespecifier = 113, RULE_usingdeclaration = 114, RULE_usingdirective = 115, 
		RULE_asmdefinition = 116, RULE_linkagespecification = 117, RULE_attributespecifierseq = 118, 
		RULE_attributespecifier = 119, RULE_alignmentspecifier = 120, RULE_attributelist = 121, 
		RULE_attribute = 122, RULE_attributetoken = 123, RULE_attributescopedtoken = 124, 
		RULE_attributenamespace = 125, RULE_attributeargumentclause = 126, RULE_balancedtokenseq = 127, 
		RULE_balancedtoken = 128, RULE_initdeclaratorlist = 129, RULE_initdeclarator = 130, 
		RULE_declarator = 131, RULE_ptrdeclarator = 132, RULE_noptrdeclarator = 133, 
		RULE_parametersandqualifiers = 134, RULE_trailingreturntype = 135, RULE_ptroperator = 136, 
		RULE_cvqualifierseq = 137, RULE_cvqualifier = 138, RULE_refqualifier = 139, 
		RULE_declaratorid = 140, RULE_typeid = 141, RULE_abstractdeclarator = 142, 
		RULE_ptrabstractdeclarator = 143, RULE_noptrabstractdeclarator = 144, 
		RULE_abstractpackdeclarator = 145, RULE_noptrabstractpackdeclarator = 146, 
		RULE_parameterdeclarationclause = 147, RULE_parameterdeclarationlist = 148, 
		RULE_parameterdeclaration = 149, RULE_functiondefinition = 150, RULE_functionheader = 151, 
		RULE_functiondeclarator = 152, RULE_functionbody = 153, RULE_initializer = 154, 
		RULE_braceorequalinitializer = 155, RULE_initializerclause = 156, RULE_initializerlist = 157, 
		RULE_bracedinitlist = 158, RULE_classname = 159, RULE_classspecifier = 160, 
		RULE_classbody = 161, RULE_classhead = 162, RULE_classheadname = 163, 
		RULE_classvirtspecifier = 164, RULE_classkey = 165, RULE_memberspecification = 166, 
		RULE_memberdeclaration = 167, RULE_memberdeclaratorlist = 168, RULE_memberdeclarator = 169, 
		RULE_virtspecifierseq = 170, RULE_virtspecifier = 171, RULE_purespecifier = 172, 
		RULE_baseclause = 173, RULE_basespecifierlist = 174, RULE_basespecifier = 175, 
		RULE_classordecltype = 176, RULE_basetypespecifier = 177, RULE_accessspecifier = 178, 
		RULE_conversionfunctionid = 179, RULE_conversiontypeid = 180, RULE_conversiondeclarator = 181, 
		RULE_ctorinitializer = 182, RULE_meminitializerlist = 183, RULE_meminitializer = 184, 
		RULE_meminitializerid = 185, RULE_operatorfunctionid = 186, RULE_literaloperatorid = 187, 
		RULE_templatedeclaration = 188, RULE_templateparameterlist = 189, RULE_templateparameter = 190, 
		RULE_typeparameter = 191, RULE_simpletemplateid = 192, RULE_templateid = 193, 
		RULE_templatename = 194, RULE_templateargumentlist = 195, RULE_templateargument = 196, 
		RULE_typenamespecifier = 197, RULE_explicitinstantiation = 198, RULE_explicitspecialization = 199, 
		RULE_tryblock = 200, RULE_functiontryblock = 201, RULE_handlerseq = 202, 
		RULE_handler = 203, RULE_exceptiondeclaration = 204, RULE_throwexpression = 205, 
		RULE_exceptionspecification = 206, RULE_dynamicexceptionspecification = 207, 
		RULE_typeidlist = 208, RULE_noexceptspecification = 209, RULE_rightShift = 210, 
		RULE_rightShiftAssign = 211, RULE_operator = 212, RULE_literal = 213, 
		RULE_integerliteral = 214, RULE_floatingliteral = 215, RULE_stringliteral = 216, 
		RULE_booleanliteral = 217, RULE_pointerliteral = 218, RULE_userdefinedliteral = 219;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "identexpression", 
		"unqualifiedid", "qualifiedid", "nestednamespecifier", "lambdaexpression", 
		"lambdaintroducer", "lambdacapture", "capturedefault", "capturelist", 
		"capture", "simplecapture", "initcapture", "lambdadeclarator", "postfixexpression", 
		"expressionlist", "pseudodestructorname", "postbinexpression", "binaryexpression", 
		"unaryexpression", "unaryoperator", "newexpression", "newplacement", "newtypeid", 
		"newdeclarator", "noptrnewdeclarator", "newinitializer", "deleteexpression", 
		"noexceptexpression", "castexpression", "pmexpression", "multiplicativeexpression", 
		"additiveexpression", "shiftexpression", "relationalexpression", "equalityexpression", 
		"andexpression", "exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
		"logicalorexpression", "conditionalexpression", "assignmentexpression", 
		"assignmentoperator", "expression", "constantexpression", "statement", 
		"labeledstatement", "expressionstatement", "compoundstatement", "statementseq", 
		"selectionstatement", "condition", "iterationstatement", "forinitstatement", 
		"forrangedeclaration", "forrangeinitializer", "jumpstatement", "declarationstatement", 
		"declarationseq", "declaration", "blockdeclarationwithoutsimpledeclaration", 
		"blockdeclaration", "aliasdeclaration", "variabledeclarationstatement", 
		"variabledeclaration", "variableDeclaratorList", "arrayDeclarator", "arrayCreationExpression", 
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
			setState(441);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(440);
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
			setState(451);
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
				setState(443);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(LeftParen);
				setState(446);
				expression(0);
				setState(447);
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
				setState(449);
				identexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
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
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
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
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
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
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				match(Tilde);
				setState(466);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				match(Tilde);
				setState(468);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
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
			setState(472);
			nestednamespecifier(0);
			setState(474);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(473);
				match(Template);
				}
			}

			setState(476);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(479);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(480);
				typename();
				setState(481);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(483);
				namespacename();
				setState(484);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(486);
				decltypespecifier();
				setState(487);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(491);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(492);
						match(Identifier);
						setState(493);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(494);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(496);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(495);
							match(Template);
							}
						}

						setState(498);
						simpletemplateid();
						setState(499);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(505);
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
			setState(506);
			lambdaintroducer();
			setState(508);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(507);
				lambdadeclarator();
				}
			}

			setState(510);
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
			setState(512);
			match(LeftBracket);
			setState(514);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(513);
				lambdacapture();
				}
			}

			setState(516);
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
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				capturedefault();
				setState(521);
				match(Comma);
				setState(522);
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
			setState(526);
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
			setState(529);
			capture();
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(530);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
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
					setState(533);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(534);
					match(Comma);
					setState(535);
					capture();
					setState(537);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(536);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(543);
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
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
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
			setState(552);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(And);
				setState(550);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
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
			setState(559);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(Identifier);
				setState(555);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(And);
				setState(557);
				match(Identifier);
				setState(558);
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
			setState(561);
			match(LeftParen);
			setState(562);
			parameterdeclarationclause();
			setState(563);
			match(RightParen);
			setState(565);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(564);
				match(Mutable);
				}
			}

			setState(568);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(567);
				exceptionspecification();
				}
			}

			setState(571);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(570);
				attributespecifierseq(0);
				}
			}

			setState(574);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(573);
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
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
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
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(577);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(578);
				simpletypespecifier();
				setState(579);
				match(LeftParen);
				setState(581);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(580);
					expressionlist();
					}
				}

				setState(583);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(585);
				typenamespecifier();
				setState(586);
				match(LeftParen);
				setState(588);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(587);
					expressionlist();
					}
				}

				setState(590);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(592);
				match(Dynamic_cast);
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
			case 5:
				{
				setState(600);
				match(Static_cast);
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
			case 6:
				{
				setState(608);
				match(Reinterpret_cast);
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
			case 7:
				{
				setState(616);
				match(Const_cast);
				setState(617);
				match(Less);
				setState(618);
				typeid();
				setState(619);
				match(Greater);
				setState(620);
				match(LeftParen);
				setState(621);
				expression(0);
				setState(622);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(624);
				match(Typeid);
				setState(625);
				match(LeftParen);
				setState(626);
				expression(0);
				setState(627);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(629);
				match(Typeid);
				setState(630);
				match(LeftParen);
				setState(631);
				typeid();
				setState(632);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(634);
				simpletypespecifier();
				setState(635);
				bracedinitlist();
				}
				break;
			case 11:
				{
				setState(637);
				typenamespecifier();
				setState(638);
				bracedinitlist();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(642);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(643);
						match(LeftBracket);
						setState(644);
						bracedinitlist();
						setState(645);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(647);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(648);
						match(LeftParen);
						setState(650);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(649);
							expressionlist();
							}
						}

						setState(652);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(653);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(654);
						match(Dot);
						setState(656);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(655);
							match(Template);
							}
						}

						setState(658);
						idexpression();
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(659);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(660);
						match(Arrow);
						setState(662);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(661);
							match(Template);
							}
						}

						setState(664);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(665);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(666);
						match(Dot);
						setState(667);
						pseudodestructorname();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(668);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(669);
						match(Arrow);
						setState(670);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(671);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(672);
						match(PlusPlus);
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(673);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(674);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(679);
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
			setState(680);
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
		enterRule(_localctx, 36, RULE_pseudodestructorname);
		int _la;
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(682);
					nestednamespecifier(0);
					}
					break;
				}
				setState(685);
				typename();
				setState(686);
				match(Doublecolon);
				setState(687);
				match(Tilde);
				setState(688);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				nestednamespecifier(0);
				setState(691);
				match(Template);
				setState(692);
				simpletemplateid();
				setState(693);
				match(Doublecolon);
				setState(694);
				match(Tilde);
				setState(695);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(697);
					nestednamespecifier(0);
					}
				}

				setState(700);
				match(Tilde);
				setState(701);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				match(Tilde);
				setState(703);
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

	public static class PostbinexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public PostbinexpressionContext postbinexpression() {
			return getRuleContext(PostbinexpressionContext.class,0);
		}
		public PostbinexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postbinexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPostbinexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostbinexpressionContext postbinexpression() throws RecognitionException {
		return postbinexpression(0);
	}

	private PostbinexpressionContext postbinexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostbinexpressionContext _localctx = new PostbinexpressionContext(_ctx, _parentState);
		PostbinexpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_postbinexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707);
			postfixexpression(0);
			setState(708);
			match(LeftBracket);
			setState(709);
			assignmentexpression();
			setState(710);
			match(RightBracket);
			}
			_ctx.stop = _input.LT(-1);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostbinexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postbinexpression);
					setState(712);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(713);
					match(LeftBracket);
					setState(714);
					assignmentexpression();
					setState(715);
					match(RightBracket);
					}
					} 
				}
				setState(721);
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

	public static class BinaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public PostbinexpressionContext postbinexpression() {
			return getRuleContext(PostbinexpressionContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
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
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				unaryexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				postbinexpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				match(Sizeof);
				setState(726);
				match(LeftParen);
				setState(727);
				typeid();
				setState(728);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				match(Sizeof);
				setState(731);
				match(Ellipsis);
				setState(732);
				match(LeftParen);
				setState(733);
				match(Identifier);
				setState(734);
				match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				match(Alignof);
				setState(736);
				match(LeftParen);
				setState(737);
				typeid();
				setState(738);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(740);
				noexceptexpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(741);
				newexpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(742);
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
			setState(754);
			switch (_input.LA(1)) {
			case PlusPlus:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(PlusPlus);
				setState(746);
				castexpression();
				}
				break;
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				match(MinusMinus);
				setState(748);
				castexpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				unaryoperator();
				setState(750);
				castexpression();
				}
				break;
			case Sizeof:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
				match(Sizeof);
				setState(753);
				binaryexpression();
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
			setState(756);
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
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(758);
					match(Doublecolon);
					}
				}

				setState(761);
				match(New);
				setState(763);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(762);
					newplacement();
					}
				}

				setState(765);
				newtypeid();
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(766);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(769);
					match(Doublecolon);
					}
				}

				setState(772);
				match(New);
				setState(774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(773);
					newplacement();
					}
					break;
				}
				setState(776);
				match(LeftParen);
				setState(777);
				typeid();
				setState(778);
				match(RightParen);
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(779);
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
			setState(784);
			match(LeftParen);
			setState(785);
			expressionlist();
			setState(786);
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
			setState(788);
			typespecifierseq();
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(789);
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
			setState(797);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				ptroperator();
				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(793);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
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
			setState(800);
			match(LeftBracket);
			setState(801);
			expression(0);
			setState(802);
			match(RightBracket);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(803);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(806);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(807);
					match(LeftBracket);
					setState(808);
					constantexpression();
					setState(809);
					match(RightBracket);
					setState(811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(810);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(824);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(LeftParen);
				setState(820);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(819);
					expressionlist();
					}
				}

				setState(822);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
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
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(826);
					match(Doublecolon);
					}
				}

				setState(829);
				match(Delete);
				setState(830);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(831);
					match(Doublecolon);
					}
				}

				setState(834);
				match(Delete);
				setState(835);
				match(LeftBracket);
				setState(836);
				match(RightBracket);
				setState(837);
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
			setState(840);
			match(Noexcept);
			setState(841);
			match(LeftParen);
			setState(842);
			expression(0);
			setState(843);
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
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				binaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(LeftParen);
				setState(847);
				typeid();
				setState(848);
				match(RightParen);
				setState(849);
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
			setState(854);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(856);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(857);
						match(DotStar);
						setState(858);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(859);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(860);
						match(ArrowStar);
						setState(861);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(866);
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
			setState(868);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(879);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(870);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(871);
						match(Star);
						setState(872);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(873);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(874);
						match(Div);
						setState(875);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(876);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(877);
						match(Mod);
						setState(878);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(883);
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
			setState(885);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(887);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(888);
						match(Plus);
						setState(889);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(890);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(891);
						match(Minus);
						setState(892);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(897);
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
			setState(899);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(908);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(901);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(902);
						match(LeftShift);
						setState(903);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(904);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(905);
						rightShift();
						setState(906);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(912);
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
			setState(914);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(928);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(916);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(917);
						match(Less);
						setState(918);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(919);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(920);
						match(Greater);
						setState(921);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(922);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(923);
						match(LessEqual);
						setState(924);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(925);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(926);
						match(GreaterEqual);
						setState(927);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(932);
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
			setState(934);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(936);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(937);
						match(Equal);
						setState(938);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(939);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(940);
						match(NotEqual);
						setState(941);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(946);
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
			setState(948);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(950);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(951);
					match(And);
					setState(952);
					equalityexpression(0);
					}
					} 
				}
				setState(957);
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
			setState(959);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(961);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(962);
					match(Caret);
					setState(963);
					andexpression(0);
					}
					} 
				}
				setState(968);
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
			setState(970);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(972);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(973);
					match(Or);
					setState(974);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(979);
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
			setState(981);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(983);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(984);
					match(AndAnd);
					setState(985);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(990);
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
			setState(992);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(994);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(995);
					match(OrOr);
					setState(996);
					logicalandexpression(0);
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				logicalorexpression(0);
				setState(1004);
				match(Question);
				setState(1005);
				expression(0);
				setState(1006);
				match(Colon);
				setState(1007);
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
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				logicalorexpression(0);
				setState(1013);
				assignmentoperator();
				setState(1014);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1016);
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
			setState(1030);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1021);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(1022);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(1023);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(1024);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(1025);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(1026);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(1027);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(1028);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(1029);
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
			setState(1033);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1036);
					match(Comma);
					setState(1037);
					assignmentexpression();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
			setState(1043);
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
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1046);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1049);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1050);
					attributespecifierseq(0);
					}
				}

				setState(1053);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1054);
					attributespecifierseq(0);
					}
				}

				setState(1057);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1059);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1058);
					attributespecifierseq(0);
					}
				}

				setState(1061);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1063);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1062);
					attributespecifierseq(0);
					}
				}

				setState(1065);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1066);
				variabledeclarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1067);
				declarationstatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
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
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1074);
					attributespecifierseq(0);
					}
				}

				setState(1077);
				match(Identifier);
				setState(1078);
				match(Colon);
				setState(1079);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(Case);
				setState(1084);
				constantexpression();
				setState(1085);
				match(Colon);
				setState(1086);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(Default);
				setState(1092);
				match(Colon);
				setState(1093);
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
			setState(1097);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1096);
				expression(0);
				}
			}

			setState(1099);
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
			setState(1101);
			match(LeftBrace);
			setState(1103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1102);
				statementseq();
				}
			}

			setState(1105);
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
			setState(1107);
			statement();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Try - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (While - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (AndAnd - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Semi - 65)) | (1L << (Ellipsis - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				{
				setState(1108);
				statement();
				}
				}
				setState(1113);
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
		enterRule(_localctx, 106, RULE_selectionstatement);
		try {
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				match(If);
				setState(1115);
				match(LeftParen);
				setState(1116);
				condition();
				setState(1117);
				match(RightParen);
				setState(1118);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(If);
				setState(1121);
				match(LeftParen);
				setState(1122);
				condition();
				setState(1123);
				match(RightParen);
				setState(1124);
				statement();
				setState(1125);
				match(Else);
				setState(1126);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				match(Switch);
				setState(1129);
				match(LeftParen);
				setState(1130);
				condition();
				setState(1131);
				match(RightParen);
				setState(1132);
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
		enterRule(_localctx, 108, RULE_condition);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1137);
					attributespecifierseq(0);
					}
				}

				setState(1140);
				declspecifierseq();
				setState(1141);
				declarator();
				setState(1142);
				match(Assign);
				setState(1143);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1145);
					attributespecifierseq(0);
					}
				}

				setState(1148);
				declspecifierseq();
				setState(1149);
				declarator();
				setState(1150);
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
		enterRule(_localctx, 110, RULE_iterationstatement);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				match(While);
				setState(1155);
				match(LeftParen);
				setState(1156);
				condition();
				setState(1157);
				match(RightParen);
				setState(1158);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				match(Do);
				setState(1161);
				statement();
				setState(1162);
				match(While);
				setState(1163);
				match(LeftParen);
				setState(1164);
				expression(0);
				setState(1165);
				match(RightParen);
				setState(1166);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1168);
				match(For);
				setState(1169);
				match(LeftParen);
				setState(1170);
				forinitstatement();
				setState(1172);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1171);
					condition();
					}
				}

				setState(1174);
				match(Semi);
				setState(1176);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1175);
					expression(0);
					}
				}

				setState(1178);
				match(RightParen);
				setState(1179);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1181);
				match(For);
				setState(1182);
				match(LeftParen);
				setState(1183);
				forrangedeclaration();
				setState(1184);
				match(Colon);
				setState(1185);
				forrangeinitializer();
				setState(1186);
				match(RightParen);
				setState(1187);
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
		enterRule(_localctx, 112, RULE_forinitstatement);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
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
		enterRule(_localctx, 114, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1195);
				attributespecifierseq(0);
				}
			}

			setState(1198);
			declspecifierseq();
			setState(1199);
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
		enterRule(_localctx, 116, RULE_forrangeinitializer);
		try {
			setState(1203);
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
				setState(1201);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202);
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
		enterRule(_localctx, 118, RULE_jumpstatement);
		int _la;
		try {
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(Break);
				setState(1206);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(Continue);
				setState(1208);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				match(Return);
				setState(1211);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1210);
					expression(0);
					}
				}

				setState(1213);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				match(Return);
				setState(1215);
				bracedinitlist();
				setState(1216);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1218);
				match(Goto);
				setState(1219);
				match(Identifier);
				setState(1220);
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
		enterRule(_localctx, 120, RULE_declarationstatement);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
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
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1228);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1230);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1231);
					declaration();
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 124, RULE_declaration);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1239);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1241);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1242);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1243);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1244);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1245);
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
		enterRule(_localctx, 126, RULE_blockdeclarationwithoutsimpledeclaration);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248);
				asmdefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				namespacealiasdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1250);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1251);
				usingdirective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1252);
				static_assertdeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1253);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1254);
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
		enterRule(_localctx, 128, RULE_blockdeclaration);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
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
		enterRule(_localctx, 130, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(Using);
			setState(1262);
			match(Identifier);
			setState(1264);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1263);
				attributespecifierseq(0);
				}
			}

			setState(1266);
			match(Assign);
			setState(1267);
			typeid();
			setState(1268);
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
		enterRule(_localctx, 132, RULE_variabledeclarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			variabledeclaration();
			setState(1271);
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
		enterRule(_localctx, 134, RULE_variabledeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1273);
				attributespecifierseq(0);
				}
			}

			setState(1277);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(1276);
				declspecifierseqwithouttype();
				}
			}

			setState(1279);
			typespecifier();
			setState(1283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1280);
					ptroperator();
					}
					} 
				}
				setState(1285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(1287);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Operator || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Tilde - 91)) | (1L << (Doublecolon - 91)) | (1L << (Ellipsis - 91)) | (1L << (Identifier - 91)))) != 0)) {
				{
				setState(1286);
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
		public ArrayDeclaratorContext arrayDeclarator() {
			return getRuleContext(ArrayDeclaratorContext.class,0);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_variableDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1290);
				variableDeclarator();
				}
				break;
			case 2:
				{
				setState(1291);
				arrayDeclarator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclaratorList);
					setState(1294);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1295);
					match(Comma);
					setState(1296);
					variableDeclarator();
					}
					} 
				}
				setState(1301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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

	public static class ArrayDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public ArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitArrayDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclaratorContext arrayDeclarator() throws RecognitionException {
		ArrayDeclaratorContext _localctx = new ArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arrayDeclarator);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				declaratorid();
				setState(1303);
				dims();
				setState(1306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1304);
					match(Assign);
					setState(1305);
					initializerclause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				declaratorid();
				setState(1309);
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
		enterRule(_localctx, 140, RULE_arrayCreationExpression);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				dimExprs();
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1314);
					dims();
					}
					break;
				}
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1317);
					match(Assign);
					setState(1318);
					bracedinitlist();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				dims();
				setState(1322);
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
		enterRule(_localctx, 142, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			dimExpr();
			setState(1330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1327);
					dimExpr();
					}
					} 
				}
				setState(1332);
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
		enterRule(_localctx, 144, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(LeftBracket);
			setState(1334);
			expression(0);
			setState(1335);
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
		enterRule(_localctx, 146, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			declaratorid();
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1338);
				match(Assign);
				setState(1339);
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
		enterRule(_localctx, 148, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(LeftBracket);
			setState(1343);
			match(RightBracket);
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1344);
					match(LeftBracket);
					setState(1345);
					match(RightBracket);
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
		enterRule(_localctx, 150, RULE_simpledeclaration);
		int _la;
		try {
			setState(1365);
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
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1351);
					declspecifierseq();
					}
					break;
				}
				setState(1355);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1354);
					initdeclaratorlist();
					}
				}

				setState(1357);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				attributespecifierseq(0);
				setState(1360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1359);
					declspecifierseq();
					}
					break;
				}
				setState(1362);
				initdeclaratorlist();
				setState(1363);
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
		enterRule(_localctx, 152, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(Static_assert);
			setState(1368);
			match(LeftParen);
			setState(1369);
			constantexpression();
			setState(1370);
			match(Comma);
			setState(1371);
			match(Stringliteral);
			setState(1372);
			match(RightParen);
			setState(1373);
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
		enterRule(_localctx, 154, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
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
		enterRule(_localctx, 156, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			attributespecifierseq(0);
			setState(1378);
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
		enterRule(_localctx, 158, RULE_declspecifier);
		try {
			setState(1382);
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
				setState(1380);
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
				setState(1381);
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
		enterRule(_localctx, 160, RULE_declspecifierseq);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				declspecifier();
				setState(1386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1385);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				declspecifier();
				setState(1389);
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
		enterRule(_localctx, 162, RULE_declspecifierwithouttype);
		try {
			setState(1398);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				storageclassspecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 5);
				{
				setState(1397);
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
		enterRule(_localctx, 164, RULE_declspecifierseqwithouttype);
		int _la;
		try {
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				declspecifierwithouttype();
				setState(1402);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1401);
					attributespecifierseq(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				declspecifierwithouttype();
				setState(1405);
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
		enterRule(_localctx, 166, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
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
		enterRule(_localctx, 168, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
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
		enterRule(_localctx, 170, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
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
		enterRule(_localctx, 172, RULE_typespecifier);
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
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
		enterRule(_localctx, 174, RULE_trailingtypespecifier);
		try {
			setState(1424);
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
				setState(1420);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1422);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1423);
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
		enterRule(_localctx, 176, RULE_typespecifierseq);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				typespecifier();
				setState(1428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1427);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				typespecifier();
				setState(1431);
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
		enterRule(_localctx, 178, RULE_trailingtypespecifierseq);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				trailingtypespecifier();
				setState(1437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1436);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				trailingtypespecifier();
				setState(1440);
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
		enterRule(_localctx, 180, RULE_simpletypespecifier);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1444);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1447);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				nestednamespecifier(0);
				setState(1449);
				match(Template);
				setState(1450);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1453);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1454);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1455);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1456);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1457);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1458);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1459);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1460);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1461);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1462);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1463);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1464);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1465);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1466);
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
		enterRule(_localctx, 182, RULE_typename);
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1472);
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
		enterRule(_localctx, 184, RULE_decltypespecifier);
		try {
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				match(Decltype);
				setState(1476);
				match(LeftParen);
				setState(1477);
				expression(0);
				setState(1478);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				match(Decltype);
				setState(1481);
				match(LeftParen);
				setState(1482);
				match(Auto);
				setState(1483);
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
		enterRule(_localctx, 186, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				classkey();
				setState(1488);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1487);
					attributespecifierseq(0);
					}
				}

				setState(1491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1490);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1493);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				classkey();
				setState(1496);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1498);
				classkey();
				setState(1499);
				nestednamespecifier(0);
				setState(1501);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1500);
					match(Template);
					}
				}

				setState(1503);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1505);
				match(Enum);
				setState(1507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1506);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1509);
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
		enterRule(_localctx, 188, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
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
		enterRule(_localctx, 190, RULE_enumspecifier);
		int _la;
		try {
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				enumhead();
				setState(1515);
				match(LeftBrace);
				setState(1517);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1516);
					enumeratorlist(0);
					}
				}

				setState(1519);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
				enumhead();
				setState(1522);
				match(LeftBrace);
				setState(1523);
				enumeratorlist(0);
				setState(1524);
				match(Comma);
				setState(1525);
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
		enterRule(_localctx, 192, RULE_enumhead);
		int _la;
		try {
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1529);
				enumkey();
				setState(1531);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1530);
					attributespecifierseq(0);
					}
				}

				setState(1534);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1533);
					match(Identifier);
					}
				}

				setState(1537);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1536);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1539);
				enumkey();
				setState(1541);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1540);
					attributespecifierseq(0);
					}
				}

				setState(1543);
				nestednamespecifier(0);
				setState(1544);
				match(Identifier);
				setState(1546);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1545);
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
		enterRule(_localctx, 194, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			enumkey();
			setState(1552);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1551);
				attributespecifierseq(0);
				}
			}

			setState(1554);
			match(Identifier);
			setState(1556);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1555);
				enumbase();
				}
			}

			setState(1558);
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
		enterRule(_localctx, 196, RULE_enumkey);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(Enum);
				setState(1562);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1563);
				match(Enum);
				setState(1564);
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
		enterRule(_localctx, 198, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(Colon);
			setState(1568);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1571);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1573);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1574);
					match(Comma);
					setState(1575);
					enumeratordefinition();
					}
					} 
				}
				setState(1580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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
		enterRule(_localctx, 202, RULE_enumeratordefinition);
		try {
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				enumerator();
				setState(1583);
				match(Assign);
				setState(1584);
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
		enterRule(_localctx, 204, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
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
		enterRule(_localctx, 206, RULE_namespacename);
		try {
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
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
		enterRule(_localctx, 208, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
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
		enterRule(_localctx, 210, RULE_namespacedefinition);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
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
		enterRule(_localctx, 212, RULE_namednamespacedefinition);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
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
		enterRule(_localctx, 214, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1604);
				match(Inline);
				}
			}

			setState(1607);
			match(Namespace);
			setState(1608);
			match(Identifier);
			setState(1609);
			match(LeftBrace);
			setState(1610);
			namespacebody();
			setState(1611);
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
		enterRule(_localctx, 216, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1613);
				match(Inline);
				}
			}

			setState(1616);
			match(Namespace);
			setState(1617);
			originalnamespacename();
			setState(1618);
			match(LeftBrace);
			setState(1619);
			namespacebody();
			setState(1620);
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
		enterRule(_localctx, 218, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1622);
				match(Inline);
				}
			}

			setState(1625);
			match(Namespace);
			setState(1626);
			match(LeftBrace);
			setState(1627);
			namespacebody();
			setState(1628);
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
		enterRule(_localctx, 220, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1630);
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
		enterRule(_localctx, 222, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
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
		enterRule(_localctx, 224, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			match(Namespace);
			setState(1636);
			match(Identifier);
			setState(1637);
			match(Assign);
			setState(1638);
			qualifiednamespacespecifier();
			setState(1639);
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
		enterRule(_localctx, 226, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1641);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1644);
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
		enterRule(_localctx, 228, RULE_usingdeclaration);
		int _la;
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				match(Using);
				setState(1648);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1647);
					match(Typename);
					}
				}

				setState(1650);
				nestednamespecifier(0);
				setState(1651);
				unqualifiedid();
				setState(1652);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654);
				match(Using);
				setState(1655);
				match(Doublecolon);
				setState(1656);
				unqualifiedid();
				setState(1657);
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
		enterRule(_localctx, 230, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1661);
				attributespecifierseq(0);
				}
			}

			setState(1664);
			match(Using);
			setState(1665);
			match(Namespace);
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1666);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1669);
			namespacename();
			setState(1670);
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
		enterRule(_localctx, 232, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(Asm);
			setState(1673);
			match(LeftParen);
			setState(1674);
			match(Stringliteral);
			setState(1675);
			match(RightParen);
			setState(1676);
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
		enterRule(_localctx, 234, RULE_linkagespecification);
		int _la;
		try {
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				match(Extern);
				setState(1679);
				match(Stringliteral);
				setState(1680);
				match(LeftBrace);
				setState(1682);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1681);
					declarationseq(0);
					}
				}

				setState(1684);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				match(Extern);
				setState(1686);
				match(Stringliteral);
				setState(1687);
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
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1691);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1693);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1694);
					attributespecifier();
					}
					} 
				}
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		enterRule(_localctx, 238, RULE_attributespecifier);
		try {
			setState(1707);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				match(LeftBracket);
				setState(1701);
				match(LeftBracket);
				setState(1702);
				attributelist(0);
				setState(1703);
				match(RightBracket);
				setState(1704);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
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
		enterRule(_localctx, 240, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				match(Alignas);
				setState(1710);
				match(LeftParen);
				setState(1711);
				typeid();
				setState(1713);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1712);
					match(Ellipsis);
					}
				}

				setState(1715);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1717);
				match(Alignas);
				setState(1718);
				match(LeftParen);
				setState(1719);
				constantexpression();
				setState(1721);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1720);
					match(Ellipsis);
					}
				}

				setState(1723);
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
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1728);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1731);
				attribute();
				setState(1732);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1746);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1736);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1737);
						match(Comma);
						setState(1739);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1738);
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
						setState(1741);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1742);
						match(Comma);
						setState(1743);
						attribute();
						setState(1744);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
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
		enterRule(_localctx, 244, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			attributetoken();
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1752);
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
		enterRule(_localctx, 246, RULE_attributetoken);
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
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
		enterRule(_localctx, 248, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			attributenamespace();
			setState(1760);
			match(Doublecolon);
			setState(1761);
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
		enterRule(_localctx, 250, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
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
		enterRule(_localctx, 252, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			match(LeftParen);
			setState(1766);
			balancedtokenseq(0);
			setState(1767);
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
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1770);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1773);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1774);
					balancedtoken();
					}
					} 
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
		enterRule(_localctx, 256, RULE_balancedtoken);
		try {
			setState(1792);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				match(LeftParen);
				setState(1781);
				balancedtokenseq(0);
				setState(1782);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				match(LeftBracket);
				setState(1785);
				balancedtokenseq(0);
				setState(1786);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1788);
				match(LeftBrace);
				setState(1789);
				balancedtokenseq(0);
				setState(1790);
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
		enterRule(_localctx, 258, RULE_initdeclaratorlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			initdeclarator();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1795);
				match(Comma);
				setState(1796);
				initdeclarator();
				}
				}
				setState(1801);
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
		enterRule(_localctx, 260, RULE_initdeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			declarator();
			setState(1804);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBrace - 77)) | (1L << (Assign - 77)))) != 0)) {
				{
				setState(1803);
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
		enterRule(_localctx, 262, RULE_declarator);
		try {
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				noptrdeclarator(0);
				setState(1808);
				parametersandqualifiers();
				setState(1809);
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
		enterRule(_localctx, 264, RULE_ptrdeclarator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1813);
					ptroperator();
					}
					} 
				}
				setState(1818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			setState(1819);
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
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1822);
				declaratorid();
				setState(1824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1823);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1826);
				match(LeftParen);
				setState(1827);
				ptrdeclarator();
				setState(1828);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1832);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1833);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1834);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1835);
						match(LeftBracket);
						setState(1837);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1836);
							constantexpression();
							}
						}

						setState(1839);
						match(RightBracket);
						setState(1841);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1840);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
		enterRule(_localctx, 268, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(LeftParen);
			setState(1849);
			parameterdeclarationclause();
			setState(1850);
			match(RightParen);
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1851);
				cvqualifierseq();
				}
				break;
			}
			setState(1855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1854);
				refqualifier();
				}
				break;
			}
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1857);
				exceptionspecification();
				}
				break;
			}
			setState(1861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1860);
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
		enterRule(_localctx, 270, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(Arrow);
			setState(1864);
			trailingtypespecifierseq();
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1865);
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
		enterRule(_localctx, 272, RULE_ptroperator);
		try {
			setState(1891);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1868);
				match(Star);
				setState(1870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1869);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1872);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				match(And);
				setState(1877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1876);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				match(AndAnd);
				setState(1881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1880);
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
				setState(1883);
				nestednamespecifier(0);
				setState(1884);
				match(Star);
				setState(1886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1885);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1888);
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
		enterRule(_localctx, 274, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			cvqualifier();
			setState(1895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1894);
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
		enterRule(_localctx, 276, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
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
		enterRule(_localctx, 278, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
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
		enterRule(_localctx, 280, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1901);
				match(Ellipsis);
				}
			}

			setState(1904);
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
		enterRule(_localctx, 282, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			typespecifierseq();
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1907);
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
		enterRule(_localctx, 284, RULE_abstractdeclarator);
		try {
			setState(1918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1911);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1914);
				parametersandqualifiers();
				setState(1915);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1917);
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
		enterRule(_localctx, 286, RULE_ptrabstractdeclarator);
		try {
			setState(1925);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
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
				setState(1921);
				ptroperator();
				setState(1923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1922);
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
		int _startState = 288;
		enterRecursionRule(_localctx, 288, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1928);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1929);
				match(LeftBracket);
				setState(1931);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1930);
					constantexpression();
					}
				}

				setState(1933);
				match(RightBracket);
				setState(1935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1934);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1937);
				match(LeftParen);
				setState(1938);
				ptrabstractdeclarator();
				setState(1939);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1943);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1944);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1945);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1946);
						match(LeftBracket);
						setState(1948);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1947);
							constantexpression();
							}
						}

						setState(1950);
						match(RightBracket);
						setState(1952);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
						case 1:
							{
							setState(1951);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 290, RULE_abstractpackdeclarator);
		try {
			setState(1963);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
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
				setState(1960);
				ptroperator();
				setState(1961);
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
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1966);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1979);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1968);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1969);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1970);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1971);
						match(LeftBracket);
						setState(1973);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1972);
							constantexpression();
							}
						}

						setState(1975);
						match(RightBracket);
						setState(1977);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
						case 1:
							{
							setState(1976);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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
		enterRule(_localctx, 294, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1984);
					parameterdeclarationlist(0);
					}
				}

				setState(1988);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1987);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1990);
				parameterdeclarationlist(0);
				setState(1991);
				match(Comma);
				setState(1992);
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
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1997);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(2004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1999);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2000);
					match(Comma);
					setState(2001);
					parameterdeclaration();
					}
					} 
				}
				setState(2006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
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
		enterRule(_localctx, 298, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2008);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2007);
					attributespecifierseq(0);
					}
				}

				setState(2010);
				declspecifierseq();
				setState(2011);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2014);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2013);
					attributespecifierseq(0);
					}
				}

				setState(2016);
				declspecifierseq();
				setState(2017);
				declarator();
				setState(2018);
				match(Assign);
				setState(2019);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2022);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2021);
					attributespecifierseq(0);
					}
				}

				setState(2024);
				declspecifierseq();
				setState(2026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2025);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2029);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2028);
					attributespecifierseq(0);
					}
				}

				setState(2031);
				declspecifierseq();
				setState(2033);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2032);
					abstractdeclarator();
					}
				}

				setState(2035);
				match(Assign);
				setState(2036);
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
		enterRule(_localctx, 300, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2040);
				attributespecifierseq(0);
				}
			}

			setState(2044);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Constexpr - 15)) | (1L << (Explicit - 15)) | (1L << (Extern - 15)) | (1L << (Friend - 15)) | (1L << (Inline - 15)) | (1L << (Mutable - 15)) | (1L << (Register - 15)) | (1L << (Static - 15)) | (1L << (Thread_local - 15)) | (1L << (Typedef - 15)) | (1L << (Virtual - 15)))) != 0)) {
				{
				setState(2043);
				declspecifierseqwithouttype();
				}
			}

			setState(2046);
			functionheader();
			setState(2048);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2047);
				virtspecifierseq(0);
				}
			}

			setState(2050);
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
		enterRule(_localctx, 302, RULE_functionheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2052);
				typespecifier();
				}
				break;
			}
			setState(2055);
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
		enterRule(_localctx, 304, RULE_functiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			declaratorid();
			setState(2058);
			match(LeftParen);
			setState(2059);
			parameterdeclarationclause();
			setState(2060);
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
		enterRule(_localctx, 306, RULE_functionbody);
		int _la;
		try {
			setState(2073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2062);
					ctorinitializer();
					}
				}

				setState(2065);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2067);
				match(Assign);
				setState(2068);
				match(Default);
				setState(2069);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2070);
				match(Assign);
				setState(2071);
				match(Delete);
				setState(2072);
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
		enterRule(_localctx, 308, RULE_initializer);
		try {
			setState(2080);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2075);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2076);
				match(LeftParen);
				setState(2077);
				expressionlist();
				setState(2078);
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
		enterRule(_localctx, 310, RULE_braceorequalinitializer);
		try {
			setState(2085);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2082);
				match(Assign);
				setState(2083);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
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
		enterRule(_localctx, 312, RULE_initializerclause);
		try {
			setState(2089);
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
				setState(2087);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
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
		enterRule(_localctx, 314, RULE_initializerlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			initializerclause();
			setState(2096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2092);
					match(Comma);
					setState(2093);
					initializerclause();
					}
					} 
				}
				setState(2098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		enterRule(_localctx, 316, RULE_bracedinitlist);
		int _la;
		try {
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				match(LeftBrace);
				setState(2100);
				initializerlist();
				setState(2102);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2101);
					match(Comma);
					}
				}

				setState(2104);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2106);
				match(LeftBrace);
				setState(2107);
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
		enterRule(_localctx, 318, RULE_classname);
		try {
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
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
		enterRule(_localctx, 320, RULE_classspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
			classhead();
			setState(2115);
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
		enterRule(_localctx, 322, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(LeftBrace);
			setState(2119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(2118);
				memberspecification();
				}
			}

			setState(2121);
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
		enterRule(_localctx, 324, RULE_classhead);
		int _la;
		try {
			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123);
				classkey();
				setState(2125);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2124);
					attributespecifierseq(0);
					}
				}

				setState(2127);
				classheadname();
				setState(2129);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2128);
					classvirtspecifier();
					}
				}

				setState(2132);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2131);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2134);
				classkey();
				setState(2136);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2135);
					attributespecifierseq(0);
					}
				}

				setState(2139);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2138);
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
		enterRule(_localctx, 326, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2143);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2146);
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
		enterRule(_localctx, 328, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
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
		enterRule(_localctx, 330, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
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
		enterRule(_localctx, 332, RULE_memberspecification);
		int _la;
		try {
			setState(2161);
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
				setState(2152);
				memberdeclaration();
				setState(2154);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2153);
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
				setState(2156);
				accessspecifier();
				setState(2157);
				match(Colon);
				setState(2159);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2158);
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
		enterRule(_localctx, 334, RULE_memberdeclaration);
		int _la;
		try {
			setState(2179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2163);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2166);
					declspecifierseq();
					}
					break;
				}
				setState(2170);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Colon - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2169);
					memberdeclaratorlist(0);
					}
				}

				setState(2172);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2173);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2174);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2175);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2176);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2177);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2178);
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
		int _startState = 336;
		enterRecursionRule(_localctx, 336, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2182);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2184);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2185);
					match(Comma);
					setState(2186);
					memberdeclarator();
					}
					} 
				}
				setState(2191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
		enterRule(_localctx, 338, RULE_memberdeclarator);
		int _la;
		try {
			setState(2211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2192);
				declarator();
				setState(2194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2193);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2196);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2199);
				declarator();
				setState(2201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2200);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2204);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2203);
					match(Identifier);
					}
				}

				setState(2207);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2206);
					attributespecifierseq(0);
					}
				}

				setState(2209);
				match(Colon);
				setState(2210);
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
		int _startState = 340;
		enterRecursionRule(_localctx, 340, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2214);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2216);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2217);
					virtspecifier();
					}
					} 
				}
				setState(2222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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
		enterRule(_localctx, 342, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
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
		enterRule(_localctx, 344, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(Assign);
			setState(2226);
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
		enterRule(_localctx, 346, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(Colon);
			setState(2230);
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
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2233);
			basespecifier();
			setState(2235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2234);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2238);
					match(Comma);
					setState(2239);
					basespecifier();
					setState(2241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						setState(2240);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2247);
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
		enterRule(_localctx, 350, RULE_basespecifier);
		int _la;
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2249);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2248);
					attributespecifierseq(0);
					}
				}

				setState(2251);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2253);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2252);
					attributespecifierseq(0);
					}
				}

				setState(2255);
				match(Virtual);
				setState(2257);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2256);
					accessspecifier();
					}
				}

				setState(2259);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2261);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2260);
					attributespecifierseq(0);
					}
				}

				setState(2263);
				accessspecifier();
				setState(2265);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2264);
					match(Virtual);
					}
				}

				setState(2267);
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
		enterRule(_localctx, 352, RULE_classordecltype);
		try {
			setState(2276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2271);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2274);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
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
		enterRule(_localctx, 354, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
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
		enterRule(_localctx, 356, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
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
		enterRule(_localctx, 358, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			match(Operator);
			setState(2283);
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
		enterRule(_localctx, 360, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			typespecifierseq();
			setState(2287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2286);
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
		enterRule(_localctx, 362, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2289);
			ptroperator();
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2290);
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
		enterRule(_localctx, 364, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(Colon);
			setState(2294);
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
		enterRule(_localctx, 366, RULE_meminitializerlist);
		int _la;
		try {
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				meminitializer();
				setState(2298);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2297);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
				meminitializer();
				setState(2302);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2301);
					match(Ellipsis);
					}
				}

				setState(2304);
				match(Comma);
				setState(2305);
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
		enterRule(_localctx, 368, RULE_meminitializer);
		int _la;
		try {
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				meminitializerid();
				setState(2310);
				match(LeftParen);
				setState(2312);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2311);
					expressionlist();
					}
				}

				setState(2314);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2316);
				meminitializerid();
				setState(2317);
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
		enterRule(_localctx, 370, RULE_meminitializerid);
		try {
			setState(2323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2321);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2322);
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
		enterRule(_localctx, 372, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			match(Operator);
			setState(2326);
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
		enterRule(_localctx, 374, RULE_literaloperatorid);
		try {
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(Operator);
				setState(2329);
				match(Stringliteral);
				setState(2330);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2331);
				match(Operator);
				setState(2332);
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
		enterRule(_localctx, 376, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(Template);
			setState(2336);
			match(Less);
			setState(2337);
			templateparameterlist(0);
			setState(2338);
			match(Greater);
			setState(2339);
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
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2342);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2344);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2345);
					match(Comma);
					setState(2346);
					templateparameter();
					}
					} 
				}
				setState(2351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
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
		enterRule(_localctx, 380, RULE_templateparameter);
		try {
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2353);
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
		enterRule(_localctx, 382, RULE_typeparameter);
		int _la;
		try {
			setState(2404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				match(Class);
				setState(2358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2357);
					match(Ellipsis);
					}
					break;
				}
				setState(2361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2360);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(Class);
				setState(2365);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2364);
					match(Identifier);
					}
				}

				setState(2367);
				match(Assign);
				setState(2368);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2369);
				match(Typename);
				setState(2371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2370);
					match(Ellipsis);
					}
					break;
				}
				setState(2374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2373);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2376);
				match(Typename);
				setState(2378);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2377);
					match(Identifier);
					}
				}

				setState(2380);
				match(Assign);
				setState(2381);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2382);
				match(Template);
				setState(2383);
				match(Less);
				setState(2384);
				templateparameterlist(0);
				setState(2385);
				match(Greater);
				setState(2386);
				match(Class);
				setState(2388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2387);
					match(Ellipsis);
					}
					break;
				}
				setState(2391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2390);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2393);
				match(Template);
				setState(2394);
				match(Less);
				setState(2395);
				templateparameterlist(0);
				setState(2396);
				match(Greater);
				setState(2397);
				match(Class);
				setState(2399);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2398);
					match(Identifier);
					}
				}

				setState(2401);
				match(Assign);
				setState(2402);
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
		enterRule(_localctx, 384, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			templatename();
			setState(2407);
			match(Less);
			setState(2409);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2408);
				templateargumentlist(0);
				}
			}

			setState(2411);
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
		enterRule(_localctx, 386, RULE_templateid);
		int _la;
		try {
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2414);
				operatorfunctionid();
				setState(2415);
				match(Less);
				setState(2417);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2416);
					templateargumentlist(0);
					}
				}

				setState(2419);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2421);
				literaloperatorid();
				setState(2422);
				match(Less);
				setState(2424);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typeid - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Or - 67)) | (1L << (Tilde - 67)) | (1L << (Not - 67)) | (1L << (PlusPlus - 67)) | (1L << (MinusMinus - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)) | (1L << (Integerliteral - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Booleanliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2423);
					templateargumentlist(0);
					}
				}

				setState(2426);
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
		enterRule(_localctx, 388, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
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
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2433);
			templateargument();
			setState(2435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2434);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2437);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2438);
					match(Comma);
					setState(2439);
					templateargument();
					setState(2441);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						setState(2440);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2447);
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
		enterRule(_localctx, 392, RULE_templateargument);
		try {
			setState(2451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2448);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2449);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2450);
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
		enterRule(_localctx, 394, RULE_typenamespecifier);
		int _la;
		try {
			setState(2464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				match(Typename);
				setState(2454);
				nestednamespecifier(0);
				setState(2455);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2457);
				match(Typename);
				setState(2458);
				nestednamespecifier(0);
				setState(2460);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2459);
					match(Template);
					}
				}

				setState(2462);
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
		enterRule(_localctx, 396, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2466);
				match(Extern);
				}
			}

			setState(2469);
			match(Template);
			setState(2470);
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
		enterRule(_localctx, 398, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(Template);
			setState(2473);
			match(Less);
			setState(2474);
			match(Greater);
			setState(2475);
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
		enterRule(_localctx, 400, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(Try);
			setState(2478);
			compoundstatement();
			setState(2479);
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
		enterRule(_localctx, 402, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
			match(Try);
			setState(2483);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2482);
				ctorinitializer();
				}
			}

			setState(2485);
			compoundstatement();
			setState(2486);
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
		enterRule(_localctx, 404, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			handler();
			setState(2490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				{
				setState(2489);
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
		enterRule(_localctx, 406, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492);
			match(Catch);
			setState(2493);
			match(LeftParen);
			setState(2494);
			exceptiondeclaration();
			setState(2495);
			match(RightParen);
			setState(2496);
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
		enterRule(_localctx, 408, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2499);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2498);
					attributespecifierseq(0);
					}
				}

				setState(2501);
				typespecifierseq();
				setState(2502);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2505);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2504);
					attributespecifierseq(0);
					}
				}

				setState(2507);
				typespecifierseq();
				setState(2509);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2508);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2511);
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
		enterRule(_localctx, 410, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			match(Throw);
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2515);
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
		enterRule(_localctx, 412, RULE_exceptionspecification);
		try {
			setState(2520);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2519);
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
		enterRule(_localctx, 414, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2522);
			match(Throw);
			setState(2523);
			match(LeftParen);
			setState(2525);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2524);
				typeidlist(0);
				}
			}

			setState(2527);
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
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2530);
			typeid();
			setState(2532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2531);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2534);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2535);
					match(Comma);
					setState(2536);
					typeid();
					setState(2538);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
					case 1:
						{
						setState(2537);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
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
		enterRule(_localctx, 418, RULE_noexceptspecification);
		try {
			setState(2551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2545);
				match(Noexcept);
				setState(2546);
				match(LeftParen);
				setState(2547);
				constantexpression();
				setState(2548);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2550);
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
		enterRule(_localctx, 420, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
			match(Greater);
			setState(2554);
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
		enterRule(_localctx, 422, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(Greater);
			setState(2557);
			match(Greater);
			setState(2558);
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
		enterRule(_localctx, 424, RULE_operator);
		try {
			setState(2608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				match(New);
				setState(2563);
				match(LeftBracket);
				setState(2564);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2565);
				match(Delete);
				setState(2566);
				match(LeftBracket);
				setState(2567);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2568);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2569);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2570);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2571);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2572);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2573);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2574);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2575);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2576);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2577);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2578);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2579);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2580);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2581);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2582);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2583);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2584);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2585);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2586);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2587);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2588);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2589);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2590);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2591);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2592);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2593);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2594);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2595);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2596);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2597);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2598);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2599);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2600);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2601);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2602);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2603);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2604);
				match(LeftParen);
				setState(2605);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2606);
				match(LeftBracket);
				setState(2607);
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
		enterRule(_localctx, 426, RULE_literal);
		try {
			setState(2617);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2610);
				integerliteral();
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2611);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2612);
				floatingliteral();
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2613);
				stringliteral();
				}
				break;
			case Booleanliteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2614);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2615);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2616);
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
		enterRule(_localctx, 428, RULE_integerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
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
		enterRule(_localctx, 430, RULE_floatingliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2621);
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
		enterRule(_localctx, 432, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
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
		enterRule(_localctx, 434, RULE_booleanliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
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
		enterRule(_localctx, 436, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
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
		enterRule(_localctx, 438, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
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
		case 19:
			return postbinexpression_sempred((PostbinexpressionContext)_localctx, predIndex);
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
		case 61:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 68:
			return variableDeclaratorList_sempred((VariableDeclaratorListContext)_localctx, predIndex);
		case 100:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 118:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 121:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 127:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 133:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 144:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 146:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 148:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 168:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 170:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 174:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 189:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 195:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 208:
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
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean postbinexpression_sempred(PostbinexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
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
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 3);
		case 42:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 5);
		case 44:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 3);
		case 46:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0a4a\4\2\t"+
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
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\3\2\5\2\u01bc\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01c6\n\3\3\4\3\4\5\4\u01ca\n\4\3\5\3"+
		"\5\5\5\u01ce\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01d9\n\6\3\7"+
		"\3\7\5\7\u01dd\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u01ec\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f3\n\b\3\b\3\b\3\b\7\b\u01f8"+
		"\n\b\f\b\16\b\u01fb\13\b\3\t\3\t\5\t\u01ff\n\t\3\t\3\t\3\n\3\n\5\n\u0205"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u020f\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u0216\n\r\3\r\3\r\3\r\3\r\5\r\u021c\n\r\7\r\u021e\n\r\f\r"+
		"\16\r\u0221\13\r\3\16\3\16\5\16\u0225\n\16\3\17\3\17\3\17\3\17\5\17\u022b"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0232\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u0238\n\21\3\21\5\21\u023b\n\21\3\21\5\21\u023e\n\21\3\21\5\21\u0241"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0248\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u024f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0283\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u028d\n\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0293\n\22\3\22\3\22\3\22\3\22\5\22\u0299\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02a6\n\22\f\22\16\22"+
		"\u02a9\13\22\3\23\3\23\3\24\5\24\u02ae\n\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u02bd\n\24\3\24\3\24\3\24"+
		"\3\24\5\24\u02c3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u02d0\n\25\f\25\16\25\u02d3\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u02ea\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u02f5\n\27\3\30\3\30\3\31\5\31\u02fa\n\31\3\31\3\31\5\31\u02fe\n"+
		"\31\3\31\3\31\5\31\u0302\n\31\3\31\5\31\u0305\n\31\3\31\3\31\5\31\u0309"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u030f\n\31\5\31\u0311\n\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\5\33\u0319\n\33\3\34\3\34\5\34\u031d\n\34\3\34\5\34"+
		"\u0320\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0327\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u032e\n\35\7\35\u0330\n\35\f\35\16\35\u0333\13\35\3\36\3"+
		"\36\5\36\u0337\n\36\3\36\3\36\5\36\u033b\n\36\3\37\5\37\u033e\n\37\3\37"+
		"\3\37\3\37\5\37\u0343\n\37\3\37\3\37\3\37\3\37\5\37\u0349\n\37\3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0356\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\7\"\u0361\n\"\f\"\16\"\u0364\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\7#\u0372\n#\f#\16#\u0375\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0380"+
		"\n$\f$\16$\u0383\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u038f\n%\f%\16%"+
		"\u0392\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u03a3\n&\f"+
		"&\16&\u03a6\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03b1\n\'\f\'"+
		"\16\'\u03b4\13\'\3(\3(\3(\3(\3(\3(\7(\u03bc\n(\f(\16(\u03bf\13(\3)\3)"+
		"\3)\3)\3)\3)\7)\u03c7\n)\f)\16)\u03ca\13)\3*\3*\3*\3*\3*\3*\7*\u03d2\n"+
		"*\f*\16*\u03d5\13*\3+\3+\3+\3+\3+\3+\7+\u03dd\n+\f+\16+\u03e0\13+\3,\3"+
		",\3,\3,\3,\3,\7,\u03e8\n,\f,\16,\u03eb\13,\3-\3-\3-\3-\3-\3-\3-\5-\u03f4"+
		"\n-\3.\3.\3.\3.\3.\3.\5.\u03fc\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/"+
		"\u0409\n/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0411\n\60\f\60\16\60\u0414"+
		"\13\60\3\61\3\61\3\62\3\62\5\62\u041a\n\62\3\62\3\62\5\62\u041e\n\62\3"+
		"\62\3\62\5\62\u0422\n\62\3\62\3\62\5\62\u0426\n\62\3\62\3\62\5\62\u042a"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u0430\n\62\3\62\5\62\u0433\n\62\3\63\5"+
		"\63\u0436\n\63\3\63\3\63\3\63\3\63\5\63\u043c\n\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0444\n\63\3\63\3\63\3\63\5\63\u0449\n\63\3\64\5\64\u044c"+
		"\n\64\3\64\3\64\3\65\3\65\5\65\u0452\n\65\3\65\3\65\3\66\3\66\7\66\u0458"+
		"\n\66\f\66\16\66\u045b\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0471"+
		"\n\67\38\38\58\u0475\n8\38\38\38\38\38\38\58\u047d\n8\38\38\38\38\58\u0483"+
		"\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0497\n9"+
		"\39\39\59\u049b\n9\39\39\39\39\39\39\39\39\39\39\39\59\u04a8\n9\3:\3:"+
		"\5:\u04ac\n:\3;\5;\u04af\n;\3;\3;\3;\3<\3<\5<\u04b6\n<\3=\3=\3=\3=\3="+
		"\3=\5=\u04be\n=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u04c8\n=\3>\3>\5>\u04cc\n>"+
		"\3?\3?\3?\3?\3?\7?\u04d3\n?\f?\16?\u04d6\13?\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\5@\u04e1\n@\3A\3A\3A\3A\3A\3A\3A\5A\u04ea\nA\3B\3B\5B\u04ee\nB\3C\3"+
		"C\3C\5C\u04f3\nC\3C\3C\3C\3C\3D\3D\3D\3E\5E\u04fd\nE\3E\5E\u0500\nE\3"+
		"E\3E\7E\u0504\nE\fE\16E\u0507\13E\3E\5E\u050a\nE\3F\3F\3F\5F\u050f\nF"+
		"\3F\3F\3F\7F\u0514\nF\fF\16F\u0517\13F\3G\3G\3G\3G\5G\u051d\nG\3G\3G\3"+
		"G\5G\u0522\nG\3H\3H\5H\u0526\nH\3H\3H\5H\u052a\nH\3H\3H\3H\5H\u052f\n"+
		"H\3I\3I\7I\u0533\nI\fI\16I\u0536\13I\3J\3J\3J\3J\3K\3K\3K\5K\u053f\nK"+
		"\3L\3L\3L\3L\7L\u0545\nL\fL\16L\u0548\13L\3M\5M\u054b\nM\3M\5M\u054e\n"+
		"M\3M\3M\3M\5M\u0553\nM\3M\3M\3M\5M\u0558\nM\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"O\3O\3P\3P\3P\3Q\3Q\5Q\u0569\nQ\3R\3R\5R\u056d\nR\3R\3R\3R\5R\u0572\n"+
		"R\3S\3S\3S\3S\3S\5S\u0579\nS\3T\3T\5T\u057d\nT\3T\3T\3T\5T\u0582\nT\3"+
		"U\3U\3V\3V\3W\3W\3X\3X\3X\5X\u058d\nX\3Y\3Y\3Y\3Y\5Y\u0593\nY\3Z\3Z\5"+
		"Z\u0597\nZ\3Z\3Z\3Z\5Z\u059c\nZ\3[\3[\5[\u05a0\n[\3[\3[\3[\5[\u05a5\n"+
		"[\3\\\5\\\u05a8\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u05be\n\\\3]\3]\3]\3]\5]\u05c4\n]\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u05cf\n^\3_\3_\5_\u05d3\n_\3_\5_\u05d6\n"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u05e0\n_\3_\3_\3_\3_\5_\u05e6\n_\3_\5_\u05e9"+
		"\n_\3`\3`\3a\3a\3a\5a\u05f0\na\3a\3a\3a\3a\3a\3a\3a\3a\5a\u05fa\na\3b"+
		"\3b\5b\u05fe\nb\3b\5b\u0601\nb\3b\5b\u0604\nb\3b\3b\5b\u0608\nb\3b\3b"+
		"\3b\5b\u060d\nb\5b\u060f\nb\3c\3c\5c\u0613\nc\3c\3c\5c\u0617\nc\3c\3c"+
		"\3d\3d\3d\3d\3d\5d\u0620\nd\3e\3e\3e\3f\3f\3f\3f\3f\3f\7f\u062b\nf\ff"+
		"\16f\u062e\13f\3g\3g\3g\3g\3g\5g\u0635\ng\3h\3h\3i\3i\5i\u063b\ni\3j\3"+
		"j\3k\3k\5k\u0641\nk\3l\3l\5l\u0645\nl\3m\5m\u0648\nm\3m\3m\3m\3m\3m\3"+
		"m\3n\5n\u0651\nn\3n\3n\3n\3n\3n\3n\3o\5o\u065a\no\3o\3o\3o\3o\3o\3p\5"+
		"p\u0662\np\3q\3q\3r\3r\3r\3r\3r\3r\3s\5s\u066d\ns\3s\3s\3t\3t\5t\u0673"+
		"\nt\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u067e\nt\3u\5u\u0681\nu\3u\3u\3u\5u"+
		"\u0686\nu\3u\3u\3u\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\5w\u0695\nw\3w\3w\3w"+
		"\3w\5w\u069b\nw\3x\3x\3x\3x\3x\7x\u06a2\nx\fx\16x\u06a5\13x\3y\3y\3y\3"+
		"y\3y\3y\3y\5y\u06ae\ny\3z\3z\3z\3z\5z\u06b4\nz\3z\3z\3z\3z\3z\3z\5z\u06bc"+
		"\nz\3z\3z\5z\u06c0\nz\3{\3{\5{\u06c4\n{\3{\3{\3{\5{\u06c9\n{\3{\3{\3{"+
		"\5{\u06ce\n{\3{\3{\3{\3{\3{\7{\u06d5\n{\f{\16{\u06d8\13{\3|\3|\5|\u06dc"+
		"\n|\3}\3}\5}\u06e0\n}\3~\3~\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\5\u0081\u06ee\n\u0081\3\u0081\3\u0081\7\u0081"+
		"\u06f2\n\u0081\f\u0081\16\u0081\u06f5\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0703\n\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u0708\n\u0083\f"+
		"\u0083\16\u0083\u070b\13\u0083\3\u0084\3\u0084\5\u0084\u070f\n\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0716\n\u0085\3\u0086\7"+
		"\u0086\u0719\n\u0086\f\u0086\16\u0086\u071c\13\u0086\3\u0086\3\u0086\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u0723\n\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0729\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5"+
		"\u0087\u0730\n\u0087\3\u0087\3\u0087\5\u0087\u0734\n\u0087\7\u0087\u0736"+
		"\n\u0087\f\u0087\16\u0087\u0739\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u073f\n\u0088\3\u0088\5\u0088\u0742\n\u0088\3\u0088\5\u0088\u0745"+
		"\n\u0088\3\u0088\5\u0088\u0748\n\u0088\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u074d\n\u0089\3\u008a\3\u008a\5\u008a\u0751\n\u008a\3\u008a\5\u008a\u0754"+
		"\n\u008a\3\u008a\3\u008a\5\u008a\u0758\n\u008a\3\u008a\3\u008a\5\u008a"+
		"\u075c\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0761\n\u008a\3\u008a\5"+
		"\u008a\u0764\n\u008a\5\u008a\u0766\n\u008a\3\u008b\3\u008b\5\u008b\u076a"+
		"\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\5\u008e\u0771\n\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u0777\n\u008f\3\u0090\3\u0090"+
		"\5\u0090\u077b\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0781\n"+
		"\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0786\n\u0091\5\u0091\u0788\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u078e\n\u0092\3\u0092\3\u0092"+
		"\5\u0092\u0792\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0798\n"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u079f\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u07a3\n\u0092\7\u0092\u07a5\n\u0092\f\u0092\16"+
		"\u0092\u07a8\13\u0092\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u07ae\n"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u07b8\n\u0094\3\u0094\3\u0094\5\u0094\u07bc\n\u0094\7\u0094\u07be"+
		"\n\u0094\f\u0094\16\u0094\u07c1\13\u0094\3\u0095\5\u0095\u07c4\n\u0095"+
		"\3\u0095\5\u0095\u07c7\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u07cd\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096"+
		"\u07d5\n\u0096\f\u0096\16\u0096\u07d8\13\u0096\3\u0097\5\u0097\u07db\n"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07e1\n\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07e9\n\u0097\3\u0097\3"+
		"\u0097\5\u0097\u07ed\n\u0097\3\u0097\5\u0097\u07f0\n\u0097\3\u0097\3\u0097"+
		"\5\u0097\u07f4\n\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07f9\n\u0097\3"+
		"\u0098\5\u0098\u07fc\n\u0098\3\u0098\5\u0098\u07ff\n\u0098\3\u0098\3\u0098"+
		"\5\u0098\u0803\n\u0098\3\u0098\3\u0098\3\u0099\5\u0099\u0808\n\u0099\3"+
		"\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\5\u009b"+
		"\u0812\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\5\u009b\u081c\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u0823\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u0828\n\u009d\3"+
		"\u009e\3\u009e\5\u009e\u082c\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u0831"+
		"\n\u009f\f\u009f\16\u009f\u0834\13\u009f\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u0839\n\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u083f\n\u00a0\3"+
		"\u00a1\3\u00a1\5\u00a1\u0843\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\5\u00a3\u084a\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u0850"+
		"\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0854\n\u00a4\3\u00a4\5\u00a4\u0857\n"+
		"\u00a4\3\u00a4\3\u00a4\5\u00a4\u085b\n\u00a4\3\u00a4\5\u00a4\u085e\n\u00a4"+
		"\5\u00a4\u0860\n\u00a4\3\u00a5\5\u00a5\u0863\n\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u086d\n\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\5\u00a8\u0872\n\u00a8\5\u00a8\u0874\n\u00a8\3\u00a9"+
		"\5\u00a9\u0877\n\u00a9\3\u00a9\5\u00a9\u087a\n\u00a9\3\u00a9\5\u00a9\u087d"+
		"\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u0886\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa"+
		"\u088e\n\u00aa\f\u00aa\16\u00aa\u0891\13\u00aa\3\u00ab\3\u00ab\5\u00ab"+
		"\u0895\n\u00ab\3\u00ab\5\u00ab\u0898\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u089c"+
		"\n\u00ab\3\u00ab\5\u00ab\u089f\n\u00ab\3\u00ab\5\u00ab\u08a2\n\u00ab\3"+
		"\u00ab\3\u00ab\5\u00ab\u08a6\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ac\7\u00ac\u08ad\n\u00ac\f\u00ac\16\u00ac\u08b0\13\u00ac\3\u00ad\3"+
		"\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u08be\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u08c4\n\u00b0\7\u00b0\u08c6\n\u00b0\f\u00b0\16\u00b0\u08c9\13"+
		"\u00b0\3\u00b1\5\u00b1\u08cc\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u08d0\n\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u08d4\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u08d8\n"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u08dc\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u08e0"+
		"\n\u00b1\3\u00b2\5\u00b2\u08e3\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u08e7\n"+
		"\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\5\u00b6\u08f2\n\u00b6\3\u00b7\3\u00b7\5\u00b7\u08f6\n\u00b7\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\5\u00b9\u08fd\n\u00b9\3\u00b9\3"+
		"\u00b9\5\u00b9\u0901\n\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0906\n\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u090b\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0912\n\u00ba\3\u00bb\3\u00bb\5\u00bb\u0916\n"+
		"\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0920\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u092e\n\u00bf"+
		"\f\u00bf\16\u00bf\u0931\13\u00bf\3\u00c0\3\u00c0\5\u00c0\u0935\n\u00c0"+
		"\3\u00c1\3\u00c1\5\u00c1\u0939\n\u00c1\3\u00c1\5\u00c1\u093c\n\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0940\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5"+
		"\u00c1\u0946\n\u00c1\3\u00c1\5\u00c1\u0949\n\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u094d\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0957\n\u00c1\3\u00c1\5\u00c1\u095a\n\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0962\n\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0967\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u096c"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0974"+
		"\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u097b\n\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u097f\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u0986\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5"+
		"\u098c\n\u00c5\7\u00c5\u098e\n\u00c5\f\u00c5\16\u00c5\u0991\13\u00c5\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u0996\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u099f\n\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u09a3\n\u00c7\3\u00c8\5\u00c8\u09a6\n\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00cb\3\u00cb\5\u00cb\u09b6\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc"+
		"\3\u00cc\5\u00cc\u09bd\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00ce\5\u00ce\u09c6\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u09cc\n\u00ce\3\u00ce\3\u00ce\5\u00ce\u09d0\n\u00ce\3\u00ce\5"+
		"\u00ce\u09d3\n\u00ce\3\u00cf\3\u00cf\5\u00cf\u09d7\n\u00cf\3\u00d0\3\u00d0"+
		"\5\u00d0\u09db\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u09e0\n\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u09e7\n\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\3\u00d2\5\u00d2\u09ed\n\u00d2\7\u00d2\u09ef\n\u00d2\f\u00d2"+
		"\16\u00d2\u09f2\13\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\5\u00d3\u09fa\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0a33\n\u00d6\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a3c\n\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\2#\16\30\"(8BDFHJLNPRTV^|\u008a\u00ca\u00ee\u00f4"+
		"\u0100\u010c\u0122\u0126\u012a\u0152\u0156\u015e\u017c\u0188\u01a2\u00de"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\2\f\4\2[[__\4\2UW[^\7\2\36\36))\63"+
		"\6399@@\5\2\34\34&&JJ\4\2\20\20LL\4\2[[pp\5\2\17\17<<GG\4\2  //\3\2\60"+
		"\62\3\2\u0089\u008c\u0b69\2\u01bb\3\2\2\2\4\u01c5\3\2\2\2\6\u01c9\3\2"+
		"\2\2\b\u01cd\3\2\2\2\n\u01d8\3\2\2\2\f\u01da\3\2\2\2\16\u01eb\3\2\2\2"+
		"\20\u01fc\3\2\2\2\22\u0202\3\2\2\2\24\u020e\3\2\2\2\26\u0210\3\2\2\2\30"+
		"\u0212\3\2\2\2\32\u0224\3\2\2\2\34\u022a\3\2\2\2\36\u0231\3\2\2\2 \u0233"+
		"\3\2\2\2\"\u0282\3\2\2\2$\u02aa\3\2\2\2&\u02c2\3\2\2\2(\u02c4\3\2\2\2"+
		"*\u02e9\3\2\2\2,\u02f4\3\2\2\2.\u02f6\3\2\2\2\60\u0310\3\2\2\2\62\u0312"+
		"\3\2\2\2\64\u0316\3\2\2\2\66\u031f\3\2\2\28\u0321\3\2\2\2:\u033a\3\2\2"+
		"\2<\u0348\3\2\2\2>\u034a\3\2\2\2@\u0355\3\2\2\2B\u0357\3\2\2\2D\u0365"+
		"\3\2\2\2F\u0376\3\2\2\2H\u0384\3\2\2\2J\u0393\3\2\2\2L\u03a7\3\2\2\2N"+
		"\u03b5\3\2\2\2P\u03c0\3\2\2\2R\u03cb\3\2\2\2T\u03d6\3\2\2\2V\u03e1\3\2"+
		"\2\2X\u03f3\3\2\2\2Z\u03fb\3\2\2\2\\\u0408\3\2\2\2^\u040a\3\2\2\2`\u0415"+
		"\3\2\2\2b\u0432\3\2\2\2d\u0448\3\2\2\2f\u044b\3\2\2\2h\u044f\3\2\2\2j"+
		"\u0455\3\2\2\2l\u0470\3\2\2\2n\u0482\3\2\2\2p\u04a7\3\2\2\2r\u04ab\3\2"+
		"\2\2t\u04ae\3\2\2\2v\u04b5\3\2\2\2x\u04c7\3\2\2\2z\u04cb\3\2\2\2|\u04cd"+
		"\3\2\2\2~\u04e0\3\2\2\2\u0080\u04e9\3\2\2\2\u0082\u04ed\3\2\2\2\u0084"+
		"\u04ef\3\2\2\2\u0086\u04f8\3\2\2\2\u0088\u04fc\3\2\2\2\u008a\u050e\3\2"+
		"\2\2\u008c\u0521\3\2\2\2\u008e\u052e\3\2\2\2\u0090\u0530\3\2\2\2\u0092"+
		"\u0537\3\2\2\2\u0094\u053b\3\2\2\2\u0096\u0540\3\2\2\2\u0098\u0557\3\2"+
		"\2\2\u009a\u0559\3\2\2\2\u009c\u0561\3\2\2\2\u009e\u0563\3\2\2\2\u00a0"+
		"\u0568\3\2\2\2\u00a2\u0571\3\2\2\2\u00a4\u0578\3\2\2\2\u00a6\u0581\3\2"+
		"\2\2\u00a8\u0583\3\2\2\2\u00aa\u0585\3\2\2\2\u00ac\u0587\3\2\2\2\u00ae"+
		"\u058c\3\2\2\2\u00b0\u0592\3\2\2\2\u00b2\u059b\3\2\2\2\u00b4\u05a4\3\2"+
		"\2\2\u00b6\u05bd\3\2\2\2\u00b8\u05c3\3\2\2\2\u00ba\u05ce\3\2\2\2\u00bc"+
		"\u05e8\3\2\2\2\u00be\u05ea\3\2\2\2\u00c0\u05f9\3\2\2\2\u00c2\u060e\3\2"+
		"\2\2\u00c4\u0610\3\2\2\2\u00c6\u061f\3\2\2\2\u00c8\u0621\3\2\2\2\u00ca"+
		"\u0624\3\2\2\2\u00cc\u0634\3\2\2\2\u00ce\u0636\3\2\2\2\u00d0\u063a\3\2"+
		"\2\2\u00d2\u063c\3\2\2\2\u00d4\u0640\3\2\2\2\u00d6\u0644\3\2\2\2\u00d8"+
		"\u0647\3\2\2\2\u00da\u0650\3\2\2\2\u00dc\u0659\3\2\2\2\u00de\u0661\3\2"+
		"\2\2\u00e0\u0663\3\2\2\2\u00e2\u0665\3\2\2\2\u00e4\u066c\3\2\2\2\u00e6"+
		"\u067d\3\2\2\2\u00e8\u0680\3\2\2\2\u00ea\u068a\3\2\2\2\u00ec\u069a\3\2"+
		"\2\2\u00ee\u069c\3\2\2\2\u00f0\u06ad\3\2\2\2\u00f2\u06bf\3\2\2\2\u00f4"+
		"\u06c8\3\2\2\2\u00f6\u06d9\3\2\2\2\u00f8\u06df\3\2\2\2\u00fa\u06e1\3\2"+
		"\2\2\u00fc\u06e5\3\2\2\2\u00fe\u06e7\3\2\2\2\u0100\u06eb\3\2\2\2\u0102"+
		"\u0702\3\2\2\2\u0104\u0704\3\2\2\2\u0106\u070c\3\2\2\2\u0108\u0715\3\2"+
		"\2\2\u010a\u071a\3\2\2\2\u010c\u0728\3\2\2\2\u010e\u073a\3\2\2\2\u0110"+
		"\u0749\3\2\2\2\u0112\u0765\3\2\2\2\u0114\u0767\3\2\2\2\u0116\u076b\3\2"+
		"\2\2\u0118\u076d\3\2\2\2\u011a\u0770\3\2\2\2\u011c\u0774\3\2\2\2\u011e"+
		"\u0780\3\2\2\2\u0120\u0787\3\2\2\2\u0122\u0797\3\2\2\2\u0124\u07ad\3\2"+
		"\2\2\u0126\u07af\3\2\2\2\u0128\u07cc\3\2\2\2\u012a\u07ce\3\2\2\2\u012c"+
		"\u07f8\3\2\2\2\u012e\u07fb\3\2\2\2\u0130\u0807\3\2\2\2\u0132\u080b\3\2"+
		"\2\2\u0134\u081b\3\2\2\2\u0136\u0822\3\2\2\2\u0138\u0827\3\2\2\2\u013a"+
		"\u082b\3\2\2\2\u013c\u082d\3\2\2\2\u013e\u083e\3\2\2\2\u0140\u0842\3\2"+
		"\2\2\u0142\u0844\3\2\2\2\u0144\u0847\3\2\2\2\u0146\u085f\3\2\2\2\u0148"+
		"\u0862\3\2\2\2\u014a\u0866\3\2\2\2\u014c\u0868\3\2\2\2\u014e\u0873\3\2"+
		"\2\2\u0150\u0885\3\2\2\2\u0152\u0887\3\2\2\2\u0154\u08a5\3\2\2\2\u0156"+
		"\u08a7\3\2\2\2\u0158\u08b1\3\2\2\2\u015a\u08b3\3\2\2\2\u015c\u08b7\3\2"+
		"\2\2\u015e\u08ba\3\2\2\2\u0160\u08df\3\2\2\2\u0162\u08e6\3\2\2\2\u0164"+
		"\u08e8\3\2\2\2\u0166\u08ea\3\2\2\2\u0168\u08ec\3\2\2\2\u016a\u08ef\3\2"+
		"\2\2\u016c\u08f3\3\2\2\2\u016e\u08f7\3\2\2\2\u0170\u0905\3\2\2\2\u0172"+
		"\u0911\3\2\2\2\u0174\u0915\3\2\2\2\u0176\u0917\3\2\2\2\u0178\u091f\3\2"+
		"\2\2\u017a\u0921\3\2\2\2\u017c\u0927\3\2\2\2\u017e\u0934\3\2\2\2\u0180"+
		"\u0966\3\2\2\2\u0182\u0968\3\2\2\2\u0184\u097e\3\2\2\2\u0186\u0980\3\2"+
		"\2\2\u0188\u0982\3\2\2\2\u018a\u0995\3\2\2\2\u018c\u09a2\3\2\2\2\u018e"+
		"\u09a5\3\2\2\2\u0190\u09aa\3\2\2\2\u0192\u09af\3\2\2\2\u0194\u09b3\3\2"+
		"\2\2\u0196\u09ba\3\2\2\2\u0198\u09be\3\2\2\2\u019a\u09d2\3\2\2\2\u019c"+
		"\u09d4\3\2\2\2\u019e\u09da\3\2\2\2\u01a0\u09dc\3\2\2\2\u01a2\u09e3\3\2"+
		"\2\2\u01a4\u09f9\3\2\2\2\u01a6\u09fb\3\2\2\2\u01a8\u09fe\3\2\2\2\u01aa"+
		"\u0a32\3\2\2\2\u01ac\u0a3b\3\2\2\2\u01ae\u0a3d\3\2\2\2\u01b0\u0a3f\3\2"+
		"\2\2\u01b2\u0a41\3\2\2\2\u01b4\u0a43\3\2\2\2\u01b6\u0a45\3\2\2\2\u01b8"+
		"\u0a47\3\2\2\2\u01ba\u01bc\5|?\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2"+
		"\2\u01bc\3\3\2\2\2\u01bd\u01c6\5\u01ac\u00d7\2\u01be\u01c6\7?\2\2\u01bf"+
		"\u01c0\7O\2\2\u01c0\u01c1\5^\60\2\u01c1\u01c2\7P\2\2\u01c2\u01c6\3\2\2"+
		"\2\u01c3\u01c6\5\b\5\2\u01c4\u01c6\5\20\t\2\u01c5\u01bd\3\2\2\2\u01c5"+
		"\u01be\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\5\3\2\2\2\u01c7\u01ca\5\n\6\2\u01c8\u01ca\5\f\7\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\7\3\2\2\2\u01cb\u01ce\5\n\6\2\u01cc"+
		"\u01ce\5\f\7\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\t\3\2\2\2"+
		"\u01cf\u01d9\7~\2\2\u01d0\u01d9\5\u0176\u00bc\2\u01d1\u01d9\5\u0168\u00b5"+
		"\2\u01d2\u01d9\5\u0178\u00bd\2\u01d3\u01d4\7]\2\2\u01d4\u01d9\5\u0140"+
		"\u00a1\2\u01d5\u01d6\7]\2\2\u01d6\u01d9\5\u00ba^\2\u01d7\u01d9\5\u0184"+
		"\u00c3\2\u01d8\u01cf\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d8"+
		"\u01d2\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d9\13\3\2\2\2\u01da\u01dc\5\16\b\2\u01db\u01dd\7>\2\2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5\n\6\2\u01df"+
		"\r\3\2\2\2\u01e0\u01e1\b\b\1\2\u01e1\u01ec\7y\2\2\u01e2\u01e3\5\u00b8"+
		"]\2\u01e3\u01e4\7y\2\2\u01e4\u01ec\3\2\2\2\u01e5\u01e6\5\u00d0i\2\u01e6"+
		"\u01e7\7y\2\2\u01e7\u01ec\3\2\2\2\u01e8\u01e9\5\u00ba^\2\u01e9\u01ea\7"+
		"y\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e0\3\2\2\2\u01eb\u01e2\3\2\2\2\u01eb"+
		"\u01e5\3\2\2\2\u01eb\u01e8\3\2\2\2\u01ec\u01f9\3\2\2\2\u01ed\u01ee\f\4"+
		"\2\2\u01ee\u01ef\7~\2\2\u01ef\u01f8\7y\2\2\u01f0\u01f2\f\3\2\2\u01f1\u01f3"+
		"\7>\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\5\u0182\u00c2\2\u01f5\u01f6\7y\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01ed"+
		"\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\17\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fe\5\22\n"+
		"\2\u01fd\u01ff\5 \21\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0201\5h\65\2\u0201\21\3\2\2\2\u0202\u0204\7Q\2\2\u0203"+
		"\u0205\5\24\13\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3"+
		"\2\2\2\u0206\u0207\7R\2\2\u0207\23\3\2\2\2\u0208\u020f\5\26\f\2\u0209"+
		"\u020f\5\30\r\2\u020a\u020b\5\26\f\2\u020b\u020c\7t\2\2\u020c\u020d\5"+
		"\30\r\2\u020d\u020f\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u0209\3\2\2\2\u020e"+
		"\u020a\3\2\2\2\u020f\25\3\2\2\2\u0210\u0211\t\2\2\2\u0211\27\3\2\2\2\u0212"+
		"\u0213\b\r\1\2\u0213\u0215\5\32\16\2\u0214\u0216\7}\2\2\u0215\u0214\3"+
		"\2\2\2\u0215\u0216\3\2\2\2\u0216\u021f\3\2\2\2\u0217\u0218\f\3\2\2\u0218"+
		"\u0219\7t\2\2\u0219\u021b\5\32\16\2\u021a\u021c\7}\2\2\u021b\u021a\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0217\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\31\3\2\2"+
		"\2\u0221\u021f\3\2\2\2\u0222\u0225\5\34\17\2\u0223\u0225\5\36\20\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\33\3\2\2\2\u0226\u022b\7~\2\2"+
		"\u0227\u0228\7[\2\2\u0228\u022b\7~\2\2\u0229\u022b\7?\2\2\u022a\u0226"+
		"\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0229\3\2\2\2\u022b\35\3\2\2\2\u022c"+
		"\u022d\7~\2\2\u022d\u0232\5\u0136\u009c\2\u022e\u022f\7[\2\2\u022f\u0230"+
		"\7~\2\2\u0230\u0232\5\u0136\u009c\2\u0231\u022c\3\2\2\2\u0231\u022e\3"+
		"\2\2\2\u0232\37\3\2\2\2\u0233\u0234\7O\2\2\u0234\u0235\5\u0128\u0095\2"+
		"\u0235\u0237\7P\2\2\u0236\u0238\7)\2\2\u0237\u0236\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\5\u019e\u00d0\2\u023a\u0239\3"+
		"\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023e\5\u00eex\2"+
		"\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241"+
		"\5\u0110\u0089\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241!\3\2\2"+
		"\2\u0242\u0243\b\22\1\2\u0243\u0283\5\4\3\2\u0244\u0245\5\u00b6\\\2\u0245"+
		"\u0247\7O\2\2\u0246\u0248\5$\23\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7P\2\2\u024a\u0283\3\2\2\2\u024b"+
		"\u024c\5\u018c\u00c7\2\u024c\u024e\7O\2\2\u024d\u024f\5$\23\2\u024e\u024d"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7P\2\2\u0251"+
		"\u0283\3\2\2\2\u0252\u0253\7\31\2\2\u0253\u0254\7`\2\2\u0254\u0255\5\u011c"+
		"\u008f\2\u0255\u0256\7a\2\2\u0256\u0257\7O\2\2\u0257\u0258\5^\60\2\u0258"+
		"\u0259\7P\2\2\u0259\u0283\3\2\2\2\u025a\u025b\7;\2\2\u025b\u025c\7`\2"+
		"\2\u025c\u025d\5\u011c\u008f\2\u025d\u025e\7a\2\2\u025e\u025f\7O\2\2\u025f"+
		"\u0260\5^\60\2\u0260\u0261\7P\2\2\u0261\u0283\3\2\2\2\u0262\u0263\7\64"+
		"\2\2\u0263\u0264\7`\2\2\u0264\u0265\5\u011c\u008f\2\u0265\u0266\7a\2\2"+
		"\u0266\u0267\7O\2\2\u0267\u0268\5^\60\2\u0268\u0269\7P\2\2\u0269\u0283"+
		"\3\2\2\2\u026a\u026b\7\22\2\2\u026b\u026c\7`\2\2\u026c\u026d\5\u011c\u008f"+
		"\2\u026d\u026e\7a\2\2\u026e\u026f\7O\2\2\u026f\u0270\5^\60\2\u0270\u0271"+
		"\7P\2\2\u0271\u0283\3\2\2\2\u0272\u0273\7E\2\2\u0273\u0274\7O\2\2\u0274"+
		"\u0275\5^\60\2\u0275\u0276\7P\2\2\u0276\u0283\3\2\2\2\u0277\u0278\7E\2"+
		"\2\u0278\u0279\7O\2\2\u0279\u027a\5\u011c\u008f\2\u027a\u027b\7P\2\2\u027b"+
		"\u0283\3\2\2\2\u027c\u027d\5\u00b6\\\2\u027d\u027e\5\u013e\u00a0\2\u027e"+
		"\u0283\3\2\2\2\u027f\u0280\5\u018c\u00c7\2\u0280\u0281\5\u013e\u00a0\2"+
		"\u0281\u0283\3\2\2\2\u0282\u0242\3\2\2\2\u0282\u0244\3\2\2\2\u0282\u024b"+
		"\3\2\2\2\u0282\u0252\3\2\2\2\u0282\u025a\3\2\2\2\u0282\u0262\3\2\2\2\u0282"+
		"\u026a\3\2\2\2\u0282\u0272\3\2\2\2\u0282\u0277\3\2\2\2\u0282\u027c\3\2"+
		"\2\2\u0282\u027f\3\2\2\2\u0283\u02a7\3\2\2\2\u0284\u0285\f\24\2\2\u0285"+
		"\u0286\7Q\2\2\u0286\u0287\5\u013e\u00a0\2\u0287\u0288\7R\2\2\u0288\u02a6"+
		"\3\2\2\2\u0289\u028a\f\23\2\2\u028a\u028c\7O\2\2\u028b\u028d\5$\23\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u02a6\7P"+
		"\2\2\u028f\u0290\f\n\2\2\u0290\u0292\7{\2\2\u0291\u0293\7>\2\2\u0292\u0291"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u02a6\5\6\4\2\u0295"+
		"\u0296\f\t\2\2\u0296\u0298\7v\2\2\u0297\u0299\7>\2\2\u0298\u0297\3\2\2"+
		"\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a6\5\6\4\2\u029b\u029c"+
		"\f\b\2\2\u029c\u029d\7{\2\2\u029d\u02a6\5&\24\2\u029e\u029f\f\7\2\2\u029f"+
		"\u02a0\7v\2\2\u02a0\u02a6\5&\24\2\u02a1\u02a2\f\6\2\2\u02a2\u02a6\7r\2"+
		"\2\u02a3\u02a4\f\5\2\2\u02a4\u02a6\7s\2\2\u02a5\u0284\3\2\2\2\u02a5\u0289"+
		"\3\2\2\2\u02a5\u028f\3\2\2\2\u02a5\u0295\3\2\2\2\u02a5\u029b\3\2\2\2\u02a5"+
		"\u029e\3\2\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8#\3\2\2\2\u02a9\u02a7"+
		"\3\2\2\2\u02aa\u02ab\5\u013c\u009f\2\u02ab%\3\2\2\2\u02ac\u02ae\5\16\b"+
		"\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0"+
		"\5\u00b8]\2\u02b0\u02b1\7y\2\2\u02b1\u02b2\7]\2\2\u02b2\u02b3\5\u00b8"+
		"]\2\u02b3\u02c3\3\2\2\2\u02b4\u02b5\5\16\b\2\u02b5\u02b6\7>\2\2\u02b6"+
		"\u02b7\5\u0182\u00c2\2\u02b7\u02b8\7y\2\2\u02b8\u02b9\7]\2\2\u02b9\u02ba"+
		"\5\u00b8]\2\u02ba\u02c3\3\2\2\2\u02bb\u02bd\5\16\b\2\u02bc\u02bb\3\2\2"+
		"\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7]\2\2\u02bf\u02c3"+
		"\5\u00b8]\2\u02c0\u02c1\7]\2\2\u02c1\u02c3\5\u00ba^\2\u02c2\u02ad\3\2"+
		"\2\2\u02c2\u02b4\3\2\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3"+
		"\'\3\2\2\2\u02c4\u02c5\b\25\1\2\u02c5\u02c6\5\"\22\2\u02c6\u02c7\7Q\2"+
		"\2\u02c7\u02c8\5Z.\2\u02c8\u02c9\7R\2\2\u02c9\u02d1\3\2\2\2\u02ca\u02cb"+
		"\f\3\2\2\u02cb\u02cc\7Q\2\2\u02cc\u02cd\5Z.\2\u02cd\u02ce\7R\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02ca\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d1\u02d2\3\2\2\2\u02d2)\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02ea"+
		"\5\"\22\2\u02d5\u02ea\5,\27\2\u02d6\u02ea\5(\25\2\u02d7\u02d8\78\2\2\u02d8"+
		"\u02d9\7O\2\2\u02d9\u02da\5\u011c\u008f\2\u02da\u02db\7P\2\2\u02db\u02ea"+
		"\3\2\2\2\u02dc\u02dd\78\2\2\u02dd\u02de\7}\2\2\u02de\u02df\7O\2\2\u02df"+
		"\u02e0\7~\2\2\u02e0\u02ea\7P\2\2\u02e1\u02e2\7\5\2\2\u02e2\u02e3\7O\2"+
		"\2\u02e3\u02e4\5\u011c\u008f\2\u02e4\u02e5\7P\2\2\u02e5\u02ea\3\2\2\2"+
		"\u02e6\u02ea\5> \2\u02e7\u02ea\5\60\31\2\u02e8\u02ea\5<\37\2\u02e9\u02d4"+
		"\3\2\2\2\u02e9\u02d5\3\2\2\2\u02e9\u02d6\3\2\2\2\u02e9\u02d7\3\2\2\2\u02e9"+
		"\u02dc\3\2\2\2\u02e9\u02e1\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02e8\3\2\2\2\u02ea+\3\2\2\2\u02eb\u02ec\7r\2\2\u02ec\u02f5"+
		"\5@!\2\u02ed\u02ee\7s\2\2\u02ee\u02f5\5@!\2\u02ef\u02f0\5.\30\2\u02f0"+
		"\u02f1\5@!\2\u02f1\u02f5\3\2\2\2\u02f2\u02f3\78\2\2\u02f3\u02f5\5*\26"+
		"\2\u02f4\u02eb\3\2\2\2\u02f4\u02ed\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f5-\3\2\2\2\u02f6\u02f7\t\3\2\2\u02f7/\3\2\2\2\u02f8\u02fa"+
		"\7y\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\7+\2\2\u02fc\u02fe\5\62\32\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3"+
		"\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\5\64\33\2\u0300\u0302\5:\36\2\u0301"+
		"\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0311\3\2\2\2\u0303\u0305\7y"+
		"\2\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0308\7+\2\2\u0307\u0309\5\62\32\2\u0308\u0307\3\2\2\2\u0308\u0309\3"+
		"\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\7O\2\2\u030b\u030c\5\u011c\u008f"+
		"\2\u030c\u030e\7P\2\2\u030d\u030f\5:\36\2\u030e\u030d\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u02f9\3\2\2\2\u0310\u0304\3\2\2\2\u0311"+
		"\61\3\2\2\2\u0312\u0313\7O\2\2\u0313\u0314\5$\23\2\u0314\u0315\7P\2\2"+
		"\u0315\63\3\2\2\2\u0316\u0318\5\u00b2Z\2\u0317\u0319\5\66\34\2\u0318\u0317"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\65\3\2\2\2\u031a\u031c\5\u0112\u008a"+
		"\2\u031b\u031d\5\66\34\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u0320\3\2\2\2\u031e\u0320\58\35\2\u031f\u031a\3\2\2\2\u031f\u031e\3\2"+
		"\2\2\u0320\67\3\2\2\2\u0321\u0322\b\35\1\2\u0322\u0323\7Q\2\2\u0323\u0324"+
		"\5^\60\2\u0324\u0326\7R\2\2\u0325\u0327\5\u00eex\2\u0326\u0325\3\2\2\2"+
		"\u0326\u0327\3\2\2\2\u0327\u0331\3\2\2\2\u0328\u0329\f\3\2\2\u0329\u032a"+
		"\7Q\2\2\u032a\u032b\5`\61\2\u032b\u032d\7R\2\2\u032c\u032e\5\u00eex\2"+
		"\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u0328"+
		"\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"9\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0336\7O\2\2\u0335\u0337\5$\23\2\u0336"+
		"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\7P"+
		"\2\2\u0339\u033b\5\u013e\u00a0\2\u033a\u0334\3\2\2\2\u033a\u0339\3\2\2"+
		"\2\u033b;\3\2\2\2\u033c\u033e\7y\2\2\u033d\u033c\3\2\2\2\u033d\u033e\3"+
		"\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7\26\2\2\u0340\u0349\5@!\2\u0341"+
		"\u0343\7y\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0345\7\26\2\2\u0345\u0346\7Q\2\2\u0346\u0347\7R\2\2\u0347"+
		"\u0349\5@!\2\u0348\u033d\3\2\2\2\u0348\u0342\3\2\2\2\u0349=\3\2\2\2\u034a"+
		"\u034b\7,\2\2\u034b\u034c\7O\2\2\u034c\u034d\5^\60\2\u034d\u034e\7P\2"+
		"\2\u034e?\3\2\2\2\u034f\u0356\5*\26\2\u0350\u0351\7O\2\2\u0351\u0352\5"+
		"\u011c\u008f\2\u0352\u0353\7P\2\2\u0353\u0354\5@!\2\u0354\u0356\3\2\2"+
		"\2\u0355\u034f\3\2\2\2\u0355\u0350\3\2\2\2\u0356A\3\2\2\2\u0357\u0358"+
		"\b\"\1\2\u0358\u0359\5@!\2\u0359\u0362\3\2\2\2\u035a\u035b\f\4\2\2\u035b"+
		"\u035c\7|\2\2\u035c\u0361\5@!\2\u035d\u035e\f\3\2\2\u035e\u035f\7u\2\2"+
		"\u035f\u0361\5@!\2\u0360\u035a\3\2\2\2\u0360\u035d\3\2\2\2\u0361\u0364"+
		"\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363C\3\2\2\2\u0364"+
		"\u0362\3\2\2\2\u0365\u0366\b#\1\2\u0366\u0367\5B\"\2\u0367\u0373\3\2\2"+
		"\2\u0368\u0369\f\5\2\2\u0369\u036a\7W\2\2\u036a\u0372\5B\"\2\u036b\u036c"+
		"\f\4\2\2\u036c\u036d\7X\2\2\u036d\u0372\5B\"\2\u036e\u036f\f\3\2\2\u036f"+
		"\u0370\7Y\2\2\u0370\u0372\5B\"\2\u0371\u0368\3\2\2\2\u0371\u036b\3\2\2"+
		"\2\u0371\u036e\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374E\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0377\b$\1\2\u0377\u0378"+
		"\5D#\2\u0378\u0381\3\2\2\2\u0379\u037a\f\4\2\2\u037a\u037b\7U\2\2\u037b"+
		"\u0380\5D#\2\u037c\u037d\f\3\2\2\u037d\u037e\7V\2\2\u037e\u0380\5D#\2"+
		"\u037f\u0379\3\2\2\2\u037f\u037c\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382G\3\2\2\2\u0383\u0381\3\2\2\2\u0384"+
		"\u0385\b%\1\2\u0385\u0386\5F$\2\u0386\u0390\3\2\2\2\u0387\u0388\f\4\2"+
		"\2\u0388\u0389\7j\2\2\u0389\u038f\5F$\2\u038a\u038b\f\3\2\2\u038b\u038c"+
		"\5\u01a6\u00d4\2\u038c\u038d\5F$\2\u038d\u038f\3\2\2\2\u038e\u0387\3\2"+
		"\2\2\u038e\u038a\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391I\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\b&\1\2\u0394"+
		"\u0395\5H%\2\u0395\u03a4\3\2\2\2\u0396\u0397\f\6\2\2\u0397\u0398\7`\2"+
		"\2\u0398\u03a3\5H%\2\u0399\u039a\f\5\2\2\u039a\u039b\7a\2\2\u039b\u03a3"+
		"\5H%\2\u039c\u039d\f\4\2\2\u039d\u039e\7n\2\2\u039e\u03a3\5H%\2\u039f"+
		"\u03a0\f\3\2\2\u03a0\u03a1\7o\2\2\u03a1\u03a3\5H%\2\u03a2\u0396\3\2\2"+
		"\2\u03a2\u0399\3\2\2\2\u03a2\u039c\3\2\2\2\u03a2\u039f\3\2\2\2\u03a3\u03a6"+
		"\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5K\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a7\u03a8\b\'\1\2\u03a8\u03a9\5J&\2\u03a9\u03b2\3\2\2"+
		"\2\u03aa\u03ab\f\4\2\2\u03ab\u03ac\7l\2\2\u03ac\u03b1\5J&\2\u03ad\u03ae"+
		"\f\3\2\2\u03ae\u03af\7m\2\2\u03af\u03b1\5J&\2\u03b0\u03aa\3\2\2\2\u03b0"+
		"\u03ad\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3M\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\b(\1\2\u03b6\u03b7"+
		"\5L\'\2\u03b7\u03bd\3\2\2\2\u03b8\u03b9\f\3\2\2\u03b9\u03ba\7[\2\2\u03ba"+
		"\u03bc\5L\'\2\u03bb\u03b8\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03beO\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c1"+
		"\b)\1\2\u03c1\u03c2\5N(\2\u03c2\u03c8\3\2\2\2\u03c3\u03c4\f\3\2\2\u03c4"+
		"\u03c5\7Z\2\2\u03c5\u03c7\5N(\2\u03c6\u03c3\3\2\2\2\u03c7\u03ca\3\2\2"+
		"\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9Q\3\2\2\2\u03ca\u03c8"+
		"\3\2\2\2\u03cb\u03cc\b*\1\2\u03cc\u03cd\5P)\2\u03cd\u03d3\3\2\2\2\u03ce"+
		"\u03cf\f\3\2\2\u03cf\u03d0\7\\\2\2\u03d0\u03d2\5P)\2\u03d1\u03ce\3\2\2"+
		"\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4S"+
		"\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\b+\1\2\u03d7\u03d8\5R*\2\u03d8"+
		"\u03de\3\2\2\2\u03d9\u03da\f\3\2\2\u03da\u03db\7p\2\2\u03db\u03dd\5R*"+
		"\2\u03dc\u03d9\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03dfU\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\b,\1\2\u03e2\u03e3"+
		"\5T+\2\u03e3\u03e9\3\2\2\2\u03e4\u03e5\f\3\2\2\u03e5\u03e6\7q\2\2\u03e6"+
		"\u03e8\5T+\2\u03e7\u03e4\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2"+
		"\2\u03e9\u03ea\3\2\2\2\u03eaW\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03f4"+
		"\5V,\2\u03ed\u03ee\5V,\2\u03ee\u03ef\7w\2\2\u03ef\u03f0\5^\60\2\u03f0"+
		"\u03f1\7x\2\2\u03f1\u03f2\5Z.\2\u03f2\u03f4\3\2\2\2\u03f3\u03ec\3\2\2"+
		"\2\u03f3\u03ed\3\2\2\2\u03f4Y\3\2\2\2\u03f5\u03fc\5X-\2\u03f6\u03f7\5"+
		"V,\2\u03f7\u03f8\5\\/\2\u03f8\u03f9\5\u013a\u009e\2\u03f9\u03fc\3\2\2"+
		"\2\u03fa\u03fc\5\u019c\u00cf\2\u03fb\u03f5\3\2\2\2\u03fb\u03f6\3\2\2\2"+
		"\u03fb\u03fa\3\2\2\2\u03fc[\3\2\2\2\u03fd\u0409\7_\2\2\u03fe\u0409\7d"+
		"\2\2\u03ff\u0409\7e\2\2\u0400\u0409\7f\2\2\u0401\u0409\7b\2\2\u0402\u0409"+
		"\7c\2\2\u0403\u0409\5\u01a8\u00d5\2\u0404\u0409\7k\2\2\u0405\u0409\7h"+
		"\2\2\u0406\u0409\7g\2\2\u0407\u0409\7i\2\2\u0408\u03fd\3\2\2\2\u0408\u03fe"+
		"\3\2\2\2\u0408\u03ff\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0401\3\2\2\2\u0408"+
		"\u0402\3\2\2\2\u0408\u0403\3\2\2\2\u0408\u0404\3\2\2\2\u0408\u0405\3\2"+
		"\2\2\u0408\u0406\3\2\2\2\u0408\u0407\3\2\2\2\u0409]\3\2\2\2\u040a\u040b"+
		"\b\60\1\2\u040b\u040c\5Z.\2\u040c\u0412\3\2\2\2\u040d\u040e\f\3\2\2\u040e"+
		"\u040f\7t\2\2\u040f\u0411\5Z.\2\u0410\u040d\3\2\2\2\u0411\u0414\3\2\2"+
		"\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413_\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0415\u0416\5X-\2\u0416a\3\2\2\2\u0417\u0433\5d\63\2\u0418\u041a"+
		"\5\u00eex\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2"+
		"\2\u041b\u0433\5f\64\2\u041c\u041e\5\u00eex\2\u041d\u041c\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0433\5h\65\2\u0420\u0422\5\u00ee"+
		"x\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0433\5l\67\2\u0424\u0426\5\u00eex\2\u0425\u0424\3\2\2\2\u0425\u0426"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0433\5p9\2\u0428\u042a\5\u00eex\2"+
		"\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0433"+
		"\5x=\2\u042c\u0433\5\u0086D\2\u042d\u0433\5z>\2\u042e\u0430\5\u00eex\2"+
		"\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433"+
		"\5\u0192\u00ca\2\u0432\u0417\3\2\2\2\u0432\u0419\3\2\2\2\u0432\u041d\3"+
		"\2\2\2\u0432\u0421\3\2\2\2\u0432\u0425\3\2\2\2\u0432\u0429\3\2\2\2\u0432"+
		"\u042c\3\2\2\2\u0432\u042d\3\2\2\2\u0432\u042f\3\2\2\2\u0433c\3\2\2\2"+
		"\u0434\u0436\5\u00eex\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0438\7~\2\2\u0438\u0439\7x\2\2\u0439\u0449\5b\62"+
		"\2\u043a\u043c\5\u00eex\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043d\3\2\2\2\u043d\u043e\7\n\2\2\u043e\u043f\5`\61\2\u043f\u0440\7x"+
		"\2\2\u0440\u0441\5b\62\2\u0441\u0449\3\2\2\2\u0442\u0444\5\u00eex\2\u0443"+
		"\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7\25"+
		"\2\2\u0446\u0447\7x\2\2\u0447\u0449\5b\62\2\u0448\u0435\3\2\2\2\u0448"+
		"\u043b\3\2\2\2\u0448\u0443\3\2\2\2\u0449e\3\2\2\2\u044a\u044c\5^\60\2"+
		"\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e"+
		"\7z\2\2\u044eg\3\2\2\2\u044f\u0451\7S\2\2\u0450\u0452\5j\66\2\u0451\u0450"+
		"\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7T\2\2\u0454"+
		"i\3\2\2\2\u0455\u0459\5b\62\2\u0456\u0458\5b\62\2\u0457\u0456\3\2\2\2"+
		"\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045ak\3"+
		"\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\7%\2\2\u045d\u045e\7O\2\2\u045e"+
		"\u045f\5n8\2\u045f\u0460\7P\2\2\u0460\u0461\5b\62\2\u0461\u0471\3\2\2"+
		"\2\u0462\u0463\7%\2\2\u0463\u0464\7O\2\2\u0464\u0465\5n8\2\u0465\u0466"+
		"\7P\2\2\u0466\u0467\5b\62\2\u0467\u0468\7\32\2\2\u0468\u0469\5b\62\2\u0469"+
		"\u0471\3\2\2\2\u046a\u046b\7=\2\2\u046b\u046c\7O\2\2\u046c\u046d\5n8\2"+
		"\u046d\u046e\7P\2\2\u046e\u046f\5b\62\2\u046f\u0471\3\2\2\2\u0470\u045c"+
		"\3\2\2\2\u0470\u0462\3\2\2\2\u0470\u046a\3\2\2\2\u0471m\3\2\2\2\u0472"+
		"\u0483\5^\60\2\u0473\u0475\5\u00eex\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\5\u00a2R\2\u0477\u0478\5\u0108"+
		"\u0085\2\u0478\u0479\7_\2\2\u0479\u047a\5\u013a\u009e\2\u047a\u0483\3"+
		"\2\2\2\u047b\u047d\5\u00eex\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2"+
		"\u047d\u047e\3\2\2\2\u047e\u047f\5\u00a2R\2\u047f\u0480\5\u0108\u0085"+
		"\2\u0480\u0481\5\u013e\u00a0\2\u0481\u0483\3\2\2\2\u0482\u0472\3\2\2\2"+
		"\u0482\u0474\3\2\2\2\u0482\u047c\3\2\2\2\u0483o\3\2\2\2\u0484\u0485\7"+
		"N\2\2\u0485\u0486\7O\2\2\u0486\u0487\5n8\2\u0487\u0488\7P\2\2\u0488\u0489"+
		"\5b\62\2\u0489\u04a8\3\2\2\2\u048a\u048b\7\27\2\2\u048b\u048c\5b\62\2"+
		"\u048c\u048d\7N\2\2\u048d\u048e\7O\2\2\u048e\u048f\5^\60\2\u048f\u0490"+
		"\7P\2\2\u0490\u0491\7z\2\2\u0491\u04a8\3\2\2\2\u0492\u0493\7\"\2\2\u0493"+
		"\u0494\7O\2\2\u0494\u0496\5r:\2\u0495\u0497\5n8\2\u0496\u0495\3\2\2\2"+
		"\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\7z\2\2\u0499\u049b"+
		"\5^\60\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u049d\7P\2\2\u049d\u049e\5b\62\2\u049e\u04a8\3\2\2\2\u049f\u04a0\7\""+
		"\2\2\u04a0\u04a1\7O\2\2\u04a1\u04a2\5t;\2\u04a2\u04a3\7x\2\2\u04a3\u04a4"+
		"\5v<\2\u04a4\u04a5\7P\2\2\u04a5\u04a6\5b\62\2\u04a6\u04a8\3\2\2\2\u04a7"+
		"\u0484\3\2\2\2\u04a7\u048a\3\2\2\2\u04a7\u0492\3\2\2\2\u04a7\u049f\3\2"+
		"\2\2\u04a8q\3\2\2\2\u04a9\u04ac\5f\64\2\u04aa\u04ac\5\u0098M\2\u04ab\u04a9"+
		"\3\2\2\2\u04ab\u04aa\3\2\2\2\u04acs\3\2\2\2\u04ad\u04af\5\u00eex\2\u04ae"+
		"\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\5\u00a2"+
		"R\2\u04b1\u04b2\5\u0108\u0085\2\u04b2u\3\2\2\2\u04b3\u04b6\5^\60\2\u04b4"+
		"\u04b6\5\u013e\u00a0\2\u04b5\u04b3\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6w"+
		"\3\2\2\2\u04b7\u04b8\7\t\2\2\u04b8\u04c8\7z\2\2\u04b9\u04ba\7\23\2\2\u04ba"+
		"\u04c8\7z\2\2\u04bb\u04bd\7\65\2\2\u04bc\u04be\5^\60\2\u04bd\u04bc\3\2"+
		"\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c8\7z\2\2\u04c0"+
		"\u04c1\7\65\2\2\u04c1\u04c2\5\u013e\u00a0\2\u04c2\u04c3\7z\2\2\u04c3\u04c8"+
		"\3\2\2\2\u04c4\u04c5\7$\2\2\u04c5\u04c6\7~\2\2\u04c6\u04c8\7z\2\2\u04c7"+
		"\u04b7\3\2\2\2\u04c7\u04b9\3\2\2\2\u04c7\u04bb\3\2\2\2\u04c7\u04c0\3\2"+
		"\2\2\u04c7\u04c4\3\2\2\2\u04c8y\3\2\2\2\u04c9\u04cc\5\u0098M\2\u04ca\u04cc"+
		"\5\u0080A\2\u04cb\u04c9\3\2\2\2\u04cb\u04ca\3\2\2\2\u04cc{\3\2\2\2\u04cd"+
		"\u04ce\b?\1\2\u04ce\u04cf\5~@\2\u04cf\u04d4\3\2\2\2\u04d0\u04d1\f\3\2"+
		"\2\u04d1\u04d3\5~@\2\u04d2\u04d0\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2"+
		"\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5}\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7"+
		"\u04e1\5\u0082B\2\u04d8\u04e1\5\u012e\u0098\2\u04d9\u04e1\5\u017a\u00be"+
		"\2\u04da\u04e1\5\u018e\u00c8\2\u04db\u04e1\5\u0190\u00c9\2\u04dc\u04e1"+
		"\5\u00ecw\2\u04dd\u04e1\5\u00d4k\2\u04de\u04e1\5\u009cO\2\u04df\u04e1"+
		"\5\u009eP\2\u04e0\u04d7\3\2\2\2\u04e0\u04d8\3\2\2\2\u04e0\u04d9\3\2\2"+
		"\2\u04e0\u04da\3\2\2\2\u04e0\u04db\3\2\2\2\u04e0\u04dc\3\2\2\2\u04e0\u04dd"+
		"\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04df\3\2\2\2\u04e1\177\3\2\2\2\u04e2"+
		"\u04ea\5\u00eav\2\u04e3\u04ea\5\u00e2r\2\u04e4\u04ea\5\u00e6t\2\u04e5"+
		"\u04ea\5\u00e8u\2\u04e6\u04ea\5\u009aN\2\u04e7\u04ea\5\u0084C\2\u04e8"+
		"\u04ea\5\u00c4c\2\u04e9\u04e2\3\2\2\2\u04e9\u04e3\3\2\2\2\u04e9\u04e4"+
		"\3\2\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9"+
		"\u04e8\3\2\2\2\u04ea\u0081\3\2\2\2\u04eb\u04ee\5\u0098M\2\u04ec\u04ee"+
		"\5\u0080A\2\u04ed\u04eb\3\2\2\2\u04ed\u04ec\3\2\2\2\u04ee\u0083\3\2\2"+
		"\2\u04ef\u04f0\7I\2\2\u04f0\u04f2\7~\2\2\u04f1\u04f3\5\u00eex\2\u04f2"+
		"\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\7_"+
		"\2\2\u04f5\u04f6\5\u011c\u008f\2\u04f6\u04f7\7z\2\2\u04f7\u0085\3\2\2"+
		"\2\u04f8\u04f9\5\u0088E\2\u04f9\u04fa\7z\2\2\u04fa\u0087\3\2\2\2\u04fb"+
		"\u04fd\5\u00eex\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff"+
		"\3\2\2\2\u04fe\u0500\5\u00a6T\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2"+
		"\2\u0500\u0501\3\2\2\2\u0501\u0505\5\u00aeX\2\u0502\u0504\5\u0112\u008a"+
		"\2\u0503\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050a\5\u008aF"+
		"\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0089\3\2\2\2\u050b\u050c"+
		"\bF\1\2\u050c\u050f\5\u0094K\2\u050d\u050f\5\u008cG\2\u050e\u050b\3\2"+
		"\2\2\u050e\u050d\3\2\2\2\u050f\u0515\3\2\2\2\u0510\u0511\f\3\2\2\u0511"+
		"\u0512\7t\2\2\u0512\u0514\5\u0094K\2\u0513\u0510\3\2\2\2\u0514\u0517\3"+
		"\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u008b\3\2\2\2\u0517"+
		"\u0515\3\2\2\2\u0518\u0519\5\u011a\u008e\2\u0519\u051c\5\u0096L\2\u051a"+
		"\u051b\7_\2\2\u051b\u051d\5\u013a\u009e\2\u051c\u051a\3\2\2\2\u051c\u051d"+
		"\3\2\2\2\u051d\u0522\3\2\2\2\u051e\u051f\5\u011a\u008e\2\u051f\u0520\5"+
		"\u008eH\2\u0520\u0522\3\2\2\2\u0521\u0518\3\2\2\2\u0521\u051e\3\2\2\2"+
		"\u0522\u008d\3\2\2\2\u0523\u0525\5\u0090I\2\u0524\u0526\5\u0096L\2\u0525"+
		"\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0528\7_"+
		"\2\2\u0528\u052a\5\u013e\u00a0\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2"+
		"\2\u052a\u052f\3\2\2\2\u052b\u052c\5\u0096L\2\u052c\u052d\5\u013e\u00a0"+
		"\2\u052d\u052f\3\2\2\2\u052e\u0523\3\2\2\2\u052e\u052b\3\2\2\2\u052f\u008f"+
		"\3\2\2\2\u0530\u0534\5\u0092J\2\u0531\u0533\5\u0092J\2\u0532\u0531\3\2"+
		"\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0091\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\7Q\2\2\u0538\u0539\5^\60"+
		"\2\u0539\u053a\7R\2\2\u053a\u0093\3\2\2\2\u053b\u053e\5\u011a\u008e\2"+
		"\u053c\u053d\7_\2\2\u053d\u053f\5\u013a\u009e\2\u053e\u053c\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u0095\3\2\2\2\u0540\u0541\7Q\2\2\u0541\u0546\7R\2"+
		"\2\u0542\u0543\7Q\2\2\u0543\u0545\7R\2\2\u0544\u0542\3\2\2\2\u0545\u0548"+
		"\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0097\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0549\u054b\5\u00a2R\2\u054a\u0549\3\2\2\2\u054a\u054b"+
		"\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u054e\5\u0104\u0083\2\u054d\u054c\3"+
		"\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0558\7z\2\2\u0550"+
		"\u0552\5\u00eex\2\u0551\u0553\5\u00a2R\2\u0552\u0551\3\2\2\2\u0552\u0553"+
		"\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\5\u0104\u0083\2\u0555\u0556\7"+
		"z\2\2\u0556\u0558\3\2\2\2\u0557\u054a\3\2\2\2\u0557\u0550\3\2\2\2\u0558"+
		"\u0099\3\2\2\2\u0559\u055a\7:\2\2\u055a\u055b\7O\2\2\u055b\u055c\5`\61"+
		"\2\u055c\u055d\7t\2\2\u055d\u055e\7\u0087\2\2\u055e\u055f\7P\2\2\u055f"+
		"\u0560\7z\2\2\u0560\u009b\3\2\2\2\u0561\u0562\7z\2\2\u0562\u009d\3\2\2"+
		"\2\u0563\u0564\5\u00eex\2\u0564\u0565\7z\2\2\u0565\u009f\3\2\2\2\u0566"+
		"\u0569\5\u00a4S\2\u0567\u0569\5\u00aeX\2\u0568\u0566\3\2\2\2\u0568\u0567"+
		"\3\2\2\2\u0569\u00a1\3\2\2\2\u056a\u056c\5\u00a0Q\2\u056b\u056d\5\u00ee"+
		"x\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0572\3\2\2\2\u056e"+
		"\u056f\5\u00a0Q\2\u056f\u0570\5\u00a2R\2\u0570\u0572\3\2\2\2\u0571\u056a"+
		"\3\2\2\2\u0571\u056e\3\2\2\2\u0572\u00a3\3\2\2\2\u0573\u0579\5\u00a8U"+
		"\2\u0574\u0579\5\u00aaV\2\u0575\u0579\7#\2\2\u0576\u0579\7D\2\2\u0577"+
		"\u0579\7\21\2\2\u0578\u0573\3\2\2\2\u0578\u0574\3\2\2\2\u0578\u0575\3"+
		"\2\2\2\u0578\u0576\3\2\2\2\u0578\u0577\3\2\2\2\u0579\u00a5\3\2\2\2\u057a"+
		"\u057c\5\u00a4S\2\u057b\u057d\5\u00eex\2\u057c\u057b\3\2\2\2\u057c\u057d"+
		"\3\2\2\2\u057d\u0582\3\2\2\2\u057e\u057f\5\u00a4S\2\u057f\u0580\5\u00a2"+
		"R\2\u0580\u0582\3\2\2\2\u0581\u057a\3\2\2\2\u0581\u057e\3\2\2\2\u0582"+
		"\u00a7\3\2\2\2\u0583\u0584\t\4\2\2\u0584\u00a9\3\2\2\2\u0585\u0586\t\5"+
		"\2\2\u0586\u00ab\3\2\2\2\u0587\u0588\7~\2\2\u0588\u00ad\3\2\2\2\u0589"+
		"\u058d\5\u00b0Y\2\u058a\u058d\5\u0142\u00a2\2\u058b\u058d\5\u00c0a\2\u058c"+
		"\u0589\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058b\3\2\2\2\u058d\u00af\3\2"+
		"\2\2\u058e\u0593\5\u00b6\\\2\u058f\u0593\5\u00bc_\2\u0590\u0593\5\u018c"+
		"\u00c7\2\u0591\u0593\5\u0116\u008c\2\u0592\u058e\3\2\2\2\u0592\u058f\3"+
		"\2\2\2\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u00b1\3\2\2\2\u0594"+
		"\u0596\5\u00aeX\2\u0595\u0597\5\u00eex\2\u0596\u0595\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u059c\3\2\2\2\u0598\u0599\5\u00aeX\2\u0599\u059a\5\u00b2"+
		"Z\2\u059a\u059c\3\2\2\2\u059b\u0594\3\2\2\2\u059b\u0598\3\2\2\2\u059c"+
		"\u00b3\3\2\2\2\u059d\u059f\5\u00b0Y\2\u059e\u05a0\5\u00eex\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a5\3\2\2\2\u05a1\u05a2\5\u00b0Y"+
		"\2\u05a2\u05a3\5\u00b4[\2\u05a3\u05a5\3\2\2\2\u05a4\u059d\3\2\2\2\u05a4"+
		"\u05a1\3\2\2\2\u05a5\u00b5\3\2\2\2\u05a6\u05a8\5\16\b\2\u05a7\u05a6\3"+
		"\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05be\5\u00b8]\2"+
		"\u05aa\u05ab\5\16\b\2\u05ab\u05ac\7>\2\2\u05ac\u05ad\5\u0182\u00c2\2\u05ad"+
		"\u05be\3\2\2\2\u05ae\u05be\7\f\2\2\u05af\u05be\7\r\2\2\u05b0\u05be\7\16"+
		"\2\2\u05b1\u05be\7M\2\2\u05b2\u05be\7\b\2\2\u05b3\u05be\7\66\2\2\u05b4"+
		"\u05be\7\'\2\2\u05b5\u05be\7(\2\2\u05b6\u05be\7\67\2\2\u05b7\u05be\7H"+
		"\2\2\u05b8\u05be\7!\2\2\u05b9\u05be\7\30\2\2\u05ba\u05be\7K\2\2\u05bb"+
		"\u05be\7\7\2\2\u05bc\u05be\5\u00ba^\2\u05bd\u05a7\3\2\2\2\u05bd\u05aa"+
		"\3\2\2\2\u05bd\u05ae\3\2\2\2\u05bd\u05af\3\2\2\2\u05bd\u05b0\3\2\2\2\u05bd"+
		"\u05b1\3\2\2\2\u05bd\u05b2\3\2\2\2\u05bd\u05b3\3\2\2\2\u05bd\u05b4\3\2"+
		"\2\2\u05bd\u05b5\3\2\2\2\u05bd\u05b6\3\2\2\2\u05bd\u05b7\3\2\2\2\u05bd"+
		"\u05b8\3\2\2\2\u05bd\u05b9\3\2\2\2\u05bd\u05ba\3\2\2\2\u05bd\u05bb\3\2"+
		"\2\2\u05bd\u05bc\3\2\2\2\u05be\u00b7\3\2\2\2\u05bf\u05c4\5\u0140\u00a1"+
		"\2\u05c0\u05c4\5\u00be`\2\u05c1\u05c4\5\u00acW\2\u05c2\u05c4\5\u0182\u00c2"+
		"\2\u05c3\u05bf\3\2\2\2\u05c3\u05c0\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c2"+
		"\3\2\2\2\u05c4\u00b9\3\2\2\2\u05c5\u05c6\7\24\2\2\u05c6\u05c7\7O\2\2\u05c7"+
		"\u05c8\5^\60\2\u05c8\u05c9\7P\2\2\u05c9\u05cf\3\2\2\2\u05ca\u05cb\7\24"+
		"\2\2\u05cb\u05cc\7O\2\2\u05cc\u05cd\7\7\2\2\u05cd\u05cf\7P\2\2\u05ce\u05c5"+
		"\3\2\2\2\u05ce\u05ca\3\2\2\2\u05cf\u00bb\3\2\2\2\u05d0\u05d2\5\u014c\u00a7"+
		"\2\u05d1\u05d3\5\u00eex\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3"+
		"\u05d5\3\2\2\2\u05d4\u05d6\5\16\b\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3"+
		"\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\7~\2\2\u05d8\u05e9\3\2\2\2\u05d9"+
		"\u05da\5\u014c\u00a7\2\u05da\u05db\5\u0182\u00c2\2\u05db\u05e9\3\2\2\2"+
		"\u05dc\u05dd\5\u014c\u00a7\2\u05dd\u05df\5\16\b\2\u05de\u05e0\7>\2\2\u05df"+
		"\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\5\u0182"+
		"\u00c2\2\u05e2\u05e9\3\2\2\2\u05e3\u05e5\7\33\2\2\u05e4\u05e6\5\16\b\2"+
		"\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9"+
		"\7~\2\2\u05e8\u05d0\3\2\2\2\u05e8\u05d9\3\2\2\2\u05e8\u05dc\3\2\2\2\u05e8"+
		"\u05e3\3\2\2\2\u05e9\u00bd\3\2\2\2\u05ea\u05eb\7~\2\2\u05eb\u00bf\3\2"+
		"\2\2\u05ec\u05ed\5\u00c2b\2\u05ed\u05ef\7S\2\2\u05ee\u05f0\5\u00caf\2"+
		"\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2"+
		"\7T\2\2\u05f2\u05fa\3\2\2\2\u05f3\u05f4\5\u00c2b\2\u05f4\u05f5\7S\2\2"+
		"\u05f5\u05f6\5\u00caf\2\u05f6\u05f7\7t\2\2\u05f7\u05f8\7T\2\2\u05f8\u05fa"+
		"\3\2\2\2\u05f9\u05ec\3\2\2\2\u05f9\u05f3\3\2\2\2\u05fa\u00c1\3\2\2\2\u05fb"+
		"\u05fd\5\u00c6d\2\u05fc\u05fe\5\u00eex\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe"+
		"\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u0601\7~\2\2\u0600\u05ff\3\2\2\2\u0600"+
		"\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602\u0604\5\u00c8e\2\u0603\u0602"+
		"\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u060f\3\2\2\2\u0605\u0607\5\u00c6d"+
		"\2\u0606\u0608\5\u00eex\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u0609\3\2\2\2\u0609\u060a\5\16\b\2\u060a\u060c\7~\2\2\u060b\u060d\5\u00c8"+
		"e\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e"+
		"\u05fb\3\2\2\2\u060e\u0605\3\2\2\2\u060f\u00c3\3\2\2\2\u0610\u0612\5\u00c6"+
		"d\2\u0611\u0613\5\u00eex\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613"+
		"\u0614\3\2\2\2\u0614\u0616\7~\2\2\u0615\u0617\5\u00c8e\2\u0616\u0615\3"+
		"\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\7z\2\2\u0619"+
		"\u00c5\3\2\2\2\u061a\u0620\7\33\2\2\u061b\u061c\7\33\2\2\u061c\u0620\7"+
		"\17\2\2\u061d\u061e\7\33\2\2\u061e\u0620\7<\2\2\u061f\u061a\3\2\2\2\u061f"+
		"\u061b\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u00c7\3\2\2\2\u0621\u0622\7x"+
		"\2\2\u0622\u0623\5\u00b2Z\2\u0623\u00c9\3\2\2\2\u0624\u0625\bf\1\2\u0625"+
		"\u0626\5\u00ccg\2\u0626\u062c\3\2\2\2\u0627\u0628\f\3\2\2\u0628\u0629"+
		"\7t\2\2\u0629\u062b\5\u00ccg\2\u062a\u0627\3\2\2\2\u062b\u062e\3\2\2\2"+
		"\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u00cb\3\2\2\2\u062e\u062c"+
		"\3\2\2\2\u062f\u0635\5\u00ceh\2\u0630\u0631\5\u00ceh\2\u0631\u0632\7_"+
		"\2\2\u0632\u0633\5`\61\2\u0633\u0635\3\2\2\2\u0634\u062f\3\2\2\2\u0634"+
		"\u0630\3\2\2\2\u0635\u00cd\3\2\2\2\u0636\u0637\7~\2\2\u0637\u00cf\3\2"+
		"\2\2\u0638\u063b\5\u00d2j\2\u0639\u063b\5\u00e0q\2\u063a\u0638\3\2\2\2"+
		"\u063a\u0639\3\2\2\2\u063b\u00d1\3\2\2\2\u063c\u063d\7~\2\2\u063d\u00d3"+
		"\3\2\2\2\u063e\u0641\5\u00d6l\2\u063f\u0641\5\u00dco\2\u0640\u063e\3\2"+
		"\2\2\u0640\u063f\3\2\2\2\u0641\u00d5\3\2\2\2\u0642\u0645\5\u00d8m\2\u0643"+
		"\u0645\5\u00dan\2\u0644\u0642\3\2\2\2\u0644\u0643\3\2\2\2\u0645\u00d7"+
		"\3\2\2\2\u0646\u0648\7&\2\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u064a\7*\2\2\u064a\u064b\7~\2\2\u064b\u064c\7S\2"+
		"\2\u064c\u064d\5\u00dep\2\u064d\u064e\7T\2\2\u064e\u00d9\3\2\2\2\u064f"+
		"\u0651\7&\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2"+
		"\2\2\u0652\u0653\7*\2\2\u0653\u0654\5\u00d2j\2\u0654\u0655\7S\2\2\u0655"+
		"\u0656\5\u00dep\2\u0656\u0657\7T\2\2\u0657\u00db\3\2\2\2\u0658\u065a\7"+
		"&\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u065c\7*\2\2\u065c\u065d\7S\2\2\u065d\u065e\5\u00dep\2\u065e\u065f\7"+
		"T\2\2\u065f\u00dd\3\2\2\2\u0660\u0662\5|?\2\u0661\u0660\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u00df\3\2\2\2\u0663\u0664\7~\2\2\u0664\u00e1\3\2"+
		"\2\2\u0665\u0666\7*\2\2\u0666\u0667\7~\2\2\u0667\u0668\7_\2\2\u0668\u0669"+
		"\5\u00e4s\2\u0669\u066a\7z\2\2\u066a\u00e3\3\2\2\2\u066b\u066d\5\16\b"+
		"\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f"+
		"\5\u00d0i\2\u066f\u00e5\3\2\2\2\u0670\u0672\7I\2\2\u0671\u0673\7F\2\2"+
		"\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675"+
		"\5\16\b\2\u0675\u0676\5\n\6\2\u0676\u0677\7z\2\2\u0677\u067e\3\2\2\2\u0678"+
		"\u0679\7I\2\2\u0679\u067a\7y\2\2\u067a\u067b\5\n\6\2\u067b\u067c\7z\2"+
		"\2\u067c\u067e\3\2\2\2\u067d\u0670\3\2\2\2\u067d\u0678\3\2\2\2\u067e\u00e7"+
		"\3\2\2\2\u067f\u0681\5\u00eex\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2"+
		"\2\u0681\u0682\3\2\2\2\u0682\u0683\7I\2\2\u0683\u0685\7*\2\2\u0684\u0686"+
		"\5\16\b\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\3\2\2\2"+
		"\u0687\u0688\5\u00d0i\2\u0688\u0689\7z\2\2\u0689\u00e9\3\2\2\2\u068a\u068b"+
		"\7\6\2\2\u068b\u068c\7O\2\2\u068c\u068d\7\u0087\2\2\u068d\u068e\7P\2\2"+
		"\u068e\u068f\7z\2\2\u068f\u00eb\3\2\2\2\u0690\u0691\7\36\2\2\u0691\u0692"+
		"\7\u0087\2\2\u0692\u0694\7S\2\2\u0693\u0695\5|?\2\u0694\u0693\3\2\2\2"+
		"\u0694\u0695\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u069b\7T\2\2\u0697\u0698"+
		"\7\36\2\2\u0698\u0699\7\u0087\2\2\u0699\u069b\5~@\2\u069a\u0690\3\2\2"+
		"\2\u069a\u0697\3\2\2\2\u069b\u00ed\3\2\2\2\u069c\u069d\bx\1\2\u069d\u069e"+
		"\5\u00f0y\2\u069e\u06a3\3\2\2\2\u069f\u06a0\f\3\2\2\u06a0\u06a2\5\u00f0"+
		"y\2\u06a1\u069f\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u00ef\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06a7\7Q"+
		"\2\2\u06a7\u06a8\7Q\2\2\u06a8\u06a9\5\u00f4{\2\u06a9\u06aa\7R\2\2\u06aa"+
		"\u06ab\7R\2\2\u06ab\u06ae\3\2\2\2\u06ac\u06ae\5\u00f2z\2\u06ad\u06a6\3"+
		"\2\2\2\u06ad\u06ac\3\2\2\2\u06ae\u00f1\3\2\2\2\u06af\u06b0\7\4\2\2\u06b0"+
		"\u06b1\7O\2\2\u06b1\u06b3\5\u011c\u008f\2\u06b2\u06b4\7}\2\2\u06b3\u06b2"+
		"\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\7P\2\2\u06b6"+
		"\u06c0\3\2\2\2\u06b7\u06b8\7\4\2\2\u06b8\u06b9\7O\2\2\u06b9\u06bb\5`\61"+
		"\2\u06ba\u06bc\7}\2\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd"+
		"\3\2\2\2\u06bd\u06be\7P\2\2\u06be\u06c0\3\2\2\2\u06bf\u06af\3\2\2\2\u06bf"+
		"\u06b7\3\2\2\2\u06c0\u00f3\3\2\2\2\u06c1\u06c3\b{\1\2\u06c2\u06c4\5\u00f6"+
		"|\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c9\3\2\2\2\u06c5"+
		"\u06c6\5\u00f6|\2\u06c6\u06c7\7}\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c1\3"+
		"\2\2\2\u06c8\u06c5\3\2\2\2\u06c9\u06d6\3\2\2\2\u06ca\u06cb\f\5\2\2\u06cb"+
		"\u06cd\7t\2\2\u06cc\u06ce\5\u00f6|\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3"+
		"\2\2\2\u06ce\u06d5\3\2\2\2\u06cf\u06d0\f\3\2\2\u06d0\u06d1\7t\2\2\u06d1"+
		"\u06d2\5\u00f6|\2\u06d2\u06d3\7}\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06ca\3"+
		"\2\2\2\u06d4\u06cf\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u00f5\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9\u06db\5\u00f8"+
		"}\2\u06da\u06dc\5\u00fe\u0080\2\u06db\u06da\3\2\2\2\u06db\u06dc\3\2\2"+
		"\2\u06dc\u00f7\3\2\2\2\u06dd\u06e0\7~\2\2\u06de\u06e0\5\u00fa~\2\u06df"+
		"\u06dd\3\2\2\2\u06df\u06de\3\2\2\2\u06e0\u00f9\3\2\2\2\u06e1\u06e2\5\u00fc"+
		"\177\2\u06e2\u06e3\7y\2\2\u06e3\u06e4\7~\2\2\u06e4\u00fb\3\2\2\2\u06e5"+
		"\u06e6\7~\2\2\u06e6\u00fd\3\2\2\2\u06e7\u06e8\7O\2\2\u06e8\u06e9\5\u0100"+
		"\u0081\2\u06e9\u06ea\7P\2\2\u06ea\u00ff\3\2\2\2\u06eb\u06ed\b\u0081\1"+
		"\2\u06ec\u06ee\5\u0102\u0082\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2"+
		"\u06ee\u06f3\3\2\2\2\u06ef\u06f0\f\3\2\2\u06f0\u06f2\5\u0102\u0082\2\u06f1"+
		"\u06ef\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u0101\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f6\u06f7\7O\2\2\u06f7"+
		"\u06f8\5\u0100\u0081\2\u06f8\u06f9\7P\2\2\u06f9\u0703\3\2\2\2\u06fa\u06fb"+
		"\7Q\2\2\u06fb\u06fc\5\u0100\u0081\2\u06fc\u06fd\7R\2\2\u06fd\u0703\3\2"+
		"\2\2\u06fe\u06ff\7S\2\2\u06ff\u0700\5\u0100\u0081\2\u0700\u0701\7T\2\2"+
		"\u0701\u0703\3\2\2\2\u0702\u06f6\3\2\2\2\u0702\u06fa\3\2\2\2\u0702\u06fe"+
		"\3\2\2\2\u0703\u0103\3\2\2\2\u0704\u0709\5\u0106\u0084\2\u0705\u0706\7"+
		"t\2\2\u0706\u0708\5\u0106\u0084\2\u0707\u0705\3\2\2\2\u0708\u070b\3\2"+
		"\2\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0105\3\2\2\2\u070b"+
		"\u0709\3\2\2\2\u070c\u070e\5\u0108\u0085\2\u070d\u070f\5\u0136\u009c\2"+
		"\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0107\3\2\2\2\u0710\u0716"+
		"\5\u010a\u0086\2\u0711\u0712\5\u010c\u0087\2\u0712\u0713\5\u010e\u0088"+
		"\2\u0713\u0714\5\u0110\u0089\2\u0714\u0716\3\2\2\2\u0715\u0710\3\2\2\2"+
		"\u0715\u0711\3\2\2\2\u0716\u0109\3\2\2\2\u0717\u0719\5\u0112\u008a\2\u0718"+
		"\u0717\3\2\2\2\u0719\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2"+
		"\2\2\u071b\u071d\3\2\2\2\u071c\u071a\3\2\2\2\u071d\u071e\5\u010c\u0087"+
		"\2\u071e\u010b\3\2\2\2\u071f\u0720\b\u0087\1\2\u0720\u0722\5\u011a\u008e"+
		"\2\u0721\u0723\5\u00eex\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723"+
		"\u0729\3\2\2\2\u0724\u0725\7O\2\2\u0725\u0726\5\u010a\u0086\2\u0726\u0727"+
		"\7P\2\2\u0727\u0729\3\2\2\2\u0728\u071f\3\2\2\2\u0728\u0724\3\2\2\2\u0729"+
		"\u0737\3\2\2\2\u072a\u072b\f\5\2\2\u072b\u0736\5\u010e\u0088\2\u072c\u072d"+
		"\f\4\2\2\u072d\u072f\7Q\2\2\u072e\u0730\5`\61\2\u072f\u072e\3\2\2\2\u072f"+
		"\u0730\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0733\7R\2\2\u0732\u0734\5\u00ee"+
		"x\2\u0733\u0732\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0736\3\2\2\2\u0735"+
		"\u072a\3\2\2\2\u0735\u072c\3\2\2\2\u0736\u0739\3\2\2\2\u0737\u0735\3\2"+
		"\2\2\u0737\u0738\3\2\2\2\u0738\u010d\3\2\2\2\u0739\u0737\3\2\2\2\u073a"+
		"\u073b\7O\2\2\u073b\u073c\5\u0128\u0095\2\u073c\u073e\7P\2\2\u073d\u073f"+
		"\5\u0114\u008b\2\u073e\u073d\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0741\3"+
		"\2\2\2\u0740\u0742\5\u0118\u008d\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2"+
		"\2\2\u0742\u0744\3\2\2\2\u0743\u0745\5\u019e\u00d0\2\u0744\u0743\3\2\2"+
		"\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2\2\2\u0746\u0748\5\u00eex\2\u0747"+
		"\u0746\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u010f\3\2\2\2\u0749\u074a\7v"+
		"\2\2\u074a\u074c\5\u00b4[\2\u074b\u074d\5\u011e\u0090\2\u074c\u074b\3"+
		"\2\2\2\u074c\u074d\3\2\2\2\u074d\u0111\3\2\2\2\u074e\u0750\7W\2\2\u074f"+
		"\u0751\5\u00eex\2\u0750\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0753"+
		"\3\2\2\2\u0752\u0754\5\u0114\u008b\2\u0753\u0752\3\2\2\2\u0753\u0754\3"+
		"\2\2\2\u0754\u0766\3\2\2\2\u0755\u0757\7[\2\2\u0756\u0758\5\u00eex\2\u0757"+
		"\u0756\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0766\3\2\2\2\u0759\u075b\7p"+
		"\2\2\u075a\u075c\5\u00eex\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c"+
		"\u0766\3\2\2\2\u075d\u075e\5\16\b\2\u075e\u0760\7W\2\2\u075f\u0761\5\u00ee"+
		"x\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762"+
		"\u0764\5\u0114\u008b\2\u0763\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766"+
		"\3\2\2\2\u0765\u074e\3\2\2\2\u0765\u0755\3\2\2\2\u0765\u0759\3\2\2\2\u0765"+
		"\u075d\3\2\2\2\u0766\u0113\3\2\2\2\u0767\u0769\5\u0116\u008c\2\u0768\u076a"+
		"\5\u0114\u008b\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u0115\3"+
		"\2\2\2\u076b\u076c\t\6\2\2\u076c\u0117\3\2\2\2\u076d\u076e\t\7\2\2\u076e"+
		"\u0119\3\2\2\2\u076f\u0771\7}\2\2\u0770\u076f\3\2\2\2\u0770\u0771\3\2"+
		"\2\2\u0771\u0772\3\2\2\2\u0772\u0773\5\6\4\2\u0773\u011b\3\2\2\2\u0774"+
		"\u0776\5\u00b2Z\2\u0775\u0777\5\u011e\u0090\2\u0776\u0775\3\2\2\2\u0776"+
		"\u0777\3\2\2\2\u0777\u011d\3\2\2\2\u0778\u0781\5\u0120\u0091\2\u0779\u077b"+
		"\5\u0122\u0092\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\3"+
		"\2\2\2\u077c\u077d\5\u010e\u0088\2\u077d\u077e\5\u0110\u0089\2\u077e\u0781"+
		"\3\2\2\2\u077f\u0781\5\u0124\u0093\2\u0780\u0778\3\2\2\2\u0780\u077a\3"+
		"\2\2\2\u0780\u077f\3\2\2\2\u0781\u011f\3\2\2\2\u0782\u0788\5\u0122\u0092"+
		"\2\u0783\u0785\5\u0112\u008a\2\u0784\u0786\5\u0120\u0091\2\u0785\u0784"+
		"\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0788\3\2\2\2\u0787\u0782\3\2\2\2\u0787"+
		"\u0783\3\2\2\2\u0788\u0121\3\2\2\2\u0789\u078a\b\u0092\1\2\u078a\u0798"+
		"\5\u010e\u0088\2\u078b\u078d\7Q\2\2\u078c\u078e\5`\61\2\u078d\u078c\3"+
		"\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0791\7R\2\2\u0790"+
		"\u0792\5\u00eex\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0798"+
		"\3\2\2\2\u0793\u0794\7O\2\2\u0794\u0795\5\u0120\u0091\2\u0795\u0796\7"+
		"P\2\2\u0796\u0798\3\2\2\2\u0797\u0789\3\2\2\2\u0797\u078b\3\2\2\2\u0797"+
		"\u0793\3\2\2\2\u0798\u07a6\3\2\2\2\u0799\u079a\f\7\2\2\u079a\u07a5\5\u010e"+
		"\u0088\2\u079b\u079c\f\5\2\2\u079c\u079e\7Q\2\2\u079d\u079f\5`\61\2\u079e"+
		"\u079d\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\7R"+
		"\2\2\u07a1\u07a3\5\u00eex\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3"+
		"\u07a5\3\2\2\2\u07a4\u0799\3\2\2\2\u07a4\u079b\3\2\2\2\u07a5\u07a8\3\2"+
		"\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u0123\3\2\2\2\u07a8"+
		"\u07a6\3\2\2\2\u07a9\u07ae\5\u0126\u0094\2\u07aa\u07ab\5\u0112\u008a\2"+
		"\u07ab\u07ac\5\u0124\u0093\2\u07ac\u07ae\3\2\2\2\u07ad\u07a9\3\2\2\2\u07ad"+
		"\u07aa\3\2\2\2\u07ae\u0125\3\2\2\2\u07af\u07b0\b\u0094\1\2\u07b0\u07b1"+
		"\7}\2\2\u07b1\u07bf\3\2\2\2\u07b2\u07b3\f\5\2\2\u07b3\u07be\5\u010e\u0088"+
		"\2\u07b4\u07b5\f\4\2\2\u07b5\u07b7\7Q\2\2\u07b6\u07b8\5`\61\2\u07b7\u07b6"+
		"\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07bb\7R\2\2\u07ba"+
		"\u07bc\5\u00eex\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be"+
		"\3\2\2\2\u07bd\u07b2\3\2\2\2\u07bd\u07b4\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf"+
		"\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u0127\3\2\2\2\u07c1\u07bf\3\2"+
		"\2\2\u07c2\u07c4\5\u012a\u0096\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2"+
		"\2\u07c4\u07c6\3\2\2\2\u07c5\u07c7\7}\2\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7"+
		"\3\2\2\2\u07c7\u07cd\3\2\2\2\u07c8\u07c9\5\u012a\u0096\2\u07c9\u07ca\7"+
		"t\2\2\u07ca\u07cb\7}\2\2\u07cb\u07cd\3\2\2\2\u07cc\u07c3\3\2\2\2\u07cc"+
		"\u07c8\3\2\2\2\u07cd\u0129\3\2\2\2\u07ce\u07cf\b\u0096\1\2\u07cf\u07d0"+
		"\5\u012c\u0097\2\u07d0\u07d6\3\2\2\2\u07d1\u07d2\f\3\2\2\u07d2\u07d3\7"+
		"t\2\2\u07d3\u07d5\5\u012c\u0097\2\u07d4\u07d1\3\2\2\2\u07d5\u07d8\3\2"+
		"\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u012b\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d9\u07db\5\u00eex\2\u07da\u07d9\3\2\2\2\u07da\u07db"+
		"\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\5\u00a2R\2\u07dd\u07de\5\u0108"+
		"\u0085\2\u07de\u07f9\3\2\2\2\u07df\u07e1\5\u00eex\2\u07e0\u07df\3\2\2"+
		"\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\5\u00a2R\2\u07e3"+
		"\u07e4\5\u0108\u0085\2\u07e4\u07e5\7_\2\2\u07e5\u07e6\5\u013a\u009e\2"+
		"\u07e6\u07f9\3\2\2\2\u07e7\u07e9\5\u00eex\2\u07e8\u07e7\3\2\2\2\u07e8"+
		"\u07e9\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07ec\5\u00a2R\2\u07eb\u07ed"+
		"\5\u011e\u0090\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f9\3"+
		"\2\2\2\u07ee\u07f0\5\u00eex\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2"+
		"\u07f0\u07f1\3\2\2\2\u07f1\u07f3\5\u00a2R\2\u07f2\u07f4\5\u011e\u0090"+
		"\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6"+
		"\7_\2\2\u07f6\u07f7\5\u013a\u009e\2\u07f7\u07f9\3\2\2\2\u07f8\u07da\3"+
		"\2\2\2\u07f8\u07e0\3\2\2\2\u07f8\u07e8\3\2\2\2\u07f8\u07ef\3\2\2\2\u07f9"+
		"\u012d\3\2\2\2\u07fa\u07fc\5\u00eex\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc"+
		"\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07ff\5\u00a6T\2\u07fe\u07fd\3\2\2"+
		"\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0802\5\u0130\u0099\2"+
		"\u0801\u0803\5\u0156\u00ac\2\u0802\u0801\3\2\2\2\u0802\u0803\3\2\2\2\u0803"+
		"\u0804\3\2\2\2\u0804\u0805\5\u0134\u009b\2\u0805\u012f\3\2\2\2\u0806\u0808"+
		"\5\u00aeX\2\u0807\u0806\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u0809\3\2\2"+
		"\2\u0809\u080a\5\u0132\u009a\2\u080a\u0131\3\2\2\2\u080b\u080c\5\u011a"+
		"\u008e\2\u080c\u080d\7O\2\2\u080d\u080e\5\u0128\u0095\2\u080e\u080f\7"+
		"P\2\2\u080f\u0133\3\2\2\2\u0810\u0812\5\u016e\u00b8\2\u0811\u0810\3\2"+
		"\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u081c\5h\65\2\u0814"+
		"\u081c\5\u0194\u00cb\2\u0815\u0816\7_\2\2\u0816\u0817\7\25\2\2\u0817\u081c"+
		"\7z\2\2\u0818\u0819\7_\2\2\u0819\u081a\7\26\2\2\u081a\u081c\7z\2\2\u081b"+
		"\u0811\3\2\2\2\u081b\u0814\3\2\2\2\u081b\u0815\3\2\2\2\u081b\u0818\3\2"+
		"\2\2\u081c\u0135\3\2\2\2\u081d\u0823\5\u0138\u009d\2\u081e\u081f\7O\2"+
		"\2\u081f\u0820\5$\23\2\u0820\u0821\7P\2\2\u0821\u0823\3\2\2\2\u0822\u081d"+
		"\3\2\2\2\u0822\u081e\3\2\2\2\u0823\u0137\3\2\2\2\u0824\u0825\7_\2\2\u0825"+
		"\u0828\5\u013a\u009e\2\u0826\u0828\5\u013e\u00a0\2\u0827\u0824\3\2\2\2"+
		"\u0827\u0826\3\2\2\2\u0828\u0139\3\2\2\2\u0829\u082c\5Z.\2\u082a\u082c"+
		"\5\u013e\u00a0\2\u082b\u0829\3\2\2\2\u082b\u082a\3\2\2\2\u082c\u013b\3"+
		"\2\2\2\u082d\u0832\5\u013a\u009e\2\u082e\u082f\7t\2\2\u082f\u0831\5\u013a"+
		"\u009e\2\u0830\u082e\3\2\2\2\u0831\u0834\3\2\2\2\u0832\u0830\3\2\2\2\u0832"+
		"\u0833\3\2\2\2\u0833\u013d\3\2\2\2\u0834\u0832\3\2\2\2\u0835\u0836\7S"+
		"\2\2\u0836\u0838\5\u013c\u009f\2\u0837\u0839\7t\2\2\u0838\u0837\3\2\2"+
		"\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\7T\2\2\u083b\u083f"+
		"\3\2\2\2\u083c\u083d\7S\2\2\u083d\u083f\7T\2\2\u083e\u0835\3\2\2\2\u083e"+
		"\u083c\3\2\2\2\u083f\u013f\3\2\2\2\u0840\u0843\7~\2\2\u0841\u0843\5\u0182"+
		"\u00c2\2\u0842\u0840\3\2\2\2\u0842\u0841\3\2\2\2\u0843\u0141\3\2\2\2\u0844"+
		"\u0845\5\u0146\u00a4\2\u0845\u0846\5\u0144\u00a3\2\u0846\u0143\3\2\2\2"+
		"\u0847\u0849\7S\2\2\u0848\u084a\5\u014e\u00a8\2\u0849\u0848\3\2\2\2\u0849"+
		"\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084c\7T\2\2\u084c\u0145\3\2"+
		"\2\2\u084d\u084f\5\u014c\u00a7\2\u084e\u0850\5\u00eex\2\u084f\u084e\3"+
		"\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0853\5\u0148\u00a5"+
		"\2\u0852\u0854\5\u014a\u00a6\2\u0853\u0852\3\2\2\2\u0853\u0854\3\2\2\2"+
		"\u0854\u0856\3\2\2\2\u0855\u0857\5\u015c\u00af\2\u0856\u0855\3\2\2\2\u0856"+
		"\u0857\3\2\2\2\u0857\u0860\3\2\2\2\u0858\u085a\5\u014c\u00a7\2\u0859\u085b"+
		"\5\u00eex\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085d\3\2\2"+
		"\2\u085c\u085e\5\u015c\u00af\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2"+
		"\u085e\u0860\3\2\2\2\u085f\u084d\3\2\2\2\u085f\u0858\3\2\2\2\u0860\u0147"+
		"\3\2\2\2\u0861\u0863\5\16\b\2\u0862\u0861\3\2\2\2\u0862\u0863\3\2\2\2"+
		"\u0863\u0864\3\2\2\2\u0864\u0865\5\u0140\u00a1\2\u0865\u0149\3\2\2\2\u0866"+
		"\u0867\7 \2\2\u0867\u014b\3\2\2\2\u0868\u0869\t\b\2\2\u0869\u014d\3\2"+
		"\2\2\u086a\u086c\5\u0150\u00a9\2\u086b\u086d\5\u014e\u00a8\2\u086c\u086b"+
		"\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0874\3\2\2\2\u086e\u086f\5\u0166\u00b4"+
		"\2\u086f\u0871\7x\2\2\u0870\u0872\5\u014e\u00a8\2\u0871\u0870\3\2\2\2"+
		"\u0871\u0872\3\2\2\2\u0872\u0874\3\2\2\2\u0873\u086a\3\2\2\2\u0873\u086e"+
		"\3\2\2\2\u0874\u014f\3\2\2\2\u0875\u0877\5\u00eex\2\u0876\u0875\3\2\2"+
		"\2\u0876\u0877\3\2\2\2\u0877\u0879\3\2\2\2\u0878\u087a\5\u00a2R\2\u0879"+
		"\u0878\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\3\2\2\2\u087b\u087d\5\u0152"+
		"\u00aa\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e"+
		"\u0886\7z\2\2\u087f\u0886\5\u012e\u0098\2\u0880\u0886\5\u00e6t\2\u0881"+
		"\u0886\5\u009aN\2\u0882\u0886\5\u017a\u00be\2\u0883\u0886\5\u0084C\2\u0884"+
		"\u0886\5\u009cO\2\u0885\u0876\3\2\2\2\u0885\u087f\3\2\2\2\u0885\u0880"+
		"\3\2\2\2\u0885\u0881\3\2\2\2\u0885\u0882\3\2\2\2\u0885\u0883\3\2\2\2\u0885"+
		"\u0884\3\2\2\2\u0886\u0151\3\2\2\2\u0887\u0888\b\u00aa\1\2\u0888\u0889"+
		"\5\u0154\u00ab\2\u0889\u088f\3\2\2\2\u088a\u088b\f\3\2\2\u088b\u088c\7"+
		"t\2\2\u088c\u088e\5\u0154\u00ab\2\u088d\u088a\3\2\2\2\u088e\u0891\3\2"+
		"\2\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0153\3\2\2\2\u0891"+
		"\u088f\3\2\2\2\u0892\u0894\5\u0108\u0085\2\u0893\u0895\5\u0156\u00ac\2"+
		"\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\3\2\2\2\u0896\u0898"+
		"\5\u015a\u00ae\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u08a6\3"+
		"\2\2\2\u0899\u089b\5\u0108\u0085\2\u089a\u089c\5\u0138\u009d\2\u089b\u089a"+
		"\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u08a6\3\2\2\2\u089d\u089f\7~\2\2\u089e"+
		"\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2\u08a0\u08a2\5\u00ee"+
		"x\2\u08a1\u08a0\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08a4\7x\2\2\u08a4\u08a6\5`\61\2\u08a5\u0892\3\2\2\2\u08a5\u0899\3\2"+
		"\2\2\u08a5\u089e\3\2\2\2\u08a6\u0155\3\2\2\2\u08a7\u08a8\b\u00ac\1\2\u08a8"+
		"\u08a9\5\u0158\u00ad\2\u08a9\u08ae\3\2\2\2\u08aa\u08ab\f\3\2\2\u08ab\u08ad"+
		"\5\u0158\u00ad\2\u08ac\u08aa\3\2\2\2\u08ad\u08b0\3\2\2\2\u08ae\u08ac\3"+
		"\2\2\2\u08ae\u08af\3\2\2\2\u08af\u0157\3\2\2\2\u08b0\u08ae\3\2\2\2\u08b1"+
		"\u08b2\t\t\2\2\u08b2\u0159\3\2\2\2\u08b3\u08b4\7_\2\2\u08b4\u08b5\7\u0081"+
		"\2\2\u08b5\u08b6\b\u00ae\1\2\u08b6\u015b\3\2\2\2\u08b7\u08b8\7x\2\2\u08b8"+
		"\u08b9\5\u015e\u00b0\2\u08b9\u015d\3\2\2\2\u08ba\u08bb\b\u00b0\1\2\u08bb"+
		"\u08bd\5\u0160\u00b1\2\u08bc\u08be\7}\2\2\u08bd\u08bc\3\2\2\2\u08bd\u08be"+
		"\3\2\2\2\u08be\u08c7\3\2\2\2\u08bf\u08c0\f\3\2\2\u08c0\u08c1\7t\2\2\u08c1"+
		"\u08c3\5\u0160\u00b1\2\u08c2\u08c4\7}\2\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4"+
		"\3\2\2\2\u08c4\u08c6\3\2\2\2\u08c5\u08bf\3\2\2\2\u08c6\u08c9\3\2\2\2\u08c7"+
		"\u08c5\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u015f\3\2\2\2\u08c9\u08c7\3\2"+
		"\2\2\u08ca\u08cc\5\u00eex\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc"+
		"\u08cd\3\2\2\2\u08cd\u08e0\5\u0164\u00b3\2\u08ce\u08d0\5\u00eex\2\u08cf"+
		"\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d3\7J"+
		"\2\2\u08d2\u08d4\5\u0166\u00b4\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2"+
		"\2\u08d4\u08d5\3\2\2\2\u08d5\u08e0\5\u0164\u00b3\2\u08d6\u08d8\5\u00ee"+
		"x\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9"+
		"\u08db\5\u0166\u00b4\2\u08da\u08dc\7J\2\2\u08db\u08da\3\2\2\2\u08db\u08dc"+
		"\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\5\u0164\u00b3\2\u08de\u08e0\3"+
		"\2\2\2\u08df\u08cb\3\2\2\2\u08df\u08cf\3\2\2\2\u08df\u08d7\3\2\2\2\u08e0"+
		"\u0161\3\2\2\2\u08e1\u08e3\5\16\b\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3"+
		"\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e7\5\u0140\u00a1\2\u08e5\u08e7\5\u00ba"+
		"^\2\u08e6\u08e2\3\2\2\2\u08e6\u08e5\3\2\2\2\u08e7\u0163\3\2\2\2\u08e8"+
		"\u08e9\5\u0162\u00b2\2\u08e9\u0165\3\2\2\2\u08ea\u08eb\t\n\2\2\u08eb\u0167"+
		"\3\2\2\2\u08ec\u08ed\7.\2\2\u08ed\u08ee\5\u016a\u00b6\2\u08ee\u0169\3"+
		"\2\2\2\u08ef\u08f1\5\u00b2Z\2\u08f0\u08f2\5\u016c\u00b7\2\u08f1\u08f0"+
		"\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u016b\3\2\2\2\u08f3\u08f5\5\u0112\u008a"+
		"\2\u08f4\u08f6\5\u016c\u00b7\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2"+
		"\u08f6\u016d\3\2\2\2\u08f7\u08f8\7x\2\2\u08f8\u08f9\5\u0170\u00b9\2\u08f9"+
		"\u016f\3\2\2\2\u08fa\u08fc\5\u0172\u00ba\2\u08fb\u08fd\7}\2\2\u08fc\u08fb"+
		"\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u0906\3\2\2\2\u08fe\u0900\5\u0172\u00ba"+
		"\2\u08ff\u0901\7}\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902"+
		"\3\2\2\2\u0902\u0903\7t\2\2\u0903\u0904\5\u0170\u00b9\2\u0904\u0906\3"+
		"\2\2\2\u0905\u08fa\3\2\2\2\u0905\u08fe\3\2\2\2\u0906\u0171\3\2\2\2\u0907"+
		"\u0908\5\u0174\u00bb\2\u0908\u090a\7O\2\2\u0909\u090b\5$\23\2\u090a\u0909"+
		"\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090d\7P\2\2\u090d"+
		"\u0912\3\2\2\2\u090e\u090f\5\u0174\u00bb\2\u090f\u0910\5\u013e\u00a0\2"+
		"\u0910\u0912\3\2\2\2\u0911\u0907\3\2\2\2\u0911\u090e\3\2\2\2\u0912\u0173"+
		"\3\2\2\2\u0913\u0916\5\u0162\u00b2\2\u0914\u0916\7~\2\2\u0915\u0913\3"+
		"\2\2\2\u0915\u0914\3\2\2\2\u0916\u0175\3\2\2\2\u0917\u0918\7.\2\2\u0918"+
		"\u0919\5\u01aa\u00d6\2\u0919\u0177\3\2\2\2\u091a\u091b\7.\2\2\u091b\u091c"+
		"\7\u0087\2\2\u091c\u0920\7~\2\2\u091d\u091e\7.\2\2\u091e\u0920\7\u008b"+
		"\2\2\u091f\u091a\3\2\2\2\u091f\u091d\3\2\2\2\u0920\u0179\3\2\2\2\u0921"+
		"\u0922\7>\2\2\u0922\u0923\7`\2\2\u0923\u0924\5\u017c\u00bf\2\u0924\u0925"+
		"\7a\2\2\u0925\u0926\5~@\2\u0926\u017b\3\2\2\2\u0927\u0928\b\u00bf\1\2"+
		"\u0928\u0929\5\u017e\u00c0\2\u0929\u092f\3\2\2\2\u092a\u092b\f\3\2\2\u092b"+
		"\u092c\7t\2\2\u092c\u092e\5\u017e\u00c0\2\u092d\u092a\3\2\2\2\u092e\u0931"+
		"\3\2\2\2\u092f\u092d\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u017d\3\2\2\2\u0931"+
		"\u092f\3\2\2\2\u0932\u0935\5\u0180\u00c1\2\u0933\u0935\5\u012c\u0097\2"+
		"\u0934\u0932\3\2\2\2\u0934\u0933\3\2\2\2\u0935\u017f\3\2\2\2\u0936\u0938"+
		"\7\17\2\2\u0937\u0939\7}\2\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939"+
		"\u093b\3\2\2\2\u093a\u093c\7~\2\2\u093b\u093a\3\2\2\2\u093b\u093c\3\2"+
		"\2\2\u093c\u0967\3\2\2\2\u093d\u093f\7\17\2\2\u093e\u0940\7~\2\2\u093f"+
		"\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\7_"+
		"\2\2\u0942\u0967\5\u011c\u008f\2\u0943\u0945\7F\2\2\u0944\u0946\7}\2\2"+
		"\u0945\u0944\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0948\3\2\2\2\u0947\u0949"+
		"\7~\2\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u0967\3\2\2\2\u094a"+
		"\u094c\7F\2\2\u094b\u094d\7~\2\2\u094c\u094b\3\2\2\2\u094c\u094d\3\2\2"+
		"\2\u094d\u094e\3\2\2\2\u094e\u094f\7_\2\2\u094f\u0967\5\u011c\u008f\2"+
		"\u0950\u0951\7>\2\2\u0951\u0952\7`\2\2\u0952\u0953\5\u017c\u00bf\2\u0953"+
		"\u0954\7a\2\2\u0954\u0956\7\17\2\2\u0955\u0957\7}\2\2\u0956\u0955\3\2"+
		"\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2\2\2\u0958\u095a\7~\2\2\u0959"+
		"\u0958\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u0967\3\2\2\2\u095b\u095c\7>"+
		"\2\2\u095c\u095d\7`\2\2\u095d\u095e\5\u017c\u00bf\2\u095e\u095f\7a\2\2"+
		"\u095f\u0961\7\17\2\2\u0960\u0962\7~\2\2\u0961\u0960\3\2\2\2\u0961\u0962"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\7_\2\2\u0964\u0965\5\6\4\2\u0965"+
		"\u0967\3\2\2\2\u0966\u0936\3\2\2\2\u0966\u093d\3\2\2\2\u0966\u0943\3\2"+
		"\2\2\u0966\u094a\3\2\2\2\u0966\u0950\3\2\2\2\u0966\u095b\3\2\2\2\u0967"+
		"\u0181\3\2\2\2\u0968\u0969\5\u0186\u00c4\2\u0969\u096b\7`\2\2\u096a\u096c"+
		"\5\u0188\u00c5\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3"+
		"\2\2\2\u096d\u096e\7a\2\2\u096e\u0183\3\2\2\2\u096f\u097f\5\u0182\u00c2"+
		"\2\u0970\u0971\5\u0176\u00bc\2\u0971\u0973\7`\2\2\u0972\u0974\5\u0188"+
		"\u00c5\2\u0973\u0972\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2\2\2\u0975"+
		"\u0976\7a\2\2\u0976\u097f\3\2\2\2\u0977\u0978\5\u0178\u00bd\2\u0978\u097a"+
		"\7`\2\2\u0979\u097b\5\u0188\u00c5\2\u097a\u0979\3\2\2\2\u097a\u097b\3"+
		"\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\7a\2\2\u097d\u097f\3\2\2\2\u097e"+
		"\u096f\3\2\2\2\u097e\u0970\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u097e\u0977\3\2\2\2\u097f\u0185\3\2\2\2\u0980\u0981\7~\2\2\u0981"+
		"\u0187\3\2\2\2\u0982\u0983\b\u00c5\1\2\u0983\u0985\5\u018a\u00c6\2\u0984"+
		"\u0986\7}\2\2\u0985\u0984\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u098f\3\2"+
		"\2\2\u0987\u0988\f\3\2\2\u0988\u0989\7t\2\2\u0989\u098b\5\u018a\u00c6"+
		"\2\u098a\u098c\7}\2\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098e"+
		"\3\2\2\2\u098d\u0987\3\2\2\2\u098e\u0991\3\2\2\2\u098f\u098d\3\2\2\2\u098f"+
		"\u0990\3\2\2\2\u0990\u0189\3\2\2\2\u0991\u098f\3\2\2\2\u0992\u0996\5`"+
		"\61\2\u0993\u0996\5\u011c\u008f\2\u0994\u0996\5\6\4\2\u0995\u0992\3\2"+
		"\2\2\u0995\u0993\3\2\2\2\u0995\u0994\3\2\2\2\u0996\u018b\3\2\2\2\u0997"+
		"\u0998\7F\2\2\u0998\u0999\5\16\b\2\u0999\u099a\7~\2\2\u099a\u09a3\3\2"+
		"\2\2\u099b\u099c\7F\2\2\u099c\u099e\5\16\b\2\u099d\u099f\7>\2\2\u099e"+
		"\u099d\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\5\u0182"+
		"\u00c2\2\u09a1\u09a3\3\2\2\2\u09a2\u0997\3\2\2\2\u09a2\u099b\3\2\2\2\u09a3"+
		"\u018d\3\2\2\2\u09a4\u09a6\7\36\2\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3"+
		"\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u09a8\7>\2\2\u09a8\u09a9\5~@\2\u09a9"+
		"\u018f\3\2\2\2\u09aa\u09ab\7>\2\2\u09ab\u09ac\7`\2\2\u09ac\u09ad\7a\2"+
		"\2\u09ad\u09ae\5~@\2\u09ae\u0191\3\2\2\2\u09af\u09b0\7C\2\2\u09b0\u09b1"+
		"\5h\65\2\u09b1\u09b2\5\u0196\u00cc\2\u09b2\u0193\3\2\2\2\u09b3\u09b5\7"+
		"C\2\2\u09b4\u09b6\5\u016e\u00b8\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2"+
		"\2\2\u09b6\u09b7\3\2\2\2\u09b7\u09b8\5h\65\2\u09b8\u09b9\5\u0196\u00cc"+
		"\2\u09b9\u0195\3\2\2\2\u09ba\u09bc\5\u0198\u00cd\2\u09bb\u09bd\5\u0196"+
		"\u00cc\2\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u0197\3\2\2\2\u09be"+
		"\u09bf\7\13\2\2\u09bf\u09c0\7O\2\2\u09c0\u09c1\5\u019a\u00ce\2\u09c1\u09c2"+
		"\7P\2\2\u09c2\u09c3\5h\65\2\u09c3\u0199\3\2\2\2\u09c4\u09c6\5\u00eex\2"+
		"\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c8"+
		"\5\u00b2Z\2\u09c8\u09c9\5\u0108\u0085\2\u09c9\u09d3\3\2\2\2\u09ca\u09cc"+
		"\5\u00eex\2\u09cb\u09ca\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\3\2\2"+
		"\2\u09cd\u09cf\5\u00b2Z\2\u09ce\u09d0\5\u011e\u0090\2\u09cf\u09ce\3\2"+
		"\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d3\3\2\2\2\u09d1\u09d3\7}\2\2\u09d2"+
		"\u09c5\3\2\2\2\u09d2\u09cb\3\2\2\2\u09d2\u09d1\3\2\2\2\u09d3\u019b\3\2"+
		"\2\2\u09d4\u09d6\7A\2\2\u09d5\u09d7\5Z.\2\u09d6\u09d5\3\2\2\2\u09d6\u09d7"+
		"\3\2\2\2\u09d7\u019d\3\2\2\2\u09d8\u09db\5\u01a0\u00d1\2\u09d9\u09db\5"+
		"\u01a4\u00d3\2\u09da\u09d8\3\2\2\2\u09da\u09d9\3\2\2\2\u09db\u019f\3\2"+
		"\2\2\u09dc\u09dd\7A\2\2\u09dd\u09df\7O\2\2\u09de\u09e0\5\u01a2\u00d2\2"+
		"\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2"+
		"\7P\2\2\u09e2\u01a1\3\2\2\2\u09e3\u09e4\b\u00d2\1\2\u09e4\u09e6\5\u011c"+
		"\u008f\2\u09e5\u09e7\7}\2\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7"+
		"\u09f0\3\2\2\2\u09e8\u09e9\f\3\2\2\u09e9\u09ea\7t\2\2\u09ea\u09ec\5\u011c"+
		"\u008f\2\u09eb\u09ed\7}\2\2\u09ec\u09eb\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed"+
		"\u09ef\3\2\2\2\u09ee\u09e8\3\2\2\2\u09ef\u09f2\3\2\2\2\u09f0\u09ee\3\2"+
		"\2\2\u09f0\u09f1\3\2\2\2\u09f1\u01a3\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f3"+
		"\u09f4\7,\2\2\u09f4\u09f5\7O\2\2\u09f5\u09f6\5`\61\2\u09f6\u09f7\7P\2"+
		"\2\u09f7\u09fa\3\2\2\2\u09f8\u09fa\7,\2\2\u09f9\u09f3\3\2\2\2\u09f9\u09f8"+
		"\3\2\2\2\u09fa\u01a5\3\2\2\2\u09fb\u09fc\7a\2\2\u09fc\u09fd\7a\2\2\u09fd"+
		"\u01a7\3\2\2\2\u09fe\u09ff\7a\2\2\u09ff\u0a00\7a\2\2\u0a00\u0a01\7_\2"+
		"\2\u0a01\u01a9\3\2\2\2\u0a02\u0a33\7+\2\2\u0a03\u0a33\7\26\2\2\u0a04\u0a05"+
		"\7+\2\2\u0a05\u0a06\7Q\2\2\u0a06\u0a33\7R\2\2\u0a07\u0a08\7\26\2\2\u0a08"+
		"\u0a09\7Q\2\2\u0a09\u0a33\7R\2\2\u0a0a\u0a33\7U\2\2\u0a0b\u0a33\7V\2\2"+
		"\u0a0c\u0a33\7W\2\2\u0a0d\u0a33\7X\2\2\u0a0e\u0a33\7Y\2\2\u0a0f\u0a33"+
		"\7Z\2\2\u0a10\u0a33\7[\2\2\u0a11\u0a33\7\\\2\2\u0a12\u0a33\7]\2\2\u0a13"+
		"\u0a33\7^\2\2\u0a14\u0a33\7_\2\2\u0a15\u0a33\7`\2\2\u0a16\u0a33\7a\2\2"+
		"\u0a17\u0a33\7b\2\2\u0a18\u0a33\7c\2\2\u0a19\u0a33\7d\2\2\u0a1a\u0a33"+
		"\7e\2\2\u0a1b\u0a33\7f\2\2\u0a1c\u0a33\7g\2\2\u0a1d\u0a33\7h\2\2\u0a1e"+
		"\u0a33\7i\2\2\u0a1f\u0a33\7j\2\2\u0a20\u0a33\5\u01a6\u00d4\2\u0a21\u0a33"+
		"\5\u01a8\u00d5\2\u0a22\u0a33\7k\2\2\u0a23\u0a33\7l\2\2\u0a24\u0a33\7m"+
		"\2\2\u0a25\u0a33\7n\2\2\u0a26\u0a33\7o\2\2\u0a27\u0a33\7p\2\2\u0a28\u0a33"+
		"\7q\2\2\u0a29\u0a33\7r\2\2\u0a2a\u0a33\7s\2\2\u0a2b\u0a33\7t\2\2\u0a2c"+
		"\u0a33\7u\2\2\u0a2d\u0a33\7v\2\2\u0a2e\u0a2f\7O\2\2\u0a2f\u0a33\7P\2\2"+
		"\u0a30\u0a31\7Q\2\2\u0a31\u0a33\7R\2\2\u0a32\u0a02\3\2\2\2\u0a32\u0a03"+
		"\3\2\2\2\u0a32\u0a04\3\2\2\2\u0a32\u0a07\3\2\2\2\u0a32\u0a0a\3\2\2\2\u0a32"+
		"\u0a0b\3\2\2\2\u0a32\u0a0c\3\2\2\2\u0a32\u0a0d\3\2\2\2\u0a32\u0a0e\3\2"+
		"\2\2\u0a32\u0a0f\3\2\2\2\u0a32\u0a10\3\2\2\2\u0a32\u0a11\3\2\2\2\u0a32"+
		"\u0a12\3\2\2\2\u0a32\u0a13\3\2\2\2\u0a32\u0a14\3\2\2\2\u0a32\u0a15\3\2"+
		"\2\2\u0a32\u0a16\3\2\2\2\u0a32\u0a17\3\2\2\2\u0a32\u0a18\3\2\2\2\u0a32"+
		"\u0a19\3\2\2\2\u0a32\u0a1a\3\2\2\2\u0a32\u0a1b\3\2\2\2\u0a32\u0a1c\3\2"+
		"\2\2\u0a32\u0a1d\3\2\2\2\u0a32\u0a1e\3\2\2\2\u0a32\u0a1f\3\2\2\2\u0a32"+
		"\u0a20\3\2\2\2\u0a32\u0a21\3\2\2\2\u0a32\u0a22\3\2\2\2\u0a32\u0a23\3\2"+
		"\2\2\u0a32\u0a24\3\2\2\2\u0a32\u0a25\3\2\2\2\u0a32\u0a26\3\2\2\2\u0a32"+
		"\u0a27\3\2\2\2\u0a32\u0a28\3\2\2\2\u0a32\u0a29\3\2\2\2\u0a32\u0a2a\3\2"+
		"\2\2\u0a32\u0a2b\3\2\2\2\u0a32\u0a2c\3\2\2\2\u0a32\u0a2d\3\2\2\2\u0a32"+
		"\u0a2e\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33\u01ab\3\2\2\2\u0a34\u0a3c\5\u01ae"+
		"\u00d8\2\u0a35\u0a3c\7\u0085\2\2\u0a36\u0a3c\5\u01b0\u00d9\2\u0a37\u0a3c"+
		"\5\u01b2\u00da\2\u0a38\u0a3c\5\u01b4\u00db\2\u0a39\u0a3c\5\u01b6\u00dc"+
		"\2\u0a3a\u0a3c\5\u01b8\u00dd\2\u0a3b\u0a34\3\2\2\2\u0a3b\u0a35\3\2\2\2"+
		"\u0a3b\u0a36\3\2\2\2\u0a3b\u0a37\3\2\2\2\u0a3b\u0a38\3\2\2\2\u0a3b\u0a39"+
		"\3\2\2\2\u0a3b\u0a3a\3\2\2\2\u0a3c\u01ad\3\2\2\2\u0a3d\u0a3e\7\177\2\2"+
		"\u0a3e\u01af\3\2\2\2\u0a3f\u0a40\7\u0086\2\2\u0a40\u01b1\3\2\2\2\u0a41"+
		"\u0a42\7\u0087\2\2\u0a42\u01b3\3\2\2\2\u0a43\u0a44\7\u0088\2\2\u0a44\u01b5"+
		"\3\2\2\2\u0a45\u0a46\7-\2\2\u0a46\u01b7\3\2\2\2\u0a47\u0a48\t\13\2\2\u0a48"+
		"\u01b9\3\2\2\2\u0152\u01bb\u01c5\u01c9\u01cd\u01d8\u01dc\u01eb\u01f2\u01f7"+
		"\u01f9\u01fe\u0204\u020e\u0215\u021b\u021f\u0224\u022a\u0231\u0237\u023a"+
		"\u023d\u0240\u0247\u024e\u0282\u028c\u0292\u0298\u02a5\u02a7\u02ad\u02bc"+
		"\u02c2\u02d1\u02e9\u02f4\u02f9\u02fd\u0301\u0304\u0308\u030e\u0310\u0318"+
		"\u031c\u031f\u0326\u032d\u0331\u0336\u033a\u033d\u0342\u0348\u0355\u0360"+
		"\u0362\u0371\u0373\u037f\u0381\u038e\u0390\u03a2\u03a4\u03b0\u03b2\u03bd"+
		"\u03c8\u03d3\u03de\u03e9\u03f3\u03fb\u0408\u0412\u0419\u041d\u0421\u0425"+
		"\u0429\u042f\u0432\u0435\u043b\u0443\u0448\u044b\u0451\u0459\u0470\u0474"+
		"\u047c\u0482\u0496\u049a\u04a7\u04ab\u04ae\u04b5\u04bd\u04c7\u04cb\u04d4"+
		"\u04e0\u04e9\u04ed\u04f2\u04fc\u04ff\u0505\u0509\u050e\u0515\u051c\u0521"+
		"\u0525\u0529\u052e\u0534\u053e\u0546\u054a\u054d\u0552\u0557\u0568\u056c"+
		"\u0571\u0578\u057c\u0581\u058c\u0592\u0596\u059b\u059f\u05a4\u05a7\u05bd"+
		"\u05c3\u05ce\u05d2\u05d5\u05df\u05e5\u05e8\u05ef\u05f9\u05fd\u0600\u0603"+
		"\u0607\u060c\u060e\u0612\u0616\u061f\u062c\u0634\u063a\u0640\u0644\u0647"+
		"\u0650\u0659\u0661\u066c\u0672\u067d\u0680\u0685\u0694\u069a\u06a3\u06ad"+
		"\u06b3\u06bb\u06bf\u06c3\u06c8\u06cd\u06d4\u06d6\u06db\u06df\u06ed\u06f3"+
		"\u0702\u0709\u070e\u0715\u071a\u0722\u0728\u072f\u0733\u0735\u0737\u073e"+
		"\u0741\u0744\u0747\u074c\u0750\u0753\u0757\u075b\u0760\u0763\u0765\u0769"+
		"\u0770\u0776\u077a\u0780\u0785\u0787\u078d\u0791\u0797\u079e\u07a2\u07a4"+
		"\u07a6\u07ad\u07b7\u07bb\u07bd\u07bf\u07c3\u07c6\u07cc\u07d6\u07da\u07e0"+
		"\u07e8\u07ec\u07ef\u07f3\u07f8\u07fb\u07fe\u0802\u0807\u0811\u081b\u0822"+
		"\u0827\u082b\u0832\u0838\u083e\u0842\u0849\u084f\u0853\u0856\u085a\u085d"+
		"\u085f\u0862\u086c\u0871\u0873\u0876\u0879\u087c\u0885\u088f\u0894\u0897"+
		"\u089b\u089e\u08a1\u08a5\u08ae\u08bd\u08c3\u08c7\u08cb\u08cf\u08d3\u08d7"+
		"\u08db\u08df\u08e2\u08e6\u08f1\u08f5\u08fc\u0900\u0905\u090a\u0911\u0915"+
		"\u091f\u092f\u0934\u0938\u093b\u093f\u0945\u0948\u094c\u0956\u0959\u0961"+
		"\u0966\u096b\u0973\u097a\u097e\u0985\u098b\u098f\u0995\u099e\u09a2\u09a5"+
		"\u09b5\u09bc\u09c5\u09cb\u09cf\u09d2\u09d6\u09da\u09df\u09e6\u09ec\u09f0"+
		"\u09f9\u0a32\u0a3b";
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
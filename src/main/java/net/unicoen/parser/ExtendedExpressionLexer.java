// Generated from ExtendedExpression.g4 by ANTLR 4.5

	package net.unicoen.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExtendedExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFTPAREN=1, RIGHTPAREN=2, ZERO=3, NONZERODIGIT=4, ADD=5, SUB=6, MUL=7, 
		DIV=8, DOT=9, LARGER=10, LARGEROREQUALS=11, EQUALS=12, SMALLEROREQUALS=13, 
		SMALLER=14, IF=15, ELSE=16, LEFTBRACE=17, RIGHTBRACE=18, ID=19, SEMICOLON=20, 
		CLASS=21, VOID=22, EQUAL=23, INT=24, DOUBLE=25, PUBLIC=26, PRIVATE=27, 
		ABSTRACT=28, PROTECTED=29, PACKAGE=30, STATIC=31, FINAL=32, COMMA=33, 
		WHILE=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", "MUL", 
		"DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON", 
		"CLASS", "VOID", "EQUAL", "INT", "DOUBLE", "PUBLIC", "PRIVATE", "ABSTRACT", 
		"PROTECTED", "PACKAGE", "STATIC", "FINAL", "COMMA", "WHILE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'0'", null, "'+'", "'-'", "'*'", "'/'", "'.'", "'>'", 
		"'>='", "'=='", "'<='", "'<'", "'if'", "'else'", "'{'", "'}'", null, "';'", 
		"'class'", "'void'", "'='", "'int'", "'double'", "'public'", "'private'", 
		"'abstract'", "'protected'", "'package'", "'static'", "'final'", "','", 
		"'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", 
		"MUL", "DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON", 
		"CLASS", "VOID", "EQUAL", "INT", "DOUBLE", "PUBLIC", "PRIVATE", "ABSTRACT", 
		"PROTECTED", "PACKAGE", "STATIC", "FINAL", "COMMA", "WHILE", "WS"
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


	public ExtendedExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtendedExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3$\6$\u00d1\n$\r$\16$\u00d2\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\4\4\2C\\c|\5"+
		"\2\13\f\16\17\"\"\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13"+
		"Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27"+
		"]\3\2\2\2\31`\3\2\2\2\33c\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!k\3\2\2\2#p"+
		"\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-~\3\2\2\2/\u0083\3\2"+
		"\2\2\61\u0085\3\2\2\2\63\u0089\3\2\2\2\65\u0090\3\2\2\2\67\u0097\3\2\2"+
		"\29\u009f\3\2\2\2;\u00a8\3\2\2\2=\u00b2\3\2\2\2?\u00ba\3\2\2\2A\u00c1"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00c9\3\2\2\2G\u00d0\3\2\2\2IJ\7*\2\2J\4\3\2"+
		"\2\2KL\7+\2\2L\6\3\2\2\2MN\7\62\2\2N\b\3\2\2\2OP\4\63;\2P\n\3\2\2\2QR"+
		"\7-\2\2R\f\3\2\2\2ST\7/\2\2T\16\3\2\2\2UV\7,\2\2V\20\3\2\2\2WX\7\61\2"+
		"\2X\22\3\2\2\2YZ\7\60\2\2Z\24\3\2\2\2[\\\7@\2\2\\\26\3\2\2\2]^\7@\2\2"+
		"^_\7?\2\2_\30\3\2\2\2`a\7?\2\2ab\7?\2\2b\32\3\2\2\2cd\7>\2\2de\7?\2\2"+
		"e\34\3\2\2\2fg\7>\2\2g\36\3\2\2\2hi\7k\2\2ij\7h\2\2j \3\2\2\2kl\7g\2\2"+
		"lm\7n\2\2mn\7u\2\2no\7g\2\2o\"\3\2\2\2pq\7}\2\2q$\3\2\2\2rs\7\177\2\2"+
		"s&\3\2\2\2tu\t\2\2\2u(\3\2\2\2vw\7=\2\2w*\3\2\2\2xy\7e\2\2yz\7n\2\2z{"+
		"\7c\2\2{|\7u\2\2|}\7u\2\2},\3\2\2\2~\177\7x\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082.\3\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\60\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088"+
		"\62\3\2\2\2\u0089\u008a\7f\2\2\u008a\u008b\7q\2\2\u008b\u008c\7w\2\2\u008c"+
		"\u008d\7d\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\64\3\2\2\2\u0090"+
		"\u0091\7r\2\2\u0091\u0092\7w\2\2\u0092\u0093\7d\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7k\2\2\u0095\u0096\7e\2\2\u0096\66\3\2\2\2\u0097\u0098\7"+
		"r\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7x\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e8\3\2\2\2\u009f\u00a0"+
		"\7c\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7:\3\2\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7q\2"+
		"\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7f\2\2\u00b1<\3\2\2\2\u00b2\u00b3"+
		"\7r\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7m\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7g\2\2\u00b9>\3\2\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7k\2\2\u00bf\u00c0\7e\2\2\u00c0@\3\2\2\2\u00c1\u00c2\7h\2"+
		"\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7"+
		"y\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ceF\3\2\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b$\2\2\u00d5H\3\2\2\2\4\2\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
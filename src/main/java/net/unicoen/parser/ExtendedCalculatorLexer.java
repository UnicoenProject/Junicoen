// Generated from ExtendedCalculator.g4 by ANTLR 4.5.1

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
public class ExtendedCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Identifier=9, 
		IntegerLiteral=10, FloatingPointLiteral=11, PLUS=12, MINUS=13, MUL=14, 
		DIV=15, MOD=16, WS=17, COMMENT=18, LINE_COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Identifier", 
		"IntegerLiteral", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
		"FloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "BinaryExponent", "BinaryExponentIndicator", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "';'", "'('", "')'", "','", "'='", "'{'", "'}'", null, 
		null, null, "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Identifier", "IntegerLiteral", 
		"FloatingPointLiteral", "PLUS", "MINUS", "MUL", "DIV", "MOD", "WS", "COMMENT", 
		"LINE_COMMENT"
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


	public ExtendedCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExtendedCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\6\nU\n\n\r\n\16\nV\3\13\3\13\3\f\3\f\3\f\5\f^\n\f\5\f`\n\f"+
		"\3\r\7\rc\n\r\f\r\16\rf\13\r\3\16\3\16\5\16j\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\5\20q\n\20\3\20\5\20t\n\20\3\20\5\20w\n\20\3\20\3\20\3\20\5\20|"+
		"\n\20\3\20\5\20\177\n\20\3\20\3\20\3\20\5\20\u0084\n\20\3\20\3\20\3\20"+
		"\5\20\u0089\n\20\3\21\3\21\3\21\3\22\3\22\3\23\5\23\u0091\n\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00a9\n\35\r\35\16\35\u00aa\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u00b3\n\36\f\36\16\36\u00b6\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00c1\n\37\f\37\16\37\u00c4"+
		"\13\37\3\37\3\37\3\u00b4\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\2\31\2\33\2\35\2\37\r!\2#\2%\2\'\2)\2+\2-\2/\16\61\17\63\20\65\21"+
		"\67\229\23;\24=\25\3\2\n\5\2C\\aac|\3\2\63;\4\2GGgg\4\2--//\6\2FFHHff"+
		"hh\4\2RRrr\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00cd\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\3?\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2"+
		"\2\17O\3\2\2\2\21Q\3\2\2\2\23T\3\2\2\2\25X\3\2\2\2\27_\3\2\2\2\31d\3\2"+
		"\2\2\33i\3\2\2\2\35k\3\2\2\2\37\u0088\3\2\2\2!\u008a\3\2\2\2#\u008d\3"+
		"\2\2\2%\u0090\3\2\2\2\'\u0094\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u009b"+
		"\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3\3\2"+
		"\2\2\67\u00a5\3\2\2\29\u00a8\3\2\2\2;\u00ae\3\2\2\2=\u00bc\3\2\2\2?@\7"+
		"e\2\2@A\7n\2\2AB\7c\2\2BC\7u\2\2CD\7u\2\2D\4\3\2\2\2EF\7=\2\2F\6\3\2\2"+
		"\2GH\7*\2\2H\b\3\2\2\2IJ\7+\2\2J\n\3\2\2\2KL\7.\2\2L\f\3\2\2\2MN\7?\2"+
		"\2N\16\3\2\2\2OP\7}\2\2P\20\3\2\2\2QR\7\177\2\2R\22\3\2\2\2SU\t\2\2\2"+
		"TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\24\3\2\2\2XY\5\27\f\2Y\26\3"+
		"\2\2\2Z`\7\62\2\2[]\5\35\17\2\\^\5\31\r\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_Z\3\2\2\2_[\3\2\2\2`\30\3\2\2\2ac\5\33\16\2ba\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2e\32\3\2\2\2fd\3\2\2\2gj\7\62\2\2hj\5\35\17\2ig\3\2\2"+
		"\2ih\3\2\2\2j\34\3\2\2\2kl\t\3\2\2l\36\3\2\2\2mn\5\31\r\2np\7\60\2\2o"+
		"q\5\31\r\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5!\21\2sr\3\2\2\2st\3\2\2\2"+
		"tv\3\2\2\2uw\5)\25\2vu\3\2\2\2vw\3\2\2\2w\u0089\3\2\2\2xy\7\60\2\2y{\5"+
		"\31\r\2z|\5!\21\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\5)\25\2~}\3\2\2\2"+
		"~\177\3\2\2\2\177\u0089\3\2\2\2\u0080\u0081\5\31\r\2\u0081\u0083\5!\21"+
		"\2\u0082\u0084\5)\25\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0089"+
		"\3\2\2\2\u0085\u0086\5\31\r\2\u0086\u0087\5)\25\2\u0087\u0089\3\2\2\2"+
		"\u0088m\3\2\2\2\u0088x\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0085\3\2\2\2"+
		"\u0089 \3\2\2\2\u008a\u008b\5#\22\2\u008b\u008c\5%\23\2\u008c\"\3\2\2"+
		"\2\u008d\u008e\t\4\2\2\u008e$\3\2\2\2\u008f\u0091\5\'\24\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5\31\r\2"+
		"\u0093&\3\2\2\2\u0094\u0095\t\5\2\2\u0095(\3\2\2\2\u0096\u0097\t\6\2\2"+
		"\u0097*\3\2\2\2\u0098\u0099\5-\27\2\u0099\u009a\5%\23\2\u009a,\3\2\2\2"+
		"\u009b\u009c\t\7\2\2\u009c.\3\2\2\2\u009d\u009e\7-\2\2\u009e\60\3\2\2"+
		"\2\u009f\u00a0\7/\2\2\u00a0\62\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\64\3\2"+
		"\2\2\u00a3\u00a4\7\61\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a68"+
		"\3\2\2\2\u00a7\u00a9\t\b\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\35"+
		"\2\2\u00ad:\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7,\2\2\u00b0\u00b4"+
		"\3\2\2\2\u00b1\u00b3\13\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\b\36\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\7\61\2"+
		"\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\n\t\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\b\37\2\2\u00c6>\3\2\2\2\23\2V]_dipsv{~\u0083"+
		"\u0088\u0090\u00aa\u00b4\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
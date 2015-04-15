// Generated from ExtendedExpression.g4 by ANTLR 4.5

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
public class ExtendedExpressionParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_classModifiers = 1, RULE_classVisibility = 2, RULE_abs = 3, 
		RULE_stat = 4, RULE_methodDeclaration = 5, RULE_methodModifiers = 6, RULE_fin = 7, 
		RULE_methodVisibility = 8, RULE_methodArguments = 9, RULE_methodArgument = 10, 
		RULE_methodBody = 11, RULE_name = 12, RULE_type = 13, RULE_statement = 14, 
		RULE_variableDeclaration = 15, RULE_ifStatement = 16, RULE_whileStatement = 17, 
		RULE_expression = 18, RULE_compareExp = 19, RULE_compareOp = 20, RULE_normalExp = 21, 
		RULE_term = 22, RULE_factor = 23, RULE_number = 24, RULE_integer = 25, 
		RULE_decimal = 26, RULE_mulDivOp = 27, RULE_addSubOp = 28, RULE_digit = 29;
	public static final String[] ruleNames = {
		"program", "classModifiers", "classVisibility", "abs", "stat", "methodDeclaration", 
		"methodModifiers", "fin", "methodVisibility", "methodArguments", "methodArgument", 
		"methodBody", "name", "type", "statement", "variableDeclaration", "ifStatement", 
		"whileStatement", "expression", "compareExp", "compareOp", "normalExp", 
		"term", "factor", "number", "integer", "decimal", "mulDivOp", "addSubOp", 
		"digit"
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

	@Override
	public String getGrammarFileName() { return "ExtendedExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtendedExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(ExtendedExpressionParser.CLASS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LEFTBRACE() { return getToken(ExtendedExpressionParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(ExtendedExpressionParser.RIGHTBRACE, 0); }
		public TerminalNode EOF() { return getToken(ExtendedExpressionParser.EOF, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			classModifiers();
			setState(61);
			match(CLASS);
			setState(62);
			name();
			setState(63);
			match(LEFTBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << PACKAGE) | (1L << STATIC) | (1L << FINAL))) != 0)) {
				{
				{
				setState(64);
				methodDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RIGHTBRACE);
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public ClassVisibilityContext classVisibility() {
			return getRuleContext(ClassVisibilityContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ClassModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitClassModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(73);
				classVisibility();
				}
			}

			setState(77);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(76);
				abs();
				}
			}

			setState(80);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(79);
				stat();
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

	public static class ClassVisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ExtendedExpressionParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ExtendedExpressionParser.PRIVATE, 0); }
		public ClassVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVisibility; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitClassVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVisibilityContext classVisibility() throws RecognitionException {
		ClassVisibilityContext _localctx = new ClassVisibilityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==PUBLIC || _la==PRIVATE) ) {
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

	public static class AbsContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(ExtendedExpressionParser.ABSTRACT, 0); }
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ABSTRACT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(ExtendedExpressionParser.STATIC, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(STATIC);
			}
		}
		catch (RecognitionException re) {
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
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(ExtendedExpressionParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ExtendedExpressionParser.RIGHTPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			methodModifiers();
			setState(89);
			type();
			setState(90);
			name();
			setState(91);
			match(LEFTPAREN);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				setState(92);
				methodArguments();
				}
			}

			setState(95);
			match(RIGHTPAREN);
			setState(96);
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

	public static class MethodModifiersContext extends ParserRuleContext {
		public MethodVisibilityContext methodVisibility() {
			return getRuleContext(MethodVisibilityContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PACKAGE))) != 0)) {
				{
				setState(98);
				methodVisibility();
				}
			}

			setState(102);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(101);
				fin();
				}
			}

			setState(105);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(104);
				abs();
				}
			}

			setState(108);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(107);
				stat();
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

	public static class FinContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(ExtendedExpressionParser.FINAL, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodVisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ExtendedExpressionParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ExtendedExpressionParser.PROTECTED, 0); }
		public TerminalNode PACKAGE() { return getToken(ExtendedExpressionParser.PACKAGE, 0); }
		public TerminalNode PRIVATE() { return getToken(ExtendedExpressionParser.PRIVATE, 0); }
		public MethodVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodVisibility; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodVisibilityContext methodVisibility() throws RecognitionException {
		MethodVisibilityContext _localctx = new MethodVisibilityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PACKAGE))) != 0)) ) {
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public List<MethodArgumentContext> methodArgument() {
			return getRuleContexts(MethodArgumentContext.class);
		}
		public MethodArgumentContext methodArgument(int i) {
			return getRuleContext(MethodArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExtendedExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExtendedExpressionParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			methodArgument();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				methodArgument();
				}
				}
				setState(121);
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

	public static class MethodArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MethodArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentContext methodArgument() throws RecognitionException {
		MethodArgumentContext _localctx = new MethodArgumentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(123);
			name();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LEFTBRACE() { return getToken(ExtendedExpressionParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(ExtendedExpressionParser.RIGHTBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LEFTBRACE);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE))) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExtendedExpressionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedExpressionParser.ID, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(134);
				match(ID);
				}
				}
				setState(139);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ExtendedExpressionParser.VOID, 0); }
		public TerminalNode INT() { return getToken(ExtendedExpressionParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ExtendedExpressionParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				ifStatement();
				}
				break;
			case VOID:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				variableDeclaration();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				whileStatement();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ExtendedExpressionParser.EQUAL, 0); }
		public NormalExpContext normalExp() {
			return getRuleContext(NormalExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ExtendedExpressionParser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			name();
			setState(149);
			match(EQUAL);
			setState(150);
			normalExp();
			setState(151);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExtendedExpressionParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ExtendedExpressionParser.LEFTPAREN, 0); }
		public CompareExpContext compareExp() {
			return getRuleContext(CompareExpContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(ExtendedExpressionParser.RIGHTPAREN, 0); }
		public List<TerminalNode> LEFTBRACE() { return getTokens(ExtendedExpressionParser.LEFTBRACE); }
		public TerminalNode LEFTBRACE(int i) {
			return getToken(ExtendedExpressionParser.LEFTBRACE, i);
		}
		public List<TerminalNode> RIGHTBRACE() { return getTokens(ExtendedExpressionParser.RIGHTBRACE); }
		public TerminalNode RIGHTBRACE(int i) {
			return getToken(ExtendedExpressionParser.RIGHTBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ExtendedExpressionParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(LEFTPAREN);
			setState(155);
			compareExp();
			setState(156);
			match(RIGHTPAREN);
			setState(157);
			match(LEFTBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE))) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RIGHTBRACE);
			setState(168);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(165);
				match(ELSE);
				setState(166);
				match(LEFTBRACE);
				setState(167);
				match(RIGHTBRACE);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExtendedExpressionParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ExtendedExpressionParser.LEFTPAREN, 0); }
		public CompareExpContext compareExp() {
			return getRuleContext(CompareExpContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(ExtendedExpressionParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(ExtendedExpressionParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(ExtendedExpressionParser.RIGHTBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHILE);
			setState(171);
			match(LEFTPAREN);
			setState(172);
			compareExp();
			setState(173);
			match(RIGHTPAREN);
			setState(174);
			match(LEFTBRACE);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE))) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public CompareExpContext compareExp() {
			return getRuleContext(CompareExpContext.class,0);
		}
		public NormalExpContext normalExp() {
			return getRuleContext(NormalExpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				compareExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				normalExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpContext extends ParserRuleContext {
		public List<NormalExpContext> normalExp() {
			return getRuleContexts(NormalExpContext.class);
		}
		public NormalExpContext normalExp(int i) {
			return getRuleContext(NormalExpContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public CompareExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitCompareExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpContext compareExp() throws RecognitionException {
		CompareExpContext _localctx = new CompareExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compareExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			normalExp();
			setState(188);
			compareOp();
			setState(189);
			normalExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LARGER() { return getToken(ExtendedExpressionParser.LARGER, 0); }
		public TerminalNode LARGEROREQUALS() { return getToken(ExtendedExpressionParser.LARGEROREQUALS, 0); }
		public TerminalNode EQUALS() { return getToken(ExtendedExpressionParser.EQUALS, 0); }
		public TerminalNode SMALLEROREQUALS() { return getToken(ExtendedExpressionParser.SMALLEROREQUALS, 0); }
		public TerminalNode SMALLER() { return getToken(ExtendedExpressionParser.SMALLER, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LARGER) | (1L << LARGEROREQUALS) | (1L << EQUALS) | (1L << SMALLEROREQUALS) | (1L << SMALLER))) != 0)) ) {
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

	public static class NormalExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddSubOpContext> addSubOp() {
			return getRuleContexts(AddSubOpContext.class);
		}
		public AddSubOpContext addSubOp(int i) {
			return getRuleContext(AddSubOpContext.class,i);
		}
		public NormalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitNormalExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalExpContext normalExp() throws RecognitionException {
		NormalExpContext _localctx = new NormalExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_normalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			term();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(194);
				addSubOp();
				setState(195);
				term();
				}
				}
				setState(201);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulDivOpContext> mulDivOp() {
			return getRuleContexts(MulDivOpContext.class);
		}
		public MulDivOpContext mulDivOp(int i) {
			return getRuleContext(MulDivOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			factor();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(203);
				mulDivOp();
				setState(204);
				factor();
				}
				}
				setState(210);
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

	public static class FactorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(ExtendedExpressionParser.LEFTPAREN, 0); }
		public NormalExpContext normalExp() {
			return getRuleContext(NormalExpContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(ExtendedExpressionParser.RIGHTPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case ZERO:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				number();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(LEFTPAREN);
				setState(213);
				normalExp();
				setState(214);
				match(RIGHTPAREN);
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				decimal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(ExtendedExpressionParser.ZERO, 0); }
		public TerminalNode NONZERODIGIT() { return getToken(ExtendedExpressionParser.NONZERODIGIT, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integer);
		int _la;
		try {
			setState(230);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ZERO);
				}
				break;
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(NONZERODIGIT);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(224);
					digit();
					}
					}
					setState(229);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode NONZERODIGIT() { return getToken(ExtendedExpressionParser.NONZERODIGIT, 0); }
		public TerminalNode DOT() { return getToken(ExtendedExpressionParser.DOT, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public TerminalNode ZERO() { return getToken(ExtendedExpressionParser.ZERO, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decimal);
		int _la;
		try {
			setState(254);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(NONZERODIGIT);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(233);
					digit();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(DOT);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(240);
					digit();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ZERO);
				setState(247);
				match(DOT);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(248);
					digit();
					}
					}
					setState(253);
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

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(ExtendedExpressionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExtendedExpressionParser.DIV, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ExtendedExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExtendedExpressionParser.SUB, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(ExtendedExpressionParser.ZERO, 0); }
		public TerminalNode NONZERODIGIT() { return getToken(ExtendedExpressionParser.NONZERODIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedExpressionVisitor ) return ((ExtendedExpressionVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==NONZERODIGIT) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\2\3\3\5\3M\n\3\3\3\5\3P\n"+
		"\3\3\3\5\3S\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3"+
		"\7\3\7\3\7\3\b\5\bf\n\b\3\b\5\bi\n\b\3\b\5\bl\n\b\3\b\5\bo\n\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\f\3\r\3"+
		"\r\7\r\u0082\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\16\7\16\u008a\n\16\f\16"+
		"\16\16\u008d\13\16\3\17\3\17\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a2\n\22\f\22"+
		"\16\22\u00a5\13\22\3\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00b3\n\23\f\23\16\23\u00b6\13\23\3\23\3\23\3\24"+
		"\3\24\5\24\u00bc\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u00c8\n\27\f\27\16\27\u00cb\13\27\3\30\3\30\3\30\3\30\7\30\u00d1"+
		"\n\30\f\30\16\30\u00d4\13\30\3\31\3\31\3\31\3\31\3\31\5\31\u00db\n\31"+
		"\3\32\3\32\5\32\u00df\n\32\3\33\3\33\3\33\7\33\u00e4\n\33\f\33\16\33\u00e7"+
		"\13\33\5\33\u00e9\n\33\3\34\3\34\7\34\u00ed\n\34\f\34\16\34\u00f0\13\34"+
		"\3\34\3\34\7\34\u00f4\n\34\f\34\16\34\u00f7\13\34\3\34\3\34\3\34\7\34"+
		"\u00fc\n\34\f\34\16\34\u00ff\13\34\5\34\u0101\n\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<\2\t\3\2\34\35\4\2\34\35\37 \4\2\30\30\32\33\3\2\f\20\3\2"+
		"\t\n\3\2\7\b\3\2\5\6\u0106\2>\3\2\2\2\4L\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2"+
		"\nX\3\2\2\2\fZ\3\2\2\2\16e\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24t\3\2\2\2"+
		"\26|\3\2\2\2\30\177\3\2\2\2\32\u008b\3\2\2\2\34\u008e\3\2\2\2\36\u0093"+
		"\3\2\2\2 \u0095\3\2\2\2\"\u009b\3\2\2\2$\u00ac\3\2\2\2&\u00bb\3\2\2\2"+
		"(\u00bd\3\2\2\2*\u00c1\3\2\2\2,\u00c3\3\2\2\2.\u00cc\3\2\2\2\60\u00da"+
		"\3\2\2\2\62\u00de\3\2\2\2\64\u00e8\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2"+
		"\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2>?\5\4\3\2?@\7\27\2\2@A\5\32\16\2AE"+
		"\7\23\2\2BD\5\f\7\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"GE\3\2\2\2HI\7\24\2\2IJ\7\2\2\3J\3\3\2\2\2KM\5\6\4\2LK\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NP\5\b\5\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\n\6\2RQ\3\2\2"+
		"\2RS\3\2\2\2S\5\3\2\2\2TU\t\2\2\2U\7\3\2\2\2VW\7\36\2\2W\t\3\2\2\2XY\7"+
		"!\2\2Y\13\3\2\2\2Z[\5\16\b\2[\\\5\34\17\2\\]\5\32\16\2]_\7\3\2\2^`\5\24"+
		"\13\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\4\2\2bc\5\30\r\2c\r\3\2\2\2df"+
		"\5\22\n\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5\20\t\2hg\3\2\2\2hi\3\2\2\2"+
		"ik\3\2\2\2jl\5\b\5\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5\n\6\2nm\3\2\2\2"+
		"no\3\2\2\2o\17\3\2\2\2pq\7\"\2\2q\21\3\2\2\2rs\t\3\2\2s\23\3\2\2\2ty\5"+
		"\26\f\2uv\7#\2\2vx\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\25"+
		"\3\2\2\2{y\3\2\2\2|}\5\34\17\2}~\5\32\16\2~\27\3\2\2\2\177\u0083\7\23"+
		"\2\2\u0080\u0082\5\36\20\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7\24\2\2\u0087\31\3\2\2\2\u0088\u008a\7\25\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\33\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\t\4\2\2\u008f\35"+
		"\3\2\2\2\u0090\u0094\5\"\22\2\u0091\u0094\5 \21\2\u0092\u0094\5$\23\2"+
		"\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\37"+
		"\3\2\2\2\u0095\u0096\5\34\17\2\u0096\u0097\5\32\16\2\u0097\u0098\7\31"+
		"\2\2\u0098\u0099\5,\27\2\u0099\u009a\7\26\2\2\u009a!\3\2\2\2\u009b\u009c"+
		"\7\21\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5(\25\2\u009e\u009f\7\4\2\2"+
		"\u009f\u00a3\7\23\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\7\24\2\2\u00a7\u00a8\7\22\2\2\u00a8"+
		"\u00a9\7\23\2\2\u00a9\u00ab\7\24\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab#\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00af"+
		"\5(\25\2\u00af\u00b0\7\4\2\2\u00b0\u00b4\7\23\2\2\u00b1\u00b3\5\36\20"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\24\2\2"+
		"\u00b8%\3\2\2\2\u00b9\u00bc\5(\25\2\u00ba\u00bc\5,\27\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00be\5,\27\2\u00be\u00bf"+
		"\5*\26\2\u00bf\u00c0\5,\27\2\u00c0)\3\2\2\2\u00c1\u00c2\t\5\2\2\u00c2"+
		"+\3\2\2\2\u00c3\u00c9\5.\30\2\u00c4\u00c5\5:\36\2\u00c5\u00c6\5.\30\2"+
		"\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca-\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d2\5\60\31\2\u00cd\u00ce\58\35\2\u00ce\u00cf\5\60\31\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3/\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00db\5\62\32"+
		"\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\5,\27\2\u00d8\u00d9\7\4\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\61\3\2\2\2\u00dc"+
		"\u00df\5\64\33\2\u00dd\u00df\5\66\34\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\63\3\2\2\2\u00e0\u00e9\7\5\2\2\u00e1\u00e5\7\6\2\2\u00e2"+
		"\u00e4\5<\37\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9\65\3\2\2\2\u00ea\u00ee\7\6\2"+
		"\2\u00eb\u00ed\5<\37\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f5\7\13\2\2\u00f2\u00f4\5<\37\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0101\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7\5\2\2\u00f9\u00fd\7\13\2\2\u00fa\u00fc\5"+
		"<\37\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00ea\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0101\67\3\2\2\2\u0102\u0103\t\6\2\2\u01039\3"+
		"\2\2\2\u0104\u0105\t\7\2\2\u0105;\3\2\2\2\u0106\u0107\t\b\2\2\u0107=\3"+
		"\2\2\2\35ELOR_ehkny\u0083\u008b\u0093\u00a3\u00aa\u00b4\u00bb\u00c9\u00d2"+
		"\u00da\u00de\u00e5\u00e8\u00ee\u00f5\u00fd\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
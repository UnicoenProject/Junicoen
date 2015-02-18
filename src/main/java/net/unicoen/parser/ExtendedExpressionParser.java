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
		CLASS=21, VOID=22, EQUAL=23, INT=24, PUBLIC=25, PRIVATE=26, ABSTRACT=27, 
		PROTECTED=28, PACKAGE=29, STATIC=30, FINAL=31, COMMA=32, WS=33;
	public static final int
		RULE_program = 0, RULE_classModifiers = 1, RULE_classVisibility = 2, RULE_abs = 3, 
		RULE_stat = 4, RULE_methodDeclaration = 5, RULE_methodModifiers = 6, RULE_fin = 7, 
		RULE_methodVisibility = 8, RULE_methodArguments = 9, RULE_methodArgument = 10, 
		RULE_methodBody = 11, RULE_name = 12, RULE_type = 13, RULE_statement = 14, 
		RULE_variableDeclaration = 15, RULE_ifStatement = 16, RULE_expression = 17, 
		RULE_compareExp = 18, RULE_compareOp = 19, RULE_normalExp = 20, RULE_term = 21, 
		RULE_factor = 22, RULE_number = 23, RULE_integer = 24, RULE_decimal = 25, 
		RULE_mulDivOp = 26, RULE_addSubOp = 27, RULE_digit = 28;
	public static final String[] ruleNames = {
		"program", "classModifiers", "classVisibility", "abs", "stat", "methodDeclaration", 
		"methodModifiers", "fin", "methodVisibility", "methodArguments", "methodArgument", 
		"methodBody", "name", "type", "statement", "variableDeclaration", "ifStatement", 
		"expression", "compareExp", "compareOp", "normalExp", "term", "factor", 
		"number", "integer", "decimal", "mulDivOp", "addSubOp", "digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'0'", null, "'+'", "'-'", "'*'", "'/'", "'.'", "'>'", 
		"'>='", "'=='", "'<='", "'<'", "'if'", "'else'", "'{'", "'}'", null, "';'", 
		"'class'", "'void'", "'='", "'int'", "'public'", "'private'", "'abstract'", 
		"'protected'", "'package'", "'static'", "'final'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", 
		"MUL", "DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON", 
		"CLASS", "VOID", "EQUAL", "INT", "PUBLIC", "PRIVATE", "ABSTRACT", "PROTECTED", 
		"PACKAGE", "STATIC", "FINAL", "COMMA", "WS"
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
			setState(58);
			classModifiers();
			setState(59);
			match(CLASS);
			setState(60);
			name();
			setState(61);
			match(LEFTBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << PACKAGE) | (1L << STATIC) | (1L << FINAL))) != 0)) {
				{
				{
				setState(62);
				methodDeclaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RIGHTBRACE);
			setState(69);
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
			setState(72);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(71);
				classVisibility();
				}
			}

			setState(75);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(74);
				abs();
				}
			}

			setState(78);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(77);
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
			setState(80);
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
			setState(82);
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
			setState(84);
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
			setState(86);
			methodModifiers();
			setState(87);
			type();
			setState(88);
			name();
			setState(89);
			match(LEFTPAREN);
			setState(91);
			_la = _input.LA(1);
			if (_la==VOID || _la==INT) {
				{
				setState(90);
				methodArguments();
				}
			}

			setState(93);
			match(RIGHTPAREN);
			setState(94);
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
			setState(97);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PACKAGE))) != 0)) {
				{
				setState(96);
				methodVisibility();
				}
			}

			setState(100);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(99);
				fin();
				}
			}

			setState(103);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(102);
				abs();
				}
			}

			setState(106);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(105);
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
			setState(108);
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
			setState(110);
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
			setState(112);
			methodArgument();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				methodArgument();
				}
				}
				setState(119);
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
			setState(120);
			type();
			setState(121);
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
			setState(123);
			match(LEFTBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(132);
				match(ID);
				}
				}
				setState(137);
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
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==INT) ) {
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
			setState(142);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				ifStatement();
				}
				break;
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				variableDeclaration();
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
			setState(144);
			type();
			setState(145);
			name();
			setState(146);
			match(EQUAL);
			setState(147);
			normalExp();
			setState(148);
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
			setState(150);
			match(IF);
			setState(151);
			match(LEFTPAREN);
			setState(152);
			compareExp();
			setState(153);
			match(RIGHTPAREN);
			setState(154);
			match(LEFTBRACE);
			setState(155);
			match(RIGHTBRACE);
			setState(159);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(156);
				match(ELSE);
				setState(157);
				match(LEFTBRACE);
				setState(158);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				compareExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		enterRule(_localctx, 36, RULE_compareExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			normalExp();
			setState(166);
			compareOp();
			setState(167);
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
		enterRule(_localctx, 38, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 40, RULE_normalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			term();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(172);
				addSubOp();
				setState(173);
				term();
				}
				}
				setState(179);
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
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			factor();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(181);
				mulDivOp();
				setState(182);
				factor();
				}
				}
				setState(188);
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
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case ZERO:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				number();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(LEFTPAREN);
				setState(191);
				normalExp();
				setState(192);
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
		enterRule(_localctx, 46, RULE_number);
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		enterRule(_localctx, 48, RULE_integer);
		int _la;
		try {
			setState(208);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(ZERO);
				}
				break;
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(NONZERODIGIT);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(202);
					digit();
					}
					}
					setState(207);
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
		enterRule(_localctx, 50, RULE_decimal);
		int _la;
		try {
			setState(232);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(NONZERODIGIT);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(211);
					digit();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(DOT);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(218);
					digit();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ZERO);
				setState(225);
				match(DOT);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(226);
					digit();
					}
					}
					setState(231);
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
		enterRule(_localctx, 52, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 54, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 56, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\3\5\3K\n\3\3\3\5\3N\n\3\3\3\5\3"+
		"Q\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\3\7"+
		"\3\b\5\bd\n\b\3\b\5\bg\n\b\3\b\5\bj\n\b\3\b\5\bm\n\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\f\3\r\3\r\7\r\u0080"+
		"\n\r\f\r\16\r\u0083\13\r\3\r\3\r\3\16\7\16\u0088\n\16\f\16\16\16\u008b"+
		"\13\16\3\17\3\17\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a2\n\22\3\23"+
		"\3\23\5\23\u00a6\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\7\26\u00b2\n\26\f\26\16\26\u00b5\13\26\3\27\3\27\3\27\3\27\7\27\u00bb"+
		"\n\27\f\27\16\27\u00be\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u00c5\n\30"+
		"\3\31\3\31\5\31\u00c9\n\31\3\32\3\32\3\32\7\32\u00ce\n\32\f\32\16\32\u00d1"+
		"\13\32\5\32\u00d3\n\32\3\33\3\33\7\33\u00d7\n\33\f\33\16\33\u00da\13\33"+
		"\3\33\3\33\7\33\u00de\n\33\f\33\16\33\u00e1\13\33\3\33\3\33\3\33\7\33"+
		"\u00e6\n\33\f\33\16\33\u00e9\13\33\5\33\u00eb\n\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:\2\t\3\2\33\34\4\2\33\34\36\37\4\2\30\30\32\32\3\2\f\20"+
		"\3\2\t\n\3\2\7\b\3\2\5\6\u00ee\2<\3\2\2\2\4J\3\2\2\2\6R\3\2\2\2\bT\3\2"+
		"\2\2\nV\3\2\2\2\fX\3\2\2\2\16c\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24r\3\2"+
		"\2\2\26z\3\2\2\2\30}\3\2\2\2\32\u0089\3\2\2\2\34\u008c\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u0092\3\2\2\2\"\u0098\3\2\2\2$\u00a5\3\2\2\2&\u00a7\3\2\2\2"+
		"(\u00ab\3\2\2\2*\u00ad\3\2\2\2,\u00b6\3\2\2\2.\u00c4\3\2\2\2\60\u00c8"+
		"\3\2\2\2\62\u00d2\3\2\2\2\64\u00ea\3\2\2\2\66\u00ec\3\2\2\28\u00ee\3\2"+
		"\2\2:\u00f0\3\2\2\2<=\5\4\3\2=>\7\27\2\2>?\5\32\16\2?C\7\23\2\2@B\5\f"+
		"\7\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\24"+
		"\2\2GH\7\2\2\3H\3\3\2\2\2IK\5\6\4\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5"+
		"\b\5\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\5\n\6\2PO\3\2\2\2PQ\3\2\2\2Q\5"+
		"\3\2\2\2RS\t\2\2\2S\7\3\2\2\2TU\7\35\2\2U\t\3\2\2\2VW\7 \2\2W\13\3\2\2"+
		"\2XY\5\16\b\2YZ\5\34\17\2Z[\5\32\16\2[]\7\3\2\2\\^\5\24\13\2]\\\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_`\7\4\2\2`a\5\30\r\2a\r\3\2\2\2bd\5\22\n\2cb\3"+
		"\2\2\2cd\3\2\2\2df\3\2\2\2eg\5\20\t\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj"+
		"\5\b\5\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5\n\6\2lk\3\2\2\2lm\3\2\2\2m"+
		"\17\3\2\2\2no\7!\2\2o\21\3\2\2\2pq\t\3\2\2q\23\3\2\2\2rw\5\26\f\2st\7"+
		"\"\2\2tv\5\26\f\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2\2\2"+
		"yw\3\2\2\2z{\5\34\17\2{|\5\32\16\2|\27\3\2\2\2}\u0081\7\23\2\2~\u0080"+
		"\5\36\20\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\24\2\2"+
		"\u0085\31\3\2\2\2\u0086\u0088\7\25\2\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\33\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\t\4\2\2\u008d\35\3\2\2\2\u008e\u0091\5\"\22"+
		"\2\u008f\u0091\5 \21\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\37"+
		"\3\2\2\2\u0092\u0093\5\34\17\2\u0093\u0094\5\32\16\2\u0094\u0095\7\31"+
		"\2\2\u0095\u0096\5*\26\2\u0096\u0097\7\26\2\2\u0097!\3\2\2\2\u0098\u0099"+
		"\7\21\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5&\24\2\u009b\u009c\7\4\2\2"+
		"\u009c\u009d\7\23\2\2\u009d\u00a1\7\24\2\2\u009e\u009f\7\22\2\2\u009f"+
		"\u00a0\7\23\2\2\u00a0\u00a2\7\24\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2#\3\2\2\2\u00a3\u00a6\5&\24\2\u00a4\u00a6\5*\26\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00a8\5*\26\2\u00a8"+
		"\u00a9\5(\25\2\u00a9\u00aa\5*\26\2\u00aa\'\3\2\2\2\u00ab\u00ac\t\5\2\2"+
		"\u00ac)\3\2\2\2\u00ad\u00b3\5,\27\2\u00ae\u00af\58\35\2\u00af\u00b0\5"+
		",\27\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4+\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b6\u00bc\5.\30\2\u00b7\u00b8\5\66\34\2\u00b8\u00b9\5.\30\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd-\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c5\5\60\31"+
		"\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5*\26\2\u00c2\u00c3\7\4\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5/\3\2\2\2\u00c6"+
		"\u00c9\5\62\32\2\u00c7\u00c9\5\64\33\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\61\3\2\2\2\u00ca\u00d3\7\5\2\2\u00cb\u00cf\7\6\2\2\u00cc"+
		"\u00ce\5:\36\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\63\3\2\2\2\u00d4\u00d8\7\6\2"+
		"\2\u00d5\u00d7\5:\36\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00df\7\13\2\2\u00dc\u00de\5:\36\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00eb\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e7\7\13\2\2\u00e4\u00e6\5"+
		":\36\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00d4\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00eb\65\3\2\2\2\u00ec\u00ed\t\6\2\2\u00ed\67"+
		"\3\2\2\2\u00ee\u00ef\t\7\2\2\u00ef9\3\2\2\2\u00f0\u00f1\t\b\2\2\u00f1"+
		";\3\2\2\2\33CJMP]cfilw\u0081\u0089\u0090\u00a1\u00a5\u00b3\u00bc\u00c4"+
		"\u00c8\u00cf\u00d2\u00d8\u00df\u00e7\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
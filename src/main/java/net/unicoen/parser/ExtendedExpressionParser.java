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
		CLASS=21, VOID=22, EQUAL=23, INT=24;
	public static final int
		RULE_program = 0, RULE_methodDeclaration = 1, RULE_methodBody = 2, RULE_name = 3, 
		RULE_statement = 4, RULE_variableDeclaration = 5, RULE_ifStatement = 6, 
		RULE_expression = 7, RULE_compareExp = 8, RULE_compareOp = 9, RULE_normalExp = 10, 
		RULE_term = 11, RULE_factor = 12, RULE_number = 13, RULE_integer = 14, 
		RULE_decimal = 15, RULE_mulDivOp = 16, RULE_addSubOp = 17, RULE_digit = 18;
	public static final String[] ruleNames = {
		"program", "methodDeclaration", "methodBody", "name", "statement", "variableDeclaration", 
		"ifStatement", "expression", "compareExp", "compareOp", "normalExp", "term", 
		"factor", "number", "integer", "decimal", "mulDivOp", "addSubOp", "digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'0'", null, "'+'", "'-'", "'*'", "'/'", "'.'", "'>'", 
		"'>='", "'=='", "'<='", "'<'", "'if'", "'else'", "'{'", "'}'", null, "';'", 
		"'class'", "'void'", "'='", "'int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", 
		"MUL", "DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON", 
		"CLASS", "VOID", "EQUAL", "INT"
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
			setState(38);
			match(CLASS);
			setState(39);
			name();
			setState(40);
			match(LEFTBRACE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID) {
				{
				{
				setState(41);
				methodDeclaration();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(RIGHTBRACE);
			setState(48);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ExtendedExpressionParser.VOID, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(ExtendedExpressionParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ExtendedExpressionParser.RIGHTPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
		enterRule(_localctx, 2, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(VOID);
			setState(51);
			name();
			setState(52);
			match(LEFTPAREN);
			setState(53);
			match(RIGHTPAREN);
			setState(54);
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
		enterRule(_localctx, 4, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LEFTBRACE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==INT) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(65);
				match(ID);
				}
				}
				setState(70);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				ifStatement();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
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
		public TerminalNode INT() { return getToken(ExtendedExpressionParser.INT, 0); }
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
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(INT);
			setState(76);
			name();
			setState(77);
			match(EQUAL);
			setState(78);
			normalExp();
			setState(79);
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
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IF);
			setState(82);
			match(LEFTPAREN);
			setState(83);
			compareExp();
			setState(84);
			match(RIGHTPAREN);
			setState(85);
			match(LEFTBRACE);
			setState(86);
			match(RIGHTBRACE);
			setState(90);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(87);
				match(ELSE);
				setState(88);
				match(LEFTBRACE);
				setState(89);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				compareExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
		enterRule(_localctx, 16, RULE_compareExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			normalExp();
			setState(97);
			compareOp();
			setState(98);
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
		enterRule(_localctx, 18, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 20, RULE_normalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			term();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(103);
				addSubOp();
				setState(104);
				term();
				}
				}
				setState(110);
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
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			factor();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(112);
				mulDivOp();
				setState(113);
				factor();
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
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case ZERO:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				number();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(LEFTPAREN);
				setState(122);
				normalExp();
				setState(123);
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
		enterRule(_localctx, 26, RULE_number);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
		enterRule(_localctx, 28, RULE_integer);
		int _la;
		try {
			setState(139);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ZERO);
				}
				break;
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NONZERODIGIT);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(133);
					digit();
					}
					}
					setState(138);
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
		enterRule(_localctx, 30, RULE_decimal);
		int _la;
		try {
			setState(163);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NONZERODIGIT);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(142);
					digit();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(DOT);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(149);
					digit();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ZERO);
				setState(156);
				match(DOT);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(157);
					digit();
					}
					}
					setState(162);
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
		enterRule(_localctx, 32, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 34, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 36, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3"+
		"\5\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\5\ta\n\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\r\3\r\3\r\3"+
		"\r\7\rv\n\r\f\r\16\ry\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u0080\n\16\3"+
		"\17\3\17\5\17\u0084\n\17\3\20\3\20\3\20\7\20\u0089\n\20\f\20\16\20\u008c"+
		"\13\20\5\20\u008e\n\20\3\21\3\21\7\21\u0092\n\21\f\21\16\21\u0095\13\21"+
		"\3\21\3\21\7\21\u0099\n\21\f\21\16\21\u009c\13\21\3\21\3\21\3\21\7\21"+
		"\u00a1\n\21\f\21\16\21\u00a4\13\21\5\21\u00a6\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6"+
		"\3\2\f\20\3\2\t\n\3\2\7\b\3\2\5\6\u00aa\2(\3\2\2\2\4\64\3\2\2\2\6:\3\2"+
		"\2\2\bF\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16S\3\2\2\2\20`\3\2\2\2\22b\3\2"+
		"\2\2\24f\3\2\2\2\26h\3\2\2\2\30q\3\2\2\2\32\177\3\2\2\2\34\u0083\3\2\2"+
		"\2\36\u008d\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00a9\3\2\2\2&\u00ab"+
		"\3\2\2\2()\7\27\2\2)*\5\b\5\2*.\7\23\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2"+
		"\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\24\2\2\62\63\7"+
		"\2\2\3\63\3\3\2\2\2\64\65\7\30\2\2\65\66\5\b\5\2\66\67\7\3\2\2\678\7\4"+
		"\2\289\5\6\4\29\5\3\2\2\2:>\7\23\2\2;=\5\n\6\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\24\2\2B\7\3\2\2\2CE\7\25\2\2"+
		"DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2IL\5\16\b"+
		"\2JL\5\f\7\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MN\7\32\2\2NO\5\b\5\2OP\7"+
		"\31\2\2PQ\5\26\f\2QR\7\26\2\2R\r\3\2\2\2ST\7\21\2\2TU\7\3\2\2UV\5\22\n"+
		"\2VW\7\4\2\2WX\7\23\2\2X\\\7\24\2\2YZ\7\22\2\2Z[\7\23\2\2[]\7\24\2\2\\"+
		"Y\3\2\2\2\\]\3\2\2\2]\17\3\2\2\2^a\5\22\n\2_a\5\26\f\2`^\3\2\2\2`_\3\2"+
		"\2\2a\21\3\2\2\2bc\5\26\f\2cd\5\24\13\2de\5\26\f\2e\23\3\2\2\2fg\t\2\2"+
		"\2g\25\3\2\2\2hn\5\30\r\2ij\5$\23\2jk\5\30\r\2km\3\2\2\2li\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2no\3\2\2\2o\27\3\2\2\2pn\3\2\2\2qw\5\32\16\2rs\5\"\22"+
		"\2st\5\32\16\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\31\3"+
		"\2\2\2yw\3\2\2\2z\u0080\5\34\17\2{|\7\3\2\2|}\5\26\f\2}~\7\4\2\2~\u0080"+
		"\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080\33\3\2\2\2\u0081\u0084\5\36\20"+
		"\2\u0082\u0084\5 \21\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\35"+
		"\3\2\2\2\u0085\u008e\7\5\2\2\u0086\u008a\7\6\2\2\u0087\u0089\5&\24\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0085\3\2\2\2\u008d"+
		"\u0086\3\2\2\2\u008e\37\3\2\2\2\u008f\u0093\7\6\2\2\u0090\u0092\5&\24"+
		"\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\7\13\2\2"+
		"\u0097\u0099\5&\24\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a6\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\5\2\2\u009e\u00a2\7\13\2\2\u009f\u00a1\5&\24\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u008f\3\2\2\2\u00a5\u009d\3\2"+
		"\2\2\u00a6!\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8#\3\2\2\2\u00a9\u00aa\t\4"+
		"\2\2\u00aa%\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac\'\3\2\2\2\22.>FK\\`nw\177"+
		"\u0083\u008a\u008d\u0093\u009a\u00a2\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
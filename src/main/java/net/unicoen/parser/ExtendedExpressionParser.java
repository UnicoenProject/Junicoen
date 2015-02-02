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
		SMALLER=14, IF=15, ELSE=16, LEFTBRACE=17, RIGHTBRACE=18, ID=19, SEMICOLON=20;
	public static final int
		RULE_program = 0, RULE_ifStatement = 1, RULE_expression = 2, RULE_compareExp = 3, 
		RULE_compareOp = 4, RULE_normalExp = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_number = 8, RULE_integer = 9, RULE_decimal = 10, RULE_mulDivOp = 11, 
		RULE_addSubOp = 12, RULE_digit = 13;
	public static final String[] ruleNames = {
		"program", "ifStatement", "expression", "compareExp", "compareOp", "normalExp", 
		"term", "factor", "number", "integer", "decimal", "mulDivOp", "addSubOp", 
		"digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'0'", null, "'+'", "'-'", "'*'", "'/'", "'.'", "'>'", 
		"'>='", "'=='", "'<='", "'<'", "'if'", "'else'", "'{'", "'}'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", 
		"MUL", "DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON"
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
		public TerminalNode EOF() { return getToken(ExtendedExpressionParser.EOF, 0); }
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPAREN) | (1L << ZERO) | (1L << NONZERODIGIT) | (1L << IF))) != 0)) {
				{
				setState(30);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(28);
					ifStatement();
					}
					break;
				case LEFTPAREN:
				case ZERO:
				case NONZERODIGIT:
					{
					setState(29);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
		enterRule(_localctx, 2, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(IF);
			setState(38);
			match(LEFTPAREN);
			setState(39);
			compareExp();
			setState(40);
			match(RIGHTPAREN);
			setState(41);
			match(LEFTBRACE);
			setState(42);
			match(RIGHTBRACE);
			setState(46);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(43);
				match(ELSE);
				setState(44);
				match(LEFTBRACE);
				setState(45);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				compareExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
		enterRule(_localctx, 6, RULE_compareExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			normalExp();
			setState(53);
			compareOp();
			setState(54);
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
		enterRule(_localctx, 8, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 10, RULE_normalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			term();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(59);
				addSubOp();
				setState(60);
				term();
				}
				}
				setState(66);
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			factor();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(68);
				mulDivOp();
				setState(69);
				factor();
				}
				}
				setState(75);
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
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case ZERO:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				number();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(LEFTPAREN);
				setState(78);
				normalExp();
				setState(79);
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
		enterRule(_localctx, 16, RULE_number);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
		enterRule(_localctx, 18, RULE_integer);
		try {
			int _alt;
			setState(95);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ZERO);
				}
				break;
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(NONZERODIGIT);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						digit();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 20, RULE_decimal);
		int _la;
		try {
			int _alt;
			setState(119);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(NONZERODIGIT);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(98);
					digit();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(DOT);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						digit();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(ZERO);
				setState(112);
				match(DOT);
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						digit();
						}
						} 
					}
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 22, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 24, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 26, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13"+
		"\7\3\b\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\3\t\3\t\3\t\5\tT\n"+
		"\t\3\n\3\n\5\nX\n\n\3\13\3\13\3\13\7\13]\n\13\f\13\16\13`\13\13\5\13b"+
		"\n\13\3\f\3\f\7\ff\n\f\f\f\16\fi\13\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f"+
		"\3\f\3\f\3\f\7\fu\n\f\f\f\16\fx\13\f\5\fz\n\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2\f\20\3\2\t"+
		"\n\3\2\7\b\3\2\5\6\u0081\2\"\3\2\2\2\4\'\3\2\2\2\6\64\3\2\2\2\b\66\3\2"+
		"\2\2\n:\3\2\2\2\f<\3\2\2\2\16E\3\2\2\2\20S\3\2\2\2\22W\3\2\2\2\24a\3\2"+
		"\2\2\26y\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\177\3\2\2\2\36!\5\4\3\2\37"+
		"!\5\6\4\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3"+
		"\2\2\2$\"\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\7\21\2\2()\7\3\2\2)*\5\b\5\2"+
		"*+\7\4\2\2+,\7\23\2\2,\60\7\24\2\2-.\7\22\2\2./\7\23\2\2/\61\7\24\2\2"+
		"\60-\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\65\5\b\5\2\63\65\5\f\7\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\5\f\7\2\678\5\n\6\289\5\f"+
		"\7\29\t\3\2\2\2:;\t\2\2\2;\13\3\2\2\2<B\5\16\b\2=>\5\32\16\2>?\5\16\b"+
		"\2?A\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DB\3\2"+
		"\2\2EK\5\20\t\2FG\5\30\r\2GH\5\20\t\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI"+
		"\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2\2NT\5\22\n\2OP\7\3\2\2PQ\5\f\7"+
		"\2QR\7\4\2\2RT\3\2\2\2SN\3\2\2\2SO\3\2\2\2T\21\3\2\2\2UX\5\24\13\2VX\5"+
		"\26\f\2WU\3\2\2\2WV\3\2\2\2X\23\3\2\2\2Yb\7\5\2\2Z^\7\6\2\2[]\5\34\17"+
		"\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2"+
		"\2\2aZ\3\2\2\2b\25\3\2\2\2cg\7\6\2\2df\5\34\17\2ed\3\2\2\2fi\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jn\7\13\2\2km\5\34\17\2lk\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oz\3\2\2\2pn\3\2\2\2qr\7\5\2\2rv\7\13"+
		"\2\2su\5\34\17\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2yc\3\2\2\2yq\3\2\2\2z\27\3\2\2\2{|\t\3\2\2|\31\3\2\2\2}~\t\4\2\2"+
		"~\33\3\2\2\2\177\u0080\t\5\2\2\u0080\35\3\2\2\2\20 \"\60\64BKSW^agnvy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
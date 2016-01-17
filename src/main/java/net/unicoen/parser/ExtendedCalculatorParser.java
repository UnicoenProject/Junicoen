// Generated from ExtendedCalculator.g4 by ANTLR 4.5.1

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
public class ExtendedCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Identifier=9, 
		IntegerLiteral=10, FloatingPointLiteral=11, PLUS=12, MINUS=13, MUL=14, 
		DIV=15, MOD=16, WS=17, COMMENT=18, LINE_COMMENT=19;
	public static final int
		RULE_compilationUnit = 0, RULE_classNameDeclaration = 1, RULE_expressionList = 2, 
		RULE_expression = 3, RULE_addSubExpression = 4, RULE_mulDivExpression = 5, 
		RULE_factor = 6, RULE_nestedExpression = 7, RULE_functionCall = 8, RULE_functionName = 9, 
		RULE_argumentList = 10, RULE_argument = 11, RULE_variableAccess = 12, 
		RULE_literal = 13, RULE_variableDeclaration = 14, RULE_variableName = 15, 
		RULE_functionDeclaration = 16, RULE_methodBody = 17, RULE_addSubExpressionList = 18, 
		RULE_parameterList = 19, RULE_parameter = 20, RULE_integerLiteral = 21, 
		RULE_floatingPointLiteral = 22;
	public static final String[] ruleNames = {
		"compilationUnit", "classNameDeclaration", "expressionList", "expression", 
		"addSubExpression", "mulDivExpression", "factor", "nestedExpression", 
		"functionCall", "functionName", "argumentList", "argument", "variableAccess", 
		"literal", "variableDeclaration", "variableName", "functionDeclaration", 
		"methodBody", "addSubExpressionList", "parameterList", "parameter", "integerLiteral", 
		"floatingPointLiteral"
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

	@Override
	public String getGrammarFileName() { return "ExtendedCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtendedCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ClassNameDeclarationContext classNameDeclaration() {
			return getRuleContext(ClassNameDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				classNameDeclaration();
				}
			}

			setState(49);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExtendedCalculatorParser.Identifier, 0); }
		public ClassNameDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitClassNameDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameDeclarationContext classNameDeclaration() throws RecognitionException {
		ClassNameDeclarationContext _localctx = new ClassNameDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classNameDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(Identifier);
			setState(53);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(55);
				expression();
				}
				}
				setState(60);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSubExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExtendedCalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExtendedCalculatorParser.MINUS, 0); }
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		return addSubExpression(0);
	}

	private AddSubExpressionContext addSubExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, _parentState);
		AddSubExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_addSubExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66);
			mulDivExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						match(PLUS);
						setState(70);
						mulDivExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(71);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(72);
						match(MINUS);
						setState(73);
						mulDivExpression(0);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MulDivExpressionContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(ExtendedCalculatorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExtendedCalculatorParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExtendedCalculatorParser.MOD, 0); }
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		return mulDivExpression(0);
	}

	private MulDivExpressionContext mulDivExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, _parentState);
		MulDivExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_mulDivExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						match(MUL);
						setState(84);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new MulDivExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						match(DIV);
						setState(87);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new MulDivExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulDivExpression);
						setState(88);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(89);
						match(MOD);
						setState(90);
						factor();
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NestedExpressionContext nestedExpression() {
			return getRuleContext(NestedExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				variableAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				nestedExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedExpressionContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__2);
			setState(103);
			addSubExpression(0);
			setState(104);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			functionName();
			setState(107);
			match(T__2);
			setState(109);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Identifier) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral))) != 0)) {
				{
				setState(108);
				argumentList();
				}
			}

			setState(111);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExtendedCalculatorParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			argument();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(116);
				match(T__4);
				setState(117);
				argument();
				}
				}
				setState(122);
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

	public static class ArgumentContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			addSubExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAccessContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitVariableAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			variableName();
			}
		}
		catch (RecognitionException re) {
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				floatingPointLiteral();
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
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			variableName();
			setState(132);
			match(T__5);
			setState(133);
			addSubExpression(0);
			setState(134);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ExtendedCalculatorParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			functionName();
			setState(139);
			match(T__2);
			setState(141);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(140);
				parameterList();
				}
			}

			setState(143);
			match(T__3);
			setState(144);
			match(T__5);
			setState(145);
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
		public AddSubExpressionListContext addSubExpressionList() {
			return getRuleContext(AddSubExpressionListContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__6);
			setState(148);
			addSubExpressionList();
			setState(149);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSubExpressionListContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public AddSubExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitAddSubExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionListContext addSubExpressionList() throws RecognitionException {
		AddSubExpressionListContext _localctx = new AddSubExpressionListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addSubExpressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			addSubExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			parameter();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(154);
				match(T__4);
				setState(155);
				parameter();
				}
				}
				setState(160);
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

	public static class ParameterContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ExtendedCalculatorParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(ExtendedCalculatorParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedCalculatorVisitor ) return ((ExtendedCalculatorVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(FloatingPointLiteral);
			}
		}
		catch (RecognitionException re) {
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
		case 4:
			return addSubExpression_sempred((AddSubExpressionContext)_localctx, predIndex);
		case 5:
			return mulDivExpression_sempred((MulDivExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addSubExpression_sempred(AddSubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulDivExpression_sempred(MulDivExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\5\5B"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b"+
		"\3\b\3\b\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\5\17\u0084\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22"+
		"\u0090\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u009f\n\25\f\25\16\25\u00a2\13\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\2\4\n\f\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\2\2\u00a2\2\61\3\2\2\2\4\65\3\2\2\2\6<\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2"+
		"\fQ\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22l\3\2\2\2\24s\3\2\2\2\26u\3\2\2"+
		"\2\30}\3\2\2\2\32\177\3\2\2\2\34\u0083\3\2\2\2\36\u0085\3\2\2\2 \u008a"+
		"\3\2\2\2\"\u008c\3\2\2\2$\u0095\3\2\2\2&\u0099\3\2\2\2(\u009b\3\2\2\2"+
		"*\u00a3\3\2\2\2,\u00a5\3\2\2\2.\u00a7\3\2\2\2\60\62\5\4\3\2\61\60\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\6\4\2\64\3\3\2\2\2\65\66\7\3"+
		"\2\2\66\67\7\13\2\2\678\7\4\2\28\5\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2\2?B\5\36\20\2@B\5\"\22\2A?\3"+
		"\2\2\2A@\3\2\2\2B\t\3\2\2\2CD\b\6\1\2DE\5\f\7\2EN\3\2\2\2FG\f\4\2\2GH"+
		"\7\16\2\2HM\5\f\7\2IJ\f\3\2\2JK\7\17\2\2KM\5\f\7\2LF\3\2\2\2LI\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\b\7\1\2RS\5\16"+
		"\b\2S_\3\2\2\2TU\f\5\2\2UV\7\20\2\2V^\5\16\b\2WX\f\4\2\2XY\7\21\2\2Y^"+
		"\5\16\b\2Z[\f\3\2\2[\\\7\22\2\2\\^\5\16\b\2]T\3\2\2\2]W\3\2\2\2]Z\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2\2\2bg\5\22\n\2cg\5"+
		"\32\16\2dg\5\34\17\2eg\5\20\t\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2"+
		"\2g\17\3\2\2\2hi\7\5\2\2ij\5\n\6\2jk\7\6\2\2k\21\3\2\2\2lm\5\24\13\2m"+
		"o\7\5\2\2np\5\26\f\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\6\2\2r\23\3\2\2"+
		"\2st\7\13\2\2t\25\3\2\2\2uz\5\30\r\2vw\7\7\2\2wy\5\30\r\2xv\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\27\3\2\2\2|z\3\2\2\2}~\5\n\6\2~\31\3\2\2"+
		"\2\177\u0080\5 \21\2\u0080\33\3\2\2\2\u0081\u0084\5,\27\2\u0082\u0084"+
		"\5.\30\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\35\3\2\2\2\u0085"+
		"\u0086\5 \21\2\u0086\u0087\7\b\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7\4"+
		"\2\2\u0089\37\3\2\2\2\u008a\u008b\7\13\2\2\u008b!\3\2\2\2\u008c\u008d"+
		"\5\24\13\2\u008d\u008f\7\5\2\2\u008e\u0090\5(\25\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\6\2\2\u0092\u0093"+
		"\7\b\2\2\u0093\u0094\5$\23\2\u0094#\3\2\2\2\u0095\u0096\7\t\2\2\u0096"+
		"\u0097\5&\24\2\u0097\u0098\7\n\2\2\u0098%\3\2\2\2\u0099\u009a\5\n\6\2"+
		"\u009a\'\3\2\2\2\u009b\u00a0\5*\26\2\u009c\u009d\7\7\2\2\u009d\u009f\5"+
		"*\26\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1)\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5 \21\2"+
		"\u00a4+\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6-\3\2\2\2\u00a7\u00a8\7\r\2\2"+
		"\u00a8/\3\2\2\2\17\61<ALN]_foz\u0083\u008f\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
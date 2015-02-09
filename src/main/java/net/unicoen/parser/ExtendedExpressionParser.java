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
		PROTECTED=28, PACKAGE=29, STATIC=30, FINAL=31, WS=32;
	public static final int
		RULE_program = 0, RULE_classModifiers = 1, RULE_classVisibility = 2, RULE_abs = 3, 
		RULE_stat = 4, RULE_methodDeclaration = 5, RULE_methodModifiers = 6, RULE_fin = 7, 
		RULE_methodVisibility = 8, RULE_methodBody = 9, RULE_name = 10, RULE_type = 11, 
		RULE_statement = 12, RULE_variableDeclaration = 13, RULE_ifStatement = 14, 
		RULE_expression = 15, RULE_compareExp = 16, RULE_compareOp = 17, RULE_normalExp = 18, 
		RULE_term = 19, RULE_factor = 20, RULE_number = 21, RULE_integer = 22, 
		RULE_decimal = 23, RULE_mulDivOp = 24, RULE_addSubOp = 25, RULE_digit = 26;
	public static final String[] ruleNames = {
		"program", "classModifiers", "classVisibility", "abs", "stat", "methodDeclaration", 
		"methodModifiers", "fin", "methodVisibility", "methodBody", "name", "type", 
		"statement", "variableDeclaration", "ifStatement", "expression", "compareExp", 
		"compareOp", "normalExp", "term", "factor", "number", "integer", "decimal", 
		"mulDivOp", "addSubOp", "digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'0'", null, "'+'", "'-'", "'*'", "'/'", "'.'", "'>'", 
		"'>='", "'=='", "'<='", "'<'", "'if'", "'else'", "'{'", "'}'", null, "';'", 
		"'class'", "'void'", "'='", "'int'", "'public'", "'private'", "'abstract'", 
		"'protected'", "'package'", "'static'", "'final'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LEFTPAREN", "RIGHTPAREN", "ZERO", "NONZERODIGIT", "ADD", "SUB", 
		"MUL", "DIV", "DOT", "LARGER", "LARGEROREQUALS", "EQUALS", "SMALLEROREQUALS", 
		"SMALLER", "IF", "ELSE", "LEFTBRACE", "RIGHTBRACE", "ID", "SEMICOLON", 
		"CLASS", "VOID", "EQUAL", "INT", "PUBLIC", "PRIVATE", "ABSTRACT", "PROTECTED", 
		"PACKAGE", "STATIC", "FINAL", "WS"
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
			setState(54);
			classModifiers();
			setState(55);
			match(CLASS);
			setState(56);
			name();
			setState(57);
			match(LEFTBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << PROTECTED) | (1L << PACKAGE) | (1L << STATIC) | (1L << FINAL))) != 0)) {
				{
				{
				setState(58);
				methodDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RIGHTBRACE);
			setState(65);
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
			setState(68);
			_la = _input.LA(1);
			if (_la==PUBLIC || _la==PRIVATE) {
				{
				setState(67);
				classVisibility();
				}
			}

			setState(71);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(70);
				abs();
				}
			}

			setState(74);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(73);
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
			setState(76);
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
			setState(78);
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
			setState(80);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			methodModifiers();
			setState(83);
			type();
			setState(84);
			name();
			setState(85);
			match(LEFTPAREN);
			setState(86);
			match(RIGHTPAREN);
			setState(87);
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
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PACKAGE))) != 0)) {
				{
				setState(89);
				methodVisibility();
				}
			}

			setState(93);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(92);
				fin();
				}
			}

			setState(96);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(95);
				abs();
				}
			}

			setState(99);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(98);
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
			setState(101);
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
			setState(103);
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
		enterRule(_localctx, 18, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LEFTBRACE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 20, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(114);
				match(ID);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				ifStatement();
				}
				break;
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			name();
			setState(128);
			match(EQUAL);
			setState(129);
			normalExp();
			setState(130);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IF);
			setState(133);
			match(LEFTPAREN);
			setState(134);
			compareExp();
			setState(135);
			match(RIGHTPAREN);
			setState(136);
			match(LEFTBRACE);
			setState(137);
			match(RIGHTBRACE);
			setState(141);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(138);
				match(ELSE);
				setState(139);
				match(LEFTBRACE);
				setState(140);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				compareExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		enterRule(_localctx, 32, RULE_compareExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			normalExp();
			setState(148);
			compareOp();
			setState(149);
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
		enterRule(_localctx, 34, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 36, RULE_normalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			term();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(154);
				addSubOp();
				setState(155);
				term();
				}
				}
				setState(161);
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
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			factor();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(163);
				mulDivOp();
				setState(164);
				factor();
				}
				}
				setState(170);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case ZERO:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				number();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LEFTPAREN);
				setState(173);
				normalExp();
				setState(174);
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
		enterRule(_localctx, 42, RULE_number);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
		enterRule(_localctx, 44, RULE_integer);
		int _la;
		try {
			setState(190);
			switch (_input.LA(1)) {
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ZERO);
				}
				break;
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(NONZERODIGIT);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(184);
					digit();
					}
					}
					setState(189);
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
		enterRule(_localctx, 46, RULE_decimal);
		int _la;
		try {
			setState(214);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(NONZERODIGIT);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(193);
					digit();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(DOT);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(200);
					digit();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ZERO);
				setState(207);
				match(DOT);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ZERO || _la==NONZERODIGIT) {
					{
					{
					setState(208);
					digit();
					}
					}
					setState(213);
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
		enterRule(_localctx, 48, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 50, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 52, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\2\3\2\3\2\3\3\5\3G\n\3\3\3\5\3J\n\3\3\3\5\3M\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\5\b]\n\b\3\b\5\b`\n\b\3\b\5"+
		"\bc\n\b\3\b\5\bf\n\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13n\n\13\f\13\16\13q"+
		"\13\13\3\13\3\13\3\f\7\fv\n\f\f\f\16\fy\13\f\3\r\3\r\3\16\3\16\5\16\177"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0090\n\20\3\21\3\21\5\21\u0094\n\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00a0\n\24\f\24\16\24\u00a3\13"+
		"\24\3\25\3\25\3\25\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00b3\n\26\3\27\3\27\5\27\u00b7\n\27\3\30\3\30"+
		"\3\30\7\30\u00bc\n\30\f\30\16\30\u00bf\13\30\5\30\u00c1\n\30\3\31\3\31"+
		"\7\31\u00c5\n\31\f\31\16\31\u00c8\13\31\3\31\3\31\7\31\u00cc\n\31\f\31"+
		"\16\31\u00cf\13\31\3\31\3\31\3\31\7\31\u00d4\n\31\f\31\16\31\u00d7\13"+
		"\31\5\31\u00d9\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t\3\2\33\34\4\2"+
		"\33\34\36\37\4\2\30\30\32\32\3\2\f\20\3\2\t\n\3\2\7\b\3\2\5\6\u00dc\2"+
		"8\3\2\2\2\4F\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16\\"+
		"\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26w\3\2\2\2\30z\3\2\2\2\32"+
		"~\3\2\2\2\34\u0080\3\2\2\2\36\u0086\3\2\2\2 \u0093\3\2\2\2\"\u0095\3\2"+
		"\2\2$\u0099\3\2\2\2&\u009b\3\2\2\2(\u00a4\3\2\2\2*\u00b2\3\2\2\2,\u00b6"+
		"\3\2\2\2.\u00c0\3\2\2\2\60\u00d8\3\2\2\2\62\u00da\3\2\2\2\64\u00dc\3\2"+
		"\2\2\66\u00de\3\2\2\289\5\4\3\29:\7\27\2\2:;\5\26\f\2;?\7\23\2\2<>\5\f"+
		"\7\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\24"+
		"\2\2CD\7\2\2\3D\3\3\2\2\2EG\5\6\4\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\5"+
		"\b\5\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\5\n\6\2LK\3\2\2\2LM\3\2\2\2M\5"+
		"\3\2\2\2NO\t\2\2\2O\7\3\2\2\2PQ\7\35\2\2Q\t\3\2\2\2RS\7 \2\2S\13\3\2\2"+
		"\2TU\5\16\b\2UV\5\30\r\2VW\5\26\f\2WX\7\3\2\2XY\7\4\2\2YZ\5\24\13\2Z\r"+
		"\3\2\2\2[]\5\22\n\2\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\20\t\2_^\3\2\2"+
		"\2_`\3\2\2\2`b\3\2\2\2ac\5\b\5\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\n\6"+
		"\2ed\3\2\2\2ef\3\2\2\2f\17\3\2\2\2gh\7!\2\2h\21\3\2\2\2ij\t\3\2\2j\23"+
		"\3\2\2\2ko\7\23\2\2ln\5\32\16\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2pr\3\2\2\2qo\3\2\2\2rs\7\24\2\2s\25\3\2\2\2tv\7\25\2\2ut\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2x\27\3\2\2\2yw\3\2\2\2z{\t\4\2\2{\31\3\2\2\2"+
		"|\177\5\36\20\2}\177\5\34\17\2~|\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080"+
		"\u0081\5\30\r\2\u0081\u0082\5\26\f\2\u0082\u0083\7\31\2\2\u0083\u0084"+
		"\5&\24\2\u0084\u0085\7\26\2\2\u0085\35\3\2\2\2\u0086\u0087\7\21\2\2\u0087"+
		"\u0088\7\3\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\4\2\2\u008a\u008b\7"+
		"\23\2\2\u008b\u008f\7\24\2\2\u008c\u008d\7\22\2\2\u008d\u008e\7\23\2\2"+
		"\u008e\u0090\7\24\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090\37"+
		"\3\2\2\2\u0091\u0094\5\"\22\2\u0092\u0094\5&\24\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0092\3\2\2\2\u0094!\3\2\2\2\u0095\u0096\5&\24\2\u0096\u0097\5"+
		"$\23\2\u0097\u0098\5&\24\2\u0098#\3\2\2\2\u0099\u009a\t\5\2\2\u009a%\3"+
		"\2\2\2\u009b\u00a1\5(\25\2\u009c\u009d\5\64\33\2\u009d\u009e\5(\25\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\'\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00aa"+
		"\5*\26\2\u00a5\u00a6\5\62\32\2\u00a6\u00a7\5*\26\2\u00a7\u00a9\3\2\2\2"+
		"\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab)\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b3\5,\27\2\u00ae"+
		"\u00af\7\3\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7\4\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3+\3\2\2\2\u00b4\u00b7"+
		"\5.\30\2\u00b5\u00b7\5\60\31\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7-\3\2\2\2\u00b8\u00c1\7\5\2\2\u00b9\u00bd\7\6\2\2\u00ba\u00bc\5"+
		"\66\34\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b8\3\2"+
		"\2\2\u00c0\u00b9\3\2\2\2\u00c1/\3\2\2\2\u00c2\u00c6\7\6\2\2\u00c3\u00c5"+
		"\5\66\34\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd"+
		"\7\13\2\2\u00ca\u00cc\5\66\34\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d9\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d5\7\13\2\2\u00d2\u00d4\5\66\34"+
		"\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8"+
		"\u00d0\3\2\2\2\u00d9\61\3\2\2\2\u00da\u00db\t\6\2\2\u00db\63\3\2\2\2\u00dc"+
		"\u00dd\t\7\2\2\u00dd\65\3\2\2\2\u00de\u00df\t\b\2\2\u00df\67\3\2\2\2\31"+
		"?FIL\\_beow~\u008f\u0093\u00a1\u00aa\u00b2\u00b6\u00bd\u00c0\u00c6\u00cd"+
		"\u00d5\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
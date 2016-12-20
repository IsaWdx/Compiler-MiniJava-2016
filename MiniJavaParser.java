// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, MULTI=33, DVIDE=34, ADD=35, MINUS=36, EQUAL=37, N_EQL=38, LRGER=39, 
		SMLLR=40, L_EQL=41, S_EQL=42, COMMENTI=43, COMMENTII=44, IDENTIFIER=45, 
		INTEGER_LITERAL=46, WS=47;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_intexpression = 7, 
		RULE_booleanexpression = 8, RULE_identifier = 9;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "intexpression", "booleanexpression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'.'", "'length'", "'this'", "'new'", "'&&'", "'||'", "'true'", 
		"'false'", "'!'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", 
		"'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "MULTI", "DVIDE", 
		"ADD", "MINUS", "EQUAL", "N_EQL", "LRGER", "SMLLR", "L_EQL", "S_EQL", 
		"COMMENTI", "COMMENTII", "IDENTIFIER", "INTEGER_LITERAL", "WS"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				classDeclaration();
				}
				}
				setState(26);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			identifier();
			setState(29);
			match(T__1);
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
			setState(32);
			match(T__4);
			setState(33);
			match(T__5);
			setState(34);
			match(T__6);
			setState(35);
			match(T__7);
			setState(36);
			match(T__8);
			setState(37);
			match(T__9);
			setState(38);
			identifier();
			setState(39);
			match(T__10);
			setState(40);
			match(T__1);
			setState(41);
			statement();
			setState(42);
			match(T__11);
			setState(43);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			identifier();
			setState(49);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(47);
				match(T__12);
				setState(48);
				identifier();
				}
			}

			setState(51);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(52);
				varDeclaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
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
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			identifier();
			setState(68);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__2);
			setState(71);
			type();
			setState(72);
			identifier();
			setState(73);
			match(T__6);
			setState(85);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(74);
				type();
				setState(75);
				identifier();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(76);
					match(T__14);
					setState(77);
					type();
					setState(78);
					identifier();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(87);
			match(T__10);
			setState(88);
			match(T__1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					varDeclaration();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(95);
				statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__15);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(102);
				intexpression(0);
				}
				break;
			case 2:
				{
				setState(103);
				booleanexpression(0);
				}
				break;
			}
			setState(106);
			match(T__13);
			setState(107);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTypeContext extends TypeContext {
		public BooleanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(109);
				match(T__16);
				setState(110);
				match(T__8);
				setState(111);
				match(T__9);
				}
				}
				break;
			case 2:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__16);
				}
				break;
			case 4:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				identifier();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignArrayStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public AssignArrayStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignArrayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignArrayStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceStatementContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BraceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBraceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBraceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBraceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new BraceStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__1);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(118);
					statement();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__18);
				setState(126);
				match(T__6);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(127);
					intexpression(0);
					}
					break;
				case 2:
					{
					setState(128);
					booleanexpression(0);
					}
					break;
				}
				setState(131);
				match(T__10);
				setState(132);
				statement();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(133);
					match(T__19);
					setState(134);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__20);
				setState(138);
				match(T__6);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(139);
					intexpression(0);
					}
					break;
				case 2:
					{
					setState(140);
					booleanexpression(0);
					}
					break;
				}
				setState(143);
				match(T__10);
				setState(144);
				statement();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(T__21);
				setState(147);
				match(T__6);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(148);
					intexpression(0);
					}
					break;
				case 2:
					{
					setState(149);
					booleanexpression(0);
					}
					break;
				}
				setState(152);
				match(T__10);
				setState(153);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				identifier();
				setState(156);
				match(T__22);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(157);
					intexpression(0);
					}
					break;
				case 2:
					{
					setState(158);
					booleanexpression(0);
					}
					break;
				}
				setState(161);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new AssignArrayStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				identifier();
				setState(164);
				match(T__8);
				setState(165);
				intexpression(0);
				setState(166);
				match(T__9);
				setState(167);
				match(T__22);
				setState(168);
				intexpression(0);
				setState(169);
				match(T__13);
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

	public static class IntexpressionContext extends ParserRuleContext {
		public IntexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intexpression; }
	 
		public IntexpressionContext() { }
		public void copyFrom(IntexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LengthIntContext extends IntexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public LengthIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLengthInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLengthInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLengthInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodIntContext extends IntexpressionContext {
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<BooleanexpressionContext> booleanexpression() {
			return getRuleContexts(BooleanexpressionContext.class);
		}
		public BooleanexpressionContext booleanexpression(int i) {
			return getRuleContext(BooleanexpressionContext.class,i);
		}
		public MethodIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierIntContext extends IntexpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifierInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifierInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifierInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisIntContext extends IntexpressionContext {
		public ThisIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterThisInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitThisInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitThisInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulIntContext extends IntexpressionContext {
		public Token op;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public MulIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMulInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMulInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMulInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIntContext extends IntexpressionContext {
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public ArrayIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddIntContext extends IntexpressionContext {
		public Token op;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public AddIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAddInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAddInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAddInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntContext extends IntexpressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MiniJavaParser.INTEGER_LITERAL, 0); }
		public LiteralIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLiteralInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewIdentifierIntContext extends IntexpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewIdentifierIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewIdentifierInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewIdentifierInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewIdentifierInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewArrayIntContext extends IntexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public NewArrayIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewArrayInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewArrayInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewArrayInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenIntContext extends IntexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public ParenIntContext(IntexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParenInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParenInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParenInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntexpressionContext intexpression() throws RecognitionException {
		return intexpression(0);
	}

	private IntexpressionContext intexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntexpressionContext _localctx = new IntexpressionContext(_ctx, _parentState);
		IntexpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_intexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				{
				_localctx = new IdentifierIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ThisIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__25);
				}
				break;
			case 4:
				{
				_localctx = new NewArrayIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__26);
				setState(178);
				match(T__16);
				setState(179);
				match(T__8);
				setState(180);
				intexpression(0);
				setState(181);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new NewIdentifierIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__26);
				setState(184);
				identifier();
				setState(185);
				match(T__6);
				setState(186);
				match(T__10);
				}
				break;
			case 6:
				{
				_localctx = new ParenIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__6);
				setState(189);
				intexpression(0);
				setState(190);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulIntContext(new IntexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(194);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(195);
						((MulIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DVIDE) ) {
							((MulIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(196);
						intexpression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddIntContext(new IntexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(197);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(198);
						((AddIntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((AddIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(199);
						intexpression(11);
						}
						break;
					case 3:
						{
						_localctx = new ArrayIntContext(new IntexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(200);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(201);
						match(T__8);
						setState(202);
						intexpression(0);
						setState(203);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new LengthIntContext(new IntexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(206);
						match(T__23);
						setState(207);
						match(T__24);
						}
						break;
					case 5:
						{
						_localctx = new MethodIntContext(new IntexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						match(T__23);
						setState(210);
						identifier();
						setState(211);
						match(T__6);
						setState(226);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(214);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
							case 1:
								{
								setState(212);
								intexpression(0);
								}
								break;
							case 2:
								{
								setState(213);
								booleanexpression(0);
								}
								break;
							}
							setState(223);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(216);
								match(T__14);
								setState(219);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
								case 1:
									{
									setState(217);
									intexpression(0);
									}
									break;
								case 2:
									{
									setState(218);
									booleanexpression(0);
									}
									break;
								}
								}
								}
								setState(225);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(228);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class BooleanexpressionContext extends ParserRuleContext {
		public BooleanexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexpression; }
	 
		public BooleanexpressionContext() { }
		public void copyFrom(BooleanexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrbiBooleanContext extends BooleanexpressionContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public OrbiBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOrbiBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOrbiBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOrbiBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotBooleanContext extends BooleanexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public NotBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNotBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNotBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNotBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndibBooleanContext extends BooleanexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public AndibBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndibBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndibBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndibBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndbiBooleanContext extends BooleanexpressionContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public AndbiBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndbiBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndbiBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndbiBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndbbBooleanContext extends BooleanexpressionContext {
		public List<BooleanexpressionContext> booleanexpression() {
			return getRuleContexts(BooleanexpressionContext.class);
		}
		public BooleanexpressionContext booleanexpression(int i) {
			return getRuleContext(BooleanexpressionContext.class,i);
		}
		public AndbbBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndbbBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndbbBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndbbBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualbbBooleanContext extends BooleanexpressionContext {
		public Token op;
		public List<BooleanexpressionContext> booleanexpression() {
			return getRuleContexts(BooleanexpressionContext.class);
		}
		public BooleanexpressionContext booleanexpression(int i) {
			return getRuleContext(BooleanexpressionContext.class,i);
		}
		public EqualbbBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEqualbbBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEqualbbBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEqualbbBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrbbBooleanContext extends BooleanexpressionContext {
		public List<BooleanexpressionContext> booleanexpression() {
			return getRuleContexts(BooleanexpressionContext.class);
		}
		public BooleanexpressionContext booleanexpression(int i) {
			return getRuleContext(BooleanexpressionContext.class,i);
		}
		public OrbbBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOrbbBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOrbbBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOrbbBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndiiBooleanContext extends BooleanexpressionContext {
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public AndiiBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndiiBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndiiBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndiiBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseBooleanContext extends BooleanexpressionContext {
		public FalseBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFalseBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFalseBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFalseBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenBooleanContext extends BooleanexpressionContext {
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public ParenBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParenBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParenBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParenBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OribBooleanContext extends BooleanexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public BooleanexpressionContext booleanexpression() {
			return getRuleContext(BooleanexpressionContext.class,0);
		}
		public OribBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOribBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOribBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOribBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OriiBooleanContext extends BooleanexpressionContext {
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public OriiBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOriiBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOriiBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOriiBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueBooleanContext extends BooleanexpressionContext {
		public TrueBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTrueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTrueBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTrueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualiiBooleanContext extends BooleanexpressionContext {
		public Token op;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public EqualiiBooleanContext(BooleanexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEqualiiBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEqualiiBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEqualiiBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanexpressionContext booleanexpression() throws RecognitionException {
		return booleanexpression(0);
	}

	private BooleanexpressionContext booleanexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanexpressionContext _localctx = new BooleanexpressionContext(_ctx, _parentState);
		BooleanexpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_booleanexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new AndiiBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(236);
				intexpression(0);
				setState(237);
				match(T__27);
				setState(238);
				intexpression(0);
				}
				break;
			case 2:
				{
				_localctx = new OriiBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				intexpression(0);
				setState(241);
				match(T__28);
				setState(242);
				intexpression(0);
				}
				break;
			case 3:
				{
				_localctx = new EqualiiBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				intexpression(0);
				setState(245);
				((EqualiiBooleanContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << N_EQL) | (1L << LRGER) | (1L << SMLLR) | (1L << L_EQL) | (1L << S_EQL))) != 0)) ) {
					((EqualiiBooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(246);
				intexpression(0);
				}
				break;
			case 4:
				{
				_localctx = new AndibBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				intexpression(0);
				setState(249);
				match(T__27);
				setState(250);
				booleanexpression(8);
				}
				break;
			case 5:
				{
				_localctx = new OribBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				intexpression(0);
				setState(253);
				match(T__28);
				setState(254);
				booleanexpression(7);
				}
				break;
			case 6:
				{
				_localctx = new TrueBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(T__29);
				}
				break;
			case 7:
				{
				_localctx = new FalseBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(T__30);
				}
				break;
			case 8:
				{
				_localctx = new NotBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(T__31);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(259);
					intexpression(0);
					}
					break;
				case 2:
					{
					setState(260);
					booleanexpression(0);
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new ParenBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__6);
				setState(264);
				booleanexpression(0);
				setState(265);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new AndbbBooleanContext(new BooleanexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpression);
						setState(269);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(270);
						match(T__27);
						setState(271);
						booleanexpression(15);
						}
						break;
					case 2:
						{
						_localctx = new OrbbBooleanContext(new BooleanexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpression);
						setState(272);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(273);
						match(T__28);
						setState(274);
						booleanexpression(14);
						}
						break;
					case 3:
						{
						_localctx = new EqualbbBooleanContext(new BooleanexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpression);
						setState(275);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(276);
						((EqualbbBooleanContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==N_EQL) ) {
							((EqualbbBooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(277);
						booleanexpression(13);
						}
						break;
					case 4:
						{
						_localctx = new AndbiBooleanContext(new BooleanexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpression);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(279);
						match(T__27);
						setState(280);
						intexpression(0);
						}
						break;
					case 5:
						{
						_localctx = new OrbiBooleanContext(new BooleanexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanexpression);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						match(T__28);
						setState(283);
						intexpression(0);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		case 7:
			return intexpression_sempred((IntexpressionContext)_localctx, predIndex);
		case 8:
			return booleanexpression_sempred((BooleanexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intexpression_sempred(IntexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean booleanexpression_sempred(BooleanexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0126\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6"+
		"\16\6V\13\6\5\6X\n\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\7\6c\n\6"+
		"\f\6\16\6f\13\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7v\n\7\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0099\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\t\3\t\3\t\5\t\u00de\n\t\7\t\u00e0\n\t\f"+
		"\t\16\t\u00e3\13\t\5\t\u00e5\n\t\3\t\3\t\7\t\u00e9\n\t\f\t\16\t\u00ec"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0108\n\n\3\n\3\n\3\n\3\n"+
		"\5\n\u010e\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u011f\n\n\f\n\16\n\u0122\13\n\3\13\3\13\3\13\2\4\20\22\f\2\4"+
		"\6\b\n\f\16\20\22\24\2\6\3\2#$\3\2%&\3\2\',\3\2\'(\u014e\2\26\3\2\2\2"+
		"\4\35\3\2\2\2\6/\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fu\3\2\2\2\16\u00ad\3\2"+
		"\2\2\20\u00c2\3\2\2\2\22\u010d\3\2\2\2\24\u0123\3\2\2\2\26\32\5\4\3\2"+
		"\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\3\3\2\2\2\34\32\3\2\2\2\35\36\7\3\2\2\36\37\5\24\13\2\37 \7\4\2\2"+
		" !\7\5\2\2!\"\7\6\2\2\"#\7\7\2\2#$\7\b\2\2$%\7\t\2\2%&\7\n\2\2&\'\7\13"+
		"\2\2\'(\7\f\2\2()\5\24\13\2)*\7\r\2\2*+\7\4\2\2+,\5\16\b\2,-\7\16\2\2"+
		"-.\7\16\2\2.\5\3\2\2\2/\60\7\3\2\2\60\63\5\24\13\2\61\62\7\17\2\2\62\64"+
		"\5\24\13\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\659\7\4\2\2\668\5"+
		"\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2"+
		"\2<>\5\n\6\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2"+
		"\2BC\7\16\2\2C\7\3\2\2\2DE\5\f\7\2EF\5\24\13\2FG\7\20\2\2G\t\3\2\2\2H"+
		"I\7\5\2\2IJ\5\f\7\2JK\5\24\13\2KW\7\t\2\2LM\5\f\7\2MT\5\24\13\2NO\7\21"+
		"\2\2OP\5\f\7\2PQ\5\24\13\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2WL\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\r\2\2Z^\7"+
		"\4\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`"+
		"^\3\2\2\2ac\5\16\b\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fd\3\2\2\2gj\7\22\2\2hk\5\20\t\2ik\5\22\n\2jh\3\2\2\2ji\3\2\2\2kl\3\2"+
		"\2\2lm\7\20\2\2mn\7\16\2\2n\13\3\2\2\2op\7\23\2\2pq\7\13\2\2qv\7\f\2\2"+
		"rv\7\24\2\2sv\7\23\2\2tv\5\24\13\2uo\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2"+
		"\2\2v\r\3\2\2\2w{\7\4\2\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|~\3\2\2\2}{\3\2\2\2~\u00ae\7\16\2\2\177\u0080\7\25\2\2\u0080\u0083"+
		"\7\t\2\2\u0081\u0084\5\20\t\2\u0082\u0084\5\22\n\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0089"+
		"\5\16\b\2\u0087\u0088\7\26\2\2\u0088\u008a\5\16\b\2\u0089\u0087\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u00ae\3\2\2\2\u008b\u008c\7\27\2\2\u008c"+
		"\u008f\7\t\2\2\u008d\u0090\5\20\t\2\u008e\u0090\5\22\n\2\u008f\u008d\3"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\r\2\2\u0092"+
		"\u0093\5\16\b\2\u0093\u00ae\3\2\2\2\u0094\u0095\7\30\2\2\u0095\u0098\7"+
		"\t\2\2\u0096\u0099\5\20\t\2\u0097\u0099\5\22\n\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009c\7\20"+
		"\2\2\u009c\u00ae\3\2\2\2\u009d\u009e\5\24\13\2\u009e\u00a1\7\31\2\2\u009f"+
		"\u00a2\5\20\t\2\u00a0\u00a2\5\22\n\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00ae\3\2\2\2\u00a5"+
		"\u00a6\5\24\13\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9"+
		"\7\f\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\20\2"+
		"\2\u00ac\u00ae\3\2\2\2\u00adw\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u008b\3"+
		"\2\2\2\u00ad\u0094\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae"+
		"\17\3\2\2\2\u00af\u00b0\b\t\1\2\u00b0\u00c3\7\60\2\2\u00b1\u00c3\5\24"+
		"\13\2\u00b2\u00c3\7\34\2\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\7\23\2\2\u00b5"+
		"\u00b6\7\13\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\f\2\2\u00b8\u00c3\3"+
		"\2\2\2\u00b9\u00ba\7\35\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\t\2\2"+
		"\u00bc\u00bd\7\r\2\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0"+
		"\5\20\t\2\u00c0\u00c1\7\r\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00af\3\2\2\2"+
		"\u00c2\u00b1\3\2\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b9"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00ea\3\2\2\2\u00c4\u00c5\f\r\2\2\u00c5"+
		"\u00c6\t\2\2\2\u00c6\u00e9\5\20\t\16\u00c7\u00c8\f\f\2\2\u00c8\u00c9\t"+
		"\3\2\2\u00c9\u00e9\5\20\t\r\u00ca\u00cb\f\13\2\2\u00cb\u00cc\7\13\2\2"+
		"\u00cc\u00cd\5\20\t\2\u00cd\u00ce\7\f\2\2\u00ce\u00e9\3\2\2\2\u00cf\u00d0"+
		"\f\n\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00e9\7\33\2\2\u00d2\u00d3\f\t\2\2"+
		"\u00d3\u00d4\7\32\2\2\u00d4\u00d5\5\24\13\2\u00d5\u00e4\7\t\2\2\u00d6"+
		"\u00d9\5\20\t\2\u00d7\u00d9\5\22\n\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00e1\3\2\2\2\u00da\u00dd\7\21\2\2\u00db\u00de\5\20\t\2\u00dc"+
		"\u00de\5\22\n\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e0\3"+
		"\2\2\2\u00df\u00da\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00d8\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\r\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00c4\3\2\2\2\u00e8\u00c7\3\2\2\2\u00e8\u00ca\3\2"+
		"\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\21\3\2\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00ee\b\n\1\2\u00ee\u00ef\5\20\t\2\u00ef\u00f0\7\36\2\2\u00f0"+
		"\u00f1\5\20\t\2\u00f1\u010e\3\2\2\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4\7"+
		"\37\2\2\u00f4\u00f5\5\20\t\2\u00f5\u010e\3\2\2\2\u00f6\u00f7\5\20\t\2"+
		"\u00f7\u00f8\t\4\2\2\u00f8\u00f9\5\20\t\2\u00f9\u010e\3\2\2\2\u00fa\u00fb"+
		"\5\20\t\2\u00fb\u00fc\7\36\2\2\u00fc\u00fd\5\22\n\n\u00fd\u010e\3\2\2"+
		"\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\7\37\2\2\u0100\u0101\5\22\n\t\u0101"+
		"\u010e\3\2\2\2\u0102\u010e\7 \2\2\u0103\u010e\7!\2\2\u0104\u0107\7\"\2"+
		"\2\u0105\u0108\5\20\t\2\u0106\u0108\5\22\n\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010a\7\t\2\2\u010a\u010b\5\22"+
		"\n\2\u010b\u010c\7\r\2\2\u010c\u010e\3\2\2\2\u010d\u00ed\3\2\2\2\u010d"+
		"\u00f2\3\2\2\2\u010d\u00f6\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fe\3\2"+
		"\2\2\u010d\u0102\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010e\u0120\3\2\2\2\u010f\u0110\f\20\2\2\u0110\u0111\7"+
		"\36\2\2\u0111\u011f\5\22\n\21\u0112\u0113\f\17\2\2\u0113\u0114\7\37\2"+
		"\2\u0114\u011f\5\22\n\20\u0115\u0116\f\16\2\2\u0116\u0117\t\5\2\2\u0117"+
		"\u011f\5\22\n\17\u0118\u0119\f\b\2\2\u0119\u011a\7\36\2\2\u011a\u011f"+
		"\5\20\t\2\u011b\u011c\f\7\2\2\u011c\u011d\7\37\2\2\u011d\u011f\5\20\t"+
		"\2\u011e\u010f\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0118"+
		"\3\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\23\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7/\2\2"+
		"\u0124\25\3\2\2\2\36\32\639?TW^dju{\u0083\u0089\u008f\u0098\u00a1\u00ad"+
		"\u00c2\u00d8\u00dd\u00e1\u00e4\u00e8\u00ea\u0107\u010d\u011e\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
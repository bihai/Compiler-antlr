// Generated from Tiger.g4 by ANTLR 4.2.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, INTEGER=41, STRING=42, ID=43, COMMENT=44, LINE_COMMENT=45, 
		WS=46;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'&'", "'in'", "'of'", "','", "'['", "'-'", "'*'", 
		"'while'", "'('", "':'", "'<'", "'<='", "'var'", "'array'", "'nil'", "'to'", 
		"'{'", "'break'", "'let'", "'else'", "'}'", "'do'", "')'", "'function'", 
		"'.'", "'+'", "'for'", "'<>'", "'='", "';'", "'if '", "'>'", "'type'", 
		"':='", "'then'", "'/'", "'>='", "'|'", "'end'", "INTEGER", "STRING", 
		"ID", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_exps = 2, RULE_decs = 3, RULE_dec = 4, 
		RULE_vardec = 5, RULE_ty = 6, RULE_tyfields = 7, RULE_type_id = 8, RULE_lvalue = 9;
	public static final String[] ruleNames = {
		"program", "exp", "exps", "decs", "dec", "vardec", "ty", "tyfields", "type_id", 
		"lvalue"
	};

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TigerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case 7:
			case 9:
			case 10:
			case 16:
			case 19:
			case 20:
			case 28:
			case 32:
			case INTEGER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); exp(0);
				}
				break;
			case EOF:
			case 14:
			case 25:
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); decs();
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LogicalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitLogical(this);
		}
	}
	public static class AssignContext extends ExpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitAssign(this);
		}
	}
	public static class BreakContext extends ExpContext {
		public BreakContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitBreak(this);
		}
	}
	public static class CallContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitCall(this);
		}
	}
	public static class WhileStmtContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public WhileStmtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitWhileStmt(this);
		}
	}
	public static class ArrayContext extends ExpContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitArray(this);
		}
	}
	public static class UnaryMinusContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitUnaryMinus(this);
		}
	}
	public static class IfStmtContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IfStmtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitIfStmt(this);
		}
	}
	public static class MulContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitMul(this);
		}
	}
	public static class RecordContext extends ExpContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(TigerParser.ID); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(TigerParser.ID, i);
		}
		public RecordContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitRecord(this);
		}
	}
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(TigerParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitString(this);
		}
	}
	public static class CmpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CmpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitCmp(this);
		}
	}
	public static class AddContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitAdd(this);
		}
	}
	public static class ParenExprsContext extends ExpContext {
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ParenExprsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterParenExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitParenExprs(this);
		}
	}
	public static class LETContext extends ExpContext {
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public LETContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterLET(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitLET(this);
		}
	}
	public static class IntegerContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(TigerParser.INTEGER, 0); }
		public IntegerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitInteger(this);
		}
	}
	public static class ForStmtContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ForStmtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitForStmt(this);
		}
	}
	public static class NilContext extends ExpContext {
		public NilContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitNil(this);
		}
	}
	public static class LeftValueContext extends ExpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LeftValueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterLeftValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitLeftValue(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25); match(7);
				setState(26); exp(12);
				}
				break;

			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27); lvalue(0);
				setState(28); match(35);
				setState(29); exp(6);
				}
				break;

			case 3:
				{
				_localctx = new NilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); match(16);
				}
				break;

			case 4:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); match(INTEGER);
				}
				break;

			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(STRING);
				}
				break;

			case 6:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34); type_id();
				setState(35); match(6);
				setState(36); exp(0);
				setState(37); match(1);
				setState(38); match(4);
				setState(39); exp(0);
				}
				break;

			case 7:
				{
				_localctx = new RecordContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41); type_id();
				setState(42); match(18);
				setState(55);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(43); match(ID);
					setState(44); match(30);
					setState(45); exp(0);
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==5) {
						{
						{
						setState(46); match(5);
						setState(47); match(ID);
						setState(48); match(30);
						setState(49); exp(0);
						}
						}
						setState(54);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(57); match(22);
				}
				break;

			case 8:
				{
				_localctx = new LeftValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); lvalue(0);
				}
				break;

			case 9:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); match(ID);
				setState(61); match(10);
				setState(70);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 10) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 28) | (1L << 32) | (1L << INTEGER) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(62); exp(0);
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==5) {
						{
						{
						setState(63); match(5);
						setState(64); exp(0);
						}
						}
						setState(69);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(72); match(24);
				}
				break;

			case 10:
				{
				_localctx = new ParenExprsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73); match(10);
				setState(74); exps();
				setState(75); match(24);
				}
				break;

			case 11:
				{
				_localctx = new IfStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77); match(32);
				setState(78); exp(0);
				setState(79); match(36);
				setState(80); exp(0);
				setState(83);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(81); match(21);
					setState(82); exp(0);
					}
					break;
				}
				}
				break;

			case 12:
				{
				_localctx = new WhileStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); match(9);
				setState(86); exp(0);
				setState(87); match(23);
				setState(88); exp(0);
				}
				break;

			case 13:
				{
				_localctx = new ForStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90); match(28);
				setState(91); match(ID);
				setState(92); match(35);
				setState(93); exp(0);
				setState(94); match(17);
				setState(95); exp(0);
				setState(96); match(23);
				setState(97); exp(0);
				}
				break;

			case 14:
				{
				_localctx = new BreakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99); match(19);
				}
				break;

			case 15:
				{
				_localctx = new LETContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); match(20);
				setState(101); decs();
				setState(102); match(3);
				setState(103); exps();
				setState(104); match(40);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==8 || _la==37) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(110); exp(12);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(111);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==27) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(113); exp(11);
						}
						break;

					case 3:
						{
						_localctx = new CmpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(115);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 13) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 38))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(116); exp(10);
						}
						break;

					case 4:
						{
						_localctx = new LogicalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(119); exp(9);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitExps(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 10) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 28) | (1L << 32) | (1L << INTEGER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(125); exp(0);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==31) {
					{
					{
					setState(126); match(31);
					setState(127); exp(0);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DecsContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public DecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterDecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitDecs(this);
		}
	}

	public final DecsContext decs() throws RecognitionException {
		DecsContext _localctx = new DecsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 25) | (1L << 34))) != 0)) {
				{
				{
				setState(135); dec();
				}
				}
				setState(140);
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

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDecContext extends DecContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TyfieldsContext tyfields() {
			return getRuleContext(TyfieldsContext.class,0);
		}
		public FuncDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitFuncDec(this);
		}
	}
	public static class VarDecNothingContext extends DecContext {
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public VarDecNothingContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterVarDecNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitVarDecNothing(this);
		}
	}
	public static class TypeDecContext extends DecContext {
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public TypeDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTypeDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTypeDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec);
		int _la;
		try {
			setState(159);
			switch (_input.LA(1)) {
			case 34:
				_localctx = new TypeDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(34);
				setState(142); match(ID);
				setState(143); match(30);
				setState(144); ty();
				}
				break;
			case 14:
				_localctx = new VarDecNothingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145); vardec();
				}
				break;
			case 25:
				_localctx = new FuncDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(25);
				setState(147); match(ID);
				setState(148); match(10);
				setState(150);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(149); tyfields();
					}
				}

				setState(152); match(24);
				setState(155);
				_la = _input.LA(1);
				if (_la==11) {
					{
					setState(153); match(11);
					setState(154); type_id();
					}
				}

				setState(157); match(30);
				setState(158); exp(0);
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

	public static class VardecContext extends ParserRuleContext {
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
	 
		public VardecContext() { }
		public void copyFrom(VardecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDecInnerContext extends VardecContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public VarDecInnerContext(VardecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterVarDecInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitVarDecInner(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardec);
		int _la;
		try {
			_localctx = new VarDecInnerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(14);
			setState(162); match(ID);
			setState(165);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(163); match(11);
				setState(164); type_id();
				}
			}

			setState(167); match(35);
			setState(168); exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public TyfieldsContext tyfields() {
			return getRuleContext(TyfieldsContext.class,0);
		}
		public TyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTy(this);
		}
	}

	public final TyContext ty() throws RecognitionException {
		TyContext _localctx = new TyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ty);
		int _la;
		try {
			setState(179);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); type_id();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(18);
				setState(173);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(172); tyfields();
					}
				}

				setState(175); match(22);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(15);
				setState(177); match(4);
				setState(178); type_id();
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

	public static class TyfieldsContext extends ParserRuleContext {
		public List<Type_idContext> type_id() {
			return getRuleContexts(Type_idContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(TigerParser.ID); }
		public Type_idContext type_id(int i) {
			return getRuleContext(Type_idContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(TigerParser.ID, i);
		}
		public TyfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterTyfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitTyfields(this);
		}
	}

	public final TyfieldsContext tyfields() throws RecognitionException {
		TyfieldsContext _localctx = new TyfieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tyfields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181); match(ID);
			setState(182); match(11);
			setState(183); type_id();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(184); match(5);
				setState(185); match(ID);
				setState(186); match(11);
				setState(187); type_id();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Type_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketVarContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BracketVarContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterBracketVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitBracketVar(this);
		}
	}
	public static class DotVarContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public DotVarContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterDotVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitDotVar(this);
		}
	}
	public static class SimpleVarContext extends LvalueContext {
		public TerminalNode ID() { return getToken(TigerParser.ID, 0); }
		public SimpleVarContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).enterSimpleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TigerListener ) ((TigerListener)listener).exitSimpleVar(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleVarContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(196); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new DotVarContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(198);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(199); match(26);
						setState(200); match(ID);
						}
						break;

					case 2:
						{
						_localctx = new BracketVarContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(201);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(202); match(6);
						setState(203); exp(0);
						setState(204); match(1);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return exp_sempred((ExpContext)_localctx, predIndex);

		case 9: return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 11);

		case 1: return precpred(_ctx, 10);

		case 2: return precpred(_ctx, 9);

		case 3: return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);

		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65\n\3"+
		"\f\3\16\38\13\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3\f\3"+
		"\16\3G\13\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3V"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086"+
		"\13\4\5\4\u0088\n\4\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3"+
		"\6\5\6\u00a2\n\6\3\7\3\7\3\7\3\7\5\7\u00a8\n\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\5\b\u00b6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13"+
		"\3\13\2\4\4\24\f\2\4\6\b\n\f\16\20\22\24\2\6\4\2\n\n\'\'\4\2\t\t\35\35"+
		"\6\2\16\17\37 ##((\4\2\4\4))\u00f1\2\30\3\2\2\2\4l\3\2\2\2\6\u0087\3\2"+
		"\2\2\b\u008c\3\2\2\2\n\u00a1\3\2\2\2\f\u00a3\3\2\2\2\16\u00b5\3\2\2\2"+
		"\20\u00b7\3\2\2\2\22\u00c3\3\2\2\2\24\u00c5\3\2\2\2\26\31\5\4\3\2\27\31"+
		"\5\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2\31\3\3\2\2\2\32\33\b\3\1\2\33\34"+
		"\7\t\2\2\34m\5\4\3\16\35\36\5\24\13\2\36\37\7%\2\2\37 \5\4\3\b m\3\2\2"+
		"\2!m\7\22\2\2\"m\7+\2\2#m\7,\2\2$%\5\22\n\2%&\7\b\2\2&\'\5\4\3\2\'(\7"+
		"\3\2\2()\7\6\2\2)*\5\4\3\2*m\3\2\2\2+,\5\22\n\2,9\7\24\2\2-.\7-\2\2./"+
		"\7 \2\2/\66\5\4\3\2\60\61\7\7\2\2\61\62\7-\2\2\62\63\7 \2\2\63\65\5\4"+
		"\3\2\64\60\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\2"+
		"8\66\3\2\2\29-\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\30\2\2<m\3\2\2\2=m\5\24"+
		"\13\2>?\7-\2\2?H\7\f\2\2@E\5\4\3\2AB\7\7\2\2BD\5\4\3\2CA\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H@\3\2\2\2HI\3\2\2\2IJ\3\2"+
		"\2\2Jm\7\32\2\2KL\7\f\2\2LM\5\6\4\2MN\7\32\2\2Nm\3\2\2\2OP\7\"\2\2PQ\5"+
		"\4\3\2QR\7&\2\2RU\5\4\3\2ST\7\27\2\2TV\5\4\3\2US\3\2\2\2UV\3\2\2\2Vm\3"+
		"\2\2\2WX\7\13\2\2XY\5\4\3\2YZ\7\31\2\2Z[\5\4\3\2[m\3\2\2\2\\]\7\36\2\2"+
		"]^\7-\2\2^_\7%\2\2_`\5\4\3\2`a\7\23\2\2ab\5\4\3\2bc\7\31\2\2cd\5\4\3\2"+
		"dm\3\2\2\2em\7\25\2\2fg\7\26\2\2gh\5\b\5\2hi\7\5\2\2ij\5\6\4\2jk\7*\2"+
		"\2km\3\2\2\2l\32\3\2\2\2l\35\3\2\2\2l!\3\2\2\2l\"\3\2\2\2l#\3\2\2\2l$"+
		"\3\2\2\2l+\3\2\2\2l=\3\2\2\2l>\3\2\2\2lK\3\2\2\2lO\3\2\2\2lW\3\2\2\2l"+
		"\\\3\2\2\2le\3\2\2\2lf\3\2\2\2m|\3\2\2\2no\f\r\2\2op\t\2\2\2p{\5\4\3\16"+
		"qr\f\f\2\2rs\t\3\2\2s{\5\4\3\rtu\f\13\2\2uv\t\4\2\2v{\5\4\3\fwx\f\n\2"+
		"\2xy\t\5\2\2y{\5\4\3\13zn\3\2\2\2zq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\5\3\2\2\2~|\3\2\2\2\177\u0084\5\4\3\2\u0080"+
		"\u0081\7!\2\2\u0081\u0083\5\4\3\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\177\3\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2\u0089"+
		"\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\t\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7$\2\2\u0090\u0091\7-\2\2\u0091\u0092\7 \2\2\u0092\u00a2\5\16\b\2\u0093"+
		"\u00a2\5\f\7\2\u0094\u0095\7\33\2\2\u0095\u0096\7-\2\2\u0096\u0098\7\f"+
		"\2\2\u0097\u0099\5\20\t\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009d\7\32\2\2\u009b\u009c\7\r\2\2\u009c\u009e\5"+
		"\22\n\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7 \2\2\u00a0\u00a2\5\4\3\2\u00a1\u008f\3\2\2\2\u00a1\u0093\3\2"+
		"\2\2\u00a1\u0094\3\2\2\2\u00a2\13\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a7"+
		"\7-\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\5\4"+
		"\3\2\u00ab\r\3\2\2\2\u00ac\u00b6\5\22\n\2\u00ad\u00af\7\24\2\2\u00ae\u00b0"+
		"\5\20\t\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b6\7\30\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b6"+
		"\5\22\n\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b2\3\2\2\2"+
		"\u00b6\17\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7\r\2\2\u00b9\u00c0\5"+
		"\22\n\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\7\r\2\2\u00bd"+
		"\u00bf\5\22\n\2\u00be\u00ba\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7-\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\b\13\1\2\u00c6\u00c7\7-\2\2"+
		"\u00c7\u00d2\3\2\2\2\u00c8\u00c9\f\4\2\2\u00c9\u00ca\7\34\2\2\u00ca\u00d1"+
		"\7-\2\2\u00cb\u00cc\f\3\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5\4\3\2\u00ce"+
		"\u00cf\7\3\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cb\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\25\3\2\2\2\u00d4\u00d2\3\2\2\2\27\30\669EHUlz|\u0084\u0087\u008c\u0098"+
		"\u009d\u00a1\u00a7\u00af\u00b5\u00c0\u00d0\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
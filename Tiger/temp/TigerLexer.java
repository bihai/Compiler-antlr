// Generated from Tiger.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INTEGER=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "','", "'['", "INTEGER", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "INTEGER", "DIGIT", "WS"
	};


	public TigerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7(\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\7\5\31\n\5\f\5\16\5\34\13\5\5\5\36\n\5\3\6\3\6\3\7\6\7#\n\7\r\7\16"+
		"\7$\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\2\r\7\3\2\5\3\2\63;\3\2\62;\5\2\13"+
		"\f\17\17\"\")\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2"+
		"\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\23\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2"+
		"\r\"\3\2\2\2\17\20\7_\2\2\20\4\3\2\2\2\21\22\7.\2\2\22\6\3\2\2\2\23\24"+
		"\7]\2\2\24\b\3\2\2\2\25\36\7\62\2\2\26\32\t\2\2\2\27\31\5\13\6\2\30\27"+
		"\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\36\3\2\2\2\34\32"+
		"\3\2\2\2\35\25\3\2\2\2\35\26\3\2\2\2\36\n\3\2\2\2\37 \t\3\2\2 \f\3\2\2"+
		"\2!#\t\4\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b"+
		"\7\2\2\'\16\3\2\2\2\6\2\32\35$\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
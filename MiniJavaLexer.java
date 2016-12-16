// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "MULTI", 
		"DVIDE", "ADD", "MINUS", "EQUAL", "N_EQL", "LRGER", "SMLLR", "L_EQL", 
		"S_EQL", "COMMENTI", "COMMENTII", "IDENTIFIER", "INTEGER_LITERAL", "WS"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\7,\u0116\n,\f,"+
		"\16,\u0119\13,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u0123\n-\f-\16-\u0126\13-\3"+
		"-\3-\3-\3-\3-\3.\3.\7.\u012f\n.\f.\16.\u0132\13.\3/\6/\u0135\n/\r/\16"+
		"/\u0136\3\60\6\60\u013a\n\60\r\60\16\60\u013b\3\60\3\60\4\u0117\u0124"+
		"\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\6\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2"+
		"\tp\3\2\2\2\13w\3\2\2\2\r|\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23"+
		"\u008a\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092"+
		"\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a5\3\2\2"+
		"\2%\u00a9\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3\2\2\2+\u00b9\3\2\2\2-\u00bf"+
		"\3\2\2\2/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00dd\3\2"+
		"\2\2\67\u00e2\3\2\2\29\u00e6\3\2\2\2;\u00e9\3\2\2\2=\u00ec\3\2\2\2?\u00f1"+
		"\3\2\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u00ff\3\2\2\2K\u0101\3\2\2\2M\u0104\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2"+
		"\2\2S\u010b\3\2\2\2U\u010e\3\2\2\2W\u0111\3\2\2\2Y\u011e\3\2\2\2[\u012c"+
		"\3\2\2\2]\u0134\3\2\2\2_\u0139\3\2\2\2ab\7e\2\2bc\7n\2\2cd\7c\2\2de\7"+
		"u\2\2ef\7u\2\2f\4\3\2\2\2gh\7}\2\2h\6\3\2\2\2ij\7r\2\2jk\7w\2\2kl\7d\2"+
		"\2lm\7n\2\2mn\7k\2\2no\7e\2\2o\b\3\2\2\2pq\7u\2\2qr\7v\2\2rs\7c\2\2st"+
		"\7v\2\2tu\7k\2\2uv\7e\2\2v\n\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7k\2\2z{\7f\2"+
		"\2{\f\3\2\2\2|}\7o\2\2}~\7c\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\16"+
		"\3\2\2\2\u0081\u0082\7*\2\2\u0082\20\3\2\2\2\u0083\u0084\7U\2\2\u0084"+
		"\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2"+
		"\u0088\u0089\7i\2\2\u0089\22\3\2\2\2\u008a\u008b\7]\2\2\u008b\24\3\2\2"+
		"\2\u008c\u008d\7_\2\2\u008d\26\3\2\2\2\u008e\u008f\7+\2\2\u008f\30\3\2"+
		"\2\2\u0090\u0091\7\177\2\2\u0091\32\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7z\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7f\2\2\u0098\u0099\7u\2\2\u0099\34\3\2\2\2\u009a\u009b\7=\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7.\2\2\u009d \3\2\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p"+
		"\2\2\u00a7\u00a8\7v\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7y\2\2\u00ba"+
		"\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2"+
		"\u00be,\3\2\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7{\2\2\u00c1\u00c2\7u\2"+
		"\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6"+
		"\7\60\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7\60\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2"+
		"\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\60\3\2\2\2\u00d4\u00d5"+
		"\7\60\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7j\2\2"+
		"\u00dc\64\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7"+
		"k\2\2\u00e0\u00e1\7u\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7y\2\2\u00e58\3\2\2\2\u00e6\u00e7\7(\2\2\u00e7\u00e8"+
		"\7(\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7~\2\2\u00ea\u00eb\7~\2\2\u00eb<\3"+
		"\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6@\3\2\2\2\u00f7"+
		"\u00f8\7#\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7,\2\2\u00faD\3\2\2\2\u00fb\u00fc"+
		"\7\61\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7-\2\2\u00feH\3\2\2\2\u00ff\u0100"+
		"\7/\2\2\u0100J\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103L\3"+
		"\2\2\2\u0104\u0105\7#\2\2\u0105\u0106\7?\2\2\u0106N\3\2\2\2\u0107\u0108"+
		"\7@\2\2\u0108P\3\2\2\2\u0109\u010a\7>\2\2\u010aR\3\2\2\2\u010b\u010c\7"+
		"@\2\2\u010c\u010d\7?\2\2\u010dT\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110"+
		"\7?\2\2\u0110V\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0117\3\2\2\2\u0114\u0116\13\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\f\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b,"+
		"\2\2\u011dX\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120\7,\2\2\u0120\u0124"+
		"\3\2\2\2\u0121\u0123\13\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\7,\2\2\u0128\u0129\7\61\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\b-\2\2\u012bZ\3\2\2\2\u012c\u0130\t\2\2\2\u012d\u012f\t\3\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\\\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\t\4\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"^\3\2\2\2\u0138\u013a\t\5\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\b\60\2\2\u013e`\3\2\2\2\b\2\u0117\u0124\u0130\u0136\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
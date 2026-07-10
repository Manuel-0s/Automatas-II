// Generated from c:/Users/Jose Manuel/Documents/1_programas/Automatas II/Competencia 2/Ejercicios_2_POO/Ejercicio_12/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, INT=5, STRING=6, SYSTEM=7, IF=8, 
		CADENA=9, IDT=10, NUM=11, MAYOR_IGUAL=12, SUM=13, IGUAL=14, PUNTO_COMA=15, 
		PUNTO=16, LLAVE_IZQ=17, LLAVE_DER=18, CORCHETE_IZQ=19, CORCHETE_DER=20, 
		PARENT_IZQ=21, PARENT_DER=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "CLASS", "STATIC", "VOID", "INT", "STRING", "SYSTEM", "IF", 
			"CADENA", "IDT", "NUM", "MAYOR_IGUAL", "SUM", "IGUAL", "PUNTO_COMA", 
			"PUNTO", "LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", "CORCHETE_DER", "PARENT_IZQ", 
			"PARENT_DER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'int'", "'String'", 
			"'System'", "'if'", null, null, null, "'>='", "'+'", "'='", "';'", "'.'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "INT", "STRING", "SYSTEM", 
			"IF", "CADENA", "IDT", "NUM", "MAYOR_IGUAL", "SUM", "IGUAL", "PUNTO_COMA", 
			"PUNTO", "LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", "CORCHETE_DER", "PARENT_IZQ", 
			"PARENT_DER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0005\ti\b\t\n\t\f\tl\t\t\u0001\n\u0004\no"+
		"\b\n\u000b\n\f\np\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0004\u0016\u008b\b\u0016\u000b\u0016\f\u0016\u008c\u0001\u0016"+
		"\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0003\u0000\n\n\r\r\""+
		"\"\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005"+
		"<\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tH\u0001\u0000"+
		"\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000"+
		"\u000fZ\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013f"+
		"\u0001\u0000\u0000\u0000\u0015n\u0001\u0000\u0000\u0000\u0017r\u0001\u0000"+
		"\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bw\u0001\u0000\u0000\u0000"+
		"\u001dy\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!}\u0001"+
		"\u0000\u0000\u0000#\u007f\u0001\u0000\u0000\u0000%\u0081\u0001\u0000\u0000"+
		"\u0000\'\u0083\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000"+
		"+\u0087\u0001\u0000\u0000\u0000-\u008a\u0001\u0000\u0000\u0000/0\u0005"+
		"p\u0000\u000001\u0005u\u0000\u000012\u0005b\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005i\u0000\u000045\u0005c\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0005c\u0000\u000078\u0005l\u0000\u000089\u0005a\u0000\u0000"+
		"9:\u0005s\u0000\u0000:;\u0005s\u0000\u0000;\u0004\u0001\u0000\u0000\u0000"+
		"<=\u0005s\u0000\u0000=>\u0005t\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"t\u0000\u0000@A\u0005i\u0000\u0000AB\u0005c\u0000\u0000B\u0006\u0001\u0000"+
		"\u0000\u0000CD\u0005v\u0000\u0000DE\u0005o\u0000\u0000EF\u0005i\u0000"+
		"\u0000FG\u0005d\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005i\u0000"+
		"\u0000IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000K\n\u0001\u0000\u0000"+
		"\u0000LM\u0005S\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000"+
		"OP\u0005i\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005g\u0000\u0000R\f\u0001"+
		"\u0000\u0000\u0000ST\u0005S\u0000\u0000TU\u0005y\u0000\u0000UV\u0005s"+
		"\u0000\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000XY\u0005m\u0000"+
		"\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005f\u0000"+
		"\u0000\\\u0010\u0001\u0000\u0000\u0000]a\u0005\"\u0000\u0000^`\b\u0000"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000de\u0005\"\u0000\u0000e\u0012\u0001\u0000\u0000"+
		"\u0000fj\u0007\u0001\u0000\u0000gi\u0007\u0002\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k\u0014\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mo\u0007\u0003\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0016"+
		"\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000st\u0005=\u0000\u0000t\u0018"+
		"\u0001\u0000\u0000\u0000uv\u0005+\u0000\u0000v\u001a\u0001\u0000\u0000"+
		"\u0000wx\u0005=\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005;\u0000"+
		"\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0005.\u0000\u0000| \u0001\u0000"+
		"\u0000\u0000}~\u0005{\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005}\u0000\u0000\u0080$\u0001\u0000\u0000\u0000\u0081\u0082\u0005["+
		"\u0000\u0000\u0082&\u0001\u0000\u0000\u0000\u0083\u0084\u0005]\u0000\u0000"+
		"\u0084(\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086*"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088,\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0007\u0004\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0006\u0016\u0000\u0000\u008f.\u0001\u0000\u0000"+
		"\u0000\u0005\u0000ajp\u008c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
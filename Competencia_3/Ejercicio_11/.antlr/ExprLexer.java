// Generated from c:/Users/Jose Manuel/Documents/1_programas/Automatas II/Competencia_3/Ejercicio_11/Expr.g4 by ANTLR 4.13.1
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
		TIPO=1, PUBLIC=2, STATIC=3, VOID=4, INT=5, STRING=6, CLASS=7, SYSTEM=8, 
		IDT=9, CADENA=10, NUM=11, MAS=12, IGUAL=13, PUNTO_COMA=14, PARENT_IZQ=15, 
		PARENT_DER=16, LLAVE_IZQ=17, LLAVE_DER=18, CORCHETE_IZQ=19, CORCHETE_DER=20, 
		PUNTO=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "PUBLIC", "STATIC", "VOID", "INT", "STRING", "CLASS", "SYSTEM", 
			"IDT", "CADENA", "NUM", "MAS", "IGUAL", "PUNTO_COMA", "PARENT_IZQ", "PARENT_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", "CORCHETE_DER", "PUNTO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'public'", "'static'", "'void'", "'int'", "'String'", "'class'", 
			"'System'", null, null, null, "'+'", "'='", "';'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "PUBLIC", "STATIC", "VOID", "INT", "STRING", "CLASS", "SYSTEM", 
			"IDT", "CADENA", "NUM", "MAS", "IGUAL", "PUNTO_COMA", "PARENT_IZQ", "PARENT_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", "CORCHETE_DER", "PUNTO", "WS"
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
		"\u0004\u0000\u0016\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\b]\b\b\n\b\f\b`\t\b\u0001\t\u0001\t\u0005\td\b\t\n\t\f\tg\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0004\nl\b\n\u000b\n\f\nm\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004"+
		"\u0015\u0085\b\u0015\u000b\u0015\f\u0015\u0086\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u0000\t\n\r\r  \u008d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000"+
		"\u0000\u00056\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t"+
		"B\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rM\u0001\u0000"+
		"\u0000\u0000\u000fS\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000"+
		"\u0013a\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017o"+
		"\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001bs\u0001\u0000"+
		"\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000"+
		"!y\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u007f\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000\u0000"+
		"+\u0084\u0001\u0000\u0000\u0000-.\u0003\t\u0004\u0000.\u0002\u0001\u0000"+
		"\u0000\u0000/0\u0005p\u0000\u000001\u0005u\u0000\u000012\u0005b\u0000"+
		"\u000023\u0005l\u0000\u000034\u0005i\u0000\u000045\u0005c\u0000\u0000"+
		"5\u0004\u0001\u0000\u0000\u000067\u0005s\u0000\u000078\u0005t\u0000\u0000"+
		"89\u0005a\u0000\u00009:\u0005t\u0000\u0000:;\u0005i\u0000\u0000;<\u0005"+
		"c\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005v\u0000\u0000>?\u0005"+
		"o\u0000\u0000?@\u0005i\u0000\u0000@A\u0005d\u0000\u0000A\b\u0001\u0000"+
		"\u0000\u0000BC\u0005i\u0000\u0000CD\u0005n\u0000\u0000DE\u0005t\u0000"+
		"\u0000E\n\u0001\u0000\u0000\u0000FG\u0005S\u0000\u0000GH\u0005t\u0000"+
		"\u0000HI\u0005r\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005g\u0000\u0000L\f\u0001\u0000\u0000\u0000MN\u0005c\u0000\u0000"+
		"NO\u0005l\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005s\u0000\u0000QR\u0005"+
		"s\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005S\u0000\u0000TU\u0005"+
		"y\u0000\u0000UV\u0005s\u0000\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000"+
		"\u0000XY\u0005m\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000Z^\u0007\u0000"+
		"\u0000\u0000[]\u0007\u0001\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u0012\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ae\u0005\"\u0000"+
		"\u0000bd\b\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000i\u0014\u0001"+
		"\u0000\u0000\u0000jl\u0007\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005+\u0000\u0000p\u0018\u0001"+
		"\u0000\u0000\u0000qr\u0005=\u0000\u0000r\u001a\u0001\u0000\u0000\u0000"+
		"st\u0005;\u0000\u0000t\u001c\u0001\u0000\u0000\u0000uv\u0005(\u0000\u0000"+
		"v\u001e\u0001\u0000\u0000\u0000wx\u0005)\u0000\u0000x \u0001\u0000\u0000"+
		"\u0000yz\u0005{\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005}\u0000"+
		"\u0000|$\u0001\u0000\u0000\u0000}~\u0005[\u0000\u0000~&\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005]\u0000\u0000\u0080(\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005.\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0085\u0007"+
		"\u0004\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0006"+
		"\u0015\u0000\u0000\u0089,\u0001\u0000\u0000\u0000\u0005\u0000^em\u0086"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:/Users/Jose Manuel/Documents/1_programas/Automatas II/Competencia_3/Ejercicio_11/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, PUBLIC=2, STATIC=3, VOID=4, INT=5, STRING=6, CLASS=7, SYSTEM=8, 
		IDT=9, CADENA=10, NUM=11, MAS=12, IGUAL=13, PUNTO_COMA=14, PARENT_IZQ=15, 
		PARENT_DER=16, LLAVE_IZQ=17, LLAVE_DER=18, CORCHETE_IZQ=19, CORCHETE_DER=20, 
		PUNTO=21, WS=22;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_main = 2, RULE_lista_sentencias = 3, 
		RULE_sentencia = 4, RULE_asignacion = 5, RULE_expresion = 6, RULE_imprimir = 7, 
		RULE_op_aritmeticos = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "main", "lista_sentencias", "sentencia", "asignacion", 
			"expresion", "imprimir", "op_aritmeticos"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			expr();
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> PUBLIC() { return getTokens(ExprParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(ExprParser.PUBLIC, i);
		}
		public TerminalNode CLASS() { return getToken(ExprParser.CLASS, 0); }
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(ExprParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(ExprParser.LLAVE_IZQ, i);
		}
		public TerminalNode STATIC() { return getToken(ExprParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(ExprParser.VOID, 0); }
		public TerminalNode PARENT_IZQ() { return getToken(ExprParser.PARENT_IZQ, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode CORCHETE_IZQ() { return getToken(ExprParser.CORCHETE_IZQ, 0); }
		public TerminalNode CORCHETE_DER() { return getToken(ExprParser.CORCHETE_DER, 0); }
		public TerminalNode PARENT_DER() { return getToken(ExprParser.PARENT_DER, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(ExprParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(ExprParser.LLAVE_DER, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PUBLIC);
			setState(22);
			match(CLASS);
			setState(23);
			match(IDT);
			setState(24);
			match(LLAVE_IZQ);
			setState(25);
			match(PUBLIC);
			setState(26);
			match(STATIC);
			setState(27);
			match(VOID);
			setState(28);
			match(IDT);
			setState(29);
			match(PARENT_IZQ);
			setState(30);
			match(STRING);
			setState(31);
			match(CORCHETE_IZQ);
			setState(32);
			match(CORCHETE_DER);
			setState(33);
			match(IDT);
			setState(34);
			match(PARENT_DER);
			setState(35);
			match(LLAVE_IZQ);
			setState(36);
			main();
			setState(37);
			match(LLAVE_DER);
			setState(38);
			match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public Lista_sentenciasContext lista_sentencias() {
			return getRuleContext(Lista_sentenciasContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			lista_sentencias();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_sentenciasContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Lista_sentenciasContext lista_sentencias() {
			return getRuleContext(Lista_sentenciasContext.class,0);
		}
		public Lista_sentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_sentencias; }
	}

	public final Lista_sentenciasContext lista_sentencias() throws RecognitionException {
		Lista_sentenciasContext _localctx = new Lista_sentenciasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_sentencias);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
			case SYSTEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				sentencia();
				setState(43);
				lista_sentencias();
				}
				break;
			case LLAVE_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				asignacion();
				}
				break;
			case SYSTEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				imprimir();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(ExprParser.TIPO, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TIPO);
			setState(53);
			match(IDT);
			setState(54);
			match(IGUAL);
			setState(55);
			expresion();
			setState(56);
			match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public Op_aritmeticosContext op_aritmeticos() {
			return getRuleContext(Op_aritmeticosContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresion);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(IDT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(IDT);
				setState(61);
				op_aritmeticos();
				setState(62);
				match(IDT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(ExprParser.SYSTEM, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(ExprParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ExprParser.PUNTO, i);
		}
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public TerminalNode PARENT_IZQ() { return getToken(ExprParser.PARENT_IZQ, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode MAS() { return getToken(ExprParser.MAS, 0); }
		public TerminalNode PARENT_DER() { return getToken(ExprParser.PARENT_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(SYSTEM);
			setState(67);
			match(PUNTO);
			setState(68);
			match(IDT);
			setState(69);
			match(PUNTO);
			setState(70);
			match(IDT);
			setState(71);
			match(PARENT_IZQ);
			setState(72);
			match(CADENA);
			setState(73);
			match(MAS);
			setState(74);
			match(IDT);
			setState(75);
			match(PARENT_DER);
			setState(76);
			match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_aritmeticosContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(ExprParser.MAS, 0); }
		public Op_aritmeticosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_aritmeticos; }
	}

	public final Op_aritmeticosContext op_aritmeticos() throws RecognitionException {
		Op_aritmeticosContext _localctx = new Op_aritmeticosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_aritmeticos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MAS);
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
		"\u0004\u0001\u0016Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"/\b\u0003\u0001\u0004\u0001\u0004\u0003\u00043\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006A\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0000\u0000K\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u0015\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006.\u0001"+
		"\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000"+
		"\f@\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010N\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005"+
		"\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"\u0002\u0000\u0000\u0016\u0017\u0005\u0007\u0000\u0000\u0017\u0018\u0005"+
		"\t\u0000\u0000\u0018\u0019\u0005\u0011\u0000\u0000\u0019\u001a\u0005\u0002"+
		"\u0000\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0005\u0004"+
		"\u0000\u0000\u001c\u001d\u0005\t\u0000\u0000\u001d\u001e\u0005\u000f\u0000"+
		"\u0000\u001e\u001f\u0005\u0006\u0000\u0000\u001f \u0005\u0013\u0000\u0000"+
		" !\u0005\u0014\u0000\u0000!\"\u0005\t\u0000\u0000\"#\u0005\u0010\u0000"+
		"\u0000#$\u0005\u0011\u0000\u0000$%\u0003\u0004\u0002\u0000%&\u0005\u0012"+
		"\u0000\u0000&\'\u0005\u0012\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000"+
		"()\u0003\u0006\u0003\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0003\b\u0004"+
		"\u0000+,\u0003\u0006\u0003\u0000,/\u0001\u0000\u0000\u0000-/\u0001\u0000"+
		"\u0000\u0000.*\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0007"+
		"\u0001\u0000\u0000\u000003\u0003\n\u0005\u000013\u0003\u000e\u0007\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000"+
		"\u000045\u0005\u0001\u0000\u000056\u0005\t\u0000\u000067\u0005\r\u0000"+
		"\u000078\u0003\f\u0006\u000089\u0005\u000e\u0000\u00009\u000b\u0001\u0000"+
		"\u0000\u0000:A\u0005\u000b\u0000\u0000;A\u0005\t\u0000\u0000<=\u0005\t"+
		"\u0000\u0000=>\u0003\u0010\b\u0000>?\u0005\t\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@<\u0001"+
		"\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD"+
		"\u0005\u0015\u0000\u0000DE\u0005\t\u0000\u0000EF\u0005\u0015\u0000\u0000"+
		"FG\u0005\t\u0000\u0000GH\u0005\u000f\u0000\u0000HI\u0005\n\u0000\u0000"+
		"IJ\u0005\f\u0000\u0000JK\u0005\t\u0000\u0000KL\u0005\u0010\u0000\u0000"+
		"LM\u0005\u000e\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\f\u0000"+
		"\u0000O\u0011\u0001\u0000\u0000\u0000\u0003.2@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
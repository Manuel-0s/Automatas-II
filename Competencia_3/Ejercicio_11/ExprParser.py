# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,22,81,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,3,1,3,1,3,1,
        3,3,3,47,8,3,1,4,1,4,3,4,51,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,
        1,6,1,6,1,6,1,6,3,6,65,8,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,1,8,1,8,1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,0,75,0,18,1,
        0,0,0,2,21,1,0,0,0,4,40,1,0,0,0,6,46,1,0,0,0,8,50,1,0,0,0,10,52,
        1,0,0,0,12,64,1,0,0,0,14,66,1,0,0,0,16,78,1,0,0,0,18,19,3,2,1,0,
        19,20,5,0,0,1,20,1,1,0,0,0,21,22,5,2,0,0,22,23,5,7,0,0,23,24,5,9,
        0,0,24,25,5,17,0,0,25,26,5,2,0,0,26,27,5,3,0,0,27,28,5,4,0,0,28,
        29,5,9,0,0,29,30,5,15,0,0,30,31,5,6,0,0,31,32,5,19,0,0,32,33,5,20,
        0,0,33,34,5,9,0,0,34,35,5,16,0,0,35,36,5,17,0,0,36,37,3,4,2,0,37,
        38,5,18,0,0,38,39,5,18,0,0,39,3,1,0,0,0,40,41,3,6,3,0,41,5,1,0,0,
        0,42,43,3,8,4,0,43,44,3,6,3,0,44,47,1,0,0,0,45,47,1,0,0,0,46,42,
        1,0,0,0,46,45,1,0,0,0,47,7,1,0,0,0,48,51,3,10,5,0,49,51,3,14,7,0,
        50,48,1,0,0,0,50,49,1,0,0,0,51,9,1,0,0,0,52,53,5,1,0,0,53,54,5,9,
        0,0,54,55,5,13,0,0,55,56,3,12,6,0,56,57,5,14,0,0,57,11,1,0,0,0,58,
        65,5,11,0,0,59,65,5,9,0,0,60,61,5,9,0,0,61,62,3,16,8,0,62,63,5,9,
        0,0,63,65,1,0,0,0,64,58,1,0,0,0,64,59,1,0,0,0,64,60,1,0,0,0,65,13,
        1,0,0,0,66,67,5,8,0,0,67,68,5,21,0,0,68,69,5,9,0,0,69,70,5,21,0,
        0,70,71,5,9,0,0,71,72,5,15,0,0,72,73,5,10,0,0,73,74,5,12,0,0,74,
        75,5,9,0,0,75,76,5,16,0,0,76,77,5,14,0,0,77,15,1,0,0,0,78,79,5,12,
        0,0,79,17,1,0,0,0,3,46,50,64
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'public'", "'static'", "'void'", 
                     "'int'", "'String'", "'class'", "'System'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'+'", "'='", "';'", "'('", 
                     "')'", "'{'", "'}'", "'['", "']'", "'.'" ]

    symbolicNames = [ "<INVALID>", "TIPO", "PUBLIC", "STATIC", "VOID", "INT", 
                      "STRING", "CLASS", "SYSTEM", "IDT", "CADENA", "NUM", 
                      "MAS", "IGUAL", "PUNTO_COMA", "PARENT_IZQ", "PARENT_DER", 
                      "LLAVE_IZQ", "LLAVE_DER", "CORCHETE_IZQ", "CORCHETE_DER", 
                      "PUNTO", "WS" ]

    RULE_root = 0
    RULE_expr = 1
    RULE_main = 2
    RULE_sentencias = 3
    RULE_sentencia = 4
    RULE_asignacion = 5
    RULE_expresion = 6
    RULE_imprimir = 7
    RULE_op_aritmeticos = 8

    ruleNames =  [ "root", "expr", "main", "sentencias", "sentencia", "asignacion", 
                   "expresion", "imprimir", "op_aritmeticos" ]

    EOF = Token.EOF
    TIPO=1
    PUBLIC=2
    STATIC=3
    VOID=4
    INT=5
    STRING=6
    CLASS=7
    SYSTEM=8
    IDT=9
    CADENA=10
    NUM=11
    MAS=12
    IGUAL=13
    PUNTO_COMA=14
    PARENT_IZQ=15
    PARENT_DER=16
    LLAVE_IZQ=17
    LLAVE_DER=18
    CORCHETE_IZQ=19
    CORCHETE_DER=20
    PUNTO=21
    WS=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.expr()
            self.state = 19
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUBLIC)
            else:
                return self.getToken(ExprParser.PUBLIC, i)

        def CLASS(self):
            return self.getToken(ExprParser.CLASS, 0)

        def IDT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IDT)
            else:
                return self.getToken(ExprParser.IDT, i)

        def LLAVE_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_IZQ)
            else:
                return self.getToken(ExprParser.LLAVE_IZQ, i)

        def STATIC(self):
            return self.getToken(ExprParser.STATIC, 0)

        def VOID(self):
            return self.getToken(ExprParser.VOID, 0)

        def PARENT_IZQ(self):
            return self.getToken(ExprParser.PARENT_IZQ, 0)

        def STRING(self):
            return self.getToken(ExprParser.STRING, 0)

        def CORCHETE_IZQ(self):
            return self.getToken(ExprParser.CORCHETE_IZQ, 0)

        def CORCHETE_DER(self):
            return self.getToken(ExprParser.CORCHETE_DER, 0)

        def PARENT_DER(self):
            return self.getToken(ExprParser.PARENT_DER, 0)

        def main(self):
            return self.getTypedRuleContext(ExprParser.MainContext,0)


        def LLAVE_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_DER)
            else:
                return self.getToken(ExprParser.LLAVE_DER, i)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self.match(ExprParser.PUBLIC)
            self.state = 22
            self.match(ExprParser.CLASS)
            self.state = 23
            self.match(ExprParser.IDT)
            self.state = 24
            self.match(ExprParser.LLAVE_IZQ)
            self.state = 25
            self.match(ExprParser.PUBLIC)
            self.state = 26
            self.match(ExprParser.STATIC)
            self.state = 27
            self.match(ExprParser.VOID)
            self.state = 28
            self.match(ExprParser.IDT)
            self.state = 29
            self.match(ExprParser.PARENT_IZQ)
            self.state = 30
            self.match(ExprParser.STRING)
            self.state = 31
            self.match(ExprParser.CORCHETE_IZQ)
            self.state = 32
            self.match(ExprParser.CORCHETE_DER)
            self.state = 33
            self.match(ExprParser.IDT)
            self.state = 34
            self.match(ExprParser.PARENT_DER)
            self.state = 35
            self.match(ExprParser.LLAVE_IZQ)
            self.state = 36
            self.main()
            self.state = 37
            self.match(ExprParser.LLAVE_DER)
            self.state = 38
            self.match(ExprParser.LLAVE_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sentencias(self):
            return self.getTypedRuleContext(ExprParser.SentenciasContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_main




    def main(self):

        localctx = ExprParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_main)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.sentencias()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenciasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sentencia(self):
            return self.getTypedRuleContext(ExprParser.SentenciaContext,0)


        def sentencias(self):
            return self.getTypedRuleContext(ExprParser.SentenciasContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_sentencias




    def sentencias(self):

        localctx = ExprParser.SentenciasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_sentencias)
        try:
            self.state = 46
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 42
                self.sentencia()
                self.state = 43
                self.sentencias()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def asignacion(self):
            return self.getTypedRuleContext(ExprParser.AsignacionContext,0)


        def imprimir(self):
            return self.getTypedRuleContext(ExprParser.ImprimirContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_sentencia




    def sentencia(self):

        localctx = ExprParser.SentenciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_sentencia)
        try:
            self.state = 50
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 48
                self.asignacion()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 49
                self.imprimir()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIPO(self):
            return self.getToken(ExprParser.TIPO, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def IGUAL(self):
            return self.getToken(ExprParser.IGUAL, 0)

        def expresion(self):
            return self.getTypedRuleContext(ExprParser.ExpresionContext,0)


        def PUNTO_COMA(self):
            return self.getToken(ExprParser.PUNTO_COMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_asignacion




    def asignacion(self):

        localctx = ExprParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_asignacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.match(ExprParser.TIPO)
            self.state = 53
            self.match(ExprParser.IDT)
            self.state = 54
            self.match(ExprParser.IGUAL)
            self.state = 55
            self.expresion()
            self.state = 56
            self.match(ExprParser.PUNTO_COMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def IDT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IDT)
            else:
                return self.getToken(ExprParser.IDT, i)

        def op_aritmeticos(self):
            return self.getTypedRuleContext(ExprParser.Op_aritmeticosContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_expresion




    def expresion(self):

        localctx = ExprParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_expresion)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 58
                self.match(ExprParser.NUM)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 59
                self.match(ExprParser.IDT)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 60
                self.match(ExprParser.IDT)
                self.state = 61
                self.op_aritmeticos()
                self.state = 62
                self.match(ExprParser.IDT)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImprimirContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SYSTEM(self):
            return self.getToken(ExprParser.SYSTEM, 0)

        def PUNTO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO)
            else:
                return self.getToken(ExprParser.PUNTO, i)

        def IDT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IDT)
            else:
                return self.getToken(ExprParser.IDT, i)

        def PARENT_IZQ(self):
            return self.getToken(ExprParser.PARENT_IZQ, 0)

        def CADENA(self):
            return self.getToken(ExprParser.CADENA, 0)

        def MAS(self):
            return self.getToken(ExprParser.MAS, 0)

        def PARENT_DER(self):
            return self.getToken(ExprParser.PARENT_DER, 0)

        def PUNTO_COMA(self):
            return self.getToken(ExprParser.PUNTO_COMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_imprimir




    def imprimir(self):

        localctx = ExprParser.ImprimirContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_imprimir)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(ExprParser.SYSTEM)
            self.state = 67
            self.match(ExprParser.PUNTO)
            self.state = 68
            self.match(ExprParser.IDT)
            self.state = 69
            self.match(ExprParser.PUNTO)
            self.state = 70
            self.match(ExprParser.IDT)
            self.state = 71
            self.match(ExprParser.PARENT_IZQ)
            self.state = 72
            self.match(ExprParser.CADENA)
            self.state = 73
            self.match(ExprParser.MAS)
            self.state = 74
            self.match(ExprParser.IDT)
            self.state = 75
            self.match(ExprParser.PARENT_DER)
            self.state = 76
            self.match(ExprParser.PUNTO_COMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Op_aritmeticosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MAS(self):
            return self.getToken(ExprParser.MAS, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_op_aritmeticos




    def op_aritmeticos(self):

        localctx = ExprParser.Op_aritmeticosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_op_aritmeticos)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(ExprParser.MAS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx






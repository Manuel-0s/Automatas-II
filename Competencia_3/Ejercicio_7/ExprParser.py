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
        4,1,5,24,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,1,0,1,0,1,0,1,1,1,1,1,2,
        1,2,1,3,1,3,1,3,1,3,1,3,1,3,3,3,22,8,3,1,3,0,0,4,0,2,4,6,0,0,20,
        0,8,1,0,0,0,2,11,1,0,0,0,4,13,1,0,0,0,6,21,1,0,0,0,8,9,3,6,3,0,9,
        10,5,0,0,1,10,1,1,0,0,0,11,12,5,1,0,0,12,3,1,0,0,0,13,14,5,3,0,0,
        14,5,1,0,0,0,15,16,3,2,1,0,16,17,5,2,0,0,17,18,3,4,2,0,18,19,3,6,
        3,0,19,22,1,0,0,0,20,22,5,4,0,0,21,15,1,0,0,0,21,20,1,0,0,0,22,7,
        1,0,0,0,1,21
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'int'", "<INVALID>", "'='" ]

    symbolicNames = [ "<INVALID>", "INT", "IDT", "IGUAL", "NUM", "WS" ]

    RULE_root = 0
    RULE_tipo = 1
    RULE_op_aritmetico = 2
    RULE_expr = 3

    ruleNames =  [ "root", "tipo", "op_aritmetico", "expr" ]

    EOF = Token.EOF
    INT=1
    IDT=2
    IGUAL=3
    NUM=4
    WS=5

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
            self.state = 8
            self.expr()
            self.state = 9
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_tipo




    def tipo(self):

        localctx = ExprParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_tipo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            self.match(ExprParser.INT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Op_aritmeticoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IGUAL(self):
            return self.getToken(ExprParser.IGUAL, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_op_aritmetico




    def op_aritmetico(self):

        localctx = ExprParser.Op_aritmeticoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_op_aritmetico)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self.match(ExprParser.IGUAL)
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

        def tipo(self):
            return self.getTypedRuleContext(ExprParser.TipoContext,0)


        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def op_aritmetico(self):
            return self.getTypedRuleContext(ExprParser.Op_aritmeticoContext,0)


        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_expr)
        try:
            self.state = 21
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 15
                self.tipo()
                self.state = 16
                self.match(ExprParser.IDT)
                self.state = 17
                self.op_aritmetico()
                self.state = 18
                self.expr()
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.match(ExprParser.NUM)
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






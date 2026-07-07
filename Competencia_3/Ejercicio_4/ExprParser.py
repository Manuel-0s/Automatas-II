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
        4,1,6,16,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,3,1,
        14,8,1,1,1,0,0,2,0,2,0,0,14,0,4,1,0,0,0,2,13,1,0,0,0,4,5,3,2,1,0,
        5,6,5,0,0,1,6,1,1,0,0,0,7,8,5,1,0,0,8,9,3,2,1,0,9,10,5,3,0,0,10,
        11,5,4,0,0,11,14,1,0,0,0,12,14,5,2,0,0,13,7,1,0,0,0,13,12,1,0,0,
        0,14,3,1,0,0,0,1,13
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'if'", "<INVALID>", "'>'", "<INVALID>", 
                     "'+'" ]

    symbolicNames = [ "<INVALID>", "IF", "IDT", "MAYOR_QUE", "NUM", "MAS", 
                      "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    IF=1
    IDT=2
    MAYOR_QUE=3
    NUM=4
    MAS=5
    WS=6

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
            self.state = 4
            self.expr()
            self.state = 5
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

        def IF(self):
            return self.getToken(ExprParser.IF, 0)

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def MAYOR_QUE(self):
            return self.getToken(ExprParser.MAYOR_QUE, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.state = 13
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 7
                self.match(ExprParser.IF)
                self.state = 8
                self.expr()
                self.state = 9
                self.match(ExprParser.MAYOR_QUE)
                self.state = 10
                self.match(ExprParser.NUM)
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 12
                self.match(ExprParser.IDT)
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






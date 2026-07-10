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
        4,1,7,23,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,3,2,21,8,2,1,2,0,0,3,0,2,4,0,0,21,0,6,1,
        0,0,0,2,9,1,0,0,0,4,20,1,0,0,0,6,7,3,4,2,0,7,8,5,0,0,1,8,1,1,0,0,
        0,9,10,5,5,0,0,10,3,1,0,0,0,11,12,5,1,0,0,12,13,5,2,0,0,13,14,3,
        4,2,0,14,15,3,2,1,0,15,16,3,4,2,0,16,17,5,3,0,0,17,21,1,0,0,0,18,
        21,5,6,0,0,19,21,5,4,0,0,20,11,1,0,0,0,20,18,1,0,0,0,20,19,1,0,0,
        0,21,5,1,0,0,0,1,20
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'if'", "'('", "')'", "<INVALID>", "'>'" ]

    symbolicNames = [ "<INVALID>", "IF", "PARENT_IZQ", "PARENT_DER", "IDT", 
                      "MAYOR", "NUM", "WS" ]

    RULE_root = 0
    RULE_op_aritmetico = 1
    RULE_expr = 2

    ruleNames =  [ "root", "op_aritmetico", "expr" ]

    EOF = Token.EOF
    IF=1
    PARENT_IZQ=2
    PARENT_DER=3
    IDT=4
    MAYOR=5
    NUM=6
    WS=7

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
            self.state = 6
            self.expr()
            self.state = 7
            self.match(ExprParser.EOF)
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

        def MAYOR(self):
            return self.getToken(ExprParser.MAYOR, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_op_aritmetico




    def op_aritmetico(self):

        localctx = ExprParser.Op_aritmeticoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_op_aritmetico)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self.match(ExprParser.MAYOR)
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

        def PARENT_IZQ(self):
            return self.getToken(ExprParser.PARENT_IZQ, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)


        def op_aritmetico(self):
            return self.getTypedRuleContext(ExprParser.Op_aritmeticoContext,0)


        def PARENT_DER(self):
            return self.getToken(ExprParser.PARENT_DER, 0)

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def IDT(self):
            return self.getToken(ExprParser.IDT, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expr)
        try:
            self.state = 20
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 11
                self.match(ExprParser.IF)
                self.state = 12
                self.match(ExprParser.PARENT_IZQ)
                self.state = 13
                self.expr()
                self.state = 14
                self.op_aritmetico()
                self.state = 15
                self.expr()
                self.state = 16
                self.match(ExprParser.PARENT_DER)
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 18
                self.match(ExprParser.NUM)
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 3)
                self.state = 19
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






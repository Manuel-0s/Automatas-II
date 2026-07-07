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
        4,1,4,26,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,5,2,21,8,2,10,2,12,2,24,9,2,1,2,0,1,4,3,
        0,2,4,0,1,1,0,2,3,23,0,6,1,0,0,0,2,9,1,0,0,0,4,11,1,0,0,0,6,7,3,
        4,2,0,7,8,5,0,0,1,8,1,1,0,0,0,9,10,7,0,0,0,10,3,1,0,0,0,11,12,6,
        2,-1,0,12,13,5,1,0,0,13,22,1,0,0,0,14,15,10,2,0,0,15,16,3,2,1,0,
        16,17,3,4,2,0,17,18,3,2,1,0,18,19,3,4,2,3,19,21,1,0,0,0,20,14,1,
        0,0,0,21,24,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,5,1,0,0,0,24,
        22,1,0,0,0,1,22
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'+'", "'*'" ]

    symbolicNames = [ "<INVALID>", "NUM", "MAS", "MULT", "WS" ]

    RULE_root = 0
    RULE_op_aritmeticos = 1
    RULE_expr = 2

    ruleNames =  [ "root", "op_aritmeticos", "expr" ]

    EOF = Token.EOF
    NUM=1
    MAS=2
    MULT=3
    WS=4

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
            self.expr(0)
            self.state = 7
            self.match(ExprParser.EOF)
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

        def MULT(self):
            return self.getToken(ExprParser.MULT, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_op_aritmeticos




    def op_aritmeticos(self):

        localctx = ExprParser.Op_aritmeticosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_op_aritmeticos)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            _la = self._input.LA(1)
            if not(_la==2 or _la==3):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
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

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)


        def op_aritmeticos(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Op_aritmeticosContext)
            else:
                return self.getTypedRuleContext(ExprParser.Op_aritmeticosContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_expr



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ExprParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.match(ExprParser.NUM)
            self._ctx.stop = self._input.LT(-1)
            self.state = 22
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = ExprParser.ExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                    self.state = 14
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 15
                    self.op_aritmeticos()
                    self.state = 16
                    self.expr(0)
                    self.state = 17
                    self.op_aritmeticos()
                    self.state = 18
                    self.expr(3) 
                self.state = 24
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         





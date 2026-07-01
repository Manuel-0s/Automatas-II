# Importa ANTLR4 para funciones
from antlr4 import *

from ExprLexer import ExprLexer

lexer = ExprLexer(FileStream("? "))

tokens = CommonTokenStream(lexer)
tokens.fill()

print(tokens)
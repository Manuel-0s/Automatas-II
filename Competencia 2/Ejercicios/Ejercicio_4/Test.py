# Importa ANTLR4 para funciones
from antlr4 import *

from ExprLexer import ExprLexer

lexer = ExprLexer(InputStream(input("? ")))

tokens = CommonTokenStream(lexer)
tokens.fill()

for token in tokens.tokens:
    print("Texto: " + token.text)
    print("Tipo: " + str(token.type))
    print("--------------------------------")
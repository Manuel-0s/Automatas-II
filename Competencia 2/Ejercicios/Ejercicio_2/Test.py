# Importa ANTLR4 para funciones
from antlr4 import *
from ExprLexer import ExprLexer

lexer = ExprLexer(InputStream(input("? ")))

tokens = CommonTokenStream(lexer)
tokens.fill()

print(f"{'TEXTO':<15} {'TOKEN':<10} {'TIPO':<10} {'LINEA':<10} {'COLUMNA':<10}")
print("-" * 60)

for token in tokens.tokens:
    nombre_token = lexer.symbolicNames[token.type]
    print(f"{token.text:<15} {nombre_token:<10} {token.type:<10} {token.line:<10} {token.column:<10} ")
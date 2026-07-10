from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser

entrada = FileStream("codigo.txt", encoding="utf-8")

lexer = ExprLexer(entrada)
tokens = CommonTokenStream(lexer)
parser = ExprParser(tokens)

arbol = parser.root()

tokens.fill()

if parser.getNumberOfSyntaxErrors() == 0:
    print("El código es correcto")
    print("Arbol sintactico: ")
    
    print(arbol.toStringTree(recog=parser))
else:
    print("El código tiene errores de sintaxis")
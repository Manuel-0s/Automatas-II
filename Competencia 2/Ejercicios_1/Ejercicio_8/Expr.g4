grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 8
IDT : [a-zA-Z]+ ;
MAYOR_IGUAL: '>=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
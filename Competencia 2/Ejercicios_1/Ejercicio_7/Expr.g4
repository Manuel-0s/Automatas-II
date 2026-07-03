grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 7
INT: 'int' ;
IDT : [a-zA-Z]+ ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
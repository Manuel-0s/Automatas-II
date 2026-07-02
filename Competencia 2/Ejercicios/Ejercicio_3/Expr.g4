grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicos 3:
IDT : [a-zA-Z]+ ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
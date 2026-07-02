grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicos 2:
NUM : [0-9]+;
MENOS : '-';
WS  : [ \t\r\n]+ -> skip ;
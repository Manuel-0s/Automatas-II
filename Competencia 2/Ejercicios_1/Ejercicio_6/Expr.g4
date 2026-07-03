grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 6
NUM : [0-9]+ ;
MAS : '+' ;
MULT : '*' ;
WS  : [ \t\r\n]+ -> skip ;
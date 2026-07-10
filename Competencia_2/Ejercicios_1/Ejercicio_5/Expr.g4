grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 5
PRINT : 'print' ;
CADENA: '"' ~["\r\n]* '"' ;
WS  : [ \t\r\n]+ -> skip ;
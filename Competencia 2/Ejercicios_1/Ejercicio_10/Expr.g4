grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 10
PRINT : 'print' ;
CADENA : '"' ~["\r\n]* '"' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;
PUNTO_COMA : ';' ;
WS  : [ \t\r\n]+ -> skip ;
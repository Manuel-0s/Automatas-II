grammar Expr;

root : expr EOF;
//print "Hola" 
expr: PRINT expr | CADENA ;

PRINT : 'print' ;
CADENA: '"' ~["\r\n]* '"' ;
WS  : [ \t\r\n]+ -> skip ;
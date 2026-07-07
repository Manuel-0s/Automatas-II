grammar Expr;

root: expr EOF ;     
expr: EOF ; 

UPDATE : 'UPDATE' ;
SET : 'SET' ;
WHERE : 'WHERE' ;

CADENA : '\'' ~['\r\n]* '\'' ; 
IDT : [a-zA-Z][a-zA-Z0-9_]* ;
NUM : [0-9]+ ;

IGUAL : '=' ;
COMA : ',' ;
PUNTO_COMA : ';' ;

WS : [ \t\r\n]+ -> skip ;
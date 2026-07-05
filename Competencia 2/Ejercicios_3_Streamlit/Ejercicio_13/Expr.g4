grammar Expr;

root: expr EOF ;     
expr: EOF ; 

CREATE : 'CREATE' ;
TABLE : 'TABLE' ;
SERIAL : 'SERIAL' ;
PRIMARY : 'PRIMARY' ;
KEY : 'KEY' ;
NOT : 'NOT' ;
NULL : 'NULL' ;
VARCHAR : 'VARCHAR' ;
INTEGER : 'INTEGER' ;
DATE : 'DATE' ;
INSERT : 'INSERT' ;
INTO : 'INTO' ;
VALUES : 'VALUES' ;
SELECT : 'SELECT' ;
FROM : 'FROM' ;
WHERE : 'WHERE' ;
INNER : 'INNER' ;
JOIN : 'JOIN' ;
UPDATE : 'UPDATE' ;
SET : 'SET' ;
ON : 'ON' ; 

IGUAL : '=' ; 
COMA : ',' ;
PUNTO : '.' ;
PUNTO_COMA : ';' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;

CADENA : '\'' ~['\r\n]* '\'' ; 
IDT : [a-zA-Z][a-zA-Z0-9_]* ;
NUM : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
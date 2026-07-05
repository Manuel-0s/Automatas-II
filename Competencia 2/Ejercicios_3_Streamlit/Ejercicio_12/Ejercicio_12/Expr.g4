grammar Expr;

root: expr EOF ;    
expr: EOF ; 

PUBLIC : 'public' ;
CLASS : 'class' ;
STATIC : 'static' ;
VOID : 'void' ;
INT : 'int' ;
STRING : 'String';
SYSTEM : 'System' ;
IF : 'if' ;

CADENA : '"' ~["\r\n]* '"' ;
IDT : [a-zA-Z][a-zA-Z0-9_]* ;
NUM : [0-9]+ ;

MAYOR_IGUAL : '>=' ;
SUM : '+' ;
IGUAL : '=' ;
PUNTO_COMA : ';' ;
PUNTO : '.' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
CORCHETE_IZQ : '[' ;
CORCHETE_DER : ']' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;

WS : [ \t\r\n]+ -> skip ;
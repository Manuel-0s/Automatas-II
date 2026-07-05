grammar Expr;

root: expr EOF ;    

expr: EOF ;

PUBLIC : 'public' ;
STATIC : 'static' ;
VOID : 'void' ;
INT : 'int' ;
STRING : 'String' ;
CLASS : 'class' ;
SYSTEM : 'System' ;

IDT : [a-zA-Z_] [a-zA-Z0-9_]* ;
CADENA : '"' ~["\r\n]* '"' ;
NUM : [0-9]+ ;

MAS : '+' ;
IGUAL : '=' ;
PUNTO_COMA : ';' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
CORCHETE_IZQ : '[' ;
CORCHETE_DER : ']' ;
PUNTO : '.' ;

WS : [ \t\r\n]+ -> skip ;
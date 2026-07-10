grammar Expr;

root: expr EOF ;    

expr: 
PUBLIC CLASS IDT LLAVE_IZQ 
    PUBLIC STATIC VOID IDT PARENT_IZQ STRING CORCHETE_IZQ CORCHETE_DER IDT PARENT_DER LLAVE_IZQ 
        main 
    LLAVE_DER
LLAVE_DER ;

main: lista_sentencias;

lista_sentencias: sentencia lista_sentencias | ;

sentencia: asignacion | imprimir;

asignacion: TIPO IDT IGUAL expresion PUNTO_COMA ;

expresion: NUM | IDT | IDT op_aritmeticos IDT;

imprimir: SYSTEM PUNTO IDT PUNTO IDT PARENT_IZQ CADENA MAS IDT PARENT_DER PUNTO_COMA ;

TIPO: INT;
op_aritmeticos : MAS ;

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
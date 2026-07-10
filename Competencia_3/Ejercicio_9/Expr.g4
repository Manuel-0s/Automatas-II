grammar Expr;

root : expr EOF;
op_aritmetico : MAYOR ;
expr: IF PARENT_IZQ expr op_aritmetico expr PARENT_DER | NUM | IDT ;

//if (edad > 17)
IF : 'if' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;
IDT : [a-zA-Z][a-zA-Z0-9]* ;
MAYOR : '>' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
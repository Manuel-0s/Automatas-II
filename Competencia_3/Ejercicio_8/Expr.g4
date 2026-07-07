grammar Expr;

root : expr EOF;
op_aritmetico : MAYOR_IGUAL ;
expr: expr op_aritmetico expr | NUM | IDT ;

//edad >= 18
IDT : [a-zA-Z][a-zA-Z0-9]* ;
MAYOR_IGUAL: '>=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
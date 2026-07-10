grammar Expr;

root : expr EOF;
tipo: INT;
op_aritmetico: IGUAL;
expr: tipo IDT op_aritmetico expr | NUM;

//int total = 100
INT: 'int' ;
IDT : [a-zA-Z][a-zA-Z0-9]* ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
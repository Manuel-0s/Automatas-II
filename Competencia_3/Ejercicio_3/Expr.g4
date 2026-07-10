grammar Expr;

root : expr EOF;

expr:IDT IGUAL expr | IDT | NUM;

IDT : [a-zA-Z][a-zA-Z0-9_]* ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
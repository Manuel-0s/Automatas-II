grammar Expr;

root : expr EOF;

expr:IDT IGUAL expr | IDT | NUM;

IDT : [a-zA-Z]+ ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
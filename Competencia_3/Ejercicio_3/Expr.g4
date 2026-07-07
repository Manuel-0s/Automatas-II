grammar Expr;

root : expr EOF;

expr: expr IGUAL NUM | IDT ;

IDT : [a-zA-Z]+ ;
IGUAL : '=' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
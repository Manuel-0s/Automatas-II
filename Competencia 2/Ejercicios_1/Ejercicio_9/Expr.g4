grammar Expr;

root : expr EOF;

expr: EOF;

//Ejercicio 9
COND_IF : 'if' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;
IDT : [a-zA-Z]+ ;
MAYOR : '>' ;
NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
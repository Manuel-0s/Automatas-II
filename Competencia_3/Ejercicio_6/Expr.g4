grammar Expr;

root : expr EOF;
//15 + 3 * 2 
expr: expr MAS expr MULT expr | NUM;

NUM : [0-9]+ ;
MAS : '+' ;
MULT : '*' ;
WS  : [ \t\r\n]+ -> skip ;
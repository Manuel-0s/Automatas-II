grammar Expr;

root : expr EOF;
//15 + 3 * 2 
op_aritmeticos: MAS | MULT;
expr: expr op_aritmeticos expr op_aritmeticos expr | NUM;

NUM : [0-9]+ ;
MAS : '+' ;
MULT : '*' ;
WS  : [ \t\r\n]+ -> skip ;
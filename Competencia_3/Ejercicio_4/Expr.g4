grammar Expr;

root : expr EOF;

expr: IF expr MAYOR_QUE NUM | IDT ;

IF: 'if';
IDT: [a-zA-Z]+;
MAYOR_QUE: '>';
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;
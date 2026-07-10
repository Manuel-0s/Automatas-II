grammar Expr;

root : expr EOF;
//if x > 5
op_relacional: MAYOR ;
expr: IF expr op_relacional expr | IDT | NUM ;

IF: 'if';
IDT: [a-zA-Z][a-zA-Z0-9_]*;
MAYOR: '>';
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;
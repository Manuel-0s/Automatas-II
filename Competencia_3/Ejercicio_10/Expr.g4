grammar Expr;

root : expr EOF;

expr: PRINT PARENT_IZQ expr PARENT_DER PUNTO_COMA | CADENA;

//print(“Hola Mundo”);
PRINT : 'print' ;
CADENA : '"' ~["\r\n]* '"' ;
PARENT_IZQ : '(' ;
PARENT_DER : ')' ;
PUNTO_COMA : ';' ;
WS  : [ \t\r\n]+ -> skip ;
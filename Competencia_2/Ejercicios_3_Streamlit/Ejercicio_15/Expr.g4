grammar Expr;

root: expr EOF ;     
expr: EOF ; 

NMAP : 'nmap' ;
SS : 'ss' ;
SUDO : 'sudo' ;
TCPDUMP : 'tcpdump' ;
CURL : 'curl' ;
DIG : 'dig' ;
JOURNALCTL : 'journalctl' ;
GREP : 'grep' ;
UFW : 'ufw' ;
TODAY : 'today' ;
DENY : 'deny' ;
FROM : 'from' ;
FLAG_SV : '-sV' ;
FLAG_SN : '-sn' ;
FLAG_TULN : '-tuln' ;
FLAG_I : '-i' ;
FLAG_C : '-c' ;
FLAG_MAY_I : '-I' ;
FLAG_SINCE : '--since' ;

IP_ADDRESS : [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ ('/' [0-9]+)? ;
RUTA_ARCHIVO : '/' [a-zA-Z0-9_\-]+ ('/' [a-zA-Z0-9_\-.]+)+ ;
CADENA : '"' ~["\r\n]* '"' | '\'' ~['\r\n]* '\'' ;
DOMINIO : [a-zA-Z0-9\-]+ '.' [a-zA-Z]+;
INTERFAZ : 'eth' [0-9]+ | 'wlan' [0-9]+ | 'lo' ;
TIPO_REG : 'MX' | 'A' | 'AAAA' | 'TXT' ; 
NUM : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
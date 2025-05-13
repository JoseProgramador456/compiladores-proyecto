grammar MiGramatica;

// Regla inicial
inicio   : 'hola' ID ;
ID       : [a-zA-Z]+ ;
WS       : [ \t\r\n]+ -> skip ;
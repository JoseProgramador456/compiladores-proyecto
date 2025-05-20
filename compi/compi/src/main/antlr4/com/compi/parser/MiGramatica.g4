grammar MiGramatica;

// Regla inicial ya estara cambiado para que funcione 
inicio   : 'hola' ID ;
ID       : [a-zA-Z]+ ;
WS       : [ \t\r\n]+ -> skip ;
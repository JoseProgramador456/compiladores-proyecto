grammar MiGramatica;

// Regla inicial ya estara cambiado para que funcione 
//para hacer que funcione la gramatica hay que esperar el analizador 
inicio   : 'hola' ID ;
ID       : [a-zA-Z]+ ;
WS       : [ \t\r\n]+ -> skip ;
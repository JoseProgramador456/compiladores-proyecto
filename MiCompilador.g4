grammar MiCompilador;

program: 'PROGRAMA' ID ';' bloque '.';

bloque: declaraciones? inicio;

declaraciones: declaracion+;

declaracion: variable_declaracion;

variable_declaracion: 'VAR' ID ':' tipo_variable ';' variable_declaracion?;

tipo_variable
    : 'INT'
    | 'FLOAT'
    | 'REAL'
    | 'BOLEANO'
    | 'STRING'
    ;

inicio: 'BEGIN' lista_sentencia? 'END';

lista_sentencia: sentencia (';' sentencia)* ';'?;

sentencia
    : asignacion
    | inicio
    | sentencia_return
    | sentencia_io
    ;

sentencia_io
    : 'PRINTLN' '(' expresion ')'        # imprimirValor
    | 'PRINTLN' '(' STRING_CONST ')'     # imprimirTexto
    | 'READLN' '(' ID ')'                # leerVariable
    ;

sentencia_return: 'RETURN' expresion ';';

asignacion
    : ID operador_asignacion expresion
    ;

expresion
    : expresion_simple (operador_relacional expresion_simple)?
    ;

expresion_simple
    : termino (operador_aditivo termino)*
    ;

termino
    : potencia (operador_multiplicativo potencia)*
    ;

potencia
    : factor ('^' factor)*
    ;

factor
    : '(' expresion ')'           // agrupación grupo 1, 4, 7
    | '[' expresion ']'           // agrupación grupo 2, 5, 8
    | '{' expresion '}'           // agrupación grupo 3, 6, 9
    | ID
    | INT
    | FLOAT
    | booleano
    ;

booleano: 'TRUE' | 'FALSE';

operador_asignacion
    : '=='
    | '<-'
    | '=>'
    ;

operador_relacional
    : '=' | '<>' | '<' | '<=' | '>' | '>='
    ;

operador_aditivo
    : '+' | '-' | 'OR'
    ;

operador_multiplicativo
    : '*' | '/' | 'AND'
    ;

STRING_CONST: '"' ( ~["\\] | '\\' . )* '"';

ID: [a-zA-Z_] [a-zA-Z0-9_]*;

INT: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]+;

WS: [ \t\r\n]+ -> skip;

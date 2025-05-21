// Generated from MiCompilador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiCompiladorParser}.
 */
public interface MiCompiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiCompiladorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiCompiladorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiCompiladorParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiCompiladorParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(MiCompiladorParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(MiCompiladorParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiCompiladorParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiCompiladorParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#variable_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaracion(MiCompiladorParser.Variable_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#variable_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaracion(MiCompiladorParser.Variable_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#tipo_variable}.
	 * @param ctx the parse tree
	 */
	void enterTipo_variable(MiCompiladorParser.Tipo_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#tipo_variable}.
	 * @param ctx the parse tree
	 */
	void exitTipo_variable(MiCompiladorParser.Tipo_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MiCompiladorParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MiCompiladorParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#lista_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterLista_sentencia(MiCompiladorParser.Lista_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#lista_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitLista_sentencia(MiCompiladorParser.Lista_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiCompiladorParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiCompiladorParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imprimirValor}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void enterImprimirValor(MiCompiladorParser.ImprimirValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imprimirValor}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void exitImprimirValor(MiCompiladorParser.ImprimirValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imprimirTexto}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void enterImprimirTexto(MiCompiladorParser.ImprimirTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imprimirTexto}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void exitImprimirTexto(MiCompiladorParser.ImprimirTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leerVariable}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void enterLeerVariable(MiCompiladorParser.LeerVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leerVariable}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 */
	void exitLeerVariable(MiCompiladorParser.LeerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#sentencia_return}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_return(MiCompiladorParser.Sentencia_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#sentencia_return}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_return(MiCompiladorParser.Sentencia_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiCompiladorParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiCompiladorParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiCompiladorParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiCompiladorParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#expresion_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_simple(MiCompiladorParser.Expresion_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#expresion_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_simple(MiCompiladorParser.Expresion_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MiCompiladorParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MiCompiladorParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(MiCompiladorParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(MiCompiladorParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiCompiladorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiCompiladorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(MiCompiladorParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(MiCompiladorParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterOperador_asignacion(MiCompiladorParser.Operador_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitOperador_asignacion(MiCompiladorParser.Operador_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(MiCompiladorParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(MiCompiladorParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aditivo(MiCompiladorParser.Operador_aditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#operador_aditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aditivo(MiCompiladorParser.Operador_aditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiCompiladorParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperador_multiplicativo(MiCompiladorParser.Operador_multiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiCompiladorParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperador_multiplicativo(MiCompiladorParser.Operador_multiplicativoContext ctx);
}
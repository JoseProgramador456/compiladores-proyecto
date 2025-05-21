// Generated from MiCompilador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiCompiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiCompiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiCompiladorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiCompiladorParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(MiCompiladorParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiCompiladorParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#variable_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaracion(MiCompiladorParser.Variable_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#tipo_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_variable(MiCompiladorParser.Tipo_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MiCompiladorParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#lista_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_sentencia(MiCompiladorParser.Lista_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiCompiladorParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimirValor}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirValor(MiCompiladorParser.ImprimirValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprimirTexto}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirTexto(MiCompiladorParser.ImprimirTextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leerVariable}
	 * labeled alternative in {@link MiCompiladorParser#sentencia_io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerVariable(MiCompiladorParser.LeerVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#sentencia_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_return(MiCompiladorParser.Sentencia_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiCompiladorParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiCompiladorParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#expresion_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_simple(MiCompiladorParser.Expresion_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiCompiladorParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(MiCompiladorParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiCompiladorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(MiCompiladorParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_asignacion(MiCompiladorParser.Operador_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#operador_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_relacional(MiCompiladorParser.Operador_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#operador_aditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_aditivo(MiCompiladorParser.Operador_aditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiCompiladorParser#operador_multiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_multiplicativo(MiCompiladorParser.Operador_multiplicativoContext ctx);
}
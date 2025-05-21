import org.antlr.v4.runtime.tree.*;

public class Visitor extends MiCompiladorBaseVisitor<Object> {
@Override
public Object visitPrograma(MiCompiladorParser.ProgramaContext ctx) {
    System.out.println("Visit: programa -> Ejecuta el bloque principal");
    return visit(ctx.bloque());
}

@Override
public Object visitBloque(MiCompiladorParser.BloqueContext ctx) {
    System.out.println("Visit: bloque -> Procesa declaraciones y sentencias");
    if (ctx.declaraciones() != null) visit(ctx.declaraciones());
    return visit(ctx.compound_statement());
}

@Override
public Object visitDeclaracion(MiCompiladorParser.DeclaracionContext ctx) {
    System.out.println("Visit: declaracion -> Puede ser variable o función");
    return visitChildren(ctx);
}

@Override
public Object visitVar_declaracion(MiCompiladorParser.Var_declaracionContext ctx) {
    System.out.println("Visit: var_declaracion -> Declaración de variable: " + ctx.ID().getText());
    return visitChildren(ctx);
}

@Override
public Object visitFuncion_declaracion(MiCompiladorParser.Funcion_declaracionContext ctx) {
    System.out.println("Visit: funcion_declaracion -> Función declarada: " + ctx.ID().getText());
    return visitChildren(ctx);
}

@Override
public Object visitSentencia_if(MiCompiladorParser.Sentencia_ifContext ctx) {
    System.out.println("Visit: sentencia_if -> Evalúa condición IF");
    return visitChildren(ctx);
}

@Override
public Object visitSentencia_while(MiCompiladorParser.Sentencia_whileContext ctx) {
    System.out.println("Visit: sentencia_while -> Ejecuta ciclo WHILE");
    return visitChildren(ctx);
}

@Override
public Object visitAsignacion(MiCompiladorParser.AsignacionContext ctx) {
    System.out.println("Visit: asignacion -> Asigna valor a variable: " + ctx.ID().getText());
    return visitChildren(ctx);
}

@Override
public Object visitSentencia_io(MiCompiladorParser.Sentencia_ioContext ctx) {
    System.out.println("Visit: sentencia_io -> Entrada/Salida (READLN o PRINTLN)");
    return visitChildren(ctx);
}

@Override
public Object visitSentencia_return(MiCompiladorParser.Sentencia_returnContext ctx) {
    System.out.println("Visit: sentencia_return -> Devuelve resultado de función");
    return visitChildren(ctx);
}

@Override
public Object visitLlamada_procedimiento(MiCompiladorParser.Llamada_procedimientoContext ctx) {
    System.out.println("Visit: llamada_procedimiento -> Llama a función: " + ctx.ID().getText());
    return visitChildren(ctx);
}
}
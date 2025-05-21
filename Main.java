import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.ConsoleErrorListener;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer el archivo de entrada (cambia "entrada.txt" si es otro archivo)
            String sourceCode = new String(Files.readAllBytes(Paths.get("entrada.txt")));

            // Crear el lexer y parser
            CharStream input = CharStreams.fromString(sourceCode);
            MiCompiladorLexer lexer = new MiCompiladorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiCompiladorParser parser = new MiCompiladorParser(tokens);

            // Mostrar errores léxicos/sintácticos si hay
            parser.removeErrorListeners();
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.addErrorListener(new ConsoleErrorListener());

            // Generar el árbol
            ParseTree tree = parser.programa();

            // Crear el visitor y recorrer el árbol
            MiCompiladorCustomVisitor visitor = new MiCompiladorCustomVisitor();
            visitor.visit(tree);

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

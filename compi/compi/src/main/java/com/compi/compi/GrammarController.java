package com.compi.compi;

import org.antlr.v4.runtime.*;
import com.compi.parser.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Ajusta el puerto según tu frontend
@RequestMapping("/api/parse")
public class GrammarController {

    @GetMapping("/test")
    public String parseInput() {
        String input = "hola mundo"; // Texto de prueba
        System.out.println("GrammarController creado!"); // Mensaje de log
        return parse(input); // Llama a tu método existente
    }

    public static String parse(String input) {
        CharStream chars = CharStreams.fromString(input);
        MiGramaticaLexer lexer = new MiGramaticaLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiGramaticaParser parser = new MiGramaticaParser(tokens);
        parser.inicio(); // Regla inicial de tu gramática
        return "¡Parser ejecutado correctamente! Árbol: " + parser.inicio().toStringTree(parser);
    }
}
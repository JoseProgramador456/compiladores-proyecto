package com.compi.compi;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000") // Ajusta el puerto según tu frontend
@RestController
@RequestMapping("/api")
public class AnalizadorController {

    public AnalizadorController() {
        System.out.println("AnalizadorController creado!"); // Mensaje de log
    }

    @GetMapping("/test")
        public String test() {
            return "¡El controlador funciona!";
    }       

    @PostMapping("/analizar")
    public AnalizadorResponse analizar(@RequestBody AnalizadorRequest request) {
    String codigoFuente = request.getCodigoFuente();
    AnalizadorLexico analizador = new AnalizadorLexico(codigoFuente);
    analizador.analizar();

    AnalizadorResponse response = new AnalizadorResponse();
    response.setTokens(analizador.getTokens());
    response.setTablaSimbolos(analizador.getTablaSimbolos());
    response.setErrores(analizador.getErrores());

    // Imprimir la respuesta en la consola del backend
    System.out.println("Respuesta del backend:");
    System.out.println("Tokens: " + response.getTokens());
    System.out.println("Tabla de símbolos: " + response.getTablaSimbolos());
    System.out.println("Errores: " + response.getErrores());

    return response;
    }
}

class AnalizadorRequest {
    private String codigoFuente;

    public String getCodigoFuente() {
        return codigoFuente;
    }

    public void setCodigoFuente(String codigoFuente) {
        this.codigoFuente = codigoFuente;
    }
}

class AnalizadorResponse {
    private List<Token> tokens;
    private Map<String, Simbolo> tablaSimbolos;
    private List<String> errores;

    // Getters y Setters
    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Map<String, Simbolo> getTablaSimbolos() {
        return tablaSimbolos;
    }

    public void setTablaSimbolos(Map<String, Simbolo> tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setErrores(List<String> errores) {
        this.errores = errores;
    }
}

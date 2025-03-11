package com.compi.compi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundo {

    @GetMapping("/")
    public String holaMundo() {
        return "¡Hola, mundo!, probando probando";
    }
    
}

package com.compi.compi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.compi.compi"}) // Ajusta los paquetes según sea necesario
public class PauApplication {
    public static void main(String[] args) {
        SpringApplication.run(PauApplication.class, args);
    }
}
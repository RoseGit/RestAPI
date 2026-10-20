package com.rose.api.rose.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class TestController {

    // Endpoint GET básico: http://localhost:8080/api/saludo
    @GetMapping ("/api/saludo")
    public String saludar() {
        return "¡Hola! La API de Spring Boot está funcionando correctamente.";
    }

    // Endpoint GET con parámetros y respuesta en formato JSON (automático)
    // Ejemplo: http://localhost:8080/api/user?nombre=Rosalio
    @GetMapping("/api/user")
    public Map<String, Object> obtenerUsuario(@RequestParam (value = "nombre", defaultValue = "Invitado") String nombre) {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("status", "success");
        respuesta.put("mensaje", "Bienvenido, " + nombre);
        respuesta.put("id", 101);
        return respuesta;
    }
}
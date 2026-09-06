package com.cloud.versionamiento_api.controller;

import com.cloud.versionamiento_api.model.OperacionRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class OperacionController {

    @PostMapping("/sumar")
    public Map<String, Double> sumar(@Valid @RequestBody OperacionRequest operacion) {

        double resultado = operacion.getNumero1() + operacion.getNumero2();

        return Map.of(
                "resultado", resultado
        );
    }
}
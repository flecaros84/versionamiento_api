package com.cloud.versionamiento_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/status")
    public Map<String, String> obtenerEstado() {
        return Map.of(
                "status", "OK",
                "mensaje", "Microservicio funcionando correctamente",
                "version", "1.0.0"
        );
    }
}
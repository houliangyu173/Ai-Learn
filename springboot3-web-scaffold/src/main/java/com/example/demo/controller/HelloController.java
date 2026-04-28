package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", "UP");
        result.put("service", "springboot3-web-scaffold");
        result.put("timestamp", OffsetDateTime.now().toString());
        return result;
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> result = new LinkedHashMap<>();
        result.put("message", "Hello Spring Boot 3");
        result.put("version", "v1");
        return result;
    }
}

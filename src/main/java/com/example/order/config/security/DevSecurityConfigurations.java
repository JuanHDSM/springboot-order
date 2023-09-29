package com.example.order.config.security;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class DevSecurityConfigurations {
    public void addCorsMappings(CorsRegistry registry) {
        //liberando app cliente 1
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");

        //liberando app cliente 2
        registry.addMapping("/products/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}

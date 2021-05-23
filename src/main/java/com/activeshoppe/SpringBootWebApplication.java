package com.activeshoppe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.activeshoppe.services", "com.activeshoppe.entities", "com.activeshoppe.repositories", "com.activeshoppe.controller"})
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);  
    }
}

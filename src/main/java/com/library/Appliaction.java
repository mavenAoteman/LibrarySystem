package com.library;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 *
 */
@SpringBootApplication
@ImportResource("classpath:book-context.xml")
public class Appliaction {
    public static void main(String[] args) {
        SpringApplication.run(Appliaction.class, args);
    }
}

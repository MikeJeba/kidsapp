package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KidsAppBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(KidsAppBackendApplication.class, args);
        System.out.println("KidsApp Backend is running!");
    }
}

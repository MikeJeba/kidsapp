package org.example.mathgame.controller;

import org.example.mathgame.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseTestController {

    @Autowired
    private ScoreRepository yourRepository;

    @GetMapping("/test-connection")
    public String testConnection() {
        // Attempt to fetch something from the database
        if (yourRepository.count() > 0) {
            return "Connected to MySQL!";
        } else {
            return "No data found or not connected!";
        }
    }
}

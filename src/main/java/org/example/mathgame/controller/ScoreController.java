package org.example.mathgame.controller;

import org.example.mathgame.model.Score;
import org.example.mathgame.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8000")
@RestController
@RequestMapping("/api/scores")
public class ScoreController {

    @Autowired
    private ScoreRepository scoreRepository;

    @PostMapping
    public String saveScore(@RequestBody(required = false) Score score) {
        if (score == null || score.getUsername() == null || score.getScore() == 0) {
            return "Invalid request: missing username or score";
        }
        scoreRepository.save(score);
        return "Score saved successfully!";
    }

    @GetMapping
    public List<Score> getHighScores() {
        return scoreRepository.findAll();
    }


}


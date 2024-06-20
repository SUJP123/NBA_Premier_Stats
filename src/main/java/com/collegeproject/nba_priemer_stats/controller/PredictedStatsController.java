package com.collegeproject.nba_priemer_stats.controller;

import com.collegeproject.nba_priemer_stats.entity.PredictedStats;
import com.collegeproject.nba_priemer_stats.service.PredictedStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/predictions")
@CrossOrigin( origins = {"http://localhost:3000"}, methods = {RequestMethod.GET})
public class PredictedStatsController {
    @Autowired
    private PredictedStatsService predictedStatsService;

    @GetMapping("/ViewAll")
    public List<PredictedStats> getAllPlayerSummaries() {
        return predictedStatsService.getAllPlayerSummaries();
    }

    @GetMapping("/player")
    public PredictedStats getPredictionsByPlayerName(@RequestParam String playerName) {
        return predictedStatsService.getPredictionsByPlayerName(playerName);
    }
    //Add other methods
}

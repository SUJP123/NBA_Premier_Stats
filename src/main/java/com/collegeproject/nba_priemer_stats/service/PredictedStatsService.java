package com.collegeproject.nba_priemer_stats.service;

import com.collegeproject.nba_priemer_stats.entity.PredictedStats;
import com.collegeproject.nba_priemer_stats.repository.PredictedStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictedStatsService {
    @Autowired
    private PredictedStatsRepository playerSummaryRepository;

    public List<PredictedStats> getAllPlayerSummaries() {
        return playerSummaryRepository.findAll();
    }

    public PredictedStats getPredictionsByPlayerName(String playerName) {
        return playerSummaryRepository.findPredictedStatsByPlayerName(playerName);
    }

    //Add more service methods
}

package com.collegeproject.nba_priemer_stats.service;

import com.collegeproject.nba_priemer_stats.entity.PastStats;
import com.collegeproject.nba_priemer_stats.repository.PastStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PastStatsService {

    @Autowired
    private PastStatsRepository pastStatsRepository;

    public List<PastStats> getAllPlayerStats() {
        return pastStatsRepository.findAll();
    }

    public List<PastStats> getTopPts(String season, String seasonType) {
        return pastStatsRepository.findTopByPts(season, seasonType);
    }
    public List<PastStats> getTopAst(String season, String seasonType) {
        return pastStatsRepository.findTopByAst(season, seasonType);
    }

    public List<PastStats> getTopReb(String season, String seasonType) {
        return pastStatsRepository.findTopByReb(season, seasonType);
    }

    public List<PastStats> getTopStl(String season, String seasonType) {
        return pastStatsRepository.findTopByStl(season, seasonType);
    }

    public List<PastStats> getTopBlk(String season, String seasonType) {
        return pastStatsRepository.findTopByBlk(season, seasonType);
    }

    public List<PastStats> getTopFg3_Pct(String season, String seasonType) {
        return pastStatsRepository.findTopByFg3_Pct(season, seasonType);
    }

    public List<PastStats> getTopFg_Pct(String season, String seasonType) {
        return pastStatsRepository.findTopByFg_Pct(season, seasonType);
    }

    public List<PastStats> getTopFt_Pct(String season, String seasonType) {
        return pastStatsRepository.findTopByFt_Pct(season, seasonType);
    }

    public List<PastStats> getTopTov(String season, String seasonType) {
        return pastStatsRepository.findTopByTov(season, seasonType);
    }

    // Other service methods
}

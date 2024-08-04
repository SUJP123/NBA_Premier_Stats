package com.collegeproject.nba_priemer_stats.controller;

import com.collegeproject.nba_priemer_stats.entity.PastStats;
import com.collegeproject.nba_priemer_stats.service.PastStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historic")
@CrossOrigin( origins = {"https://nbapremierstats.vercel.app"}, methods = {RequestMethod.GET})
public class PastStatsController {
    @Autowired
    private PastStatsService pastStatsService;

    @GetMapping("/ViewAll")
    public List<PastStats> getAllPlayerStats() {
        return pastStatsService.getAllPlayerStats();
    }

    @GetMapping("/topPts")
    public List<PastStats> getTopPts(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopPts(season, seasonType);
    }

    @GetMapping("/topAst")
    public List<PastStats> getTopAst(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopAst(season, seasonType);
    }

    @GetMapping("/topReb")
    public List<PastStats> getTopReb(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopReb(season, seasonType);
    }

    @GetMapping("/topBlk")
    public List<PastStats> getTopBlk(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopBlk(season, seasonType);
    }

    @GetMapping("/topStl")
    public List<PastStats> getTopStl(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopStl(season, seasonType);
    }

    @GetMapping("/topFg3Pct")
    public List<PastStats> getTopFg3_Pct(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopFg3_Pct(season, seasonType);
    }

    @GetMapping("/topFgPct")
    public List<PastStats> getTopFg_Pct(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopFg_Pct(season, seasonType);
    }

    @GetMapping("/topFtPct")
    public List<PastStats> getTopFt_Pct(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopFt_Pct(season, seasonType);
    }

    @GetMapping("/topTov")
    public List<PastStats> getTopTov(@RequestParam String season, @RequestParam String seasonType) {
        return pastStatsService.getTopTov(season, seasonType);
    }

    //Add other methods
}

package com.collegeproject.nba_priemer_stats.repository;

import com.collegeproject.nba_priemer_stats.entity.PredictedStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PredictedStatsRepository extends JpaRepository<PredictedStats, Long>{

    @Query("SELECT p FROM PredictedStats p WHERE p.player = :playerName ORDER BY p.pts DESC")
    PredictedStats findPredictedStatsByPlayerName(@Param("playerName") String playerName);
}
package com.collegeproject.nba_priemer_stats.repository;

import com.collegeproject.nba_priemer_stats.entity.PastStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PastStatsRepository extends JpaRepository<PastStats, Long>{
    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.pts DESC")
    List<PastStats> findTopByPts(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.ast DESC")
    List<PastStats> findTopByAst(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.reb DESC")
    List<PastStats> findTopByReb(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.stl DESC")
    List<PastStats> findTopByStl(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.blk DESC")
    List<PastStats> findTopByBlk(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.fg3_Pct DESC")
    List<PastStats> findTopByFg3_Pct(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.fg_Pct DESC")
    List<PastStats> findTopByFg_Pct(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.ft_Pct DESC")
    List<PastStats> findTopByFt_Pct(@Param("season") String season, @Param("seasonType") String seasonType);

    @Query("SELECT p FROM PastStats p WHERE p.year = :season AND p.season_type = :seasonType ORDER BY p.tov DESC")
    List<PastStats> findTopByTov(@Param("season") String season, @Param("seasonType") String seasonType);
}

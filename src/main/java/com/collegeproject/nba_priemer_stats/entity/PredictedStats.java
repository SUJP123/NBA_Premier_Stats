package com.collegeproject.nba_priemer_stats.entity;

import jakarta.persistence.*;

@Entity
@Table(name="predictedstats")
public class PredictedStats {
    @Id
    @Column(name = "player")
    private String player;
    private Float pts;
    private Float ast;
    private Float reb;
    private Float stl;
    private Float blk;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Float getPts() {
        return pts;
    }

    public void setPts(Float pts) {
        this.pts = pts;
    }

    public Float getAst() {
        return ast;
    }

    public void setAst(Float ast) {
        this.ast = ast;
    }

    public Float getReb() {
        return reb;
    }

    public void setReb(Float reb) {
        this.reb = reb;
    }

    public Float getStl() {
        return stl;
    }

    public void setStl(Float stl) {
        this.stl = stl;
    }

    public Float getBlk() {
        return blk;
    }

    public void setBlk(Float blk) {
        this.blk = blk;
    }
}

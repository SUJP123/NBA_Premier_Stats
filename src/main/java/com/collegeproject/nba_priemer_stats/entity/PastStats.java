package com.collegeproject.nba_priemer_stats.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "paststats")
public class PastStats {

    @Id
    @Column(name = "player_Id")
    private Integer player_Id;

    private String year;
    private String season_type;
    private Integer rank;
    private String player;
    private Integer team_Id;
    private String team;
    private Integer gp;
    private Float min;
    private Float fgm;
    private Float fga;
    private Float fg_Pct;
    private Float fg3m;
    private Float fg3a;
    private Float fg3_Pct;
    private Float ftm;
    private Float fta;
    private Float ft_Pct;
    private Float oreb;
    private Float dreb;
    private Float reb;
    private Float ast;
    private Float stl;
    private Float blk;
    private Float tov;
    private Float pts;
    private Float eff;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSeasonType() {
        return season_type;
    }

    public void setSeasonType(String season_type) {
        this.season_type = season_type;
    }

    public Integer getPlayer_Id() {
        return player_Id;
    }

    public void setPlayer_Id(Integer player_Id) {
        this.player_Id = player_Id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getTeam_Id() {
        return team_Id;
    }

    public void setTeamId(Integer team_Id) {
        this.team_Id = team_Id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getFgm() {
        return fgm;
    }

    public void setFgm(Float fgm) {
        this.fgm = fgm;
    }

    public Float getFga() {
        return fga;
    }

    public void setFga(Float fga) {
        this.fga = fga;
    }

    public Float getFg_Pct() {
        return fg_Pct;
    }

    public void setFg_Pct(Float fg_Pct) {
        this.fg_Pct = fg_Pct;
    }

    public Float getFg3m() {
        return fg3m;
    }

    public void setFg3m(Float fg3m) {
        this.fg3m = fg3m;
    }

    public Float getFg3a() {
        return fg3a;
    }

    public void setFg3a(Float fg3a) {
        this.fg3a = fg3a;
    }

    public Float getFg3_Pct() {
        return fg3_Pct;
    }

    public void setFg3_Pct(Float fg3_Pct) {
        this.fg3_Pct = fg3_Pct;
    }

    public Float getFtm() {
        return ftm;
    }

    public void setFtm(Float ftm) {
        this.ftm = ftm;
    }

    public Float getFta() {
        return fta;
    }

    public void setFta(Float fta) {
        this.fta = fta;
    }

    public Float getFt_Pct() {
        return ft_Pct;
    }

    public void setFt_Pct(Float ft_Pct) {
        this.ft_Pct = ft_Pct;
    }

    public Float getOreb() {
        return oreb;
    }

    public void setOreb(Float oreb) {
        this.oreb = oreb;
    }

    public Float getDreb() {
        return dreb;
    }

    public void setDreb(Float dreb) {
        this.dreb = dreb;
    }

    public Float getReb() {
        return reb;
    }

    public void setReb(Float reb) {
        this.reb = reb;
    }

    public Float getAst() {
        return ast;
    }

    public void setAst(Float ast) {
        this.ast = ast;
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

    public Float getTov() {
        return tov;
    }

    public void setTov(Float tov) {
        this.tov = tov;
    }

    public Float getPts() {
        return pts;
    }

    public void setPts(Float pts) {
        this.pts = pts;
    }

    public Float getEff() {
        return eff;
    }

    public void setEff(Float eff) {
        this.eff = eff;
    }
}

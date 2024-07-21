package com.crickinfo.api.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crick_match")
public class Match {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int matchId;
    private String teamHeadin;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlingTeam;
    private String bowlingTeamScore;
    private String liveText;
    private String matchLink;
    private String textCompleted;
    private MatchesStatus Status;
    private Date date = new Date();
    // Create constructors, getters and setters here
    public Match(int matchId, String teamHeadin, String matchNumberVenue, String battingTeam, String battingTeamScore,
            String bowlingTeam, String bowlingTeamScore, String liveText, String matchLink, String textCompleted,
            MatchesStatus status) {
        this.matchId = matchId;
        this.teamHeadin = teamHeadin;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlingTeam = bowlingTeam;
        this.bowlingTeamScore = bowlingTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textCompleted = textCompleted;
        Status = status;
    }

    // Getters Setters start
    
    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public String getTeamHeadin() {
        return teamHeadin;
    }
    public void setTeamHeadin(String teamHeadin) {
        this.teamHeadin = teamHeadin;
    }
    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }
    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }
    public String getBattingTeam() {
        return battingTeam;
    }
    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }
    public String getBattingTeamScore() {
        return battingTeamScore;
    }
    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }
    public String getBowlingTeam() {
        return bowlingTeam;
    }
    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }
    public String getBowlingTeamScore() {
        return bowlingTeamScore;
    }
    public void setBowlingTeamScore(String bowlingTeamScore) {
        this.bowlingTeamScore = bowlingTeamScore;
    }
    public String getLiveText() {
        return liveText;
    }
    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }
    public String getMatchLink() {
        return matchLink;
    }
    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getTextCompleted() {
        return textCompleted;
    }
    public void setTextCompleted(String textCompleted) {
        this.textCompleted = textCompleted;
    }
    public MatchesStatus getStatus() {
        return Status;
    }
    // Getters Setters end
    
    public void setStatus(MatchesStatus status) {
        Status = status;
    }

    public Match() {
    }
    
    // set the match status according to the textCompleted
    public void setMatchStatus() {
        if (textCompleted.isBlank()) {
            this.Status = MatchesStatus.LIVE;
        } else {
            this.Status = MatchesStatus.COMPLETED;
        }
    }

}

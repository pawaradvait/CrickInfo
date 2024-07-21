package com.crickinfo.api.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crickinfo.api.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
    // Fetch match by teamHeading
    Optional<Match> findByTeamHeadin(String teamHeadin);
}

package com.crickinfo.api.services;

import java.util.List;
import com.crickinfo.api.entities.Match;

public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    // get live matches
    List<Match> getLiveMatches();
    // get cwc2023 point table
    List<List<String>> getCwc2023PointTable();
}

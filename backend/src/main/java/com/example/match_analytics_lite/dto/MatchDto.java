package com.example.match_analytics_lite.dto;

import lombok.Data;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class MatchDto {
    
    private Integer id;
    private LocalDateTime date;
    private String homeTeam;
    private String awayTeam;
    private Integer homeScore;
    private Integer awayScore;
}

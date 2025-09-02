package com.example.match_analytics_lite.model;
import lombok.*;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "matches")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private String homeTeam;

    @Column(nullable = false)
    private String awayTeam;

    @Column( nullable = false)
    private Integer homeScore;

    @Column( nullable = false)
    private Integer awayScore;

}

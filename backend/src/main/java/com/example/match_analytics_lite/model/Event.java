package com.example.match_analytics_lite.model;

import lombok.*;
import com.example.match_analytics_lite.converter.JsonNodeConverter;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.*;
@Builder
@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "match_id", nullable = false)
    private Integer matchId;

    @Column(name = "player_id", nullable = false)
    private Integer playerId;

    @Column(nullable = false)
    private Integer minute;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventType type;

    @Convert(converter = JsonNodeConverter.class)
    @Column(name = "meta", columnDefinition = "jsonb", nullable = false)
    private JsonNode meta;
}

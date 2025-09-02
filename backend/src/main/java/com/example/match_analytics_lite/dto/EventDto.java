package com.example.match_analytics_lite.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.example.match_analytics_lite.model.EventType;
import lombok.Data;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventDto {

    private Integer id;
    private Integer matchId;
    private Integer playerId;
    private Integer minute;
    private EventType type;
    private JsonNode meta;
}

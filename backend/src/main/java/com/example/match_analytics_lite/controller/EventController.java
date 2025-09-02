package com.example.match_analytics_lite.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.match_analytics_lite.repository.EventRepository;
import com.example.match_analytics_lite.dto.EventDto;
import com.example.match_analytics_lite.model.Event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "Event endpoints", description = "Endpoints for managing events")
public class EventController {
    
    private final EventRepository eventRepository;

    @Operation(summary = "Create new event", description = "Create a new event for a match")
    @PostMapping("/event")
    public  ResponseEntity<Event> getPlayerStats(
            @Parameter(description = "New Event") @Valid  @RequestBody EventDto newEvent) {

        Event toSave = Event.builder()
            .id(newEvent.getId())
            .matchId(newEvent.getMatchId())
            .playerId(newEvent.getPlayerId())
            .minute(newEvent.getMinute())
            .type(newEvent.getType())
            .meta(newEvent.getMeta())
            .build();

        return eventRepository.save(toSave) != null ? ResponseEntity.ok(toSave) : ResponseEntity.badRequest().build();
    }    
}


package com.example.match_analytics_lite.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import org.modelmapper.ModelMapper;

import com.example.match_analytics_lite.dto.MatchDto;
import com.example.match_analytics_lite.model.Match;
import com.example.match_analytics_lite.repository.MatchRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "Match endpoints", description = "Endpoints for managing matches")

public class MatchController {
    private final MatchRepository matchRepository;
    private final ModelMapper modelMapper;

    @Operation(summary = "Get match by ID", description = "Return a simple match by ID")
    @GetMapping("/match/{id}")
    public  ResponseEntity<MatchDto> getPlayerStats(
            @Parameter(description = "ID of the Match") @PathVariable Integer id) {

        Optional<Match> match = matchRepository.findById(id);

        if (match.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(modelMapper.map(match, MatchDto.class));
    }
}

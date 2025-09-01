package com.example.match_analytics_lite.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.example.match_analytics_lite.dto.PlayerDto;
import com.example.match_analytics_lite.model.Player;
import com.example.match_analytics_lite.repository.PlayerRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "Player endpoints", description = "Endpoints for managing players and their statistics")
public class PlayerController {
    
    private final PlayerRepository playerRepository;
    private final ModelMapper modelMapper;

    @Operation(summary = "Get player by ID", description = "Return a simple player by ID")
    @GetMapping("/player/{id}")
    public  ResponseEntity<PlayerDto> getPlayerStats(
            @Parameter(description = "ID of the player") @PathVariable Integer id) {

        Optional<Player> player = playerRepository.findById(id);

        if (player.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(modelMapper.map(player, PlayerDto.class));
    }
}


package com.example.match_analytics_lite.dto;

import com.example.match_analytics_lite.model.PositionType;

import lombok.Data;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class PlayerDto {
    private Integer id;
    private String name;
    private String team;
    private PositionType position;
}

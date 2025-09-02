package com.example.match_analytics_lite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.match_analytics_lite.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer>{
    
}

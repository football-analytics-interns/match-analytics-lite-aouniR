package com.example.match_analytics_lite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.match_analytics_lite.model.Player;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
    Optional<Player> findById(Integer id); 
}

package com.devSupeior.projetoJavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSupeior.projetoJavaSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

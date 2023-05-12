package com.devSupeior.projetoJavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSupeior.projetoJavaSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

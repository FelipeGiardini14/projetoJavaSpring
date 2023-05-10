package com.devSupeior.projetoJavaSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSupeior.projetoJavaSpring.dto.GameMinDTO;
import com.devSupeior.projetoJavaSpring.entities.Game;
import com.devSupeior.projetoJavaSpring.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}

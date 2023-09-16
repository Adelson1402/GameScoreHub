package com.GameScoreHub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.GameScoreHub.models.Game;
import com.GameScoreHub.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public void salvar(Game game) {
		gameRepository.save(game);
	}
	
	public Page<Game> findByPage(Pageable pageable){
		return gameRepository.findAll(pageable);
	}
}

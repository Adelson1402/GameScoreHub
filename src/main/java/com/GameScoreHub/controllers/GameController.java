package com.GameScoreHub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GameScoreHub.models.Game;
import com.GameScoreHub.services.GameService;

@RestController
@RequestMapping("/api")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@PostMapping("salvar")
	public void save(@RequestBody Game game) {
		gameService.salvar(game);
	}
	
	@GetMapping("find")
	public Page<Game> findAllByPages(@PageableDefault (sort="nome",
            direction = Sort.Direction.ASC,
            page = 0,
            size = 5) Pageable pageable){
		
		return gameService.findByPage(pageable);
	}

}

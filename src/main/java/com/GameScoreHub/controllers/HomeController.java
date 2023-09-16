package com.GameScoreHub.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	@GetMapping("welcome")
	public String welcome() {
		return "<h1> ONLINE </h1>"; 
	}
}

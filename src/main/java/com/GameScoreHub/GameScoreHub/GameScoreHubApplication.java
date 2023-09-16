package com.GameScoreHub.GameScoreHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration(exclude=SecurityAutoConfiguration.class)
@EntityScan(basePackages = "com.GameScoreHub")
@ComponentScan(basePackages = "com.GameScoreHub")
@EnableJpaRepositories( "com.GameScoreHub")
public class GameScoreHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameScoreHubApplication.class, args);
	}

}

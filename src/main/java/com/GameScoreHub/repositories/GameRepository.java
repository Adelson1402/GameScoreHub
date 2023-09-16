package com.GameScoreHub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.GameScoreHub.models.Game;

@Repository
public interface GameRepository extends PagingAndSortingRepository<Game, Double>, JpaRepository<Game, Double> {

}

package com.cesar.augusto.dsmovie.repository;

import com.cesar.augusto.dsmovie.entities.Score;
import com.cesar.augusto.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}

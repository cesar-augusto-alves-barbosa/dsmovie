package com.cesar.augusto.dsmovie.repository;

import com.cesar.augusto.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

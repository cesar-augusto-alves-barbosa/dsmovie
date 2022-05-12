package com.cesar.augusto.dsmovie.service;

import com.cesar.augusto.dsmovie.dto.MovieDTO;
import com.cesar.augusto.dsmovie.entities.Movie;
import com.cesar.augusto.dsmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> movies = repository.findAll(pageable);
        Page<MovieDTO> page = movies.map(movie -> new MovieDTO(movie));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie movie = repository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(movie);
        return movieDTO;
    }
}

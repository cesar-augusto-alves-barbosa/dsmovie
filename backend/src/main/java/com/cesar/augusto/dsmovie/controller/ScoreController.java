package com.cesar.augusto.dsmovie.controller;

import com.cesar.augusto.dsmovie.dto.MovieDTO;
import com.cesar.augusto.dsmovie.dto.ScoreDTO;
import com.cesar.augusto.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {
        MovieDTO movieDTO = service.saveScore(scoreDTO);
        return movieDTO;
    }
}

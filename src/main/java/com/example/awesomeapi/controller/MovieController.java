package com.example.awesomeapi.controller;

import com.example.awesomeapi.dao.BookDao;
import com.example.awesomeapi.dao.MovieDao;
import com.example.awesomeapi.dto.MovieDto;
import com.example.awesomeapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public <T> MovieDto<T> getBookById(@PathVariable("id") int id) {
        return movieService.getMovie(id);
    }

}

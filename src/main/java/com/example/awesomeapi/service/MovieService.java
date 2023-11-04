package com.example.awesomeapi.service;

import com.example.awesomeapi.client.MovieClient;
import com.example.awesomeapi.dao.MovieDao;
import com.example.awesomeapi.dao.MovieDaoV1;
import com.example.awesomeapi.dao.MovieDaoV2;
import com.example.awesomeapi.dto.ImmutableMovieV1Dto;
import com.example.awesomeapi.dto.MovieDto;
import com.example.awesomeapi.dto.MovieV1Dto;
import com.example.awesomeapi.dto.PostmanEchoRespond;
import com.example.awesomeapi.mapper.MovieV1Mapper;
import com.example.awesomeapi.mapper.MovieV2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MovieService {
    private final MovieClient movieClient;

    @Autowired
    public MovieService(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    public <T> MovieDto<T> getMovie(int id) {
        final HashMap param = new HashMap<String, String>();
        String version = "1.0.0";
        if (id % 2 == 1)  {
            param.put("id", id);
            param.put("name", "movie1");
        } else {
            param.put("id", id);
            param.put("name", "movie2");
            param.put("director", "director2");
            version = "1.0.1";
        }
        PostmanEchoRespond respond = this.movieClient.getMovie(param, version);
        System.out.println(respond.getHeaders());
        if (respond.getHeaders().get("version").equals("1.0.0")) {
            MovieDaoV1 movieDaoV1 = new MovieDaoV1(respond);
            return MovieV1Mapper.INSTANCE.movieDaoV1ToMovieDto(movieDaoV1);
        } else {
            MovieDaoV2 movieDaoV2 = new MovieDaoV2(respond);
            return MovieV2Mapper.INSTANCE.movieDaoV1ToMovieDto(movieDaoV2);
        }
    }

//    public <T> MovieDao<T> getMovieDao(Class<T> clazz) {
//        if (clazz == MovieDaoV1.class) {
//            var movie = new MovieDaoV1();
//            movie.setId("1");
//            movie.setName("movie1");
//            return (MovieDao<T>) movie;
//        } else if (clazz == MovieDaoV2.class) {
//            var movie = new MovieDaoV2();
//            movie.setId("2");
//            movie.setName("movie2");
//            movie.setDirector("director2");
//            return (MovieDao<T>) movie;
//        }
//        return null;
//    }

}

package com.example.awesomeapi.dao;

import com.example.awesomeapi.dto.PostmanEchoRespond;

public class MovieDaoV2 extends MovieDao {
    private String name = null;
    public MovieDaoV2(PostmanEchoRespond respond) {
        this.id = respond.getArgs().get("id");
        this.name = respond.getArgs().get("name");
        this.director = respond.getArgs().get("director");
    }
    private String director = null;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}

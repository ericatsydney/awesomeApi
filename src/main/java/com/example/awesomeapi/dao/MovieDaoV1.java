package com.example.awesomeapi.dao;

import com.example.awesomeapi.dto.PostmanEchoRespond;

public class MovieDaoV1 extends MovieDao {
    protected String name = null;

    public MovieDaoV1(PostmanEchoRespond respond) {
        this.id = respond.getArgs().get("id");
        this.name = respond.getArgs().get("name");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

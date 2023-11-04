package com.example.awesomeapi.dao;

public abstract class MovieDao<T> {
    protected String id = null;
    public String getId()  {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

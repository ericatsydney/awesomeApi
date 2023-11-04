package com.example.awesomeapi.dao;

public class BookDao {

    private Args args;

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    public static class Args {
        String name;
        String author;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
}

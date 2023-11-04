package com.example.awesomeapi.dto;

public class BookCreationRequestDto {
    String bookName;
    String author;

    public BookCreationRequestDto(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }}

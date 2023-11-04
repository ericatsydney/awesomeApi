package com.example.awesomeapi.controller;

import com.example.awesomeapi.dto.BookDto;
import com.example.awesomeapi.dto.BookCreationRequestDto;
import com.example.awesomeapi.dto.ImmutableBookDto;
import com.example.awesomeapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BookDto getBookById(@PathVariable("id") int id) {
        return bookService.getBook();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookDto createBook(@RequestBody BookCreationRequestDto bookDto) {
        return ImmutableBookDto.builder()
                .bookName(bookDto.getBookName())
                .author(bookDto.getAuthor())
                .build();
    }
}

package com.example.awesomeapi.service;

import com.example.awesomeapi.client.BookClient;
import com.example.awesomeapi.dto.BookDto;
import com.example.awesomeapi.mapper.BookMapper;
import com.example.awesomeapi.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookClient bookClient;

    @Autowired
    public BookService(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    public BookDto getBook() {
        final BookDao bookDao = this.bookClient.getBook();
        final BookDto bookDto = BookMapper.INSTANCE.bookToBookDto(bookDao);
        return bookDto;
    }

}

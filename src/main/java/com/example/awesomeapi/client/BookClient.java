package com.example.awesomeapi.client;

import com.example.awesomeapi.dao.BookDao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "book", url = "https://postman-echo.com")
public interface BookClient {
    @RequestMapping(method = RequestMethod.GET, value = "/get?name=connect&author=David_Linch", consumes = "application/json")
    BookDao getBook();
}

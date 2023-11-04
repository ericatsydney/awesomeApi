package com.example.awesomeapi.client;

import com.example.awesomeapi.dao.MovieDao;
import com.example.awesomeapi.dto.PostmanEchoRespond;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "movie", url = "https://postman-echo.com")
public interface MovieClient {
    @RequestMapping(method = RequestMethod.GET,
            value = "/get",
            consumes = "application/json")
    PostmanEchoRespond getMovie(@RequestParam Map<String, String> params, @RequestHeader String version);
}

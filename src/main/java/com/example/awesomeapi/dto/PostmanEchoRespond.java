package com.example.awesomeapi.dto;

import java.util.Map;

public class PostmanEchoRespond {
    private Map<String, String> args;

    private Map<String, String> headers;

    public Map<String, String> getArgs() {
        return args;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}

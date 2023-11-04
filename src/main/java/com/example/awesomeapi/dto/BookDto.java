package com.example.awesomeapi.dto;

import org.immutables.value.Value;

@Value.Immutable
public interface BookDto {
    String getBookName();
    String getAuthor();
}

package com.example.awesomeapi.dto;

import org.immutables.value.Value;

@Value.Immutable
public interface MovieV1Dto extends MovieDto {
    String getName();
}

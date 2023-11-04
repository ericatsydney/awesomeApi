package com.example.awesomeapi.dto;

import org.immutables.value.Value;

@Value.Immutable
public interface MovieV2Dto extends MovieDto {
    String getName();
    String getDirector();
}

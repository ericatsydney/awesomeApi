package com.example.awesomeapi.dto;

import org.immutables.value.Value;

@Value.Immutable
public interface MovieDto<T> {
    String getId();
}

package com.example.awesomeapi.mapper;


import com.example.awesomeapi.dao.BookDao;
import com.example.awesomeapi.dao.MovieDaoV1;
import com.example.awesomeapi.dto.BookDto;
import com.example.awesomeapi.dto.MovieV1Dto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MovieV1Mapper {

    MovieV1Mapper INSTANCE = Mappers.getMapper(MovieV1Mapper.class);

    MovieV1Dto movieDaoV1ToMovieDto(MovieDaoV1 movieDao);
    MovieDaoV1 movieV1DtoToMovieDao(MovieV1Dto movieDto);

}

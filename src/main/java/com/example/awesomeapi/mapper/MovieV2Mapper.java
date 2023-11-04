package com.example.awesomeapi.mapper;


import com.example.awesomeapi.dao.MovieDaoV2;
import com.example.awesomeapi.dto.MovieV2Dto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MovieV2Mapper {

    MovieV2Mapper INSTANCE = Mappers.getMapper(MovieV2Mapper.class);

    MovieV2Dto movieDaoV1ToMovieDto(MovieDaoV2 movieDao);
    MovieDaoV2 movieV1DtoToMovieDao(MovieV2Dto movieDto);

}

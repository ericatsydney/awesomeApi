package com.example.awesomeapi.mapper;


import com.example.awesomeapi.dao.BookDao;
import com.example.awesomeapi.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "args.name", target = "bookName")
    @Mapping(source = "args.author", target = "author")
    BookDto bookToBookDto(BookDao bookDao);
    BookDao bookDtoToBook(BookDto bookDto);

}

package com.mapper;

import com.mapStructPojos.BookDTO;
import com.entity.Book;
import com.mapStructPojos.BookDTO2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface SimpleMapper {
    BookDTO convertToDTO(Book source);

    @Mapping(target="identifier", source="book.id")
    @Mapping(target="bookName", source="book.name")
    BookDTO2 convertToDTO2(Book book);
}

package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.BookEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper implements Mapper<BookEntity, Book> {
    @Override
    public Book entityToDTO(BookEntity entity) {
        return null;
    }

    @Override
    public BookEntity DTOtoEntity(Book dto) {
        return null;
    }
}

package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.entity.BookEntity;
import com.h2sm.testtasksportsoft.service.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class BookService implements BaseService<BookEntity> {

    private BookService bookService;

    @Override
    public void create(BookEntity object) {
        bookService.create(object);
    }

    @Override
    public BookEntity read(BookEntity object) {
        bookService.read()
        return null;
    }

    @Override
    public BookEntity update(BookEntity object) {
        return null;
    }

    @Override
    public void delete(BookEntity object) {

    }

}

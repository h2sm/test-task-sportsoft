package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.BookEntity;
import com.h2sm.testtasksportsoft.mapper.impl.BookMapper;
import com.h2sm.testtasksportsoft.service.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class BookService implements BaseService<BookEntity> {

    private BookService bookService;
    private BookMapper bookMapper;

    @Override
    public void create(BookEntity object) {
        bookService.create(object);
    }

    @Override
    public BookEntity read(BookEntity object) {
        return bookService.read(object);
    }

    @Override
    public BookEntity update(BookEntity object) {
        return null;
    }

    @Override
    public void delete(BookEntity object) {

    }

    public Book getBookByNameContaining(String bookName) {

    }

    public List<Book> getBooksForThisUser() {

    }

    private Book mapBook(BookEntity bookEntity) {
        return bookMapper.entityToDTO(bookEntity);
    }

}

package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.BookEntity;
import com.h2sm.testtasksportsoft.mapper.impl.BookMapper;
import com.h2sm.testtasksportsoft.repository.BookRepository;
import com.h2sm.testtasksportsoft.service.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class BookService implements BaseService<Book> {

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public void create(Book book) {
        bookRepository.save(mapBook(book));
    }

    @Override
    public Book read(Book book) {
        var bookEntity = bookRepository.findById(book.getBookId()).get();
        return mapBook(bookEntity);
    }

    @Override
    public void update(Book book) {
        create(book);
    }

    @Override
    public void delete(Book object) {
        bookRepository.delete(mapBook(object));
    }

    public List<Book> getBookByNameContaining(String bookName) {
        return bookRepository.getAllByBookNameContaining(bookName)
                .stream()
                .map(bookMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    public List<Book> getBooksForThisUser(Long id) {
        return bookRepository.getAllByOwnerOfEntity_UserId(id)
                .stream()
                .map(bookMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    private Book mapBook(BookEntity bookEntity) {
        return bookMapper.entityToDTO(bookEntity);
    }

    private BookEntity mapBook(Book book) {
        return bookMapper.DTOtoEntity(book);
    }

}

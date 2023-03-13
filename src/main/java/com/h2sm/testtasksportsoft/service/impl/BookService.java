package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.Books;
import com.h2sm.testtasksportsoft.mapper.impl.BookMapper;
import com.h2sm.testtasksportsoft.repository.AuthorRepository;
import com.h2sm.testtasksportsoft.repository.BookRepository;
import com.h2sm.testtasksportsoft.repository.GenreRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class BookService {
    private final GenreRepository genreRepository;
    private final AuthorRepository repository;
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public void create(Book book) {
        bookRepository.save(mapBook(book));
    }

    public Book read(Book book) {
        var bookEntity = bookRepository.findById(book.getBookId()).get();

        return mapBook(bookEntity);
    }

    public Book getBookById(Long id){
        return mapBook(bookRepository.findById((long) 1).get());
    }

    public void update(Book book) {
        create(book);
    }

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

    private Book mapBook(Books books) {
        return bookMapper.entityToDTO(books);
    }

    private Books mapBook(Book book) {
        return bookMapper.DTOtoEntity(book);
    }

}

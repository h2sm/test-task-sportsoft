package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.Books;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class BookMapper implements Mapper<Books, Book> {
    private AuthorMapper authorMapper;
    private GenreMapper genreMapper;

    @Override
    public Book entityToDTO(Books entity) {
        var genres = entity.getListOfGenres().stream().map(genreMapper::entityToDTO).collect(Collectors.toList());
        var authors = entity.getListOfAuthors().stream().map(authorMapper::entityToDTO).collect(Collectors.toList());

        return Book.builder()
                .bookId(entity.getBookId())
                .bookName(entity.getBookName())
                .bookAuthors(authors)
                .bookGenres(genres)
                .bookDescription(entity.getBookDescription())
                .amountOfBooks(entity.getAmountOfBooks())
                .build();
    }

    @Override
    public Books DTOtoEntity(Book dto) {
        var genres = dto.getBookGenres().stream().map(genreMapper::DTOtoEntity).collect(Collectors.toList());
        var authors = dto.getBookAuthors().stream().map(authorMapper::DTOtoEntity).collect(Collectors.toList());
        return Books.builder()
                .bookId(dto.getBookId())
                .bookName(dto.getBookName())
                .listOfAuthors(authors)
                .listOfGenres(genres)
                .bookDescription(dto.getBookDescription())
                .amountOfBooks(dto.getAmountOfBooks())
                .build();
    }
}

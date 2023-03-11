package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.entity.BookEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class BookMapper implements Mapper<BookEntity, Book> {
    private AuthorMapper authorMapper;
    private GenreMapper genreMapper;

    @Override
    public Book entityToDTO(BookEntity entity) {
        var genres = entity.getBookGenre().stream().map(genreMapper::entityToDTO).collect(Collectors.toList());
        var authors = entity.getBookAuthors().stream().map(authorMapper::entityToDTO).collect(Collectors.toList());

        return Book.builder()
                .bookId(entity.getBookId())
                .bookName(entity.getBookName())
                .bookGenre(genres)
                .bookAuthors(authors)
                .bookDescription(entity.getBookDescription())
                .amountOfBooks(entity.getAmountOfBooks())
                .build();
    }

    @Override
    public BookEntity DTOtoEntity(Book dto) {
        var genres = dto.getBookGenre().stream().map(genreMapper::DTOtoEntity).collect(Collectors.toList());
        var authors = dto.getBookAuthors().stream().map(authorMapper::DTOtoEntity).collect(Collectors.toList());
        return BookEntity.builder()
                .bookId(dto.getBookId())
                .bookName(dto.getBookName())
                .bookGenre(genres)
                .bookAuthors(authors)
                .bookDescription(dto.getBookDescription())
                .amountOfBooks(dto.getAmountOfBooks())
                .build();
    }
}

package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BookEntity {
    private long bookId;
    private String bookName;
    private List<GenreEntity> bookGenre;
    private List<AuthorEntity> bookAuthors;
    private String bookDescription;
    private int amountOfBooks;
    private UserEntity ownerOfEntity;
    //large object
}

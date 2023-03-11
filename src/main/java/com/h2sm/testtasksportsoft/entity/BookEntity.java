package com.h2sm.testtasksportsoft.entity;

import java.util.List;

public class BookEntity {
    private long bookId;
    private String bookName;
    private List<GenreEntity> bookGenre;
    private List<AuthorEntity> bookAuthors;
    private String bookDescription;
    private int amountOfBooks;
    //large object
}

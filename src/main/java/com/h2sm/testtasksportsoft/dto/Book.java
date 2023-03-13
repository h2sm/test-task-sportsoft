package com.h2sm.testtasksportsoft.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Book {
    private long bookId;
    private String bookName;
    private List<Genre> bookGenres;
    private List<Author> bookAuthors;
    private String bookDescription;
    private int amountOfBooks;
}

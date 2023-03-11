package com.h2sm.testtasksportsoft.dto;

import com.h2sm.testtasksportsoft.entity.AuthorEntity;
import com.h2sm.testtasksportsoft.entity.GenreEntity;
import com.h2sm.testtasksportsoft.entity.UserEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Book {
    private long bookId;
    private String bookName;
    private List<String> bookGenre;
    private List<Author> bookAuthors;
    private String bookDescription;
    private int amountOfBooks;
}

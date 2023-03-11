package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@Entity
@Table(name = "books")
@NoArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long bookId;
    @Column(name = "book_name")
    private String bookName;
    @OneToMany
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinColumn(name = "book_genre")
    private List<GenreEntity> bookGenre;
    @OneToMany
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinColumn(name = "book_genre")
    private List<AuthorEntity> bookAuthors;
    @Column(name = "book_description")
    private String bookDescription;
    @Column(name = "amount_of_books")
    private int amountOfBooks;
    private UserEntity ownerOfEntity;
    //large object
}

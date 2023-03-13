package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Builder
@Data
@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.ALL
            })
    @JoinTable(name = "booksauthors",
            joinColumns = {@JoinColumn(name = "book_id"),
            }, inverseJoinColumns = @JoinColumn( name="author_id"))
    List<Authors> listOfAuthors;
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                    CascadeType.ALL
            })

    @JoinTable(name = "booksgenres",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = @JoinColumn( name="genre_id"))
    List<Genres> listOfGenres;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_description")
    private String bookDescription;
    @Column(name = "amount_of_books")
    private int amountOfBooks;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_of_entity", referencedColumnName = "user_id")
    private Users ownerOfEntity;
    @Column(name = "path_to_picture")
    private String pathToPicture;
}

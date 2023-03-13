package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
public class Books {
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

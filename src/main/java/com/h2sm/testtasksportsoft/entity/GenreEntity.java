package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "genres")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private long genreId;
    @Column(name = "genre_name")
    private String genreName;
    @Column(name = "owner")
    private UserEntity ownerOfEntity;
}

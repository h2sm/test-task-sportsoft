package com.h2sm.testtasksportsoft.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class GenreEntity {
    private long genreId;
    private String genreName;
    private UserEntity ownerOfEntity;
}

package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table
public class GenreEntity {
    private long genreId;
    private String genreName;
    private UserEntity ownerOfEntity;
}

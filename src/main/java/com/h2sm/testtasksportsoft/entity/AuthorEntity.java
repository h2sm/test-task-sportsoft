package com.h2sm.testtasksportsoft.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AuthorEntity {
    private long authorId;
    private String authorFullName;
    private String authorDescription;
    private UserEntity ownerOfEntity;
    //largeObject;
}

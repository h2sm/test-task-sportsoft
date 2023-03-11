package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.entity.AuthorEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper implements Mapper<AuthorEntity, Author> {
    @Override
    public Author entityToDTO(AuthorEntity entity) {
        return Author.builder()
                .authorId(entity.getAuthorId())
                .authorFullName(entity.getAuthorFullName())
                .authorDescription(entity.getAuthorDescription())
                .build();
    }

    @Override
    public AuthorEntity DTOtoEntity(Author dto) {
        return AuthorEntity.builder()
                .authorId(dto.getAuthorId())
                .authorFullName(dto.getAuthorFullName())
                .authorDescription(dto.getAuthorDescription())
                .build();
    }
}

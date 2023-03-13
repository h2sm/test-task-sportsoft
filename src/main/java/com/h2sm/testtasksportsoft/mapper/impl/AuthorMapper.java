package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.entity.Authors;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper implements Mapper<Authors, Author> {
    @Override
    public Author entityToDTO(Authors entity) {
        return Author.builder()
                .authorId(entity.getAuthorId())
                .authorFullName(entity.getAuthorFullName())
                .authorDescription(entity.getAuthorDescription())
                .build();
    }

    @Override
    public Authors DTOtoEntity(Author dto) {
        return Authors.builder()
                .authorId(dto.getAuthorId())
                .authorFullName(dto.getAuthorFullName())
                .authorDescription(dto.getAuthorDescription())
                .build();
    }
}

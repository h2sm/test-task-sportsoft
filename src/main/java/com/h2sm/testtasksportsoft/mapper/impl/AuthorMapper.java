package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.entity.Authors;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.io.File;

@Component
public class AuthorMapper implements Mapper<Authors, Author> {

    @Override
    @SneakyThrows
    public Author entityToDTO(Authors entity) {
        return Author.builder()
                .image(ImageIO.read(new File(entity.getPathToPicture())))
                .authorId(entity.getAuthorId())
                .authorFullName(entity.getAuthorFullName())
                .pathToPicture(entity.getPathToPicture())
                .authorDescription(entity.getAuthorDescription())
                .build();
    }

    @Override
    public Authors DTOtoEntity(Author dto) {
        return Authors.builder()
                .pathToPicture(dto.getPathToPicture())
                .authorId(dto.getAuthorId())
                .authorFullName(dto.getAuthorFullName())
                .authorDescription(dto.getAuthorDescription())
                .build();
    }
}

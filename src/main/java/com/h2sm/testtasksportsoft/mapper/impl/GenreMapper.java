package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Genre;
import com.h2sm.testtasksportsoft.entity.GenreEntity;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper implements Mapper<GenreEntity, Genre> {
    @Override
    public Genre entityToDTO(GenreEntity entity) {
        return Genre.builder()
                .genreId(entity.getGenreId())
                .genre(entity.getGenreName())
                .build();
    }

    @Override
    public GenreEntity DTOtoEntity(Genre dto) {
        return GenreEntity.builder()
                .genreId(dto.getGenreId())
                .genreName(dto.getGenre())
                .build();
    }
}

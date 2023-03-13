package com.h2sm.testtasksportsoft.mapper.impl;

import com.h2sm.testtasksportsoft.dto.Genre;
import com.h2sm.testtasksportsoft.entity.Genres;
import com.h2sm.testtasksportsoft.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper implements Mapper<Genres, Genre> {
    @Override
    public Genre entityToDTO(Genres entity) {
        return Genre.builder()
                .genreId(entity.getGenreId())
                .genre(entity.getGenreName())
                .build();
    }

    @Override
    public Genres DTOtoEntity(Genre dto) {
        return Genres.builder()
                .genreId(dto.getGenreId())
                .genreName(dto.getGenre())
                .build();
    }
}

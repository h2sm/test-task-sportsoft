package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Genre;
import com.h2sm.testtasksportsoft.mapper.impl.GenreMapper;
import com.h2sm.testtasksportsoft.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class GenreService {
    private GenreRepository genreRepository;
    private GenreMapper genreMapper;


    public void create(Genre genre){
        genreRepository.save(genreMapper.DTOtoEntity(genre));
    }

    public Genre read(Long id) {
        return genreMapper.entityToDTO(genreRepository.findById(id).get());
    }

    public void update(Genre genre){
        create(genre);
    }

    public void delete (Long id) {
        genreRepository.delete(genreRepository.findById(id).get());
    }

    public List<Genre> getAllGenres(){
        return genreRepository.findAll().stream().map(genreMapper::entityToDTO).collect(Collectors.toList());
    }
}

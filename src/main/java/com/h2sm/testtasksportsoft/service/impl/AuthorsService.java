package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.mapper.impl.AuthorMapper;
import com.h2sm.testtasksportsoft.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class AuthorsService {
    private AuthorRepository authorRepository;
    private AuthorMapper authorMapper;

    public void create(Author author) {
        authorRepository.save(authorMapper.DTOtoEntity(author));
    }

    public Author read(Long id) {
        return authorMapper.entityToDTO(authorRepository.findById(id).get());
    }

    public void update(Author author) {
        create(author);
    }

    public void delete(Long id) {
        authorRepository.delete(authorRepository.findById(id).get());
    }


}

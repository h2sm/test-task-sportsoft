package com.h2sm.testtasksportsoft.service.impl;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.mapper.impl.AuthorMapper;
import com.h2sm.testtasksportsoft.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class AuthorsService {
    private AuthorRepository authorRepository;
    private AuthorMapper authorMapper;

    public void create(Author author) {
        saveImage(author.getImage(), author.getPathToPicture());
        authorRepository.save(authorMapper.DTOtoEntity(author));
    }

    public Author read(Long id) {
        return authorMapper.entityToDTO(authorRepository.findById(id).get());
    }

    public void update(Author author) {
        create(author);
    }

    public void delete(Long id) {
        var author = authorRepository.findById(id).get();
        deleteImage(author.getPathToPicture());
        authorRepository.delete(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll().stream().map(authorMapper::entityToDTO).collect(Collectors.toList());
    }

    @SneakyThrows
    public BufferedImage loadPicture(String pathToPicture) {
        return ImageIO.read(new File(pathToPicture));
    }

    @SneakyThrows
    public void saveImage(BufferedImage bufferedImage, String path) {
        ImageIO.write(bufferedImage, ".png", new File(path));
    }

    private void deleteImage(String path) {
        new File(path).delete();
    }


}

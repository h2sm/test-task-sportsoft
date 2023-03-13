package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.service.impl.AuthorsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
@AllArgsConstructor
public class AuthorController {
    private AuthorsService authorsService;

    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorsService.getAllAuthors();
    }

    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorsService.read(id);
    }

    @PatchMapping("/authors")
    public void updateAuthor(@RequestBody Author author){
        authorsService.update(author);
    }

    @DeleteMapping("/authors/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorsService.delete(id);
    }

    public void saveAuthor(@RequestBody Author author){
        authorsService.create(author);
    }
}

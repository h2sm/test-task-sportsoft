package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Author;
import com.h2sm.testtasksportsoft.service.impl.AuthorsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/authors")
@AllArgsConstructor
public class AuthorController {
    private AuthorsService authorsService;

    @GetMapping()
    public List<Author> getAllAuthors(){
        return authorsService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorsService.read(id);
    }

    @PatchMapping()
    public void updateAuthor(@RequestBody Author author){
        authorsService.update(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorsService.delete(id);
    }

    @PostMapping()
    public void saveAuthor(@RequestBody Author author){
        authorsService.create(author);
    }
}

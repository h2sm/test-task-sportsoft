package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Genre;
import com.h2sm.testtasksportsoft.service.impl.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
@AllArgsConstructor
public class GenreController {
    private GenreService genreService;

    @GetMapping("/genres")
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();
    }

    @GetMapping("/genres/{id}")
    public Genre getGenreById(@PathVariable Long id){
        return genreService.read(id);
    }

    @PatchMapping("/genres/")
    public void updateGenre(@RequestBody Genre genre){
        genreService.update(genre);
    }

    @DeleteMapping("/genres/{id}")
    public void deleteGenre(@PathVariable Long id){
        genreService.delete(id);
    }

    @PostMapping("/genres")
    public void addGenre(@RequestBody Genre genre){
        genreService.create(genre);
    }

}

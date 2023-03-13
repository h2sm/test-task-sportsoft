package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Genre;
import com.h2sm.testtasksportsoft.service.impl.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/genres")
@AllArgsConstructor
public class GenreController {
    private GenreService genreService;

    @GetMapping()
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable Long id){
        return genreService.read(id);
    }

    @PatchMapping()
    public void updateGenre(@RequestBody Genre genre){
        genreService.update(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable Long id){
        genreService.delete(id);
    }

    @PostMapping()
    public void addGenre(@RequestBody Genre genre){
        genreService.create(genre);
    }

}

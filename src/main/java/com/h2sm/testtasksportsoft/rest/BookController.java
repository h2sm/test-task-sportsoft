package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.service.impl.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/books")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @GetMapping()
    public List<Book> getAllBooks(){
        return bookService.getBooksForThisUser((long) 1);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PatchMapping()
    public void updateBook(@RequestBody Book book){
        bookService.update(book);
    }

    @PostMapping()
    public void saveBook(@RequestBody Book book){
        bookService.create(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.delete(id);
    }

}

package com.h2sm.testtasksportsoft.rest;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.service.impl.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getBooksForThisUser((long) 1);
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PatchMapping("/books/")
    public void updateBook(@RequestBody Book book){
        bookService.update(book);
    }

}

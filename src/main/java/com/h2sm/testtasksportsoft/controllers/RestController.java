package com.h2sm.testtasksportsoft.controllers;

import com.h2sm.testtasksportsoft.dto.Book;
import com.h2sm.testtasksportsoft.service.impl.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
@RequestMapping("/api/")

public class RestController {
    private BookService bookService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Book returnData(@RequestParam Long id){
        return bookService.getBookById(id);
    }
}

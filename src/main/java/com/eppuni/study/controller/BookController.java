package com.eppuni.study.controller;

import com.eppuni.study.dto.Book;
import com.eppuni.study.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }
    @GetMapping(value = "/list")
    public ResponseEntity<Object> getBook() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}

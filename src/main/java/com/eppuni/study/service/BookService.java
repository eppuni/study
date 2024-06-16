package com.eppuni.study.service;

import com.eppuni.study.dto.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static List<Book> bookList = new ArrayList<>();


    public Book createBook(Book book) {



        bookList.add(book);
        return book;
    }

    public List<Book> getAllBooks() {
        return bookList;
    }

}

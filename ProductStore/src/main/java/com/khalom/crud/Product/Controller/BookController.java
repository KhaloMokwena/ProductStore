package com.khalom.crud.Product.Controller;

import com.khalom.crud.Product.Book;
import com.khalom.crud.Product.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        Book savedBook = bookRepository.save(book);
        return savedBook;
    }

}

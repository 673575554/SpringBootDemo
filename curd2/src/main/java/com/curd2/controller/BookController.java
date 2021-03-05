package com.curd2.controller;

import com.curd2.entity.Book;
import com.curd2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/updateBook")
    public boolean updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/deleteBookById/{id}")
    public boolean deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }

    @GetMapping("/getBook")
    public List<Book> getBook(){
        return bookService.getBook();
    }

}

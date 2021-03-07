package com.curd2.service;

import com.curd2.entity.Book;
import com.curd2.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public boolean addBook(Book book){
        return bookMapper.addBook(book);
    }

    public boolean deleteBookById(long id){
        return bookMapper.deleteBookById(id);
    }

    public boolean updateBook(Book book){
        return bookMapper.updateBook(book);
    }

    public List<Book> getBook(){
        return bookMapper.getBook();
    }

}

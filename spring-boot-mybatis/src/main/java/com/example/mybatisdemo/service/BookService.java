package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Book;
import com.example.mybatisdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Author: xp
 * @Date: 2019/7/30 19:14
 * @Version: 1.0.0
 * @Description:
 */

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}

package com.example.jdbctemplate.controller;

import com.example.jdbctemplate.entity.Book;
import com.example.jdbctemplate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xp
 * @Date: 2019/7/31 15:03
 * @Version: 1.0.0
 * @Description:
 */

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/addBook")
    public int addBook() {
        Book b1 = new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        return bookService.addBook(b1);
    }

    @GetMapping("/updateBook")
    public int updateBook() {
        Book b2 = new Book();
        b2.setId(6);
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅");
        return bookService.updateBook(b2);
    }

    @GetMapping("/deleteBookById/{id}")
    public int deleteBookById(@PathVariable int id) {
        return bookService.deleteBookById(id);
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

}

package com.example.jpa.controller;

import com.example.jpa.entity.Book;
import com.example.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xp
 * @Date: 2019/7/31 16:26
 * @Version: 1.0.0
 * @Description:
 */

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/findAll")
    public String findAll() {
        PageRequest pageable = PageRequest.of(2, 3);
        Page<Book> page = bookService.getBookByPage(pageable);
        String res = "总页数：" + page.getTotalPages() + "查询结果：" + page.getContent();
        return res;
    }

    @GetMapping("/search")
    public String search() {
        List<Book> bs1 = bookService.getBookByIdAndAuthor("鲁迅", 7);
        return "bs1:" + bs1;
    }


    @GetMapping("/save")
    public Book save() {
        Book book = new Book();
        book.setAuthor("鲁迅");
        book.setName("呐喊");
        book.setPrice(23F);
        bookService.addBook(book);
        return book;
    }
}

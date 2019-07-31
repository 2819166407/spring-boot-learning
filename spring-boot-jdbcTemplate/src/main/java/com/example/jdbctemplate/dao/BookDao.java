package com.example.jdbctemplate.dao;

import com.example.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xp
 * @Date: 2019/7/31 14:57
 * @Version: 1.0.0
 * @Description:
 */

@Repository
public class BookDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //增
    public int addBook(Book book) {
        return jdbcTemplate.update("INSERT INTO book(name,author) VALUES (?,?)", book.getName(), book.getAuthor());
    }

    //改
    public int updateBook(Book book) {
        return jdbcTemplate.update("UPDATE book SET name=?,author=? WHERE id=?", book.getName(), book.getAuthor(), book.getId());
    }

    //删
    public int deleteBookById(Integer id) {
        return jdbcTemplate.update("DELETE FROM book WHERE id=?", id);
    }

    //单查
    public Book getBookById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM book WHERE id=?", new BeanPropertyRowMapper<>(Book.class), id);
    }

    //全查 BeanPropertyRowMapper将查询出来的列和实体类属性一一对应（注意：实体类属性和表字段命名必须相同；bookName -> book_name）
    public List<Book> getAllBooks() {
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

}

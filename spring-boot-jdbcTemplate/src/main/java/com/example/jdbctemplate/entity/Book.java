package com.example.jdbctemplate.entity;

/**
 * @Author: xp
 * @Date: 2019/7/31 14:55
 * @Version: 1.0.0
 * @Description:
 */

public class Book {
    private Integer id;
    private String name;
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

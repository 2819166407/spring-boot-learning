package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xp
 * @Date: 2019/8/1 11:26
 * @Version: 1.0.0
 * @Description:
 */

@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello page";
    }
}

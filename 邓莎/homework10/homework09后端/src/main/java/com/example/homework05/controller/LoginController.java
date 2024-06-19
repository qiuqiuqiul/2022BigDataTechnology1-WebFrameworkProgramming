package com.example.homework05.controller;

import com.example.homework05.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public Result login(){
        return Result.error("尚未登录，请登录！");
    }
}


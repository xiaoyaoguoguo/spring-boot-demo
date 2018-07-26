package com.panda.springbootdemo.controller;

import com.panda.springbootdemo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jamie
 * @ClassName: UserController
 * @Description: 用户模块
 * @data 2018-07-26 12:25
 **/
@RestController
public class UserController {
    @GetMapping("/index")
    public String hello(){
        return "hello";
    }

//    public User getUser(){
//        return
//    }
}

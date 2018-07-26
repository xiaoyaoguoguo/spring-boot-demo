package com.panda.springbootdemo.controller;

import com.panda.springbootdemo.domain.User;
import com.panda.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jamie
 * @ClassName: UserController
 * @Description: 用户模块
 * @data 2018-07-26 12:25
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/getUsers")
    public List<User> getUser(){
        return userService.getUsers();
    }
}

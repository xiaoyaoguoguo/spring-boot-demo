package com.panda.springbootdemo.service.impl;

import com.panda.springbootdemo.domain.User;
import com.panda.springbootdemo.mapper.UserMapper;
import com.panda.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jamie
 * @ClassName:UserServiceImpl
 * @Description:
 * @data 2018-07-26 17:34
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectAll();
    }
}

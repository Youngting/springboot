package com.cs.controller;

import com.cs.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/27
 * e-mail : clemeting@qq.com
 */
@RestController
public class UserController {
    @Autowired
    User user;

    @RequestMapping("hello")
    public User getUser(){
        return user;
    }
}

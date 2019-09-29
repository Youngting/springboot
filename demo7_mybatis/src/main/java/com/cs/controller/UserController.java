package com.cs.controller;

import com.cs.bean.User;
import com.cs.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    UseService useService;

    @RequestMapping(value = "user")
    public User queryUser(int id){
        return useService.queryUserById(id);
    }
}

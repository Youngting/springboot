package com.cs.springboot.demo1.controller;

import com.cs.springboot.demo1.bean.User;
import com.cs.springboot.demo1.config.MyFileConfig;
import com.cs.springboot.demo1.service.FileService;
import com.cs.springboot.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/26
 * e-mail : clemeting@qq.com
 */
@RestController
public class UserController {
    @Value("${demo1.key}")
    String param;
    @Autowired
    UserService userService;

    @Autowired
    FileService fileService;
    @RequestMapping("hello")
    public String hello(){
        User user = userService.queryUserById(3);
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("user")
    public String user(){
        System.out.println("param=" + param);
        fileService.parseFile();
        return "hello user";
    }
}

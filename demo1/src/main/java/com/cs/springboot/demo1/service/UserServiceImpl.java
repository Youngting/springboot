package com.cs.springboot.demo1.service;

import com.cs.springboot.demo1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/26
 * e-mail : clemeting@qq.com
 */
@Service
public class UserServiceImpl implements UserService {
    /*@Autowired
    UserMapper userMapper;*/

    @Override
    public User queryUserById(int id) {

        return null;
    }
}

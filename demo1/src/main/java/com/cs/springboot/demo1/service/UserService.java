package com.cs.springboot.demo1.service;

import com.cs.springboot.demo1.bean.User;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/26
 * e-mail : clemeting@qq.com
 */
public interface UserService {
    User queryUserById(int id);
}

package com.cs.service;

import com.cs.bean.User;
import com.cs.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/27
 * e-mail : clemeting@qq.com
 */
@Service
public class UserServiceImpl implements UseService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserById(int id) {
        logger.debug("自己写的日志");
        return userMapper.selectUserById(id);
    }
}

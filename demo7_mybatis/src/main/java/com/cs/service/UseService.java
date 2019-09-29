package com.cs.service;

import com.cs.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/27
 * e-mail : clemeting@qq.com
 */

public interface UseService {
    User queryUserById(int id);
}

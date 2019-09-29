package com.cs.ee;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/27
 * e-mail : clemeting@qq.com
 */
@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

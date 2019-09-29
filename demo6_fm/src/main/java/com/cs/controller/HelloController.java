package com.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author : Nianjie Jing
 * creat time : 2019/9/27
 * e-mail : clemeting@qq.com
 */
@Controller
public class HelloController {

    @RequestMapping("/freemarker")
    public String freemarker(Model model){
        model.addAttribute("text","hello boot freemarker");
        return "hello";
    }
}

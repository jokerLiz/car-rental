package com.yeqifu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 首页控制器 : index.jsp
     * @return
     */
    @RequestMapping("/")
    public String toLogin(){
        System.out.println("index");
        return "system/main/index";
    }
}

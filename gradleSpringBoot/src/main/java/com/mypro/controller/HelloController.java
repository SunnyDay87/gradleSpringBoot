package com.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    private  String hello(Model model){
        model.addAttribute("message","来自服务器的数据！");
        return "resultPage";
    }
}

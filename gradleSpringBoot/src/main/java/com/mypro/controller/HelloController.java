package com.mypro.controller;

import com.mypro.bean.User;
import com.mypro.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/")
    private  String hello(Model model){
        model.addAttribute("message","来自服务器的数据！");
        return "resultPage";
    }

    @GetMapping("/{user_id}")
    public String findById(Model model, @PathVariable(value = "user_id") int user_id){
        User u = userDao.findById(user_id);
        model.addAttribute("name",u.getUser_name());
        return "home";
    }
}

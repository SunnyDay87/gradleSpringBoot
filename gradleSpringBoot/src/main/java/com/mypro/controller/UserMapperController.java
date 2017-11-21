package com.mypro.controller;

import com.mypro.bean.User;
import com.mypro.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserMapperController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<User> users=userMapper.getAll();
        model.addAttribute("user",users.toString());
        return "user";
    }

    @RequestMapping("/getUser/{user_id}")
    public String getUser(Model model,@PathVariable(value = "user_id") String user_id){
        System.out.println("--------getUser----------");
        User user=userMapper.getUser(user_id);
        model.addAttribute("user",user.getUser_name()+"---"+user.getUser_id());
        return "user";
    }
}

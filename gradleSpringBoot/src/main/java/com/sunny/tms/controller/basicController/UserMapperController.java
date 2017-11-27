package com.sunny.tms.controller.basicController;


import com.sunny.tms.entity.basicEntity.User;
import com.sunny.tms.mapper.basicMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserMapperController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<User> users=userMapper.getAllUsers();
        model.addAttribute("user",users.toString());
        return "user";
    }

}

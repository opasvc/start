package com.start.start.controller;

import com.start.start.mapper.UserMapper;
import com.start.start.pojo.User;
import com.start.start.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("student")
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute("list", userMapper.userList());
        return "show";
    }

    @RequestMapping("/home")
    public String goHome(Model model) {
        model.addAttribute("list", userMapper.userList());
        return "user/home";
        //hello
    }


}

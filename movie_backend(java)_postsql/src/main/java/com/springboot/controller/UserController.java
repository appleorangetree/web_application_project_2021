package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.User;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public String add(User user) throws Exception {
        userService.create(user);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(User user) throws Exception {
        userService.delete(user);
        return "success !";
    }

    @PostMapping("/update")
    public String update(User user) throws Exception {
        userService.update(user);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(User user) throws Exception {
        User userdetail = (User) userService.search(user);
        return "success !";
    }


}

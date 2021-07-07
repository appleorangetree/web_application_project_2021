package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Role;
import com.springboot.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @PostMapping("/add")
    public String add(Role role) throws Exception {
        roleService.create(role);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(Role role) throws Exception {
        roleService.delete(role);
        return "success !";
    }

    @PostMapping("/update")
    public String update(Role role) throws Exception {
        roleService.update(role);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(Role role) throws Exception {
        Role roledetail = (Role) roleService.search(role);
        return "success !";
    }


}

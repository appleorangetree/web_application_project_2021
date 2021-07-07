package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Contact;
import com.springboot.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Resource
    private ContactService contactService;

    @PostMapping("/add")
    public String add(Contact contact) throws Exception {
        contactService.create(contact);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(Contact contact) throws Exception {
        contactService.delete(contact);
        return "success !";
    }

    @PostMapping("/update")
    public String update(Contact contact) throws Exception {
        contactService.update(contact);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(Contact contact) throws Exception {
        Contact contactdetail = (Contact) contactService.search(contact);
        return "success !";
    }


}

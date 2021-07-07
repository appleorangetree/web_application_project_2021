package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Address;
import com.springboot.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService;

    @PostMapping("/add")
    public String add(Address address) throws Exception {
        addressService.create(address);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(Address address) throws Exception {
        addressService.delete(address);
        return "success !";
    }

    @PostMapping("/update")
    public String update(Address address) throws Exception {
        addressService.update(address);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(Address address) throws Exception {
        Address addressdetail = (Address) addressService.search(address);
        return "success !";
    }


}

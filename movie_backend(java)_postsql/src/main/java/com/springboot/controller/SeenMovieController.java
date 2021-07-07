package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.SeenMovie;
import com.springboot.service.SeenMovieService;

@RestController
@RequestMapping("/seenmovie")
public class SeenMovieController {
    @Resource
    private SeenMovieService seenmovieService;

    @PostMapping("/add")
    public String add(SeenMovie seenmovie) throws Exception {
        seenmovieService.create(seenmovie);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(SeenMovie seenmovie) throws Exception {
        seenmovieService.delete(seenmovie);
        return "success !";
    }

    @PostMapping("/update")
    public String update(SeenMovie seenmovie) throws Exception {
        seenmovieService.update(seenmovie);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(SeenMovie seenmovie) throws Exception {
        SeenMovie seenmoviedetail = (SeenMovie) seenmovieService.search(seenmovie);
        return "success !";
    }


}

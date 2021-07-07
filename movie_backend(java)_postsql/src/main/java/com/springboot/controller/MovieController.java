package com.springboot.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Movie;
import com.springboot.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Resource
    private MovieService movieService;

    @PostMapping("/add")
    public String add(Movie movie) throws Exception {
        movieService.create(movie);
        return "success !";
    }

    @PostMapping("/delete")
    public String delete(Movie movie) throws Exception {
        movieService.delete(movie);
        return "success !";
    }

    @PostMapping("/update")
    public String update(Movie movie) throws Exception {
        movieService.update(movie);
        return "success !";
    }

    @PostMapping("/detail")
    public String detail(Movie movie) throws Exception {
        Movie moviedetail = (Movie) movieService.search(movie);
        return "success !";
    }


}

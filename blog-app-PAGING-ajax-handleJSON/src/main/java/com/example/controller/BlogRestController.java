package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BlogRestController {
    @Autowired
    IBlogService blogService;
    @GetMapping("findById/{id}")
    public Blog findById(@PathVariable Long id){
        Optional<Blog> blog = blogService.findById(id);
        return blog.get();
    }
}

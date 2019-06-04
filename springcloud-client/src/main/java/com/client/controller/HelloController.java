package com.client.controller;

import com.client.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    public ProductFeign productFeign;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return productFeign.hello(name);
    }

    @GetMapping("/foo")
    public String foo(String name) {
        return "hello "+name+"!";
    }

}
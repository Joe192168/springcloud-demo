package com.client.controller;

import com.client.dao.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    public IHello iHello;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return iHello.hello(name);
    }

    @GetMapping("/foo")
    public String foo(String name) {
        return "hello "+name+"!";
    }

}
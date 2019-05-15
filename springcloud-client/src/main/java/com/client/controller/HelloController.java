package com.client.controller;

import com.client.dao.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public IHello iHello;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return iHello.hello(name);
    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }

}
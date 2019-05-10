package com.client.controller;

import com.client.dao.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloudeurekademo
 * @description:
 * @author: 肖乔辉
 * @create: 2019-05-08 15:29
 * @version: 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    public IHello iHello;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return iHello.hello(name);
    }

}
package com.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description:
 * @author: 肖乔辉
 * @create: 2019-05-10 18:08
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/fallback")
public class FallBack {
    @RequestMapping("")
    public String fallback(){
        return "error";
    }

}
package com.client.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springcloudeurekademo
 * @description:
 * @author: 肖乔辉
 * @create: 2019-05-08 15:11
 * @version: 1.0.0
 */
@FeignClient(name="springcloud-serve")
public interface IHello {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
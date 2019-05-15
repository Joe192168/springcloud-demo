package com.client.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="springcloudserve")
public interface IHello {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
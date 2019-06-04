package com.xiaoqi.controller;

import com.xiaoqi.bean.Order;
import com.xiaoqi.dto.Product;
import com.xiaoqi.feign.ProductFeign;
import com.xiaoqi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aq on 2018/11/21.
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductFeign productFeign;

    @RequestMapping("/saveOrder")
    public String saveOrder(Order order) {
        try {
            orderService.saveOrder(order);
            return "sucess";
        } catch (Exception ex) {
            return "error";
        }
    }

    @RequestMapping("/test")
    public String test(String result) {
        try {
            return productFeign.modifyProductPiece2();
        } catch (Exception ex) {
            return "error";
        }
    }

    @RequestMapping("/save")
    public String save(Integer productId) {
        try {
            Order order = new Order();
            order.setOrdersProductId(productId);
            orderService.saveOrder(order);
            return "sucess";
        } catch (Exception ex) {
            return "error";
        }
    }
}

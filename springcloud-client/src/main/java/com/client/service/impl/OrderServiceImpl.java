package com.xiaoqi.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.xiaoqi.bean.Order;
import com.xiaoqi.dto.Product;
import com.xiaoqi.feign.ProductFeign;
import com.xiaoqi.mapper.OrderMapper;
import com.xiaoqi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aq on 2018/11/21.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ProductFeign productFeign;

    @Transactional
    @TxTransaction(isStart = true)
    @Override
    public void saveOrder(Order order) {
        Product product = new Product();
        product.setProductId(order.getOrdersProductId());
        productFeign.modifyProductPiece(product); //修改商品数量

        orderMapper.saveOrder(order);//添加订单


        int i = 1 / 0;
    }
}

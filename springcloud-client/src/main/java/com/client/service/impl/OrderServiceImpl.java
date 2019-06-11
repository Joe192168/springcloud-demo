package com.client.service.impl;

import com.client.bean.Order;
import com.client.dto.Product;
import com.client.feign.ProductFeign;
import com.client.mapper.OrderMapper;
import com.client.service.OrderService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aq on 2018/11/21.
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ProductFeign productFeign;

    @Override
    @TccTransaction
    @Transactional
    public String saveOrder(Order order) {
        Product product = new Product();
        product.setProductId(order.getOrdersProductId());
        String ret = productFeign.modifyProductPiece(product); //修改商品数量
        orderMapper.saveOrder(order);//添加订单
        int i = 1 / 0;
        return ret;
    }
}

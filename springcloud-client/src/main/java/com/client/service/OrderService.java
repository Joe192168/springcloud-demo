package com.xiaoqi.service;

import com.xiaoqi.bean.Order;
import org.springframework.stereotype.Service;

/**
 * Created by aq on 2018/11/21.
 */
public interface OrderService {

    void saveOrder(Order order);
}

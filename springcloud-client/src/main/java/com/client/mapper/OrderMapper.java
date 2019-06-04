package com.client.mapper;

import com.client.bean.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by aq on 2018/11/21.
 */
@Repository
public interface OrderMapper {

    void saveOrder(Order order);

}

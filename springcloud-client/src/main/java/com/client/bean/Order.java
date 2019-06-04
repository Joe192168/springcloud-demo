package com.client.entity;

/**
 * Created by aq on 2018/11/21.
 */
public class Order {
    private Integer orderId;

    private Integer ordersProductId;

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Order(Integer orderId, Integer ordersProductId) {
        this.orderId = orderId;
        this.ordersProductId = ordersProductId;
    }

    public Order() {
    }

    public void setOrdersProductId(Integer ordersProductId) {
        this.ordersProductId = ordersProductId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getOrdersProductId() {
        return ordersProductId;
    }
}

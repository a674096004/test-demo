package com.service;

import entity.OrderEntiry;
import service.OrderService;

/**
 * @auther: User
 * @Date: 2020/1/16 14:29
 * @Description:
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderEntiry getDetail(String id) {
        System.out.println(super.getClass().getName()+"被调用一次："+System.currentTimeMillis());
        OrderEntiry orderEntiry = new OrderEntiry();
        orderEntiry.setId("O0001");
        orderEntiry.setMoney(1000);
        orderEntiry.setUserId("U0001");
        return orderEntiry;
    }
}

package com.service;

import service.DubbService;

/**
 * @auther: User
 * @Date: 2020/1/19 23:20
 * @Description:
 */
public class Dubb1Impl implements DubbService {
    @Override
    public void sayHello() {
        System.out.println("==== dubbo spi1 ====");
    }
}

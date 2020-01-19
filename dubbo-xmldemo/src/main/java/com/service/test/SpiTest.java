package com.service.test;

import org.junit.Test;
import service.JavaSpiService;

import java.util.ServiceLoader;

/**
 * @auther: User
 * @Date: 2020/1/19 23:13
 * @Description:
 */
public class SpiTest {

    @Test public void testJavaSpi() {
        ServiceLoader<JavaSpiService> javaSpiServices = ServiceLoader.load(JavaSpiService.class);
        for(JavaSpiService jss : javaSpiServices) {
            jss.sayHello();
        }
    }
}

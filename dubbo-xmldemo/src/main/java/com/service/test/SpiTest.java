package com.service.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Filter;
import org.junit.Test;
import service.DubbService;
import service.JavaSpiService;

import java.util.List;
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

    @Test public void testDubboSpi() {

        ExtensionLoader<DubbService> extensionLoader = ExtensionLoader.getExtensionLoader(DubbService.class);
        DubbService spi1 = extensionLoader.getExtension("spi1");
        spi1.sayHello();
        DubbService defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.sayHello();
    }
    
    @Test public void testActivate1(){
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = URL.valueOf("test://localhost/dsafsdfsdfsd");
        url = url.addParameter("test", "66666");// @Activate value属性
        List<Filter> list = extensionLoader.getActivateExtension(url,"","hello");
        for (Filter filter:list){
            filter.invoke(null,null);
        }
    }

    @Test public void testActivate2() {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);

        URL url = URL.valueOf("test://localhost/test");
        url = url.addParameter("groupId", "hello");// group 属性
        url = url.addParameter("myfilter", "f1,-f2");// 更改依赖注入

        List<Filter> list = extensionLoader.getActivateExtension(url,"myfilter","peter");
        for (Filter filter:list){
            filter.invoke(null,null);
        }
    }
}

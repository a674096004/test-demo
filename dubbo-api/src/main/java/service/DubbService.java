package service;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @auther: User
 * @Date: 2020/1/19 23:19
 * @Description:
 */
@SPI("spi2")
public interface DubbService {
    @Adaptive
    void sayHello();
}

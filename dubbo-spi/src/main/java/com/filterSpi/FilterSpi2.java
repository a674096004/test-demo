package com.filterSpi;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

/**
 * @auther: User
 * @Date: 2020/1/20 20:37
 * @Description:
 */
@Activate(group = {"hello"},value = "test")
public class FilterSpi2 implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("== filter2  spi ==");
        return null;
    }
}

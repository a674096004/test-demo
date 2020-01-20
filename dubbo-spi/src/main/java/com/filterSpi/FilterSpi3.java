package com.filterSpi;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

/**
 * @auther: User
 * @Date: 2020/1/20 20:37
 * @Description:
 */
@Activate(group = {"hello","hi"})
public class FilterSpi3 implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("== filter3  spi ==");
        return null;
    }
}

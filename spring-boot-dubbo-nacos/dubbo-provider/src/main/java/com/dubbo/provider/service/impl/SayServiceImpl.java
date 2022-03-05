package com.dubbo.provider.service.impl;

import com.dubbo.api.service.ISayService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SayServiceImpl implements ISayService {
    @Override
    public String sayHelloByName(String name) {
        return name+",hello";
    }
}

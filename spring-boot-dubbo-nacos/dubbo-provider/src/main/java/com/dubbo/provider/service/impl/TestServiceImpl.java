package com.dubbo.provider.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.dubbo.api.service.ITestService;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

@DubboService
public class TestServiceImpl implements ITestService {
    @Override
    public JSONObject testHello(String name) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name",name);
        jsonObject.put("reqTime", LocalDateTime.now());
        jsonObject.put("status",1);
        return jsonObject;
    }
}

package com.dubbo.api.service;

import com.alibaba.fastjson.JSONObject;

public interface ITestService {
    JSONObject testHello(String name);

}

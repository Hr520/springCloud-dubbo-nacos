package com.dubbo.consumer.controller;


import com.alibaba.fastjson.JSONObject;
import com.dubbo.api.service.ITestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo/test")
public class TestController {

    @DubboReference
    private ITestService testService;

    @GetMapping(value = "sayHellos")
    public JSONObject sayHellos(@RequestParam("name") String name){
        return  testService.testHello(name);
    }
}

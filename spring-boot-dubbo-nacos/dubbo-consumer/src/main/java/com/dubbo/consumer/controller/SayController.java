package com.dubbo.consumer.controller;

import com.dubbo.api.service.ISayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo/say")
public class SayController {

    @DubboReference
    private ISayService sayService;

    @RequestMapping("sayHello")
    public ResponseEntity<String> sayHello(@RequestParam("name") String name){
        return ResponseEntity.ok(sayService.sayHelloByName(name));
    }
}

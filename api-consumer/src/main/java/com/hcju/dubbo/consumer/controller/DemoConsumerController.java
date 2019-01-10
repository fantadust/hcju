package com.hcju.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcju.dubbo.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {


    @Reference(version = "1.0.0", loadbalance = "RoundRobin")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {

        String xxx = demoService.sayHello(name);


        return xxx;
    }
}

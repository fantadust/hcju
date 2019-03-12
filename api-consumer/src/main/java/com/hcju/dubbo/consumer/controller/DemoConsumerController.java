package com.hcju.dubbo.consumer.controller;

import com.hcju.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {


    @Reference(version = "1.0.0", loadbalance = "roundrobin")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {

        long a = System.currentTimeMillis();

        String xxx = demoService.sayHello(name);
        System.out.println(System.currentTimeMillis()-a);


        return xxx;
    }
}

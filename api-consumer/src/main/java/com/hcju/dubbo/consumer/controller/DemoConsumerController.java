package com.hcju.dubbo.consumer.controller;

import com.hcju.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {


    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        System.out.println("job");

        String xxx = demoService.sayHello(name);


        return xxx;
    }
}

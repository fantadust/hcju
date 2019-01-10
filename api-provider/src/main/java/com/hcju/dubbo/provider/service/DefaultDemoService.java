package com.hcju.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.hcju.dubbo.DemoService;
import com.hcju.frame.commons.util.TimeProcesser;
import com.hcju.frame.data.JsonMapper;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {

        StringBuffer sb = new StringBuffer();

        sb.append(JsonMapper.encodeSilent(RpcContext.getContext().getUrl()));



        return TimeProcesser.getDateByUnixTime(TimeProcesser.getUnixTime()) + " Hello, " + name + "  ===== " + sb.toString();
    }
}

package com.hcju.dubbo.provider.service;


import com.hcju.dubbo.DemoService;
import com.hcju.frame.commons.util.TimeProcesser;
import com.hcju.frame.data.JsonMapper;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;


@Service(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {

        StringBuffer sb = new StringBuffer();

        sb.append(JsonMapper.encodeSilent(RpcContext.getContext().getUrl()));


        return TimeProcesser.getDateByUnixTime(TimeProcesser.getUnixTime()) + " Hello, " + name + "  ===== " + sb.toString();
    }
}

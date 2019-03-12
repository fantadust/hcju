package com.hcju.dubbo.provider.service;


import com.hcju.dubbo.DemoService;
import com.hcju.frame.commons.util.TimeProcesser;
import com.hcju.frame.data.JsonMapper;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.util.UUID;


@Service(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {

        StringBuffer sb = new StringBuffer();

        sb.append(JsonMapper.encodeSilent(RpcContext.getContext().getUrl()));

        String data = String.format(" %s Hello %s %s %s ", TimeProcesser.getDateByUnixTime(), name, UUID.randomUUID().toString(), sb.toString());


        return data;
    }
}

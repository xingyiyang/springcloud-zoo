package com.scu.zoo.comsumer1.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello1(@RequestParam(value = "name") String name) {
        return "hello1" +name+", this message send failed ";
    }
}

package com.scu.zoo.comsumer1.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello1(@RequestParam(value = "name") String name);
}
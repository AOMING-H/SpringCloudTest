package com.ming.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ming.servicefeign.service.hystric.SchedualHelloClientHystric;

@FeignClient(value = "service-EurekaClient1",fallback = SchedualHelloClientHystric.class)
public interface HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String getHello();
}

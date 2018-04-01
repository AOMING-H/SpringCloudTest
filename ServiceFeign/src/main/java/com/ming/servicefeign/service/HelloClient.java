package com.ming.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-EurekaClient1")
public interface HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String getHello();
}

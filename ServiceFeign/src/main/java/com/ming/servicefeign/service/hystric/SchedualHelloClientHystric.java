package com.ming.servicefeign.service.hystric;

import org.springframework.stereotype.Component;

import com.ming.servicefeign.service.HelloClient;

@Component
public class SchedualHelloClientHystric implements HelloClient {

    @Override
    public String getHello() {
        return "sorry hystric";
    }
}

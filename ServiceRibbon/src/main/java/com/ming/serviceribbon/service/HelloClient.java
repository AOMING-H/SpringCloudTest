package com.ming.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloClient {
    @Autowired
    private RestTemplate restTemplate;
    
    public String getHello() {
        return restTemplate.getForObject("http://service-EurekaClient1/hello",String.class);
    }
}

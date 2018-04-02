package com.ming.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ming.servicefeign.service.HelloClient;


@RestController
public class HelloController {
    @Autowired
    HelloClient helloClient;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return helloClient.getHello();
    }

    
}

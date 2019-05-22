package com.could.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(){
        return "HelloWorld"; //提供一个helloworld
    }

}

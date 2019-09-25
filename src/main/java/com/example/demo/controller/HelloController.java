package com.example.demo.controller;

import com.example.demo.service.AddService;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/get")
    public String test(){
        helloService.hello();

        return "success";
    }

    @RequestMapping("/get2")
    public String test2(){
        helloService.hello(2);

        return "success";
    }

    @RequestMapping("/get3")
    public String test3(){
        helloService.hello("瓜田李下",23);

        return "success";
    }
}

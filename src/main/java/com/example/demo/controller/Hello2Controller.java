package com.example.demo.controller;

import com.example.demo.pojo.A;
import com.example.demo.serviceImpl.HelloTest;
import com.example.demo.serviceImpl.HelloTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @Autowired
    private HelloTest helloTest;

    @Autowired
    private HelloTest2 helloTest2;

    @RequestMapping("/test")
    public String test(){
        helloTest.test();

        return "success 1";
    }

    @RequestMapping("/test2")
    public String test2(){
        helloTest.test2();

        return "success 2";
    }

    @RequestMapping("/test3")
    public String test3(){
        helloTest.test3(new A());

        return "success 3";
    }

    @RequestMapping("/test4")
    public String test4(){
        helloTest2.test();

        return "success 4";
    }
}

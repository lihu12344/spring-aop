package com.example.demo.serviceImpl;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("hello 方法被调用");
    }

    @Override
    public void hello(Integer id) {
        System.out.println("hello "+ id+"被调用");
    }

    @Override
    public void hello(String name, Integer id) {
        System.out.println(name+"  "+id);
    }
}

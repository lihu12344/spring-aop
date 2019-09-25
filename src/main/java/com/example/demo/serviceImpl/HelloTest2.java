package com.example.demo.serviceImpl;

import com.example.demo.annotation.A2;
import org.springframework.stereotype.Service;

@A2
@Service
public class HelloTest2 {

    public void test(){
        System.out.println("hello test2");
    }
}

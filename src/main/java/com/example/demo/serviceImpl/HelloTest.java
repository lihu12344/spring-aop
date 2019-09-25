package com.example.demo.serviceImpl;

import com.example.demo.annotation.A1;
import com.example.demo.annotation.A3;
import com.example.demo.pojo.A;
import org.springframework.stereotype.Service;

@A1
@Service
public class HelloTest {

    public void test(){
        System.out.println("hello test ");
    }

    @A3
    public void test2(){
        System.out.println("hello test 2");
    }

    public void test3(A a){
        System.out.println("hello test 3");
    }
}

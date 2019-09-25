package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("@within(com.example.demo.annotation.A1)")
    public void fun(){

    }
/*
    @Pointcut("@target(com.example.demo.annotation.A2)")
    public void fun2(){

    }
*/
    @Pointcut("@annotation(com.example.demo.annotation.A3)")
    public void fun3(){

    }

    @Pointcut("@args(com.example.demo.annotation.A4)&&within(com.example.demo.serviceImpl.HelloTest)")
    public void fun4(){

    }

    @Before("fun()")
    public void before(){
        System.out.println("前置通知 A1");
    }
/*
    @After("fun2()")
    public void after2(){
        System.out.println("后置通知 A2");
    }
*/
    @Before("fun3()")
    public void after3(){
        System.out.println("后置通知 A3");
    }

    @After("fun4()")
    public void after4(){
        System.out.println("后置通知 A4");
    }
}

package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @Pointcut("execution( * *.hello())")
    public void fun(){

    }

    @Pointcut("execution(* *.hello(Integer))&&args(id)")
    public void fun2(Integer id){

    }

    @Pointcut(value = "execution(* *.hello(String,Integer))&&args(name,id)", argNames = "name,id")
    public void fun3(String name,Integer id){

    }

    @Pointcut("within(com.example.demo.service.HelloService+)")
    public void fun4(){

    }

    @Pointcut("execution(* com.example.demo.service.HelloService.*(Integer))&&args(id)")
    public void fun5(Integer id){

    }

    @Before("fun()")
    public void before(){
        System.out.println("前置通知");
    }

    @Before(value = "fun2(id)", argNames = "id")
    public void before2(Integer id){
        System.out.println(id);
        System.out.println("前置通知2 fun2()");
    }

    @Before(value = "fun3(name,id)", argNames = "name,id")
    public void before(String name,Integer id){
        System.out.println("前置通知");
        System.out.println(name+"  "+id);
    }

    @After("fun4()")
    public void after2(){
        System.out.println("后置通知");
    }

    @After(value = "fun5(id)", argNames = "id")
    public void after3(Integer id){
        System.out.println("后置通知 2");
    }
}

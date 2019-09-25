package com.example.demo.aspect;

import com.example.demo.service.AddService;
import com.example.demo.serviceImpl.AddServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddAspect {

    @DeclareParents(value = "com.example.demo.serviceImpl.HelloServiceImpl",
            defaultImpl = AddServiceImpl.class)
    private AddService addService;
}

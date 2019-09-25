package com.example.demo.serviceImpl;

import com.example.demo.service.AddService;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {

    @Override
    public void add() {
        System.out.println("添加了新的方法");
    }
}

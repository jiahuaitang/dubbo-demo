package com.jht.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements service.UserService {

    @Override
    public String sayHello(String name) {
        return "Hello! "+name;
    }

    @Override
    public String sayDubbo(String name) {
        if(name != null && "jk".equals(name)){
            return "hello dubbo!";
        }
        return "";
    }
}

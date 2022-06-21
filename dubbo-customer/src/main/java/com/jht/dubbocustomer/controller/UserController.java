package com.jht.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private service.UserService userService;

    @GetMapping("/sayHello")
    private String sayHello(/*@RequestParam String name*/){
        String name = userService.sayHello("jock");
        return name;
    }

}

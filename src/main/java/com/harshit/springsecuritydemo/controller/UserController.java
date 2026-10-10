package com.harshit.springsecuritydemo.controller;

import com.harshit.springsecuritydemo.model.User;
import com.harshit.springsecuritydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }
}

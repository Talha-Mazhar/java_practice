package org.example.springsecurity.controller;

import org.example.springsecurity.model.User;
import org.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @PostMapping("register")
    public User register(@RequestBody User user) {

        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("New Pwd: " + user.getPassword());
        return service.saveUser(user);
    }
}

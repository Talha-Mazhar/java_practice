package org.example.springsecurity.service;

import org.example.springsecurity.dao.UserRepo;
import org.example.springsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user);
    }
}

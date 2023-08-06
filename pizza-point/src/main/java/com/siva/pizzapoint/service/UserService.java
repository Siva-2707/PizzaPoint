package com.siva.pizzapoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.pizzapoint.bean.User;
import com.siva.pizzapoint.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User createUser(User user) {
        return repo.save(user);
    }

    public User getUserWithId(int id) {
        return repo.findById(id).get();
    }

    public Iterable<User> getAllUsers() {
        return repo.findAll();
    }

}

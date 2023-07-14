package com.siva.pizzapoint.repo;

import org.springframework.data.repository.CrudRepository;

import com.siva.pizzapoint.bean.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}

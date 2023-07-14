package com.siva.pizzapoint.repo;

import org.springframework.data.repository.CrudRepository;

import com.siva.pizzapoint.bean.Pizza;

public interface PizzaRepo extends CrudRepository<Pizza, Integer> {

}

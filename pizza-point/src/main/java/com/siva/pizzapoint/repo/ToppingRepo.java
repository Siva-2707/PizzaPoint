package com.siva.pizzapoint.repo;

import org.springframework.data.repository.CrudRepository;

import com.siva.pizzapoint.bean.Topping;

public interface ToppingRepo extends CrudRepository<Topping, Integer> {

}

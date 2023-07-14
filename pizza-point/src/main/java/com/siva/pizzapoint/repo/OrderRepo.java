package com.siva.pizzapoint.repo;

import org.springframework.data.repository.CrudRepository;

import com.siva.pizzapoint.bean.Order;

public interface OrderRepo extends CrudRepository<Order, Integer> {

}

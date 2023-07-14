package com.siva.pizzapoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.pizzapoint.bean.Order;
import com.siva.pizzapoint.bean.User;
import com.siva.pizzapoint.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    UserService userService;

    public Order placeNewOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order viewOrder(int id) {
        return orderRepo.findById(id).get();
    }

    public Iterable<Order> viewAllOrdersForAUser(User user) {
        return userService.getUserWithId(user.getId()).getOrders();
    }

}

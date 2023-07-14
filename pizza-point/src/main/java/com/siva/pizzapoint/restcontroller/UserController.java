package com.siva.pizzapoint.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.pizzapoint.bean.Order;
import com.siva.pizzapoint.bean.Pizza;
import com.siva.pizzapoint.bean.User;
import com.siva.pizzapoint.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //Used to create a user.
    @PostMapping("/user")
    public ResponseEntity<User> createUser(User user) {
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.OK);
    }

    //This should be acceesible only by the ADMIN
    @GetMapping("/users")
    public ResponseEntity<Iterable<User>> getAllUsers() {
        return new ResponseEntity<Iterable<User>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUserWithId(@RequestBody User user) {
        return new ResponseEntity<User>(userService.getUserWithId(user.getId()), HttpStatus.OK);
    }

    @GetMapping("/user/orders")
    public ResponseEntity<Iterable<Order>> getUserOrders(@RequestBody User user) {
        return new ResponseEntity<Iterable<Order>>(userService.getUserWithId(user.getId()).getOrders(), HttpStatus.OK);
    }

    @GetMapping("/user/cart")
    public ResponseEntity<Iterable<Pizza>> getUserCart(@RequestBody User user) {
        return new ResponseEntity<Iterable<Pizza>>(userService.getUserWithId(user.getId()).getCart(), HttpStatus.OK);
    }
}

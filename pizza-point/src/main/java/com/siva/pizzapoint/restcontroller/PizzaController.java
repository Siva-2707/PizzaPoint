package com.siva.pizzapoint.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.pizzapoint.bean.Pizza;
import com.siva.pizzapoint.service.PizzaService;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizza")
    public ResponseEntity<Iterable<Pizza>> getAllAvailablePizzas() {
        return new ResponseEntity<Iterable<Pizza>>(pizzaService.getAllAvailablePizzas(), HttpStatus.OK);
    }

}

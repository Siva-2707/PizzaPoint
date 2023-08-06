package com.siva.pizzapoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.pizzapoint.bean.Pizza;
import com.siva.pizzapoint.repo.PizzaRepo;

@Service
public class PizzaService {

    @Autowired
    PizzaRepo repo;

    public Iterable<Pizza> getAllAvailablePizzas() {
        return repo.findAll();
    }

    public Pizza addPizza(Pizza pizza) {
        return repo.save(pizza);
    }

    public Iterable<Pizza> addPizzas(List<Pizza> pizzas) {
        return repo.saveAll(pizzas);
    }

    public Pizza updatePizza(Pizza pizza) {
        Optional<Pizza> existingPizza = repo.findById(pizza.getId());
        if (existingPizza.isPresent())
            repo.delete(existingPizza.get());
        return repo.save(pizza);
    }
}

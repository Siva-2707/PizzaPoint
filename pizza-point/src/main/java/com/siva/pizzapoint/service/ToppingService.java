package com.siva.pizzapoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.pizzapoint.bean.Topping;
import com.siva.pizzapoint.repo.ToppingRepo;

@Service
public class ToppingService {

    @Autowired
    ToppingRepo toppingRepo;

    public Iterable<Topping> getAllToppingg() {
        return toppingRepo.findAll();
    }

    public Topping addTopping(Topping topping) {
        return toppingRepo.save(topping);
    }

    public void removeTopping(Topping topping) {
        toppingRepo.delete(topping);
    }

}

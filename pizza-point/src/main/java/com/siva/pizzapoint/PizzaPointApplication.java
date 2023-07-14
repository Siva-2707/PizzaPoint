package com.siva.pizzapoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.siva.pizzapoint.bean.Role;
import com.siva.pizzapoint.bean.User;
import com.siva.pizzapoint.repo.UserRepo;

@SpringBootApplication
public class PizzaPointApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PizzaPointApplication.class, args);
	}

	@Autowired
	UserRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User("Siva", "Rajesh", "b.siva@mail.com", Role.ADMIN, "sivarajesh", "pass"));
	}

}

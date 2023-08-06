package com.siva.pizzapoint.bean;

import java.util.List;

public class Pizza {
	private int id;
	private String name;
	private double price;
	private List<Topping> toppings;

	public Pizza() {
	}

	public Pizza(String name, double price, List<Topping> toppings) {
		super();
		this.name = name;
		this.price = price;
		this.toppings = toppings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}

}

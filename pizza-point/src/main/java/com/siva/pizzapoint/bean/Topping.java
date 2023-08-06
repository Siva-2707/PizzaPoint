package com.siva.pizzapoint.bean;

public class Topping {
	private int id;
	private String name;
	private double rate;

	public Topping() {
	}

	public Topping(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}

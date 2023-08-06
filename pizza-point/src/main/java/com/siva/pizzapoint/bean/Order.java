package com.siva.pizzapoint.bean;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
	private int id;
	private List<Pizza> listOfPizzas;
	private LocalDateTime orderPlacedTime;
	private LocalDateTime orderDeliveredTime;
	private OrderStatus orderStatus;

	public Order() {
	}

	public Order(List<Pizza> listOfPizzas, LocalDateTime orderPlacedTime, LocalDateTime orderDeliveredTime,
			OrderStatus orderStatus) {
		super();
		// this.user = user;
		this.listOfPizzas = listOfPizzas;
		this.orderPlacedTime = orderPlacedTime;
		this.orderDeliveredTime = orderDeliveredTime;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// public User getUser() {
	// 	return user;
	// }

	// public void setUser(User user) {
	// 	this.user = user;
	// }

	public List<Pizza> getListOfPizzas() {
		return listOfPizzas;
	}

	public void setListOfPizzas(List<Pizza> listOfPizzas) {
		this.listOfPizzas = listOfPizzas;
	}

	public LocalDateTime getOrderPlacedTime() {
		return orderPlacedTime;
	}

	public void setOrderPlacedTime(LocalDateTime orderPlacedTime) {
		this.orderPlacedTime = orderPlacedTime;
	}

	public LocalDateTime getOrderDeliveredTime() {
		return orderDeliveredTime;
	}

	public void setOrderDeliveredTime(LocalDateTime orderDeliveredTime) {
		this.orderDeliveredTime = orderDeliveredTime;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}

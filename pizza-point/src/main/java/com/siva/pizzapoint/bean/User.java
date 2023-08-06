package com.siva.pizzapoint.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Role role;
	private String userName;
	private String password;
	private Iterable<Order> orders;
	private Iterable<Pizza> cart;

	public User() {
	}

	public User(String firstName, String lastName, String email, Role role, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Iterable<Order> getOrders() {
		return orders;
	}

	public void setOrders(Iterable<Order> orders) {
		this.orders = orders;
	}

	public Iterable<Pizza> getCart() {
		return cart;
	}

	public void setCart(Iterable<Pizza> cart) {
		this.cart = cart;
	}

}

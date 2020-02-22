package com.facility.Domain.customer;

import java.util.ArrayList;
import java.util.List;


public class Customer {
	private String customer_id;
	private String lastname;
	private String firstname;
	private Perks cardId;
	private List<Order> orders = new ArrayList<Order>();

	public List<Order> getOrders() {
		return orders;
	}
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String id) {
		this.customer_id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname; 
	}
	public Perks getCardId() {
		return cardId;
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	
}

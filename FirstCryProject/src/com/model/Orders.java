package com.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Orders {
	private int id;
	private User userId;
	private int totalAmount;
	private Timestamp orderDate;
	public Orders() {
		super();
	}
	public Orders(int id, User userId, int totalAmount, Timestamp orderDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate
				+ "]";
	}
	
	
	

}

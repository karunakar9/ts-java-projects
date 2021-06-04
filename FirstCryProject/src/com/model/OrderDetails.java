package com.model;

public class OrderDetails {
	private int id;
	private Orders orderId;
	private Product productId;
	private int quantity;
	public OrderDetails() {
		super();
	}
	public OrderDetails( Orders orderId, Product productId, int quantity) {
		super();
		//this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Orders getOrderId() {
		return orderId;
	}
	public void setOrderId(Orders orderId) {
		this.orderId = orderId;
	}
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity
				+ "]";
	}
	
	

}

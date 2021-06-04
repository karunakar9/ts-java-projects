package com.servlet;

public class Customer {
	private String name;
	private long phnNo;
	private String city;
	public Customer() {
		super();
	}
	public Customer(String name, long phnNo, String city) {
		super();
		this.name = name;
		this.phnNo = phnNo;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

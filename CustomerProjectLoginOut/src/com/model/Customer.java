package com.model;

import java.sql.Date;

public class Customer {
	private String name;
	private String email;
	private String pwd;
	private Date DOB;
	public Customer() {
		super();
	}
	public Customer(String name, String email, String pwd, Date dOB) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		DOB = dOB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	

}

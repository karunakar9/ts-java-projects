package com.model;

public class User {
	private String name;
	private String email;
	private String pwd;
	public User() {
		super();
	}
	public User(String name, String email, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.pwd = pwd;
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
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	

}

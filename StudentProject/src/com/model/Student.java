package com.model;

public class Student {
	private int id;
	private String name;
	private String batch;
	public Student() {
		super();
	}
	public Student(String name, String batch) {
		super();
		//this.id = id;
		this.name = name;
		this.batch = batch;
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
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", batch=" + batch + "]";
	}
	
	

}

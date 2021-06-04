package classAndObject;

import java.util.Scanner;

public class Student1 {
	private int id;
	private String name;
	private String address;
    static String clgName="engineering college";
	Student1() {
		System.out.println("default constructor");
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}		
	
}

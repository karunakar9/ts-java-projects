package com.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClientApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//System.out.println(CrudOperations.insertRecord(1009, "madhukar", 85));
	
	  //another way of inseting
			 //	Student st = new Student(111, "mothi", 92);
			//	System.out.println(CrudOperations.insertStudent(st));
	
	//	System.out.println("details with id");
	//	System.out.println(CrudOperations.getStudentWithId(1001));
		List<Student> li=new ArrayList<>();
		li=CrudOperations.getAllStudentDetails();
		for (Student student : li) {
			System.out.println(student);
		}

	}

}

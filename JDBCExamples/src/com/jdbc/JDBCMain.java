package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading driver
		Class.forName("com.mysql.jdbc.Driver");
		// connection establishment
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/day3", "root", "root");
		System.out.println("connection status:" + c);
		// creating statement
		Statement st = c.createStatement();

		// Executing Queries

//		st.executeUpdate("create table student(id int,name varchar(20),marks int)");
	/*	int res=st.executeUpdate("insert into student values(1001,'virat',567)");
		if(res !=0){
			System.out.println("Inserted");
		}else{
			System.out.println("not inserted");
		}*/

		/*
		st.addBatch("insert into student values(1002,'anil',588)");
		st.addBatch("insert into student values(1003,'sai',565)");
		st.addBatch("update student set name='rohit',marks=555 where id=1001");
		st.addBatch("delete from student where id=1003");
		int[] res=st.executeBatch();
		for(int i:res){
			System.out.println(i);
		}*/
		
		ResultSet rs=st.executeQuery("select * from student");
				while(rs.next()){
					System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("marks"));
				}
		// close connection
		c.close();

	}

}

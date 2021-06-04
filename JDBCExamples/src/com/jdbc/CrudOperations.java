package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CrudOperations {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/day3", "root", "root");
	return c;
	}
	public static boolean insertRecord(int id,String name,int marks) throws ClassNotFoundException, SQLException{
		Connection c=CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, marks);
		int r=ps.executeUpdate();
		if(r !=0){
			return true;
	
		}
		return false;		
	}
	public static boolean insertStudent(Student st) throws ClassNotFoundException, SQLException{
		Connection c = CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, st.getId());
		ps.setString(2, st.getName());
		ps.setInt(3, st.getMarks());
		int r=ps.executeUpdate();
		if(r != 0){
			return true;
		}
		c.close();
		return false;
	}
	public static boolean deleteStudentWithId(int sid) throws SQLException, ClassNotFoundException{
		Connection c = CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("delete from student where id=?");
		ps.setInt(1, sid);
		int r=ps.executeUpdate();
		if(r != 0){
			return true;
		}
		c.close();
		return false;
	}
	public static Student getStudentWithId(int sid) throws SQLException, ClassNotFoundException{
		Connection c = CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from student where id=?");
		ps.setInt(1, sid);
		ResultSet rs=ps.executeQuery();
		Student st=null;
		while(rs.next()){
		/*	int id=rs.getInt(1);
			String name=rs.getString(2);
			int marks=rs.getInt(3);
			st=new Student(id,name,marks);*/
			st= new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
		c.close();
		return st;
		
	}
	public static List<Student> getAllStudentDetails() throws SQLException, ClassNotFoundException{
		Connection c = CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		Student st= null;
		List sList= new ArrayList<Student>();
		while(rs.next()){
			st=new Student();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setMarks(rs.getInt(3));
			sList.add(st);
		}
		return sList;

	}
	public static void getAllStudents() throws SQLException, ClassNotFoundException{
		Connection c=CrudOperations.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		rs.absolute(3);
		rs.updateInt(1, 2002);
		rs.updateString(2, "priyanka");
		rs.updateInt(3, 888);
		rs.updateRow();
		System.out.println("after row updating");
	}

}

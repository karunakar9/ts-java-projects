package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.model.Student;

public class StudentDao {
	public static List<Student> getAllStudentsDetails() throws ClassNotFoundException, SQLException{
		Connection c=ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from student");
		ResultSet rs=ps.executeQuery();
		Student st= null;
		List sList= new ArrayList<Student>();
		while(rs.next()){
			st=new Student();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setBatch(rs.getString(3));
			sList.add(st);
		}
		return sList;
	}
	public static boolean AddStudent(Student st) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into student(name,batch) values(?,?)");
		//ps.setInt(1, st.getId());
		ps.setString(1, st.getName());
		ps.setString(2, st.getBatch());
		int r=ps.executeUpdate();
		if(r != 0){
			return true;
		}
		c.close();
		return false;
	}
	public static boolean deleteStudentWithId(int sid) throws SQLException, ClassNotFoundException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("delete from student where id=?");
		ps.setInt(1, sid);
		int r=ps.executeUpdate();
		if(r != 0){
			return true;
		}
		c.close();
		return false;
	}
	public static boolean validateWithId(int id) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("select id from student where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		return true;
		return false;
	}
	public static boolean updateStudentWithId(int sid,String name,String batch) throws SQLException, ClassNotFoundException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("update student set name=? , batch=?  where id=?");
		ps.setString(1, name);
	    ps.setString(2, batch);
		ps.setInt(3, sid);

		int r=ps.executeUpdate();
		
		if(r != 0){
			return true;
		}
		c.close();
		return false;
	}
	public static List<Student> ShowWithId(int id) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from student where id=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		List stList= new ArrayList<Student>();
		Student st=null;
		while(rs.next()){
			st=new Student();
			st.setId(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setBatch(rs.getString(3));
			stList.add(st);
		}
		return stList;
	}

}

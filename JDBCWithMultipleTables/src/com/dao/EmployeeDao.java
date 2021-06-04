package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Department;
import com.dto.Employee;

public class EmployeeDao {
	public static List<Employee> getAllEmployeeDEtailsWithDeptName() throws SQLException, ClassNotFoundException{
		Connection con=ConnectionUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select emp.*,dept.dname from emp inner join dept on emp.dno=dept.dno");
		ResultSet rs = ps.executeQuery();
		Employee e=null;
		Department d = null;
		List<Employee> elist= new ArrayList<>();
		while(rs.next()){
			e = new Employee();
			e.setEno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEsal(rs.getInt(3));
			e.setJob(rs.getString(4));
			int dno=rs.getInt(5);
			String dname=rs.getString(6);
			d=new Department(dno,dname);
			e.setDno(d);
			elist.add(e);
		}
		con.close();
		return elist;
		
	}
	public static List<Employee> getEmployeeDetailsWithDno(int idno) throws SQLException, ClassNotFoundException{
		Connection con=ConnectionUtility.getConnection();
		PreparedStatement ps=con.prepareStatement("select emp.* , dept.dname from emp,dept where emp.dno=dept.dno and dept.dno=?");
		ps.setInt(1, idno);
		ResultSet rs = ps.executeQuery();
		Employee e=null;
		Department d = null;
		List<Employee> elist= new ArrayList<>();
		while(rs.next()){
			e = new Employee();
			e.setEno(rs.getInt(1));
			e.setEname(rs.getString(2));
			e.setEsal(rs.getInt(3));
			e.setJob(rs.getString(4));
			int dno=rs.getInt(5);
			String dname=rs.getString(6);
			d=new Department(dno,dname);
			e.setDno(d);//setting the 5th property
			elist.add(e);
		}
		con.close();
		return elist;
		
	}
}

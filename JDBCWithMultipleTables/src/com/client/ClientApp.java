package com.client;

import java.sql.SQLException;
import java.util.List;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class ClientApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Employee> li=EmployeeDao.getAllEmployeeDEtailsWithDeptName();
		for (Employee employee : li) {
			System.out.println(employee);
		}
		System.out.println("+=================+");
		List<Employee> list=EmployeeDao.getEmployeeDetailsWithDno(101);
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}

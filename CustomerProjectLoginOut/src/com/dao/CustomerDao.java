package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Customer;

public class CustomerDao {
public static boolean validateCustomerWithEmail(String email) throws ClassNotFoundException, SQLException{
Connection c = ConnectionUtility.getConnection();
PreparedStatement ps = c.prepareStatement("select email from customer");

ResultSet rs  = ps.executeQuery();
while(rs.next()){
if(email.equals(rs.getString("email"))){
return true;
}
}
return false;

}
public static void addCustomer(Customer cust) throws ClassNotFoundException, SQLException{
Connection c = ConnectionUtility.getConnection();
PreparedStatement ps  = c.prepareStatement("insert into customer(name,email,pwd,dob)values(?,?,?,?)");
ps.setString(1, cust.getName());
ps.setString(2, cust.getEmail());
ps.setString(3, cust.getPwd());
ps.setDate(4, cust.getDOB());
ps.executeUpdate();
}
public static String getPassworWithEmail(String email) throws ClassNotFoundException, SQLException{
Connection c = ConnectionUtility.getConnection();
PreparedStatement ps = c.prepareStatement("select pwd from customer where email = ?");
ps.setString(1, email);
ResultSet rs= ps.executeQuery();
String pswd = null;
if(rs.next()){
pswd = rs.getString(1);
}
return pswd;

}

}
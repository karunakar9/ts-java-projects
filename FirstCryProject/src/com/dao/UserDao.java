package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDao {
	public static boolean validateUserWithEmail(String email) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select email from user");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			if (email.equals(rs.getString("email"))) {
				return true;
			}
		}
		return false;

	}

	public static void addUser(User u) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into user(name,email,password) values(?,?,?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPwd());
		ps.executeUpdate();
	}

	public static String getPassworWithEmail(String email) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select password from user where email = ?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		String pswd = null;
		if (rs.next()) {
			pswd = rs.getString(1);
		}
		return pswd;

	}
	public static String getNameWithEmail(String email) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select name from user where email = ?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		String Lname = null;
		if (rs.next()) {
			Lname = rs.getString(1);
		}
		return Lname;

	}
	public static int getIdWithEmail(String email) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select uid from user where email = ?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		String Lname = null;
		if (rs.next()) {
			return rs.getInt(1);
		}
		return 0;

	}

}
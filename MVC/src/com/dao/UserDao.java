package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDao {
	public static String getPasswordWithEmail(String email) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select pwd from user where email=?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		String pswd = null;
		while (rs.next()) {
			pswd = rs.getString(1);
		}
		return pswd;
	}

	public static boolean registerUser(User u) {
		Connection c;
		try {
			c = ConnectionUtility.getConnection();
			PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPwd());
			int val = ps.executeUpdate();
			if (val != 0) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public static boolean validateUserWithEmail(String email) {
		Connection c;
		try {
			c = ConnectionUtility.getConnection();
			PreparedStatement ps = c.prepareStatement("select * from user where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Orders;

public class OrdersDao {
	public static boolean generateOrder(Orders o) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("insert into orders(user_uid,total_amount,order_date) values(?,?,?) ");
		ps.setInt(1, o.getUserId().getId());
		ps.setInt(2, o.getTotalAmount());
		//ps.setDate(3, o.getOrderDate());
		ps.setTimestamp(3, o.getOrderDate());
		int val=ps.executeUpdate();
		if(val != 0){
			return true;
		}
		return false;

	}
	public static int getOrderIdWithUserId(Orders o) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select oid from orders where user_uid=? and order_date=? ");
		ps.setInt(1, o.getUserId().getId());
		ps.setTimestamp(2, o.getOrderDate());
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			return rs.getInt(1);
		}
		return 0;

	}

}

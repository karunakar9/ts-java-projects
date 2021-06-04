package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.OrderDetails;
import com.model.Product;

public class OrderDetailsDao {
	public static List<Product> getItemsWithQuantity(String Qty) throws ClassNotFoundException, SQLException{
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps= c.prepareStatement("select * from order_details where quantity=?");
		ps.setString(1, Qty);
		ResultSet rs= ps.executeQuery();
		Product p= null;
		List<Product> pList= new ArrayList<>();
		while(rs.next()){
		p= new Product(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
		pList.add(p);
		}
		return pList;


		}
	public static boolean insertPurchasedProducts(OrderDetails od) throws ClassNotFoundException, SQLException{
		Connection c=ConnectionUtility.getConnection();
		PreparedStatement ps= c.prepareStatement("insert into order_details(order_id,product_id,quantity) values(?,?,?)");
		ps.setInt(1,od.getOrderId().getId() );
		ps.setInt(2, od.getProductId().getId());
		ps.setInt(3, od.getQuantity());
		if(ps.executeUpdate() != 0){
			return true;
			
		}
		return false;
	}

}

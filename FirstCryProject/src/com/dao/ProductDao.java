package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDao {
	public static List<String> getAllCategories() throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select distinct category from product");
		ResultSet rs = ps.executeQuery();
		List<String> cList = new ArrayList<String>();
		while (rs.next()) {

			cList.add(rs.getString(1));

		}
		return cList;
	}

	public static List<Product> getAllProducts() throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from product");
		ResultSet rs = ps.executeQuery();
		
		List<Product> pList = new ArrayList<Product>();
		Product p = null;
		
		while (rs.next()) {
			/*
			 * p=new Product(); 
			 * p.setId(rs.getInt(1));
			 * p.setName(rs.getString(2)); 
			 * p.setPrice(rs.getInt(3));
			 * p.setImageUrl(rs.getString(4)); 
			 * p.setCategory(rs.getString(5));
			 */
			p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			pList.add(p);
		}
		
		return pList;
	}

	public static List<Product> getItemsWithCategory(String ct) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from product where category=?");
		ps.setString(1, ct);
		ResultSet rs = ps.executeQuery();
		Product p = null;
		List<Product> pList = new ArrayList<>();
		while (rs.next()) {
			p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			pList.add(p);
		}
		return pList;

	}

	public static Product getItemWithId(int id) throws ClassNotFoundException, SQLException {
		Connection c = ConnectionUtility.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from product where pid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Product p = null;
		while (rs.next()) {
			p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
		}
		return p;

	}

}

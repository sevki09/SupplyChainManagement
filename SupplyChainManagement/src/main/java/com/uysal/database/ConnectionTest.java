package com.uysal.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.uysal.database.concretes.Postgresql;
import com.uysal.entities.Product;

public class ConnectionTest {
	public static void main(String[] args) throws Exception {
		Postgresql connect=new Postgresql();
		
		Connection connection =connect.connect();
		
		String sql="select *from product  where \"productName\" like 'deneme'";
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet resultSet=statement.executeQuery();
		
		if(resultSet.next())
		{
			long productId=resultSet.getLong("productId");
			double price=resultSet.getDouble("productPrice");
			long quantity=resultSet.getLong("quantity");
			
			System.out.println(productId+"-"+"-"+quantity+"-"+price);
		}		
		
		connection.close();
}
}

package com.uysal.business.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.uysal.business.abstracts.ProductService;
import com.uysal.database.abstracts.ConnectionService;
import com.uysal.entities.Product;

public class ProductManager implements ProductService {

	private ConnectionService connectionService;
	
	public ProductManager(ConnectionService connectionService) {
		
		this.connectionService = connectionService;
	}
	
	

	@Override
	public Product searchProductbyName(String name) {
		Connection connection=connectionService.connect();
		Product product=null;
		String sql="select *from Product where \"productName\" like ?";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, "%"+name+"%");
			ResultSet resultSet=statement.executeQuery();
			
			if(resultSet.next())
			{
				long productId=resultSet.getLong("productId");
				String productName=resultSet.getString("productName");
				double price=resultSet.getDouble("productPrice");
				long quantity=resultSet.getLong("quantity");
				
				product=new Product(productId, productName, quantity, price);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return product;
	}

	@Override
	public Product viewProductDetails(long productId) {
		// TODO Auto-generated method stub
		return null;
	}
}

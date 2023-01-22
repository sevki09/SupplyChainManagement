package com.uysal.business.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uysal.business.abstracts.SupplierService;
import com.uysal.database.abstracts.ConnectionService;
import com.uysal.database.concretes.Postgresql;
import com.uysal.entities.Supplier;

public class SupplierManager implements SupplierService {

	private ConnectionService connectionService;

	public SupplierManager(ConnectionService connectionService) {
		this.connectionService = connectionService;
	}

	@Override
	public boolean Login(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Register(Supplier supplier) {
		int result=0;
		
		Connection connection = connectionService.connect();
		String sql = "insert into Supplier(name,email,phone,password)values(?,?,?,?);";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, supplier.getName());
			statement.setString(2, supplier.getEmailAddress());
			statement.setLong(3, supplier.getPhoneNumber());
			statement.setString(4, supplier.getPassword());
			result=statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	

}

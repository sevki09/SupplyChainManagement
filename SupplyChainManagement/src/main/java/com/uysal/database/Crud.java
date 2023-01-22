package com.uysal.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Crud {
	
	public Connection getConnect() throws Exception {
		String url="jdbc:postgresql://localhost/uysaldb";
		String user="postgres";
		String password="sevkiuysal";
		
		String driver="org.postgresql.Driver";
		Class.forName(driver);
		
		Connection connection =DriverManager.getConnection(url,user,password);
		return connection;
	}
}

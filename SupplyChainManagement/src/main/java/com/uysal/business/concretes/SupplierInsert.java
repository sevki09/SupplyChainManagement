package com.uysal.business.concretes;

import java.sql.Connection;

import com.uysal.database.concretes.Postgresql;
import com.uysal.entities.Supplier;

public class SupplierInsert {

	public static void main(String[] args) {
		SupplierManager sM=new SupplierManager(new Postgresql());
		Supplier supplier=new Supplier();
		supplier.setEmailAddress("sevki@sevki");
		supplier.setName("sevki");
		supplier.setPassword("sevki123");
		supplier.setPhoneNumber(45687);
		sM.Register(supplier);
		
		
	}
}

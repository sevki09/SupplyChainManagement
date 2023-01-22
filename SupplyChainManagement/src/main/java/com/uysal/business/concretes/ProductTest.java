package com.uysal.business.concretes;


import com.uysal.database.concretes.Postgresql;

public class ProductTest {

	public static void main(String[] args) {
		ProductManager productManager=new ProductManager(new Postgresql());
		productManager.searchProductbyName("dene");
	}
}

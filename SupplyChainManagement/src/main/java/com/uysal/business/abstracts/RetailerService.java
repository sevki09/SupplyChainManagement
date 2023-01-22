package com.uysal.business.abstracts;

import java.util.List;

import com.uysal.entities.Product;
import com.uysal.entities.Retailer;

public interface RetailerService {

	public boolean Login(String name, String password);
	
	public Retailer Register(Retailer retailer);
	
	public List<Product> viewProducts();
	
	public void sellProducts();
}

package com.uysal.business.abstracts;

import com.uysal.entities.Product;

public interface ProductService {

	public Product searchProductbyName(String name);
	
	public Product viewProductDetails(long productId);
}

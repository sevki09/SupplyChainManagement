package com.uysal.business.abstracts;

import com.uysal.entities.Supplier;

public interface SupplierService {

	public boolean Login(String email, String password);

	public int Register(Supplier supplier);
}

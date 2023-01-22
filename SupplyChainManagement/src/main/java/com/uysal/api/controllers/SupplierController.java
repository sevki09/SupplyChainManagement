package com.uysal.api.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uysal.business.abstracts.SupplierService;
import com.uysal.business.concretes.SupplierManager;
import com.uysal.database.concretes.Postgresql;
import com.uysal.entities.Supplier;

/**
 * Servlet implementation class SupplierController
 */
@WebServlet("/supplier")
public class SupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private SupplierService supplierService;
	
    public SupplierController(SupplierService supplierService) {
		this.supplierService = supplierService;
	}

	public SupplierController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("name");
		String emailAddress=request.getParameter("emailAddress");
		String phone=request.getParameter("phoneNumber");
		String password=request.getParameter("password");
		long phoneNumber=Long.parseLong(phone);
		
		Supplier supplier=new Supplier();
		supplier.setName(name);
		supplier.setEmailAddress(emailAddress);
		supplier.setPhoneNumber(phoneNumber);
		supplier.setPassword(password);
		SupplierManager supplierManager=new SupplierManager(new Postgresql());
		supplierManager.Register(supplier);
	}

}

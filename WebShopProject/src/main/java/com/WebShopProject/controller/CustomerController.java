package com.WebShopProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.WebShopProject.dao.CustomerDaoImpl;
import com.WebShopProject.entity.Customer;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerDaoImpl custumerdaoRepo;
	
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public Customer addCustomers(Customer customer){		
		return custumerdaoRepo.addCustomer(customer);		
	}
	
}

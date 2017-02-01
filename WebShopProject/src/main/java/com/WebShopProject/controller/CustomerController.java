package com.WebShopProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.WebShopProject.dao.CustomerDaoImpl;
import com.WebShopProject.entity.Customer;
import java.util.*;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerDaoImpl custumerdaoRepo;
	
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public Customer addCustomers(@RequestBody Customer customer){		
		return custumerdaoRepo.addCustomer(customer);		
	}

	@RequestMapping(value="/CustomersList",method=RequestMethod.GET)
	public List<Customer> getAllCustomer(){		
		return (List<Customer>) custumerdaoRepo.getAllCustomers();
	}
	
	
}

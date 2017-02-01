package com.WebShopProject.dao;
import com.WebShopProject.entity.*;
import java.util.*;

public interface ICustomerDao {
	
	public Customer addCustomer(Customer customer);
	public Collection<Customer>getAllCustomers();	
	public Customer getCustumerByID(Long id);
}

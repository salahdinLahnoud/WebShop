package com.WebShopProject.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.WebShopProject.entity.Customer;

public class CustomerDaoImpl implements ICustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer addCustomer(Customer customer) {

		//add session
		Session session = sessionFactory.getCurrentSession();		
		em.persist(customer);		
		session.saveOrUpdate(customer);
		return customer;
		
		
		
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustumerByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

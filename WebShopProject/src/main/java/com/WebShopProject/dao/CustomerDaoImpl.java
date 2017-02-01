package com.WebShopProject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.WebShopProject.entity.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{
	
	//@Autowired
	//private SessionFactory sessionFactory;
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer addCustomer(Customer customer) {

		//add session tracking java
		//Session session = sessionFactory.getCurrentSession();		
		em.persist(customer);		
		//session.saveOrUpdate(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Query query= em.createQuery("SELECT c from Customer c");
		return query.getResultList();
	
	}
	

	@Override
	public Customer getCustumerByID(Long id) {
		return null;
	}
	
	

}

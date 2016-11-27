package com.WebShopProject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.WebShopProject.entity.Product;

@Repository
@Transactional
public class ProductDaoImpl implements EntityRepository<Product>{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Product save(Product p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Product> findAll() {
		Query query=  em.createQuery("SELECT p FROM Product p"); 				
		return query.getResultList();
	}

	@Override
	public List<Product> findByName(String mc) {
		Query query=  em.createQuery("SELECT p FROM Product p where p.name like :x "); 				
		query.setParameter("x", mc);
		return query.getResultList();
	}

	@Override
	public Product findOne(Long id) {
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public Product update(Product p) {
		em.merge(p);
		
		return p;
	}

	@Override
	public void remove(Long id) {
		Product p = em.find(Product.class, id);
		em.remove(p);
	}
}

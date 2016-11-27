package com.WebShopProject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.WebShopProject.entity.Stock;

public class StockDaoImpl implements EntityRepository<Stock>{

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Stock save(Stock p) {
		
		em.persist(p);
		return p;
	}

	@Override
	public List<Stock> findAll() {
		Query query=  em.createQuery("SELECT p FROM Stock p"); 				
		return query.getResultList();
	}

	@Override
	public List<Stock> findByName(String mc) {
		Query query=  em.createQuery("SELECT p FROM Stock p where p.version like :x "); 				
		query.setParameter("x", mc);
		return query.getResultList();
	}

	@Override
	public Stock findOne(Long id) {
		Stock p = em.find(Stock.class, id);
		return p;
	}

	@Override
	public Stock update(Stock p) {
		 em.merge(p);			
		 return p;
	}

	@Override
	public void remove(Long id) {
		Stock p = em.find(Stock.class, id);
		em.remove(p);
		
	}

	
}

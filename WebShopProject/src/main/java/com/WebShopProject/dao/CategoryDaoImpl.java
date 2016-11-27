package com.WebShopProject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.WebShopProject.entity.Category;


public class CategoryDaoImpl implements EntityRepository<Category>{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Category save(Category p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Category> findAll() {
		Query query=  em.createQuery("SELECT p FROM Category p"); 				
		return query.getResultList();
		
	}

	@Override
	public List<Category> findByName(String mc) {
		Query query=  em.createQuery("SELECT p FROM Category p where p.naamCategory like :x "); 				
		query.setParameter("x", mc);
		return query.getResultList();
	}

	@Override
	public Category findOne(Long id) {
		Category p = em.find(Category.class, id);
		return p;
	}

	@Override
	public Category update(Category p) {
	   em.merge(p);
		
		return p;
	}

	@Override
	public void remove(Long id) {
		Category p = em.find(Category.class, id);
		em.remove(p);
		
	}

}

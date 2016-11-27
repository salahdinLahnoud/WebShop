package com.WebShopProject.dao;

import java.util.List;

import com.WebShopProject.entity.Product;

public interface EntityRepository<T> {

	//ik gebruik T zodat ik all entitys kan gebruiken met deze interface
	public T save(T p);
	public List<T> findAll();
	public List<T> findByName(String mc);
	public T findOne(Long id);
	public T update(T p);
	public void remove(Long id);
	
	
}

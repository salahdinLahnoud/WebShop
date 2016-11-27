package com.WebShopProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebShopProject.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}

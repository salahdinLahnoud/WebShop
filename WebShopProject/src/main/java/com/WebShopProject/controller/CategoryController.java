package com.WebShopProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.WebShopProject.dao.CategoryDaoImpl;
import com.WebShopProject.dao.CategoryRepository;
import com.WebShopProject.entity.Category;

@RestController
public class CategoryController {

	@Autowired
	private CategoryRepository repo;	
	
		@RequestMapping(value= "/listCategory", method= RequestMethod.GET)
		public List<Category>listCategory(){			
			return (List<Category>)repo.findAll();
		}	
}

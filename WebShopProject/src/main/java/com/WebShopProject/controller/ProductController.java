package com.WebShopProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.WebShopProject.dao.ProductDaoImpl;
import com.WebShopProject.entity.Product;


@RestController
public class ProductController {

	@Autowired
	private ProductDaoImpl repo;	
	
	 @RequestMapping("/test")
	    public String index(){
		 String tes = "Testing run Salahdin Lahnoud Spring Boot";
		 return tes;
	    }		
		@RequestMapping(value= "/listProduct", method= RequestMethod.GET)
		public List<Product>listProducten(){			
			return (List<Product>)repo.findAll();
		}
	
}

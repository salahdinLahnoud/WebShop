package com.WebShopProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		@RequestMapping(value="/zoekProduct", method=RequestMethod.GET)
		public Product getProduct(@RequestParam(name="naam",defaultValue="0")String naam){
			
			return (Product) repo.findByName(naam);
			
			//Product p =(Product) repo.findByName(naam);
			//return p;			
		}
		
		
		@RequestMapping(value="/zoekProductByID/{id}", method=RequestMethod.GET)
		public Product getProduct(@PathVariable(name="id")Long id){
			Product p =(Product) repo.findOne(id);
			return p;			
		}
		
		
		
		
		
	
}

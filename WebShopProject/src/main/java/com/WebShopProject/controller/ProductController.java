package com.WebShopProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.WebShopProject.dao.ISearchProductRepository;
import com.WebShopProject.dao.ProductDaoImpl;
import com.WebShopProject.entity.Product;


@RestController
public class ProductController {

	@Autowired
	private ProductDaoImpl repo;
	@Autowired
	private ISearchProductRepository searchRepo;
	
	 @RequestMapping("/test")
	    public String index(){
		 String tes = "Testing run Salahdin Lahnoud Spring Boot";
		 return tes;
	    }		
		@RequestMapping(value= "/listProduct", method= RequestMethod.GET)
		public List<Product>listProducten(){			
			return (List<Product>)repo.findAll();
		}
		
		@RequestMapping(value="/zoekProduct/", method=RequestMethod.GET)
		public Page <Product> getProduct(String naam, int page, int size){		
			return searchRepo.searchProduct("%"+naam+"%", new PageRequest(page, size));		
		}
		
		 
		@RequestMapping(value="/zoekProductByID/{id}", method=RequestMethod.GET)
		public Product getProduct(@PathVariable(name="id")Long id){
			Product p =(Product) repo.findOne(id);
			return p;			
		}
		
		@RequestMapping(value="/saveProduct",method=RequestMethod.POST)
		public Product save(@RequestBody Product p){			
			return repo.save(p);			
		}
		@RequestMapping(value="/updateProduct/{id}",method=RequestMethod.PUT)
		public Product update(@PathVariable(name="id")Long id, @RequestBody Product p){			
			p.setId(id);
			return repo.save(p);			
		}
		
		/*@RequestMapping(value="/remove/{id}", method=RequestMethod.DELETE)
		public Product removeProduct(@PathVariable(name="id") Long id){		 
			return repo.remove(id);			
		}*/
		
	
}

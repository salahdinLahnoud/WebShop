package com.WebShopProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.WebShopProject.dao.CategoryRepository;
import com.WebShopProject.dao.EntityRepository;
import com.WebShopProject.dao.StockRepository;
import com.WebShopProject.entity.Category;
import com.WebShopProject.entity.Product;
import com.WebShopProject.entity.Stock;

@SpringBootApplication
public class WebShopProjectApplication {

	public static void main(String[] args) {
	//	ApplicationContext ctx = 
				
				SpringApplication.run(WebShopProjectApplication.class, args);
		
		
		
/*		EntityRepository productDao = ctx.getBean(EntityRepository.class);
		CategoryRepository categoryDao = ctx.getBean(CategoryRepository.class);
		StockRepository stockDao = ctx.getBean(StockRepository.class);
		
	
		Category c1 = new Category("Telephone");
		Category c2 = new Category("Television");
		Category c3 = new Category("Computers");
		
		categoryDao.save(c1);
		categoryDao.save(c2);
		categoryDao.save(c3);
		
		Stock s1 = new Stock(1, 30);
		Stock s2 = new Stock(5, 50);
		Stock s3 = new Stock(3, 10);
		
		stockDao.save(s1);
		stockDao.save(s2);
		stockDao.save(s3);
		
		
		productDao.save(new Product("LG 34", 44, 8, c2, s1));
		productDao.save(new Product("SAMSUNG 7", 700, 9,c1, s2));
		productDao.save(new Product("TOSHIBA", 1000, 10, c3, s3));
		productDao.save(new Product("IPHONE 9", 600, 8, c1, s2));*/
		
		
		
		
		
	}
}

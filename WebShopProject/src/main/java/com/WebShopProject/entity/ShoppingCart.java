package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;



public class ShoppingCart implements Serializable{

	/**
	 *create ShoppingCart Entity 
	 */
	private static final long serialVersionUID = 1L;

	private Map<Long, Item> items = new HashMap<Long, Item>();
	
	
	public void addArticle(Product p, int quantity){
		
		if(items.get(p.getId()) == null){			
			Item item = new Item();
			item.setProduct(p);
			item.setQuantity(quantity);
			item.setBedrag(p.getPrice());
			
			
			
		}
		else{
		
		Item item = items.get(p.getId());
		item.setQuantity(item.getQuantity()+quantity);
		}
	}


	public Map<Long, Item> getItems() {
		return items;
	}


	public void setItems(Map<Long, Item> items) {
		this.items = items;
	}
	
	public double getTotaal(){		
		double total = 0;		
		for(Item it : items.values()){
			
			total += it.getBedrag() * it.getQuantity();
		}		
		return total;		
	}
	
	public int getSize(){		
		return items.size();		
	}	
	public void deleteProduct(Long idProduct){		
		items.remove(idProduct);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

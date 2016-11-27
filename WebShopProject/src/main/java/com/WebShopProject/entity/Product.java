package com.WebShopProject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product implements Serializable{
	
	/**
	 * Product table
	 */
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue
	private Long id;
	@Column(length=70)
	private String naam;
	private double price;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="ID_CAT")
	private Category category;
	@ManyToOne
	@JoinColumn(name="ID_STO")
	private Stock stock;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Product(String naam, double price, int quantity) {
		super();
		this.naam = naam;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public Product(String naam, double price, int quantity, Category category) {
		super();
		this.naam = naam;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	
	public Product(String naam, double price, int quantity, Category category, Stock stock) {
		super();
		this.naam = naam;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.stock = stock;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", naam=" + naam + ", price=" + price + ", quantity=" + quantity + ", category="
				+ category + ", stock=" + stock + "]";
	}
	
	
	
	
	

}

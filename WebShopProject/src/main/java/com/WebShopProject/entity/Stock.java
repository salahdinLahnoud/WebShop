package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock implements Serializable{

	/**
	 * Stock table
	 */
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue
	private Long id;
	private int version;
	private int quantity;
	@OneToMany(mappedBy="stock",fetch=FetchType.LAZY)
	private Collection<Product> product;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Collection<Product> getProduct() {
		return product;
	}
	public void setProduct(Collection<Product> product) {
		this.product = product;
	}
	public Stock(int version, int quantity) {
		super();
		this.version = version;
		this.quantity = quantity;
	}
	public Stock(int version, int quantity, Collection<Product> product) {
		super();
		this.version = version;
		this.quantity = quantity;
		this.product = product;
	}
	
	public Stock(int quantity) {
		super();
		this.quantity = quantity;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", version=" + version + ", quantity=" + quantity + ", product=" + product + "]";
	}

}

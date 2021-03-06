package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item implements Serializable{

	/**
	 * table cart
	 */
	

 private static final long serialVersionUID = 1L;
 
	@Id@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="ID_USER")
	private Users user;
	@ManyToOne
	@JoinColumn(name="ID_PRODUCT")
	private Product product;
	private double bedrag;
	private Date datum;
	private int quantity;
	
	public double getBedrag() {
		return bedrag;
	}
	
	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Item(double bedrag, Date datum) {
		super();
		this.bedrag = bedrag;
		this.datum = datum;
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(Users user, Product product, double bedrag, Date datum) {
		super();
		this.user = user;
		this.product = product;
		this.bedrag = bedrag;
		this.datum = datum;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", user=" + user + ", product=" + product + ", bedrag=" + bedrag + ", datum=" + datum
				+ "]";
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}	
}


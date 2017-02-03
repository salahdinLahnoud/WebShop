package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.*;

public class Bestelling implements Serializable{

	/**
	 *  create Bestelling Entity
	 */
	private static final long serialVersionUID = 1L;
	private Long bestellingId;
	private Date datum;
	private Customer costumer;
	private Collection<Cart> cart;
	
	public Bestelling() {
		super();
	}
	public Bestelling(Date datum) {
		super();
		this.datum = datum;
	}
	public Long getBestellingId() {
		return bestellingId;
	}
	public void setBestellingId(Long bestellingId) {
		this.bestellingId = bestellingId;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Customer getCostumer() {
		return costumer;
	}
	public void setCostumer(Customer costumer) {
		this.costumer = costumer;
	}
	public Collection<Cart> getCart() {
		return cart;
	}
	public void setCart(Collection<Cart> cart) {
		this.cart = cart;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}

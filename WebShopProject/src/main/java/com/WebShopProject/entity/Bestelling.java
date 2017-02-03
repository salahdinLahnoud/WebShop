package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Bestelling implements Serializable{

	/**
	 *  create Bestelling Entity
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bestellingId;
	
	@NotEmpty
	private Date datum;
	@ManyToOne
	@JoinColumn(name="COSTUMER_ID")
	private Customer costumer;
	@OneToMany(mappedBy="CART")
	private Collection<Item> item;
	
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
	public Collection<Item> getCart() {
		return item;
	}
	public void setCart(Collection<Item> item) {
		this.item = item;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}

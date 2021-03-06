package com.WebShopProject.entity;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.*;
import java.util.*;


@Entity
public class Customer implements Serializable{

	/**
	 * create costumer entity
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long customerId;
	@NotEmpty(message="The customer name must be not null")
	private String naam;
	@NotEmpty(message="The customer email must be not null")
	private String email;	
	@NotEmpty(message="The customer telephon must be not null")
	private String phone;
	@OneToMany(mappedBy ="CUSTOMER",fetch=FetchType.LAZY)
	private Collection<Bestelling> betelling;
		
	public Customer() {
		super();
	}

	public Customer(String naam, String email, String phone) {
		super();
		this.naam = naam;
		this.email = email;
		this.phone = phone;
	}

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Collection<Bestelling> getBetelling() {
		return betelling;
	}
	public void setBetelling(Collection<Bestelling> betelling) {
		this.betelling = betelling;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", naam=" + naam + ", email=" + email + ", phone=" + phone
				+ ", betelling=" + betelling + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

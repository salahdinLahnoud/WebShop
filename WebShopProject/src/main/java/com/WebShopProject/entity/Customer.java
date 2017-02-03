package com.WebShopProject.entity;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.*;



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
	@NotEmpty(message="The customer telefoon must be not null")
	private String phone;
	
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
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", naam=" + naam + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}

package com.WebShopProject.entity;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.*;



@Entity
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long customerId;
	@NotEmpty(message="The customer name must be not null")
	private String naam;
	@NotEmpty(message="The customer email must be not null")
	private String email;	
	@NotEmpty(message="The customer gebruikersnaam must be not null")private String phone;
	private String gebruikersnaam;
	@NotEmpty(message="The customer wachtwoord must be not null")
	private String wachtwoord;
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
	public String getGebruikersnaam() {
		return gebruikersnaam;
	}
	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", naam=" + naam + ", email=" + email + ", phone=" + phone
				+ ", gebruikersnaam=" + gebruikersnaam + ", wachtwoord=" + wachtwoord + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

//package com.WebShopProject.entity;

//import java.io.Serializable;
/**import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
**/

//@Entity
//public class Users implements Serializable{

	/**
	 * table users
	 */
	//private static final long serialVersionUID = 1L;

	/**
	@Id@GeneratedValue
	private Long id;
	private String name; 
	private String email;
	@OneToMany(mappedBy="users",fetch=FetchType.LAZY)	 
	private Collection <Cart> cart;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Cart> getCart() {
		return cart;
	}
	public void setCart(Collection<Cart> cart) {
		this.cart = cart;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Users(String name, String email, Collection<Cart> cart) {
		super();
		this.name = name;
		this.email = email;
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", cart=" + cart + "]";
	}
	
	
	
	
	
	
	
}
**/
package com.WebShopProject.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Users implements Serializable{

	/**
	 * table users
	 */
	private static final long serialVersionUID = 1L;

	
	@Id@GeneratedValue
	private Long id;
	private String name; 
	private String email;
	private String username;
	private String password;
	private boolean activated;
	@OneToMany
	@JoinColumn(name="USER_ID")
	private Collection<Role>rolen;
	
	
	
	public Users(String name, String email, String username, String password, boolean activated) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.activated = activated;
	}
	public Users() {
		super();
	}
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
}

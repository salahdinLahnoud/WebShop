package com.WebShopProject.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Role implements Serializable{

	/**
	 * Role Entity
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long roleId;
	private String roleNaam;
	
	
	public Role() {
		super();
	}
	public Role(String roleNaam) {
		super();
		this.roleNaam = roleNaam;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleNaam() {
		return roleNaam;
	}
	public void setRoleNaam(String roleNaam) {
		this.roleNaam = roleNaam;
	}
}

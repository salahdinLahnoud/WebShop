package com.WebShopProject.entity;
import java.io.*;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category implements Serializable{
	/**
	 * Category table
	 */
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue
	private Long id;
	private String naamCategory;
	@OneToMany(mappedBy="category",fetch=FetchType.LAZY)
	private Collection<Product> product;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaamCategory() {
		return naamCategory;
	}
	public void setNaamCategory(String naamCategory) {
		this.naamCategory = naamCategory;
	}
	public Collection<Product> getProduct() {
		return product;
	}
	public void setProduct(Collection<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", naamCategory=" + naamCategory + ", product=" + product + "]";
	}
	public Category(String naamCategory) {
		super();
		this.naamCategory = naamCategory;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}

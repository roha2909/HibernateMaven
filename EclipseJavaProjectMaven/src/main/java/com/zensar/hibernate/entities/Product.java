package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Rohini Ahirrao
 * @creation Date  1 oct 2019 10:13AM
 * @modification Date  1 oct 2019 10:13AM
 * @version 1.0
 * @copyright : Zensar Technologies . All rights reserved.
 * @description : It is Entity class.
 */
@Entity
public class Product {
	@Id
	@Column(name = "id")
	private int produtId;
	private String brand;
	private String name;
	private float price;
	public int getProdutId() {
		return produtId;
	}
	public void setProdutId(int produtId) {
		this.produtId = produtId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [produtId=" + produtId + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	
	
	

}

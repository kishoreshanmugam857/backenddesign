package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int prod_id;
	@Column(nullable=false,unique=true)
	String prod_name;
	@Column(columnDefinition="text")
	String prod_desp;
	@ManyToOne
	String prod_cat;
	@ManyToOne
	String prod_sell;
	@Column(nullable=false)
	int stock;
	@Column(nullable=false)
	float price;

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desp() {
		return prod_desp;
	}

	public void setProd_desp(String prod_desp) {
		this.prod_desp = prod_desp;
	}

	public String getProd_cat() {
		return prod_cat;
	}

	public void setProd_cat(String prod_cat) {
		this.prod_cat = prod_cat;
	}

	public String getProd_sell() {
		return prod_sell;
	}

	public void setProd_sell(String prod_sell) {
		this.prod_sell = prod_sell;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

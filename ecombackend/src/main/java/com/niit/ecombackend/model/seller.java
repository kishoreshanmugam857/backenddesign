package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class seller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sell_Id;
	@Column(nullable = false, unique = true)
	String sell_Name;
	@Column(nullable = false, unique = true)
	String sell_Location;

	public int getSell_Id() {
		return sell_Id;
	}

	public void setSell_Id(int sell_Id) {
		this.sell_Id = sell_Id;
	}

	public String getSell_Name() {
		return sell_Name;
	}

	public void setSell_Name(String sell_Name) {
		this.sell_Name = sell_Name;
	}

	public String getSell_Location() {
		return sell_Location;
	}

	public void setSell_Location(String sell_Location) {
		this.sell_Location = sell_Location;
	}

}

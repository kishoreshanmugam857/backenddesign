package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 int cat_Id;
	@Column(nullable=false,unique=true)
		String cat_name;
		@Column(columnDefinition="text")
		String cat_desp;
		public int getCat_Id() {
			return cat_Id;
		}
		public void setCat_Id(int cat_Id) {
			this.cat_Id = cat_Id;
		}
		public String getCat_name() {
			return cat_name;
		}
		public void setCat_name(String cat_name) {
			this.cat_name = cat_name;
		}
		public String getCat_desp() {
			return cat_desp;
		}
		public void setCat_desp(String cat_desp) {
			this.cat_desp = cat_desp;
		}
		
		


}

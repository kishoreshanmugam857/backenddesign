package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.product;



public interface product_DAO {
	boolean addproduct(product c);
	 boolean updateproduct(product c);
	 boolean deleteproduct(product c);
	 product selectOneproduct(String cat_id);
	 List<product> selectAll();
}

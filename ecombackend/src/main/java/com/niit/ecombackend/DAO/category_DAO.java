package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.category;

public interface category_DAO {
	boolean addcategory(category c);
	 boolean updatecategory(category c);
	 boolean deletecategory(category c);
	 category selectOnecategory(String cat_id);
	 List<category> selectAll();

}

package com.niit.ecombackend.DAO;

import java.util.List;


import com.niit.ecombackend.model.customer;

public interface customer_DAO {
	boolean addcustomer(customer c);
	 boolean updatecustomer(customer c);
	 boolean deletecustomer(customer c);
	 customer selectOnecustomer(String cust_email);
	 List<customer> selectAll();

}

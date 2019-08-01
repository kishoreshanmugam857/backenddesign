package com.niit.ecombackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.customer_DAO;
import com.niit.ecombackend.config.config;
import com.niit.ecombackend.model.customer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=config.class)
public class customerinsert {
	
	customer c;
	@Autowired
	customer_DAO custdao;
	

	@Before
	public void setUp() throws Exception {
		c=new customer();
		c.setCust_name("kishorerterrrr");
		c.setCust_phno("12345900");
		c.setCust_email("achu1244@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	   assertEquals(true, custdao.addcustomer(c));	
	//   Customer c1=custdao.selectOneCustomer("achu12@gmail.com");
//		String phno=c1.getCust_Phno();
//		c1.setCust_Phno("1234567890");
//		custdao.updateCustomer(c1);
//		Customer c2=custdao.selectOneCustomer("achu12@gmail.com");
//		assertEquals(false, phno.equals(c2.getCust_Phno()));
		
		
		//Customer c3=custdao.selectOneCustomer("achu12@gmail.com");
		//assertNotNull(c3);
		
		//customer c4=custdao.selectOnecustomer("achu12@gmail.com");
	//	custdao.deletecustomer(c4);
	//	customer c5=custdao.selectOnecustomer("achu12@gmail.com");
	//assertNotNull(c5);
	   
	
	}

}

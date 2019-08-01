package com.niit.ecombackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.niit.ecombackend.DAO.seller_DAO;
import com.niit.ecombackend.config.config;

import com.niit.ecombackend.model.seller;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=config.class)
public class sellerinsert {
	seller c;
	 @Autowired
	 seller_DAO selldao;

	@Before
	public void setUp() throws Exception {
c=new seller();
		
		c.setSell_Name("kishore");
		c.setSell_Location("coimbatore");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,selldao.addseller(c));
	}

}

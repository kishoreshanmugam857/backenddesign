package com.niit.ecombackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.category_DAO;

import com.niit.ecombackend.config.config;
import com.niit.ecombackend.model.category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=config.class)

public class categoryinsert {
	 category c;
	 @Autowired
	 category_DAO catdao;

	@Before
	public void setUp() throws Exception {
		c=new category();
		
		c.setCat_name("kishore");
		c.setCat_desp("as per rule");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,catdao.addcategory(c));
		
	}

}

package com.niit.ecombackend.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.customer_DAO;
import com.niit.ecombackend.model.customer;
@Repository
@Transactional
public class customer_DAOImpl implements customer_DAO {
	@Autowired
	 SessionFactory sf;
	

	@Override
	public boolean addcustomer(customer c) {
		
		try
		{
			sf.getCurrentSession().save(c);
			return true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updatecustomer(customer c) {
		try
		{
			sf.getCurrentSession().update(c);
			return true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean deletecustomer(customer c) {
		try
		{
			sf.getCurrentSession().delete(c);
			return true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public customer selectOnecustomer(String customername) {
		try
		{
		 return(customer)sf.getCurrentSession().createCriteria(customer.class).add(Restrictions.eqOrIsNull("customername", customername)).uniqueResult();
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
		return null;
		}
	}

	@Override
	public List<customer> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(customer.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}

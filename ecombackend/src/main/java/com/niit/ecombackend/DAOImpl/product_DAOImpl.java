package com.niit.ecombackend.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.product_DAO;

import com.niit.ecombackend.model.product;
@Repository
@Transactional
public class product_DAOImpl implements product_DAO {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean addproduct(product c) {
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
	public boolean updateproduct(product c) {
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
	public boolean deleteproduct(product c) {
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
	public product selectOneproduct(String cat_id) {
		try
		{
		
		return(product)sf.getCurrentSession().createCriteria(product.class).add(Restrictions.eqOrIsNull("cat_id",cat_id)).uniqueResult();
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
		return null;
		}
	}

	@Override
	public List<product> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(product.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}

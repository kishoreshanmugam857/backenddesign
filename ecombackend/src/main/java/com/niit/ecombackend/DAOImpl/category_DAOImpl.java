package com.niit.ecombackend.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.category_DAO;
import com.niit.ecombackend.model.category;

@Repository
@Transactional
public class category_DAOImpl implements category_DAO {
@Autowired
SessionFactory sf;
	@Override
	public boolean addcategory(category c) {
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
	public boolean updatecategory(category c) {
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
	public boolean deletecategory(category c) {
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
	public category selectOnecategory(String cat_id) {
		try
		{
		
		return(category)sf.getCurrentSession().createCriteria(category.class).add(Restrictions.eq("cat_id",cat_id)).uniqueResult();
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
		return null;
		}
	}

	@Override
	public List<category> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(category.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}

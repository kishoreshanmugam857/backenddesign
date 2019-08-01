package com.niit.ecombackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class config {
	@Bean

	DataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/project3");
		dataSource.setUsername("sa");
		dataSource.setPassword("SA");
		return dataSource;
	}

	Properties myProperties() {
		Properties properties = new Properties();
		properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
		properties.setProperty(Environment.HBM2DDL_AUTO, "update");
		properties.setProperty(Environment.SHOW_SQL, "true");
		return properties;
	}

	@Bean("sf")
	LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(myDataSource());
		localSessionFactoryBean.setHibernateProperties(myProperties());
		localSessionFactoryBean.setPackagesToScan("com.niit.ecombackend.model");
		return localSessionFactoryBean;
	}

	@Autowired
	@Bean
	HibernateTransactionManager hibernateTransactionManager(SessionFactory sf) {
		HibernateTransactionManager h = new HibernateTransactionManager();
		h.setSessionFactory(sf);
		return h;
	}
}

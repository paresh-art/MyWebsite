package com.website.servlets.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.website.servlets.entity.User;

public class UserDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			Configuration configuration = new Configuration()
					                          .configure()
					                          .addAnnotatedClass(User.class);
			
			sessionFactory = configuration.buildSessionFactory();	
		}
		
		return sessionFactory;
	}
}

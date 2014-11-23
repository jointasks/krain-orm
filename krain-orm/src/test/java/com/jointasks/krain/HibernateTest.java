package com.jointasks.krain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jointasks.krain.model.Blog;
import com.jointasks.krain.model.User;

public class HibernateTest {
	
	private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void init() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	@AfterClass
	public static void destroy() {
		if (sessionFactory != null)
			sessionFactory.close();
	}
	
	@Test
	public void testAddUser() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		User u = new User();
		u.setAddTime(new Date());
		u.setPassword("1234");
		u.setStatus(1);
		u.setUsername("aaa");
		
		Set<Blog> b = new HashSet<Blog>();
		b.add(new Blog());
		u.setBlog(b);
		session.save(u);
		
		session.getTransaction().commit();
	}
	
}

package com.apoo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.UserDAO;
import com.apoo.model.UserDetail;

public class UserTestCase {

	@Autowired
	static UserDAO userDAO;
	
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    context.scan("com.apoo");
	    context.refresh();
	    
	   userDAO = (UserDAO)context.getBean("userDAO");
	}
	
	
	@Test
	public void registerUserTest() 
	{
		UserDetail user=new UserDetail();
		
		user.setUsername("apoorva");
		user.setPassword("apoorva124");
		user.setRole("ROLE_ADMIN");
		user.setEnabled(true);
		user.setCustomerName("Apoorva Srivastava");
		user.setCustomerAddr("Ghaziabad");
		
	//	assertTrue("Problem in adding User:",userDAO.registerUser(user));
	}
}



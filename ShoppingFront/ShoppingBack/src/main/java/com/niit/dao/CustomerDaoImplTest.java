/**package com.niit.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Customer;

public class CustomerDaoImplTest1 {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,CustomerDaoImpl.class);
	@Test
	public void testRegisterCustomer() {
		Customer customer=new Customer();
		CustomerDao customerDao=(CustomerDao)context.getBean("customerDaoImpl");
		customerDao.registerCustomer(customer);
		assertTrue(customer.getId()>0);
	}

	@Test
	public void testIsEmailValid() {
		CustomerDao customerDao=(CustomerDao)context.getBean("customerDaoImpl");
		boolean actual=customerDao.isEmailValid("j.s@abc.com");//duplicate email address
		assertFalse(actual);
		boolean actual1=customerDao.isEmailValid("johny.smith@xyz.com");
		assertTrue(actual1);
	}

	@Test
	public void testIsUsernameValid() {
		
	}

	@Test
	public void testGetUser() {
		
	}

}
**/
/**package com.niit.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Cart;
import com.niit.model.CustomerOrder;

public class CartItemDaoImplTest {

	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,CartItemDaoImpl.class);
	CartItemDao cartItemDao=(CartItemDao)context.getBean("cartItemDaoImpl");
	@Test
	public void testSaveOrUpdateCartItem() {
		
	}

	@Test
	public void testRemoveCartItem() {
		
	}

	@Test
	public void testGetCart() {
		Cart cart=cartItemDao.getCart(33);
		assertNotNull(cart);
		Cart cart1=cartItemDao.getCart(45);
		assertNull(cart1);
	}

	@Test
	public void testCreateOrder() {
		Cart cart=cartItemDao.getCart(33);
		CustomerOrder customerOrder=cartItemDao.createOrder(cart);
		assertTrue(customerOrder.getOrderId()>0);
		assertTrue(customerOrder.getCart().getGrandTotal()==280000.0);
	}

}
**/
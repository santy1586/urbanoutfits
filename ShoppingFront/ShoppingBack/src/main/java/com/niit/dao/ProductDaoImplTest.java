/**package com.niit.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Product;
import com.niit.services.ProductServices;

public class ProductDaoImpl {
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
	@Test
	public void testGetAllProducts() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		List<Product>products = productDao.getAllProducts();
		assertTrue(products.size()>0);
	}

	@Test
	public void testGetProduct() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		Product product=productDao.getProduct(1);
		assertNotNull(product);
		Product product1=productDao.getProduct(405);
		assertNull(product1);
	}

	@Test
	public void testDeleteProduct() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		productDao.deleteProduct(11);
		Product product=productDao.getProduct(11);
		assertNull(product);
	}

	@Test
	public void testGetCategories() {
		
	}

	@Test
	public void testSaveOrUpdateProduct() {
		
	}

}
**/

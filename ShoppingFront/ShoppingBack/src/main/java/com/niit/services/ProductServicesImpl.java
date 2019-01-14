
package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Category;
import com.niit.model.Product;
@Service
@Transactional
public class ProductServicesImpl implements ProductServices {
@Autowired
private ProductDao ProductDao;
	public List<Product> getAllProducts() {
		return ProductDao.getAllProducts();
	}
	public Product getProduct(int id) {
		return ProductDao.getProduct(id);
	}
	public void deleteProduct(int id) {
		ProductDao.deleteProduct(id);
		
	}
	public List<Category> getAllCategories() {
		return ProductDao.getCategories();
	}
	public void saveOrUpdateProduct(Product Product) {
		ProductDao.saveOrUpdateProduct(Product);
		
	}
}

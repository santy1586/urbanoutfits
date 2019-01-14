
package com.niit.services;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductServices
{
	List<Product> getAllProducts();
	Product getProduct(int id);
	public void deleteProduct(int id);
	List<Category> getAllCategories();
	public void saveOrUpdateProduct(Product Product);
}

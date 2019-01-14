package com.niit.dao;

import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDao {
List<Product> getAllProducts(); //select * from product
Product getProduct(int id); //select * from product where id=?
void deleteProduct(int id); //delete from product where id=?
List<Category> getCategories();
void saveOrUpdateProduct(Product Product);
}

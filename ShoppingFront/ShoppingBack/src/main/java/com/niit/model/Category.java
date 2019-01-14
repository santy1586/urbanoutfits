package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String Categoryname;
@OneToMany(mappedBy="category")
private List<Product> Products;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategoryname() {
	return Categoryname;
}
public void setCategoryname(String categoryname) {
	this.Categoryname = categoryname;
}

}
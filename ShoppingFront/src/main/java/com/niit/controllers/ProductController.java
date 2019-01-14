
package com.niit.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.services.ProductServices;
@Controller
public class ProductController {
	@Autowired
private ProductServices ProductServices;
	@RequestMapping(value="/all/getallproducts")
public ModelAndView getAllProducts(){
	List<Product> Products=ProductServices.getAllProducts();
	
	return new ModelAndView("ProductList","productsAttr",Products);

}
	
	@RequestMapping(value="/all/viewproduct/{id}")
	public ModelAndView getProduct(@PathVariable int id){
		Product Product=ProductServices.getProduct(id);
		return new ModelAndView("ViewProduct","product",Product);
	}
	
	
	
	
	@RequestMapping(value="/admin/getproductform")
	public String getProductForm(@RequestParam(required=false)int id,Model model){
		if(id==0)//add product
		model.addAttribute("product",new Product());//1
		else{ //edit product
			Product Product=ProductServices.getProduct(id);//select * from product where id=?
			model.addAttribute("product",Product);
		}
		//SELECT * from Category
		List<Category> categoriesList=ProductServices.getAllCategories();
		model.addAttribute("categories",categoriesList);
		return "ProductForm";
	}
	@RequestMapping(value="/admin/deleteproduct/{id}")
		public String deleteProduct(HttpServletRequest request,@PathVariable int id){
		String rootDirectory=request.getServletContext().getRealPath("/");
		Path path=Paths.get(rootDirectory + "/WEB-INF/resources/images/"+id+".png");
		if(Files.exists(path)){
			try {
				Files.delete(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ProductServices.deleteProduct(id);
		return "redirect:/all/getallproducts";
	}
	
	
	@RequestMapping(value="/admin/saveorupdateproduct")
    public String saveorUpdateProduct(HttpServletRequest request,@Valid @ModelAttribute(name="product")  Product product,BindingResult result,Model model)
	{//3
		if(result.hasErrors())
		{
			List<Category> categories=ProductServices.getAllCategories();
			model.addAttribute("categories",categories);
			return "ProductForm";
		}
		System.out.println(product.getProductname());
    	ProductServices.saveOrUpdateProduct(product); //insert and update
    	String rootDirectory=request.getServletContext().getRealPath("/");
		System.out.println(rootDirectory);
		Path path=Paths.get(rootDirectory + "/WEB-INF/resources/images/"+product.getId()+".png");
		MultipartFile prodImage=product.getImage();
		
			try {
				prodImage.transferTo(new File(path.toString()));
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
    	
    			return "redirect:/all/getallproducts";
    }
	@RequestMapping("/all/product/searchbycategory")
	public String selectByCatagory(@RequestParam String searchCondition,Model model){
		model.addAttribute("productsAttr",ProductServices.getAllProducts());
		if(searchCondition.equals("All"))
			model.addAttribute("searchCondition","");
		else
		model.addAttribute("searchCondition",searchCondition);
		return "ProductList";
	}
	
	
	
	
}
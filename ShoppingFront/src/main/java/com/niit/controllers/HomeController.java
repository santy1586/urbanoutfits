package com.niit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.services.ProductServices;

@Controller
public class HomeController {
	public HomeController(){
		System.out.println("HomeController is instantiated");
	}
	@RequestMapping(value="/", method = RequestMethod.GET)
public String homePage(){
	return "home";//logical view name
}
	@RequestMapping("/aboutus")
public String aboutUs(){
	return "aboutus";
	}
	
	@RequestMapping("/contactus")
	public String contactus(){
		return "contactus";
	}

	//for logout -> /login?logout=''
		//for invalid credentials -> /login?error=''
		@RequestMapping("/login")
		public String loginPage(@RequestParam(required=false) String error,@RequestParam(required=false) String logout,Model model){
			if(error!=null)
			model.addAttribute("error","Invalid Username/Password");
			if(logout!=null)
				model.addAttribute("msg","Loggedout successfully");
			return "login";
		}
	
/**
	@RequestMapping(value="/home")
	public String homePage(HttpSession session){
			session.setAttribute("categories", ProductServices.getAllCategories());
		return "home";//logical view name
	}**/
	
}

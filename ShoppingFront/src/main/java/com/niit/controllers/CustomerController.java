
package com.niit.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Customer;
import com.niit.services.CustomerServices;

@Controller
public class CustomerController {
	@Autowired
private CustomerServices CustomerServices;
@RequestMapping(value="/all/registrationform") 	
public    ModelAndView  getRegistrationForm(){
	return new ModelAndView("RegistrationForm","customer",new Customer());
}
@RequestMapping(value="/all/registercustomer")
public String registerCustomer(@Valid @ModelAttribute Customer customer,BindingResult result,Model model){
	if(result.hasErrors())//hibernate validation
		return "RegistrationForm";
	if(!CustomerServices.isUsernameValid(customer.getUser().getUsername())){//duplicate username
		model.addAttribute("duplicateUsername","Username already exists.. please enter different username");
		return "RegistrationForm";
	}
	if(!CustomerServices.isEmailValid(customer.getEmail())){//duplicate email address
		model.addAttribute("duplicateEmail","Email Id already exists.. Please enter different email address");
		return "RegistrationForm";
	}
	
	CustomerServices.registerCustomer(customer);//valid 
	return "login";
}
}

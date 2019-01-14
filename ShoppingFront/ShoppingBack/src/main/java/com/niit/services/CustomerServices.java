
package com.niit.services;

import com.niit.model.Customer;
import com.niit.model.User;

public interface CustomerServices {
void registerCustomer(Customer customer);
boolean isEmailValid(String email);
boolean isUsernameValid(String username);
User getUser(String username);
}

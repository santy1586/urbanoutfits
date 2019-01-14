
package com.niit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;
@Service
public class CartItemServicesImpl implements CartItemServices{
	@Autowired
	private CartItemDao cartItemDao;
	public void saveOrUpdateCartItem(CartItem cartItem){
		cartItemDao.saveOrUpdateCartItem(cartItem);
	}
	public void removeCartItem(int cartItemId) {
		cartItemDao.removeCartItem(cartItemId);
		
	}
	public Cart getCart(int cartId) {
		
		return cartItemDao.getCart(cartId);
	}
	public CustomerOrder createOrder(Cart cart){
		
		return cartItemDao.createOrder(cart);
	}
}

package com.apoo.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.apoo.dao.CartDAO;
import com.apoo.model.CartItem;

public class CartDAOImpl implements CartDAO{
@Autowired 
SessionFactory sessionFactory;

@Override
public boolean addCartItem(CartItem cartitem) {
	try
	{
		sessionFactory.getCurrentSession().save(cartitem);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

@Override
public boolean deleteCartItem(CartItem cartitem) {
	try
	{
		sessionFactory.getCurrentSession().delete(cartitem);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

@Override
public boolean updateCartItem(CartItem cartitem) {
	try
	{
		sessionFactory.getCurrentSession().update(cartitem);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	
}

@Override
public List<CartItem> listCartItem(String username) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public CartItem getCartItem(int cartItemId) {
	// TODO Auto-generated method stub
	return null;
}
}

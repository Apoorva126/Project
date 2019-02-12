package com.apoo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.CartDAO;
import com.apoo.model.CartItem;

public class CartTestCase {

static CartDAO cartDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.apoo");
		context.refresh();	
		cartDAO=(CartDAO)context.getBean("cartDAO");
		
	}

	@Test
	public void addCartTest() 
	{
	CartItem cartItem=new CartItem();
	cartItem.setProductId(223);
	cartItem.setProductName("Samsung j6 Max");
	cartItem.setQuantity(60);
	cartItem.setPrice(17000);
	cartItem.setPaymentStatus("NP");
	cartItem.setUsername("apoorva");
	assertTrue("problem in Adding into Cart",cartDAO.addCartItem(cartItem));
		
     }

/*
@Test
public void updateCartItemTest()
{
CartItem cartItem=cartDAO.getCartItem(223);
cartItem.setQuantity(61);
assertTrue("problem in Upading the Cart",cartDAO.updateCartItem(cartItem));

} 

@Test
public void deleteCartItemTest()
{
	CartItem cartItem=cartDAO.getCartItem(226);
	assertTrue("problem in deleting the CartItem",cartDAO.deleteCartItem(cartItem));


}


	@Test
	public void displayCartItems()
	{
		List<CartItem> listCartItems=cartDAO.listCartItem("apoorva");
		
		assertTrue("problem in Displaying the CartItems",listCartItems.size()>0);
		
		for(CartItem cartItem:listCartItems)
		{
			System.out.print(cartItem.getProductId()+"\t");
			System.out.print(cartItem.getProductName()+"\t");
			System.out.print(cartItem.getPrice()+"\t");
			System.out.println(cartItem.getPrice()*cartItem.getQuantity());
		}}
		*/
	
	
}
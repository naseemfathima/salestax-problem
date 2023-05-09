package com.interview.makkajai;

import java.math.BigDecimal;

public class Main {

	  public static void main(String[] args) {
		  
		    ShoppingCart cart1 = new ShoppingCart();
		    cart1.addItem(new Item(1, "book", new BigDecimal("12.49"), false, true));
		    cart1.addItem(new Item(1, "music CD", new BigDecimal("14.99"), false, false));
		    cart1.addItem(new Item(1, "chocolate bar", new BigDecimal("0.85"), false, true));
		    cart1.calculateTotal();
		    cart1.printReceipt();
		    
		    ShoppingCart cart2 = new ShoppingCart();
	        cart2.addItem(new Item(1, "box of chocolates", new BigDecimal("10.00"), true, true));
	        cart2.addItem(new Item(1, "bottle of perfume", new BigDecimal("47.50"), true, false));
	        cart2.calculateTotal();
	        cart2.printReceipt();

	        ShoppingCart cart3 = new ShoppingCart();
	        cart3.addItem(new Item(1, "imported bottle of perfume", new BigDecimal("27.99"), true, false));
	        cart3.addItem(new Item(1, "bottle of perfume", new BigDecimal("18.99"), false, false));
	        cart3.addItem(new Item(1, "pack of headpills", new BigDecimal("9.75"), false, true));
	        cart3.addItem(new Item(1, "box of imported chocolates", new BigDecimal("11.25"), true, true));
	        cart3.calculateTotal();
	        cart3.printReceipt();



	  }
}
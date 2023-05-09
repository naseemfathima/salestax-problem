package com.interview.makkajai;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	private BigDecimal totalSalesTax;
	private BigDecimal totalAmount;

	public ShoppingCart() {
		items = new ArrayList<>();
		totalSalesTax = BigDecimal.ZERO;
		totalAmount = BigDecimal.ZERO;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void calculateTotal() {
		for (Item item : items) {
			BigDecimal salesTax = calculateSalesTax(item);
			BigDecimal itemTotal = item.getPrice().add(salesTax);
			totalSalesTax = totalSalesTax.add(salesTax);
			totalAmount = totalAmount.add(itemTotal);
			item.setTotal(itemTotal);
		}
	}

	private BigDecimal calculateSalesTax(Item item) {
		BigDecimal salesTax = BigDecimal.ZERO;
		BigDecimal taxRate = item.isExempt() ? BigDecimal.ZERO : new BigDecimal("0.10");
		salesTax = salesTax.add(item.getPrice().multiply(taxRate));
		if (item.isImported()) {
			salesTax = salesTax.add(item.getPrice().multiply(new BigDecimal("0.05")));
		}
		return roundUp(salesTax);
	}

	private BigDecimal roundUp(BigDecimal value) {
		BigDecimal roundedSalesTax = value.divide(new BigDecimal("0.05"), 0, RoundingMode.UP)
				.multiply(new BigDecimal("0.05"));
		return roundedSalesTax;
	}

	public void printReceipt() {
		System.out.println("Output: ");
		for (Item item : items) {
			System.out.println(item.toString());
		}
		System.out.println("Sales Taxes: " + totalSalesTax);
		System.out.println("Total: " + totalAmount);
		System.out.println();
	}
}

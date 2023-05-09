package com.interview.makkajai;

import java.math.BigDecimal;

public class Item {

		private int quantity;
		private String name;
	    private BigDecimal price;
	    private boolean isImported;
	    private boolean isExempt;
	    private BigDecimal total;
	    
	    public Item(int quantity, String name, BigDecimal price, boolean isImported, boolean isExempt) {
			super();
			
			this.quantity = quantity;
			this.name = name;
			this.price = price;
			this.isImported = isImported;
			this.isExempt = isExempt;
		}
	    
	    public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getName() {
	        return name;
	    }

	    public BigDecimal getPrice() {
	        return price;
	    }

	    public boolean isImported() {
	        return isImported;
	    }

	    public boolean isExempt() {
	        return isExempt;
	    }

	    public BigDecimal getTotal() {
	        return total;
	    }

	    public void setTotal(BigDecimal total) {
	        this.total = total;
	    }

	    @Override
	    public String toString() {
	        return quantity +" "+ name + ": " + total;
	    }
}

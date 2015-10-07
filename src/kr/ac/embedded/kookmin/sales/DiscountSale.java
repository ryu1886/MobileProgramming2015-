package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/** 구현 하시오 **/ 
		this.discount = 0;
		
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** 구현 하시오 **/ 
		this.setName(theName);
		this.setPrice(thePrice);
		this.setDiscount(theDiscount);
		
	
	}
	
	
	public DiscountSale(DiscountSale originalObject) {
		/** 구현 하시오 **/ 
		if (originalObject == null) {
			System.out.println("Error: null DiscountSale object.");
			System.exit(0);
		}
		super.setName(originalObject.getName());
		super.setPrice(originalObject.getPrice());		
		discount =originalObject.discount;
	}
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		/** 구현 하시오 **/ 
		return super.bill()*(100-discount)/100;
	}
	
	public double getDiscount() {
		/** 구현 하시오 **/ 
		
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** 구현 하시오 **/ 
		if (newDiscount >= 0)
				discount = newDiscount;
		else{	
				System.out.println("Error : Negative discount.");
				System.exit(0);
		}
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			DiscountSale otherSale = (DiscountSale) otherObject;
			return (super.getName().equals(otherSale.getName()) && (super.getPrice() == otherSale.getPrice()));
		}
	}
	
	public DiscountSale clone() {
		/** 구현 하시오....  임시생성자 사용 **/ 
			return new DiscountSale(this);
	}
}


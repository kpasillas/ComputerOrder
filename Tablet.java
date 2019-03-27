// Filename Tablet.java
// Written by Kristopher Pasillas
// Written on 12/13/17

public class Tablet extends Computer
{
	final private double COUPON = 20.00;
	private Boolean applyCoupon;
	
	public Tablet(int warranty, double price, String manufacturer, Boolean applyCoupon)
	{
		super(warranty, price, manufacturer);
		this.applyCoupon = applyCoupon;
		
		if(getApplyCoupon())
			setPrice(getPrice() - COUPON);
	}
	
	public void displayInfo()
	{
		System.out.println("\nTablet\n");
		System.out.println("Manufacturer: " + getManufacturer());
		
		if(getApplyCoupon())
			System.out.println("Coupon applied");
		
		System.out.println("Price: " + fmt.format(getPrice()));
		System.out.println("Warranty: " + getWarranty() + " year(s)");
	}

	public Boolean getApplyCoupon() {
		return applyCoupon;
	}

	public void setApplyCoupon(Boolean applyCoupon) {
		this.applyCoupon = applyCoupon;
	}
}

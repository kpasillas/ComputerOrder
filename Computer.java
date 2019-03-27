// Filename Computer.java
// Written by Kristopher Pasillas
// Written on 12/13/17

import java.text.NumberFormat;

public class Computer
{
	private int warranty;
	private double price;
	private String manufacturer;
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public Computer(int warranty, double price, String manufacturer)
	{
		this.warranty = warranty;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	
	public void displayInfo()
	{
		System.out.println("DesktopComputer\n");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Price: " + fmt.format(getPrice()));
		System.out.println("Warranty: " + getWarranty() + " year(s)");
	}
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}

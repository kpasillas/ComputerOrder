// Filename ComputerOrder.java
// Written by Kristopher Pasillas
// Written on 12/13/17

public class ComputerOrder
{

	public static void main(String[] args)
	{
		Computer computer1 = new Computer(2, 450.00, "HP");
		Tablet tablet1 = new Tablet(1, 399.99, "Samsung", true);
		Tablet tablet2 = new Tablet(1, 599.99, "Apple", false);
		
		computer1.displayInfo();
		tablet1.displayInfo();
		tablet2.displayInfo();
	}

}

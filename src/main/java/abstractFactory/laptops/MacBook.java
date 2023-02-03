package abstractFactory.laptops;

public class MacBook implements Laptop{
	@Override
	public void greet() {
		System.out.println("Hello! You have created a new Macbook");
	}
}

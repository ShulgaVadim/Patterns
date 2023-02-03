package abstractFactory.phones;

public class SamsungPhone implements Phone{
	@Override
	public void greet() {
		System.out.println("Hello! You have created a new Samsung Phone");
	}
}

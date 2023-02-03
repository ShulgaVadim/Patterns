package abstractFactory.phones;

public class IPhone implements Phone{
	@Override
	public void greet() {
		System.out.println("Hello! You have created a new IPhone");
	}
}

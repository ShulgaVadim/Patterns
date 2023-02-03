package facade.money;

public class Dollar implements Money {
	@Override
	public void print() {
		System.out.println("You printed US dollars $$$");
	}
}

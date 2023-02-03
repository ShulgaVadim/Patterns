package facade.money;

import facade.money.Money;

public class Peso implements Money {
	@Override
	public void print() {
		System.out.println("You printed Mexican Pesos");
	}
}

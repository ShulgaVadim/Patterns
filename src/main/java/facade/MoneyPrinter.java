package facade;

import facade.money.Dollar;
import facade.money.Euro;
import facade.money.Peso;

public class MoneyPrinter {
	private Dollar dollar;
	private Euro euro;
	private Peso peso;

	public MoneyPrinter() {
		dollar = new Dollar();
		euro = new Euro();
		peso = new Peso();
	}

	public void printDollars() {
		dollar.print();
	}

	public void printEuros() {
		euro.print();
	}

	public void printPesos() {
		peso.print();
	}

}




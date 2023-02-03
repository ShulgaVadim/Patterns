package facade;

public class MoneyApp {
	public static void main(String[] args) {
		MoneyPrinter printer = new MoneyPrinter();
		printer.printDollars();
		printer.printEuros();
		printer.printPesos();
	}
}

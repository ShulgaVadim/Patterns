package abstractFactory;

import abstractFactory.factories.AppleFactory;
import abstractFactory.factories.Factory;
import abstractFactory.factories.SamsungFactory;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		FactoryApp app = configureApplication();
		app.init();
	}

	private static FactoryApp configureApplication() {
		FactoryApp app;
		Scanner scanner = new Scanner(System.in);
		Factory factory = null;
		showMenu();
		int command = scanner.nextInt();
		if (command == 1 ) {
			factory = new AppleFactory();
		}
		else if (command == 2 ) {
			factory = new SamsungFactory();
		} else {
			System.out.println("Incorrect command");
			System.exit(0);
		}
		scanner.close();
		app = new FactoryApp(factory);
		return app;
	}

	public static void showMenu() {
		System.out.println("\nEnter brand:");
		System.out.println("1 - Apple");
		System.out.println("2 - Samsung");
	}
}

package abstractFactory;

import abstractFactory.factories.Factory;
import abstractFactory.laptops.Laptop;
import abstractFactory.phones.Phone;

public class FactoryApp {
	private Phone phone;
	private Laptop laptop;

	public FactoryApp(Factory factory) {
		phone = factory.createPhone();
		laptop = factory.createLaptop();
	}

	public void init() {
		phone.greet();
		laptop.greet();
	}

}

package abstractFactory.factories;

import abstractFactory.laptops.Laptop;
import abstractFactory.laptops.MacBook;
import abstractFactory.phones.IPhone;
import abstractFactory.phones.Phone;

public class AppleFactory implements Factory{
	@Override
	public Phone createPhone() {
		return new IPhone();
	}

	@Override
	public Laptop createLaptop() {
		return new MacBook();
	}
}

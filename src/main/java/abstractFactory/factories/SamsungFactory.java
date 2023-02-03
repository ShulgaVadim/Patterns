package abstractFactory.factories;

import abstractFactory.laptops.Laptop;
import abstractFactory.laptops.SamsungLaptop;
import abstractFactory.phones.Phone;
import abstractFactory.phones.SamsungPhone;

public class SamsungFactory implements Factory{
	@Override
	public Phone createPhone() {
		return new SamsungPhone();
	}

	@Override
	public Laptop createLaptop() {
		return new SamsungLaptop();
	}
}

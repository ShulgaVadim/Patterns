package abstractFactory.factories;

import abstractFactory.laptops.Laptop;
import abstractFactory.phones.Phone;

public interface Factory {
	Phone createPhone();
	Laptop createLaptop();
}

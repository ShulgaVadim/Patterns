package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		System.out.println(WebDriverSingleton.getInstance().toString());
		WebDriverSingleton.quitDriver();
		System.out.println(WebDriverSingleton.getInstance().toString());
		WebDriverSingleton.quitDriver();
	}
}

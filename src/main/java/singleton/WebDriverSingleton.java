package singleton;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

	private static volatile ThreadLocal<WebDriver> driver = new InheritableThreadLocal<>();

	private WebDriverSingleton() {
	}

	public static WebDriver getInstance() {
		if (driver.get() == null) {
			synchronized (WebDriverSingleton.class) {
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver());
			}
		}
		return driver.get();
	}

	public static void quitDriver() {
		driver.get().quit();
		driver.set(null);
	}
}

package jan15_browserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWithBrowserStack {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://aparajeeta_guXlID:Vnbh6wLe9HonykepqpYd@hub.browserstack.com/wd/hub");
		
		DesiredCapabilities desCap = new DesiredCapabilities();
		desCap.setCapability("os", "Windows");
		desCap.setCapability("osVersion", "11");
		desCap.setCapability("browserVersion", "latest");
		desCap.setCapability("local", "true");
		desCap.setCapability("seleniumVersion", "3.5.2");
		WebDriver driver = new RemoteWebDriver(url, desCap);
		
		driver.get("https://learn-automation.com/");
		
		System.out.println("Title is:"+driver.getTitle());
		
		driver.quit();

	}

}

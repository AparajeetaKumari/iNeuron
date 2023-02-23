package seleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();		
		//FirefoxDriver firefoxDriver = new FirefoxDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("title is::"+title);
		System.out.println("Url is::"+url);
		driver.get("https://www.facebook.com/");
		
	    title = driver.getTitle();
		
		System.out.println("title is::"+title);
		System.out.println("Url is::"+url);
		
		//firefoxDriver.get("https://www.facebook.com/");
		
		driver.quit();
		
	}

}

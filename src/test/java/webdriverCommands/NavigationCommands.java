package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
//		Navigation nav = driver.navigate();
//		nav.back();
		
		driver.navigate().back();
		

	}

}

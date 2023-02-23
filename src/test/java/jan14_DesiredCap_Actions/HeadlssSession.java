package jan14_DesiredCap_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlssSession {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.udemy.com/course");
		System.out.println("Page title is::"+ driver.getTitle());
		
		System.out.println("Page Url is::"+ driver.getCurrentUrl());
		
		driver.quit();

	}

}

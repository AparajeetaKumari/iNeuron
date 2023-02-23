package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec11WindowHandler2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parebtWindowHandler= driver.getWindowHandle();
		System.out.println("Parent window is::"+parebtWindowHandler);
		System.out.println("current url is :"+driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://ineuron-courses.vercel.app/signup");
		System.out.println(driver.getWindowHandles());
		
		System.out.println("current url is :"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parebtWindowHandler);
		System.out.println("current url is :"+driver.getCurrentUrl());

	}

}

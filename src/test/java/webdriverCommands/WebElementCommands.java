package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		
		WebElement element = driver.findElement(By.id("email1"));
		element.sendKeys("ineuron@ineuron.ai");
		//element.clear();
		System.out.println("Is displayed ::"+element.isDisplayed());
		System.out.println("Is enabled ::"+element.isEnabled());
		
		System.out.println("CSS vales ::"+element.getCssValue("font-size"));
		System.out.println("Values is ::"+element.getAttribute("value"));
		WebElement password = driver.findElement(By.id("password1"));
		password.sendKeys("ineuron");
		WebElement submit = driver.findElement(By.className("submit-btn"));
		submit.click();
		//driver.close();
		
	}

}

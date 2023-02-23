package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementExample8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("mukesh otwani");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));
		System.out.println("size is::"+options.size());
		
		for (WebElement webElement : options) {
			System.out.println("Text displayed is:"+webElement.getText());
			if(webElement.getText().contains("selenium")) {
			   webElement.click();
			   break;
			}
		}
		
		driver.quit();

	}

}

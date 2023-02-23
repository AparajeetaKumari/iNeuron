package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class findElementsExample1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement loginIn = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
	loginIn.click();
	
	Thread.sleep(2000);
	
	Select months = new Select(driver.findElement(By.id("month")));
	List<WebElement> monthList = months.getOptions();
	for (WebElement webElement : monthList) {
		System.out.println(webElement.getText());
	}
	
	List<String> newList = new ArrayList<String>();
	for (WebElement string : monthList) {
		newList.add(string.getText());
	}
	
	
	

	}

}

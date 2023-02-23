package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://login.yahoo.com/");
		WebElement logIn = driver.findElement(By.xpath("//input[@id='persistent']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logIn);
		
	}

}

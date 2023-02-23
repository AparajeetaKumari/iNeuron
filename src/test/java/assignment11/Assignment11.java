package assignment11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment11 {
	
	@Test
	public void verifyWait() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver .get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Reporter.log("click on timer", true);
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
		
		Reporter.log("Wait for text webdriver to be visible", true);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='WebDriver']")));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//p[@id='demo']")),"WebDriver" ));
		Reporter.log("Text displayed on screen is ::"+driver.findElement(By.xpath("//p[normalize-space()='WebDriver']")).getText(), true);
		
		driver.quit();	
		
	}

}

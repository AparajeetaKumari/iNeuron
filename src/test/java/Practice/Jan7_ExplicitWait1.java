package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jan7_ExplicitWait1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click me to start')]"));
		button.click();
		
		new WebDriverWait(driver, Duration.ofSeconds(1000)).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//p[contains(text(),'WebDriver')]"))));
		

	}

}

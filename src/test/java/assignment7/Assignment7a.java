package assignment7;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment7a {
	
	WebDriver driver ;
	@Test(description = "Verify login and logout",priority = 4, dataProvider = "data-provider",dataProviderClass = DP.class)
	public void verifyLoginLogout(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//open the website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for page to laod completely
		driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='oxd-userdropdown-tab']")));
		driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).click();
		//wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@role='menu']"), 1));
		driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("login"));
		driver.quit();
		
		
	}
  
}

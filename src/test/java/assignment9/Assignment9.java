package assignment9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment9 {

	@Test
	public void verifyUserCreation() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String email ="aparajeetaTestUser114@gmail.com";
		String password ="test@123";
		
		Reporter.log("Launch the website", true);
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		Reporter.log("Verify signup button is disabled", true);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='content']")));
		Assert.assertFalse(driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled());
		
		Reporter.log("Fill in all details", true);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("AparajeetaTestUser");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		
		driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click();
		
		Select states= new Select(driver.findElement(By.xpath("//select[@name='state']")));
		states.selectByValue("Jharkhand");
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='login-form']")));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Assert.assertNotNull(driver.findElement(By.xpath("//h1[text()='iNeuron Courses']")));
		
		
		
	}

}

package assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment6_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//3 xpath for username
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		Assert.assertNotNull(username);
		
		username = driver.findElement(By.xpath("(//div[contains(@class, 'input')]//input)[1]"));
		Assert.assertNotNull(username);
		
		username = driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
		Assert.assertNotNull(username);
		
		//3 CSS selectors
		username = driver.findElement(By.cssSelector("input[name=username]"));
		Assert.assertNotNull(username);
		
		username = driver.findElement(By.cssSelector("input[placeholder=Username]"));
		Assert.assertNotNull(username);
		
		username = driver.findElement(By.cssSelector("input.oxd-input[name=username]"));
		Assert.assertNotNull(username);
		
		//3 xpath for password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		Assert.assertNotNull(password);
		
		password = driver.findElement(By.xpath("//div[contains(@class, 'input')]//input[@name='password']"));
		Assert.assertNotNull(password);
		
		password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		Assert.assertNotNull(password);
		
		//3 CSS selectors
		password = driver.findElement(By.cssSelector("input[name=password]"));
		Assert.assertNotNull(password);
		
		password = driver.findElement(By.cssSelector("input[placeholder=Password]"));
		Assert.assertNotNull(password);
		
		password = driver.findElement(By.cssSelector("input.oxd-input[name=password]"));
		Assert.assertNotNull(password);
		
		
		//3 xpath for login button
		WebElement loginButton = driver.findElement(By.xpath("//button"));
		Assert.assertNotNull(loginButton);
		
		loginButton = driver.findElement(By.xpath("//div[contains(@class, 'oxd-form-actions')]//button"));
		Assert.assertNotNull(loginButton);
		
		loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertNotNull(loginButton);
		
		//3 CSS selectors
		loginButton = driver.findElement(By.cssSelector("button[type=submit]"));
		Assert.assertNotNull(loginButton);
		
		loginButton = driver.findElement(By.cssSelector("button.oxd-button"));
		Assert.assertNotNull(loginButton);
		
		loginButton = driver.findElement(By.cssSelector("div.orangehrm-login-action button.orangehrm-login-button"));
		Assert.assertNotNull(loginButton);
		
		System.out.print("Completed");
		
		
		driver.quit();
		

	}

}

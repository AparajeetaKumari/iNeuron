package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_5_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);		
		WebElement loginLogo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img"));
		Assert.assertNotNull(loginLogo.getAttribute("src"));
		System.out.println("Logo is present::"+loginLogo.getAttribute("src"));
		driver.quit();
	}

}

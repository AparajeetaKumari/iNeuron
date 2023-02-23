package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_5_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Assert.assertTrue(url.endsWith("login"));
		Assert.assertTrue(url.contains("demo"));
		Assert.assertTrue(title.contains("HRM"));
		
		driver.quit();

	}

}

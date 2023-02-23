package assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_5_3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		List<WebElement> footers = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		//convert list to set to avoid any duplicate values
		Set<WebElement> footerSet = new HashSet<WebElement>();
		for (WebElement webElement : footers) {
			footerSet.add(webElement);
		}
		
		Assert.assertEquals(footerSet.size(), 4,"4 footer links should be visibles");


	}

}

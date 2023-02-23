package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_5_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		List<WebElement> hrefSocialMedia = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		Assert.assertEquals(hrefSocialMedia.size(),4,"All 4 href for social media is not present");
		
		for (WebElement webElement : hrefSocialMedia) {
			System.out.println(webElement.getAttribute("href"));
			if(webElement.getAttribute("href").contains("youtube")) {
				break;
			}
		}
		
		driver.quit();
		
	}

}

package assignments;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		List<WebElement> footers = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		//convert list to set to avoid any duplicate values
		System.out.println("Footer size is ::"+footers.size());
		for (WebElement webElement : footers) {
			String href = webElement.getAttribute("href");
			if(href.contains("linkedin")) {
				System.out.print("Linkedin - ");
			}else if(href.contains("facebook")) {
				System.out.print("FaceBook - ");
			}else if(href.contains("twitter")) {
				System.out.print("Twitter - ");
			}else if(href.contains("youtube")) {
				System.out.print("Youtube - ");
			}
			System.out.println(webElement.getAttribute("href"));
		}
		
		driver.quit();
				
	}

}

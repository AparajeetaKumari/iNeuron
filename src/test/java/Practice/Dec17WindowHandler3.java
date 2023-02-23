package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec17WindowHandler3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://ineuron-courses.vercel.app/login");
		String parentWindowHandler = driver.getWindowHandle();
		System.out.println("Parent handler is::"+parentWindowHandler);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='social-btns']//a"));
		
		for(WebElement link:links) {
			link.click();
		}
		
		Set<String> windowHandlers = driver.getWindowHandles();
		System.out.println("windo handles::"+windowHandlers);
		Iterator<String> itr = windowHandlers.iterator();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			if(driver.getTitle().contains("LinkedIn")) {
				System.out.println("LinkedIn is found");
				break;
			}
		}
		
		driver.switchTo().window(parentWindowHandler);
		driver.quit();

	}

}

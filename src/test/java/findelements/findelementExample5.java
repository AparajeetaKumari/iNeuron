package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementExample5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//find element by xpath which has href
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
//		System.out.println(allLinks.size());
//		for (WebElement webElement : allLinks) {
//			//System.out.println("Link text is ::"+webElement.getText());
//			//System.out.println("Link text is ::"+webElement.getAttribute("innerHTML"));
//			//System.out.println("Link text is ::"+webElement.getAttribute("outerHTML"));
//			System.out.println("Link text is ::"+webElement.getAttribute("href"));
//		}
		
		List<WebElement> allImages = driver.findElements(By.xpath("//img[@src]"));
		System.out.println(allImages.size());
		for (WebElement webElement : allImages) {
			//System.out.println("Link text is ::"+webElement.getText());
			//System.out.println("Link text is ::"+webElement.getAttribute("innerHTML"));
			//System.out.println("Link text is ::"+webElement.getAttribute("outerHTML"));
			System.out.println("Link text is ::"+webElement.getAttribute("src"));
		}

	}

}

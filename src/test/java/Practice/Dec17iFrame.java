package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Dec17iFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@href,'practise')]"));
		element.click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src,'ineuron')]"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		driver.switchTo().defaultContent();
	

	}

}

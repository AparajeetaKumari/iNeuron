package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec11windowHandler {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String windowHandler = driver.getWindowHandle();
		System.out.println("Window handler value is ::"+windowHandler);
		
		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		youtube.click();
		
		Set<String> windowhandlers = driver.getWindowHandles();
		
		System.out.println("All window handlers are::"+windowhandlers);
		
		//set does not have index so convert it to list
		List<String> listOfwindowhandlers = new ArrayList<String>(windowhandlers);
		
		System.out.println("Parent handler is::"+listOfwindowhandlers.get(0));
		System.out.println("Child handler is::"+listOfwindowhandlers.get(1));
		
		driver.switchTo().window(listOfwindowhandlers.get(1));
		
		System.out.println("Title of new tab"+driver.getTitle());
		
		driver.quit();
		
	
		
		

	}

}

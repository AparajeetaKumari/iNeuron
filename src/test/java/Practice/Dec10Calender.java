package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dec10Calender {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//option1 explicitly enter date in the text box
		//WebElement datepickerInputbox = driver.findElement(By.xpath("//input[@id='datepicker']"));
		//datepickerInputbox.sendKeys("02/03/2023");
		
		
		//Option 2 click on next icon to get desired month and select desired date
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='datepicker']")));
		WebElement datepickerInputbox = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepickerInputbox.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-datepicker-div']")));
//		
//		WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
//		if(!month.getText().equalsIgnoreCase("April")) {
//			WebElement next = driver.findElement(By.xpath("//a[contains(@title,'Next')]"));
//			next.click();
//		}
//		
//		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'24')]"));
//		date.click();
//		
		
		//option 3
		List<WebElement> allDates = driver.findElements(By.xpath("//table[contains(@class,'datepicker-calendar')]//a"));
		
		for(WebElement dateVal:allDates) {
			System.out.println(dateVal.getText());
			if(dateVal.getText().equals("24")) {
				dateVal.click();
				break;
			}
		}
		
		

		

	}

}

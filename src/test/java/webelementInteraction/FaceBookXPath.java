package webelementInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookXPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparajeeta");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Kumari");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("aparajeeta.kumari@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("aparajeeta.kumari@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Aparajeeta_500");
		WebElement day= driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select selectDate = new Select(day);
		selectDate.selectByValue("10");
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("1");
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1995");
		driver.findElement(By.xpath("//label[text()='Female']//following-sibling::input")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		

	}

}

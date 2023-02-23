package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dec10FileUploader {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("/Users/mukeshotwani/Desktop/CodeForException1.zip");

	}

}

package assignment6;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Assignment6_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		Reporter.log("Initiate Webdriver", true);
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
			
		Reporter.log("Enter valid username and password to login", true);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")));
		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		username.sendKeys("Admin");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Password')]")));
		WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		loginButton.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		Thread.sleep(1000);
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"));
		
		Thread.sleep(1000);
	
		WebElement addNewUser = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addNewUser.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSystemUser"));
		
		Thread.sleep(1000);
		
		WebElement userRoleSelectBox = driver.findElement(By.xpath("//*[text()='User Role']//following::div[1]"));
		userRoleSelectBox.click();
		
		WebElement userRole = driver.findElement(By.xpath("//div[@role='option']//span[contains(text(),'Admin')]"));
		System.out.println("Value selected is ::"+userRole.getText());
		userRole.click();
		
		js.executeScript("return document.readyState").equals("complete");


		WebElement 	employeeName = driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input[1]"));
		employeeName.sendKeys("A");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='oxd-autocomplete-option']"),1));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='option']"),1));
		List<WebElement> dropdownValues = driver.findElements(By.xpath("//div[@role='option']"));
		System.out.println("Drop down size is::"+dropdownValues.size());
		for (WebElement dropdown : dropdownValues) {
			System.out.println(dropdown.getText());
			if(dropdown.getText().contains("Odis Adalwin")) {
				System.out.println("Selected value is::"+dropdown.getText());
				action.moveToElement(dropdown).click().perform();
				break;
			}		}
	
		WebElement statusDropDown = driver.findElement(By.xpath("//*[text()='Status']//following::div[1]//i"));
		statusDropDown.click();
		
		WebElement status = driver.findElement(By.xpath("//div[@role='option']//span[contains(text(),'Enabled')]"));
		System.out.println("Value selected is ::"+status.getText());
		action.moveToElement(status).click().perform();
		
		
		WebElement userName = driver.findElement(By.xpath("//*[contains(text(),'Username')]//following::input[1]"));
		userName.sendKeys("Aparajeeta1");
		
	
		WebElement enterpassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		
		String passwordIs = "Appu@123";
		js.executeScript("arguments[0].value=arguments[1]",enterpassword,passwordIs);
	
		
		WebElement confirmPassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		js.executeScript("arguments[0].value=arguments[1]",confirmPassword,passwordIs);
		
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		Reporter.log(save.getText(), true);
		//wait.until(ExpectedConditions.elementToBeClickable(save));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",save);
		action.moveToElement(save).click().perform();
		
//		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Admin123')]/ancestor::div[@role='row']")));
//		 Assert.assertNotNull(driver.findElement(By.xpath("//div[contains(text(),'Admin123')]/ancestor::div[@role='row']")));
//		
		
		
		
		
		//driver.quit();

	}

}

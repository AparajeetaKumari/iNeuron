package assignment6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment6_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		
		Thread.sleep(1000);
		
		System.out.println("Xpath to get all the elements in side panel");
		WebElement sidePanelAllElements = driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
		
		System.out.println("Number of elements in side panel are::"+sidePanelAllElements.getSize());
		System.out.println("sideList::"+sidePanelAllElements.getText());
		
		Thread.sleep(2000);
//		
//		WebElement sideList = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']"));
//		System.out.println("sideList::"+sideList.getText());
//		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();
		Thread.sleep(2000);		
		WebElement add = driver.findElement(By.xpath("//div[@class='orangehrm-header-container']//button"));
		add.click();
		Thread.sleep(1000);
		
//		WebElement addUser = driver.findElement(By.xpath("//h6[text()='Add User']"));
//		Assert.assertNotNull(addUser);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("saveSystemUser"));
		
		
		WebElement employeeName =driver.findElement(By.xpath("//div[contains(@class,'oxd-autocomplete-text-input')]//input"));
		Assert.assertNotNull(employeeName);
	    employeeName = driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[contains(@class,'oxd-grid-item')][2]//input"));
	    Assert.assertNotNull(employeeName);
	    employeeName = driver.findElement(By.xpath("//label[contains(text(),'Employee Name')]//parent::div/following-sibling::div//input"));
	    Assert.assertNotNull(employeeName);
	    employeeName.sendKeys("A");
	    
	    System.out.println("Web elemnets for employee name");
	  
	    Thread.sleep(1000);
	    WebElement userRole = driver.findElement(By.xpath("//*[normalize-space(text()) = 'User Role']	//div[@class='oxd-select-text oxd-select-text--active']"));
	    userRole = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
	    userRole = driver.findElement(By.xpath("(//*[contains(text(),'Select')])[1]"));
	    Assert.assertNotNull(userRole.getText());
	    
	    WebElement status = driver.findElement(By.xpath("(//*[contains(text(),'Select')])[1]"));
	    status = driver.findElement(By.xpath("//*[contains(text(),'Status')]/parent::div/following-sibling::div"));
	    status = driver.findElement(By.xpath("(//*[@class='oxd-select-text oxd-select-text--active'])[2]"));
	    Assert.assertNotNull(status.getText());
	    
	    WebElement username = driver.findElement(By.xpath("//*[normalize-space(text()) = 'Username']//parent::div/following-sibling::div"));
	    username= driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[4]"));
	    username = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active oxd-input--error'])[1]"));
		Assert.assertNotNull(username.getText());
		
		
		 WebElement passwordData = driver.findElement(By.xpath("//*[normalize-space(text()) = 'Password']//parent::div/following-sibling::div"));
		 passwordData= driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]"));
		 passwordData = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error'])[2]"));
			Assert.assertNotNull(passwordData.getText());
	    
	    
//	    WebElement userrole = driver.findElement(By.xpath("//*[normalize-space(text()) = 'User Role']//parent::div/following-sibling::div//div[@class='oxd-select-text-input']"));
//	    Assert.assertNotNull(userrole);
	    driver.quit();		
		
		

	}

}

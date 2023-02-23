package assignment8;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment8 {
	
	@Test(description = "Verify text displayed on facebook login page")
	public void verifyText() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Open the facebook page", true);
		
		driver.get("https://www.facebook.com/");
		
		WebElement textDisplayedOnPage = driver.findElement(By.xpath("//h2"));
		
		Reporter.log(textDisplayedOnPage.getText(),true);
		AssertJUnit.assertTrue(textDisplayedOnPage.getText().equals("Facebook helps you connect and share with the people in your life."));
		
		System.out.println("Thread id is ::"+ Thread.currentThread().getId());
		
		driver.quit();
		
	}
	
	@Test(description = "Capture all link text available in the footer section and verify Create Page Link is present or not. If yes then click on it.")
	public void verifyLinkTexts() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Open the facebook page", true);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> linkTexts = driver.findElements(By.xpath("//li"));
		
		Reporter.log("Number of link textx are::"+linkTexts.size(), true);
		
		Reporter.log("Find webelement for create page link text", true);
		WebElement createPageLinkText = driver.findElement(By.xpath("//li//a[contains(text(),'Create Page')]"));
		
		if(createPageLinkText!=null) {
			Reporter.log("click on create page link text", true);
			createPageLinkText.click();
		}
		
		Reporter.log("Verify create page is opened", true);
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("create"));
		
		System.out.println("Thread id is ::"+ Thread.currentThread().getId());
		
		driver.quit();
		
	}
	
	@Test(description = "Click on Create new account, Fill in all details and click on the Signup button")
	public void verifyCreateAccountUsingXpath() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Reporter.log("Open the facebook page", true);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Reporter.log("Click on create account", true);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Reporter.log("Verify sign up screen is opened", true);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Sign Up')]")));
		AssertJUnit.assertNotNull(driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")));
		
		Reporter.log("Enter first name",true);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparajeeta");
		
		Reporter.log("Enter last name", true);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Biswas");
		
		Reporter.log("Enter email id",true);
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]//following::input[1]")).sendKeys("testemail@gmail.com");
		
		Reporter.log("Enter password", true);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Testpassword@123");
		
		Reporter.log("Select birthday day", true);
		Select daySelector = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		daySelector.selectByValue("20");
		
		Reporter.log("Select birthday month", true);
		Select monthSelector = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		monthSelector.selectByValue("6");
		
		Reporter.log("Select birthday year", true);
		Select yearSelector = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		yearSelector.selectByValue("1992");
		
		Reporter.log("Select gender radio button", true);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Reporter.log("Click on sign up button", true);
		driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']")).click();
		System.out.println("Thread id is ::"+ Thread.currentThread().getId());
		
		driver.quit();
		
	}
	
	@Test(description = "Click on Create new account, Fill in all details and click on the Signup button")
	public void verifyCreateAccountUsingCss() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Reporter.log("Open the facebook page", true);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Reporter.log("Click on create account", true);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		Reporter.log("Verify sign up screen is opened", true);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Sign Up')]")));
		AssertJUnit.assertNotNull(driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")));
		
		Reporter.log("Enter first name",true);
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Aparajeeta");
		
		Reporter.log("Enter last name", true);
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Biswas");
		
		Reporter.log("Enter email id",true);
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("testemail@gmail.com");
		
		Reporter.log("Enter password", true);
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Testpassword@123");
		
		Reporter.log("Select birthday day", true);
		Select daySelector = new Select(driver.findElement(By.cssSelector("#day")));
		daySelector.selectByValue("20");
		
		Reporter.log("Select birthday month", true);
		Select monthSelector = new Select(driver.findElement(By.cssSelector("#month")));
		monthSelector.selectByValue("6");
		
		Reporter.log("Select birthday year", true);
		Select yearSelector = new Select(driver.findElement(By.cssSelector("#year")));
		yearSelector.selectByValue("1992");
		
		Reporter.log("Select gender radio button", true);
		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type=radio]"));
		radioButtons.get(1).click();
		
		
		Reporter.log("Click on sign up button", true);
		driver.findElement(By.cssSelector("button[name=websubmit]")).click();
		
		System.out.println("Thread id is ::"+ Thread.currentThread().getId());
		
		driver.quit();
		
	}

}

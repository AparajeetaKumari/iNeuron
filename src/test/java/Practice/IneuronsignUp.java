package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IneuronsignUp {
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		String emailId = "test19@gmail.com";
		String passwordDetails = "123456";
		driver.get("https://ineuron-courses.vercel.app");
		driver.manage().window().maximize();
		WebElement logIn = driver.findElement(By.xpath("//button"));
		logIn.click();
		WebElement newUser = driver.findElement(By.xpath("//a[contains(text(),'New user')]"));
		newUser.click();
		Thread.sleep(2000);
		WebElement signUp = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		if(signUp.isDisplayed()) {
			WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
			name.sendKeys("Aparajeeta");
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys(emailId);
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys(passwordDetails);
			WebElement courseOption = driver.findElement(By.xpath("//label[contains(text(),'Testing')]"));
			courseOption.click();
			WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
			gender.click();
			WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
			state.click();
			Select stateSelect = new Select(state);
			stateSelect.selectByVisibleText("Goa");
			
			if(signUp.isEnabled()) {
				System.out.println("sign up is enabled");
				signUp.click();
			}	
			
		}
	
		Thread.sleep(1000);
		String url =driver.getCurrentUrl();
		System.out.print("url is"+url);
		
		WebElement inputemail = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		inputemail.sendKeys(emailId);
        WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
        password.sendKeys(passwordDetails);
        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        signInButton.click();			
			
		driver.quit();
		
		
		
	}

}

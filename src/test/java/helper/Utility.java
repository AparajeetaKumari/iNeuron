package helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class Utility {
	
	public static String getCurrentDate() {
		
	String currentdate = (new SimpleDateFormat("_HH_mm_ss_dd_MM_yyyy")).format(new Date());
	return currentdate;
		
	}
	
	public static void capturescreenshot(WebDriver driver) {
		try {
			FileHandler.copy( ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./screenshots/MyScreenshot"+Utility.getCurrentDate()+".png"));
		} catch (IOException e) {
			System.out.println("some problem happened::"+e);
		}
		
		
	}
	
	public static void waitForElement(WebDriver driver,String locator, int seconds) throws InterruptedException {
		
		for(int i=0;i<seconds;i++) {
			try {
			 driver.findElement(By.xpath(locator)).isEnabled();
			}catch(ElementNotInteractableException e) {
				Thread.sleep(seconds*1000);
			}
			
		}
	}
	
	public static WebDriver startBroswer(String brosweName, String url ) {
		WebDriver driver =null;
		
		if(brosweName.contains("chrome"))
		{
			driver = new ChromeDriver();
		}else if(brosweName.contains("firefox")) {
			driver = new FirefoxDriver();
		}else if(brosweName.contains("Edge")){
			driver = new EdgeDriver();
		}else if(brosweName.contains("Safari")) {
			driver = new SafariDriver();
		}else{
			Reporter.log("Broswer not supported::"+brosweName +" Running tests in default browser");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}

}

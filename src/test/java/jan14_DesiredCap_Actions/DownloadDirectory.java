package jan14_DesiredCap_Actions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class DownloadDirectory {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("download.default_directory", "/Users/a0k00l0/Desktop/MyDownloads");
				
		options.setExperimentalOption("prefs", map);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/download");
		
		WebElement ele = driver.findElement(By.xpath("(//a[normalize-space()='LambdaTest.txt'])[1]"));
		ele.click();
        System.out.println("Page title is::"+ driver.getTitle());
		
		System.out.println("Page Url is::"+ driver.getCurrentUrl());
		
		//driver.quit();

	}

}

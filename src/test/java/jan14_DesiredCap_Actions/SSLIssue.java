package jan14_DesiredCap_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class SSLIssue {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.cacert.org/");
        System.out.println("Page title is::"+ driver.getTitle());
		
		System.out.println("Page Url is::"+ driver.getCurrentUrl());
		
		//driver.quit();

	}

}

package jan14_DesiredCap_Actions;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class ProxyInSelenium {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("123.45.78.78:7878");
		
		options.setProxy(proxy);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.cacert.org/");
        System.out.println("Page title is::"+ driver.getTitle());
		
		System.out.println("Page Url is::"+ driver.getCurrentUrl());
		
		//driver.quit();

	}

}

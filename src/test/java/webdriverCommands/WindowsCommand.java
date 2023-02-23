package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		driver.get("https://www.facebook.com/");
		window.minimize();
	}

}

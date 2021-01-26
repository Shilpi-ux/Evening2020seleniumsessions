package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFacory {
//String browserName;
WebDriver driver;
	public WebDriver init_driver(String browserName) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * if(browserName.equals("chrome")) { WebDriverManager.chromedriver().setup();
		 * WebDriver driver=new ChromeDriver(); } else {
		 * System.out.println("Browser not supported"); }
		 */
		return driver;
}
	public void launchURL(String url) {
		driver.get(url);
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public void CloseBrowser() {
		driver.close();
	}
}
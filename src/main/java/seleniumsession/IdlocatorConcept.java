package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdlocatorConcept {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.getCurrentUrl();
		String title=driver.getTitle();
		//system.out.println("Title of page is:"+ title);
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		/*
		 * driver.findElement(fname).sendKeys("shilpi");
		 * driver.findElement(lname).sendKeys("rani");
		 * driver.findElement(email).sendKeys("riikarani601@gmail.com");
		 * driver.findElement(Telephone).sendKeys("997765456");
		 */
		
		/*getElement(fname).sendKeys("Shilpi");
		getElement(lname).sendKeys("Rani");
		getElement(email).sendKeys("ritikarani601@gmail.com");
		getElement(Telephone).sendKeys("99886677575");
		getElement(Password).sendKeys("hello123");
		getElement(confirmpwd).sendKeys("hello123");
		//getElement(privacycheckbox).click();
		doClick(privacycheckbox).click();*/
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By email=By.id("input-email");
		By Telephone=By.id("input-telephone");
		By Password=By.id("input-password");
		By confirmpwd=By.id("input-confirm");
		By privacycheckbox=By.name("agree");
		
		dosendKeys(fname, "shilpi");
		dosendKeys(lname, "shilpi");
		dosendKeys(email, "ritikarani601@gmail.com");
		dosendKeys(Telephone, "98999797979");
		dosendKeys(Password, "Hello123");
		dosendKeys(confirmpwd, "Hello123");
		doClick(privacycheckbox);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
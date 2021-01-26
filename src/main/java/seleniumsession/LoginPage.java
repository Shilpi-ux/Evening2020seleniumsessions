package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
//static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
		WebDriverFacory wf=new WebDriverFacory();
		WebDriver driver=wf.init_driver("chrome");
		wf.launchURL("https://demo.opencart.com/index.php?route=account/register");
		String title=wf.getTitle();
		System.out.println("Title of page is...."+ title);
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By email=By.id("input-email");
		By Telephone=By.id("input-telephone");
		By Password=By.id("input-password");
		By confirmpwd=By.id("input-confirm");
		By privacycheckbox=By.name("agree");
		
		// WebDriverManager.chromedriver().setup();
       //  driver=new ChromeDriver();
		 //driver.get("https://demo.opencart.com/index.php?route=account/register");
		 
		ElementUtil eutil=new ElementUtil(driver);
		eutil.dosendKeys(fname, "rohit");
		
	}
	

}

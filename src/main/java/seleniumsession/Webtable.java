package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
	//	#customers tr:nth-of-type(2) 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		By table=By.cssSelector("#customers tr:nth-of-type(2)");
		List<WebElement> footerlist=driver.findElements(By.cssSelector("table"));
		System.out.println(footerlist.size());
		//for(i=0;i<=size-1;i++) {
		footerlist.stream().forEach(ele -> System.out.println(ele.getText()));
			
		for(WebElement ele : footerlist) {
			System.out.println(ele.getText());
		}
		}
	
}

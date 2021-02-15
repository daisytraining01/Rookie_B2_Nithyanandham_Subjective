package Step.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Ex1 {
 public static void main(String[] args) { 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\Downloads\\AutomationTesting\\src\\main\\resources\\geckodriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("AUSTRALIA");

		
 }
}


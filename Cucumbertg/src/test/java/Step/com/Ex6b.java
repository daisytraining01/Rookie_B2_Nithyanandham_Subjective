package Step.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Ex6b {
	
	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\CucumberTest\\src\\main\\resources\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	
	driver.get("http://demo.guru99.com/test/guru99home/" );
	
	driver.manage().window().maximize() ;

	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	
	driver.close();
}
}
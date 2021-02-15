package Step.com;

import java.net.MalformedURLException;
import java.net.URL;
 
/*import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;*/
 
 
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
 
 
public class Ex6 {
 
   private RemoteWebDriver driver;
   private static final String ACCESS_KEY = System.getenv("SEETEST_IO_ACCESS_KEY");
private WebDriverWait wait;
 
public void ExceptionsTest () {
   DesiredCapabilities dc = new DesiredCapabilities();
   dc.setCapability("generateReport", true);
   String title = "Selenium Test";
   dc.setCapability("accessKey", ACCESS_KEY);
   String Selenium_Hub = "https://cloud.seetest.io/wd/hub/";
   dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
   dc.setCapability("testName", title);
 
   try {
       driver = new RemoteWebDriver(new URL(Selenium_Hub), dc);
       wait = new WebDriverWait(driver, 10);
 
       } catch (MalformedURLException e) {
           System.out.println("Malformed URL: " + Selenium_Hub);
       } catch (SessionNotCreatedException e) {
           System.out.println("Wrong SeeTest access key" + ACCESS_KEY);
       }
   }
 
@AfterClass
public void tearDown() {
   if (driver != null) {
       driver.quit();
   }
}
 
 
}




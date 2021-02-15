package Step.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex4 { 
 
 WebDriver driver = null;
 @BeforeTest
    public void setup() throws Exception { 
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\training\\Downloads\\AutomationTesting\\src\\main\\resources\\geckodriver.exe");
  driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("https://cosmocode.io/automation-practice-webtable/"); 
    } 
 
  @AfterTest
 public void tearDown() throws Exception { 
   driver.quit();
     } 
  
 @Test
 public void print_data(){
 
 
 int Row_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size();
 System.out.println("Number Of Rows = "+Row_count);
 
 
 int Col_count = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();
 System.out.println("Number Of Columns = "+Col_count);
 
 
 String first_part = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
 String second_part = "]/td[";
 String third_part = "]";
 
 
 for (int i=1; i<=Row_count; i++){
  
  for(int j=1; j<=Col_count; j++){
   
   String final_xpath = first_part+i+second_part+j+third_part;
   
   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
   System.out.print(Table_data +"  ");   
  }
   System.out.println("");
   System.out.println("");  
 } 
 }
}



package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.autoconfigure.spi.internal.ConfigurableMetricReaderProvider;

public class ToLearnDataProvider 
{
//   @DataProvider
//   public String[][] dataSender()
//{
//	       String data[][]= {
//			{"admin","admin"},
//			{"ad","admin"},
//			{"admin","adm"},
//			{"ad","ad"},
//	      };
//	       
//	return data;
//	       
// }
    @Test(dataProviderClass = DataStorage.class,dataProvider = "loginData")
	//@Test(dataProviderClass = DataStorage.class,dataProvider = "registerData")
   public void login(String[] cred)
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://demoapp.skillrary.com/");
	   driver.findElement(By.linkText("LOGIN")).click();
	   
	   driver.findElement(By.id("email")).sendKeys(cred[0]);
	   driver.findElement(By.id("password")).sendKeys(cred[1]);
	   driver.findElement(By.id("last")).click();
	   Assert.assertEquals(driver.getTitle(), "SkillRary Ecommerce", "User Failed To Login");
	   Reporter.log("User Login Is Succesful",true);
	   
	   
	   
   }
}

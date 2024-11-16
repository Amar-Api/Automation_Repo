package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertJavaConditions 
{
   @Test
	public void login()
	{
	   ChromeDriver driver = new ChromeDriver();
   	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   	   
       driver.get("https://demowebshop.tricentis.com/");
      Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Welcome page is not displayed");
      Reporter.log("Welcome page is Displayed",true);
      
      driver.findElement(By.linkText("Log in")).click();
      
      
      Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "login Page is not Displayed");
      Reporter.log("Ligin Page is Displayed",true);
      
      
      driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("abhis@1234");
      
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
      
      Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "home page is not Displayed");
      Reporter.log("Home Page is Displayed",true);
       
       
   
	}

}

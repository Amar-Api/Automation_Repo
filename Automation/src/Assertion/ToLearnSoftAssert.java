package Assertion;

import java.time.Duration;

import org.bouncycastle.crypto.engines.ISAACEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.WelcomePage;

public class ToLearnSoftAssert 
{
	@Test
	public void login()
	{
	   ChromeDriver driver = new ChromeDriver();
   	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("https://demowebshop.tricentis.com/");
       SoftAssert soft= new SoftAssert();
       
       soft.assertEquals(driver.getTitle(), "Demo Web Shop", "Welcome Page is not Displayed");
       Reporter.log("WELCOME PAGE IS DISPLAYED",true);
       
       driver.findElement(By.linkText("Log in")).click();
       
       soft.assertEquals(driver.getTitle(), "Demo Web Shop. Logi", "login Page is not Displayed");
       Reporter.log("Login Page is Displayed",true);
       
       
       driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
       driver.findElement(By.id("Password")).sendKeys("abhis@1234");
       
       driver.findElement(By.xpath("//input[@value='Log in']")).click();
       
       
       soft.assertEquals(driver.getTitle(), "Demo Web Shop", "Home Page is not Displayed");
       Reporter.log("Home page Is Displayed",true);
       
       soft.assertAll();
       
	}
	
}

package Assertion;

import java.time.Duration;

import org.bouncycastle.crypto.engines.ISAACEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.LogInPage;

public class Assignment1HardAssert 
{
 @Test
 public void login() throws InterruptedException
 {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 
	 driver.get("https://automationexercise.com/");
	 Assert.assertEquals(driver.getTitle(), "Automation Exercise", " Home page is not Displayed");
	 Reporter.log("Home Page Is Displayed", true);
	 
	 driver.findElement(By.xpath("// a[contains(text(),'Signup / Login')]")).click();
	 
Assert.assertTrue(driver.findElement(By.xpath("// h2[contains(text(),'Login to your account')]")).isDisplayed());
	 
	 Reporter.log("Login to your account is visible",true);
	 
	 driver.findElement(By.name("email")).sendKeys("abhis1234@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("abhis12345");
	 
	 driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	 
	 Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Logged in as')] ")).isDisplayed());
	 Reporter.log("Logged in as username is visible",true);
	 
	 driver.findElement(By.xpath("//a[contains(text(),' Delete Account')] ")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Account Deleted!')]")).isDisplayed());
	 Reporter.log("ACCOUNT DELETED! is visible",true);
	 
	 
 }
 
}

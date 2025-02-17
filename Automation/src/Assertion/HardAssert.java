package Assertion;

import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.bouncycastle.crypto.engines.ISAACEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert
{
@Test
public void login()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login page is not Displayed");
	Reporter.log("Login page Is Displayed ", true);
	
	
	driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("abhis@1234");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home page is not Displayed");
	Reporter.log("Home page Is Displayed ", true);
	
}
}
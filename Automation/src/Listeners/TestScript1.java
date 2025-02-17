package Listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.service.DriverFinder;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenereImplementation.class)
public class TestScript1 extends BaseClass
{
	@Test

	public void login() 
	{
		Reporter.log("Click on Login Link", true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Enter Valid Credential", true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis1234");
		
		
		Reporter.log("Click On Login Button", true);
		driver.findElement(By.xpath("//input[@value= 'Log in']")).click();
		
		assertEquals(driver.getTitle(), "Demo Web", "Home Page Is Not Displayed");
		Reporter.log("Home Page is displayed",true);
    }
}
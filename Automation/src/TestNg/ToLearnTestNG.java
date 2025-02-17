package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ToLearnTestNG //TestNG Class
{
@Test(priority = 2,invocationCount = 4, threadPoolSize = 0)
public void login() //TesT Case
{
	//Test Steps
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("user login is succesfuly",true);
	
	
}

@Test(priority = 1, enabled = true)
public void register() //TesT Case
{
	//Test Steps
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://demowebshop.tricentis.com/register");
	Reporter.log("user register is succesfuly",true);
	

}
}
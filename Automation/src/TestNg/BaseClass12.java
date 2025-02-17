package TestNg;

import java.time.Duration;

import org.checkerframework.checker.units.qual.Acceleration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.yaml.snakeyaml.events.Event.ID;

public class BaseClass12 
{
public WebDriver driver;

@BeforeClass
public void openBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
}

@BeforeMethod
public void logIn()

{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("abhis@1234");
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	
	
}

@AfterMethod
public void logOut()
{
	driver.findElement(By.linkText("Log out")).click();
}


@AfterClass
public void closeBrowser()
{
	driver.quit();
	
}
}

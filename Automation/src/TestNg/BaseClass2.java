package TestNg;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass2 

{
	public WebDriver driver;
	
    @BeforeClass(alwaysRun = true)
    public void launchBrowser()
     {
 	driver =new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 	
 	
 	driver.get("https://demowebshop.tricentis.com/");
     }
    @BeforeMethod(alwaysRun = true)
    public void login()
    {
    	driver.findElement(By.linkText("Log in")).click();
    	driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");;
    	driver.findElement(By.id("Password")).sendKeys("abhis@1234");
    	driver.findElement(By.xpath("//input[@value='Log in']")).click();
    	
    }
    
    @AfterMethod(alwaysRun = true)
    public void logout()
    {
    	driver.findElement(By.linkText("Log out")).click();
    	
    }
    @AfterClass(alwaysRun = true)
    public void closeBrowser()
    {
    	driver.quit();
    }
}

package PomDataDrivenTestng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.WelcomePage;

public class PomBaseClass
{
public WebDriver driver;
public FileUtility flib= new FileUtility();


  public PomWelcomePage wp;
  public PomLoginPage pl;
  public PomHomePage hp;
  
  
  
@BeforeClass
public void openBrowser() throws IOException
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	String url=flib.getDataFromProperty("url");
	driver.get(url);
	
}

@BeforeMethod
public void logIn() throws IOException
{
//	driver.findElement(By.linkText("Log in")).click();
//	driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
//	driver.findElement(By.id("Password")).sendKeys("abhis@1234");
//	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	
	
      wp=new PomWelcomePage(driver);
      wp.getLoginLink().click();
    
      pl= new PomLoginPage(driver);
	  //PomLoginPage pl= new PomLoginPage(driver);
	  pl.getEmailTextField().sendKeys(flib.getDataFromProperty("email"));
	  pl.getPasswordTextField().sendKeys(flib.getDataFromProperty("password"));
	  pl.getLoginButton().click();
	
	
}

@AfterMethod
public void logOut()
{
	
	hp= new PomHomePage(driver);
	//hp.getLogoutButtonElement();
	hp.getLogoutButtonElement().click();
	//driver.findElement(By.linkText("Log out")).click();
}


@AfterClass
public void closeBrowser()
{
	driver.quit();
	
}
	
}


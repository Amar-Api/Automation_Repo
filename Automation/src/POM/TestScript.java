package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
    WelcomePage wp= new  WelcomePage(driver); //WelcomePage  // getRegisterLink is a nonstatic method, so call using objrefvar 
	                                         // pageClass object Creation
	wp.getRegisterlink().click(); //calling getter method of register element
	wp.getLoginlink().click();
	
	
	LogInPage lp= new LogInPage(driver); //Loginpage
	lp.getEmailTextField().sendKeys("amar123@gmail.com");
	Thread.sleep(3000);
	lp.getPasswordTextField().sendKeys("Amar1234");
	Thread.sleep(3000);
	lp.getLoginButton().click();
	
	
	
	
}
}

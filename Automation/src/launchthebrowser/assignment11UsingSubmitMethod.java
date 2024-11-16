package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class assignment11UsingSubmitMethod 
{
public static void main(String[] args) throws InterruptedException
{ 
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	String Url= driver.getCurrentUrl();
	if (Url.contains("vtiger")) 
	{
		System.out.println("Welcome Page is Displayed");
	}
	else 
	{
		System.out.println("Welcome Page is Not Displayed");
	}
	
	
	WebElement usernameTF =driver.findElement(By.id("username"));
	Thread.sleep(3000);
	usernameTF.clear();
	Thread.sleep(3000);
	usernameTF.sendKeys("Testing");
	Thread.sleep(2000);
	System.out.println("Username: Testing");
	
	WebElement passwordTF =driver.findElement(By.id("password"));
	Thread.sleep(3000);
	passwordTF.clear();
	Thread.sleep(3000);
	passwordTF.sendKeys("Test@123");
	Thread.sleep(3000);
	System.out.println("Password: Test@123");
	
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
}
}

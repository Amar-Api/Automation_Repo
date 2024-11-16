package launchthebrowser;

import org.bouncycastle.crypto.engines.ISAPEngine.IsapType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class Assignment12CaptureColor
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	WebElement usernamTF = driver.findElement(By.id("username"));
	Thread.sleep(3000);
	usernamTF.clear();
	usernamTF.sendKeys("Testing");
	Thread.sleep(2000);
	System.out.println("Username: Testing");
	
	WebElement passwordTF = driver.findElement(By.id("password"));
	Thread.sleep(2000);
	passwordTF.clear();
	Thread.sleep(2000);
	passwordTF.sendKeys("Test@123");
	Thread.sleep(2000);
	System.out.println("Password: Test@123");
	
	
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
    String errorMsg= driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
	System.out.println("error Message is:" +errorMsg);
	
	
	WebElement errorMsg1 = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
	String color1 = errorMsg1.getCssValue("color");
	System.out.println("Error Message Color is:" +color1);
	
	if (color1.contains("rgba(255, 0, 0, 1)"))
	{
		System.out.println("Color Verified and Both matched");
	}
	else 
	{
		System.out.println("Color Verified and is not matched");
	}
	driver.close();
	
}
}

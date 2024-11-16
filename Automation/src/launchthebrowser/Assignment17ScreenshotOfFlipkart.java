package launchthebrowser;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment17ScreenshotOfFlipkart
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	String time= LocalDateTime.now().toString().replace(":", "-");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.flipkart.com/");
	String url= driver.getCurrentUrl();
	if (url.contains("flipkart")) 
	{
	System.out.println("Flpikart page Displayed");
	}
	else 
	{
	System.out.println("Flipkart page not Displayed");	
	}
	
	
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles",Keys.ENTER);
	 Thread.sleep(3000);
	 
	 TakesScreenshot ts= (TakesScreenshot)driver;
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 Thread.sleep(3000);
	 
	
	File dest= new File("./TakeScreenshot/"+time+"flipkartMobile.png" );
	FileHandler.copy(temp, dest); 
}
}

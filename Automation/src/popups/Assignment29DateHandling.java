package popups;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment29DateHandling 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	
	
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
    while (true) 
    {
		try 
		{
			driver.findElement(By.xpath("//span[text()='December']/../../..//span[text()='13']")).click();
			break;
		} 
		catch (Exception e) 
		{
			driver.findElement(By.xpath("(//span[@class='calender-month-change'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
		}
		
	}
    TakesScreenshot ts= (TakesScreenshot) driver;  
    File temp= ts.getScreenshotAs(OutputType.FILE);
    Thread.sleep(3000);
    File dest=new File("./TakeScreenshot/AbhiBusDate.png");
    FileHandler.copy(temp, dest);
    System.out.println();
    System.out.println("Temporary:"+temp);
    System.out.println("Permanent:"+dest);
    driver.close();
}
}

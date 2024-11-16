package launchthebrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18CaptureAppleIphone 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Web Table']")).click();
	
	Thread.sleep(3000);
	String url= driver.getTitle();
	
	if (url.contains("DemoApps | Qspiders | Tables"))
	{
		System.out.println("Product list Table is Displayed \n");
	}
	else 
	{
        System.out.println("Productr List Table is Not Dispalyed \n");
	}
	
	driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
	
	if ((driver.getCurrentUrl()).contains("https://demoapps.qspiders.com/ui/table/dynamicTable"))
	{
		System.out.println("Dynamic Web Table is Displayed \n");
	} 
	else 
	{
       System.out.println("Dynamic Web Table is Not displayed \n");
       
	}
	String price= driver.findElement(By.xpath("//th[text()='Apple iPhone']//following-sibling::td[4]")).getText();
	System.out.println("The Dynamic price of Apple Iphone is:"+" " +price);
	Thread.sleep(3000);
	driver.close();
	
}
}

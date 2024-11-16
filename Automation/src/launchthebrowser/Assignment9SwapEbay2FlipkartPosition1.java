package launchthebrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9SwapEbay2FlipkartPosition1 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWindowIds = driver.getWindowHandles();
	
	for (String id : allWindowIds)
	   {
		driver.switchTo().window(id);
		Thread.sleep(2000);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("flipkart")) 
		{
			Point p = driver.manage().window().getPosition();
			
			System.out.println("X-Axis:" +p.getX());
			System.out.println("Y-Axis:" +p.getY());
			
			Thread.sleep(2000);
			driver.manage().window().setPosition(new Point(800,249));
			
		}
		
		if (url.contains("ebay")) 
		{
			Point p = driver.manage().window().getPosition();
			
			System.out.println("X-Axis:" +p.getX());
			System.out.println("Y-Axis:" +p.getY());
			
			Thread.sleep(2000);
			driver.manage().window().setPosition(new Point(9,249));
		
			Thread.sleep(5000);
			driver.quit();
			
		}
	}
}
	
	
}

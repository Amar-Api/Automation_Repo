package launchthebrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9SwapEbay2FlipkartPosition 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Point ssP = driver.manage().window().getPosition();

		Set<String> allWindowIds = driver.getWindowHandles();

		Point fp = null;
		Point ep = null;
		for (String id : allWindowIds)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if (url.contains("flipkart")) 
			{
				fp = driver.manage().window().getPosition();//fp=(x,y)
			}
			if (url.contains("ebay"))
			{
				ep = driver.manage().window().getPosition();
			}
		}
		System.out.println();
		System.out.println("We Captured Position before Swaped the Url");
		System.out.println("https://www.flipkart.com/");
		System.out.println("X-Axis" +fp.getX());
		System.out.println("Y-Axis" +fp.getY());
		
		System.out.println("https://www.ebay.com/");
		System.out.println("X-Axis" +ep.getX());
		System.out.println("Y-Axis" +ep.getY());


		for (String id : allWindowIds) 
		{
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains("flipkart"))
			{
				driver.manage().window().setPosition(ep);
				
			}
			if(actUrl.contains("ebay"))
			{
				driver.manage().window().setPosition(fp);//fp contains (x,y) coordinate of flipkart . And we are setting 
				        // flipkart coordinate in ebay coordinate.
			}
		}
		Thread.sleep(4000);
		driver.quit();

	}
}
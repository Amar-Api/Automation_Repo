package launchthebrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8ToLearnSwitchTo2nd 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWindowIdSet= driver.getWindowHandles();
    for (String id : allWindowIdSet)
    {
		driver.switchTo().window(id);
		Thread.sleep(2000);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		if (!url.contains("shoppersstack"))
		{
			driver.close();
		}
	}
	
}
}

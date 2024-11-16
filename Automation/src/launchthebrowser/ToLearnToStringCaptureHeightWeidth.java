package launchthebrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnToStringCaptureHeightWeidth 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(30000);
	String parentId= driver.getWindowHandle();
	
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds)
	{
		driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("flipkart"))
		{
			break;
		}
    }
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
	   Thread.sleep(3000);
	   Dimension d =driver.manage().window().getSize();
	   System.out.println("Height:"+d.getHeight());
	   System.out.println("Weidth:"+d.getWidth());
	   driver.close();
	   Thread.sleep(5000);
	   driver.switchTo().window(parentId);
	   
	   driver.findElement(By.id("loginBtn")).click();
	   driver.quit();
	   
}
	
}
	



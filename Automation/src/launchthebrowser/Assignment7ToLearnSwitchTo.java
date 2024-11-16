package launchthebrowser;

import java.util.Set;

import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7ToLearnSwitchTo
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(12000);
	driver.findElement(By.id("compare")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String id:allWindowIds)
	{
		
		String widTitle = driver.switchTo().window(id).getTitle();
		
		System.out.println();
		{
		if(widTitle.equals("ShoppersStack | Product Description"))
		{
			System.out.println(id);
			System.out.println("WidTitle=" +widTitle);
			System.out.println("parent Window, It will not close");
		}
		else
		{
			System.out.println(id);
			System.out.println("Child Window");
			Thread.sleep(3000);
			driver.close();
		}
		}
	 }
}
}

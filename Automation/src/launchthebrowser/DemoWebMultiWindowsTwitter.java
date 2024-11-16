package launchthebrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebMultiWindowsTwitter
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demowebshop.tricentis.com/";
		System.out.println();
		System.out.println("Actual Url is:" +actualUrl);
		if(actualUrl.equals(expectedUrl))
		{
		System.out.println("Welcome Page is Verified and Displayed Correct");
		}
		else 
		{
			System.out.println("Welcome Page Is Verified And Displayed Incorrect");
		}
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> allWindowsIds = driver.getWindowHandles();
		System.out.println();
		System.out.println("All Windows Ids is:");
	     for(String id : allWindowsIds)
	     {
	    	 System.out.println(id);
	     }
	     Thread.sleep(10000);
		 driver.quit();
	}
}

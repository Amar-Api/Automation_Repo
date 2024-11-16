package launchthebrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulpleWindowHandles 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Facebook")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	 System.out.println("allWindowIds");
	 for(String id: allWindowIds)
	 {
		 System.out.println(id);

	 }	
	 Thread.sleep(4000);
	 driver.quit();
}
}

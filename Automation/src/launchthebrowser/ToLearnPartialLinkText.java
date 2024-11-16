package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartialLinkText
{
public static void main(String[] args) throws InterruptedException
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com");
	Thread.sleep(2000);
	//driver.findElement(By.partialLinkText("viewed product")).click();
	driver.findElement(By.partialLinkText("COMPUTER")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}

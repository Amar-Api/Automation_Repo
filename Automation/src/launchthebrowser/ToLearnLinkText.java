package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkText
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com");
	Thread.sleep(2000);
	//driver.findElement(By.linkText("Register")).click();
	//driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.linkText("Shopping cart")).click();//span is child of <a></a>
	
	driver.close();
}
}

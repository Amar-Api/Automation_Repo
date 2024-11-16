package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDynamicPriceXpath 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.dunzo.com/search");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("apples");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Apple - Fuji']/../..//button[@shape='circular']")).click();
	Thread.sleep(3000);
	driver.close();
}
}

package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6XpathByAxis 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Quick Start")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Web Table")).click();
	Thread.sleep(3000);
	
	String collection=driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
	System.out.println(collection);
	driver.close();
}
}

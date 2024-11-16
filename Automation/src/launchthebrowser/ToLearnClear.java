package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https:demo.vtiger.com/vtigercrm/");
	WebElement usernameTF =driver.findElement(By.id("username"));
	Thread.sleep(3000);
	usernameTF.clear();
	Thread.sleep(3000);
	usernameTF.sendKeys("Testing");
	Thread.sleep(5000);
    driver.close();
    
	
}
}

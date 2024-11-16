package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15IsEnable
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	//WebElement subscribeButton= driver.findElement(By.xpath("//input[@type='text' and @class='form-control']"));
	WebElement subscribeButton= driver.findElement(By.xpath("//input[@class='form-control']"));
	System.out.println("Subscribe Button is Enable:" +subscribeButton.isEnabled());
	driver.close();
}
}

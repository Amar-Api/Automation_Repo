package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3WithXpath 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
    Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("amar123@gmail.com");
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("amar12345");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.close();
	
}
}

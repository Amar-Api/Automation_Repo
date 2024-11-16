package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethodIsEnabled 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println("=========Before Passing Data=========");
    System.out.println(loginButton.isEnabled());
    
    
    System.out.println("=========After Passing Data========");
    driver.findElement(By.name("username")).sendKeys("12345667");
    driver.findElement(By.name("password")).sendKeys("test@1234");
    
    
    System.out.println(loginButton.isEnabled());
    Thread.sleep(2000);
    driver.close();
}
}

package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayedBooleanMethod
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	
	System.out.println("Displayed Status:" +loginbutton.isDisplayed());
	System.out.println("Enable Status:" +loginbutton.isEnabled());
	driver.close();
}
}

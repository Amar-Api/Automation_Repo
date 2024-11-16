package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHoldWithNoArg 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");	
	driver.findElement(By.id("password")).sendKeys("Amar@123");
	
	
	Actions act= new Actions(driver);
	act.moveByOffset(1295, 314).clickAndHold().perform();
	Thread.sleep(2000);
	act.release().perform();
}
}

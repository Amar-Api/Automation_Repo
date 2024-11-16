package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveToElement
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	WebElement menLink= driver.findElement(By.partialLinkText("MEN")); //partiallinktext is case sensetive
	
	WebElement womenLink= driver.findElement(By.partialLinkText("WOMEN"));
	Thread.sleep(2000);
	//driver.findElement(By.linkText("T-Shirts")).click();
	 
	
	Actions act= new Actions(driver);
	act.moveToElement(menLink).perform();
	//Thread.sleep(2000);
	//act.moveToElement(womenLink).perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Jeans")).click();
}
}

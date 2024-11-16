package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment24MouseHover_doubleClick
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	driver.get("https://demoapp.skillrary.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium",Keys.ENTER);
	
	driver.findElement(By.linkText("Selenium")).click(); 
	
	Actions act= new Actions(driver);
	
	act.moveByOffset(345, 505).doubleClick().perform(); 
	
	 //WebElement addicon= driver.findElement(By.id("add")); 
	//act.moveToElement(addicon).doubleClick(addicon).perform();
   //act.moveByOffset(345, 320).doubleClick(addicon).perform(); 
	
}
}

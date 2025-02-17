package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleClass 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	
	
	//stale concept
//=======================================================================================
//	 WebElement searchTF= driver.findElement(By.id("navbar-search-input"));
//	 Thread.sleep(3000);
//	 searchTF.sendKeys("selenium",Keys.ENTER);
//	 
//	 searchTF.sendKeys("TestNG",Keys.ENTER);
//=========================================================================================
     StaleExceptioninPOM sp= new StaleExceptioninPOM(driver);
     sp.getSearchTF().sendKeys("Selenium",Keys.ENTER);
     Thread.sleep(3000);
     sp.getSearchTF().sendKeys("Testing");
    		 
}

}

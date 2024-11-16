package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnHiddenDivisionPopupDate
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();	//to close the overlay popup
	
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	
    while (true)
    {
	try 
	{
		driver.findElement(By.xpath("//div[text()='April 2025']/../..//p[text()='25']")).click();
		break;
		
	} 
	catch (Exception e) 
	{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}	
	}
	
}
}

package SelectDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment20MultiSelect
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	
	driver.get("https://www.freshersworld.com/");
	WebElement registerButton= driver.findElement(By.linkText("REGISTER NOW"));
	
	System.out.println("Register Now Displayed Status:" +" "+registerButton.isDisplayed());
	registerButton.click();
	
	WebElement currentCityBox= driver.findElement(By.id("currentCity"));
	Select currentCity= new Select(currentCityBox);
	currentCity.selectByVisibleText("Bangalore");
	
	Thread.sleep(3000);
	WebElement highestQualificationBox = driver.findElement(By.id("course"));
	Select highQualification= new Select(highestQualificationBox);
	highQualification.selectByValue("16");
	Thread.sleep(5000);
	driver.close();
}
}

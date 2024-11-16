package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethodException 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	try 
	{
		WebElement genderTF  = driver.findElement(By.id("custom_gender_container"));
		System.out.println(genderTF.isDisplayed());
	} 
	catch (Exception e) 
	{
		System.out.println("Element is not Displayed");
	}
	driver.close();
}
}

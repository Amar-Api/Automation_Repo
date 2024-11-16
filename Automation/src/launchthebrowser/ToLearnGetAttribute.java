package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute 
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement searchTF = driver.findElement(By.name("q"));
	//String value = searchTF.getAttribute("title")
	String value = searchTF.getAttribute("type");
	System.out.println(value);
	driver.close();
		
}
}

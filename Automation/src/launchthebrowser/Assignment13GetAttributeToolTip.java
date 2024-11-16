package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13GetAttributeToolTip 
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
    WebElement searchTF = driver.findElement(By.name("q"));
    String value= searchTF.getAttribute("title");
    System.out.println(value);
    System.out.println();
    if (value.contains("Search for Products, Brands and More"))
    {
		System.out.println("Tool Tip Display When Mouse Hover the Search");
	} 
    else 
    {
    	System.out.println("Tool Tip Not Display When Mouse Hover the Search");
	}
}
}

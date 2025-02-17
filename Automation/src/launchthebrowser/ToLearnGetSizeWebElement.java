package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSizeWebElement
{
public static void main(String[] args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Dimension size= driver.findElement(By.xpath("//input[@value='Search']")).getSize();
	System.out.println(size);
	System.out.println("Height="+size.getHeight());
	System.out.println("Width="+size.getWidth());
	driver.close();
	
}
}

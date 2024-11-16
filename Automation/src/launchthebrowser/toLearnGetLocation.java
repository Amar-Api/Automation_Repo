package launchthebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnGetLocation
{
public static void main(String[] args) 
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Point position= driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
	System.out.println("X-axis:"+position.getX());
	System.out.println("Y-axis:"+position.getY());
	driver.close();
	

}
}

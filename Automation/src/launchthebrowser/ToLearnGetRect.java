package launchthebrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Rectangle rect= driver.findElement(By.xpath("//input[@value='Search']")).getRect();
	System.out.println("X-axis:"+rect.getX());
	System.out.println("Y-axis:"+rect.getY());
	System.out.println("Height:"+rect.getHeight());
	System.out.println("width:"+rect.getWidth());
	driver.close();
	
	
}
}
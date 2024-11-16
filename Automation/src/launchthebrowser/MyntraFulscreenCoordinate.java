package launchthebrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraFulscreenCoordinate 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	Point position= driver.manage().window().getPosition();
	System.out.println("X-coordinate: "+position.getX());
	System.out.println("Y-coordinate: "+position.getY());
	driver.quit();
}
}

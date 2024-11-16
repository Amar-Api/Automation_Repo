package launchthebrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWithoutGet
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Point position= driver.manage().window().getPosition();
	System.out.println("X-coordinate: "+position.getX());
	System.out.println("Y-coordinate: "+position.getY());
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(200,250));
	Thread.sleep(2000);
	driver.quit();

}
}

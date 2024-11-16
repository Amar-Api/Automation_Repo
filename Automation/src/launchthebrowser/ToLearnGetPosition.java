package launchthebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point position= driver.manage().window().getPosition();
		System.out.println("X: "+position.getX());
		System.out.println("X: "+position.getY());
		

	}

}

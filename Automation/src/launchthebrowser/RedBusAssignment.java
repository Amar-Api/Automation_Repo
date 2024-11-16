package launchthebrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAssignment {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.redbus.in/";
		System.out.println("actualUrl=" + actualUrl);
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("The Welcome page is Verified and Found Correct");	
		}
		else
		{
		System.out.println("The Welcome page is verified and Found Incorrect");	
		}
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.redbus.in/");
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	int height= size.getHeight();
	int width= size.getWidth();
	System.out.println("Height is: "+height);
	System.out.println("Width is: "+width);
	driver.close();
	}

}

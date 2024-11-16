package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TriggerTheUrl1 {

	public static void main(String[] args)
	{
		//launch the Browser
		WebDriver driver= new ChromeDriver();
		//trigger the Url.....Main url of an application
   //driver.get("https://www.selenium.dev/");
         //invalidArgumentException---sel--runtime--unchecked
   driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().minimize();
	}

}

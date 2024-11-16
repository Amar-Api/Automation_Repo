package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrePostContition
{
	public static void main(String[] args) throws InterruptedException
	{
	 WebDriver driver= new ChromeDriver();
	 // pre-Condition
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("https://www.dassault-aviation.com/en/");
	 Thread.sleep(2000);
	 driver.manage().window().fullscreen();
	 Thread.sleep(2000);
	 //Post-Condition;
	 driver.manage().window().minimize();
	}

}

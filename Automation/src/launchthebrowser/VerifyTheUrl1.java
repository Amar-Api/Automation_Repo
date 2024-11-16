package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl1
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Instagram";
		String expectedUrl = "https://www.instagram.com/";
		
		System.out.println("actualTitle=" + actualTitle);
		System.out.println("actualUrl=" + actualUrl);
		
		if(actualTitle.equals(expectedTitle) && (actualUrl.equals(expectedUrl)))
			
			System.out.println("The Title and Url is Verified and Found Correct");	
		else
		System.out.println("The Title and Url is verified and Found Incorrect");	
	}

}

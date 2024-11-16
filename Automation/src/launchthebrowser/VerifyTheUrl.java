package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheUrl {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		System.out.println("actualUrl=" + actualUrl);
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("The Url is Verified and Found Correct");	
		}
		else
		{
		System.out.println("The Url is verified and Found Incorrect");	
		}
		

	}

}

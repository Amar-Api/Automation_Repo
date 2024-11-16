package launchthebrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateWithToString 
{
public static void main(String[] args) throws InterruptedException, MalformedURLException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.navigate().to("https://www.facebook.com/");
	driver.navigate().to(new URL("https://www.facebook.com/"));
	Thread.sleep(3000);
	driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    Thread.sleep(3000);
    driver.navigate().refresh();
	
}
}

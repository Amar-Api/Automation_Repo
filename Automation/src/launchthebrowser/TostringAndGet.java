package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TostringAndGet 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.flipkart.com/");
	driver.navigate().to("https://www.flipkart.com/");
}
}

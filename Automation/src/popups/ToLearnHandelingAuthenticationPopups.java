package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnHandelingAuthenticationPopups 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	
//to handle Authentication Popup we use..(https://username:password@www.google.com) in get(string)
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
}
}

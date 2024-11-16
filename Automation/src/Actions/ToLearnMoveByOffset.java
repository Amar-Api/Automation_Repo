package Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnMoveByOffset
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	
	Actions act= new Actions(driver);
	act.moveByOffset(548, 37).pause(2000).moveByOffset(80	, 37).perform();
	
	
}
}

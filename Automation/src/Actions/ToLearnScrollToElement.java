package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollToElement
{
public static void main(String[] args) throws InterruptedException
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	driver.get("https://demowebshop.tricentis.com/");
	//WebElement searchLink=  driver.findElement(By.linkText("Search"));
	
	Actions act= new Actions(driver);
	//act.scrollToElement(searchLink).perform();
	
	//Thread.sleep(2000);
	//driver.findElement(By.linkText("14.1-inch Laptop")).click();
	
	act.scrollByAmount(0, 500).perform();
	Thread.sleep(3000);
	act.scrollByAmount(0, -500).perform();
	
}
}

package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollInView 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	driver.get("https://demoapp.skillrary.com/");
	WebElement latestCources = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView(true)", latestCources);
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(false)", latestCources);
	
}
}

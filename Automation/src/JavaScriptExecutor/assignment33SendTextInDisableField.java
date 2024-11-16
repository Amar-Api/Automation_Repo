package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment33SendTextInDisableField 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	WebElement disableText= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	js.executeScript("arguments[0].value='Why are you Disable???'", disableText);
	
	Thread.sleep(3000);
	File temp= driver.findElement(By.xpath("(//input[@type='text'])[2]")).getScreenshotAs(OutputType.FILE);
	File dest= new File("./TakeScreenshot/DisableElement.png");
	FileHandler.copy(temp, dest);
	driver.close();
}
}

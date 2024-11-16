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

public class Assignment32JavaScriptExecutor 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	
	driver.get("https://www.abhibus.com/");
	WebElement onlineBus= driver.findElement(By.xpath("//h2[text()='Online Bus Booking Services']"));
	
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(false)", onlineBus);
	
	
	 TakesScreenshot ts= (TakesScreenshot) driver; 
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest= new File("./TakeScreenshot/AbhiBusJavaScript.png");
	 FileHandler.copy(temp, dest);
	 System.out.println();
	 System.out.println("Temporary:"+temp);
	 System.out.println("Permanent:"+dest);
	 driver.quit();
}	
}


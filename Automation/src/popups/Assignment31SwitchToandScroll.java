package popups;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment31SwitchToandScroll
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	
	Thread.sleep(4000);
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWindowIds= driver.getWindowHandles();
	
	for (String ids : allWindowIds) 
	{
		driver.switchTo().window(ids); //switch to any windows
		 String url= driver.getCurrentUrl();
	 System.out.println(ids);
	 System.out.println(url);
	 
	 if (url.contains("amazon"))
	   {
		break;
	   }
    }
	
	driver.manage().window().maximize();
	 Actions act= new Actions(driver);
	 Thread.sleep(3000);
	 act.scrollByAmount(300, 500).perform();
	 Thread.sleep(3000);
	 TakesScreenshot ts= (TakesScreenshot) driver; 
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest= new File("./TakeScreenshot/Amazon.png");
	 FileHandler.copy(temp, dest);
	 System.out.println();
	 System.out.println("Temporary:"+temp);
	 System.out.println("Permanent:"+dest);
	 driver.quit();
}
}

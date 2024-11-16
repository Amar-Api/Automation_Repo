package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import launchthebrowser.MyntraFulscreenCoordinate;
import launchthebrowser.Navigate;
import launchthebrowser.toLearnGetLocation;

public class Assignment25MouseHover 
{
public static void main(String[] args) throws InterruptedException, IOException
{

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	Actions act= new Actions(driver);
	
	
	Actions axis= act.moveByOffset(338, 38);
	System.out.println(axis);
	axis.perform();
	
	
	
	
	driver.findElement(By.linkText("Ethnic Wear")).click();
	
	String url= driver.getTitle();
	if (url.contains("Ki Etnhc - Buy Ki Etnhc online in India")) 
	{
		System.out.println("Ethnic Wear Page is Displayed");
	}
    else
    {
	System.out.println("Ethnic Wear Page is Not Displayed");	
	}
	
	
	TakesScreenshot ts= (TakesScreenshot)driver;
    File temp=ts.getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);
    
    File dest= new File("./TakeScreenshot/Myntra.png");
    FileHandler.copy(temp, dest);
    
    System.out.println();
    System.out.println("Temporary:::>" +temp);
    System.out.println("Permanent:::>" +dest);
    driver.close();
  
    
}
}

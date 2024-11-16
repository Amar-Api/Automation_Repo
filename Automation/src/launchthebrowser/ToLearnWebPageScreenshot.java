package launchthebrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnWebPageScreenshot 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
    TakesScreenshot ts= (TakesScreenshot) driver;  //TypeCasting....
    File temp= ts.getScreenshotAs(OutputType.FILE);
    Thread.sleep(3000);
    File dest=new File("./TakeScreenshot/image.png");
    FileHandler.copy(temp, dest);
    System.out.println("Temporary:"+temp);
    System.out.println("Permanent:"+dest);
    driver.close();
    
	
}
}

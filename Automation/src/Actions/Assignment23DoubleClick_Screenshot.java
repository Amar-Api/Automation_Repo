package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.util.Store;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment23DoubleClick_Screenshot 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
	Actions act= new Actions(driver);
	WebElement doubleClick1= driver.findElement(By.id("btn20"));
	act.doubleClick(doubleClick1).perform();
	
	WebElement doubleClick2= driver.findElement(By.id("btn22"));
	act.doubleClick(doubleClick2).perform();
	
	WebElement doubleClick3= driver.findElement(By.id("btn28"));
	act.doubleClick(doubleClick3).perform();
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File temp= ts.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("./TakeScreenshot/demoappQspider.png");
	FileHandler.copy(temp, dest);
	
	
	File temp1= driver.findElement(By.id("btn22")).getScreenshotAs(OutputType.FILE);
	File dest1= new File("./TakeScreenshot/yesElement.png");
	FileHandler.copy(temp1, dest1);
	
	System.out.println("Temporary Stored file webPage::>"+temp);
	System.out.println("permanent stored file webPage::>"+dest);
	
	System.out.println();
	System.out.println("Temporary Stored file Yes Element::>"+temp1);
	System.out.println("permanent stored file Yes Element::>"+dest1);
	
	File temp2= driver.findElement(By.xpath("//p[text()='3. Rate us on the scale of 1 to 5']")).getScreenshotAs(OutputType.FILE);
	File dest2= new File("./TakeScreenshot/sentanceElement.png");
	FileHandler.copy(temp2, dest2);
	System.out.println();
	System.out.println("Temporary Stored file Line::>"+temp2);
	System.out.println("permanent stored file Line::>"+dest2);
	Thread.sleep(3000);
	driver.close();
	
}
}

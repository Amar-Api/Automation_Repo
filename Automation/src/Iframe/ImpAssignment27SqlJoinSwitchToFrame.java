package Iframe;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.dsa512;
import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.sdk.metrics.internal.concurrent.AdderUtil;

public class ImpAssignment27SqlJoinSwitchToFrame
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	   
	   
	    driver.get("https://www.globalsqa.com/");
	    WebElement testerLink= driver.findElement(By.xpath("(//a[@class='no_border'])[2]"));
	    Actions act= new Actions(driver);
		act.moveToElement(testerLink).perform();
		
		WebElement demoTestLink= driver.findElement(By.linkText("Demo Testing Site"));
		act.moveToElement(demoTestLink).perform();
		
		WebElement dragDropLink= driver.findElement(By.linkText("Drag And Drop"));
		act.moveToElement(dragDropLink).click().perform();
		
		WebElement photoFrame= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		   
		driver.switchTo().frame(photoFrame);
		   
		WebElement image1= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    WebElement image2= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		   
		WebElement trash= driver.findElement(By.id("trash"));
		   
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Set<String>allwindowIds=driver.getWindowHandles();
		
		for(String wid : allwindowIds)
		{
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println("WidTitle=" +widTitle);
			
			
			if(widTitle.equals("SQL Cheat Sheet - GlobalSQA"))
			{
				act.scrollByAmount(0, 1026).perform();
				TakesScreenshot ts= (TakesScreenshot) driver;  
			    File temp= ts.getScreenshotAs(OutputType.FILE);
			    Thread.sleep(3000);
			    File dest=new File("./TakeScreenshot/globalSql.png");
			    FileHandler.copy(temp, dest);
			    System.out.println();
			    System.out.println("Temporary:"+temp);
			    System.out.println("Permanent:"+dest);
			    driver.close();
			}
	  
		
		}
		
}
}




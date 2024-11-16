package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment28AlertConformPrompt
{
public static void main(String[] args) throws InterruptedException
{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	 
	 driver.get("https://www.w3schools.com/js/js_popup.asp");
	 
	 String originalWind= driver.getWindowHandle();
	 driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
	 Thread.sleep(5000);
	 
     Set<String>allwindowIds=driver.getWindowHandles();
	 for(String wid : allwindowIds)
		{
		   String widTitle = driver.switchTo().window(wid).getTitle();
		   System.out.println(wid);
		   System.out.println("WidTitle=" +widTitle);
		
	        if(widTitle.equals("W3Schools Tryit Editor"))
	        {
	        driver.switchTo().frame("iframeResult");
	      	  
	       driver.findElement(By.xpath("//button[text()='Try it']")).click();

	  	   Alert alertpopup= driver.switchTo().alert();
	  	   
	  	   String popupMsg= alertpopup.getText();
	  	   System.out.println(popupMsg);
	  	 
	  	   alertpopup.dismiss();
	  	   driver.close();
	  	   
	       }
	        
	        Thread.sleep(8000);
	       driver.switchTo().window(originalWind); 
	       driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
	       
	     
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			  
			Alert promptPopup= driver.switchTo().alert();
		    System.out.println(promptPopup.getText());
			promptPopup.dismiss();
			driver.close();
		  }
		}
	 
}  


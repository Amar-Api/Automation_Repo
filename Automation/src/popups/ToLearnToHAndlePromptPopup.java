package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnToHAndlePromptPopup 
{
public static void main(String[] args) throws InterruptedException 
{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	   
	   
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	  
	  Thread.sleep(3000);
	  driver.switchTo().frame("iframeResult");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	  
	  Alert promptPopup= driver.switchTo().alert();
	  promptPopup.sendKeys("selenium");
	  String msgLink= promptPopup.getText();
	  promptPopup.accept();
	  System.out.println(msgLink);
}
}

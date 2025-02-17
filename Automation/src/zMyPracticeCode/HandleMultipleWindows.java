package zMyPracticeCode;

import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMultipleWindows 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	driver.get("https://www.facebook.com/");
//	driver.get("https://www.instagram.com/");
//	driver.get("https://www.linkedin.com/feed/");
	
	String parentWindow= driver.getWindowHandle();
	System.out.println("parent window:="+parentWindow);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0,500)"); 
    Thread.sleep(3000);
    
    driver.findElement(By.id("newWindowsBtn")).click();
    
	
	Set<String> handles= driver.getWindowHandles();
	for (String handle: handles)
	{
			
	}
		
	
	
}
}

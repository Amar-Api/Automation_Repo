package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnHandleChildWindowPopups
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(60));	
	
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	
	
	driver.findElement(By.id("compare")).click();
	
	
	Set<String> allWndowIds= driver.getWindowHandles();  // capture all child windows ids
	Thread.sleep(8000);
    for (String ids : allWndowIds)
    {
    	Thread.sleep(8000);
	 driver.switchTo().window(ids); //switch to any windows
	 String url= driver.getCurrentUrl(); //capture url
	 System.out.println(ids);
	 System.out.println(url);
	 
	 
	 if (url.contains("flipkart"))   //compare url
	 {
		break;
	 }
	 
	}
	
    driver.manage().window().maximize();
    Thread.sleep(4000);
    driver.quit();
}
}

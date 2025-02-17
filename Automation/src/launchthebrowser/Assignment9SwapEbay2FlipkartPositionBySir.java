package launchthebrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9SwapEbay2FlipkartPositionBySir 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(30000);
	driver.findElement(By.id("compare")).click();
	
	switchToWindow(driver,"flipkart");
	Point flipkartPosition = driver.manage().window().getPosition();
	Thread.sleep(2000);

	switchToWindow(driver,"ebay");//switchToWindow(driver, "ebay"); का अर्थ है कि Selenium ड्राइवर (ब्राउज़र) को "ebay" नाम या टाइटल वाले Browser tab या window पर switch करना है।
	Point ebayPosition=  driver.manage().window().getPosition();
	Thread.sleep(2000);
	
	driver.manage().window().setPosition(flipkartPosition);//we are setting flipkart position in ebay window position
	Thread.sleep(2000);
	
	switchToWindow(driver,"flipkart");
	driver.manage().window().setPosition(ebayPosition);
	Thread.sleep(2000);
	
}

   private static void switchToWindow(WebDriver driver, String url) throws InterruptedException 
     {
	Set<String> allWindowIds= driver.getWindowHandles();
    for (String id : allWindowIds)
       {
		  driver.switchTo().window(id);
		  Thread.sleep(2000);
		  String actUrl= driver.getCurrentUrl();
		  Thread.sleep(2000);
		  if (actUrl.contains(url))
		   {
			break;
		   }
		
        }
     
     }
}
		

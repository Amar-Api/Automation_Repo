package launchthebrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14RectangleBoolean
{

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  Thread.sleep(3000);
	  WebElement  subscribeButton= driver.findElement(By.xpath("//input[@value='Subscribe']"));
	  System.out.println("Display Status:" +subscribeButton.isDisplayed());
	  
	   
	Rectangle rect= driver.findElement(By.id("newsletter-subscribe-button")).getRect();
	  
	  System.out.println("X-axis:"+rect.getX());
	  System.out.println("Y-axis:"+rect.getY());
	  System.out.println("Height:"+rect.getHeight());
	  System.out.println("width:"+rect.getWidth());
	  driver.close();		  
			  
			  

	}

}

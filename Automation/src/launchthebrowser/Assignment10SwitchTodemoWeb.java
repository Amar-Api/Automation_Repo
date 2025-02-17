package launchthebrowser;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Set;
import java.util.random.RandomGenerator.JumpableGenerator;

import org.bouncycastle.crypto.engines.ISAPEngine.IsapType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10SwitchTodemoWeb 
{
//private static final String Incorrect = null;

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
     String Url1=driver.getCurrentUrl();
	if (Url1.contains("demowebshop")) 
	{
		System.out.println("DemoWebShop page is Displayed");	
	}
	else 
	{
	System.out.println("Incorrect page");		
	}	
	 
	
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	Thread.sleep(2000);
	
	switchToWindow(driver,"facebook.com");
	String url2= driver.getCurrentUrl();
	if(url2.equals("https://www.facebook.com/nopCommerce"))
	{
	  System.out.println("Facebook Welcome Page is displayed");
	}
	
	else 
	{
		System.out.println("Incorrect page Displayed");
	}
	
	driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	Thread.sleep(4000);
	
	switchToWindow(driver,"facebook.com/reg");
	String Url3= driver.getCurrentUrl();
	Thread.sleep(3000);
    if (Url3.equals("https://www.facebook.com/reg/?next=%2FnopCommerce"))
    {
    	System.out.println("SignUp Page Is Displyed");
    }
    else
    {
    	System.out.println("Incorrect Page is Displayed");		
	}
    
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Amarjit");
    }
	

//switchTo method use for reusable method........

  public static void switchToWindow(WebDriver driver,String Url)
   {
	Set<String> allWindowIds = driver.getWindowHandles();
	
      for (String id : allWindowIds)
      {
	   driver.switchTo().window(id);
       String acturl= driver.getCurrentUrl();
       if(acturl.contains(Url))
       {
         break;
        }
		
    }
}
}
 
   
    

    


package TestNg;

import org.testng.annotations.Test;
import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test(dependsOnMethods = "register",priority = 1)
	
	
	  public void login() //TesT Case
	  {
		//Test Steps
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user login is succesfuly",true);
		Assert.fail("login failled");
		
	  }

	
	
   @Test(priority = 2)//In case of dependsOn Method Priority will not work it will work
	                    //on basis of DEPENDSONMETHOD
	                    
	 public void register() //TesT Case
	   {  
		//Test Steps
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("user register is succesfuly",true);
		
		}
   
   
   
   @Test  (dependsOnMethods = { "register", "login"},priority = 1)
   
	   public void addProduct() //TesT Case
	     {
		  //Test Steps
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		  driver.get("https://demowebshop.tricentis.com/");
		  Reporter.log("Product Added to Cart is succesfuly",true);
          }
}

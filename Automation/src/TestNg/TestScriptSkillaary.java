package TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptSkillaary extends BaseClassSkillrary 
{
	
	@Test
    public void sellsHistory() throws InterruptedException
    {
		
//		String actualUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://demoapp.skillrary.com/admin/sales.php";
//		
//		if(actualUrl.equals(expectedUrl))
			
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		String sh = driver.findElement(By.xpath(" //h1[contains(text(),'Sales History')]")).getText();
		
		String actualUrl= driver.getCurrentUrl();
		
	    if (sh.equals("Sales History"))
	    {
		 Reporter.log("Sales History page is Displayed",true);
		}
	    else 
	    {
	    	Reporter.log("Sales History page is not Displayed",true);
		}

    }

}

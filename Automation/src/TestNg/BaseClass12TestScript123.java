package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClass12TestScript123 extends BaseClass12
{
	@Test
	public void clickOnComputers()
	{
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		String actualTitle= driver.getTitle();
		
		if (actualTitle.equals("Demo Web Shop. Computers")) 
		{
		 Reporter.log("Computers Page Is  displayed",true);	
		 
		}else {
			Reporter.log("computers Page is Not displayed",true);
		}
	}
	}


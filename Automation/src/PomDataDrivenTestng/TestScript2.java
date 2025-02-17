package PomDataDrivenTestng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends PomBaseClass 
{
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException
	{
		
		hp= new PomHomePage(driver);
		
		hp.getComputerLinksElement().click();
		//driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
		String expTitle=flib.getStringDataFromExcel("Computers", 1, 0);
		String actualTitle= driver.getTitle();
		
		if (actualTitle.equals(expTitle)) 
		{
		 Reporter.log("Computers Page Is  displayed",true);	
		 
		}else {
			Reporter.log("computers Page is Not displayed",true);
		}
	}
}

package PomDataDrivenTestng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends PomBaseClass
{
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException
	{
		
		hp= new PomHomePage(driver);
		
		hp.getGiftCadrLink().click();
		//driver.findElement(By.partialLinkText("COMPUTERS")).click();
		
		String expTitle=flib.getStringDataFromExcel("Gift Cards", 1, 0);
		String actualTitle= driver.getTitle();
		
		if (actualTitle.equals(expTitle)) 
		{
		 Reporter.log("Gift Card Page Is  displayed",true);	
		 
		}else {
			Reporter.log("Gift Card Page is Not displayed",true);
		}
	}

}

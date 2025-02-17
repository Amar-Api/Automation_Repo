package PomDataDrivenTestng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends PomBaseClass
{

@Test
public void clickOnBook() throws EncryptedDocumentException, IOException
{
	
	hp= new PomHomePage(driver);
	hp.getBookLinksElement().click();
	
	//driver.findElement(By.partialLinkText("BOOKS")).click();
	
	String expTitle=flib.getStringDataFromExcel("Books", 1, 0);
	String actualTitle= driver.getTitle();
	
	if (actualTitle.equals(expTitle))
	{
	 Reporter.log("Book Page Is displayed",true);	
	 
	}else {
		Reporter.log("Book Page is Not displayed",true);
	}
}
}

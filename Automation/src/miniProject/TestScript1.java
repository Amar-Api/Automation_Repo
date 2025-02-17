package miniProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners.ListenereImplementation;
import PomDataDrivenTestng.PomHomePage;


@Listeners(ListnersImplementation.class)
public class TestScript1 extends BaseClass
{

@Test
public void clickOnBook() throws InterruptedException 
{
	
	hp= new HomePage(driver);
	hp.getBookLink().click();
	
	bp=new BookPage(driver);
	bp.getSortByDropdown().click();
	

	Select sortBy=new Select(bp.getSortByDropdown());
	sortBy.selectByVisibleText("Price: Low to High");
	Thread.sleep(3000);
	assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/books?orderby=10", " Price: Low to High  Is Not Displayed in Book Page");
	Reporter.log("Price: Low to High  Is Displayed in Book Page",true);
}
}
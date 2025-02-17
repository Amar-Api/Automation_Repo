package miniProject;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

@Listeners(ListnersImplementation.class)

public class Testscript2 extends BaseClass {
	@Test
	public void clickOnComputer() throws InterruptedException
	{
		hp=new HomePage(driver);
		hp.getComputersLink().click();
		Actions act= new Actions(driver);
		act.moveByOffset(458, 196).perform();
		Thread.sleep(3000);
		
		 act.moveToElement(hp.getDesktopsLink()).click().perform();

		
//		WebElement desktops = driver.findElement(By.partialLinkText("Desktops"));
//		act.moveToElement(desktops).click().perform();
		
		Thread.sleep(3000);
//      act.moveByOffset(458 , 196).pause(2000).moveByOffset(468	, 237).click().perform();
		assertEquals(driver.getTitle(), "Demo Web Shop. Desktops", "Desktops Page Is Not Displayed");
		Reporter.log("Desktops Page is displayed",true);
		
	}
    
}
